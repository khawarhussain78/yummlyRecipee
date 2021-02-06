package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("snapshotUrl")
    @Expose
    private String snapshotUrl;
    @SerializedName("videoUrls")
    @Expose
    private VideoUrls_ videoUrls;
    @SerializedName("videoTypeCode")
    @Expose
    private String videoTypeCode;
    @SerializedName("hasAudio")
    @Expose
    private Boolean hasAudio;
    @SerializedName("originalVideoUrl")
    @Expose
    private String originalVideoUrl;
    @SerializedName("createTime")
    @Expose
    private String createTime;

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public VideoUrls_ getVideoUrls() {
        return videoUrls;
    }

    public void setVideoUrls(VideoUrls_ videoUrls) {
        this.videoUrls = videoUrls;
    }

    public String getVideoTypeCode() {
        return videoTypeCode;
    }

    public void setVideoTypeCode(String videoTypeCode) {
        this.videoTypeCode = videoTypeCode;
    }

    public Boolean getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(Boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

    public String getOriginalVideoUrl() {
        return originalVideoUrl;
    }

    public void setOriginalVideoUrl(String originalVideoUrl) {
        this.originalVideoUrl = originalVideoUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}