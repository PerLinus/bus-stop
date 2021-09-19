package com.linusnilsson.busstop.data.trafiklabmodels.journeypatternpointonline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyPatternPointOnLine {

    @JsonProperty("LineNumber")
    private int lineNumber;
    @JsonProperty("DirectionCode")
    private String directionCode;
    @JsonProperty("JourneyPatternPointNumber")
    private int journeyPatternPointNumber;
    @JsonProperty("LastModifiedUtcDateTime")
    private String lastModifiedUtcDateTime;
    @JsonProperty("ExistsFromDate")
    private String existsFromDate;

    public JourneyPatternPointOnLine() {
    }

    public JourneyPatternPointOnLine(int lineNumber, String directionCode, int journeyPatternPointNumber, String lastModifiedUtcDateTime, String existsFromDate) {
        this.lineNumber = lineNumber;
        this.directionCode = directionCode;
        this.journeyPatternPointNumber = journeyPatternPointNumber;
        this.lastModifiedUtcDateTime = lastModifiedUtcDateTime;
        this.existsFromDate = existsFromDate;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getDirectionCode() {
        return directionCode;
    }

    public void setDirectionCode(String directionCode) {
        this.directionCode = directionCode;
    }

    public int getJourneyPatternPointNumber() {
        return journeyPatternPointNumber;
    }

    public void setJourneyPatternPointNumber(int journeyPatternPointNumber) {
        this.journeyPatternPointNumber = journeyPatternPointNumber;
    }

    public String getLastModifiedUtcDateTime() {
        return lastModifiedUtcDateTime;
    }

    public void setLastModifiedUtcDateTime(String lastModifiedUtcDateTime) {
        this.lastModifiedUtcDateTime = lastModifiedUtcDateTime;
    }

    public String getExistsFromDate() {
        return existsFromDate;
    }

    public void setExistsFromDate(String existsFromDate) {
        this.existsFromDate = existsFromDate;
    }

    @Override
    public String toString() {
        return "JourneyPatternPointOnLine{" +
                "lineNumber='" + lineNumber + '\'' +
                ", directionCode='" + directionCode + '\'' +
                ", journeyPatternPointNumber='" + journeyPatternPointNumber + '\'' +
                ", lastModifiedUtcDateTime='" + lastModifiedUtcDateTime + '\'' +
                ", existsFromDate='" + existsFromDate + '\'' +
                '}';
    }
}
