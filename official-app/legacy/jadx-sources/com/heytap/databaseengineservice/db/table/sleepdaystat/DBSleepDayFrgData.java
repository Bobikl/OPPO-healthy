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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b.\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DB\u0095\u0001\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\b\b\u0002\u00100\u001a\u00020\u0007\u0012\b\u00103\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010>\u001a\u00020\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\"\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R$\u00103\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u000f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0012\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010\u0016¨\u0006E"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepDayFrgData;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "getDeviceUniqueId", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "ssoid", "Ljava/lang/String;", t04.DEVICE_UNIQUE_ID, "date", "I", "getDate", "()I", "setDate", "(I)V", "", "sleepInTime", "J", "getSleepInTime", "()J", "setSleepInTime", "(J)V", "sleepOutTime", "getSleepOutTime", "setSleepOutTime", "totalSleepTime", "getTotalSleepTime", "setTotalSleepTime", "totalDeepSleepTime", "getTotalDeepSleepTime", "setTotalDeepSleepTime", "totalLightlySleepTime", "getTotalLightlySleepTime", "setTotalLightlySleepTime", "totalREMSleepTime", "getTotalREMSleepTime", "setTotalREMSleepTime", "totalWakeTime", "getTotalWakeTime", "setTotalWakeTime", "wakeCount", "getWakeCount", "setWakeCount", "deviceType", "Ljava/lang/Integer;", "getDeviceType", "()Ljava/lang/Integer;", "setDeviceType", "(Ljava/lang/Integer;)V", "sleepUnitDataList", "getSleepUnitDataList", "()Ljava/lang/String;", "setSleepUnitDataList", "(Ljava/lang/String;)V", "source", "getSource", "setSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJJIIIIIILjava/lang/Integer;Ljava/lang/String;I)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "date", "sleep_in_timestamp", "sleep_out_timestamp"}, tableName = "DBSleepDayFrgStat")
public final class DBSleepDayFrgData extends SportHealthData implements Parcelable {

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "device_type")
    @Nullable
    private Integer deviceType;

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    @NotNull
    private String deviceUniqueId;

    @ColumnInfo(name = "sleep_in_timestamp")
    private long sleepInTime;

    @ColumnInfo(name = "sleep_out_timestamp")
    private long sleepOutTime;

    @ColumnInfo(name = "sleep_unit_data")
    @Nullable
    private String sleepUnitDataList;

    @ColumnInfo(name = "source")
    private int source;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

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

    @ColumnInfo(name = "wake_count")
    private int wakeCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSleepDayFrgData> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepDayFrgData$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepDayFrgData$a;", "", "", "a", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSleepDayFrgStat(ssoid TEXT not null,device_unique_id TEXT not null,date INTEGER not null,sleep_in_timestamp INTEGER not null,sleep_out_timestamp INTEGER not null,total_sleep_time INTEGER not null,total_deep_sleep_time INTEGER not null,total_lightly_sleep_time INTEGER not null,total_rem_time INTEGER not null,total_wake_up_time INTEGER not null,wake_count INTEGER not null,sleep_unit_data TEXT,source INTEGER not null,primary key(ssoid,date,sleep_in_timestamp,sleep_out_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSleepDayFrgData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSleepDayFrgData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSleepDayFrgData(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSleepDayFrgData[] newArray(int i) {
            return new DBSleepDayFrgData[i];
        }
    }

    public /* synthetic */ DBSleepDayFrgData(String str, String str2, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, Integer num, String str3, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? 0 : i, (i9 & 8) != 0 ? 0L : j2, (i9 & 16) != 0 ? 0L : j3, (i9 & 32) != 0 ? 0 : i2, (i9 & 64) != 0 ? 0 : i3, (i9 & 128) != 0 ? 0 : i4, (i9 & 256) != 0 ? 0 : i5, (i9 & 512) != 0 ? 0 : i6, (i9 & 1024) == 0 ? i7 : 0, num, (i9 & 4096) != 0 ? null : str3, (i9 & 8192) != 0 ? 1 : i8);
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

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    public final long getSleepOutTime() {
        return this.sleepOutTime;
    }

    @Nullable
    public final String getSleepUnitDataList() {
        return this.sleepUnitDataList;
    }

    public final int getSource() {
        return this.source;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
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

    public final int getWakeCount() {
        return this.wakeCount;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceType(@Nullable Integer num) {
        this.deviceType = num;
    }

    public final void setSleepInTime(long j2) {
        this.sleepInTime = j2;
    }

    public final void setSleepOutTime(long j2) {
        this.sleepOutTime = j2;
    }

    public final void setSleepUnitDataList(@Nullable String str) {
        this.sleepUnitDataList = str;
    }

    public final void setSource(int i) {
        this.source = i;
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

    public final void setWakeCount(int i) {
        this.wakeCount = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSleepDayFrgData(ssoid='" + this.ssoid + "', deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalREMSleepTime=" + this.totalREMSleepTime + ", totalWakeTime=" + this.totalWakeTime + ", wakeCount=" + this.wakeCount + ", deviceType=" + this.deviceType + ", sleepUnitDataList=" + this.sleepUnitDataList + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
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
        Integer num = this.deviceType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.sleepUnitDataList);
        parcel.writeInt(this.source);
    }

    public DBSleepDayFrgData(@NonNull @NotNull String ssoid, @NonNull @NotNull String deviceUniqueId, int i, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable Integer num, @Nullable String str, int i8) {
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
        this.deviceType = num;
        this.sleepUnitDataList = str;
        this.source = i8;
    }
}
