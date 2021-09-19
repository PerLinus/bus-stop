package com.linusnilsson.busstop.data.internalmodels;

public class BusLineStopsTotal implements Comparable<BusLineStopsTotal>{

    private final int lineNumber;
    private final int numberOfStops;

    public BusLineStopsTotal(int lineNumber, int numberOfStops) {
        this.lineNumber = lineNumber;
        this.numberOfStops = numberOfStops;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }


    @Override
    public int compareTo(BusLineStopsTotal otherBusLineStopsTotal) {
        return Integer.compare(otherBusLineStopsTotal.numberOfStops, numberOfStops);
    }
}
