package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuidedVariation {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("default")
    @Expose
    private Boolean _default;
    @SerializedName("variationAttributes")
    @Expose
    private List<Object> variationAttributes = null;
    @SerializedName("connected")
    @Expose
    private Boolean connected;
    @SerializedName("actions")
    @Expose
    private List<Action> actions = null;
    @SerializedName("applianceUnitTypeCode")
    @Expose
    private String applianceUnitTypeCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public List<Object> getVariationAttributes() {
        return variationAttributes;
    }

    public void setVariationAttributes(List<Object> variationAttributes) {
        this.variationAttributes = variationAttributes;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public String getApplianceUnitTypeCode() {
        return applianceUnitTypeCode;
    }

    public void setApplianceUnitTypeCode(String applianceUnitTypeCode) {
        this.applianceUnitTypeCode = applianceUnitTypeCode;
    }

}
