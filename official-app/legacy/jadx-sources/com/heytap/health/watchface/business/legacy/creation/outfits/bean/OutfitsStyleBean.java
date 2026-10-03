package com.heytap.health.watchface.business.legacy.creation.outfits.bean;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class OutfitsStyleBean {
    private Bitmap mBackGroundBitmap;
    private Bitmap mBitmap;
    private OutfitsEngineBackgroundBean mEngineBackgroundBean;
    private OutfitsColorPatternBean mOutfitsColorPatternBean;
    private OutfitsTimeCategory mOutfitsTimeCategory;
    private String mPackageName;
    private String mPreUrl;
    private String mServiceName;
    private int mStyleIndex;
    private int mWfCategory;
    private String mWfUnique;

    public Bitmap getBackGroundBitmap() {
        return this.mBackGroundBitmap;
    }

    public OutfitsEngineBackgroundBean getBackgroundBean() {
        return this.mEngineBackgroundBean;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public String getEngineBackgroundResName() {
        OutfitsEngineBackgroundBean outfitsEngineBackgroundBean = this.mEngineBackgroundBean;
        return outfitsEngineBackgroundBean != null ? outfitsEngineBackgroundBean.getEngineBackgroundName() : "";
    }

    public OutfitsColorPatternBean getOutfitsColorPatternBean() {
        return this.mOutfitsColorPatternBean;
    }

    public OutfitsTimeCategory getOutfitsTimeCategory() {
        return this.mOutfitsTimeCategory;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getPreUrl() {
        return this.mPreUrl;
    }

    public String getServiceName() {
        return this.mServiceName;
    }

    public int getStyleIndex() {
        return this.mStyleIndex;
    }

    public int getWfCategory() {
        return this.mWfCategory;
    }

    public String getWfUnique() {
        return this.mWfUnique;
    }

    public void setBackGroundBitmap(Bitmap bitmap) {
        this.mBackGroundBitmap = bitmap;
    }

    public void setBackgroundBean(OutfitsEngineBackgroundBean outfitsEngineBackgroundBean) {
        this.mEngineBackgroundBean = outfitsEngineBackgroundBean;
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public void setOutfitsColorPatternBean(OutfitsColorPatternBean outfitsColorPatternBean) {
        this.mOutfitsColorPatternBean = outfitsColorPatternBean;
    }

    public void setOutfitsTimeCategory(OutfitsTimeCategory outfitsTimeCategory) {
        this.mOutfitsTimeCategory = outfitsTimeCategory;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setPreUrl(String str) {
        this.mPreUrl = str;
    }

    public void setServiceName(String str) {
        this.mServiceName = str;
    }

    public void setStyleIndex(int i) {
        this.mStyleIndex = i;
    }

    public void setWfCategory(int i) {
        this.mWfCategory = i;
    }

    public void setWfUnique(String str) {
        this.mWfUnique = str;
    }

    public String toString() {
        return "OutfitsStyleBean{mPackageName='" + this.mPackageName + "', mServiceName='" + this.mServiceName + "', mStyleIndex=" + this.mStyleIndex + ", mWfUnique=" + this.mWfUnique + ", mPreUrl=" + this.mPreUrl + ", mBitmap=" + this.mBitmap + ", mOutfitsColorPatternBean=" + this.mOutfitsColorPatternBean + ", mEngineBackgroundBean=" + this.mEngineBackgroundBean + ", mOutfitsTimeCategory=" + this.mOutfitsTimeCategory + '}';
    }
}
