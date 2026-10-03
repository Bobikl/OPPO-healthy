package com.heytap.databaseengine.apiv2.device.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class GameInfo implements Parcelable {
    public static final Parcelable.Creator<GameInfo> CREATOR = new a();
    private Record mRecord;
    private String packageName;
    private long startTime;
    private int status;

    public class a implements Parcelable.Creator<GameInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameInfo createFromParcel(Parcel parcel) {
            return new GameInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameInfo[] newArray(int i) {
            return new GameInfo[i];
        }
    }

    public GameInfo() {
    }

    public GameInfo(Parcel parcel) {
        this.packageName = parcel.readString();
        this.startTime = parcel.readLong();
        this.mRecord = (Record) parcel.readParcelable(Record.class.getClassLoader());
        this.status = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Record getRecord() {
        return this.mRecord;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getStatus() {
        return this.status;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setRecord(Record record) {
        this.mRecord = record;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "GameInfo{packageName='" + this.packageName + "', startTime=" + this.startTime + ", mRecord=" + this.mRecord + ", status=" + this.status + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.packageName);
        parcel.writeLong(this.startTime);
        parcel.writeParcelable(this.mRecord, i);
        parcel.writeInt(this.status);
    }
}
