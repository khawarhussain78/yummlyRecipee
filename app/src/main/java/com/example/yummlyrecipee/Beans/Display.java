package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Display {

    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("images")
    @Expose
    private List<String> images = null;
    @SerializedName("flag")
    @Expose
    private String flag;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("profiles")
    @Expose
    private List<Profile> profiles = null;
    @SerializedName("displayPrepStepsInline")
    @Expose
    private Boolean displayPrepStepsInline;
    @SerializedName("collections")
    @Expose
    private List<Object> collections = null;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    public Boolean getDisplayPrepStepsInline() {
        return displayPrepStepsInline;
    }

    public void setDisplayPrepStepsInline(Boolean displayPrepStepsInline) {
        this.displayPrepStepsInline = displayPrepStepsInline;
    }

    public List<Object> getCollections() {
        return collections;
    }

    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }

}