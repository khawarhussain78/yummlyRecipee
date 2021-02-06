package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IntroVideo {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("originalUrl")
    @Expose
    private Object originalUrl;
    @SerializedName("hlsUrl")
    @Expose
    private Object hlsUrl;
    @SerializedName("dashUrl")
    @Expose
    private Object dashUrl;
    @SerializedName("hasAudio")
    @Expose
    private Object hasAudio;
    @SerializedName("snapshot")
    @Expose
    private Snapshot snapshot;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(Object originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Object getHlsUrl() {
        return hlsUrl;
    }

    public void setHlsUrl(Object hlsUrl) {
        this.hlsUrl = hlsUrl;
    }

    public Object getDashUrl() {
        return dashUrl;
    }

    public void setDashUrl(Object dashUrl) {
        this.dashUrl = dashUrl;
    }

    public Object getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(Object hasAudio) {
        this.hasAudio = hasAudio;
    }

    public Snapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

}