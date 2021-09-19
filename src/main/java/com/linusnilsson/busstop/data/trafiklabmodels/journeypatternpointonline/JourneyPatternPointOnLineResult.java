package com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyPatternPointOnLineResult {

    @JsonProperty("Version")
    private String version;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Result")
    private List<JourneyPatternPointOnLine> result;

    public JourneyPatternPointOnLineResult() {
        result = new ArrayList<>();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<JourneyPatternPointOnLine> getResult() {
        return result;
    }

    public void setResult(List<JourneyPatternPointOnLine> result) {
        this.result = result;
    }
}
