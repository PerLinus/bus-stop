package com.linusnilsson.busstop.util;

import com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline.JourneyPatternPointOnLineBaseModel;
import com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline.JourneyPatternPointOnLine;
import com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline.JourneyPatternPointOnLineResult;

import java.util.ArrayList;
import java.util.List;


public class TestData {

    public JourneyPatternPointOnLineBaseModel getBaseModelWithJourneyPatternPointOnLineList() {

        JourneyPatternPointOnLineBaseModel baseModel = new JourneyPatternPointOnLineBaseModel();
        JourneyPatternPointOnLineResult responseData = new JourneyPatternPointOnLineResult();
        List<JourneyPatternPointOnLine> list = new ArrayList<>();

        responseData.setResult(list);
        baseModel.setResponseData(responseData);

        list.add(new JourneyPatternPointOnLine(1, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(1, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(1, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(1, "1", 10014, "date", "date"));

        list.add(new JourneyPatternPointOnLine(2, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(2, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(2, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(2, "1", 10014, "date", "date"));

        list.add(new JourneyPatternPointOnLine(3, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(3, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(3, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(3, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(3, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(3, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(4, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(4, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(4, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(4, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(4, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(4, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(5, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(5, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(5, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(5, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(5, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(5, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(6, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(6, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(6, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(6, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(6, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(6, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(7, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(7, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(7, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(7, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(7, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(7, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(8, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(8, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(8, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(8, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(8, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(8, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(9, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(9, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(9, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(9, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(9, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(9, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(10, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(10, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(10, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(10, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(10, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(10, "1", 10016, "date", "date"));

        list.add(new JourneyPatternPointOnLine(11, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10016, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10017, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10018, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10019, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10020, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10021, "date", "date"));
        list.add(new JourneyPatternPointOnLine(11, "1", 10022, "date", "date"));

        list.add(new JourneyPatternPointOnLine(12, "1", 10011, "date", "date"));
        list.add(new JourneyPatternPointOnLine(12, "1", 10012, "date", "date"));
        list.add(new JourneyPatternPointOnLine(12, "1", 10013, "date", "date"));
        list.add(new JourneyPatternPointOnLine(12, "1", 10014, "date", "date"));
        list.add(new JourneyPatternPointOnLine(12, "1", 10015, "date", "date"));
        list.add(new JourneyPatternPointOnLine(12, "1", 10016, "date", "date"));

        return baseModel;
    }
}
