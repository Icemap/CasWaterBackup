package com.cas.water.app.pojo;

import java.util.Date;

public class VistaInfo {
    private Integer id;

    private String viataUrl;

    private Double lon;

    private Double lat;

    private Date datetime;

    private String thumbUrl;

    private String hold;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getViataUrl() {
        return viataUrl;
    }

    public void setViataUrl(String viataUrl) {
        this.viataUrl = viataUrl == null ? null : viataUrl.trim();
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

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl == null ? null : thumbUrl.trim();
    }

    public String getHold() {
        return hold;
    }

    public void setHold(String hold) {
        this.hold = hold == null ? null : hold.trim();
    }
}