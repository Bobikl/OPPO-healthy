package com.heytap.databaseengineservice.db.table.snore;

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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b-\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001BB\u008b\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010 \u001a\u00020\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010)\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\b\b\u0002\u00105\u001a\u00020\u0016\u0012\b\b\u0002\u00108\u001a\u00020\t\u0012\b\b\u0002\u0010;\u001a\u00020\t¢\u0006\u0004\b>\u0010?B\t\b\u0016¢\u0006\u0004\b>\u0010@J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R$\u0010/\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R\"\u00102\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u00105\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\"\u00108\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010$\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\"\u0010;\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010$\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(¨\u0006C"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/snore/DBSnoreOsaModel;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "", "dataCreatedTimestamp", "J", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "recordStartTimestamp", "getRecordStartTimestamp", "setRecordStartTimestamp", "recordEndTimestamp", "getRecordEndTimestamp", "setRecordEndTimestamp", "totalSignalLen", "I", "getTotalSignalLen", "()I", "setTotalSignalLen", "(I)V", "curFrameSnoreNum", "getCurFrameSnoreNum", "setCurFrameSnoreNum", "lastFrameSnoreNum", "getLastFrameSnoreNum", "setLastFrameSnoreNum", "features", "getFeatures", "setFeatures", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "display", "getDisplay", "setDisplay", "updated", "getUpdated", "setUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJIIILjava/lang/String;IJII)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "data_created_timestamp"}, tableName = DBSnoreOsaModel.TABLE_NAME)
public final class DBSnoreOsaModel extends SportHealthData implements Parcelable {

    @NotNull
    public static final String CUR_FRAME_SNORE_NUM = "cur_frame_snore_num";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String FEATURES = "features";

    @NotNull
    public static final String LAST_FRAME_SNORE_NUM = "last_frame_snore_num";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String RECORD_END_TIMESTAMP = "record_end_timestamp";

    @NotNull
    public static final String RECORD_START_TIMESTAMP = "record_start_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBSnoreOsaModel";

    @NotNull
    public static final String TOTAL_SIGNAL_LEN = "total_signal_len";

    @NotNull
    public static final String UPDATED = "updated";

    @ColumnInfo(name = CUR_FRAME_SNORE_NUM)
    private int curFrameSnoreNum;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "features")
    @Nullable
    private String features;

    @ColumnInfo(name = LAST_FRAME_SNORE_NUM)
    private int lastFrameSnoreNum;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "record_end_timestamp")
    private long recordEndTimestamp;

    @ColumnInfo(name = "record_start_timestamp")
    private long recordStartTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "total_signal_len")
    private int totalSignalLen;

    @ColumnInfo(name = "updated")
    private int updated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSnoreOsaModel> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.snore.DBSnoreOsaModel$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/snore/DBSnoreOsaModel$a;", "", "", "a", "CUR_FRAME_SNORE_NUM", "Ljava/lang/String;", "DATA_CLIENT", "DATA_CREATED_TIMESTAMP", "DISPLAY", "FEATURES", "LAST_FRAME_SNORE_NUM", "MODIFIED_TIMESTAMP", "RECORD_END_TIMESTAMP", "RECORD_START_TIMESTAMP", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "TOTAL_SIGNAL_LEN", "UPDATED", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSnoreOsaModel(ssoid TEXT not null,data_client TEXT not null,data_created_timestamp INTEGER not null,record_start_timestamp INTEGER not null,record_end_timestamp INTEGER not null,total_signal_len INTEGER not null,cur_frame_snore_num INTEGER not null,last_frame_snore_num INTEGER not null,features TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,display INTEGER not null,updated INTEGER not null,primary key(ssoid,data_client,data_created_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSnoreOsaModel> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSnoreOsaModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSnoreOsaModel(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSnoreOsaModel[] newArray(int i) {
            return new DBSnoreOsaModel[i];
        }
    }

    public /* synthetic */ DBSnoreOsaModel(String str, String str2, long j2, long j3, long j4, int i, int i2, int i3, String str3, int i4, long j5, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) == 0 ? str2 : "", (i7 & 4) != 0 ? 0L : j2, (i7 & 8) != 0 ? 0L : j3, (i7 & 16) != 0 ? 0L : j4, (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? 0 : i3, (i7 & 256) != 0 ? null : str3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) != 0 ? 0L : j5, (i7 & 2048) != 0 ? 1 : i5, (i7 & 4096) == 0 ? i6 : 0);
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

    public final int getCurFrameSnoreNum() {
        return this.curFrameSnoreNum;
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

    @Nullable
    public final String getFeatures() {
        return this.features;
    }

    public final int getLastFrameSnoreNum() {
        return this.lastFrameSnoreNum;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getRecordEndTimestamp() {
        return this.recordEndTimestamp;
    }

    public final long getRecordStartTimestamp() {
        return this.recordStartTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getTotalSignalLen() {
        return this.totalSignalLen;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public final void setCurFrameSnoreNum(int i) {
        this.curFrameSnoreNum = i;
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

    public final void setFeatures(@Nullable String str) {
        this.features = str;
    }

    public final void setLastFrameSnoreNum(int i) {
        this.lastFrameSnoreNum = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setRecordEndTimestamp(long j2) {
        this.recordEndTimestamp = j2;
    }

    public final void setRecordStartTimestamp(long j2) {
        this.recordStartTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTotalSignalLen(int i) {
        this.totalSignalLen = i;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSnoreOsaModel(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", totalSignalLen=" + this.totalSignalLen + ", curFrameSnoreNum=" + this.curFrameSnoreNum + ", lastFrameSnoreNum=" + this.lastFrameSnoreNum + ", features=" + this.features + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", display=" + this.display + ", updated=" + this.updated + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.recordStartTimestamp);
        parcel.writeLong(this.recordEndTimestamp);
        parcel.writeInt(this.totalSignalLen);
        parcel.writeInt(this.curFrameSnoreNum);
        parcel.writeInt(this.lastFrameSnoreNum);
        parcel.writeString(this.features);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.display);
        parcel.writeInt(this.updated);
    }

    public DBSnoreOsaModel(@NotNull String ssoid, @NotNull String dataClient, long j2, long j3, long j4, int i, int i2, int i3, @Nullable String str, int i4, long j5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataCreatedTimestamp = j2;
        this.recordStartTimestamp = j3;
        this.recordEndTimestamp = j4;
        this.totalSignalLen = i;
        this.curFrameSnoreNum = i2;
        this.lastFrameSnoreNum = i3;
        this.features = str;
        this.syncStatus = i4;
        this.modifiedTimestamp = j5;
        this.display = i5;
        this.updated = i6;
    }

    public DBSnoreOsaModel() {
        this("", "", 0L, 0L, 0L, 0, 0, 0, null, 0, 0L, 1, 0);
    }
}
