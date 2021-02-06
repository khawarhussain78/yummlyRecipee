package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seo {

    @SerializedName("web")
    @Expose
    private Web web;
    @SerializedName("spotlightSearch")
    @Expose
    private SpotlightSearch spotlightSearch;
    @SerializedName("firebase")
    @Expose
    private Firebase firebase;

    public Web getWeb() {
        return web;
    }

    public void setWeb(Web web) {
        this.web = web;
    }

    public SpotlightSearch getSpotlightSearch() {
        return spotlightSearch;
    }

    public void setSpotlightSearch(SpotlightSearch spotlightSearch) {
        this.spotlightSearch = spotlightSearch;
    }

    public Firebase getFirebase() {
        return firebase;
    }

    public void setFirebase(Firebase firebase) {
        this.firebase = firebase;
    }

}