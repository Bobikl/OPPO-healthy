package com.heytap.databaseengineservice.db.table.thirdsportimport;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.accessory.file.model.Constant;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.nearx.tangramconfig.strategy.Fields;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001HBi\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\bE\u0010FJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003Jr\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0019\u0010)\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\"\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R$\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\b2\u0010\r\"\u0004\b3\u00104R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b5\u0010\r\"\u0004\b6\u00104R$\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\"\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/thirdsportimport/DBThirdSportImportRecord;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "mSsoid", "", "setSsoid", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "", "component8", "component9", "ssoid", "sportClientIdList", LogSenderConst.FILENAME, Constant.FILE_SIZE, "fileSource", "batchId", Fields.FILE_TYPE, "operationTime", "syncStatus", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JI)Lcom/heytap/databaseengineservice/db/table/thirdsportimport/DBThirdSportImportRecord;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/String;", "getSportClientIdList", "()Ljava/lang/String;", "setSportClientIdList", "(Ljava/lang/String;)V", "getFileName", "setFileName", "Ljava/lang/Integer;", "getFileSize", "setFileSize", "(Ljava/lang/Integer;)V", "getFileSource", "setFileSource", "getBatchId", "setBatchId", "getFileType", "setFileType", "J", "getOperationTime", "()J", "setOperationTime", "(J)V", "I", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JI)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", DBThirdSportImportRecord.OPERATION_TIME, "file_type"}, tableName = DBThirdSportImportRecord.TABLE_NAME)
public final /* data */ class DBThirdSportImportRecord extends SportHealthData implements Parcelable {

    @NotNull
    public static final String BATCH_ID = "batch_id";

    @NotNull
    public static final String FILE_NAME = "file_name";

    @NotNull
    public static final String FILE_SIZE = "file_size";

    @NotNull
    public static final String FILE_SOURCE = "file_source";

    @NotNull
    public static final String FILE_TYPE = "file_type";

    @NotNull
    public static final String OPERATION_TIME = "operation_time";

    @NotNull
    public static final String SPORT_CLIENT_ID_LIST = "sport_client_id_list";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBThirdSportImportRecord";

    @ColumnInfo(name = BATCH_ID)
    @Nullable
    private String batchId;

    @ColumnInfo(name = "file_name")
    @Nullable
    private String fileName;

    @ColumnInfo(name = FILE_SIZE)
    @Nullable
    private Integer fileSize;

    @ColumnInfo(name = "file_source")
    @Nullable
    private Integer fileSource;

    @ColumnInfo(name = "file_type")
    @NotNull
    private String fileType;

    @ColumnInfo(name = OPERATION_TIME)
    private long operationTime;

    @ColumnInfo(name = SPORT_CLIENT_ID_LIST)
    @NotNull
    private String sportClientIdList;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBThirdSportImportRecord> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.thirdsportimport.DBThirdSportImportRecord$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/thirdsportimport/DBThirdSportImportRecord$a;", "", "", "a", "BATCH_ID", "Ljava/lang/String;", "FILE_NAME", "FILE_SIZE", "FILE_SOURCE", "FILE_TYPE", "OPERATION_TIME", "SPORT_CLIENT_ID_LIST", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBThirdSportImportRecord(ssoid TEXT not null,sport_client_id_list TEXT not null,file_name TEXT,file_size INTEGER,file_source INTEGER,batch_id TEXT,file_type TEXT not null,operation_time INTEGER not null,sync_status INTEGER not null default 0,primary key(ssoid," + DBThirdSportImportRecord.OPERATION_TIME + ",file_type))";
            Intrinsics.checkNotNullExpressionValue(str, "sql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBThirdSportImportRecord> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBThirdSportImportRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBThirdSportImportRecord(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBThirdSportImportRecord[] newArray(int i) {
            return new DBThirdSportImportRecord[i];
        }
    }

    public DBThirdSportImportRecord() {
        this(null, null, null, null, null, null, null, 0L, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportClientIdList() {
        return this.sportClientIdList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFileSource() {
        return this.fileSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getOperationTime() {
        return this.operationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    public final DBThirdSportImportRecord copy(@NotNull String ssoid, @NotNull String sportClientIdList, @Nullable String fileName, @Nullable Integer fileSize, @Nullable Integer fileSource, @Nullable String batchId, @NotNull String fileType, long operationTime, int syncStatus) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(sportClientIdList, "sportClientIdList");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        return new DBThirdSportImportRecord(ssoid, sportClientIdList, fileName, fileSize, fileSource, batchId, fileType, operationTime, syncStatus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBThirdSportImportRecord)) {
            return false;
        }
        DBThirdSportImportRecord dBThirdSportImportRecord = (DBThirdSportImportRecord) other;
        return Intrinsics.areEqual(this.ssoid, dBThirdSportImportRecord.ssoid) && Intrinsics.areEqual(this.sportClientIdList, dBThirdSportImportRecord.sportClientIdList) && Intrinsics.areEqual(this.fileName, dBThirdSportImportRecord.fileName) && Intrinsics.areEqual(this.fileSize, dBThirdSportImportRecord.fileSize) && Intrinsics.areEqual(this.fileSource, dBThirdSportImportRecord.fileSource) && Intrinsics.areEqual(this.batchId, dBThirdSportImportRecord.batchId) && Intrinsics.areEqual(this.fileType, dBThirdSportImportRecord.fileType) && this.operationTime == dBThirdSportImportRecord.operationTime && this.syncStatus == dBThirdSportImportRecord.syncStatus;
    }

    @Nullable
    public final String getBatchId() {
        return this.batchId;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final Integer getFileSource() {
        return this.fileSource;
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    public final long getOperationTime() {
        return this.operationTime;
    }

    @NotNull
    public final String getSportClientIdList() {
        return this.sportClientIdList;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.sportClientIdList.hashCode()) * 31;
        String str = this.fileName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.fileSize;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fileSource;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.batchId;
        return ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.fileType.hashCode()) * 31) + Long.hashCode(this.operationTime)) * 31) + Integer.hashCode(this.syncStatus);
    }

    public final void setBatchId(@Nullable String str) {
        this.batchId = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFileSize(@Nullable Integer num) {
        this.fileSize = num;
    }

    public final void setFileSource(@Nullable Integer num) {
        this.fileSource = num;
    }

    public final void setFileType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileType = str;
    }

    public final void setOperationTime(long j2) {
        this.operationTime = j2;
    }

    public final void setSportClientIdList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sportClientIdList = str;
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
        return "DBThirdSportImportRecord(ssoid=" + this.ssoid + ", sportClientIdList=" + this.sportClientIdList + ", fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", fileSource=" + this.fileSource + ", batchId=" + this.batchId + ", fileType=" + this.fileType + ", operationTime=" + this.operationTime + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.sportClientIdList);
        parcel.writeString(this.fileName);
        Integer num = this.fileSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.fileSource;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.batchId);
        parcel.writeString(this.fileType);
        parcel.writeLong(this.operationTime);
        parcel.writeInt(this.syncStatus);
    }

    public /* synthetic */ DBThirdSportImportRecord(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "[]" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? 0L : j2, (i2 & 256) != 0 ? 0 : i);
    }

    public DBThirdSportImportRecord(@NotNull String ssoid, @NotNull String sportClientIdList, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @NotNull String fileType, long j2, int i) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(sportClientIdList, "sportClientIdList");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.ssoid = ssoid;
        this.sportClientIdList = sportClientIdList;
        this.fileName = str;
        this.fileSize = num;
        this.fileSource = num2;
        this.batchId = str2;
        this.fileType = fileType;
        this.operationTime = j2;
        this.syncStatus = i;
    }
}
