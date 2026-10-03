package com.platform.usercenter.account.ams.ipc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class IpcRequest implements Parcelable {
    public static final Parcelable.Creator<IpcRequest> CREATOR = new Parcelable.Creator<IpcRequest>() { // from class: com.platform.usercenter.account.ams.ipc.IpcRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IpcRequest createFromParcel(Parcel parcel) {
            return new IpcRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IpcRequest[] newArray(int i) {
            return new IpcRequest[i];
        }
    };
    String basicInfo;
    String paramsJson;
    int requestType;
    String traceId;

    public IpcRequest() {
        this.requestType = 0;
        this.basicInfo = null;
        this.paramsJson = null;
        this.traceId = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBasicInfo() {
        return this.basicInfo;
    }

    public String getParamsJson() {
        return this.paramsJson;
    }

    public int getRequestType() {
        return this.requestType;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setBasicInfo(String str) {
        this.basicInfo = str;
    }

    public void setParamsJson(String str) {
        this.paramsJson = str;
    }

    public void setRequestType(int i) {
        this.requestType = i;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requestType);
        parcel.writeString(this.basicInfo);
        parcel.writeString(this.paramsJson);
        parcel.writeString(this.traceId);
    }

    public IpcRequest(Parcel parcel) {
        this.requestType = 0;
        this.basicInfo = null;
        this.paramsJson = null;
        this.traceId = null;
        this.requestType = parcel.readInt();
        this.basicInfo = parcel.readString();
        this.paramsJson = parcel.readString();
        this.traceId = parcel.readString();
    }
}
