package com.lifesense.device.scale.device.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DisplayProductCategory implements Parcelable {
    public static final Parcelable.Creator<DisplayProductCategory> CREATOR = new Parcelable.Creator<DisplayProductCategory>() { // from class: com.lifesense.device.scale.device.product.DisplayProductCategory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DisplayProductCategory createFromParcel(Parcel parcel) {
            return new DisplayProductCategory(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DisplayProductCategory[] newArray(int i) {
            return new DisplayProductCategory[i];
        }
    };

    @JSONField(name = "iotDisplayProducts")
    public List<DisplayProduct> displayProducts;
    public String highlightImageUrl;
    public Long id;
    public String noHighlightImageUrl;
    public int productType;
    public String productTypeName;

    public DisplayProductCategory() {
    }

    public DisplayProductCategory(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.productType = parcel.readInt();
        this.productTypeName = parcel.readString();
        this.highlightImageUrl = parcel.readString();
        this.noHighlightImageUrl = parcel.readString();
        this.displayProducts = parcel.createTypedArrayList(DisplayProduct.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DisplayProductType getDisplayProductType() {
        return DisplayProductType.toProductType(this.productType);
    }

    public List<DisplayProduct> getDisplayProducts() {
        return this.displayProducts;
    }

    public String getHighlightImageUrl() {
        return this.highlightImageUrl;
    }

    public Long getId() {
        return this.id;
    }

    public String getNoHighlightImageUrl() {
        return this.noHighlightImageUrl;
    }

    public int getProductType() {
        return this.productType;
    }

    public String getProductTypeName() {
        return this.productTypeName;
    }

    public void setDisplayProducts(List<DisplayProduct> list) {
        this.displayProducts = list;
    }

    public void setHighlightImageUrl(String str) {
        this.highlightImageUrl = str;
    }

    public void setId(Long l2) {
        this.id = l2;
    }

    public void setNoHighlightImageUrl(String str) {
        this.noHighlightImageUrl = str;
    }

    public void setProductType(int i) {
        this.productType = i;
    }

    public void setProductTypeName(String str) {
        this.productTypeName = str;
    }

    public String toString() {
        return "DisplayProductCategory{id=" + this.id + ", productType=" + this.productType + ", productTypeName='" + this.productTypeName + "', highlightImageUrl='" + this.highlightImageUrl + "', noHighlightImageUrl='" + this.noHighlightImageUrl + "', displayProducts=" + this.displayProducts + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.id);
        parcel.writeInt(this.productType);
        parcel.writeString(this.productTypeName);
        parcel.writeString(this.highlightImageUrl);
        parcel.writeString(this.noHighlightImageUrl);
        parcel.writeTypedList(this.displayProducts);
    }

    public DisplayProductCategory(Long l2, int i, String str, String str2, String str3) {
        this.id = l2;
        this.productType = i;
        this.productTypeName = str;
        this.highlightImageUrl = str2;
        this.noHighlightImageUrl = str3;
    }
}
