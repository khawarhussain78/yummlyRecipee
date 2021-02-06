package com.example.yummlyrecipee.Beans;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("hostedLargeUrl")
    @Expose
    private String hostedLargeUrl;
    @SerializedName("resizableImageUrl")
    @Expose
    private String resizableImageUrl;
    @SerializedName("resizableImageHeight")
    @Expose
    private Integer resizableImageHeight;
    @SerializedName("resizableImageWidth")
    @Expose
    private Integer resizableImageWidth;

    public String getHostedLargeUrl() {
        return hostedLargeUrl;
    }

    public void setHostedLargeUrl(String hostedLargeUrl) {
        this.hostedLargeUrl = hostedLargeUrl;
    }

    public String getResizableImageUrl() {
        return resizableImageUrl;
    }

    public void setResizableImageUrl(String resizableImageUrl) {
        this.resizableImageUrl = resizableImageUrl;
    }

    public Integer getResizableImageHeight() {
        return resizableImageHeight;
    }

    public void setResizableImageHeight(Integer resizableImageHeight) {
        this.resizableImageHeight = resizableImageHeight;
    }

    public Integer getResizableImageWidth() {
        return resizableImageWidth;
    }

    public void setResizableImageWidth(Integer resizableImageWidth) {
        this.resizableImageWidth = resizableImageWidth;
    }

}