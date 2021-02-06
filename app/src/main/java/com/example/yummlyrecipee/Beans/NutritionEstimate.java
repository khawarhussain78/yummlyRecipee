package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NutritionEstimate {

    @SerializedName("attribute")
    @Expose
    private String attribute;
    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("unit")
    @Expose
    private Unit__ unit;
    @SerializedName("display")
    @Expose
    private Display_ display;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Unit__ getUnit() {
        return unit;
    }

    public void setUnit(Unit__ unit) {
        this.unit = unit;
    }

    public Display_ getDisplay() {
        return display;
    }

    public void setDisplay(Display_ display) {
        this.display = display;
    }

}