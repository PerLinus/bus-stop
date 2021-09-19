package com.linusnilsson.busstop.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linusnilsson.busstop.data.internalmodels.BusLineResponse;
import com.linusnilsson.busstop.data.internalmodels.BusLineStopsTotal;
import com.linusnilsson.busstop.util.TestData;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
@RestClientTest(BusLineService.class)
class BusLineServiceTest {

    private static final Logger LOG = LoggerFactory.getLogger(BusLineServiceTest.class);

    @Autowired
    private BusLineService busLineService;

    @Autowired
    private MockRestServiceServer server;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getBusLinesWithMostStopsShouldReturnTop10() throws JsonProcessingException {

        String journeys = objectMapper.writeValueAsString(new TestData().getBaseModelWithJourneyPatternPointOnLineList());

        this.server.expect(requestTo(
                        "https://api.sl.se/api2/LineData.json?model=JourneyPatternPointOnLine&key=c643db225e1c4ad791dcf8b83a9a9b0e&DefaultTransportModeCode=BUS"))
                .andRespond(withSuccess(journeys, MediaType.APPLICATION_JSON));

        ResponseEntity<BusLineResponse> busLinesWithMostStops = this.busLineService.getBusLinesWithMostStops();
        List<BusLineStopsTotal> result = Objects.requireNonNull(busLinesWithMostStops.getBody()).getBusLineList();

        assertEquals(10, result.size());
        assertEquals(11, result.get(0).getLineNumber());
        assertEquals(12, result.get(0).getNumberOfStops());
        assertEquals(6, result.get(9).getNumberOfStops());
    }
}