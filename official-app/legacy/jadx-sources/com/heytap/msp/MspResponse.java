package com.heytap.msp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class MspResponse implements Parcelable {
    public static final Parcelable.Creator<MspResponse> CREATOR = new a();
    private int code;
    private Bundle data;
    private String message;

    public class a implements Parcelable.Creator<MspResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MspResponse createFromParcel(Parcel parcel) {
            return new MspResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MspResponse[] newArray(int i) {
            return new MspResponse[i];
        }
    }

    public MspResponse() {
    }

    public MspResponse(Parcel parcel) {
        this.code = parcel.readInt();
        this.message = parcel.readString();
        this.data = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public Bundle getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(Bundle bundle) {
        this.data = bundle;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "MspResponse{code='" + this.code + "', message='" + this.message + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
        parcel.writeBundle(this.data);
    }
}
