package com.heytap.databaseengine.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.oplus.aiunit.vision.sc8;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class OneTimeSport extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<OneTimeSport> CREATOR = new a();
    private String clientDataId;
    private ContentValues contentValues;
    private String data;
    private String deviceType;
    private String deviceUniqueId;
    private int display;
    private long endTimestamp;
    private String metaData;
    private int source;
    private int sportMode;
    private String ssoid;
    private long startTimestamp;
    private int syncStatus;
    private String timezone;
    private int version;

    public class a implements Parcelable.Creator<OneTimeSport> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OneTimeSport createFromParcel(Parcel parcel) {
            return new OneTimeSport(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OneTimeSport[] newArray(int i) {
            return new OneTimeSport[i];
        }
    }

    public OneTimeSport(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.clientDataId = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceType = parcel.readString();
        this.startTimestamp = parcel.readLong();
        this.endTimestamp = parcel.readLong();
        this.sportMode = parcel.readInt();
        this.source = parcel.readInt();
        this.data = parcel.readString();
        this.version = parcel.readInt();
        this.metaData = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.timezone = parcel.readString();
        this.contentValues = (ContentValues) parcel.readParcelable(ContentValues.class.getClassLoader());
        this.display = parcel.readInt();
    }

    public OneTimeSport copyData() {
        OneTimeSport oneTimeSport = new OneTimeSport();
        oneTimeSport.setSsoid(this.ssoid);
        oneTimeSport.setClientDataId(this.clientDataId);
        oneTimeSport.setDeviceUniqueId(this.deviceUniqueId);
        oneTimeSport.setDeviceType(this.deviceType);
        oneTimeSport.setStartTimestamp(this.startTimestamp);
        oneTimeSport.setEndTimestamp(this.endTimestamp);
        oneTimeSport.setSportMode(this.sportMode);
        oneTimeSport.setSource(this.source);
        oneTimeSport.setData(this.data);
        oneTimeSport.setVersion(this.version);
        oneTimeSport.setMetaData(this.metaData);
        oneTimeSport.setSyncStatus(this.syncStatus);
        oneTimeSport.setTimezone(this.timezone);
        oneTimeSport.setContentValues(new ContentValues(this.contentValues));
        oneTimeSport.setDisplay(this.display);
        return oneTimeSport;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getBoolean(String str) {
        Boolean asBoolean = this.contentValues.getAsBoolean(str);
        if (asBoolean == null) {
            return false;
        }
        return asBoolean.booleanValue();
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getData() {
        return this.data;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getMetaData() {
        return this.metaData;
    }

    public int getSource() {
        return this.source;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isTreadmill() {
        try {
            RunExtra runExtra = (RunExtra) sc8.a(((TrackMetaData) new Gson().fromJson(getMetaData(), TrackMetaData.class)).getRunExtra(), RunExtra.class);
            return runExtra != null && runExtra.getDataSource() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    public void putBoolean(String str, boolean z) {
        this.contentValues.put(str, Boolean.valueOf(z));
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setContentValues(ContentValues contentValues) {
        this.contentValues = contentValues;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setDisplay(int i) {
        this.display = i;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setMetaData(String str) {
        this.metaData = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "OneTimeSport{ssoid='" + this.ssoid + "', clientDataId='" + this.clientDataId + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceCategory='" + this.deviceType + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sportMode=" + this.sportMode + ", source=" + this.source + ", data='" + this.data + "', version=" + this.version + ", metaData='" + this.metaData + "', syncStatus=" + this.syncStatus + ", timezone='" + this.timezone + "', contentValues=" + this.contentValues + ", display=" + this.display + "} ";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceType);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.source);
        parcel.writeString(this.data);
        parcel.writeInt(this.version);
        parcel.writeString(this.metaData);
        parcel.writeInt(this.syncStatus);
        parcel.writeString(this.timezone);
        parcel.writeParcelable(this.contentValues, i);
        parcel.writeInt(this.display);
    }

    public OneTimeSport() {
        this.contentValues = new ContentValues();
    }
}
