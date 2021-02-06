package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Android {

    @SerializedName("videoTypeCode")
    @Expose
    private String videoTypeCode;
    @SerializedName("videoUrl")
    @Expose
    private String videoUrl;
    @SerializedName("hasAudio")
    @Expose
    private Boolean hasAudio;

    public String getVideoTypeCode() {
        return videoTypeCode;
    }

    public void setVideoTypeCode(String videoTypeCode) {
        this.videoTypeCode = videoTypeCode;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Boolean getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(Boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

}