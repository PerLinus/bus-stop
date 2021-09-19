package com.linusnilsson.busstop.data.internalmodels;

import java.util.List;

public class BusLineStopsName {

    private final int lineNumber;
    private final List<String> busStops;

    public BusLineStopsName(int lineNumber, List<String> busStops) {
        this.lineNumber = lineNumber;
        this.busStops = busStops;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public List<String> getBusStops() {
        return busStops;
    }
}
