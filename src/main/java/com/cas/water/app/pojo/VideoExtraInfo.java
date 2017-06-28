package com.cas.water.app.pojo;

public class VideoExtraInfo {
    private Integer id;

    private Double lon;

    private Double lat;

    private Integer relativeTime;

    private Integer belongVideoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Integer getRelativeTime() {
        return relativeTime;
    }

    public void setRelativeTime(Integer relativeTime) {
        this.relativeTime = relativeTime;
    }

    public Integer getBelongVideoId() {
        return belongVideoId;
    }

    public void setBelongVideoId(Integer belongVideoId) {
        this.belongVideoId = belongVideoId;
    }
}