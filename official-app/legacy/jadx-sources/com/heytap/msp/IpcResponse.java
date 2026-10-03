package com.heytap.msp;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class IpcResponse implements Parcelable {
    public static final Parcelable.Creator<IpcResponse> CREATOR = new a();
    private int code;
    private String data;
    private String message;

    public class a implements Parcelable.Creator<IpcResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IpcResponse createFromParcel(Parcel parcel) {
            return new IpcResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IpcResponse[] newArray(int i) {
            return new IpcResponse[i];
        }
    }

    public IpcResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "IpcResponse{code='" + this.code + "', message='" + this.message + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
        parcel.writeString(this.data);
    }

    public IpcResponse(Parcel parcel) {
        this.code = parcel.readInt();
        this.message = parcel.readString();
        this.data = parcel.readString();
    }
}
