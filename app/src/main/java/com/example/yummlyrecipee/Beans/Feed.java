package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feed {

    @SerializedName("display")
    @Expose
    private Display display;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("promoted")
    @Expose
    private Boolean promoted;
    @SerializedName("proRecipe")
    @Expose
    private Boolean proRecipe;
    @SerializedName("tracking-id")
    @Expose
    private String trackingId;
    @SerializedName("seo")
    @Expose
    private Seo seo;
    @SerializedName("content")
    @Expose
    private Content content;

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPromoted() {
        return promoted;
    }

    public void setPromoted(Boolean promoted) {
        this.promoted = promoted;
    }

    public Boolean getProRecipe() {
        return proRecipe;
    }

    public void setProRecipe(Boolean proRecipe) {
        this.proRecipe = proRecipe;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Seo getSeo() {
        return seo;
    }

    public void setSeo(Seo seo) {
        this.seo = seo;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

}