package com.linusnilsson.busstop.services;

import com.linusnilsson.busstop.data.internalmodels.BusLineStopsTotal;
import com.linusnilsson.busstop.data.internalmodels.BusLineStopsName;
import com.linusnilsson.busstop.data.internalmodels.BusLineResponse;
import com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline.JourneyPatternPointOnLineBaseModel;
import com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline.JourneyPatternPointOnLine;
import com.linusnilsson.busstop.data.trafiklabmodels.stoppoint.StopPoint;
import com.linusnilsson.busstop.data.trafiklabmodels.stoppoint.StopPointBaseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import static java.util.stream.Collectors.*;

@Service
public class BusLineService {

    private static final Logger LOG = LoggerFactory.getLogger(BusLineService.class);

    private final RestTemplate restTemplate;

    public BusLineService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ResponseEntity<BusLineResponse> getBusLinesWithMostStops() {

        JourneyPatternPointOnLineBaseModel model = getJourneyPatternPointOnLine();

        return ResponseEntity.ok(new BusLineResponse(getBusLinesWithMostStops(model)));
    }

    private List<BusLineStopsTotal> getBusLinesWithMostStops(JourneyPatternPointOnLineBaseModel model) {

        Map<Integer, IntSummaryStatistics> collect = model.getResponseData().getResult().stream()
                .collect(groupingBy(JourneyPatternPointOnLine::getLineNumber, summarizingInt(JourneyPatternPointOnLine::getJourneyPatternPointNumber)));

        return collect.entrySet().stream().map(result ->
                new BusLineStopsTotal(result.getKey(), (int) result.getValue().getCount()))
                .sorted()
                .collect(toList())
                .subList(0,10);

    }

    public ResponseEntity<BusLineStopsName> getBusStops(int busLine) {

        JourneyPatternPointOnLineBaseModel journeyPatternPointOnLine = getJourneyPatternPointOnLine();
        List<JourneyPatternPointOnLine> journeys = getJourneyForBusLine(busLine, journeyPatternPointOnLine);

        StopPointBaseModel stopPoint = getStopPoint();
        List<StopPoint> stopPoints = stopPoint.getResponseData().getResult();

        List<StopPoint> collect = getNameForBusStops(journeys, stopPoints);

        List<String> busStops = collect.stream().map(StopPoint::getStopPointName).distinct().collect(toList());

        return ResponseEntity.ok(new BusLineStopsName(busLine, busStops));

    }

    private List<StopPoint> getNameForBusStops(List<JourneyPatternPointOnLine> journeys, List<StopPoint> stopPoints) {
        return stopPoints.parallelStream().filter(s -> journeys.parallelStream().anyMatch
                        (j -> s.getStopPointNumber() == j.getJourneyPatternPointNumber()))
                .collect(toList());
    }

    private List<JourneyPatternPointOnLine> getJourneyForBusLine(int busLine, JourneyPatternPointOnLineBaseModel journeyPatternPointOnLine) {
        return journeyPatternPointOnLine.getResponseData().getResult().stream()
                .filter(journey -> journey.getLineNumber() == busLine).collect(toList());
    }

    private JourneyPatternPointOnLineBaseModel getJourneyPatternPointOnLine() {
        return restTemplate.getForObject(
                "https://api.sl.se/api2/LineData.json?model=JourneyPatternPointOnLine&key=c643db225e1c4ad791dcf8b83a9a9b0e&DefaultTransportModeCode=BUS",
                JourneyPatternPointOnLineBaseModel.class);
    }

    private StopPointBaseModel getStopPoint() {
        return restTemplate.getForObject(
                "https://api.sl.se/api2/LineData.json?model=StopPoint&key=c643db225e1c4ad791dcf8b83a9a9b0e&DefaultTransportModeCode=BUS",
                StopPointBaseModel.class);
    }
}
