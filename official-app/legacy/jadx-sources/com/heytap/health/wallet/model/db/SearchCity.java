package com.heytap.health.wallet.model.db;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SearchCity implements Parcelable {
    public static final Parcelable.Creator<SearchCity> CREATOR = new a();
    private String cityCode;
    private String cityName;
    private String fullPin;
    private String matchPin;
    private String namePinyinList;
    private String pinyinFirst;
    private String recommendAppCode;

    public class a implements Parcelable.Creator<SearchCity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SearchCity createFromParcel(Parcel parcel) {
            return new SearchCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SearchCity[] newArray(int i) {
            return new SearchCity[i];
        }
    }

    public SearchCity() {
        this.matchPin = "";
        this.fullPin = "";
        this.namePinyinList = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getFullPin() {
        return this.fullPin;
    }

    public String getMatchPin() {
        return this.matchPin;
    }

    public String getNamePinyinList() {
        return this.namePinyinList;
    }

    public String getPinyinFirst() {
        return this.pinyinFirst;
    }

    public String getRecommendAppCode() {
        return this.recommendAppCode;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setFullPin(String str) {
        this.fullPin = str;
    }

    public void setMatchPin(String str) {
        this.matchPin = str;
    }

    public void setNamePinyinList(String str) {
        this.namePinyinList = str;
    }

    public void setPinyinFirst(String str) {
        this.pinyinFirst = str;
    }

    public void setRecommendAppCode(String str) {
        this.recommendAppCode = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cityName);
        parcel.writeString(this.cityCode);
        parcel.writeString(this.recommendAppCode);
        parcel.writeString(this.pinyinFirst);
        parcel.writeString(this.matchPin);
        parcel.writeString(this.fullPin);
        parcel.writeString(this.namePinyinList);
    }

    public SearchCity(Parcel parcel) {
        this.matchPin = "";
        this.fullPin = "";
        this.namePinyinList = "";
        this.cityName = parcel.readString();
        this.cityCode = parcel.readString();
        this.recommendAppCode = parcel.readString();
        this.pinyinFirst = parcel.readString();
        this.matchPin = parcel.readString();
        this.fullPin = parcel.readString();
        this.namePinyinList = parcel.readString();
    }

    public SearchCity(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.cityName = str;
        this.cityCode = str2;
        this.recommendAppCode = str3;
        this.pinyinFirst = str4;
        this.matchPin = str5;
        this.fullPin = str6;
        this.namePinyinList = str7;
    }
}
