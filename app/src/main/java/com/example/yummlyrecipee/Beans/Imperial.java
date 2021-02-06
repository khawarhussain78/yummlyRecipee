package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imperial {

    @SerializedName("unit")
    @Expose
    private Unit_ unit;
    @SerializedName("quantity")
    @Expose
    private Double quantity;

    public Unit_ getUnit() {
        return unit;
    }

    public void setUnit(Unit_ unit) {
        this.unit = unit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

}