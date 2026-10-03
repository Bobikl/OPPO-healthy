package com.heytap.databaseengine.model.atrialfibril;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AtrialFibrilWarn extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<AtrialFibrilWarn> CREATOR = new a();
    private int atrialFibrilStatus;
    private String clientDataId;
    private long dataCreatedTimestamp;
    private String deviceUniqueId;
    private String metadata;
    private int reliability;
    private String ssoid;
    private int syncStatus;
    private int warnFlag;

    public class a implements Parcelable.Creator<AtrialFibrilWarn> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtrialFibrilWarn createFromParcel(Parcel parcel) {
            return new AtrialFibrilWarn(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AtrialFibrilWarn[] newArray(int i) {
            return new AtrialFibrilWarn[i];
        }
    }

    public AtrialFibrilWarn() {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.warnFlag = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAtrialFibrilStatus() {
        return this.atrialFibrilStatus;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public int getReliability() {
        return this.reliability;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public int getWarnFlag() {
        return this.warnFlag;
    }

    public void setAtrialFibrilStatus(int i) {
        this.atrialFibrilStatus = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setMetadata(String str) {
        this.metadata = str;
    }

    public void setReliability(int i) {
        this.reliability = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setWarnFlag(int i) {
        this.warnFlag = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "AtrialFibrilWarn{clientDataId='" + this.clientDataId + "', ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", atrialFibrilStatus=" + this.atrialFibrilStatus + ", reliability=" + this.reliability + ", warnFlag=" + this.warnFlag + ", metadata='" + this.metadata + "', syncStatus=" + this.syncStatus + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.atrialFibrilStatus);
        parcel.writeInt(this.reliability);
        parcel.writeInt(this.warnFlag);
        parcel.writeString(this.metadata);
        parcel.writeInt(this.syncStatus);
    }

    public AtrialFibrilWarn(Parcel parcel) {
        this.ssoid = "";
        this.deviceUniqueId = "";
        this.warnFlag = 0;
        this.clientDataId = parcel.readString();
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.ssoid = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.deviceUniqueId = string2;
        this.dataCreatedTimestamp = parcel.readLong();
        this.atrialFibrilStatus = parcel.readInt();
        this.reliability = parcel.readInt();
        this.warnFlag = parcel.readInt();
        this.metadata = parcel.readString();
        this.syncStatus = parcel.readInt();
    }
}
