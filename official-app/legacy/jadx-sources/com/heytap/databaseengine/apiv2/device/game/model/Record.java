package com.heytap.databaseengine.apiv2.device.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class Record implements Parcelable {
    public static final Parcelable.Creator<Record> CREATOR = new a();
    private int assist;
    private int dead;
    private long endTime;
    private String iconUrl;
    private int kill;
    private String mode;
    private String name;
    private int result;
    private long startTime;

    public class a implements Parcelable.Creator<Record> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Record createFromParcel(Parcel parcel) {
            return new Record(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Record[] newArray(int i) {
            return new Record[i];
        }
    }

    public Record() {
    }

    public Record(Parcel parcel) {
        this.name = parcel.readString();
        this.iconUrl = parcel.readString();
        this.result = parcel.readInt();
        this.mode = parcel.readString();
        this.kill = parcel.readInt();
        this.dead = parcel.readInt();
        this.assist = parcel.readInt();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAssist() {
        return this.assist;
    }

    public int getDead() {
        return this.dead;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getKill() {
        return this.kill;
    }

    public String getMode() {
        return this.mode;
    }

    public String getName() {
        return this.name;
    }

    public int getResult() {
        return this.result;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setAssist(int i) {
        this.assist = i;
    }

    public void setDead(int i) {
        this.dead = i;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setKill(int i) {
        this.kill = i;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public String toString() {
        return "Record{name='" + this.name + "', iconUrl='" + this.iconUrl + "', result=" + this.result + ", mode='" + this.mode + "', kill=" + this.kill + ", dead=" + this.dead + ", assist=" + this.assist + ", startTime=" + this.startTime + ", endTime=" + this.endTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.result);
        parcel.writeString(this.mode);
        parcel.writeInt(this.kill);
        parcel.writeInt(this.dead);
        parcel.writeInt(this.assist);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }
}
