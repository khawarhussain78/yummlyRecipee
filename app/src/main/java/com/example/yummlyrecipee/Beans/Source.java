package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {

    @SerializedName("sourceRecipeUrl")
    @Expose
    private String sourceRecipeUrl;
    @SerializedName("sourceFaviconUrl")
    @Expose
    private Object sourceFaviconUrl;
    @SerializedName("sourceHttpsOk")
    @Expose
    private Boolean sourceHttpsOk;
    @SerializedName("sourceInFrame")
    @Expose
    private Boolean sourceInFrame;
    @SerializedName("sourceDisplayName")
    @Expose
    private String sourceDisplayName;
    @SerializedName("proSource")
    @Expose
    private Object proSource;
    @SerializedName("sourceSiteUrl")
    @Expose
    private String sourceSiteUrl;
    @SerializedName("introVideo")
    @Expose
    private IntroVideo introVideo;
    @SerializedName("eyebrowText")
    @Expose
    private Object eyebrowText;
    @SerializedName("sourcePageUrl")
    @Expose
    private String sourcePageUrl;
    @SerializedName("marketingCopy")
    @Expose
    private Object marketingCopy;
    @SerializedName("sourceHttpOk")
    @Expose
    private Boolean sourceHttpOk;
    @SerializedName("marketingImage")
    @Expose
    private Object marketingImage;

    public String getSourceRecipeUrl() {
        return sourceRecipeUrl;
    }

    public void setSourceRecipeUrl(String sourceRecipeUrl) {
        this.sourceRecipeUrl = sourceRecipeUrl;
    }

    public Object getSourceFaviconUrl() {
        return sourceFaviconUrl;
    }

    public void setSourceFaviconUrl(Object sourceFaviconUrl) {
        this.sourceFaviconUrl = sourceFaviconUrl;
    }

    public Boolean getSourceHttpsOk() {
        return sourceHttpsOk;
    }

    public void setSourceHttpsOk(Boolean sourceHttpsOk) {
        this.sourceHttpsOk = sourceHttpsOk;
    }

    public Boolean getSourceInFrame() {
        return sourceInFrame;
    }

    public void setSourceInFrame(Boolean sourceInFrame) {
        this.sourceInFrame = sourceInFrame;
    }

    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    public void setSourceDisplayName(String sourceDisplayName) {
        this.sourceDisplayName = sourceDisplayName;
    }

    public Object getProSource() {
        return proSource;
    }

    public void setProSource(Object proSource) {
        this.proSource = proSource;
    }

    public String getSourceSiteUrl() {
        return sourceSiteUrl;
    }

    public void setSourceSiteUrl(String sourceSiteUrl) {
        this.sourceSiteUrl = sourceSiteUrl;
    }

    public IntroVideo getIntroVideo() {
        return introVideo;
    }

    public void setIntroVideo(IntroVideo introVideo) {
        this.introVideo = introVideo;
    }

    public Object getEyebrowText() {
        return eyebrowText;
    }

    public void setEyebrowText(Object eyebrowText) {
        this.eyebrowText = eyebrowText;
    }

    public String getSourcePageUrl() {
        return sourcePageUrl;
    }

    public void setSourcePageUrl(String sourcePageUrl) {
        this.sourcePageUrl = sourcePageUrl;
    }

    public Object getMarketingCopy() {
        return marketingCopy;
    }

    public void setMarketingCopy(Object marketingCopy) {
        this.marketingCopy = marketingCopy;
    }

    public Boolean getSourceHttpOk() {
        return sourceHttpOk;
    }

    public void setSourceHttpOk(Boolean sourceHttpOk) {
        this.sourceHttpOk = sourceHttpOk;
    }

    public Object getMarketingImage() {
        return marketingImage;
    }

    public void setMarketingImage(Object marketingImage) {
        this.marketingImage = marketingImage;
    }

}