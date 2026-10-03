package com.heytap.databaseengineservice.db.table.sleepdaystat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.oplus.aiunit.vision.t04;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b.\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001aBñ\u0001\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\b\b\u0002\u0010+\u001a\u00020\n\u0012\b\b\u0002\u0010.\u001a\u00020\n\u0012\b\b\u0002\u00101\u001a\u00020\n\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u0010;\u001a\u00020\n\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010F\u001a\u00020\n\u0012\b\b\u0002\u0010I\u001a\u00020\n\u0012\b\b\u0002\u0010L\u001a\u00020\n\u0012\b\b\u0002\u0010O\u001a\u00020\u0018\u0012\b\b\u0002\u0010R\u001a\u00020\u0018\u0012\b\b\u0002\u0010U\u001a\u00020\n\u0012\b\b\u0002\u0010X\u001a\u00020\u0018\u0012\b\b\u0002\u0010[\u001a\u00020\n¢\u0006\u0004\b^\u0010_J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\"\u0010%\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\"\u0010(\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\"\u0010.\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\"\u00101\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0013\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\"\u00105\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0013\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R$\u0010>\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0010\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0010\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\"\u0010F\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0013\u001a\u0004\bG\u0010\u0015\"\u0004\bH\u0010\u0017R\"\u0010I\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0013\u001a\u0004\bJ\u0010\u0015\"\u0004\bK\u0010\u0017R\"\u0010L\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0013\u001a\u0004\bM\u0010\u0015\"\u0004\bN\u0010\u0017R\"\u0010O\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001a\u001a\u0004\bP\u0010\u001c\"\u0004\bQ\u0010\u001eR\"\u0010R\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010\u001a\u001a\u0004\bS\u0010\u001c\"\u0004\bT\u0010\u001eR\"\u0010U\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010\u0013\u001a\u0004\bV\u0010\u0015\"\u0004\bW\u0010\u0017R\"\u0010X\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010\u001a\u001a\u0004\bY\u0010\u001c\"\u0004\bZ\u0010\u001eR\"\u0010[\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\u0013\u001a\u0004\b\\\u0010\u0015\"\u0004\b]\u0010\u0017¨\u0006b"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepDayStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "getDeviceUniqueId", "ssoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/String;", t04.DEVICE_UNIQUE_ID, "date", "I", "getDate", "()I", "setDate", "(I)V", "", "sleepInTime", "J", "getSleepInTime", "()J", "setSleepInTime", "(J)V", "sleepOutTime", "getSleepOutTime", "setSleepOutTime", "totalSleepTime", "getTotalSleepTime", "setTotalSleepTime", "totalDeepSleepTime", "getTotalDeepSleepTime", "setTotalDeepSleepTime", "totalLightlySleepTime", "getTotalLightlySleepTime", "setTotalLightlySleepTime", "totalREMSleepTime", "getTotalREMSleepTime", "setTotalREMSleepTime", "totalWakeTime", "getTotalWakeTime", "setTotalWakeTime", "wakeCount", "getWakeCount", "setWakeCount", "", "calibrated", "Z", "getCalibrated", "()Z", "setCalibrated", "(Z)V", "score", "getScore", "setScore", "sleepMainData", "getSleepMainData", "()Ljava/lang/String;", "setSleepMainData", "(Ljava/lang/String;)V", "sleepDayFrgDataList", "getSleepDayFrgDataList", "setSleepDayFrgDataList", "dataVersion", "getDataVersion", "setDataVersion", "source", "getSource", "setSource", "standardTime", "getStandardTime", "setStandardTime", "restInTime", "getRestInTime", "setRestInTime", "restOutTime", "getRestOutTime", "setRestOutTime", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "updated", "getUpdated", "setUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJJIIIIIIZILjava/lang/String;Ljava/lang/String;IIIJJIJI)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "date"}, tableName = "DBSleepDayStat")
public final class DBSleepDayStat extends SportHealthData implements Parcelable {

    @ColumnInfo(name = "calibrated")
    private boolean calibrated;

    @ColumnInfo(name = "data_version")
    private int dataVersion;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    @NotNull
    private String deviceUniqueId;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "rest_in_timestamp")
    private long restInTime;

    @ColumnInfo(name = "rest_out_timestamp")
    private long restOutTime;

    @ColumnInfo(name = Element.ELEMENT_NAME_SLEEP_SCORE)
    private int score;

    @ColumnInfo(name = "sleep_frg_data")
    @Nullable
    private String sleepDayFrgDataList;

    @ColumnInfo(name = "sleep_in_timestamp")
    private long sleepInTime;

    @ColumnInfo(name = "sleep_main_data")
    @Nullable
    private String sleepMainData;

    @ColumnInfo(name = "sleep_out_timestamp")
    private long sleepOutTime;

    @ColumnInfo(name = "source")
    private int source;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "standard_time")
    private int standardTime;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_DEEP_SLEEP_TIME)
    private int totalDeepSleepTime;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_LIGHTLY_SLEEP_TIME)
    private int totalLightlySleepTime;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_REM_TIME)
    private int totalREMSleepTime;

    @ColumnInfo(name = "total_sleep_time")
    private int totalSleepTime;

    @ColumnInfo(name = Element.ELEMENT_NAME_TOTAL_WAKE_UP_TIME)
    private int totalWakeTime;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = "wake_count")
    private int wakeCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSleepDayStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepDayStat$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepDayStat$a;", "", "", "a", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSleepDayStat(ssoid TEXT not null,device_unique_id TEXT not null,date INTEGER not null,sleep_in_timestamp INTEGER not null,sleep_out_timestamp INTEGER not null,total_sleep_time INTEGER not null,total_deep_sleep_time INTEGER not null,total_lightly_sleep_time INTEGER not null,total_rem_time INTEGER not null,total_wake_up_time INTEGER not null,wake_count INTEGER not null,calibrated INTEGER not null,sleep_score INTEGER not null,sleep_main_data TEXT,sleep_frg_data TEXT,data_version INTEGER not null,source INTEGER not null,standard_time INTEGER not null,rest_in_timestamp INTEGER not null,rest_out_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,updated INTEGER not null,primary key(ssoid,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSleepDayStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSleepDayStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSleepDayStat(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSleepDayStat[] newArray(int i) {
            return new DBSleepDayStat[i];
        }
    }

    public DBSleepDayStat() {
        this(null, null, 0, 0L, 0L, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, 0L, 0L, 0, 0L, 0, 8388607, null);
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getCalibrated() {
        return this.calibrated;
    }

    public final int getDataVersion() {
        return this.dataVersion;
    }

    public final int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getRestInTime() {
        return this.restInTime;
    }

    public final long getRestOutTime() {
        return this.restOutTime;
    }

    public final int getScore() {
        return this.score;
    }

    @Nullable
    public final String getSleepDayFrgDataList() {
        return this.sleepDayFrgDataList;
    }

    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    @Nullable
    public final String getSleepMainData() {
        return this.sleepMainData;
    }

    public final long getSleepOutTime() {
        return this.sleepOutTime;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getStandardTime() {
        return this.standardTime;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    public final int getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    public final int getTotalREMSleepTime() {
        return this.totalREMSleepTime;
    }

    public final int getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public final int getTotalWakeTime() {
        return this.totalWakeTime;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public final int getWakeCount() {
        return this.wakeCount;
    }

    public final void setCalibrated(boolean z) {
        this.calibrated = z;
    }

    public final void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setRestInTime(long j2) {
        this.restInTime = j2;
    }

    public final void setRestOutTime(long j2) {
        this.restOutTime = j2;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final void setSleepDayFrgDataList(@Nullable String str) {
        this.sleepDayFrgDataList = str;
    }

    public final void setSleepInTime(long j2) {
        this.sleepInTime = j2;
    }

    public final void setSleepMainData(@Nullable String str) {
        this.sleepMainData = str;
    }

    public final void setSleepOutTime(long j2) {
        this.sleepOutTime = j2;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setSsoid(@Nullable String ssoid) {
        if (ssoid == null) {
            ssoid = "";
        }
        this.ssoid = ssoid;
    }

    public final void setStandardTime(int i) {
        this.standardTime = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTotalDeepSleepTime(int i) {
        this.totalDeepSleepTime = i;
    }

    public final void setTotalLightlySleepTime(int i) {
        this.totalLightlySleepTime = i;
    }

    public final void setTotalREMSleepTime(int i) {
        this.totalREMSleepTime = i;
    }

    public final void setTotalSleepTime(int i) {
        this.totalSleepTime = i;
    }

    public final void setTotalWakeTime(int i) {
        this.totalWakeTime = i;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    public final void setWakeCount(int i) {
        this.wakeCount = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSleepDayStat(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", date=" + this.date + ", sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalREMSleepTime=" + this.totalREMSleepTime + ", totalWakeTime=" + this.totalWakeTime + ", wakeCount=" + this.wakeCount + ", calibrated=" + this.calibrated + ", score=" + this.score + ", sleepMainData=" + this.sleepMainData + ", sleepDayFrgDataList=" + this.sleepDayFrgDataList + ", dataVersion=" + this.dataVersion + ", source=" + this.source + ", standardTime=" + this.standardTime + ", restInTime=" + this.restInTime + ", restOutTime=" + this.restOutTime + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeInt(this.date);
        parcel.writeLong(this.sleepInTime);
        parcel.writeLong(this.sleepOutTime);
        parcel.writeInt(this.totalSleepTime);
        parcel.writeInt(this.totalDeepSleepTime);
        parcel.writeInt(this.totalLightlySleepTime);
        parcel.writeInt(this.totalREMSleepTime);
        parcel.writeInt(this.totalWakeTime);
        parcel.writeInt(this.wakeCount);
        parcel.writeInt(this.calibrated ? 1 : 0);
        parcel.writeInt(this.score);
        parcel.writeString(this.sleepMainData);
        parcel.writeString(this.sleepDayFrgDataList);
        parcel.writeInt(this.dataVersion);
        parcel.writeInt(this.source);
        parcel.writeInt(this.standardTime);
        parcel.writeLong(this.restInTime);
        parcel.writeLong(this.restOutTime);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.updated);
    }

    public /* synthetic */ DBSleepDayStat(String str, String str2, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, String str3, String str4, int i9, int i10, int i11, long j4, long j5, int i12, long j6, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) == 0 ? str2 : "", (i14 & 4) != 0 ? 0 : i, (i14 & 8) != 0 ? 0L : j2, (i14 & 16) != 0 ? 0L : j3, (i14 & 32) != 0 ? 0 : i2, (i14 & 64) != 0 ? 0 : i3, (i14 & 128) != 0 ? 0 : i4, (i14 & 256) != 0 ? 0 : i5, (i14 & 512) != 0 ? 0 : i6, (i14 & 1024) != 0 ? 0 : i7, (i14 & 2048) != 0 ? true : z, (i14 & 4096) != 0 ? 0 : i8, (i14 & 8192) != 0 ? null : str3, (i14 & 16384) == 0 ? str4 : null, (32768 & i14) != 0 ? 0 : i9, (i14 & 65536) != 0 ? 1 : i10, (i14 & 131072) != 0 ? 0 : i11, (i14 & 262144) != 0 ? 0L : j4, (i14 & 524288) != 0 ? 0L : j5, (i14 & 1048576) != 0 ? 0 : i12, (i14 & 2097152) != 0 ? 0L : j6, (i14 & 4194304) != 0 ? 0 : i13);
    }

    public DBSleepDayStat(@NonNull @NotNull String ssoid, @NonNull @NotNull String deviceUniqueId, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, @Nullable String str, @Nullable String str2, int i9, int i10, int i11, long j4, long j5, int i12, long j6, int i13) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        this.ssoid = ssoid;
        this.deviceUniqueId = deviceUniqueId;
        this.date = i;
        this.sleepInTime = j2;
        this.sleepOutTime = j3;
        this.totalSleepTime = i2;
        this.totalDeepSleepTime = i3;
        this.totalLightlySleepTime = i4;
        this.totalREMSleepTime = i5;
        this.totalWakeTime = i6;
        this.wakeCount = i7;
        this.calibrated = z;
        this.score = i8;
        this.sleepMainData = str;
        this.sleepDayFrgDataList = str2;
        this.dataVersion = i9;
        this.source = i10;
        this.standardTime = i11;
        this.restInTime = j4;
        this.restOutTime = j5;
        this.syncStatus = i12;
        this.modifiedTimestamp = j6;
        this.updated = i13;
    }
}
