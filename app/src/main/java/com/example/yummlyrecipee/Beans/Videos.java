package com.example.yummlyrecipee.Beans;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Videos {

    @SerializedName("snapshotUrl")
    @Expose
    private String snapshotUrl;
    @SerializedName("videoUrls")
    @Expose
    private VideoUrls videoUrls;
    @SerializedName("videoDetails")
    @Expose
    private VideoDetails videoDetails;
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

    public VideoUrls getVideoUrls() {
        return videoUrls;
    }

    public void setVideoUrls(VideoUrls videoUrls) {
        this.videoUrls = videoUrls;
    }

    public VideoDetails getVideoDetails() {
        return videoDetails;
    }

    public void setVideoDetails(VideoDetails videoDetails) {
        this.videoDetails = videoDetails;
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