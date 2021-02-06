package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("urbSubmitters")
    @Expose
    private List<Object> urbSubmitters = null;
    @SerializedName("tags")
    @Expose
    private Tags tags;
    @SerializedName("preparationSteps")
    @Expose
    private List<String> preparationSteps = null;
    @SerializedName("videos")
    @Expose
    private Videos videos;
    @SerializedName("moreContent")
    @Expose
    private MoreContent moreContent;
    @SerializedName("tagsAds")
    @Expose
    private TagsAds tagsAds;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("relatedContent")
    @Expose
    private RelatedContent relatedContent;
    @SerializedName("ingredientLines")
    @Expose
    private List<IngredientLine> ingredientLines = null;
    @SerializedName("unitSystem")
    @Expose
    private String unitSystem;
    @SerializedName("reviews")
    @Expose
    private Reviews reviews;
    @SerializedName("relatedProducts")
    @Expose
    private RelatedProducts relatedProducts;
    @SerializedName("preparationStepCount")
    @Expose
    private Integer preparationStepCount;
    @SerializedName("nutrition")
    @Expose
    private Nutrition_ nutrition;
    @SerializedName("yums")
    @Expose
    private Yums yums;
    @SerializedName("guidedVariations")
    @Expose
    private List<GuidedVariation> guidedVariations = null;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public List<Object> getUrbSubmitters() {
        return urbSubmitters;
    }

    public void setUrbSubmitters(List<Object> urbSubmitters) {
        this.urbSubmitters = urbSubmitters;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public List<String> getPreparationSteps() {
        return preparationSteps;
    }

    public void setPreparationSteps(List<String> preparationSteps) {
        this.preparationSteps = preparationSteps;
    }

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    public MoreContent getMoreContent() {
        return moreContent;
    }

    public void setMoreContent(MoreContent moreContent) {
        this.moreContent = moreContent;
    }

    public TagsAds getTagsAds() {
        return tagsAds;
    }

    public void setTagsAds(TagsAds tagsAds) {
        this.tagsAds = tagsAds;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public RelatedContent getRelatedContent() {
        return relatedContent;
    }

    public void setRelatedContent(RelatedContent relatedContent) {
        this.relatedContent = relatedContent;
    }

    public List<IngredientLine> getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(List<IngredientLine> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    public String getUnitSystem() {
        return unitSystem;
    }

    public void setUnitSystem(String unitSystem) {
        this.unitSystem = unitSystem;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public RelatedProducts getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(RelatedProducts relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public Integer getPreparationStepCount() {
        return preparationStepCount;
    }

    public void setPreparationStepCount(Integer preparationStepCount) {
        this.preparationStepCount = preparationStepCount;
    }

    public Nutrition_ getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition_ nutrition) {
        this.nutrition = nutrition;
    }

    public Yums getYums() {
        return yums;
    }

    public void setYums(Yums yums) {
        this.yums = yums;
    }

    public List<GuidedVariation> getGuidedVariations() {
        return guidedVariations;
    }

    public void setGuidedVariations(List<GuidedVariation> guidedVariations) {
        this.guidedVariations = guidedVariations;
    }

}