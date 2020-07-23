package com.bignerdranch.android.locatr;

import android.net.Uri;

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;
    private Double mLat;
    private Double mLon;

    public GalleryItem(String caption, String id, String url, String owner, Double lat, Double lon){
        mCaption = caption;
        mId = id;
        mUrl = url;
        mOwner = owner;
        mLat = lat;
        mLon = lon;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public Double getLat() {
        return mLat;
    }

    public void setLat(Double lat) {
        mLat = lat;
    }

    public Double getLon() {
        return mLon;
    }

    public void setLon(Double lon) {
        mLon = lon;
    }

    @Override
    public String toString() {
        return mCaption;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }
}
