package com.heytap.health.watchface.business.creation.base.custom;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class WatchFaceCustomStyleListItem implements Parcelable {
    public static final Parcelable.Creator<WatchFaceCustomStyleListItem> CREATOR = new a();
    public static final int DEFAULT_BACKGROUND_COLOR = 0;
    protected int backgroundColor;
    protected transient Bitmap bitmap;
    protected int deviceHeight;
    protected int deviceRadius;
    protected int deviceWidth;
    protected String id;
    protected int imageResource;
    protected boolean isSelected;
    protected String title;

    public class a implements Parcelable.Creator<WatchFaceCustomStyleListItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WatchFaceCustomStyleListItem createFromParcel(Parcel parcel) {
            return new WatchFaceCustomStyleListItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WatchFaceCustomStyleListItem[] newArray(int i) {
            return new WatchFaceCustomStyleListItem[i];
        }
    }

    public WatchFaceCustomStyleListItem() {
        this.imageResource = -1;
        this.backgroundColor = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getDeviceHeight() {
        return this.deviceHeight;
    }

    public int getDeviceRadius() {
        return this.deviceRadius;
    }

    public int getDeviceWidth() {
        return this.deviceWidth;
    }

    public String getId() {
        return this.id;
    }

    public int getImageResource() {
        return this.imageResource;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setDeviceHeight(int i) {
        this.deviceHeight = i;
    }

    public void setDeviceRadius(int i) {
        this.deviceRadius = i;
    }

    public void setDeviceWidth(int i) {
        this.deviceWidth = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageResource(int i) {
        this.imageResource = i;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "WatchFaceCustomSettingItemBean{id='" + this.id + "', title='" + this.title + "', isSelected=" + this.isSelected + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.imageResource);
        parcel.writeByte(this.isSelected ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.deviceHeight);
        parcel.writeInt(this.deviceWidth);
        parcel.writeInt(this.deviceRadius);
    }

    public WatchFaceCustomStyleListItem(WatchFaceCustomStyleListItem watchFaceCustomStyleListItem) {
        this.imageResource = -1;
        this.backgroundColor = 0;
        this.id = watchFaceCustomStyleListItem.getId();
        this.title = watchFaceCustomStyleListItem.getTitle();
        this.imageResource = watchFaceCustomStyleListItem.getImageResource();
        this.isSelected = watchFaceCustomStyleListItem.isSelected();
        this.backgroundColor = watchFaceCustomStyleListItem.getBackgroundColor();
        this.deviceHeight = watchFaceCustomStyleListItem.getDeviceHeight();
        this.deviceWidth = watchFaceCustomStyleListItem.getDeviceWidth();
        this.deviceRadius = watchFaceCustomStyleListItem.getDeviceRadius();
    }

    public WatchFaceCustomStyleListItem(Parcel parcel) {
        this.imageResource = -1;
        this.backgroundColor = 0;
        this.id = parcel.readString();
        this.title = parcel.readString();
        this.imageResource = parcel.readInt();
        this.isSelected = parcel.readByte() != 0;
        this.backgroundColor = parcel.readInt();
        this.deviceHeight = parcel.readInt();
        this.deviceWidth = parcel.readInt();
        this.deviceRadius = parcel.readInt();
    }
}
