package com.lifesense.device.scale.device.dto.product;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class ProductProperty implements Parcelable {
    public static final Parcelable.Creator<ProductProperty> CREATOR = new a();
    public long created;
    public long id;
    public int key;
    public String memo;
    public String productId;
    public int sort;
    public String value;

    public static class a implements Parcelable.Creator<ProductProperty> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductProperty createFromParcel(Parcel parcel) {
            return new ProductProperty(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ProductProperty[] newArray(int i) {
            return new ProductProperty[i];
        }
    }

    public ProductProperty() {
    }

    public ProductProperty(Parcel parcel) {
        this.id = parcel.readLong();
        this.productId = parcel.readString();
        this.key = parcel.readInt();
        this.value = parcel.readString();
        this.created = parcel.readLong();
        this.memo = parcel.readString();
        this.sort = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCreated() {
        return this.created;
    }

    public long getId() {
        return this.id;
    }

    public int getKey() {
        return this.key;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getProductId() {
        return this.productId;
    }

    public int getSort() {
        return this.sort;
    }

    public String getValue() {
        return this.value;
    }

    public void setCreated(long j2) {
        this.created = j2;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setKey(int i) {
        this.key = i;
    }

    public void setMemo(String str) {
        this.memo = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setSort(int i) {
        this.sort = i;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "ProductProperty{id=" + this.id + " productId=" + this.productId + " key=" + this.key + " value=" + this.value + " created=" + this.created + " memo=" + this.memo + " sort=" + this.sort + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.productId);
        parcel.writeInt(this.key);
        parcel.writeString(this.value);
        parcel.writeLong(this.created);
        parcel.writeString(this.memo);
        parcel.writeInt(this.sort);
    }
}
