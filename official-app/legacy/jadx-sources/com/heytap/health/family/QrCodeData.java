package com.heytap.health.family;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class QrCodeData implements Parcelable {
    public static final Parcelable.Creator<QrCodeData> CREATOR = new a();
    private String avatar;
    private String nickname;
    private String ssoid;
    private long timestamp;

    public class a implements Parcelable.Creator<QrCodeData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public QrCodeData createFromParcel(Parcel parcel) {
            return new QrCodeData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public QrCodeData[] newArray(int i) {
            return new QrCodeData[i];
        }
    }

    public QrCodeData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public String toString() {
        return "QrCodeData{ssoid='" + this.ssoid + "', avatar='" + this.avatar + "', nickname='" + this.nickname + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.avatar);
        parcel.writeString(this.nickname);
    }

    public QrCodeData(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.avatar = parcel.readString();
        this.nickname = parcel.readString();
    }
}
