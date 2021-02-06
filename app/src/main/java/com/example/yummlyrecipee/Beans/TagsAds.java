package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TagsAds {

    @SerializedName("adtag")
    @Expose
    private List<Adtag> adtag = null;

    public List<Adtag> getAdtag() {
        return adtag;
    }

    public void setAdtag(List<Adtag> adtag) {
        this.adtag = adtag;
    }

}