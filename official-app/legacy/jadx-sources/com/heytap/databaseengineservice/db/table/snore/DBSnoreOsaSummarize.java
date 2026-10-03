package com.heytap.databaseengineservice.db.table.snore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.aiunit.vision.c0;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b6\b\u0007\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001^BÛ\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010 \u001a\u00020\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u00100\u001a\u00020)\u0012\b\b\u0002\u00103\u001a\u00020\t\u0012\b\b\u0002\u00106\u001a\u00020\t\u0012\b\b\u0002\u00109\u001a\u00020)\u0012\b\b\u0002\u0010<\u001a\u00020\t\u0012\b\b\u0002\u0010?\u001a\u00020)\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010E\u001a\u00020\t\u0012\b\b\u0002\u0010H\u001a\u00020\t\u0012\b\b\u0002\u0010K\u001a\u00020\t\u0012\b\b\u0002\u0010N\u001a\u00020\t\u0012\b\b\u0002\u0010Q\u001a\u00020\u0016\u0012\b\b\u0002\u0010T\u001a\u00020\t\u0012\b\b\u0002\u0010W\u001a\u00020\t¢\u0006\u0004\bZ\u0010[B\t\b\u0016¢\u0006\u0004\bZ\u0010\\J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00103\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&\"\u0004\b5\u0010(R\"\u00106\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\"\u00109\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010$\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\"\u0010?\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010+\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R$\u0010B\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0010\u001a\u0004\bC\u0010\u0013\"\u0004\bD\u0010\u0015R\"\u0010E\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010$\u001a\u0004\bF\u0010&\"\u0004\bG\u0010(R\"\u0010H\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010$\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R\"\u0010K\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010$\u001a\u0004\bL\u0010&\"\u0004\bM\u0010(R\"\u0010N\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010$\u001a\u0004\bO\u0010&\"\u0004\bP\u0010(R\"\u0010Q\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0018\u001a\u0004\bR\u0010\u001a\"\u0004\bS\u0010\u001cR\"\u0010T\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010$\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R\"\u0010W\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010$\u001a\u0004\bX\u0010&\"\u0004\bY\u0010(¨\u0006_"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/snore/DBSnoreOsaSummarize;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "", "dataCreatedTimestamp", "J", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "recordStartTimestamp", "getRecordStartTimestamp", "setRecordStartTimestamp", "recordEndTimestamp", "getRecordEndTimestamp", "setRecordEndTimestamp", "resultCode", "I", "getResultCode", "()I", "setResultCode", "(I)V", "", DBSnoreOsaSummarize.AI, UserInfo.SEX_FEMALE, "getAi", "()F", "setAi", "(F)V", DBSnoreOsaSummarize.REI, "getRei", "setRei", "snoreNum", "getSnoreNum", "setSnoreNum", "validSignalLen", "getValidSignalLen", "setValidSignalLen", "snoreFreq", "getSnoreFreq", "setSnoreFreq", "totalSignalLen", "getTotalSignalLen", "setTotalSignalLen", "meanRespRate", "getMeanRespRate", "setMeanRespRate", "snoreFeats", "getSnoreFeats", "setSnoreFeats", "silencedRatio", "getSilencedRatio", "setSilencedRatio", "silencedTime", "getSilencedTime", "setSilencedTime", "audioStates", "getAudioStates", "setAudioStates", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "display", "getDisplay", "setDisplay", "updated", "getUpdated", "setUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJIFFIIFIFLjava/lang/String;IIIIJII)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "data_created_timestamp"}, tableName = DBSnoreOsaSummarize.TABLE_NAME)
public final class DBSnoreOsaSummarize extends SportHealthData implements Parcelable {

    @NotNull
    public static final String AI = "ai";

    @NotNull
    public static final String AUDIO_STATES = "audio_states";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATA_CREATED_TIMESTAMP = "data_created_timestamp";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String MEAN_RESP_RATE = "mean_resp_rate";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String RECORD_END_TIMESTAMP = "record_end_timestamp";

    @NotNull
    public static final String RECORD_START_TIMESTAMP = "record_start_timestamp";

    @NotNull
    public static final String REI = "rei";

    @NotNull
    public static final String RESULT_CODE = "result_code";

    @NotNull
    public static final String SILENCED_RATIO = "silenced_ratio";

    @NotNull
    public static final String SILENCED_TIME = "silenced_time";

    @NotNull
    public static final String SNORE_FEATURES = "snore_features";

    @NotNull
    public static final String SNORE_FREQ = "snore_freq";

    @NotNull
    public static final String SNORE_NUM = "snore_num";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBSnoreOsaSummarize";

    @NotNull
    public static final String TOTAL_SIGNAL_LEN = "total_signal_len";

    @NotNull
    public static final String UPDATED = "updated";

    @NotNull
    public static final String VALID_SIGNAL_LEN = "valid_signal_len";

    @ColumnInfo(name = AI)
    private float ai;

    @ColumnInfo(name = AUDIO_STATES)
    private int audioStates;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "data_created_timestamp")
    private long dataCreatedTimestamp;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = MEAN_RESP_RATE)
    private float meanRespRate;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "record_end_timestamp")
    private long recordEndTimestamp;

    @ColumnInfo(name = "record_start_timestamp")
    private long recordStartTimestamp;

    @ColumnInfo(name = REI)
    private float rei;

    @ColumnInfo(name = "result_code")
    private int resultCode;

    @ColumnInfo(name = SILENCED_RATIO)
    private int silencedRatio;

    @ColumnInfo(name = SILENCED_TIME)
    private int silencedTime;

    @ColumnInfo(name = SNORE_FEATURES)
    @Nullable
    private String snoreFeats;

    @ColumnInfo(name = SNORE_FREQ)
    private float snoreFreq;

    @ColumnInfo(name = SNORE_NUM)
    private int snoreNum;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "total_signal_len")
    private int totalSignalLen;

    @ColumnInfo(name = "updated")
    private int updated;

    @ColumnInfo(name = VALID_SIGNAL_LEN)
    private int validSignalLen;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSnoreOsaSummarize> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.snore.DBSnoreOsaSummarize$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005¨\u0006\u001d"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/snore/DBSnoreOsaSummarize$a;", "", "", "a", c0.SPNAME, "Ljava/lang/String;", "AUDIO_STATES", "DATA_CLIENT", "DATA_CREATED_TIMESTAMP", "DISPLAY", "MEAN_RESP_RATE", "MODIFIED_TIMESTAMP", "RECORD_END_TIMESTAMP", "RECORD_START_TIMESTAMP", "REI", "RESULT_CODE", "SILENCED_RATIO", "SILENCED_TIME", "SNORE_FEATURES", "SNORE_FREQ", "SNORE_NUM", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "TOTAL_SIGNAL_LEN", "UPDATED", "VALID_SIGNAL_LEN", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSnoreOsaSummarize(ssoid TEXT not null,data_client TEXT not null,data_created_timestamp INTEGER not null,record_start_timestamp INTEGER not null,record_end_timestamp INTEGER not null,result_code INTEGER not null,ai REAL not null,rei REAL not null,snore_num INTEGER not null,valid_signal_len INTEGER not null,snore_freq REAL not null,total_signal_len INTEGER not null,mean_resp_rate REAL not null,snore_features TEXT,sync_status INTEGER not null,modified_timestamp INTEGER not null,display INTEGER not null,updated INTEGER not null,primary key(ssoid,data_client,data_created_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSnoreOsaSummarize> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSnoreOsaSummarize createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSnoreOsaSummarize(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readFloat(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSnoreOsaSummarize[] newArray(int i) {
            return new DBSnoreOsaSummarize[i];
        }
    }

    public /* synthetic */ DBSnoreOsaSummarize(String str, String str2, long j2, long j3, long j4, int i, float f, float f2, int i2, int i3, float f3, int i4, float f4, String str3, int i5, int i6, int i7, int i8, long j5, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) == 0 ? str2 : "", (i11 & 4) != 0 ? 0L : j2, (i11 & 8) != 0 ? 0L : j3, (i11 & 16) != 0 ? 0L : j4, (i11 & 32) != 0 ? 0 : i, (i11 & 64) != 0 ? 0.0f : f, (i11 & 128) != 0 ? 0.0f : f2, (i11 & 256) != 0 ? 0 : i2, (i11 & 512) != 0 ? 0 : i3, (i11 & 1024) != 0 ? 0.0f : f3, (i11 & 2048) != 0 ? 0 : i4, (i11 & 4096) != 0 ? 0.0f : f4, (i11 & 8192) != 0 ? null : str3, (i11 & 16384) != 0 ? 0 : i5, (i11 & 32768) != 0 ? 0 : i6, (i11 & 65536) != 0 ? 0 : i7, (i11 & 131072) != 0 ? 0 : i8, (i11 & 262144) != 0 ? 0L : j5, (i11 & 524288) != 0 ? 1 : i9, (i11 & 1048576) != 0 ? 0 : i10);
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

    public final float getAi() {
        return this.ai;
    }

    public final int getAudioStates() {
        return this.audioStates;
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

    public final float getMeanRespRate() {
        return this.meanRespRate;
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

    public final float getRei() {
        return this.rei;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final int getSilencedRatio() {
        return this.silencedRatio;
    }

    public final int getSilencedTime() {
        return this.silencedTime;
    }

    @Nullable
    public final String getSnoreFeats() {
        return this.snoreFeats;
    }

    public final float getSnoreFreq() {
        return this.snoreFreq;
    }

    public final int getSnoreNum() {
        return this.snoreNum;
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

    public final int getValidSignalLen() {
        return this.validSignalLen;
    }

    public final void setAi(float f) {
        this.ai = f;
    }

    public final void setAudioStates(int i) {
        this.audioStates = i;
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

    public final void setMeanRespRate(float f) {
        this.meanRespRate = f;
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

    public final void setRei(float f) {
        this.rei = f;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setSilencedRatio(int i) {
        this.silencedRatio = i;
    }

    public final void setSilencedTime(int i) {
        this.silencedTime = i;
    }

    public final void setSnoreFeats(@Nullable String str) {
        this.snoreFeats = str;
    }

    public final void setSnoreFreq(float f) {
        this.snoreFreq = f;
    }

    public final void setSnoreNum(int i) {
        this.snoreNum = i;
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

    public final void setValidSignalLen(int i) {
        this.validSignalLen = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSnoreOsaSummarize(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", recordStartTimestamp=" + this.recordStartTimestamp + ", recordEndTimestamp=" + this.recordEndTimestamp + ", resultCode=" + this.resultCode + ", ai=" + this.ai + ", rei=" + this.rei + ", snoreNum=" + this.snoreNum + ", validSignalLen=" + this.validSignalLen + ", snoreFreq=" + this.snoreFreq + ", totalSignalLen=" + this.totalSignalLen + ", meanRespRate=" + this.meanRespRate + ", snoreFeats=" + this.snoreFeats + ", silencedRatio=" + this.silencedRatio + ", silencedTime=" + this.silencedTime + ", audioStates=" + this.audioStates + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", display=" + this.display + ", updated=" + this.updated + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.recordStartTimestamp);
        parcel.writeLong(this.recordEndTimestamp);
        parcel.writeInt(this.resultCode);
        parcel.writeFloat(this.ai);
        parcel.writeFloat(this.rei);
        parcel.writeInt(this.snoreNum);
        parcel.writeInt(this.validSignalLen);
        parcel.writeFloat(this.snoreFreq);
        parcel.writeInt(this.totalSignalLen);
        parcel.writeFloat(this.meanRespRate);
        parcel.writeString(this.snoreFeats);
        parcel.writeInt(this.silencedRatio);
        parcel.writeInt(this.silencedTime);
        parcel.writeInt(this.audioStates);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.display);
        parcel.writeInt(this.updated);
    }

    public DBSnoreOsaSummarize(@NotNull String ssoid, @NotNull String dataClient, long j2, long j3, long j4, int i, float f, float f2, int i2, int i3, float f3, int i4, float f4, @Nullable String str, int i5, int i6, int i7, int i8, long j5, int i9, int i10) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.dataCreatedTimestamp = j2;
        this.recordStartTimestamp = j3;
        this.recordEndTimestamp = j4;
        this.resultCode = i;
        this.ai = f;
        this.rei = f2;
        this.snoreNum = i2;
        this.validSignalLen = i3;
        this.snoreFreq = f3;
        this.totalSignalLen = i4;
        this.meanRespRate = f4;
        this.snoreFeats = str;
        this.silencedRatio = i5;
        this.silencedTime = i6;
        this.audioStates = i7;
        this.syncStatus = i8;
        this.modifiedTimestamp = j5;
        this.display = i9;
        this.updated = i10;
    }

    public DBSnoreOsaSummarize() {
        this("", "", 0L, 0L, 0L, 0, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0.0f, null, 0, 0, 0, 0, 0L, 1, 0);
    }
}
