package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MoreContent {

    @SerializedName("mobileSectionName")
    @Expose
    private String mobileSectionName;
    @SerializedName("queryParams")
    @Expose
    private QueryParams queryParams;
    @SerializedName("feed")
    @Expose
    private List<Object> feed = null;

    public String getMobileSectionName() {
        return mobileSectionName;
    }

    public void setMobileSectionName(String mobileSectionName) {
        this.mobileSectionName = mobileSectionName;
    }

    public QueryParams getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(QueryParams queryParams) {
        this.queryParams = queryParams;
    }

    public List<Object> getFeed() {
        return feed;
    }

    public void setFeed(List<Object> feed) {
        this.feed = feed;
    }

}