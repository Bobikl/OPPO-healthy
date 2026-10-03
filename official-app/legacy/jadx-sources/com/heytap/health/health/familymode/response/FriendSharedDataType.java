package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class FriendSharedDataType implements Parcelable {
    public static final Parcelable.Creator<FriendSharedDataType> CREATOR = new a();
    private int dataType;
    private String description;
    private String name;
    private int shareStatus;

    public class a implements Parcelable.Creator<FriendSharedDataType> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendSharedDataType createFromParcel(Parcel parcel) {
            return new FriendSharedDataType(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendSharedDataType[] newArray(int i) {
            return new FriendSharedDataType[i];
        }
    }

    public FriendSharedDataType() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDataType() {
        return this.dataType;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int getShareStatus() {
        return this.shareStatus;
    }

    public void setDataType(int i) {
        this.dataType = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setShareStatus(int i) {
        this.shareStatus = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataType);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeInt(this.shareStatus);
    }

    public FriendSharedDataType(Parcel parcel) {
        this.dataType = parcel.readInt();
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.shareStatus = parcel.readInt();
    }
}
