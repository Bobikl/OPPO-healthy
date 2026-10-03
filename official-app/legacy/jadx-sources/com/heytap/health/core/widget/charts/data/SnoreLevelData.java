package com.heytap.health.core.widget.charts.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.annotation.Keep;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class SnoreLevelData implements Parcelable {
    public static final Parcelable.Creator<SnoreLevelData> CREATOR = new a();
    public static final int TYPE_HIGH = 3;
    public static final int TYPE_LOW = 1;
    public static final int TYPE_MIDDLE = 2;
    public static final int TYPE_NORMAL = 0;
    private int color;
    private int dimColor;
    private int level;
    private float snoreMaxDb;
    private float snoreMeanDb;
    private float snoreSumNum;
    private float snoreSumTime;
    private long timestamp;
    private int type;

    public class a implements Parcelable.Creator<SnoreLevelData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnoreLevelData createFromParcel(Parcel parcel) {
            return new SnoreLevelData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnoreLevelData[] newArray(int i) {
            return new SnoreLevelData[i];
        }
    }

    public SnoreLevelData() {
        this.type = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getColor() {
        return this.color;
    }

    public int getDimColor() {
        return this.dimColor;
    }

    public int getLevel() {
        return this.level;
    }

    public float getSnoreMaxDb() {
        return this.snoreMaxDb;
    }

    public float getSnoreMeanDb() {
        return this.snoreMeanDb;
    }

    public float getSnoreSumNum() {
        return this.snoreSumNum;
    }

    public float getSnoreSumTime() {
        return this.snoreSumTime;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getType() {
        return this.type;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setDimColor(int i) {
        this.dimColor = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setSnoreMaxDb(float f) {
        this.snoreMaxDb = f;
    }

    public void setSnoreMeanDb(float f) {
        this.snoreMeanDb = f;
    }

    public void setSnoreSumNum(float f) {
        this.snoreSumNum = f;
    }

    public void setSnoreSumTime(float f) {
        this.snoreSumTime = f;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "SnoreLevelData{level=" + this.level + ", snoreSumTime=" + this.snoreSumTime + ", snoreSumNum=" + this.snoreSumNum + ", snoreMeanDb=" + this.snoreMeanDb + ", snoreMaxDb=" + this.snoreMaxDb + ", timestamp=" + ((Object) DateFormat.format("yyyy-MM-dd HH:mm:ss", new Date(this.timestamp))) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.level);
        parcel.writeFloat(this.snoreSumTime);
        parcel.writeFloat(this.snoreSumNum);
        parcel.writeFloat(this.snoreMeanDb);
        parcel.writeFloat(this.snoreMaxDb);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.type);
        parcel.writeInt(this.color);
        parcel.writeInt(this.dimColor);
    }

    public SnoreLevelData(Parcel parcel) {
        this.type = 0;
        this.level = parcel.readInt();
        this.snoreSumTime = parcel.readFloat();
        this.snoreSumNum = parcel.readFloat();
        this.snoreMeanDb = parcel.readFloat();
        this.snoreMaxDb = parcel.readFloat();
        this.timestamp = parcel.readLong();
        this.type = parcel.readInt();
        this.color = parcel.readInt();
        this.dimColor = parcel.readInt();
    }
}
