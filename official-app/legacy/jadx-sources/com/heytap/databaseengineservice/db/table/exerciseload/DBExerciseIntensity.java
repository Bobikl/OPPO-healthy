package com.heytap.databaseengineservice.db.table.exerciseload;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0006\n\u0002\b,\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0001YBÁ\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010D\u001a\u00020\u0005\u0012\b\b\u0002\u0010I\u001a\u00020\u0010\u0012\b\b\u0002\u0010L\u001a\u00020\u0010\u0012\b\b\u0002\u0010O\u001a\u00020\u0010\u0012\b\b\u0002\u0010R\u001a\u00020\u0005¢\u0006\u0004\bU\u0010VB\t\b\u0016¢\u0006\u0004\bU\u0010WJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0000J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R$\u00108\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R$\u0010;\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010#\u001a\u0004\b<\u0010%\"\u0004\b=\u0010'R$\u0010>\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010#\u001a\u0004\b?\u0010%\"\u0004\b@\u0010'R$\u0010A\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010#\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\"\u0010D\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010!\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010)\u001a\u0004\bJ\u0010+\"\u0004\bK\u0010-R\"\u0010L\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010)\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R\"\u0010O\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010)\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010-R\"\u0010R\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010!\u001a\u0004\bS\u0010F\"\u0004\bT\u0010H¨\u0006Z"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/exerciseload/DBExerciseIntensity;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mapValue", "", "sameValue", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "startTimestamp", "J", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "Ljava/lang/Integer;", "getSportMode", "()Ljava/lang/Integer;", "setSportMode", "(Ljava/lang/Integer;)V", "duration", "I", "getDuration", "()I", "setDuration", "(I)V", "", "value", "Ljava/lang/Double;", "getValue", "()Ljava/lang/Double;", "setValue", "(Ljava/lang/Double;)V", "rawExerciseIntensity", "getRawExerciseIntensity", "setRawExerciseIntensity", "algoExerciseLoad", "getAlgoExerciseLoad", "setAlgoExerciseLoad", "algoResult", "getAlgoResult", "setAlgoResult", "flashId", "getFlashId", "setFlashId", "modifySource", "getModifySource", "setModifySource", "updateTimestamp", "getUpdateTimestamp", "()J", "setUpdateTimestamp", "(J)V", "syncToDevice", "getSyncToDevice", "setSyncToDevice", "display", "getDisplay", "setDisplay", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JIIIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "start_timestamp"}, tableName = DBExerciseIntensity.TABLE_NAME)
public final class DBExerciseIntensity extends SportHealthData implements Parcelable {

    @NotNull
    public static final String ALGO_EXERCISE_LOAD = "algo_exercise_load";

    @NotNull
    public static final String ALGO_RESULT = "algo_result";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String DURATION = "duration";

    @NotNull
    public static final String FLASH_ID = "flash_id";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String MODIFY_SOURCE = "modify_source";

    @NotNull
    public static final String RAW_EXERCISE_INTENSITY = "raw_exercise_intensity";

    @NotNull
    public static final String SPORT_MODE = "sport_mode";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String SYNC_TO_DEVICE = "sync_to_device";

    @NotNull
    public static final String TABLE_NAME = "DBExerciseIntensity";

    @NotNull
    public static final String UPDATE_TIMESTAMP = "update_timestamp";

    @NotNull
    public static final String VALUE = "value";

    @ColumnInfo(name = ALGO_EXERCISE_LOAD)
    @Nullable
    private Integer algoExerciseLoad;

