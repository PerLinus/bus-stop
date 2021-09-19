package com.linusnilsson.busstop.controllers;


import com.linusnilsson.busstop.data.internalmodels.BusLineStopsName;
import com.linusnilsson.busstop.data.internalmodels.BusLineResponse;
import com.linusnilsson.busstop.services.BusLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bus-line")
public class BusLineController {

    @Autowired
    private BusLineService service;

    @GetMapping("/with-most-stops")
    public ResponseEntity<BusLineResponse> getBusLinesWithMostStops() {
        return service.getBusLinesWithMostStops();
    }

    @GetMapping("/stops-name")
    public ResponseEntity<BusLineStopsName> getBusStops(@RequestParam(value = "busLine") int busLine) {
        return service.getBusStops(busLine);
    }


}
