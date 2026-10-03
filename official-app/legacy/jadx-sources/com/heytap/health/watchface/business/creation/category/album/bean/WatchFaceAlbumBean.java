package com.heytap.health.watchface.business.creation.category.album.bean;

import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WatchFaceAlbumBean extends WatchFaceCustomStyleListBean<WatchFaceCustomStyleListItem> {
    private boolean mIsCustomAlbum;
    private boolean mIsSupportMemory;
    private boolean mIsSupportTextColorChange;
    private List<ImageItem> mPicturePaths;
    private int mSupportPhotoCount;
    private int mTimeStyleColor;

    public List<ImageItem> getPicturePaths() {
        return this.mPicturePaths;
    }

    public int getSupportPhotoCount() {
        return this.mSupportPhotoCount;
    }

    public int getTimeStyleColor() {
        return this.mTimeStyleColor;
    }

    public boolean isCustomAlbum() {
        return this.mIsCustomAlbum;
    }

    public boolean isSupportMemory() {
        return this.mIsSupportMemory;
    }

    public boolean isSupportTextColorChange() {
        return this.mIsSupportTextColorChange;
    }

    public void setCustomAlbum(boolean z) {
        this.mIsCustomAlbum = z;
    }

    public void setPicturePaths(List<ImageItem> list) {
        this.mPicturePaths = list;
    }

    public void setSupportMemory(boolean z) {
        this.mIsSupportMemory = z;
    }

    public void setSupportPhotoCount(int i) {
        this.mSupportPhotoCount = i;
    }

    public void setSupportTextColorChange(boolean z) {
        this.mIsSupportTextColorChange = z;
    }

    public void setTimeStyleColor(int i) {
        this.mTimeStyleColor = i;
    }
}
