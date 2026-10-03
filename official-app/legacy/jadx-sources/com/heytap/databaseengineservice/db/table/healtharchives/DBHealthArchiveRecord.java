package com.heytap.databaseengineservice.db.table.healtharchives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bA\b\u0087\b\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0002\u0086\u0001B©\u0002\u0012\b\b\u0003\u0010\"\u001a\u00020\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010$\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0013\u0012\b\b\u0002\u0010/\u001a\u00020\u0013\u0012\b\b\u0002\u00100\u001a\u00020\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00105\u001a\u00020\u0013\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00108\u001a\u00020\t\u0012\b\b\u0002\u00109\u001a\u00020\t\u0012\b\b\u0002\u0010:\u001a\u00020\t\u0012\b\b\u0002\u0010;\u001a\u00020\u0013¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0013HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0013HÆ\u0003J©\u0002\u0010<\u001a\u00020\u00002\b\b\u0003\u0010\"\u001a\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010.\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020\u00132\b\b\u0002\u00100\u001a\u00020\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00105\u001a\u00020\u00132\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t2\b\b\u0002\u0010;\u001a\u00020\u0013HÆ\u0001J\t\u0010=\u001a\u00020\tHÖ\u0001J\u0013\u0010A\u001a\u00020@2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010B\u001a\u00020\tHÖ\u0001J\u0019\u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\tHÖ\u0001R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010HR$\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010H\u001a\u0004\bM\u0010J\"\u0004\bN\u0010LR\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010H\u001a\u0004\bT\u0010J\"\u0004\bU\u0010LR\"\u0010'\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010O\u001a\u0004\bV\u0010Q\"\u0004\bW\u0010SR$\u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010H\u001a\u0004\bX\u0010J\"\u0004\bY\u0010LR$\u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010H\u001a\u0004\bZ\u0010J\"\u0004\b[\u0010LR$\u0010*\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010H\u001a\u0004\b\\\u0010J\"\u0004\b]\u0010LR$\u0010+\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010H\u001a\u0004\b^\u0010J\"\u0004\b_\u0010LR$\u0010,\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010H\u001a\u0004\b`\u0010J\"\u0004\ba\u0010LR$\u0010-\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010H\u001a\u0004\bb\u0010J\"\u0004\bc\u0010LR\"\u0010.\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010/\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010d\u001a\u0004\bi\u0010f\"\u0004\bj\u0010hR\"\u00100\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010O\u001a\u0004\bk\u0010Q\"\u0004\bl\u0010SR$\u00101\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010H\u001a\u0004\bm\u0010J\"\u0004\bn\u0010LR$\u00102\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010H\u001a\u0004\bo\u0010J\"\u0004\bp\u0010LR$\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010H\u001a\u0004\bq\u0010J\"\u0004\br\u0010LR$\u00104\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010H\u001a\u0004\bs\u0010J\"\u0004\bt\u0010LR\"\u00105\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010d\u001a\u0004\bu\u0010f\"\u0004\bv\u0010hR$\u00106\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010H\u001a\u0004\bw\u0010J\"\u0004\bx\u0010LR$\u00107\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010H\u001a\u0004\by\u0010J\"\u0004\bz\u0010LR\"\u00108\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010O\u001a\u0004\b{\u0010Q\"\u0004\b|\u0010SR\"\u00109\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010O\u001a\u0004\b}\u0010Q\"\u0004\b~\u0010SR#\u0010:\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0013\n\u0004\b:\u0010O\u001a\u0004\b\u007f\u0010Q\"\u0005\b\u0080\u0001\u0010SR$\u0010;\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b;\u0010d\u001a\u0005\b\u0081\u0001\u0010f\"\u0005\b\u0082\u0001\u0010h¨\u0006\u0087\u0001"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthArchiveRecord;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "toString", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "ssoid", "name", "docId", "fileSource", "type", "archiveType", "owner", DBHealthArchiveRecord.AGE, "sex", "institute", "structData", "clientFileList", "dataCreatedTimestamp", "uploadTimestamp", "tag", "originalTitle", "simplifyTitle", "imgUrl", "analysis", "analysisTimestamp", "suggestion", "guessQuestions", "syncStatus", "updated", "deleted", "modifiedTimestamp", "copy", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getDocId", "setDocId", "I", "getFileSource", "()I", "setFileSource", "(I)V", "getType", "setType", "getArchiveType", "setArchiveType", "getOwner", "setOwner", "getAge", "setAge", "getSex", "setSex", "getInstitute", "setInstitute", "getStructData", "setStructData", "getClientFileList", "setClientFileList", "J", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getUploadTimestamp", "setUploadTimestamp", "getTag", "setTag", "getOriginalTitle", "setOriginalTitle", "getSimplifyTitle", "setSimplifyTitle", "getImgUrl", "setImgUrl", "getAnalysis", "setAnalysis", "getAnalysisTimestamp", "setAnalysisTimestamp", "getSuggestion", "setSuggestion", "getGuessQuestions", "setGuessQuestions", "getSyncStatus", "setSyncStatus", "getUpdated", "setUpdated", "getDeleted", "setDeleted", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "doc_id"}, tableName = DBHealthArchiveRecord.TABLE_NAME)
public final /* data */ class DBHealthArchiveRecord extends SportHealthData implements Parcelable {

    @NotNull
    public static final String AGE = "age";

    @NotNull
    public static final String ANALYSIS = "analysis";

    @NotNull
    public static final String ANALYSIS_TIMESTAMP = "analysis_timestamp";

    @NotNull
    public static final String ARCHIVE_TYPE = "archive_type";

    @NotNull
    public static final String CLIENT_FILE_LIST = "client_file_list";

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DELETED = "deleted";

    @NotNull
    public static final String DOC_ID = "doc_id";

    @NotNull
    public static final String FILE_SOURCE = "file_source";

    @NotNull
    public static final String GUESS_QUESTIONS = "guess_questions";

    @NotNull
    public static final String IMAGE_URL = "image_url";

    @NotNull
    public static final String INSTITUTE = "institute";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String ORIGINAL_TITLE = "original_title";

    @NotNull
    public static final String OWNER = "owner";

    @NotNull
    public static final String SEX = "gender";

    @NotNull
    public static final String SIMPLIFY_TITLE = "simplify_title";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String STRUCT_DATA = "struct_data";

    @NotNull
    public static final String SUGGESTION = "suggestion";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBHealthArchiveRecord";

    @NotNull
    public static final String TAG = "tag";

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String UPDATED = "updated";

    @NotNull
    public static final String UPLOAD_TIMESTAMP = "upload_timestamp";

    @ColumnInfo(name = AGE)
    @Nullable
    private String age;

    @ColumnInfo(name = "analysis")
    @Nullable
    private String analysis;

    @ColumnInfo(name = "analysis_timestamp")
    private long analysisTimestamp;

    @ColumnInfo(name = ARCHIVE_TYPE)
    private int archiveType;

    @ColumnInfo(name = CLIENT_FILE_LIST)
    @Nullable
    private String clientFileList;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "deleted")
    private int deleted;

    @ColumnInfo(name = "doc_id")
    @NotNull
    private String docId;

    @ColumnInfo(name = "file_source")
    private int fileSource;

    @ColumnInfo(name = "guess_questions")
    @Nullable
    private String guessQuestions;

    @ColumnInfo(name = IMAGE_URL)
    @Nullable
    private String imgUrl;

    @ColumnInfo(name = "institute")
    @Nullable
    private String institute;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "name")
    @Nullable
    private String name;

    @ColumnInfo(name = ORIGINAL_TITLE)
    @Nullable
    private String originalTitle;

    @ColumnInfo(name = "owner")
    @Nullable
    private String owner;

    @ColumnInfo(name = "gender")
    @Nullable
    private String sex;

    @ColumnInfo(name = SIMPLIFY_TITLE)
    @Nullable
    private String simplifyTitle;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = STRUCT_DATA)
    @Nullable
    private String structData;

    @ColumnInfo(name = "suggestion")
    @Nullable
    private String suggestion;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "tag")
    private int tag;

    @ColumnInfo(name = "type")
    @Nullable
    private String type;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = UPLOAD_TIMESTAMP)
    private long uploadTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBHealthArchiveRecord> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0005R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005¨\u0006\""}, d2 = {"Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthArchiveRecord$a;", "", "", "a", "AGE", "Ljava/lang/String;", "ANALYSIS", "ANALYSIS_TIMESTAMP", "ARCHIVE_TYPE", "CLIENT_FILE_LIST", "DATA_CREATED_TIMESTAMP", "DELETED", "DOC_ID", "FILE_SOURCE", "GUESS_QUESTIONS", "IMAGE_URL", "INSTITUTE", "MODIFIED_TIMESTAMP", "NAME", "ORIGINAL_TITLE", "OWNER", "SEX", "SIMPLIFY_TITLE", PdfViewActivity.SSOID, "STRUCT_DATA", "SUGGESTION", "SYNC_STATUS", "TABLE_NAME", "TAG", "TYPE", "UPDATED", "UPLOAD_TIMESTAMP", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBHealthArchiveRecord(ssoid TEXT not null,name TEXT,doc_id TEXT not null,file_source INTEGER not null,type TEXT,owner TEXT,age TEXT,gender TEXT,institute TEXT,struct_data TEXT,client_file_list TEXT,data_created_timestamp INTEGER NOT NULL,upload_timestamp INTEGER NOT NULL,tag INTEGER NOT NULL,image_url TEXT,analysis TEXT,analysis_timestamp INTEGER not null,suggestion TEXT,guess_questions TEXT,sync_status INTEGER NOT NULL,updated INTEGER NOT NULL,deleted INTEGER NOT NULL,modified_timestamp INTEGER not null,primary key(ssoid,doc_id))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBHealthArchiveRecord> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBHealthArchiveRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBHealthArchiveRecord(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBHealthArchiveRecord[] newArray(int i) {
            return new DBHealthArchiveRecord[i];
        }
    }

    public DBHealthArchiveRecord() {
        this(null, null, null, 0, null, 0, null, null, null, null, null, null, 0L, 0L, 0, null, null, null, null, 0L, null, null, 0, 0, 0, 0L, 67108863, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    public static /* synthetic */ DBHealthArchiveRecord copy$default(DBHealthArchiveRecord dBHealthArchiveRecord, String str, String str2, String str3, int i, String str4, int i2, String str5, String str6, String str7, String str8, String str9, String str10, long j2, long j3, int i3, String str11, String str12, String str13, String str14, long j4, String str15, String str16, int i4, int i5, int i6, long j5, int i7, Object obj) {
        String str17 = (i7 & 1) != 0 ? dBHealthArchiveRecord.ssoid : str;
        String str18 = (i7 & 2) != 0 ? dBHealthArchiveRecord.name : str2;
        String str19 = (i7 & 4) != 0 ? dBHealthArchiveRecord.docId : str3;
        int i8 = (i7 & 8) != 0 ? dBHealthArchiveRecord.fileSource : i;
        String str20 = (i7 & 16) != 0 ? dBHealthArchiveRecord.type : str4;
        int i9 = (i7 & 32) != 0 ? dBHealthArchiveRecord.archiveType : i2;
        String str21 = (i7 & 64) != 0 ? dBHealthArchiveRecord.owner : str5;
        String str22 = (i7 & 128) != 0 ? dBHealthArchiveRecord.age : str6;
        String str23 = (i7 & 256) != 0 ? dBHealthArchiveRecord.sex : str7;
        String str24 = (i7 & 512) != 0 ? dBHealthArchiveRecord.institute : str8;
        String str25 = (i7 & 1024) != 0 ? dBHealthArchiveRecord.structData : str9;
        String str26 = (i7 & 2048) != 0 ? dBHealthArchiveRecord.clientFileList : str10;
        long j6 = (i7 & 4096) != 0 ? dBHealthArchiveRecord.dataCreatedTimestamp : j2;
        long j7 = (i7 & 8192) != 0 ? dBHealthArchiveRecord.uploadTimestamp : j3;
        int i10 = (i7 & 16384) != 0 ? dBHealthArchiveRecord.tag : i3;
        return dBHealthArchiveRecord.copy(str17, str18, str19, i8, str20, i9, str21, str22, str23, str24, str25, str26, j6, j7, i10, (32768 & i7) != 0 ? dBHealthArchiveRecord.originalTitle : str11, (i7 & 65536) != 0 ? dBHealthArchiveRecord.simplifyTitle : str12, (i7 & 131072) != 0 ? dBHealthArchiveRecord.imgUrl : str13, (i7 & 262144) != 0 ? dBHealthArchiveRecord.analysis : str14, (i7 & 524288) != 0 ? dBHealthArchiveRecord.analysisTimestamp : j4, (i7 & 1048576) != 0 ? dBHealthArchiveRecord.suggestion : str15, (2097152 & i7) != 0 ? dBHealthArchiveRecord.guessQuestions : str16, (i7 & 4194304) != 0 ? dBHealthArchiveRecord.syncStatus : i4, (i7 & 8388608) != 0 ? dBHealthArchiveRecord.updated : i5, (i7 & 16777216) != 0 ? dBHealthArchiveRecord.deleted : i6, (i7 & 33554432) != 0 ? dBHealthArchiveRecord.modifiedTimestamp : j5);
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInstitute() {
        return this.institute;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStructData() {
        return this.structData;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getClientFileList() {
        return this.clientFileList;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOriginalTitle() {
        return this.originalTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSimplifyTitle() {
        return this.simplifyTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getAnalysis() {
        return this.analysis;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getUpdated() {
        return this.updated;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFileSource() {
        return this.fileSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getArchiveType() {
        return this.archiveType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final DBHealthArchiveRecord copy(@NonNull @NotNull String ssoid, @Nullable String name, @NonNull @NotNull String docId, int fileSource, @Nullable String type, int archiveType, @Nullable String owner, @Nullable String age, @Nullable String sex, @Nullable String institute, @Nullable String structData, @Nullable String clientFileList, long dataCreatedTimestamp, long uploadTimestamp, int tag, @Nullable String originalTitle, @Nullable String simplifyTitle, @Nullable String imgUrl, @Nullable String analysis, long analysisTimestamp, @Nullable String suggestion, @Nullable String guessQuestions, int syncStatus, int updated, int deleted, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new DBHealthArchiveRecord(ssoid, name, docId, fileSource, type, archiveType, owner, age, sex, institute, structData, clientFileList, dataCreatedTimestamp, uploadTimestamp, tag, originalTitle, simplifyTitle, imgUrl, analysis, analysisTimestamp, suggestion, guessQuestions, syncStatus, updated, deleted, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBHealthArchiveRecord)) {
            return false;
        }
        DBHealthArchiveRecord dBHealthArchiveRecord = (DBHealthArchiveRecord) other;
        return Intrinsics.areEqual(this.ssoid, dBHealthArchiveRecord.ssoid) && Intrinsics.areEqual(this.name, dBHealthArchiveRecord.name) && Intrinsics.areEqual(this.docId, dBHealthArchiveRecord.docId) && this.fileSource == dBHealthArchiveRecord.fileSource && Intrinsics.areEqual(this.type, dBHealthArchiveRecord.type) && this.archiveType == dBHealthArchiveRecord.archiveType && Intrinsics.areEqual(this.owner, dBHealthArchiveRecord.owner) && Intrinsics.areEqual(this.age, dBHealthArchiveRecord.age) && Intrinsics.areEqual(this.sex, dBHealthArchiveRecord.sex) && Intrinsics.areEqual(this.institute, dBHealthArchiveRecord.institute) && Intrinsics.areEqual(this.structData, dBHealthArchiveRecord.structData) && Intrinsics.areEqual(this.clientFileList, dBHealthArchiveRecord.clientFileList) && this.dataCreatedTimestamp == dBHealthArchiveRecord.dataCreatedTimestamp && this.uploadTimestamp == dBHealthArchiveRecord.uploadTimestamp && this.tag == dBHealthArchiveRecord.tag && Intrinsics.areEqual(this.originalTitle, dBHealthArchiveRecord.originalTitle) && Intrinsics.areEqual(this.simplifyTitle, dBHealthArchiveRecord.simplifyTitle) && Intrinsics.areEqual(this.imgUrl, dBHealthArchiveRecord.imgUrl) && Intrinsics.areEqual(this.analysis, dBHealthArchiveRecord.analysis) && this.analysisTimestamp == dBHealthArchiveRecord.analysisTimestamp && Intrinsics.areEqual(this.suggestion, dBHealthArchiveRecord.suggestion) && Intrinsics.areEqual(this.guessQuestions, dBHealthArchiveRecord.guessQuestions) && this.syncStatus == dBHealthArchiveRecord.syncStatus && this.updated == dBHealthArchiveRecord.updated && this.deleted == dBHealthArchiveRecord.deleted && this.modifiedTimestamp == dBHealthArchiveRecord.modifiedTimestamp;
    }

    @Nullable
    public final String getAge() {
        return this.age;
    }

    @Nullable
    public final String getAnalysis() {
        return this.analysis;
    }

    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    public final int getArchiveType() {
        return this.archiveType;
    }

    @Nullable
    public final String getClientFileList() {
        return this.clientFileList;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    public final int getFileSource() {
        return this.fileSource;
    }

    @Nullable
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getInstitute() {
        return this.institute;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOriginalTitle() {
        return this.originalTitle;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    public final String getSimplifyTitle() {
        return this.simplifyTitle;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Nullable
    public final String getStructData() {
        return this.structData;
    }

    @Nullable
    public final String getSuggestion() {
        return this.suggestion;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getTag() {
        return this.tag;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public final long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    public int hashCode() {
        int iHashCode = this.ssoid.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.fileSource)) * 31;
        String str2 = this.type;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.archiveType)) * 31;
        String str3 = this.owner;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.age;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.institute;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.structData;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.clientFileList;
        int iHashCode9 = (((((((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Long.hashCode(this.uploadTimestamp)) * 31) + Integer.hashCode(this.tag)) * 31;
        String str9 = this.originalTitle;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.simplifyTitle;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.imgUrl;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.analysis;
        int iHashCode13 = (((iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31) + Long.hashCode(this.analysisTimestamp)) * 31;
        String str13 = this.suggestion;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.guessQuestions;
        return ((((((((iHashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Integer.hashCode(this.updated)) * 31) + Integer.hashCode(this.deleted)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setAge(@Nullable String str) {
        this.age = str;
    }

    public final void setAnalysis(@Nullable String str) {
        this.analysis = str;
    }

    public final void setAnalysisTimestamp(long j2) {
        this.analysisTimestamp = j2;
    }

    public final void setArchiveType(int i) {
        this.archiveType = i;
    }

    public final void setClientFileList(@Nullable String str) {
        this.clientFileList = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setFileSource(int i) {
        this.fileSource = i;
    }

    public final void setGuessQuestions(@Nullable String str) {
        this.guessQuestions = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setInstitute(@Nullable String str) {
        this.institute = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOriginalTitle(@Nullable String str) {
        this.originalTitle = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setSex(@Nullable String str) {
        this.sex = str;
    }

    public final void setSimplifyTitle(@Nullable String str) {
        this.simplifyTitle = str;
    }

    public final void setStructData(@Nullable String str) {
        this.structData = str;
    }

    public final void setSuggestion(@Nullable String str) {
        this.suggestion = str;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTag(int i) {
        this.tag = i;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    public final void setUploadTimestamp(long j2) {
        this.uploadTimestamp = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBHealthArchiveRecord(ssoid='" + this.ssoid + "', name='" + this.name + "', docId='" + this.docId + "', fileSource='" + this.fileSource + "', type='" + this.type + "', archiveType='" + this.archiveType + "', owner='" + this.owner + "', age='" + this.age + "', sex='" + this.sex + "', institute='" + this.institute + "', structData='" + this.structData + "', clientFileList='" + this.clientFileList + "',dataCreatedTimestamp='" + this.dataCreatedTimestamp + "', uploadTimestamp='" + this.uploadTimestamp + "' tag='" + this.tag + "', imgUrl='" + this.imgUrl + "', syncStatus='" + this.syncStatus + "', updated='" + this.updated + "', deleted='" + this.deleted + "', modifiedTimestamp='" + this.modifiedTimestamp + "', analysis='" + this.analysis + "', analysisTimestamp='" + this.analysisTimestamp + "', suggestion='" + this.suggestion + "', guessQuestions='" + this.guessQuestions + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.name);
        parcel.writeString(this.docId);
        parcel.writeInt(this.fileSource);
        parcel.writeString(this.type);
        parcel.writeInt(this.archiveType);
        parcel.writeString(this.owner);
        parcel.writeString(this.age);
        parcel.writeString(this.sex);
        parcel.writeString(this.institute);
        parcel.writeString(this.structData);
        parcel.writeString(this.clientFileList);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.uploadTimestamp);
        parcel.writeInt(this.tag);
        parcel.writeString(this.originalTitle);
        parcel.writeString(this.simplifyTitle);
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.analysis);
        parcel.writeLong(this.analysisTimestamp);
        parcel.writeString(this.suggestion);
        parcel.writeString(this.guessQuestions);
        parcel.writeInt(this.syncStatus);
        parcel.writeInt(this.updated);
        parcel.writeInt(this.deleted);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ DBHealthArchiveRecord(String str, String str2, String str3, int i, String str4, int i2, String str5, String str6, String str7, String str8, String str9, String str10, long j2, long j3, int i3, String str11, String str12, String str13, String str14, long j4, String str15, String str16, int i4, int i5, int i6, long j5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) == 0 ? str3 : "", (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? -1 : i2, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & 256) != 0 ? null : str7, (i7 & 512) != 0 ? null : str8, (i7 & 1024) != 0 ? null : str9, (i7 & 2048) != 0 ? null : str10, (i7 & 4096) != 0 ? 0L : j2, (i7 & 8192) != 0 ? 0L : j3, (i7 & 16384) != 0 ? 0 : i3, (i7 & 32768) != 0 ? null : str11, (i7 & 65536) != 0 ? null : str12, (i7 & 131072) != 0 ? null : str13, (i7 & 262144) != 0 ? null : str14, (i7 & 524288) != 0 ? 0L : j4, (i7 & 1048576) != 0 ? null : str15, (i7 & 2097152) == 0 ? str16 : null, (i7 & 4194304) != 0 ? 0 : i4, (i7 & 8388608) != 0 ? 0 : i5, (i7 & 16777216) == 0 ? i6 : 0, (i7 & 33554432) == 0 ? j5 : 0L);
    }

    public DBHealthArchiveRecord(@NonNull @NotNull String ssoid, @Nullable String str, @NonNull @NotNull String docId, int i, @Nullable String str2, int i2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, long j2, long j3, int i3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, long j4, @Nullable String str13, @Nullable String str14, int i4, int i5, int i6, long j5) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.ssoid = ssoid;
        this.name = str;
        this.docId = docId;
        this.fileSource = i;
        this.type = str2;
        this.archiveType = i2;
        this.owner = str3;
        this.age = str4;
        this.sex = str5;
        this.institute = str6;
        this.structData = str7;
        this.clientFileList = str8;
        this.dataCreatedTimestamp = j2;
        this.uploadTimestamp = j3;
        this.tag = i3;
        this.originalTitle = str9;
        this.simplifyTitle = str10;
        this.imgUrl = str11;
        this.analysis = str12;
        this.analysisTimestamp = j4;
        this.suggestion = str13;
        this.guessQuestions = str14;
        this.syncStatus = i4;
        this.updated = i5;
        this.deleted = i6;
        this.modifiedTimestamp = j5;
    }
}
