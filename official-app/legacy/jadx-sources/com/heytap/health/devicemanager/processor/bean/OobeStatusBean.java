package com.heytap.health.devicemanager.processor.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.gdb;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class OobeStatusBean implements Parcelable {
    public static final Parcelable.Creator<OobeStatusBean> CREATOR = new a();
    private boolean isConnect;
    private String mac;
    private boolean oobeFinish;

    public class a implements Parcelable.Creator<OobeStatusBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OobeStatusBean createFromParcel(Parcel parcel) {
            return new OobeStatusBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OobeStatusBean[] newArray(int i) {
            return new OobeStatusBean[i];
        }
    }

    public OobeStatusBean(String str, boolean z, boolean z2) {
        this.mac = str;
        this.oobeFinish = z;
        this.isConnect = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OobeStatusBean oobeStatusBean = (OobeStatusBean) obj;
        return this.oobeFinish == oobeStatusBean.oobeFinish && this.isConnect == oobeStatusBean.isConnect && Objects.equals(this.mac, oobeStatusBean.mac);
    }

    public String getMac() {
        return this.mac;
    }

    public int hashCode() {
        return Objects.hash(this.mac, Boolean.valueOf(this.oobeFinish), Boolean.valueOf(this.isConnect));
    }

    public boolean isConnect() {
        return this.isConnect;
    }

    public boolean isOobeFinish() {
        return this.oobeFinish && this.isConnect;
    }

    public String toString() {
        return "OobeStatusBean{mac='" + gdb.a(this.mac) + "', oobeFinish=" + this.oobeFinish + ", isConnect=" + this.isConnect + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mac);
        parcel.writeByte(this.oobeFinish ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isConnect ? (byte) 1 : (byte) 0);
    }

    public OobeStatusBean(Parcel parcel) {
        this.mac = parcel.readString();
        this.oobeFinish = parcel.readByte() != 0;
        this.isConnect = parcel.readByte() != 0;
    }
}
