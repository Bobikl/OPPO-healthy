package com.heytap.health.settings.band.settings.sporthealthsetting.appsedit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class AppEditBeanOld implements Parcelable, Comparable<AppEditBeanOld> {
    public static final Parcelable.Creator<AppEditBeanOld> CREATOR = new a();

    @SerializedName("c")
    private byte id;

    @SerializedName("b")
    private boolean isSeleted;

    @SerializedName("a")
    private ScreenContentType screenContentType;

    public class a implements Parcelable.Creator<AppEditBeanOld> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppEditBeanOld createFromParcel(Parcel parcel) {
            return new AppEditBeanOld(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppEditBeanOld[] newArray(int i) {
            return new AppEditBeanOld[i];
        }
    }

    public AppEditBeanOld(Parcel parcel) {
        this.isSeleted = parcel.readByte() != 0;
        this.id = parcel.readByte();
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
        AppEditBeanOld appEditBeanOld = (AppEditBeanOld) obj;
        return this.isSeleted == appEditBeanOld.isSeleted && this.id == appEditBeanOld.id;
    }

    public byte getId() {
        return this.id;
    }

    public ScreenContentType getScreenContentType() {
        return this.screenContentType;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSeleted), Byte.valueOf(this.id));
    }

    public boolean isSeleted() {
        return this.isSeleted;
    }

    public void setId(byte b) {
        this.id = b;
    }

    public void setScreenContentType(ScreenContentType screenContentType) {
        this.screenContentType = screenContentType;
    }

    public void setSeleted(boolean z) {
        this.isSeleted = z;
    }

    public String toString() {
        return "AppEditBean{a_screenContentType=" + this.screenContentType + ", b_isSeleted=" + this.isSeleted + ", c_id=" + ((int) this.id) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isSeleted ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.id);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppEditBeanOld appEditBeanOld) {
        if (!isSeleted() || appEditBeanOld.isSeleted()) {
            return (isSeleted() || !appEditBeanOld.isSeleted()) ? 0 : 1;
        }
        return -1;
    }

    public AppEditBeanOld(byte b, boolean z) {
        this.id = b;
        this.screenContentType = ScreenContentType.fromTypeId(b);
        this.isSeleted = z;
    }
}
