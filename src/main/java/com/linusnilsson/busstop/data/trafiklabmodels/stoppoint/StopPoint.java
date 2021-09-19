package com.linusnilsson.busstop.data.trafiklabmodels.stoppoint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class StopPoint {

    @JsonProperty("StopPointNumber")
    private int stopPointNumber;
    @JsonProperty("StopPointName")
    private String stopPointName;
    @JsonProperty("StopAreaNumber")
    private String stopAreaNumber;
    @JsonProperty("LocationNorthingCoordinate")
    private String locationNorthingCoordinate;
    @JsonProperty("LocationEastingCoordinate")
    private String locationEastingCoordinate;
    @JsonProperty("ZoneShortName")
    private String zoneShortName;
    @JsonProperty("StopAreaTypeCode")
    private String stopAreaTypeCode;
    @JsonProperty("LastModifiedUtcDateTime")
    private String lastModifiedUtcDateTime;
    @JsonProperty("ExistsFromDate")
    private String existsFromDate;

    public StopPoint(int stopPointNumber, String stopPointName, String stopAreaNumber,
                     String locationNorthingCoordinate, String locationEastingCoordinate,
                     String zoneShortName, String stopAreaTypeCode, String lastModifiedUtcDateTime,
                     String existsFromDate) {
        this.stopPointNumber = stopPointNumber;
        this.stopPointName = stopPointName;
        this.stopAreaNumber = stopAreaNumber;
        this.locationNorthingCoordinate = locationNorthingCoordinate;
        this.locationEastingCoordinate = locationEastingCoordinate;
        this.zoneShortName = zoneShortName;
        this.stopAreaTypeCode = stopAreaTypeCode;
        this.lastModifiedUtcDateTime = lastModifiedUtcDateTime;
        this.existsFromDate = existsFromDate;
    }

    public int getStopPointNumber() {
        return stopPointNumber;
    }

    public String getStopPointName() {
        return stopPointName;
    }

    public String getStopAreaNumber() {
        return stopAreaNumber;
    }

    public String getLocationNorthingCoordinate() {
        return locationNorthingCoordinate;
    }

    public String getLocationEastingCoordinate() {
        return locationEastingCoordinate;
    }

    public String getZoneShortName() {
        return zoneShortName;
    }

    public String getStopAreaTypeCode() {
        return stopAreaTypeCode;
    }

    public String getLastModifiedUtcDateTime() {
        return lastModifiedUtcDateTime;
    }

    public String getExistsFromDate() {
        return existsFromDate;
    }
}
