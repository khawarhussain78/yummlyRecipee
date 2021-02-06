package com.example.yummlyrecipee.Beans;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reviews {

    @SerializedName("mobileSectionName")
    @Expose
    private String mobileSectionName;
    @SerializedName("totalReviewCount")
    @Expose
    private Integer totalReviewCount;
    @SerializedName("averageRating")
    @Expose
    private Double averageRating;
    @SerializedName("reviews")
    @Expose
    private List<Object> reviews = null;
    @SerializedName("thisUserReview")
    @Expose
    private Object thisUserReview;
    @SerializedName("sortBy")
    @Expose
    private String sortBy;

    public String getMobileSectionName() {
        return mobileSectionName;
    }

    public void setMobileSectionName(String mobileSectionName) {
        this.mobileSectionName = mobileSectionName;
    }

    public Integer getTotalReviewCount() {
        return totalReviewCount;
    }

    public void setTotalReviewCount(Integer totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public List<Object> getReviews() {
        return reviews;
    }

    public void setReviews(List<Object> reviews) {
        this.reviews = reviews;
    }

    public Object getThisUserReview() {
        return thisUserReview;
    }

    public void setThisUserReview(Object thisUserReview) {
        this.thisUserReview = thisUserReview;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}