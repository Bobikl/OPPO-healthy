package com.heytap.health.watchface.business.legacy.creation.album.bean;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AlbumItem implements Serializable {
    private static final long serialVersionUID = -6157582221476322585L;
    private int mCount;
    private String mCoverPath;
    private String mCoverUriPath;
    private String mDate;
    private String mId;
    private String mKey;
    private String mName;

    public AlbumItem() {
    }

    public boolean equals(Object obj) {
        String str = this.mId;
        return (str == null || !(obj instanceof AlbumItem)) ? super.equals(obj) : str.equals(((AlbumItem) obj).mId);
    }

    public int getCount() {
        return this.mCount;
    }

    public String getCoverPath() {
        return this.mCoverPath;
    }

    public String getCoverUriPath() {
        return this.mCoverUriPath;
    }

    public String getDate() {
        return this.mDate;
    }

    public String getId() {
        return this.mId;
    }

    public String getKey() {
        return this.mKey;
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void setCount(int i) {
        this.mCount = i;
    }

    public void setCoverPath(String str) {
        this.mCoverPath = str;
    }

    public void setCoverUriPath(String str) {
        this.mCoverUriPath = str;
    }

    public void setDate(String str) {
        this.mDate = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public String toString() {
        return "AlbumItem{mId='" + this.mId + "', mCoverPath='" + this.mCoverPath + "', mCoverUriPath='" + this.mCoverUriPath + "', mCount=" + this.mCount + ", mName='" + this.mName + "', mKey='" + this.mKey + "', mDate='" + this.mDate + "'}";
    }

    public AlbumItem(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        this.mId = str;
        this.mCoverPath = str2;
        this.mCoverUriPath = str3;
        this.mCount = i;
        this.mName = str4;
        this.mKey = str5;
        this.mDate = str6;
    }
}
