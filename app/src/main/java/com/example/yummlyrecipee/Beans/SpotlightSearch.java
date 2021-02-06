package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpotlightSearch {

    @SerializedName("keywords")
    @Expose
    private List<String> keywords = null;
    @SerializedName("noindex")
    @Expose
    private Boolean noindex;

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Boolean getNoindex() {
        return noindex;
    }

    public void setNoindex(Boolean noindex) {
        this.noindex = noindex;
    }

}