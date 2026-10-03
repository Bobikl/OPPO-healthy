package com.oplus.tingle.ipc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class BinderExt implements Parcelable {
    public static final Parcelable.Creator<BinderExt> CREATOR = new a();
    private IBinder mBinder;
    private int mPid;
    private String mProcessName;

    public static class a implements Parcelable.Creator<BinderExt> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinderExt createFromParcel(Parcel parcel) {
            return new BinderExt(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinderExt[] newArray(int i) {
            return new BinderExt[i];
        }
    }

    public BinderExt(IBinder iBinder) {
        this.mBinder = iBinder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IBinder getBinder() {
        return this.mBinder;
    }

    public int getPid() {
        return this.mPid;
    }

    public String getProcessName() {
        return this.mProcessName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.mBinder);
        parcel.writeString(this.mProcessName);
        parcel.writeInt(this.mPid);
    }

    public BinderExt(IBinder iBinder, String str, int i) {
        this.mBinder = iBinder;
        this.mProcessName = str;
        this.mPid = i;
    }

    public BinderExt(Parcel parcel) {
        this.mBinder = parcel.readStrongBinder();
        this.mProcessName = parcel.readString();
        this.mPid = parcel.readInt();
    }
}
