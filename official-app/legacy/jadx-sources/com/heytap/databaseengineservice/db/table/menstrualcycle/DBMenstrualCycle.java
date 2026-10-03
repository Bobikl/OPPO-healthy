package com.heytap.databaseengineservice.db.table.menstrualcycle;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:Bm\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\u0010\u0012\b\b\u0002\u00101\u001a\u00020\u0005\u0012\b\b\u0002\u00104\u001a\u00020\u0010¢\u0006\u0004\b7\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\"\u00101\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0019\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\"\u00104\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 ¨\u0006;"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBMenstrualCycle;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "getEndTimestamp", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mEndTimestamp", "setEndTimestamp", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "startTimestamp", "J", "endTimestamp", "stopType", "I", "getStopType", "()I", "setStopType", "(I)V", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "updateTimestamp", "getUpdateTimestamp", "()J", "setUpdateTimestamp", "(J)V", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "display", "getDisplay", "setDisplay", "<init>", "(Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;JIJI)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "start_timestamp"}, tableName = DBMenstrualCycle.TABLE_NAME)
public final class DBMenstrualCycle extends SportHealthData implements Parcelable {

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String END_TIMESTAMP = "end_timestamp";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String STOP_TYPE = "stop_type";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBMenstrualCycle";

    @NotNull
    public static final String UPDATE_TIMESTAMP = "update_timestamp";

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = STOP_TYPE)
    private int stopType;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "update_timestamp")
    private long updateTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBMenstrualCycle> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.menstrualcycle.DBMenstrualCycle$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBMenstrualCycle$a;", "", "", "a", "CLIENT_MODEL", "Ljava/lang/String;", "DATA_CLIENT", "DISPLAY", "END_TIMESTAMP", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "START_TIMESTAMP", "STOP_TYPE", "SYNC_STATUS", "TABLE_NAME", "UPDATE_TIMESTAMP", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBMenstrualCycle(ssoid TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,stop_type INTEGER not null,data_client TEXT not null,client_model TEXT,update_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,display INTEGER not null,primary key(ssoid,data_client,start_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBMenstrualCycle> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBMenstrualCycle createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBMenstrualCycle(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBMenstrualCycle[] newArray(int i) {
            return new DBMenstrualCycle[i];
        }
    }

    public DBMenstrualCycle() {
        this(null, 0L, 0L, 0, null, null, 0L, 0, 0L, 0, 1023, null);
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
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
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
        return this.startTimestamp;
    }

    public final int getStopType() {
        return this.stopType;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
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

    public final void setEndTimestamp(long mEndTimestamp) {
        this.endTimestamp = mEndTimestamp;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    public final void setStopType(int i) {
        this.stopType = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBMenstrualCycle(ssoid='" + this.ssoid + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", stopType=" + this.stopType + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", updateTimestamp=" + this.updateTimestamp + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.stopType);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.display);
    }

    public /* synthetic */ DBMenstrualCycle(String str, long j2, long j3, int i, String str2, String str3, long j4, int i2, long j5, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) != 0 ? 0L : j3, (i4 & 8) != 0 ? 0 : i, (i4 & 16) == 0 ? str2 : "", (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? 0L : j4, (i4 & 128) == 0 ? i2 : 0, (i4 & 256) == 0 ? j5 : 0L, (i4 & 512) != 0 ? 1 : i3);
    }

    public DBMenstrualCycle(@NotNull String ssoid, long j2, long j3, int i, @NotNull String dataClient, @Nullable String str, long j4, int i2, long j5, int i3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.stopType = i;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.updateTimestamp = j4;
        this.syncStatus = i2;
        this.modifiedTimestamp = j5;
        this.display = i3;
    }
}
