package com.heytap.databaseengineservice.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes15.dex */
@Entity(tableName = "DBAccountInfo")
@Keep
public class DBAccountInfo implements Parcelable {
    public static final Parcelable.Creator<DBAccountInfo> CREATOR = new a();

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long accountInfoId;

    @ColumnInfo(name = "create_time")
    private long createTime;

    @ColumnInfo(name = "isLogin")
    private boolean login;

    @ColumnInfo(name = "ssoid")
    private String ssoid;

    @ColumnInfo(name = "token")
    private String token;

    public class a implements Parcelable.Creator<DBAccountInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBAccountInfo createFromParcel(Parcel parcel) {
            return new DBAccountInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBAccountInfo[] newArray(int i) {
            return new DBAccountInfo[i];
        }
    }

    public DBAccountInfo() {
        this.createTime = System.currentTimeMillis();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getAccountInfoId() {
        return this.accountInfoId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public boolean getLogin() {
        return this.login;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public String getToken() {
        return this.token;
    }

    public void setAccountInfoId(long j2) {
        this.accountInfoId = j2;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setLogin(boolean z) {
        this.login = z;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "DBAccountInfo{accountInfoId=" + this.accountInfoId + ", ssoid='" + this.ssoid + "', createTime=" + this.createTime + ", login=" + this.login + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.token);
        parcel.writeLong(this.createTime);
        parcel.writeByte(this.login ? (byte) 1 : (byte) 0);
    }

    public DBAccountInfo(Parcel parcel) {
        this.createTime = System.currentTimeMillis();
        this.ssoid = parcel.readString();
        this.token = parcel.readString();
        this.createTime = parcel.readLong();
        this.login = parcel.readByte() != 0;
    }
}
