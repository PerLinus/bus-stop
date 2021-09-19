package com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyPatternPointOnLineBaseModel {

    @JsonProperty("StatusCode")
    private int statusCode;
    @JsonProperty("Message")
    public Object message;
    @JsonProperty("ExecutionTime")
    private int executionTime;
    @JsonProperty("ResponseData")
    private JourneyPatternPointOnLineResult responseData;

    public JourneyPatternPointOnLineBaseModel() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    public JourneyPatternPointOnLineResult getResponseData() {
        return responseData;
    }

    public void setResponseData(JourneyPatternPointOnLineResult responseData) {
        this.responseData = responseData;
    }
}
