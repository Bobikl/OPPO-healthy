package com.heytap.databaseengineservice.db.table;

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
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001.BE\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010'\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+B\t\b\u0016¢\u0006\u0004\b*\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0003H\u0016J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001d¨\u0006/"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/DBSleepRRInterval;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "dataCreatedTimestamp", "J", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "dataList", "getDataList", "setDataList", "syncStatus", "I", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "data_created_timestamp"}, tableName = DBSleepRRInterval.TABLE_NAME)
public final class DBSleepRRInterval extends SportHealthData implements Parcelable {

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DATA_LIST = "data_list";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBSleepRRInterval";

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = DATA_LIST)
    @Nullable
    private String dataList;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSleepRRInterval> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.DBSleepRRInterval$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/DBSleepRRInterval$a;", "", "", "a", "DATA_CLIENT", "Ljava/lang/String;", "DATA_CREATED_TIMESTAMP", "DATA_LIST", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSleepRRInterval(ssoid TEXT not null,data_client TEXT not null,data_created_timestamp INTEGER not null,data_list TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client,data_created_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSleepRRInterval> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSleepRRInterval createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSleepRRInterval(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSleepRRInterval[] newArray(int i) {
            return new DBSleepRRInterval[i];
        }
    }

    public /* synthetic */ DBSleepRRInterval(String str, String str2, long j2, String str3, int i, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 0L : j3);
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

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Nullable
    public final String getDataList() {
        return this.dataList;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDataList(@Nullable String str) {
        this.dataList = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
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
        return "DBSleepRRInterval(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", dataList=" + this.dataList + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeString(this.dataList);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBSleepRRInterval(@NotNull String ssoid, @NotNull String dataClient, long j2, @Nullable String str, int i, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataCreatedTimestamp = j2;
        this.dataList = str;
        this.syncStatus = i;
        this.modifiedTimestamp = j3;
    }

    public DBSleepRRInterval() {
        this("", "", 0L, null, 0, 0L);
    }
}
