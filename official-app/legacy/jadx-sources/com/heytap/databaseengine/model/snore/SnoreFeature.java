package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SnoreFeature extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<SnoreFeature> CREATOR = new a();
    private String deviceId;
    private String deviceUniqueId;
    private List<Float> features;
    private Long recordEndTimestamp;
    private Long recordStartTimestamp;
    private long snoreEndTimestamp;
    private long snoreStartTimestamp;
    private String ssoid;

    public class a implements Parcelable.Creator<SnoreFeature> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnoreFeature createFromParcel(Parcel parcel) {
            return new SnoreFeature(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnoreFeature[] newArray(int i) {
            return new SnoreFeature[i];
        }
    }

    public SnoreFeature() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public List<Float> getFeatures() {
        return this.features;
    }

    public Long getRecordEndTimestamp() {
        return this.recordEndTimestamp;
    }

    public Long getRecordStartTimestamp() {
        return this.recordStartTimestamp;
    }

    public long getSnoreEndTimestamp() {
        return this.snoreEndTimestamp;
    }

    public long getSnoreStartTimestamp() {
        return this.snoreStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setFeatures(List<Float> list) {
        this.features = list;
    }

    public void setRecordEndTimestamp(Long l2) {
        this.recordEndTimestamp = l2;
    }

    public void setRecordStartTimestamp(Long l2) {
        this.recordStartTimestamp = l2;
    }

    public void setSnoreEndTimestamp(long j2) {
        this.snoreEndTimestamp = j2;
    }

    public void setSnoreStartTimestamp(long j2) {
        this.snoreStartTimestamp = j2;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "SnoreFeature{ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', deviceId='" + this.deviceId + "', recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", snoreStartTimestamp=" + this.snoreStartTimestamp + ", snoreEndTimestamp=" + this.snoreEndTimestamp + ", features=" + this.features + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.deviceId);
        parcel.writeValue(this.recordStartTimestamp);
        parcel.writeValue(this.recordEndTimestamp);
        parcel.writeLong(this.snoreStartTimestamp);
        parcel.writeLong(this.snoreEndTimestamp);
        parcel.writeList(this.features);
    }

    public SnoreFeature(Parcel parcel) {
        this.ssoid = parcel.readString();
        this.deviceUniqueId = parcel.readString();
        this.deviceId = parcel.readString();
        this.recordStartTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.recordEndTimestamp = (Long) parcel.readValue(Long.class.getClassLoader());
        this.snoreStartTimestamp = parcel.readLong();
        this.snoreEndTimestamp = parcel.readLong();
        ArrayList arrayList = new ArrayList();
        this.features = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
    }
}
