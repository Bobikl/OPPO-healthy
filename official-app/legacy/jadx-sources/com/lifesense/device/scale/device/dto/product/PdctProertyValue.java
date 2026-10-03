package com.lifesense.device.scale.device.dto.product;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class PdctProertyValue implements Parcelable {
    public static final Parcelable.Creator<PdctProertyValue> CREATOR = new a();
    public String name;
    public int style;
    public String url;

    public static class a implements Parcelable.Creator<PdctProertyValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdctProertyValue createFromParcel(Parcel parcel) {
            return new PdctProertyValue(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdctProertyValue[] newArray(int i) {
            return new PdctProertyValue[i];
        }
    }

    public PdctProertyValue() {
    }

    public PdctProertyValue(Parcel parcel) {
        this.url = parcel.readString();
        this.name = parcel.readString();
        this.style = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public int getStyle() {
        return this.style;
    }

    public String getUrl() {
        return this.url;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "PdctProertyValue{url=" + this.url + " name=" + this.name + " style=" + this.style + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.name);
        parcel.writeInt(this.style);
    }
}
