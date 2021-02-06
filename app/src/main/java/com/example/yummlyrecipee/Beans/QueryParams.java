package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryParams {

    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("authorId")
    @Expose
    private String authorId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("apiFeedType")
    @Expose
    private String apiFeedType;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApiFeedType() {
        return apiFeedType;
    }

    public void setApiFeedType(String apiFeedType) {
        this.apiFeedType = apiFeedType;
    }

}