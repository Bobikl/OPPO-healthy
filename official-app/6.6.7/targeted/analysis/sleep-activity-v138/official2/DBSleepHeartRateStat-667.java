package com.heytap.databaseengineservice.db.table.newsleep;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00017Bk\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\b\b\u0002\u0010)\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b3\u00104B\t\b\u0016¢\u0006\u0004\b3\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010 \u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00068"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/newsleep/DBSleepHeartRateStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "date", "I", "getDate", "()I", "setDate", "(I)V", "minHeartRate", "getMinHeartRate", "setMinHeartRate", "maxHeartRate", "getMaxHeartRate", "setMaxHeartRate", "reasonableRangeLow", "getReasonableRangeLow", "setReasonableRangeLow", "reasonableRangeHigh", "getReasonableRangeHigh", "setReasonableRangeHigh", "warningNumber", "getWarningNumber", "setWarningNumber", "avgSleepHeartRate", "getAvgSleepHeartRate", "setAvgSleepHeartRate", "syncStatus", "getSyncStatus", "setSyncStatus", "", "modifiedTimestamp", "J", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "<init>", "(Ljava/lang/String;IIIIIIIIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "date"}, tableName = DBSleepHeartRateStat.TABLE_NAME)
public final class DBSleepHeartRateStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final String AVG_SLEEP_HEART_RATE = "avg_sleep_heart_rate";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String MAX_HEART_RATE = "max_hr";

    @NotNull
    public static final String MIN_HEART_RATE = "min_hr";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String REASONABLE_RANGE_HIGH = "reasonable_range_high";

    @NotNull
    public static final String REASONABLE_RANGE_LOW = "reasonable_range_low";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBSleepHeartRateStat";

    @NotNull
    public static final String WARNING_NUMBER = "warning_number";

    @ColumnInfo(name = AVG_SLEEP_HEART_RATE)
    private int avgSleepHeartRate;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = MAX_HEART_RATE)
    private int maxHeartRate;

    @ColumnInfo(name = MIN_HEART_RATE)
    private int minHeartRate;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "reasonable_range_high")
    private int reasonableRangeHigh;

    @ColumnInfo(name = "reasonable_range_low")
    private int reasonableRangeLow;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = WARNING_NUMBER)
    private int warningNumber;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSleepHeartRateStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/newsleep/DBSleepHeartRateStat$a;", "", "", "a", "AVG_SLEEP_HEART_RATE", "Ljava/lang/String;", "DATE", "MAX_HEART_RATE", "MIN_HEART_RATE", "MODIFIED_TIMESTAMP", "REASONABLE_RANGE_HIGH", "REASONABLE_RANGE_LOW", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "WARNING_NUMBER", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSleepHeartRateStat(ssoid TEXT not null,date INTEGER not null,min_hr INTEGER not null,max_hr INTEGER not null,reasonable_range_low INTEGER not null,reasonable_range_high INTEGER not null,warning_number INTEGER not null,avg_sleep_heart_rate INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSleepHeartRateStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSleepHeartRateStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSleepHeartRateStat(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSleepHeartRateStat[] newArray(int i) {
            return new DBSleepHeartRateStat[i];
        }
    }

    public /* synthetic */ DBSleepHeartRateStat(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? 0 : i3, (i9 & 16) != 0 ? 0 : i4, (i9 & 32) != 0 ? 0 : i5, (i9 & 64) != 0 ? 0 : i6, (i9 & 128) != 0 ? 0 : i7, (i9 & 256) == 0 ? i8 : 0, (i9 & 512) != 0 ? 0L : j2);
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

    public final int getAvgSleepHeartRate() {
        return this.avgSleepHeartRate;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getReasonableRangeHigh() {
        return this.reasonableRangeHigh;
    }

    public final int getReasonableRangeLow() {
        return this.reasonableRangeLow;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getWarningNumber() {
        return this.warningNumber;
    }

    public final void setAvgSleepHeartRate(int i) {
        this.avgSleepHeartRate = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public final void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setReasonableRangeHigh(int i) {
        this.reasonableRangeHigh = i;
    }

    public final void setReasonableRangeLow(int i) {
        this.reasonableRangeLow = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setWarningNumber(int i) {
        this.warningNumber = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSleepHeartRateStat(ssoid='" + this.ssoid + "', date=" + this.date + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", reasonableRangeLow=" + this.reasonableRangeLow + ", reasonableRangeHigh=" + this.reasonableRangeHigh + ", warningNumber=" + this.warningNumber + ", avgSleepHeartRate=" + this.avgSleepHeartRate + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeInt(this.reasonableRangeLow);
        parcel.writeInt(this.reasonableRangeHigh);
        parcel.writeInt(this.warningNumber);
        parcel.writeInt(this.avgSleepHeartRate);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBSleepHeartRateStat(@NotNull String ssoid, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.date = i;
        this.minHeartRate = i2;
        this.maxHeartRate = i3;
        this.reasonableRangeLow = i4;
        this.reasonableRangeHigh = i5;
        this.warningNumber = i6;
        this.avgSleepHeartRate = i7;
        this.syncStatus = i8;
        this.modifiedTimestamp = j2;
    }

    public DBSleepHeartRateStat() {
        this("", 0, 0, 0, 0, 0, 0, 0, 0, 0L);
    }
}