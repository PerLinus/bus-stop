package com.linusnilsson.busstop.data.internalmodels;

import java.util.List;

public class BusLineResponse {

    List<BusLineStopsTotal> busLineStopsTotalList;

    public BusLineResponse(List<BusLineStopsTotal> busLineStopsTotalList) {
        this.busLineStopsTotalList = busLineStopsTotalList;
    }

    public List<BusLineStopsTotal> getBusLineList() {
        return busLineStopsTotalList;
    }

    public void setBusLineList(List<BusLineStopsTotal> busLineStopsTotalList) {
        this.busLineStopsTotalList = busLineStopsTotalList;
    }
}
