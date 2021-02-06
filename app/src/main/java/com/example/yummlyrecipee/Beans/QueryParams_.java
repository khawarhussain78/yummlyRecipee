package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryParams_ {

    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("apiFeedType")
    @Expose
    private String apiFeedType;
    @SerializedName("id")
    @Expose
    private String id;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getApiFeedType() {
        return apiFeedType;
    }

    public void setApiFeedType(String apiFeedType) {
        this.apiFeedType = apiFeedType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}