    @ColumnInfo(name = ALGO_RESULT)
    @Nullable
    private Integer algoResult;

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "duration")
    private int duration;

    @ColumnInfo(name = FLASH_ID)
    @Nullable
    private Integer flashId;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = MODIFY_SOURCE)
    @Nullable
    private Integer modifySource;

    @ColumnInfo(name = RAW_EXERCISE_INTENSITY)
    @Nullable
    private Integer rawExerciseIntensity;

    @ColumnInfo(name = "sport_mode")
    @Nullable
    private Integer sportMode;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = SYNC_TO_DEVICE)
    private int syncToDevice;

    @ColumnInfo(name = "update_timestamp")
    private long updateTimestamp;

    @ColumnInfo(name = "value")
    @Nullable
    private Double value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBExerciseIntensity> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.exerciseload.DBExerciseIntensity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/exerciseload/DBExerciseIntensity$a;", "", "", "a", "ALGO_EXERCISE_LOAD", "Ljava/lang/String;", "ALGO_RESULT", "CLIENT_MODEL", "DATA_CLIENT", "DISPLAY", "DURATION", "FLASH_ID", "MODIFIED_TIMESTAMP", "MODIFY_SOURCE", "RAW_EXERCISE_INTENSITY", "SPORT_MODE", PdfViewActivity.SSOID, "START_TIMESTAMP", "SYNC_STATUS", "SYNC_TO_DEVICE", "TABLE_NAME", "UPDATE_TIMESTAMP", "VALUE", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBExerciseIntensity(ssoid TEXT not null,data_client TEXT not null,client_model TEXT,start_timestamp INTEGER not null,duration INTEGER not null,value REAL,update_timestamp INTEGER not null,sync_to_device INTEGER not null,display INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client,start_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBExerciseIntensity> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBExerciseIntensity createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBExerciseIntensity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBExerciseIntensity[] newArray(int i) {
            return new DBExerciseIntensity[i];
        }
    }

    public /* synthetic */ DBExerciseIntensity(String str, String str2, String str3, long j2, Integer num, int i, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, long j3, int i2, int i3, int i4, long j4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) == 0 ? str2 : "", (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? 0L : j2, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? null : d, (i5 & 128) != 0 ? null : num2, (i5 & 256) != 0 ? null : num3, (i5 & 512) != 0 ? null : num4, (i5 & 1024) != 0 ? null : num5, (i5 & 2048) != 0 ? null : num6, (i5 & 4096) != 0 ? 0L : j3, (i5 & 8192) != 0 ? 0 : i2, (i5 & 16384) != 0 ? 1 : i3, (i5 & 32768) != 0 ? 0 : i4, (i5 & 65536) != 0 ? 0L : j4);
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
    public final Integer getAlgoExerciseLoad() {
        return this.algoExerciseLoad;
    }

    @Nullable
    public final Integer getAlgoResult() {
        return this.algoResult;
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

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getFlashId() {
        return this.flashId;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final Integer getModifySource() {
        return this.modifySource;
    }

    @Nullable
    public final Integer getRawExerciseIntensity() {
        return this.rawExerciseIntensity;
    }

    @Nullable
    public final Integer getSportMode() {
        return this.sportMode;
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

    public final int getSyncToDevice() {
        return this.syncToDevice;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    @Nullable
    public final Double getValue() {
        return this.value;
    }

    public final boolean sameValue(@Nullable DBExerciseIntensity mapValue) {
        return mapValue != null && this.startTimestamp == mapValue.startTimestamp && Intrinsics.areEqual(this.sportMode, mapValue.sportMode) && this.duration == mapValue.duration && Intrinsics.areEqual(this.value, mapValue.value) && this.display == mapValue.display;
    }

    public final void setAlgoExerciseLoad(@Nullable Integer num) {
        this.algoExerciseLoad = num;
    }

    public final void setAlgoResult(@Nullable Integer num) {
        this.algoResult = num;
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

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setFlashId(@Nullable Integer num) {
        this.flashId = num;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setModifySource(@Nullable Integer num) {
        this.modifySource = num;
    }

    public final void setRawExerciseIntensity(@Nullable Integer num) {
        this.rawExerciseIntensity = num;
    }

    public final void setSportMode(@Nullable Integer num) {
        this.sportMode = num;
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

    public final void setSyncToDevice(int i) {
        this.syncToDevice = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setValue(@Nullable Double d) {
        this.value = d;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBExerciseIntensity(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", startTimestamp=" + this.startTimestamp + ", sportMode=" + this.sportMode + ", duration=" + this.duration + ", value=" + this.value + ", rawExerciseIntensity=" + this.rawExerciseIntensity + ", algoExerciseLoad=" + this.algoExerciseLoad + ", algoResult=" + this.algoResult + ", flashId=" + this.flashId + ", modifySource=" + this.modifySource + ", updateTimestamp=" + this.updateTimestamp + ", syncToDevice=" + this.syncToDevice + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeLong(this.startTimestamp);
        Integer num = this.sportMode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.duration);
        Double d = this.value;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Integer num2 = this.rawExerciseIntensity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.algoExerciseLoad;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.algoResult;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.flashId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.modifySource;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.syncToDevice);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBExerciseIntensity(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, long j2, @Nullable Integer num, int i, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, long j3, int i2, int i3, int i4, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.startTimestamp = j2;
        this.sportMode = num;
        this.duration = i;
        this.value = d;
        this.rawExerciseIntensity = num2;
        this.algoExerciseLoad = num3;
        this.algoResult = num4;
        this.flashId = num5;
        this.modifySource = num6;
        this.updateTimestamp = j3;
        this.syncToDevice = i2;
        this.display = i3;
        this.syncStatus = i4;
        this.modifiedTimestamp = j4;
    }

    public DBExerciseIntensity() {
        this("", "", null, 0L, null, 0, null, null, null, null, null, null, 0L, 0, 1, 0, 0L);
    }
}
