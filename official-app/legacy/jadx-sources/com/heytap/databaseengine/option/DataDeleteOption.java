package com.heytap.databaseengine.option;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class DataDeleteOption implements Parcelable {
    public static final Parcelable.Creator<DataDeleteOption> CREATOR = new a();
    private String clientDataId;
    private int dataTable;
    private String deviceUniqueId;
    private long endTime;
    private int sportMode;
    private String ssoid;
    private long startTime;
    private List<String> weightIdList;
    private String weightUserTagId;

    public class a implements Parcelable.Creator<DataDeleteOption> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataDeleteOption createFromParcel(Parcel parcel) {
            return new DataDeleteOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataDeleteOption[] newArray(int i) {
            return new DataDeleteOption[i];
        }
    }

    public DataDeleteOption() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public int getDataTable() {
        return this.dataTable;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public List<String> getWeightIdList() {
        return this.weightIdList;
    }

    public String getWeightUserTagId() {
        return this.weightUserTagId;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDataTable(int i) {
        this.dataTable = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setWeightIdList(List<String> list) {
        this.weightIdList = list;
    }

    public void setWeightUserTagId(String str) {
        this.weightUserTagId = str;
    }

    public String toString() {
        return "DataDeleteOption{ssoid='" + this.ssoid + "', clientDataId='" + this.clientDataId + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", sportMode=" + this.sportMode + ", dataTable=" + this.dataTable + ", deviceUniqueId='" + this.deviceUniqueId + "', weightUserTagId='" + this.weightUserTagId + "', weightIdList=" + this.weightIdList + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.clientDataId);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.dataTable);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.weightUserTagId);
        parcel.writeStringList(this.weightIdList);
    }

    public DataDeleteOption(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.clientDataId = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.sportMode = parcel.readInt();
        this.dataTable = parcel.readInt();
        this.deviceUniqueId = parcel.readString();
        this.weightUserTagId = parcel.readString();
        this.weightIdList = parcel.createStringArrayList();
    }
}
