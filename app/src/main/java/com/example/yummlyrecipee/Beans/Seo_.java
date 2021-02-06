package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seo_ {

    @SerializedName("web")
    @Expose
    private Web_ web;
    @SerializedName("spotlightSearch")
    @Expose
    private SpotlightSearch_ spotlightSearch;
    @SerializedName("firebase")
    @Expose
    private Firebase_ firebase;

    public Web_ getWeb() {
        return web;
    }

    public void setWeb(Web_ web) {
        this.web = web;
    }

    public SpotlightSearch_ getSpotlightSearch() {
        return spotlightSearch;
    }

    public void setSpotlightSearch(SpotlightSearch_ spotlightSearch) {
        this.spotlightSearch = spotlightSearch;
    }

    public Firebase_ getFirebase() {
        return firebase;
    }

    public void setFirebase(Firebase_ firebase) {
        this.firebase = firebase;
    }

}