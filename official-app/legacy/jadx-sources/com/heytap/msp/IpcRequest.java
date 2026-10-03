package com.heytap.msp;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class IpcRequest implements Parcelable {
    public static final Parcelable.Creator<IpcRequest> CREATOR = new a();
    private String params;
    private String paramsClassName;

    public class a implements Parcelable.Creator<IpcRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IpcRequest createFromParcel(Parcel parcel) {
            return new IpcRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IpcRequest[] newArray(int i) {
            return new IpcRequest[i];
        }
    }

    public IpcRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getParams() {
        return this.params;
    }

    public String getParamsClassName() {
        return this.paramsClassName;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setParamsClassName(String str) {
        this.paramsClassName = str;
    }

    public String toString() {
        return "IpcRequest{paramsClassName='" + this.paramsClassName + "', params='" + this.params + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.paramsClassName);
        parcel.writeString(this.params);
    }

    public IpcRequest(Parcel parcel) {
        this.paramsClassName = parcel.readString();
        this.params = parcel.readString();
    }
}
