package com.heytap.health.settings.band.settings.sporthealthsetting.appsedit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class AppEditBean implements Parcelable, Comparable<AppEditBean> {
    public static final Parcelable.Creator<AppEditBean> CREATOR = new a();
    private byte id;
    private boolean isSeleted;
    private ScreenContentType screenContentType;

    public class a implements Parcelable.Creator<AppEditBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppEditBean createFromParcel(Parcel parcel) {
            return new AppEditBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppEditBean[] newArray(int i) {
            return new AppEditBean[i];
        }
    }

    public AppEditBean(Parcel parcel) {
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
        AppEditBean appEditBean = (AppEditBean) obj;
        return this.isSeleted == appEditBean.isSeleted && this.id == appEditBean.id;
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
        return "AppEditBean{screenContentType=" + this.screenContentType + ", isSeleted=" + this.isSeleted + ", id=" + ((int) this.id) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isSeleted ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.id);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppEditBean appEditBean) {
        if (!isSeleted() || appEditBean.isSeleted()) {
            return (isSeleted() || !appEditBean.isSeleted()) ? 0 : 1;
        }
        return -1;
    }

    public AppEditBean(byte b, boolean z) {
        this.id = b;
        this.screenContentType = ScreenContentType.fromTypeId(b);
        this.isSeleted = z;
    }
}
