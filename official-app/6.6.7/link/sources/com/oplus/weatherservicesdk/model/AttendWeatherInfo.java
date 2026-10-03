package com.oplus.weatherservicesdk.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AttendWeatherInfo implements Parcelable {
    public static final Parcelable.Creator<AttendWeatherInfo> CREATOR = new Parcelable.Creator<AttendWeatherInfo>() { // from class: com.oplus.weatherservicesdk.model.AttendWeatherInfo.1
        @Override // android.os.Parcelable.Creator
        public AttendWeatherInfo createFromParcel(Parcel parcel) {
            return new AttendWeatherInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AttendWeatherInfo[] newArray(int i) {
            return new AttendWeatherInfo[i];
        }
    };
    private static final String TAG = "AttendWeatherInfo";
    private String mAQI;
    private String mAQILevel;
    private long mCityId;
    private String mCityName;
    private String mCurrentTemp;
    private int mCurrentWeatherId;
    private String mCurrentWeatherName;
    private int mDayTemp;
    private String mDayWeather;
    private boolean mIsLocationCity;
    private boolean mIsTempShowAsCelsius;
    private int mNightTemp;
    private String mPM25;
    private long mSunRiseMills;
    private long mSunSetMills;
    private float mTimeZone;
    private int mWarnLevel;
    private String mWarnTitle;
    private int mWeatherId;

    public AttendWeatherInfo() {
    }

    public AttendWeatherInfo(Parcel parcel) {
        readParcel(parcel);
    }

    private void readParcel(Parcel parcel) {
        this.mWeatherId = parcel.readInt();
        this.mNightTemp = parcel.readInt();
        this.mDayTemp = parcel.readInt();
        this.mCurrentTemp = parcel.readString();
        this.mDayWeather = parcel.readString();
        this.mAQILevel = parcel.readString();
        this.mAQI = parcel.readString();
        this.mPM25 = parcel.readString();
        this.mWarnTitle = parcel.readString();
        this.mWarnLevel = parcel.readInt();
        this.mSunRiseMills = parcel.readLong();
        this.mSunSetMills = parcel.readLong();
        this.mCurrentWeatherId = parcel.readInt();
        this.mCurrentWeatherName = parcel.readString();
        this.mCityId = parcel.readLong();
        this.mTimeZone = parcel.readFloat();
        this.mCityName = parcel.readString();
        this.mIsTempShowAsCelsius = parcel.readBoolean();
        this.mIsLocationCity = parcel.readBoolean();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAQI() {
        return this.mAQI;
    }

    public String getAQILevel() {
        return this.mAQILevel;
    }

    public long getCityId() {
        return this.mCityId;
    }

    public String getCityName() {
        return this.mCityName;
    }

    public String getCurrentTemp() {
        return this.mCurrentTemp;
    }

    public int getCurrentWeatherId() {
        return this.mCurrentWeatherId;
    }

    public String getCurrentWeatherName() {
        return this.mCurrentWeatherName;
    }

    public int getDayTemp() {
        return this.mDayTemp;
    }

    public String getDayWeather() {
        return this.mDayWeather;
    }

    public int getNightTemp() {
        return this.mNightTemp;
    }

    public String getPM25() {
        return this.mPM25;
    }

    public long getSunRiseMills() {
        return this.mSunRiseMills;
    }

    public long getSunSetMills() {
        return this.mSunSetMills;
    }

    public float getTimeZone() {
        return this.mTimeZone;
    }

    public int getWarnLevel() {
        return this.mWarnLevel;
    }

    public String getWarnTitle() {
        return this.mWarnTitle;
    }

    public int getWeatherId() {
        return this.mWeatherId;
    }

    public boolean isLocationCity() {
        return this.mIsLocationCity;
    }

    public boolean isTempShowAsCelsius() {
        return this.mIsTempShowAsCelsius;
    }

    public void readFromParcel(Parcel parcel) {
        readParcel(parcel);
    }

    public void setAQI(String str) {
        this.mAQI = str;
    }

    public void setAQILevel(String str) {
        this.mAQILevel = str;
    }

    public void setCityId(long j) {
        this.mCityId = j;
    }

    public void setCityName(String str) {
        this.mCityName = str;
    }

    public void setCurrentTemp(String str) {
        this.mCurrentTemp = str;
    }

    public void setCurrentWeatherId(int i) {
        this.mCurrentWeatherId = i;
    }

    public void setCurrentWeatherName(String str) {
        this.mCurrentWeatherName = str;
    }

    public void setDayTemp(int i) {
        this.mDayTemp = i;
    }

    public void setDayWeather(String str) {
        this.mDayWeather = str;
    }

    public void setLocationCity(boolean z) {
        this.mIsLocationCity = z;
    }

    public void setNightTemp(int i) {
        this.mNightTemp = i;
    }

    public void setPM25(String str) {
        this.mPM25 = str;
    }

    public void setSunRiseMills(long j) {
        this.mSunRiseMills = j;
    }

    public void setSunSetMills(long j) {
        this.mSunSetMills = j;
    }

    public void setTempShowAsCelsius(boolean z) {
        this.mIsTempShowAsCelsius = z;
    }

    public void setTimeZone(float f) {
        this.mTimeZone = f;
    }

    public void setWarnLevel(int i) {
        this.mWarnLevel = i;
    }

    public void setWarnTitle(String str) {
        this.mWarnTitle = str;
    }

    public void setWeatherId(int i) {
        this.mWeatherId = i;
    }

    public String toString() {
        return "AttendWeatherInfo{mWeatherId=" + this.mWeatherId + ", mNightTemp=" + this.mNightTemp + ", mDayTemp=" + this.mDayTemp + ", mCurrentTemp='" + this.mCurrentTemp + "', mDayWeather='" + this.mDayWeather + "', mAQILevel='" + this.mAQILevel + "', mAQI='" + this.mAQI + "', mPM25='" + this.mPM25 + "', mWarnTitle='" + this.mWarnTitle + "', mWarnLevel=" + this.mWarnLevel + ", mSunRiseMills=" + this.mSunRiseMills + ", mSunSetMills=" + this.mSunSetMills + ", mCurrentWeatherId=" + this.mCurrentWeatherId + ", mCurrentWeatherName='" + this.mCurrentWeatherName + "', mCityId=" + this.mCityId + ", mTimeZone=" + this.mTimeZone + ", mIsTempShowAsCelsius=" + this.mIsTempShowAsCelsius + ", mCityName='" + this.mCityName + "', mIsLocationCity=" + this.mIsLocationCity + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mWeatherId);
        parcel.writeInt(this.mNightTemp);
        parcel.writeInt(this.mDayTemp);
        parcel.writeString(this.mCurrentTemp);
        parcel.writeString(this.mDayWeather);
        parcel.writeString(this.mAQILevel);
        parcel.writeString(this.mAQI);
        parcel.writeString(this.mPM25);
        parcel.writeString(this.mWarnTitle);
        parcel.writeInt(this.mWarnLevel);
        parcel.writeLong(this.mSunRiseMills);
        parcel.writeLong(this.mSunSetMills);
        parcel.writeInt(this.mCurrentWeatherId);
        parcel.writeString(this.mCurrentWeatherName);
        parcel.writeLong(this.mCityId);
        parcel.writeFloat(this.mTimeZone);
        parcel.writeString(this.mCityName);
        parcel.writeBoolean(this.mIsTempShowAsCelsius);
        parcel.writeBoolean(isLocationCity());
    }
}
