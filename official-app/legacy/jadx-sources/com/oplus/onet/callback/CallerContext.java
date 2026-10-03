package com.oplus.onet.callback;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class CallerContext implements Parcelable {
    public static final Parcelable.Creator<CallerContext> CREATOR = new a();
    private int mCallerPid;

    public class a implements Parcelable.Creator<CallerContext> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallerContext createFromParcel(Parcel parcel) {
            return new CallerContext(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CallerContext[] newArray(int i) {
            return new CallerContext[i];
        }
    }

    public CallerContext(Parcel parcel) {
        this.mCallerPid = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCallingPid() {
        return this.mCallerPid;
    }

    public void setCallingPid(int i) {
        this.mCallerPid = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCallerPid);
    }

    public CallerContext(int i) {
        this.mCallerPid = i;
    }
}
