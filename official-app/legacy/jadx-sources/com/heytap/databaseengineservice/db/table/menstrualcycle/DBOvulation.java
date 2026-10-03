package com.heytap.databaseengineservice.db.table.menstrualcycle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.sqlite.db.SupportSQLiteDatabase;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u001b\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001=Bw\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010*\u001a\u00020\n\u0012\b\b\u0002\u0010-\u001a\u00020\n\u0012\b\b\u0002\u00100\u001a\u00020\n\u0012\b\b\u0002\u00103\u001a\u00020\n\u0012\b\b\u0002\u00106\u001a\u00020#¢\u0006\u0004\b9\u0010:B\t\b\u0016¢\u0006\u0004\b9\u0010;J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u00100\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\"\u00106\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)¨\u0006>"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBOvulation;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "getDeviceUniqueId", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "ovulaDate", "I", "getOvulaDate", "()I", "setOvulaDate", "(I)V", "ovulationPreType", "getOvulationPreType", "setOvulationPreType", "", "ovulaDateAlgorTime", "J", "getOvulaDateAlgorTime", "()J", "setOvulaDateAlgorTime", "(J)V", "ovulaBeginDate", "getOvulaBeginDate", "setOvulaBeginDate", "ovulaEndDate", "getOvulaEndDate", "setOvulaEndDate", "display", "getDisplay", "setDisplay", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJIIIIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", DBOvulation.OVULATION_PRE_TYPE, DBOvulation.OVULA_DATE}, tableName = DBOvulation.TABLE_NAME)
public final class DBOvulation extends SportHealthData implements Parcelable {

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String OVULATION_PRE_TYPE = "ovulation_pre_type";

    @NotNull
    public static final String OVULA_BEGIN_DATE = "ovula_begin_date";

    @NotNull
    public static final String OVULA_DATE = "ovula_date";

    @NotNull
    public static final String OVULA_DATE_ALGOR_TIME = "ovula_date_algor_time";

