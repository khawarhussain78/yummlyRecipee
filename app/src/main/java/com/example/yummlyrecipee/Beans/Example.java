package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("feed")
    @Expose
    private List<Feed> feed = null;
    @SerializedName("seo")
    @Expose
    private Seo_ seo;
    @SerializedName("adTargetingKeywords")
    @Expose
    private List<Object> adTargetingKeywords = null;

    public List<Feed> getFeed() {
        return feed;
    }

    public void setFeed(List<Feed> feed) {
        this.feed = feed;
    }

    public Seo_ getSeo() {
        return seo;
    }

    public void setSeo(Seo_ seo) {
        this.seo = seo;
    }

    public List<Object> getAdTargetingKeywords() {
        return adTargetingKeywords;
    }

    public void setAdTargetingKeywords(List<Object> adTargetingKeywords) {
        this.adTargetingKeywords = adTargetingKeywords;
    }

}