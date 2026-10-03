package com.heytap.health.watchface.adaptation.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.ybb;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class BaseWatchFaceBean implements Parcelable, Comparable<BaseWatchFaceBean> {
    public static final Parcelable.Creator<BaseWatchFaceBean> CREATOR = new a();
    public static final int PAY_STATUS_FREE = 2;
    public static final int PAY_STATUS_HAD_PAY = 1;
    public static final int PAY_STATUS_NO_PAY = 0;
    public static final String TAG = "BaseWatchFaceBean";
    private boolean hasUpdate;
    private boolean isCreationWf;
    private String jumpUrl;
    private boolean mCanEdit;
    protected int mCurrentStyleIndex;
    protected boolean mIsCurrent;
    private boolean mIsHidden;
    protected boolean mIsSelected;
    private boolean mIsUniversal;
    protected int mPositionIndex;
    private List<String> mPreviewResNames;
    private List<String> mPreviewUrls;
    protected int mStyleCount;
    private String mStyleUnique;
    private String mWfAuthor;
    private int mWfCategory;
    private String mWfDescription;
    private String mWfDescriptionEn;
    private String mWfDesigner;
    private String mWfName;
    private String mWfNameEn;
    private String mWfPkgName;
    private String mWfUnique;
    private String mWfVersion;
    private long masterId;
    private int pay;
    private long size;
    private long versionId;

    public class a implements Parcelable.Creator<BaseWatchFaceBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BaseWatchFaceBean createFromParcel(Parcel parcel) {
            return new BaseWatchFaceBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BaseWatchFaceBean[] newArray(int i) {
            return new BaseWatchFaceBean[i];
        }
    }

    public BaseWatchFaceBean() {
    }

    public static String generateWfUnique(String str) {
        return ybb.b(str);
    }

    public boolean canEdit() {
        return this.mCanEdit;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof BaseWatchFaceBean) && getWfUnique().equals(((BaseWatchFaceBean) obj).getWfUnique());
    }

    public String getAdaptedLangWfName() {
        Locale locale = b78.a().getResources().getConfiguration().getLocales().get(0);
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if ("zh".equalsIgnoreCase(language) && "CN".equalsIgnoreCase(country)) {
            String str = this.mWfName;
            return str == null ? "" : str;
        }
        String str2 = this.mWfNameEn;
        return str2 == null ? "" : str2;
    }

    public String getCurrentPreviewUrl() {
        int i;
        List<String> list = this.mPreviewUrls;
        if (list != null && (i = this.mCurrentStyleIndex) > -1) {
            if (i < list.size()) {
                return this.mPreviewUrls.get(this.mCurrentStyleIndex);
            }
            if (!this.mPreviewUrls.isEmpty()) {
                ltl.i(TAG, "[getCurrentPreviewUrl] --> preview url error styleIndex over previewUrls arrays item, mCurrentStyleIndex " + this.mCurrentStyleIndex);
                return this.mPreviewUrls.get(0);
            }
        }
        ltl.b(TAG, "[getCurrentPreviewUrl] --> preview url error mPreviewUrls" + this.mPreviewUrls + " mCurrentStyleIndex " + this.mCurrentStyleIndex);
        return "";
    }

    public int getCurrentStyleIndex() {
        return this.mCurrentStyleIndex;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public long getMasterId() {
        return this.masterId;
    }

    public int getPay() {
        return this.pay;
    }

    public int getPositionIndex() {
        return this.mPositionIndex;
    }

    public List<String> getPreviewResNames() {
        return this.mPreviewResNames;
    }

    public List<String> getPreviewUrls() {
        return this.mPreviewUrls;
    }

    public long getSize() {
        return this.size;
    }

    public int getStyleCount() {
        return this.mStyleCount;
    }

    public String getStyleUnique() {
        return this.mStyleUnique;
    }

    public long getVersionId() {
        return this.versionId;
    }

    public String getWfAuthor() {
        return this.mWfAuthor;
    }

    public int getWfCategory() {
        return this.mWfCategory;
    }

    public String getWfDescription() {
        return this.mWfDescription;
    }

    public String getWfDescriptionEn() {
        return this.mWfDescriptionEn;
    }

    public String getWfDesigner() {
        return this.mWfDesigner;
    }

    public String getWfName() {
        return this.mWfName;
    }

    public String getWfPkgName() {
        return this.mWfPkgName;
    }

    public String getWfUnique() {
        return this.mWfUnique;
    }

    public String getWfVersion() {
        return this.mWfVersion;
    }

    public boolean isCreationWf() {
        return this.isCreationWf;
    }

    public boolean isCurrent() {
        return this.mIsCurrent;
    }

    public boolean isHasUpdate() {
        return this.hasUpdate;
    }

    public boolean isHidden() {
        return this.mIsHidden;
    }

    public boolean isNoPay() {
        return this.pay == 0;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public boolean isUniversal() {
        return this.mIsUniversal;
    }

    public void setCanEdit(boolean z) {
        this.mCanEdit = z;
    }

    public void setCreationWf(boolean z) {
        this.isCreationWf = z;
    }

    public void setCurrent(boolean z) {
        this.mIsCurrent = z;
    }

    public void setCurrentStyleIndex(int i) {
        this.mCurrentStyleIndex = i;
    }

    public void setHasUpdate(boolean z) {
        this.hasUpdate = z;
    }

    public void setHidden(boolean z) {
        this.mIsHidden = z;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setPay(int i) {
        this.pay = i;
    }

    public void setPositionIndex(int i) {
        this.mPositionIndex = i;
    }

    public void setPreviewResNames(List<String> list) {
        this.mPreviewResNames = list;
    }

    public void setPreviewUrls(List<String> list) {
        this.mPreviewUrls = list;
    }

    public void setSelected(boolean z) {
        this.mIsSelected = z;
    }

    public void setSize(long j2) {
        this.size = j2;
    }

    public void setStyleCount(int i) {
        this.mStyleCount = i;
    }

    public void setStyleUnique(String str) {
        this.mStyleUnique = str;
    }

    public void setUniversal(boolean z) {
        this.mIsUniversal = z;
    }

    public void setVersionId(long j2) {
        this.versionId = j2;
    }

    public void setWfAuthor(String str) {
        this.mWfAuthor = str;
    }

    public void setWfCategory(int i) {
        this.mWfCategory = i;
    }

    public void setWfDescription(String str) {
        this.mWfDescription = str;
    }

    public void setWfDescriptionEn(String str) {
        this.mWfDescriptionEn = str;
    }

    public void setWfDesigner(String str) {
        this.mWfDesigner = str;
    }

    public void setWfName(String str) {
        this.mWfName = str;
    }

    public void setWfNameEn(String str) {
        this.mWfNameEn = str;
    }

    public void setWfPkgName(String str) {
        this.mWfPkgName = str;
    }

    public void setWfUnique(String str) {
        this.mWfUnique = str;
    }

    public void setWfVersion(String str) {
        this.mWfVersion = str;
    }

    public String toString() {
        return "BaseWatchFaceBean{mWfCategory=" + this.mWfCategory + ", mIsSelected=" + this.mIsSelected + ", mIsCurrent=" + this.mIsCurrent + ", mCurrentStyleIndex=" + this.mCurrentStyleIndex + ", mStyleCount=" + this.mStyleCount + ", mPositionIndex=" + this.mPositionIndex + ", mStyleUnique='" + this.mStyleUnique + "', mWfUnique='" + this.mWfUnique + "', masterId='" + this.masterId + "', versionId='" + this.versionId + "', mWfVersion='" + this.mWfVersion + "', mWfName='" + this.mWfName + "', mWfNameEn='" + this.mWfNameEn + "', mWfDescription='" + this.mWfDescription + "', mWfDescriptionEn='" + this.mWfDescriptionEn + "', mWfAuthor='" + this.mWfAuthor + "', mWfDesigner='" + this.mWfDesigner + "', mPreviewResNames=" + this.mPreviewResNames + ", mIsHidden=" + this.mIsHidden + ", mIsUniversal=" + this.mIsUniversal + ", payStatus=" + this.pay + ", canEdit=" + this.mCanEdit + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mWfCategory);
        parcel.writeByte(this.mIsSelected ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsCurrent ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mCurrentStyleIndex);
        parcel.writeInt(this.mStyleCount);
        parcel.writeInt(this.mPositionIndex);
        parcel.writeString(this.mStyleUnique);
        parcel.writeString(this.mWfUnique);
        parcel.writeString(this.mWfVersion);
        parcel.writeString(this.mWfName);
        parcel.writeString(this.mWfNameEn);
        parcel.writeString(this.mWfDescription);
        parcel.writeString(this.mWfDescriptionEn);
        parcel.writeString(this.mWfAuthor);
        parcel.writeString(this.mWfDesigner);
        parcel.writeStringList(this.mPreviewResNames);
        parcel.writeStringList(this.mPreviewUrls);
        parcel.writeByte(this.mIsUniversal ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.pay);
        parcel.writeLong(this.masterId);
        parcel.writeLong(this.versionId);
        parcel.writeByte(this.mCanEdit ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsHidden ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mWfPkgName);
    }

    public BaseWatchFaceBean(Parcel parcel) {
        this.mWfCategory = parcel.readInt();
        this.mIsSelected = parcel.readByte() != 0;
        this.mIsCurrent = parcel.readByte() != 0;
        this.mCurrentStyleIndex = parcel.readInt();
        this.mStyleCount = parcel.readInt();
        this.mPositionIndex = parcel.readInt();
        this.mStyleUnique = parcel.readString();
        this.mWfUnique = parcel.readString();
        this.mWfVersion = parcel.readString();
        this.mWfName = parcel.readString();
        this.mWfNameEn = parcel.readString();
        this.mWfDescription = parcel.readString();
        this.mWfDescriptionEn = parcel.readString();
        this.mWfAuthor = parcel.readString();
        this.mWfDesigner = parcel.readString();
        this.mPreviewResNames = parcel.createStringArrayList();
        this.mPreviewUrls = parcel.createStringArrayList();
        this.mIsUniversal = parcel.readByte() != 0;
        this.pay = parcel.readInt();
        this.masterId = parcel.readLong();
        this.versionId = parcel.readLong();
        this.mCanEdit = parcel.readByte() != 0;
        this.mIsHidden = parcel.readByte() != 0;
        this.mWfPkgName = parcel.readString();
    }

    @Override // java.lang.Comparable
    public int compareTo(BaseWatchFaceBean baseWatchFaceBean) {
        return this.mPositionIndex - baseWatchFaceBean.getPositionIndex();
    }
}
