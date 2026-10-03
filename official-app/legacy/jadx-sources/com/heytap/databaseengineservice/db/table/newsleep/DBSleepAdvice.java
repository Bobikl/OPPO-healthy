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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00019Ba\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\r\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\b\b\u0002\u0010,\u001a\u00020\r\u0012\b\b\u0002\u0010/\u001a\u00020\r\u0012\b\b\u0002\u00102\u001a\u00020\u0006¢\u0006\u0004\b5\u00106B\t\b\u0016¢\u0006\u0004\b5\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003J\b\u0010\f\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\"\u0010,\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R\"\u0010/\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\"\u00102\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u0010\u001f¨\u0006:"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/newsleep/DBSleepAdvice;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "getDeviceUniqueId", "", "getStartTimestamp", "getEndTimestamp", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "dataTimestamp", "J", "getDataTimestamp", "()J", "setDataTimestamp", "(J)V", DBSleepAdvice.BEDTIME, "I", "getBedtime", "()I", "setBedtime", "(I)V", "outBedtime", "getOutBedtime", "setOutBedtime", "duration", "getDuration", "setDuration", DBSleepAdvice.BURDEN, "getBurden", "setBurden", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIIIIIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", DBSleepAdvice.DATA_TIMESTAMP}, tableName = DBSleepAdvice.TABLE_NAME)
public final class DBSleepAdvice extends SportHealthData implements Parcelable {

    @NotNull
    public static final String BEDTIME = "bedtime";

    @NotNull
    public static final String BURDEN = "burden";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATA_TIMESTAMP = "data_timestamp";

    @NotNull
    public static final String DURATION = "duration";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String OUT_BEDTIME = "out_bedtime";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBSleepAdvice";

    @ColumnInfo(name = BEDTIME)
    private int bedtime;

    @ColumnInfo(name = BURDEN)
    private int burden;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = DATA_TIMESTAMP)
    private long dataTimestamp;

    @ColumnInfo(name = "duration")
    private int duration;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = OUT_BEDTIME)
    private int outBedtime;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSleepAdvice> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.newsleep.DBSleepAdvice$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/newsleep/DBSleepAdvice$a;", "", "", "a", "BEDTIME", "Ljava/lang/String;", "BURDEN", "DATA_CLIENT", "DATA_TIMESTAMP", "DURATION", "MODIFIED_TIMESTAMP", "OUT_BEDTIME", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSleepAdvice(ssoid TEXT not null,data_client TEXT not null,data_timestamp INTEGER not null,bedtime INTEGER not null,out_bedtime INTEGER not null,duration INTEGER not null,burden INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client," + DBSleepAdvice.DATA_TIMESTAMP + "))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSleepAdvice> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSleepAdvice createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSleepAdvice(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSleepAdvice[] newArray(int i) {
            return new DBSleepAdvice[i];
        }
    }

    public /* synthetic */ DBSleepAdvice(String str, String str2, long j2, int i, int i2, int i3, int i4, int i5, long j3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) == 0 ? str2 : "", (i6 & 4) != 0 ? 0L : j2, (i6 & 8) != 0 ? 0 : i, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) == 0 ? i5 : 0, (i6 & 256) == 0 ? j3 : 0L);
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

    public final int getBedtime() {
        return this.bedtime;
    }

    public final int getBurden() {
        return this.burden;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataTimestamp() {
        return this.dataTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.dataTimestamp;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getOutBedtime() {
        return this.outBedtime;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.dataTimestamp;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final void setBedtime(int i) {
        this.bedtime = i;
    }

    public final void setBurden(int i) {
        this.burden = i;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataTimestamp(long j2) {
        this.dataTimestamp = j2;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOutBedtime(int i) {
        this.outBedtime = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSleepAdvice(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataTimestamp=" + this.dataTimestamp + ", bedtime=" + this.bedtime + ", outBedtime=" + this.outBedtime + ", duration=" + this.duration + ", burden=" + this.burden + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataTimestamp);
        parcel.writeInt(this.bedtime);
        parcel.writeInt(this.outBedtime);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.burden);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBSleepAdvice(@NotNull String ssoid, @NotNull String dataClient, long j2, int i, int i2, int i3, int i4, int i5, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataTimestamp = j2;
        this.bedtime = i;
        this.outBedtime = i2;
        this.duration = i3;
        this.burden = i4;
        this.syncStatus = i5;
        this.modifiedTimestamp = j3;
    }

    public DBSleepAdvice() {
        this("", "", 0L, 0, 0, 0, 0, 0, 0L);
    }
}
