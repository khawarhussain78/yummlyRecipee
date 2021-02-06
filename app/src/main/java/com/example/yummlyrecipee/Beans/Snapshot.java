package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Snapshot {

    @SerializedName("original")
    @Expose
    private Object original;
    @SerializedName("resizable")
    @Expose
    private Object resizable;

    public Object getOriginal() {
        return original;
    }

    public void setOriginal(Object original) {
        this.original = original;
    }

    public Object getResizable() {
        return resizable;
    }

    public void setResizable(Object resizable) {
        this.resizable = resizable;
    }

}