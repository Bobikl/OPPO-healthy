package com.heytap.health.watchface.adaptation.device.rswatch.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.oplus.aiunit.vision.b78;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class DialOnlineBean implements Serializable {

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

    @SerializedName("packageName")
    private Object mPackageName;

    @SerializedName("previewImg")
    private String mPreviewImg;

    @SerializedName("resPackageMd5")
    private String mResPackageMd5;

    @SerializedName("resPackageSize")
    private int mResPackageSize;

    @SerializedName("resPackageUrl")
    private String mResPackageUrl;

    @SerializedName("styleImgList")
    private List<String> mStyleImgList;

    @SerializedName("version")
    private int mVersion;

    @SerializedName("versionTime")
    private long mVersionTime;

    @SerializedName(RunningPostureVideoActivity.VIDEO_PATH)
    private Object mVideoUrl;

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

    public String getName() {
        Locale locale = b78.a().getResources().getConfiguration().getLocales().get(0);
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if ("zh".equalsIgnoreCase(language) && "CN".equalsIgnoreCase(country)) {
            String str = this.mChineseName;
            return str == null ? "" : str;
        }
        String str2 = this.mEnglishName;
        return str2 == null ? "" : str2;
    }

    public Object getPackageName() {
        return this.mPackageName;
    }

    public String getPreviewImg() {
        return this.mPreviewImg;
    }

    public String getResPackageMd5() {
        return this.mResPackageMd5;
    }

    public int getResPackageSize() {
        return this.mResPackageSize;
    }

    public String getResPackageUrl() {
        return this.mResPackageUrl;
    }

    public List<String> getStyleImgList() {
        return this.mStyleImgList;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public long getVersionTime() {
        return this.mVersionTime;
    }

    public Object getVideoUrl() {
        return this.mVideoUrl;
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

    public void setPackageName(Object obj) {
        this.mPackageName = obj;
    }

    public void setPreviewImg(String str) {
        this.mPreviewImg = str;
    }

    public void setResPackageMd5(String str) {
        this.mResPackageMd5 = str;
    }

    public void setResPackageSize(int i) {
        this.mResPackageSize = i;
    }

    public void setResPackageUrl(String str) {
        this.mResPackageUrl = str;
    }

    public void setStyleImgList(List<String> list) {
        this.mStyleImgList = list;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public void setVersionTime(long j2) {
        this.mVersionTime = j2;
    }

    public void setVideoUrl(Object obj) {
        this.mVideoUrl = obj;
    }
}
