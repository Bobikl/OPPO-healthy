package com.heytap.health.watchface.business.legacy.main.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.oplus.aiunit.vision.df7;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WatchFaceGroupBean implements Parcelable {
    public static final Parcelable.Creator<WatchFaceGroupBean> CREATOR = new a();

    @SerializedName("chineseDesc")
    private String mChineseDesc;

    @SerializedName("chineseName")
    private String mChineseName;

    @SerializedName("dialKey")
    private String mDialKey;

    @SerializedName("dialType")
    private String mDialType;

    @SerializedName("dialTypeEnglishName")
    private String mDialTypeEnglishName;

    @SerializedName("dialTypeName")
    private String mDialTypeName;

    @SerializedName("englishDesc")
    private String mEnglishDesc;

    @SerializedName("englishName")
    private String mEnglishName;
    private boolean mIsDetailLoadingPage;
    private boolean mIsGroupTitle;
    private boolean mIsLastOneInGroup;
    private boolean mIsLoadingPage;

    @SerializedName("packageName")
    private String mPackageName;

    @SerializedName("previewImg")
    private String mPreviewImg;

    @SerializedName("styleImgList")
    private String[] mStyleImgList;

    @SerializedName("version")
    private int mVersion;

    @SerializedName("versionTime")
    private long mVersionTime;

    @SerializedName(RunningPostureVideoActivity.VIDEO_PATH)
    private String mVideoUrl;

    public class a implements Parcelable.Creator<WatchFaceGroupBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchFaceGroupBean createFromParcel(Parcel parcel) {
            return new WatchFaceGroupBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WatchFaceGroupBean[] newArray(int i) {
            return new WatchFaceGroupBean[i];
        }
    }

    public WatchFaceGroupBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChineseDesc() {
        return this.mChineseDesc;
    }

    public String getChineseName() {
        return this.mChineseName;
    }

    public String getDialKey() {
        return this.mDialKey;
    }

    public String getDialType() {
        return this.mDialType;
    }

    public String getDialTypeEnglishName() {
        return this.mDialTypeEnglishName;
    }

    public String getDialTypeName() {
        return this.mDialTypeName;
    }

    public String getEnglishDesc() {
        return this.mEnglishDesc;
    }

    public String getEnglishName() {
        return this.mEnglishName;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getPreviewImg() {
        return this.mPreviewImg;
    }

    public String[] getStyleImgList() {
        return this.mStyleImgList;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public long getVersionTime() {
        return this.mVersionTime;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    public boolean isAdded(df7 df7Var) {
        return df7Var.m(this);
    }

    public boolean isDetailLoadingPage() {
        return this.mIsDetailLoadingPage;
    }

    public boolean isGroupTitle() {
        return this.mIsGroupTitle;
    }

    public boolean isLastOneInGroup() {
        return this.mIsLastOneInGroup;
    }

    public boolean isLoadingPage() {
        return this.mIsLoadingPage;
    }

    public void setChineseDesc(String str) {
        this.mChineseDesc = str;
    }

    public void setChineseName(String str) {
        this.mChineseName = str;
    }

    public void setDialKey(String str) {
        this.mDialKey = str;
    }

    public void setDialType(String str) {
        this.mDialType = str;
    }

    public void setDialTypeEnglishName(String str) {
        this.mDialTypeEnglishName = str;
    }

    public void setDialTypeName(String str) {
        this.mDialTypeName = str;
    }

    public void setEnglishDesc(String str) {
        this.mEnglishDesc = str;
    }

    public void setEnglishName(String str) {
        this.mEnglishName = str;
    }

    public void setGroupTitle(boolean z) {
        this.mIsGroupTitle = z;
    }

    public void setIsDetailLoadingPage(boolean z) {
        this.mIsDetailLoadingPage = z;
    }

    public void setIsLoadingPage(boolean z) {
        this.mIsLoadingPage = z;
    }

    public void setLastOneInGroup(boolean z) {
        this.mIsLastOneInGroup = z;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setPreviewImg(String str) {
        this.mPreviewImg = str;
    }

    public void setStyleImgList(String[] strArr) {
        this.mStyleImgList = strArr;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public void setVersionTime(long j2) {
        this.mVersionTime = j2;
    }

    public void setVideoUrl(String str) {
        this.mVideoUrl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDialType);
        parcel.writeString(this.mDialTypeName);
        parcel.writeString(this.mDialTypeEnglishName);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mDialKey);
        parcel.writeInt(this.mVersion);
        parcel.writeLong(this.mVersionTime);
        parcel.writeString(this.mChineseName);
        parcel.writeString(this.mEnglishName);
        parcel.writeString(this.mChineseDesc);
        parcel.writeString(this.mEnglishDesc);
        parcel.writeString(this.mPreviewImg);
        parcel.writeString(this.mVideoUrl);
        parcel.writeStringArray(this.mStyleImgList);
        parcel.writeByte(this.mIsGroupTitle ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsLastOneInGroup ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsLoadingPage ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsDetailLoadingPage ? (byte) 1 : (byte) 0);
    }

    public WatchFaceGroupBean(Parcel parcel) {
        this.mDialType = parcel.readString();
        this.mDialTypeName = parcel.readString();
        this.mDialTypeEnglishName = parcel.readString();
        this.mPackageName = parcel.readString();
        this.mDialKey = parcel.readString();
        this.mVersion = parcel.readInt();
        this.mVersionTime = parcel.readLong();
        this.mChineseName = parcel.readString();
        this.mEnglishName = parcel.readString();
        this.mChineseDesc = parcel.readString();
        this.mEnglishDesc = parcel.readString();
        this.mPreviewImg = parcel.readString();
        this.mVideoUrl = parcel.readString();
        this.mStyleImgList = parcel.createStringArray();
        this.mIsGroupTitle = parcel.readByte() != 0;
        this.mIsLastOneInGroup = parcel.readByte() != 0;
        this.mIsLoadingPage = parcel.readByte() != 0;
        this.mIsDetailLoadingPage = parcel.readByte() != 0;
    }
}
