package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metric_ {

    @SerializedName("unit")
    @Expose
    private Unit___ unit;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;

    public Unit___ getUnit() {
        return unit;
    }

    public void setUnit(Unit___ unit) {
        this.unit = unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}