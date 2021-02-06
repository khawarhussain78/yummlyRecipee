package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Web {

    @SerializedName("noindex")
    @Expose
    private Boolean noindex;
    @SerializedName("canonical-term")
    @Expose
    private String canonicalTerm;
    @SerializedName("meta-tags")
    @Expose
    private MetaTags metaTags;
    @SerializedName("link-tags")
    @Expose
    private List<LinkTag> linkTags = null;
    @SerializedName("image-url")
    @Expose
    private String imageUrl;

    public Boolean getNoindex() {
        return noindex;
    }

    public void setNoindex(Boolean noindex) {
        this.noindex = noindex;
    }

    public String getCanonicalTerm() {
        return canonicalTerm;
    }

    public void setCanonicalTerm(String canonicalTerm) {
        this.canonicalTerm = canonicalTerm;
    }

    public MetaTags getMetaTags() {
        return metaTags;
    }

    public void setMetaTags(MetaTags metaTags) {
        this.metaTags = metaTags;
    }

    public List<LinkTag> getLinkTags() {
        return linkTags;
    }

    public void setLinkTags(List<LinkTag> linkTags) {
        this.linkTags = linkTags;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}