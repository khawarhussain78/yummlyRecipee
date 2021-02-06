package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imperial_ {

    @SerializedName("unit")
    @Expose
    private Unit____ unit;
    @SerializedName("quantity")
    @Expose
    private Double quantity;

    public Unit____ getUnit() {
        return unit;
    }

    public void setUnit(Unit____ unit) {
        this.unit = unit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

}