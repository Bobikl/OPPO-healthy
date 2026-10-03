package com.heytap.databaseengineservice.db.table.healtharchives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.heytap.log.consts.LogSenderConst;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001JB\u007f\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0017\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\bG\u0010HJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\u0081\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0011HÆ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\u0019\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\"\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010*\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R$\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010*\u001a\u0004\b:\u0010,\"\u0004\b;\u0010.R$\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R$\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b>\u0010,\"\u0004\b?\u0010.R$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010*\u001a\u0004\b@\u0010,\"\u0004\bA\u0010.R\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006K"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthArchiveFile;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "toString", "component2", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "ssoid", "fileClintID", LogSenderConst.FILENAME, "docId", "index", "originalUrl", "localPath", "cropUrl", "enhanceUrl", "imageUrl", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/String;", "getFileClintID", "()Ljava/lang/String;", "setFileClintID", "(Ljava/lang/String;)V", "getFileName", "setFileName", "getDocId", "setDocId", "I", "getIndex", "()I", "setIndex", "(I)V", "getOriginalUrl", "setOriginalUrl", "getLocalPath", "setLocalPath", "getCropUrl", "setCropUrl", "getEnhanceUrl", "setEnhanceUrl", "getImageUrl", "setImageUrl", "J", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", DBHealthArchiveFile.CLIENT_FILE_ID}, tableName = DBHealthArchiveFile.TABLE_NAME)
public final /* data */ class DBHealthArchiveFile extends SportHealthData implements Parcelable {

    @NotNull
    public static final String CLIENT_FILE_ID = "client_file_id";

    @NotNull
    public static final String CROP_URI = "crop_uri";

    @NotNull
    public static final String DOC_ID = "doc_id";

    @NotNull
    public static final String ENHANCE_URI = "enhance_uri";

    @NotNull
    public static final String FILE_NAME = "file_name";

    @NotNull
    public static final String IMAGE_URI = "image_uri";

    @NotNull
    public static final String INDEX = "file_index";

    @NotNull
    public static final String LOCAL_PATH = "local_path";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String ORIGINAL_URI = "original_uri";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String TABLE_NAME = "DBHealthArchiveFile";

    @ColumnInfo(name = CROP_URI)
    @Nullable
    private String cropUrl;

    @ColumnInfo(name = "doc_id")
    @NotNull
    private String docId;

    @ColumnInfo(name = ENHANCE_URI)
    @Nullable
    private String enhanceUrl;

    @ColumnInfo(name = CLIENT_FILE_ID)
    @NotNull
    private String fileClintID;

    @ColumnInfo(name = "file_name")
    @NotNull
    private String fileName;

    @ColumnInfo(name = IMAGE_URI)
    @Nullable
    private String imageUrl;

    @ColumnInfo(name = "file_index")
    private int index;

    @ColumnInfo(name = LOCAL_PATH)
    @Nullable
    private String localPath;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = ORIGINAL_URI)
    @Nullable
    private String originalUrl;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBHealthArchiveFile> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveFile$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthArchiveFile$a;", "", "", "a", "CLIENT_FILE_ID", "Ljava/lang/String;", "CROP_URI", "DOC_ID", "ENHANCE_URI", "FILE_NAME", "IMAGE_URI", "INDEX", "LOCAL_PATH", "MODIFIED_TIMESTAMP", "ORIGINAL_URI", PdfViewActivity.SSOID, "TABLE_NAME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBHealthArchiveFile(ssoid TEXT not null,client_file_id TEXT not null,file_name TEXT not null,doc_id TEXT not null,file_index INTEGER not null,original_uri TEXT,local_path TEXT,crop_uri TEXT,enhance_uri TEXT,image_uri TEXT,modified_timestamp INTEGER not null,primary key(ssoid," + DBHealthArchiveFile.CLIENT_FILE_ID + "))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBHealthArchiveFile> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBHealthArchiveFile createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBHealthArchiveFile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBHealthArchiveFile[] newArray(int i) {
            return new DBHealthArchiveFile[i];
        }
    }

    public DBHealthArchiveFile() {
        this(null, null, null, null, 0, null, null, null, null, null, 0L, 2047, null);
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

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileClintID() {
        return this.fileClintID;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCropUrl() {
        return this.cropUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEnhanceUrl() {
        return this.enhanceUrl;
    }

    @NotNull
    public final DBHealthArchiveFile copy(@NonNull @NotNull String ssoid, @NonNull @NotNull String fileClintID, @NonNull @NotNull String fileName, @NonNull @NotNull String docId, @NonNull int index, @Nullable String originalUrl, @Nullable String localPath, @Nullable String cropUrl, @Nullable String enhanceUrl, @Nullable String imageUrl, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(fileClintID, "fileClintID");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new DBHealthArchiveFile(ssoid, fileClintID, fileName, docId, index, originalUrl, localPath, cropUrl, enhanceUrl, imageUrl, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBHealthArchiveFile)) {
            return false;
        }
        DBHealthArchiveFile dBHealthArchiveFile = (DBHealthArchiveFile) other;
        return Intrinsics.areEqual(this.ssoid, dBHealthArchiveFile.ssoid) && Intrinsics.areEqual(this.fileClintID, dBHealthArchiveFile.fileClintID) && Intrinsics.areEqual(this.fileName, dBHealthArchiveFile.fileName) && Intrinsics.areEqual(this.docId, dBHealthArchiveFile.docId) && this.index == dBHealthArchiveFile.index && Intrinsics.areEqual(this.originalUrl, dBHealthArchiveFile.originalUrl) && Intrinsics.areEqual(this.localPath, dBHealthArchiveFile.localPath) && Intrinsics.areEqual(this.cropUrl, dBHealthArchiveFile.cropUrl) && Intrinsics.areEqual(this.enhanceUrl, dBHealthArchiveFile.enhanceUrl) && Intrinsics.areEqual(this.imageUrl, dBHealthArchiveFile.imageUrl) && this.modifiedTimestamp == dBHealthArchiveFile.modifiedTimestamp;
    }

    @Nullable
    public final String getCropUrl() {
        return this.cropUrl;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final String getEnhanceUrl() {
        return this.enhanceUrl;
    }

    @NotNull
    public final String getFileClintID() {
        return this.fileClintID;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.ssoid.hashCode() * 31) + this.fileClintID.hashCode()) * 31) + this.fileName.hashCode()) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
        String str = this.originalUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cropUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enhanceUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setCropUrl(@Nullable String str) {
        this.cropUrl = str;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setEnhanceUrl(@Nullable String str) {
        this.enhanceUrl = str;
    }

    public final void setFileClintID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileClintID = str;
    }

    public final void setFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setOriginalUrl(@Nullable String str) {
        this.originalUrl = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBHealthArchiveFile(ssoid='" + this.ssoid + "', fileClintID='" + this.fileClintID + "', fileName='" + this.fileName + "', docId='" + this.docId + "', index='" + this.index + "', originalUrl='" + this.originalUrl + "', localPath=" + this.localPath + ", cropUrl='" + this.cropUrl + "', enhanceUrl='" + this.enhanceUrl + "', imageUrl='" + this.imageUrl + "', modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.fileClintID);
        parcel.writeString(this.fileName);
        parcel.writeString(this.docId);
        parcel.writeInt(this.index);
        parcel.writeString(this.originalUrl);
        parcel.writeString(this.localPath);
        parcel.writeString(this.cropUrl);
        parcel.writeString(this.enhanceUrl);
        parcel.writeString(this.imageUrl);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBHealthArchiveFile(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) != 0 ? null : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? 0L : j2);
    }

    public DBHealthArchiveFile(@NonNull @NotNull String ssoid, @NonNull @NotNull String fileClintID, @NonNull @NotNull String fileName, @NonNull @NotNull String docId, @NonNull int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(fileClintID, "fileClintID");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.ssoid = ssoid;
        this.fileClintID = fileClintID;
        this.fileName = fileName;
        this.docId = docId;
        this.index = i;
        this.originalUrl = str;
        this.localPath = str2;
        this.cropUrl = str3;
        this.enhanceUrl = str4;
        this.imageUrl = str5;
        this.modifiedTimestamp = j2;
    }
}
