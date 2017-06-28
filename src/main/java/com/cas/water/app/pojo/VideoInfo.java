package com.cas.water.app.pojo;

import java.util.Date;

public class VideoInfo {
    private Integer id;

    private String videoName;

    private String videoUrl;

    private Integer belongRiverId;

    private Date startShootDate;

    private String hold;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Integer getBelongRiverId() {
        return belongRiverId;
    }

    public void setBelongRiverId(Integer belongRiverId) {
        this.belongRiverId = belongRiverId;
    }

    public Date getStartShootDate() {
        return startShootDate;
    }

    public void setStartShootDate(Date startShootDate) {
        this.startShootDate = startShootDate;
    }

    public String getHold() {
        return hold;
    }

    public void setHold(String hold) {
        this.hold = hold == null ? null : hold.trim();
    }
}