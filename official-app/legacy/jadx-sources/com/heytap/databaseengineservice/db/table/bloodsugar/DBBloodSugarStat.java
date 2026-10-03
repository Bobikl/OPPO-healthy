package com.heytap.databaseengineservice.db.table.bloodsugar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.time.ZoneId;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001ZBÏ\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010/\u001a\u00020\t\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u00020\t\u0012\b\b\u0002\u0010;\u001a\u00020\t\u0012\b\b\u0002\u0010>\u001a\u00020\"\u0012\b\b\u0002\u0010D\u001a\u00020\"\u0012\b\b\u0002\u0010G\u001a\u00020\t\u0012\b\b\u0002\u0010K\u001a\u00020J\u0012\b\b\u0002\u0010Q\u001a\u00020\t\u0012\b\b\u0002\u0010T\u001a\u00020J¢\u0006\u0004\bW\u0010XJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u0010,\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\"\u0010/\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR\"\u00102\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\"\u00105\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR\"\u00108\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001a\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\"\u0010;\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001a\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u0010\u001eR\"\u0010>\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\"\u0010G\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u001a\u001a\u0004\bH\u0010\u001c\"\u0004\bI\u0010\u001eR\"\u0010K\u001a\u00020J8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u001a\u001a\u0004\bR\u0010\u001c\"\u0004\bS\u0010\u001eR\"\u0010T\u001a\u00020J8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010L\u001a\u0004\bU\u0010N\"\u0004\bV\u0010P¨\u0006["}, d2 = {"Lcom/heytap/databaseengineservice/db/table/bloodsugar/DBBloodSugarStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "date", "I", "getDate", "()I", "setDate", "(I)V", "timezone", "getTimezone", "setTimezone", "", Element.ELEMENT_NAME_AVERAGE, "Ljava/lang/Double;", "getAverage", "()Ljava/lang/Double;", "setAverage", "(Ljava/lang/Double;)V", "min", "getMin", "setMin", "max", "getMax", "setMax", "warningCounts", "getWarningCounts", "setWarningCounts", "highCounts", "getHighCounts", "setHighCounts", "normalCounts", "getNormalCounts", "setNormalCounts", "lowCounts", "getLowCounts", "setLowCounts", "normalPercent", "getNormalPercent", "setNormalPercent", "lowThreshold", "D", "getLowThreshold", "()D", "setLowThreshold", "(D)V", "highThreshold", "getHighThreshold", "setHighThreshold", "goalAchieved", "getGoalAchieved", "setGoalAchieved", "", "deviceActiveTime", "J", "getDeviceActiveTime", "()J", "setDeviceActiveTime", "(J)V", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;IIIIIDDIJIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "date"}, tableName = DBBloodSugarStat.TABLE_NAME)
public final class DBBloodSugarStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final String AVG = "avg_value";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String DEVICE_ACTIVE_TIMESTAMP = "device_active_timestamp";

    @NotNull
    public static final String GOAL_ACHIEVED = "goal_achieved";

    @NotNull
    public static final String HIGH_COUNTS = "high_counts";

    @NotNull
    public static final String HIGH_THRESHOLD = "high_threshold";

    @NotNull
    public static final String LOW_COUNTS = "low_counts";

    @NotNull
    public static final String LOW_THRESHOLD = "low_threshold";

    @NotNull
    public static final String MAX = "max_value";

    @NotNull
    public static final String MIN = "min_value";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String NORMAL_COUNTS = "normal_counts";

    @NotNull
    public static final String NORMAL_PERCENT = "normal_percent";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBBloodSugarStat";

    @NotNull
    public static final String TIMEZONE = "timezone";

    @NotNull
    public static final String WARNING_COUNTS = "warning_counts";

    @ColumnInfo(name = AVG)
    @Nullable
    private Double average;

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @Nullable
    private String dataClient;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DEVICE_ACTIVE_TIMESTAMP)
    private long deviceActiveTime;

    @ColumnInfo(name = GOAL_ACHIEVED)
    private int goalAchieved;

    @ColumnInfo(name = HIGH_COUNTS)
    private int highCounts;

    @ColumnInfo(name = HIGH_THRESHOLD)
    private double highThreshold;

    @ColumnInfo(name = LOW_COUNTS)
    private int lowCounts;

    @ColumnInfo(name = LOW_THRESHOLD)
    private double lowThreshold;

    @ColumnInfo(name = "max_value")
    @Nullable
    private Double max;

    @ColumnInfo(name = "min_value")
    @Nullable
    private Double min;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = NORMAL_COUNTS)
    private int normalCounts;

    @ColumnInfo(name = NORMAL_PERCENT)
    private int normalPercent;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    @NotNull
    private String timezone;

    @ColumnInfo(name = WARNING_COUNTS)
    private int warningCounts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBBloodSugarStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugarStat$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005¨\u0006\u001b"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/bloodsugar/DBBloodSugarStat$a;", "", "", "a", "AVG", "Ljava/lang/String;", "CLIENT_MODEL", "DATA_CLIENT", "DATE", "DEVICE_ACTIVE_TIMESTAMP", "GOAL_ACHIEVED", "HIGH_COUNTS", "HIGH_THRESHOLD", "LOW_COUNTS", "LOW_THRESHOLD", "MAX", "MIN", "MODIFIED_TIMESTAMP", "NORMAL_COUNTS", "NORMAL_PERCENT", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "TIMEZONE", "WARNING_COUNTS", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBBloodSugarStat(ssoid TEXT not null,data_client TEXT,client_model TEXT,date INTEGER not null,timezone TEXT not null,avg_value REAL,min_value REAL,max_value REAL,warning_counts INTEGER not null,high_counts INTEGER not null,normal_counts INTEGER not null,low_counts INTEGER not null,normal_percent INTEGER not null,low_threshold REAL not null,high_threshold REAL not null,goal_achieved INTEGER not null,device_active_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBBloodSugarStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBBloodSugarStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBBloodSugarStat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBBloodSugarStat[] newArray(int i) {
            return new DBBloodSugarStat[i];
        }
    }

    public DBBloodSugarStat() {
        this(null, null, null, 0, null, null, null, null, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0, 0L, 0, 0L, 524287, null);
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

    @Nullable
    public final Double getAverage() {
        return this.average;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    public final long getDeviceActiveTime() {
        return this.deviceActiveTime;
    }

    public final int getGoalAchieved() {
        return this.goalAchieved;
    }

    public final int getHighCounts() {
        return this.highCounts;
    }

    public final double getHighThreshold() {
        return this.highThreshold;
    }

    public final int getLowCounts() {
        return this.lowCounts;
    }

    public final double getLowThreshold() {
        return this.lowThreshold;
    }

    @Nullable
    public final Double getMax() {
        return this.max;
    }

    @Nullable
    public final Double getMin() {
        return this.min;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getNormalCounts() {
        return this.normalCounts;
    }

    public final int getNormalPercent() {
        return this.normalPercent;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    public final int getWarningCounts() {
        return this.warningCounts;
    }

    public final void setAverage(@Nullable Double d) {
        this.average = d;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceActiveTime(long j2) {
        this.deviceActiveTime = j2;
    }

    public final void setGoalAchieved(int i) {
        this.goalAchieved = i;
    }

    public final void setHighCounts(int i) {
        this.highCounts = i;
    }

    public final void setHighThreshold(double d) {
        this.highThreshold = d;
    }

    public final void setLowCounts(int i) {
        this.lowCounts = i;
    }

    public final void setLowThreshold(double d) {
        this.lowThreshold = d;
    }

    public final void setMax(@Nullable Double d) {
        this.max = d;
    }

    public final void setMin(@Nullable Double d) {
        this.min = d;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setNormalCounts(int i) {
        this.normalCounts = i;
    }

    public final void setNormalPercent(int i) {
        this.normalPercent = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTimezone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timezone = str;
    }

    public final void setWarningCounts(int i) {
        this.warningCounts = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBBloodSugarStat(ssoid='" + this.ssoid + "', dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", date=" + this.date + ", timezone='" + this.timezone + "', average=" + this.average + ", min=" + this.min + ", max=" + this.max + ", warningCounts=" + this.warningCounts + ", highCounts=" + this.highCounts + ", normalCounts=" + this.normalCounts + ", lowCounts=" + this.lowCounts + ", normalPercent=" + this.normalPercent + ", lowThreshold=" + this.lowThreshold + ", highThreshold=" + this.highThreshold + ", goalAchieved=" + this.goalAchieved + ", deviceActiveTime=" + this.deviceActiveTime + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        Double d = this.average;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.min;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.max;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        parcel.writeInt(this.warningCounts);
        parcel.writeInt(this.highCounts);
        parcel.writeInt(this.normalCounts);
        parcel.writeInt(this.lowCounts);
        parcel.writeInt(this.normalPercent);
        parcel.writeDouble(this.lowThreshold);
        parcel.writeDouble(this.highThreshold);
        parcel.writeInt(this.goalAchieved);
        parcel.writeLong(this.deviceActiveTime);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DBBloodSugarStat(String str, String str2, String str3, int i, String str4, Double d, Double d2, Double d3, int i2, int i3, int i4, int i5, int i6, double d4, double d5, int i7, long j2, int i8, long j3, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        String id;
        String str5 = (i9 & 1) != 0 ? "" : str;
        String str6 = (i9 & 2) != 0 ? null : str2;
        String str7 = (i9 & 4) != 0 ? null : str3;
        int i10 = (i9 & 8) != 0 ? 0 : i;
        if ((i9 & 16) != 0) {
            id = ZoneId.systemDefault().getId();
            Intrinsics.checkNotNullExpressionValue(id, "systemDefault().id");
        } else {
            id = str4;
        }
        this(str5, str6, str7, i10, id, (i9 & 32) != 0 ? null : d, (i9 & 64) != 0 ? null : d2, (i9 & 128) == 0 ? d3 : null, (i9 & 256) != 0 ? 0 : i2, (i9 & 512) != 0 ? 0 : i3, (i9 & 1024) != 0 ? 0 : i4, (i9 & 2048) != 0 ? 0 : i5, (i9 & 4096) != 0 ? 0 : i6, (i9 & 8192) != 0 ? 0.0d : d4, (i9 & 16384) == 0 ? d5 : 0.0d, (32768 & i9) != 0 ? 0 : i7, (i9 & 65536) != 0 ? 0L : j2, (i9 & 131072) == 0 ? i8 : 0, (i9 & 262144) == 0 ? j3 : 0L);
    }

    public DBBloodSugarStat(@NotNull String ssoid, @Nullable String str, @Nullable String str2, int i, @NotNull String timezone, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, int i2, int i3, int i4, int i5, int i6, double d4, double d5, int i7, long j2, int i8, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.ssoid = ssoid;
        this.dataClient = str;
        this.clientModel = str2;
        this.date = i;
        this.timezone = timezone;
        this.average = d;
        this.min = d2;
        this.max = d3;
        this.warningCounts = i2;
        this.highCounts = i3;
        this.normalCounts = i4;
        this.lowCounts = i5;
        this.normalPercent = i6;
        this.lowThreshold = d4;
        this.highThreshold = d5;
        this.goalAchieved = i7;
        this.deviceActiveTime = j2;
        this.syncStatus = i8;
        this.modifiedTimestamp = j3;
    }
}
