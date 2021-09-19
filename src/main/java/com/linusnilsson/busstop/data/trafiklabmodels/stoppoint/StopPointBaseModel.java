package com.linusnilsson.busstop.data.trafiklabmodels.stoppoint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopPointBaseModel {

    @JsonProperty("StatusCode")
    private int statusCode;
    @JsonProperty("Message")
    public Object message;
    @JsonProperty("ExecutionTime")
    private int executionTime;
    @JsonProperty("ResponseData")
    private StopPointResult responseData;

    public StopPointBaseModel() {
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

    public StopPointResult getResponseData() {
        return responseData;
    }

    public void setResponseData(StopPointResult responseData) {
        this.responseData = responseData;
    }
}
