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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>BM\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b;\u0010<J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÂ\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u0005HÆ\u0001J\t\u0010 \u001a\u00020\u0014HÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010%\u001a\u00020\u0014HÖ\u0001J\u0019\u0010)\u001a\u00020\f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R\"\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010+\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/DBSedentary;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "getSsoid", "getStartTimestamp", "getEndTimestamp", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mEndTimestamp", "setEndTimestamp", "toString", "component4", "", "component5", "component6", "component7", "ssoid", "startTimestamp", "endTimestamp", "dataClient", "value", "syncStatus", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/String;", "J", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "I", "getValue", "()I", "setValue", "(I)V", "getSyncStatus", "setSyncStatus", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "<init>", "(Ljava/lang/String;JJLjava/lang/String;IIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "start_timestamp"}, tableName = DBSedentary.TABLE_NAME)
public final /* data */ class DBSedentary extends SportHealthData implements Parcelable {

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String END_TIMESTAMP = "end_timestamp";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBSedentary";

    @NotNull
    public static final String VALUE = "value";

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "value")
    private int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSedentary> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.DBSedentary$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/DBSedentary$a;", "", "", "a", "DATA_CLIENT", "Ljava/lang/String;", "END_TIMESTAMP", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "START_TIMESTAMP", "SYNC_STATUS", "TABLE_NAME", "VALUE", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSedentary(ssoid TEXT not null,data_client TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,value INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client,start_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSedentary> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSedentary createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSedentary(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSedentary[] newArray(int i) {
            return new DBSedentary[i];
        }
    }

    public DBSedentary() {
        this(null, 0L, 0L, null, 0, 0, 0L, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final DBSedentary copy(@NotNull String ssoid, long startTimestamp, long endTimestamp, @NotNull String dataClient, int value, int syncStatus, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new DBSedentary(ssoid, startTimestamp, endTimestamp, dataClient, value, syncStatus, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBSedentary)) {
            return false;
        }
        DBSedentary dBSedentary = (DBSedentary) other;
        return Intrinsics.areEqual(this.ssoid, dBSedentary.ssoid) && this.startTimestamp == dBSedentary.startTimestamp && this.endTimestamp == dBSedentary.endTimestamp && Intrinsics.areEqual(this.dataClient, dBSedentary.dataClient) && this.value == dBSedentary.value && this.syncStatus == dBSedentary.syncStatus && this.modifiedTimestamp == dBSedentary.modifiedTimestamp;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    /* JADX INFO: renamed from: getEndTimestamp */
    public long getStartTimestamp() {
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

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((this.ssoid.hashCode() * 31) + Long.hashCode(this.startTimestamp)) * 31) + Long.hashCode(this.endTimestamp)) * 31) + this.dataClient.hashCode()) * 31) + Integer.hashCode(this.value)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
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

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSedentary(ssoid='" + this.ssoid + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient='" + this.dataClient + "', value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeInt(this.value);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBSedentary(String str, long j2, long j3, String str2, int i, int i2, long j4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0L : j3, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? 0L : j4);
    }

    public DBSedentary(@NotNull String ssoid, long j2, long j3, @NotNull String dataClient, int i, int i2, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = dataClient;
        this.value = i;
        this.syncStatus = i2;
        this.modifiedTimestamp = j4;
    }
}
