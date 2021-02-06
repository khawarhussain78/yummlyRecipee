package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoDetails {

    @SerializedName("ios")
    @Expose
    private List<Io> ios = null;
    @SerializedName("android")
    @Expose
    private List<Android> android = null;

    public List<Io> getIos() {
        return ios;
    }

    public void setIos(List<Io> ios) {
        this.ios = ios;
    }

    public List<Android> getAndroid() {
        return android;
    }

    public void setAndroid(List<Android> android) {
        this.android = android;
    }

}