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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001=Bo\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010.\u001a\u00020\u0005\u0012\b\b\u0002\u00101\u001a\u00020\f\u0012\b\b\u0002\u00104\u001a\u00020\u0005\u0012\b\b\u0002\u00107\u001a\u00020\f¢\u0006\u0004\b:\u0010;J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\"\u00101\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u00104\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R\"\u00107\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010#\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'¨\u0006>"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBMenstrualCycleSymptom;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "getEndTimestamp", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "dataCreatedTimestamp", "J", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "type", "I", "getType", "()I", "setType", "(I)V", "value", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "updateTimestamp", "getUpdateTimestamp", "setUpdateTimestamp", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "display", "getDisplay", "setDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Integer;JIJI)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "data_created_timestamp", "type"}, tableName = DBMenstrualCycleSymptom.TABLE_NAME)
public final class DBMenstrualCycleSymptom extends SportHealthData implements Parcelable {

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBMenstrualCycleSymptom";

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String UPDATE_TIMESTAMP = "update_timestamp";

    @NotNull
    public static final String VALUE = "value";

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "update_timestamp")
    private long updateTimestamp;

    @ColumnInfo(name = "value")
    @Nullable
    private Integer value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBMenstrualCycleSymptom> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.menstrualcycle.DBMenstrualCycleSymptom$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBMenstrualCycleSymptom$a;", "", "", "a", "CLIENT_MODEL", "Ljava/lang/String;", "DATA_CLIENT", "DATA_CREATED_TIMESTAMP", "DISPLAY", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "TYPE", "UPDATE_TIMESTAMP", "VALUE", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBMenstrualCycleSymptom(ssoid TEXT not null,data_client TEXT not null,client_model TEXT,data_created_timestamp INTEGER not null,type INTEGER not null,value INTEGER,update_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,display INTEGER not null,primary key(ssoid,data_client,data_created_timestamp,type))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBMenstrualCycleSymptom> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBMenstrualCycleSymptom createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBMenstrualCycleSymptom(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBMenstrualCycleSymptom[] newArray(int i) {
            return new DBMenstrualCycleSymptom[i];
        }
    }

    public DBMenstrualCycleSymptom() {
        this(null, null, null, 0L, 0, null, 0L, 0, 0L, 0, 1023, null);
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

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.dataCreatedTimestamp;
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

    public final int getType() {
        return this.type;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    @Nullable
    public final Integer getValue() {
        return this.value;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDisplay(int i) {
        this.display = i;
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

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setValue(@Nullable Integer num) {
        this.value = num;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBMenstrualCycleSymptom(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", type=" + this.type + ", value=" + this.value + ", updateTimestamp=" + this.updateTimestamp + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeInt(this.type);
        Integer num = this.value;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.display);
    }

    public /* synthetic */ DBMenstrualCycleSymptom(String str, String str2, String str3, long j2, int i, Integer num, long j3, int i2, long j4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) == 0 ? str2 : "", (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? 0L : j2, (i4 & 16) != 0 ? 0 : i, (i4 & 32) == 0 ? num : null, (i4 & 64) != 0 ? 0L : j3, (i4 & 128) == 0 ? i2 : 0, (i4 & 256) == 0 ? j4 : 0L, (i4 & 512) != 0 ? 1 : i3);
    }

    public DBMenstrualCycleSymptom(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, long j2, int i, @Nullable Integer num, long j3, int i2, long j4, int i3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.dataCreatedTimestamp = j2;
        this.type = i;
        this.value = num;
        this.updateTimestamp = j3;
        this.syncStatus = i2;
        this.modifiedTimestamp = j4;
        this.display = i3;
    }
}
