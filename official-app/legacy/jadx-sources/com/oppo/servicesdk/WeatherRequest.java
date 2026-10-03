package com.oppo.servicesdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class WeatherRequest implements Parcelable {
    public static final Parcelable.Creator<WeatherRequest> CREATOR = new a();
    private static final String TAG = "REQUEST";
    private String mCallMethodName;
    private String mOSVersion;
    private String mPackageName;
    private ArrayList<String> mParams;
    private String mRequestID;

    public class a implements Parcelable.Creator<WeatherRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherRequest createFromParcel(Parcel parcel) {
            return new WeatherRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WeatherRequest[] newArray(int i) {
            return new WeatherRequest[i];
        }
    }

    public WeatherRequest() {
        this.mParams = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCallMethodName() {
        return this.mCallMethodName;
    }

    public String getOSVersion() {
        return this.mOSVersion;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public ArrayList<String> getParams() {
        return this.mParams;
    }

    public String getRequestID() {
        return this.mRequestID;
    }

    public WeatherRequest setCallMethodName(String str) {
        this.mCallMethodName = str;
        return this;
    }

    public WeatherRequest setOSVersion(String str) {
        this.mOSVersion = str;
        return this;
    }

    public WeatherRequest setPackageName(String str) {
        this.mPackageName = str;
        return this;
    }

    public WeatherRequest setParams(ArrayList<String> arrayList) {
        this.mParams = arrayList;
        return this;
    }

    public WeatherRequest setRequestID(String str) {
        this.mRequestID = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mRequestID);
        parcel.writeString(this.mCallMethodName);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mOSVersion);
        parcel.writeList(this.mParams);
    }

    public WeatherRequest(Parcel parcel) {
        this.mParams = new ArrayList<>();
        this.mRequestID = parcel.readString();
        this.mCallMethodName = parcel.readString();
        this.mPackageName = parcel.readString();
        this.mOSVersion = parcel.readString();
        this.mParams = parcel.readArrayList(ArrayList.class.getClassLoader());
    }
}
