package com.heytap.databaseengine.model.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class OsaResultBean extends SportHealthData implements Parcelable {
    public static final Parcelable.Creator<OsaResultBean> CREATOR = new a();
    private Float ahi;
    private int date;
    private String extension;
    private long firstHrvTime;
    private long firstSleepTime;
    private long firstSnoreInfoTime;
    private long firstSpo2Time;
    private int fromType;
    private int invalidSpo2Ratio;
    private long lastHrvTime;
    private long lastSleepTime;
    private long lastSnoreInfoTime;
    private long lastSpo2Time;
    private OsaExtensionBean osaExtensionBean;
    private List<Float> osaFeature;
    private byte osaLevel;
    private List<SnoreRecordTimeInterval> recordTimeInterval;
    private int silencedRatio;
    private int silencedTime;
    private int sleepBreathType;
    private List<String> snoreFileDataIdList;
    private int snoreRatio;
    private SnoreResultBean snoreResultBean;
    private String ssoid;
    private int syncStatus;
    private String timezone;
    private List<TypicalFragmentBean> typicalFragmentBeanList;
    private byte typicalFragmentNum;
    private int version;

    public class a implements Parcelable.Creator<OsaResultBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OsaResultBean createFromParcel(Parcel parcel) {
            return new OsaResultBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OsaResultBean[] newArray(int i) {
            return new OsaResultBean[i];
        }
    }

    public OsaResultBean() {
        this.typicalFragmentBeanList = new CopyOnWriteArrayList();
        this.syncStatus = 0;
        this.version = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Float getAhi() {
        return this.ahi;
    }

    public int getDate() {
        return this.date;
    }

    public String getExtension() {
        return this.extension;
    }

    public long getFirstHrvTime() {
        return this.firstHrvTime;
    }

    public long getFirstSleepTime() {
        return this.firstSleepTime;
    }

    public long getFirstSnoreInfoTime() {
        return this.firstSnoreInfoTime;
    }

    public long getFirstSpo2Time() {
        return this.firstSpo2Time;
    }

    public int getFromType() {
        return this.fromType;
    }

    public int getInvalidSpo2Ratio() {
        return this.invalidSpo2Ratio;
    }

    public long getLastHrvTime() {
        return this.lastHrvTime;
    }

    public long getLastSleepTime() {
        return this.lastSleepTime;
    }

    public long getLastSnoreInfoTime() {
        return this.lastSnoreInfoTime;
    }

    public long getLastSpo2Time() {
        return this.lastSpo2Time;
    }

    public OsaExtensionBean getOsaExtensionBean() {
        return this.osaExtensionBean;
    }

    public List<Float> getOsaFeature() {
        return this.osaFeature;
    }

    public byte getOsaLevel() {
        return this.osaLevel;
    }

    public List<SnoreRecordTimeInterval> getRecordTimeInterval() {
        return this.recordTimeInterval;
    }

    public int getSilencedRatio() {
        return this.silencedRatio;
    }

    public int getSilencedTime() {
        return this.silencedTime;
    }

    public int getSleepBreathType() {
        return this.sleepBreathType;
    }

    public List<String> getSnoreFileDataIdList() {
        return this.snoreFileDataIdList;
    }

    public int getSnoreRatio() {
        return this.snoreRatio;
    }

    public SnoreResultBean getSnoreResultBean() {
        return this.snoreResultBean;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String getSsoid() {
        return this.ssoid;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public List<TypicalFragmentBean> getTypicalFragmentBeanList() {
        return this.typicalFragmentBeanList;
    }

    public byte getTypicalFragmentNum() {
        return this.typicalFragmentNum;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAhi(Float f) {
        this.ahi = f;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFirstHrvTime(long j2) {
        this.firstHrvTime = j2;
    }

    public void setFirstSleepTime(long j2) {
        this.firstSleepTime = j2;
    }

    public void setFirstSnoreInfoTime(long j2) {
        this.firstSnoreInfoTime = j2;
    }

    public void setFirstSpo2Time(long j2) {
        this.firstSpo2Time = j2;
    }

    public void setFromType(int i) {
        this.fromType = i;
    }

    public void setInvalidSpo2Ratio(int i) {
        this.invalidSpo2Ratio = i;
    }

    public void setLastHrvTime(long j2) {
        this.lastHrvTime = j2;
    }

    public void setLastSleepTime(long j2) {
        this.lastSleepTime = j2;
    }

    public void setLastSnoreInfoTime(long j2) {
        this.lastSnoreInfoTime = j2;
    }

    public void setLastSpo2Time(long j2) {
        this.lastSpo2Time = j2;
    }

    public void setOsaExtensionBean(OsaExtensionBean osaExtensionBean) {
        this.osaExtensionBean = osaExtensionBean;
    }

    public void setOsaFeature(List<Float> list) {
        this.osaFeature = list;
    }

    public void setOsaLevel(byte b) {
        this.osaLevel = b;
    }

    public void setRecordTimeInterval(List<SnoreRecordTimeInterval> list) {
        this.recordTimeInterval = list;
    }

    public void setSilencedRatio(int i) {
        this.silencedRatio = i;
    }

    public void setSilencedTime(int i) {
        this.silencedTime = i;
    }

    public void setSleepBreathType(int i) {
        this.sleepBreathType = i;
    }

    public void setSnoreFileDataIdList(List<String> list) {
        this.snoreFileDataIdList = list;
    }

    public void setSnoreRatio(int i) {
        this.snoreRatio = i;
    }

    public void setSnoreResultBean(SnoreResultBean snoreResultBean) {
        this.snoreResultBean = snoreResultBean;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setTypicalFragmentBeanList(List<TypicalFragmentBean> list) {
        this.typicalFragmentBeanList = list;
    }

    public void setTypicalFragmentNum(byte b) {
        this.typicalFragmentNum = b;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public String toString() {
        return "OsaResultBean{, date=" + this.date + ", timezone='" + this.timezone + "', osaLevel=" + ((int) this.osaLevel) + ", osaExtensionBean='" + this.osaExtensionBean + "', firstSleepTime=" + this.firstSleepTime + ", lastSleepTime=" + this.lastSleepTime + ", firstSpo2Time=" + this.firstSpo2Time + ", lastSpo2Time=" + this.lastSpo2Time + ", firstHrvTime=" + this.firstHrvTime + ", lastHrvTime=" + this.lastHrvTime + ", firstSnoreInfoTime=" + this.firstSnoreInfoTime + ", lastSnoreInfoTime=" + this.lastSnoreInfoTime + ", recordTimeInterval=" + this.recordTimeInterval + ", ahi=" + this.ahi + ", fromType=" + this.fromType + ", snoreResultBean=" + this.snoreResultBean + ", typicalFragmentBeanList=" + this.typicalFragmentBeanList + ", typicalFragmentNum=" + ((int) this.typicalFragmentNum) + ", osaFeature=" + this.osaFeature + ", sleepBreathType=" + this.sleepBreathType + ", invalidSpo2Ratio=" + this.invalidSpo2Ratio + ", snoreRatio=" + this.snoreRatio + ", extension='" + this.extension + "', syncStatus=" + this.syncStatus + ", version=" + this.version + ", snoreFileDataIdList=" + this.snoreFileDataIdList + ", silencedRatio=" + this.silencedRatio + ", silencedTime=" + this.silencedTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeLong(this.firstSleepTime);
        parcel.writeLong(this.lastSleepTime);
        parcel.writeLong(this.firstSpo2Time);
        parcel.writeLong(this.lastSpo2Time);
        parcel.writeLong(this.firstHrvTime);
        parcel.writeLong(this.lastHrvTime);
        parcel.writeLong(this.firstSnoreInfoTime);
        parcel.writeLong(this.lastSnoreInfoTime);
        parcel.writeTypedList(this.recordTimeInterval);
        parcel.writeByte(this.osaLevel);
        parcel.writeParcelable(this.snoreResultBean, i);
        parcel.writeTypedList(this.typicalFragmentBeanList);
        parcel.writeByte(this.typicalFragmentNum);
        parcel.writeList(this.osaFeature);
        parcel.writeInt(this.sleepBreathType);
        parcel.writeInt(this.invalidSpo2Ratio);
        parcel.writeInt(this.snoreRatio);
        parcel.writeString(this.extension);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.version);
        parcel.writeStringList(this.snoreFileDataIdList);
        parcel.writeValue(this.ahi);
        parcel.writeInt(this.fromType);
        parcel.writeInt(this.silencedRatio);
        parcel.writeInt(this.silencedTime);
    }

    public OsaResultBean(Parcel parcel) {
        this.typicalFragmentBeanList = new CopyOnWriteArrayList();
        this.syncStatus = 0;
        this.version = 0;
        this.ssoid = parcel.readString();
        this.date = parcel.readInt();
        this.timezone = parcel.readString();
        this.firstSleepTime = parcel.readLong();
        this.lastSleepTime = parcel.readLong();
        this.firstSpo2Time = parcel.readLong();
        this.lastSpo2Time = parcel.readLong();
        this.firstHrvTime = parcel.readLong();
        this.lastHrvTime = parcel.readLong();
        this.firstSnoreInfoTime = parcel.readLong();
        this.lastSnoreInfoTime = parcel.readLong();
        this.recordTimeInterval = parcel.createTypedArrayList(SnoreRecordTimeInterval.CREATOR);
        this.osaLevel = parcel.readByte();
        this.snoreResultBean = (SnoreResultBean) parcel.readParcelable(SnoreResultBean.class.getClassLoader());
        this.typicalFragmentBeanList = parcel.createTypedArrayList(TypicalFragmentBean.CREATOR);
        this.typicalFragmentNum = parcel.readByte();
        ArrayList arrayList = new ArrayList();
        this.osaFeature = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.sleepBreathType = parcel.readInt();
        this.invalidSpo2Ratio = parcel.readInt();
        this.snoreRatio = parcel.readInt();
        this.extension = parcel.readString();
        this.syncStatus = parcel.readInt();
        this.version = parcel.readInt();
        this.snoreFileDataIdList = parcel.createStringArrayList();
        this.ahi = (Float) parcel.readValue(Float.class.getClassLoader());
        this.fromType = parcel.readInt();
        this.silencedRatio = parcel.readInt();
        this.silencedTime = parcel.readInt();
    }
}
