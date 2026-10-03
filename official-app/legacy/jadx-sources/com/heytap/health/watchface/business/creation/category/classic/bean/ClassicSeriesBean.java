package com.heytap.health.watchface.business.creation.category.classic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ClassicSeriesBean implements Parcelable {
    public static final Parcelable.Creator<ClassicSeriesBean> CREATOR = new a();
    private String backgroundColor;
    private String backgroundImage;
    private String borderColor;
    private String cardImage;

    @SerializedName("contentTips")
    private String contentTips;
    private String csBackgroundColor;

    @SerializedName("dimensions")
    private List<ClassicCustomSettingBean> dimensList;
    private boolean isHidden;

    @Deprecated
    private String navigationColor;
    private String primaryColor;
    private String secondColor;
    private String selectedColor;

    @SerializedName("id")
    private String seriesId;

    @SerializedName("subSeriesList")
    private List<SubSeriesBean> subSeriesBeanList;

    @SerializedName("title")
    private String title;

    public class a implements Parcelable.Creator<ClassicSeriesBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassicSeriesBean createFromParcel(Parcel parcel) {
            return new ClassicSeriesBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClassicSeriesBean[] newArray(int i) {
            return new ClassicSeriesBean[i];
        }
    }

    public ClassicSeriesBean(Parcel parcel) {
        this.seriesId = parcel.readString();
        this.title = parcel.readString();
        this.contentTips = parcel.readString();
        this.isHidden = parcel.readInt() == 1;
        this.backgroundColor = parcel.readString();
        this.backgroundImage = parcel.readString();
        this.cardImage = parcel.readString();
        this.navigationColor = parcel.readString();
        this.primaryColor = parcel.readString();
        this.secondColor = parcel.readString();
        this.borderColor = parcel.readString();
        this.selectedColor = parcel.readString();
        this.csBackgroundColor = parcel.readString();
        this.dimensList = parcel.createTypedArrayList(ClassicCustomSettingBean.CREATOR);
        this.subSeriesBeanList = parcel.createTypedArrayList(SubSeriesBean.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    public String getBorderColor() {
        return this.borderColor;
    }

    public String getCardImage() {
        return this.cardImage;
    }

    public String getContentTips() {
        return this.contentTips;
    }

    public String getCsBackgroundColor() {
        return this.csBackgroundColor;
    }

    public List<ClassicCustomSettingBean> getDimensList() {
        return this.dimensList;
    }

    public String getNavigationColor() {
        return this.navigationColor;
    }

    public String getPrimaryColor() {
        return this.primaryColor;
    }

    public String getSecondColor() {
        return this.secondColor;
    }

    public String getSelectedColor() {
        return this.selectedColor;
    }

    public String getSeriesId() {
        return this.seriesId;
    }

    public List<SubSeriesBean> getSubSeriesBeanList() {
        return this.subSeriesBeanList;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isHidden() {
        return this.isHidden;
    }

    public void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public void setBackgroundImage(String str) {
        this.backgroundImage = str;
    }

    public void setBorderColor(String str) {
        this.borderColor = str;
    }

    public void setCardImage(String str) {
        this.cardImage = str;
    }

    public void setContentTips(String str) {
        this.contentTips = str;
    }

    public void setCsBackgroundColor(String str) {
        this.csBackgroundColor = str;
    }

    public void setDimensList(List<ClassicCustomSettingBean> list) {
        this.dimensList = list;
    }

    public void setHidden(boolean z) {
        this.isHidden = z;
    }

    public void setNavigationColor(String str) {
        this.navigationColor = str;
    }

    public void setPrimaryColor(String str) {
        this.primaryColor = str;
    }

    public void setSecondColor(String str) {
        this.secondColor = str;
    }

    public void setSelectedColor(String str) {
        this.selectedColor = str;
    }

    public void setSeriesId(String str) {
        this.seriesId = str;
    }

    public void setSubSeriesBeanList(List<SubSeriesBean> list) {
        this.subSeriesBeanList = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.seriesId);
        parcel.writeString(this.title);
        parcel.writeString(this.contentTips);
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.backgroundImage);
        parcel.writeString(this.cardImage);
        parcel.writeString(this.navigationColor);
        parcel.writeString(this.primaryColor);
        parcel.writeString(this.secondColor);
        parcel.writeString(this.borderColor);
        parcel.writeString(this.selectedColor);
        parcel.writeString(this.csBackgroundColor);
        parcel.writeTypedList(this.dimensList);
        parcel.writeTypedList(this.subSeriesBeanList);
    }
}
