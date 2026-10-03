package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.oplus.aiunit.vision.t04;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001:\u0001tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010s\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001a\u0010'\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u00100\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001a\u00103\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001a\u00106\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u001a\u00109\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR$\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR\u001a\u0010E\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR\u001a\u0010H\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR\u001a\u0010K\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR\u001c\u0010N\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0014R$\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010R\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010?\"\u0004\bT\u0010AR\u001a\u0010U\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\f\"\u0004\bW\u0010\u000eR\u001a\u0010X\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR\u001c\u0010[\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0012\"\u0004\b]\u0010\u0014R\u001c\u0010^\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0012\"\u0004\b`\u0010\u0014R\u001a\u0010a\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010\u000eR\u001c\u0010d\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0012\"\u0004\bf\u0010\u0014R\u001c\u0010g\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0012\"\u0004\bi\u0010\u0014R\u001a\u0010j\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\f\"\u0004\bl\u0010\u000eR\u001a\u0010m\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\f\"\u0004\bo\u0010\u000eR\u001a\u0010p\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\f\"\u0004\br\u0010\u000e¨\u0006u"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/OsaResultPOJO;", "", "()V", "ahi", "", "getAhi", "()D", "setAhi", "(D)V", "date", "", "getDate", "()I", "setDate", "(I)V", t04.DEVICE_UNIQUE_ID, "", "getDeviceUniqueId", "()Ljava/lang/String;", "setDeviceUniqueId", "(Ljava/lang/String;)V", DBSportMetadata.EXTENSION, "getExtension", "setExtension", "firstHrvTime", "", "getFirstHrvTime", "()J", "setFirstHrvTime", "(J)V", "firstSleepTime", "getFirstSleepTime", "setFirstSleepTime", "firstSnoreInfoTime", "getFirstSnoreInfoTime", "setFirstSnoreInfoTime", "firstSpo2Time", "getFirstSpo2Time", "setFirstSpo2Time", "fromType", "getFromType", "setFromType", "invalidSpo2ratio", "getInvalidSpo2ratio", "setInvalidSpo2ratio", "lastHrvTime", "getLastHrvTime", "setLastHrvTime", "lastSleepTime", "getLastSleepTime", "setLastSleepTime", "lastSnoreInfoTime", "getLastSnoreInfoTime", "setLastSnoreInfoTime", "lastSpo2Time", "getLastSpo2Time", "setLastSpo2Time", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "osaFeatureList", "", "getOsaFeatureList", "()Ljava/util/List;", "setOsaFeatureList", "(Ljava/util/List;)V", "osaLevel", "getOsaLevel", "setOsaLevel", "silencedRatio", "getSilencedRatio", "setSilencedRatio", "silencedTime", "getSilencedTime", "setSilencedTime", "sleepBreathType", "getSleepBreathType", "setSleepBreathType", "snoreFileDataIdList", "getSnoreFileDataIdList", "setSnoreFileDataIdList", "snoreOperationTimeList", "Lcom/heytap/databaseengineservice/sync/responsebean/OsaResultPOJO$SnoreOperationTimeListBean;", "getSnoreOperationTimeList", "setSnoreOperationTimeList", "snoreParamType", "getSnoreParamType", "setSnoreParamType", "snoreRatio", "getSnoreRatio", "setSnoreRatio", "snoreResultBean", "getSnoreResultBean", "setSnoreResultBean", "ssoid", "getSsoid", "setSsoid", "syncStatus", "getSyncStatus", "setSyncStatus", ConnectIdLogic.PARAM_TIMEZONE, "getTimeZone", "setTimeZone", "typicalFragmentBeanList", "getTypicalFragmentBeanList", "setTypicalFragmentBeanList", "typicalFragmentNum", "getTypicalFragmentNum", "setTypicalFragmentNum", "updated", "getUpdated", "setUpdated", "version", "getVersion", "setVersion", "toString", "SnoreOperationTimeListBean", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OsaResultPOJO {
    private double ahi;
    private int date;

    @Nullable
    private String deviceUniqueId;

    @Nullable
    private String extension;
    private long firstHrvTime;
    private long firstSleepTime;
    private long firstSnoreInfoTime;
    private long firstSpo2Time;
    private int fromType;
    private int invalidSpo2ratio;
    private long lastHrvTime;
    private long lastSleepTime;
    private long lastSnoreInfoTime;
    private long lastSpo2Time;
    private long modifiedTimestamp;

    @Nullable
    private List<Double> osaFeatureList;
    private int osaLevel;
    private int silencedRatio;
    private int silencedTime;
    private int sleepBreathType;

    @Nullable
    private String snoreFileDataIdList;

    @Nullable
    private List<SnoreOperationTimeListBean> snoreOperationTimeList;
    private int snoreParamType;
    private int snoreRatio;

    @Nullable
    private String snoreResultBean;

    @Nullable
    private String ssoid;
    private int syncStatus;

    @Nullable
    private String timeZone;

    @Nullable
    private String typicalFragmentBeanList;
    private int typicalFragmentNum;
    private int updated;
    private int version;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/OsaResultPOJO$SnoreOperationTimeListBean;", "", "()V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "startTime", "getStartTime", "setStartTime", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SnoreOperationTimeListBean {
        private long endTime;
        private long startTime;

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final void setEndTime(long j2) {
            this.endTime = j2;
        }

        public final void setStartTime(long j2) {
            this.startTime = j2;
        }

        @NotNull
        public String toString() {
            return "SnoreOperationTimeListBean(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        }
    }

    public final double getAhi() {
        return this.ahi;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    public final long getFirstHrvTime() {
        return this.firstHrvTime;
    }

    public final long getFirstSleepTime() {
        return this.firstSleepTime;
    }

    public final long getFirstSnoreInfoTime() {
        return this.firstSnoreInfoTime;
    }

    public final long getFirstSpo2Time() {
        return this.firstSpo2Time;
    }

    public final int getFromType() {
        return this.fromType;
    }

    public final int getInvalidSpo2ratio() {
        return this.invalidSpo2ratio;
    }

    public final long getLastHrvTime() {
        return this.lastHrvTime;
    }

    public final long getLastSleepTime() {
        return this.lastSleepTime;
    }

    public final long getLastSnoreInfoTime() {
        return this.lastSnoreInfoTime;
    }

    public final long getLastSpo2Time() {
        return this.lastSpo2Time;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final List<Double> getOsaFeatureList() {
        return this.osaFeatureList;
    }

    public final int getOsaLevel() {
        return this.osaLevel;
    }

    public final int getSilencedRatio() {
        return this.silencedRatio;
    }

    public final int getSilencedTime() {
        return this.silencedTime;
    }

    public final int getSleepBreathType() {
        return this.sleepBreathType;
    }

    @Nullable
    public final String getSnoreFileDataIdList() {
        return this.snoreFileDataIdList;
    }

    @Nullable
    public final List<SnoreOperationTimeListBean> getSnoreOperationTimeList() {
        return this.snoreOperationTimeList;
    }

    public final int getSnoreParamType() {
        return this.snoreParamType;
    }

    public final int getSnoreRatio() {
        return this.snoreRatio;
    }

    @Nullable
    public final String getSnoreResultBean() {
        return this.snoreResultBean;
    }

    @Nullable
    public final String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @Nullable
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    public final String getTypicalFragmentBeanList() {
        return this.typicalFragmentBeanList;
    }

    public final int getTypicalFragmentNum() {
        return this.typicalFragmentNum;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setAhi(double d) {
        this.ahi = d;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceUniqueId(@Nullable String str) {
        this.deviceUniqueId = str;
    }

    public final void setExtension(@Nullable String str) {
        this.extension = str;
    }

    public final void setFirstHrvTime(long j2) {
        this.firstHrvTime = j2;
    }

    public final void setFirstSleepTime(long j2) {
        this.firstSleepTime = j2;
    }

    public final void setFirstSnoreInfoTime(long j2) {
        this.firstSnoreInfoTime = j2;
    }

    public final void setFirstSpo2Time(long j2) {
        this.firstSpo2Time = j2;
    }

    public final void setFromType(int i) {
        this.fromType = i;
    }

    public final void setInvalidSpo2ratio(int i) {
        this.invalidSpo2ratio = i;
    }

    public final void setLastHrvTime(long j2) {
        this.lastHrvTime = j2;
    }

    public final void setLastSleepTime(long j2) {
        this.lastSleepTime = j2;
    }

    public final void setLastSnoreInfoTime(long j2) {
        this.lastSnoreInfoTime = j2;
    }

    public final void setLastSpo2Time(long j2) {
        this.lastSpo2Time = j2;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOsaFeatureList(@Nullable List<Double> list) {
        this.osaFeatureList = list;
    }

    public final void setOsaLevel(int i) {
        this.osaLevel = i;
    }

    public final void setSilencedRatio(int i) {
        this.silencedRatio = i;
    }

    public final void setSilencedTime(int i) {
        this.silencedTime = i;
    }

    public final void setSleepBreathType(int i) {
        this.sleepBreathType = i;
    }

    public final void setSnoreFileDataIdList(@Nullable String str) {
        this.snoreFileDataIdList = str;
    }

    public final void setSnoreOperationTimeList(@Nullable List<SnoreOperationTimeListBean> list) {
        this.snoreOperationTimeList = list;
    }

    public final void setSnoreParamType(int i) {
        this.snoreParamType = i;
    }

    public final void setSnoreRatio(int i) {
        this.snoreRatio = i;
    }

    public final void setSnoreResultBean(@Nullable String str) {
        this.snoreResultBean = str;
    }

    public final void setSsoid(@Nullable String str) {
        this.ssoid = str;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTimeZone(@Nullable String str) {
        this.timeZone = str;
    }

    public final void setTypicalFragmentBeanList(@Nullable String str) {
        this.typicalFragmentBeanList = str;
    }

    public final void setTypicalFragmentNum(int i) {
        this.typicalFragmentNum = i;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        return "OsaResultPOJO(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", date=" + this.date + ", snoreFileDataIdList=" + this.snoreFileDataIdList + ", osaLevel=" + this.osaLevel + ", timeZone=" + this.timeZone + ", firstSleepTime=" + this.firstSleepTime + ", lastSleepTime=" + this.lastSleepTime + ", firstSpo2Time=" + this.firstSpo2Time + ", lastSpo2Time=" + this.lastSpo2Time + ", firstHrvTime=" + this.firstHrvTime + ", lastHrvTime=" + this.lastHrvTime + ", firstSnoreInfoTime=" + this.firstSnoreInfoTime + ", lastSnoreInfoTime=" + this.lastSnoreInfoTime + ", snoreResultBean=" + this.snoreResultBean + ", typicalFragmentBeanList=" + this.typicalFragmentBeanList + ", typicalFragmentNum=" + this.typicalFragmentNum + ", osaFeatureList=" + this.osaFeatureList + ", sleepBreathType=" + this.sleepBreathType + ", invalidSpo2ratio=" + this.invalidSpo2ratio + ", snoreRatio=" + this.snoreRatio + ", snoreParamType=" + this.snoreParamType + ", extension=" + this.extension + ", version=" + this.version + ", updated=" + this.updated + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", snoreOperationTimeList=" + this.snoreOperationTimeList + ", ahi=" + this.ahi + ", fromType=" + this.fromType + ", silencedRatio=" + this.silencedRatio + ", silencedTime=" + this.silencedTime + ")";
    }
}
