package com.oplus.wearable.linkservice.sdk.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.wxf;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class Status implements Parcelable, wxf {
    private static final String TAG = "Status";
    private int mStatusCode;
    private String mStatusMessage;
    private int mVersionCode;
    public static final Status INTERNAL_ERROR = new Status(401);
    public static final Status INTERRUPTED = new Status(402);
    public static final Status TIMEOUT = new Status(403);
    public static final Status SUCCESS = new Status(0);
    public static final Status LENGTH_OUT_OF_RANGE = new Status(400);
    public static final Parcelable.Creator<Status> CREATOR = new a();

    public class a implements Parcelable.Creator<Status> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status createFromParcel(Parcel parcel) {
            Status status = new Status();
            status.mStatusCode = parcel.readInt();
            status.mStatusMessage = parcel.readString();
            status.mVersionCode = parcel.readInt();
            return status;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Status[] newArray(int i) {
            return new Status[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.mStatusCode;
    }

    public String getMsg() {
        return this.mStatusMessage;
    }

    public Status getStatus() {
        return this;
    }

    public String toString() {
        return "Status[StatusCode=" + this.mStatusCode + "|mStatusMessage=" + this.mStatusMessage + "|VersionCode=" + this.mVersionCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mStatusCode);
        parcel.writeString(this.mStatusMessage);
        parcel.writeInt(this.mVersionCode);
    }

    private Status() {
    }

    public Status(int i, String str, int i2) {
        this.mVersionCode = i2;
        this.mStatusMessage = str;
        this.mStatusCode = i;
    }

    public Status(int i, String str) {
        this(i, str, 1);
    }

    public Status(int i) {
        this(i, null);
    }
}
