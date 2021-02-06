package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amount_ {

    @SerializedName("metric")
    @Expose
    private Metric_ metric;
    @SerializedName("imperial")
    @Expose
    private Imperial_ imperial;

    public Metric_ getMetric() {
        return metric;
    }

    public void setMetric(Metric_ metric) {
        this.metric = metric;
    }

    public Imperial_ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_ imperial) {
        this.imperial = imperial;
    }

}