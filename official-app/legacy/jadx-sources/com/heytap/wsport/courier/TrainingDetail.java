package com.heytap.wsport.courier;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class TrainingDetail implements Parcelable {
    public static final Parcelable.Creator<TrainingDetail> CREATOR = new a();
    private int distance;
    private int duration;
    private int index;
    private float speed;
    private float speed_max;
    private float speed_min;
    private String type;

    public class a implements Parcelable.Creator<TrainingDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainingDetail createFromParcel(Parcel parcel) {
            return new TrainingDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrainingDetail[] newArray(int i) {
            return new TrainingDetail[i];
        }
    }

    public TrainingDetail() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getIndex() {
        return this.index;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getSpeed_max() {
        return this.speed_max;
    }

    public float getSpeed_min() {
        return this.speed_min;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "TrainingDetail{index=" + this.index + ", speed_min=" + this.speed_min + ", speed_max=" + this.speed_max + ", speed=" + this.speed + ", type='" + this.type + "', distance=" + this.distance + ", duration=" + this.duration + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeFloat(this.speed_min);
        parcel.writeFloat(this.speed_max);
        parcel.writeFloat(this.speed);
        parcel.writeString(this.type);
        parcel.writeInt(this.distance);
        parcel.writeInt(this.duration);
    }

    public TrainingDetail(Parcel parcel) {
        this.index = parcel.readInt();
        this.speed_min = parcel.readFloat();
        this.speed_max = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.type = parcel.readString();
        this.distance = parcel.readInt();
        this.duration = parcel.readInt();
    }
}
