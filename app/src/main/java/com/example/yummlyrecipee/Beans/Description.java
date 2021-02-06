package com.example.yummlyrecipee.Beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {

    @SerializedName("mobileSectionName")
    @Expose
    private String mobileSectionName;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("shortText")
    @Expose
    private Object shortText;

    public String getMobileSectionName() {
        return mobileSectionName;
    }

    public void setMobileSectionName(String mobileSectionName) {
        this.mobileSectionName = mobileSectionName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getShortText() {
        return shortText;
    }

    public void setShortText(Object shortText) {
        this.shortText = shortText;
    }

}