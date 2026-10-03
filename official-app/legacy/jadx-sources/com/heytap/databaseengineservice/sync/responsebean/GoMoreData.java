package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class GoMoreData implements Parcelable {
    public static final Parcelable.Creator<GoMoreData> CREATOR = new a();
    private String checksum;
    private String checksum_01;
    private int heartrate_max;
    private String prev_aerobic_ptc;
    private String prev_anaerobic_ptc;
    private float stamina_level;
    private String type_id;

    public class a implements Parcelable.Creator<GoMoreData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GoMoreData createFromParcel(Parcel parcel) {
            return new GoMoreData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GoMoreData[] newArray(int i) {
            return new GoMoreData[i];
        }
    }

    public GoMoreData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public String getChecksum_01() {
        return this.checksum_01;
    }

    public int getHeartrate_max() {
        return this.heartrate_max;
    }

    public String getPrev_aerobic_ptc() {
        return this.prev_aerobic_ptc;
    }

    public String getPrev_anaerobic_ptc() {
        return this.prev_anaerobic_ptc;
    }

    public float getStamina_level() {
        return this.stamina_level;
    }

    public String getType_id() {
        return this.type_id;
    }

    public void setChecksum(String str) {
        this.checksum = str;
    }

    public void setChecksum_01(String str) {
        this.checksum_01 = str;
    }

    public void setHeartrate_max(int i) {
        this.heartrate_max = i;
    }

    public void setPrev_aerobic_ptc(String str) {
        this.prev_aerobic_ptc = str;
    }

    public void setPrev_anaerobic_ptc(String str) {
        this.prev_anaerobic_ptc = str;
    }

    public void setStamina_level(float f) {
        this.stamina_level = f;
    }

    public void setType_id(String str) {
        this.type_id = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type_id);
        parcel.writeInt(this.heartrate_max);
        parcel.writeString(this.checksum);
        parcel.writeFloat(this.stamina_level);
        parcel.writeString(this.prev_aerobic_ptc);
        parcel.writeString(this.prev_anaerobic_ptc);
        parcel.writeString(this.checksum_01);
    }

    public GoMoreData(Parcel parcel) {
        this.type_id = parcel.readString();
        this.heartrate_max = parcel.readInt();
        this.checksum = parcel.readString();
        this.stamina_level = parcel.readFloat();
        this.prev_aerobic_ptc = parcel.readString();
        this.prev_anaerobic_ptc = parcel.readString();
        this.checksum_01 = parcel.readString();
    }
}
