package com.euicc.server.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class EUICCInfo implements Parcelable, Cloneable {
    public static final Parcelable.Creator<EUICCInfo> CREATOR = new a();
    private boolean mActive;
    private String mICCID;
    private String mIMSI;

    public class a implements Parcelable.Creator<EUICCInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EUICCInfo createFromParcel(Parcel parcel) {
            return new EUICCInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EUICCInfo[] newArray(int i) {
            return new EUICCInfo[i];
        }
    }

    public EUICCInfo() {
        this.mIMSI = null;
        this.mICCID = null;
        this.mActive = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getICCID() {
        return this.mICCID;
    }

    public String getIMSI() {
        return this.mIMSI;
    }

    public boolean isActive() {
        return this.mActive;
    }

    public void setActive(boolean z) {
        this.mActive = z;
    }

    public void setICCID(String str) {
        this.mICCID = str;
    }

    public void setIMSI(String str) {
        this.mIMSI = str;
    }

    public String toString() {
        return "SimInfo [mIMSI=" + this.mIMSI + ", mICCID=" + this.mICCID + ", mActive=" + this.mActive + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mIMSI);
        parcel.writeString(this.mICCID);
        parcel.writeByte(this.mActive ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EUICCInfo m4534clone() throws CloneNotSupportedException {
        return (EUICCInfo) super.clone();
    }

    public EUICCInfo(Parcel parcel) {
        this.mIMSI = null;
        this.mICCID = null;
        this.mActive = false;
        this.mIMSI = parcel.readString();
        this.mICCID = parcel.readString();
        this.mActive = parcel.readByte() != 0;
    }

    public EUICCInfo(String str, String str2, boolean z) {
        this.mIMSI = str;
        this.mICCID = str2;
        this.mActive = z;
    }
}