    @NotNull
    public static final String OVULA_END_DATE = "ovula_end_date";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBOvulation";

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = OVULA_BEGIN_DATE)
    private int ovulaBeginDate;

    @ColumnInfo(name = OVULA_DATE)
    private int ovulaDate;

    @ColumnInfo(name = OVULA_DATE_ALGOR_TIME)
    private long ovulaDateAlgorTime;

    @ColumnInfo(name = OVULA_END_DATE)
    private int ovulaEndDate;

    @ColumnInfo(name = OVULATION_PRE_TYPE)
    private int ovulationPreType;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBOvulation> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.menstrualcycle.DBOvulation$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBOvulation$a;", "", "", "b", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "a", "c", "CLIENT_MODEL", "Ljava/lang/String;", "DATA_CLIENT", "DISPLAY", "MODIFIED_TIMESTAMP", "OVULATION_PRE_TYPE", "OVULA_BEGIN_DATE", "OVULA_DATE", "OVULA_DATE_ALGOR_TIME", "OVULA_END_DATE", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            StringBuilder sb = new StringBuilder();
            sb.append("create table if not exists DBOvulation_copy(");
            sb.append("ssoid TEXT not null,");
            sb.append("data_client TEXT not null,");
            sb.append("client_model TEXT,");
            sb.append("ovula_date INTEGER not null,");
            sb.append("ovulation_pre_type INTEGER not null,");
            sb.append("ovula_date_algor_time INTEGER not null,");
            sb.append("ovula_begin_date INTEGER not null,");
            sb.append("ovula_end_date INTEGER not null,");
            sb.append("display INTEGER not null,");
            sb.append("sync_status INTEGER not null,");
            sb.append("modified_timestamp INTEGER not null,");
            sb.append("primary key(");
            sb.append("ssoid");
            sb.append(",");
            sb.append("data_client");
            sb.append(",");
            sb.append(DBOvulation.OVULATION_PRE_TYPE);
            sb.append(",");
            sb.append(DBOvulation.OVULA_DATE);
            sb.append(")");
            sb.append(")");
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "strSql.toString()");
            database.execSQL(string);
            String str = "INSERT OR IGNORE INTO DBOvulation_copy (" + c() + ") SELECT " + c() + " FROM DBOvulation ORDER BY ovula_date asc, ovula_date_algor_time desc;";
            Intrinsics.checkNotNullExpressionValue(str, "copyData.toString()");
            database.execSQL(str);
            database.execSQL("DROP TABLE DBOvulation;");
            String str2 = "ALTER TABLE DBOvulation_copy RENAME TO DBOvulation;";
            Intrinsics.checkNotNullExpressionValue(str2, "renameTable.toString()");
            database.execSQL(str2);
        }

        @JvmStatic
        @NotNull
        public final String b() {
            String str = "create table if not exists DBOvulation(ssoid TEXT not null,data_client TEXT not null,client_model TEXT,ovula_date INTEGER not null,ovulation_pre_type INTEGER not null,ovula_date_algor_time INTEGER not null,ovula_begin_date INTEGER not null,ovula_end_date INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client," + DBOvulation.OVULATION_PRE_TYPE + "," + DBOvulation.OVULA_DATE_ALGOR_TIME + "))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }

        public final String c() {
            String str = "ssoid,data_client,client_model,ovula_date,ovulation_pre_type,ovula_date_algor_time ,ovula_begin_date,ovula_end_date,display,sync_status,modified_timestamp";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.append(\"$SSOID,\")…              .toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBOvulation> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBOvulation createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBOvulation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBOvulation[] newArray(int i) {
            return new DBOvulation[i];
        }
    }

    public /* synthetic */ DBOvulation(String str, String str2, String str3, int i, int i2, long j2, int i3, int i4, int i5, int i6, long j3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) == 0 ? str2 : "", (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? 0 : i2, (i7 & 32) != 0 ? 0L : j2, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 1 : i5, (i7 & 512) == 0 ? i6 : 0, (i7 & 1024) == 0 ? j3 : 0L);
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getOvulaBeginDate() {
        return this.ovulaBeginDate;
    }

    public final int getOvulaDate() {
        return this.ovulaDate;
    }

    public final long getOvulaDateAlgorTime() {
        return this.ovulaDateAlgorTime;
    }

    public final int getOvulaEndDate() {
        return this.ovulaEndDate;
    }

    public final int getOvulationPreType() {
        return this.ovulationPreType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOvulaBeginDate(int i) {
        this.ovulaBeginDate = i;
    }

    public final void setOvulaDate(int i) {
        this.ovulaDate = i;
    }

    public final void setOvulaDateAlgorTime(long j2) {
        this.ovulaDateAlgorTime = j2;
    }

    public final void setOvulaEndDate(int i) {
        this.ovulaEndDate = i;
    }

    public final void setOvulationPreType(int i) {
        this.ovulationPreType = i;
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
        return "DBOvulation(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", ovulaDate=" + this.ovulaDate + ", ovulationPreType=" + this.ovulationPreType + ", ovulaDateAlgorTime=" + this.ovulaDateAlgorTime + ", ovulaBeginDate=" + this.ovulaBeginDate + ", ovulaEndDate=" + this.ovulaEndDate + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.ovulaDate);
        parcel.writeInt(this.ovulationPreType);
        parcel.writeLong(this.ovulaDateAlgorTime);
        parcel.writeInt(this.ovulaBeginDate);
        parcel.writeInt(this.ovulaEndDate);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBOvulation(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, int i, int i2, long j2, int i3, int i4, int i5, int i6, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.ovulaDate = i;
        this.ovulationPreType = i2;
        this.ovulaDateAlgorTime = j2;
        this.ovulaBeginDate = i3;
        this.ovulaEndDate = i4;
        this.display = i5;
        this.syncStatus = i6;
        this.modifiedTimestamp = j3;
    }

    public DBOvulation() {
        this("", "", null, 0, 0, 0L, 0, 0, 0, 0, 0L);
    }
}
