package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Display_ {

    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("percentDailyValue")
    @Expose
    private Integer percentDailyValue;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getPercentDailyValue() {
        return percentDailyValue;
    }

    public void setPercentDailyValue(Integer percentDailyValue) {
        this.percentDailyValue = percentDailyValue;
    }

}