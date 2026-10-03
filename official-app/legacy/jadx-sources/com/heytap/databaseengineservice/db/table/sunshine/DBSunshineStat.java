package com.heytap.databaseengineservice.db.table.sunshine;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0001`B\u009f\u0001\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0010\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010$\u001a\u00020\u0010\u0012\b\b\u0002\u0010%\u001a\u00020\u0010\u0012\b\b\u0002\u0010&\u001a\u00020\u0016\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\b\b\u0002\u0010)\u001a\u00020\u0010\u0012\b\b\u0002\u0010*\u001a\u00020\u0010\u0012\b\b\u0002\u0010+\u001a\u00020\u0010\u0012\b\b\u0002\u0010,\u001a\u00020\u0016¢\u0006\u0004\b\\\u0010]B\t\b\u0016¢\u0006\u0004\b\\\u0010^J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0000J\b\u0010\r\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0010HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0016HÆ\u0003J¡\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\u00102\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020\u00102\b\b\u0002\u0010,\u001a\u00020\u0016HÆ\u0001J\t\u0010.\u001a\u00020\u0010HÖ\u0001J\u0013\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00102\u001a\u00020\u0010HÖ\u0001J\u0019\u00106\u001a\u00020\b2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u00107R\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u00107\u001a\u0004\b<\u00109\"\u0004\b=\u0010;R\"\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010>\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010$\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010>\u001a\u0004\bG\u0010@\"\u0004\bH\u0010BR\"\u0010%\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR\"\u0010&\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010>\u001a\u0004\bP\u0010@\"\u0004\bQ\u0010BR\"\u0010(\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010>\u001a\u0004\bR\u0010@\"\u0004\bS\u0010BR\"\u0010)\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010>\u001a\u0004\bT\u0010@\"\u0004\bU\u0010BR\"\u0010*\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010>\u001a\u0004\bV\u0010@\"\u0004\bW\u0010BR\"\u0010+\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010>\u001a\u0004\bX\u0010@\"\u0004\bY\u0010BR\"\u0010,\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010K\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010O¨\u0006a"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sunshine/DBSunshineStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component1", "getSsoid", "getDeviceUniqueId", "mSsoid", "", "setSsoid", "mapValue", "", "sameValue", "toString", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "ssoid", "dataClient", "clientModel", "date", "totalDuration", "targetDuration", "vitaminD", "vitaminDIngestion", "vitaminDIngestionTime", "avgVD", "goalComplete", "favoriteTime", "sunshineType", "syncStatus", "modifiedTimestamp", "copy", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/String;", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "getClientModel", "setClientModel", "I", "getDate", "()I", "setDate", "(I)V", "getTotalDuration", "setTotalDuration", "getTargetDuration", "setTargetDuration", "getVitaminD", "setVitaminD", "getVitaminDIngestion", "setVitaminDIngestion", "J", "getVitaminDIngestionTime", "()J", "setVitaminDIngestionTime", "(J)V", "getAvgVD", "setAvgVD", "getGoalComplete", "setGoalComplete", "getFavoriteTime", "setFavoriteTime", "getSunshineType", "setSunshineType", "getSyncStatus", "setSyncStatus", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIJIIIIIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "date"}, tableName = DBSunshineStat.TABLE_NAME)
public final /* data */ class DBSunshineStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final String AVG_V_D = "avg_v_d";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String FAVORITE_TIME = "favorite_time";

    @NotNull
    public static final String GOAL_COMPLETE = "goal_complete";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SUNSHINE_TYPE = "sunshine_type";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBSunshineStat";

    @NotNull
    public static final String TARGET_DURATION = "target_duration";

    @NotNull
    public static final String TOTAL_DURATION = "total_duration";

    @NotNull
    public static final String VITAMIN_D = "vitamin_d";

    @NotNull
    public static final String VITAMIN_D_INGESTION = "vitamin_d_ingestion";

    @NotNull
    public static final String VITAMIN_D_INGESTION_TIME = "vitamin_d_ingestion_time";

    @ColumnInfo(name = AVG_V_D)
    private int avgVD;

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = FAVORITE_TIME)
    private int favoriteTime;

    @ColumnInfo(name = GOAL_COMPLETE)
    private int goalComplete;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = SUNSHINE_TYPE)
    private int sunshineType;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = TARGET_DURATION)
    private int targetDuration;

    @ColumnInfo(name = TOTAL_DURATION)
    private int totalDuration;

    @ColumnInfo(name = VITAMIN_D)
    private int vitaminD;

    @ColumnInfo(name = "vitamin_d_ingestion")
    private int vitaminDIngestion;

    @ColumnInfo(name = VITAMIN_D_INGESTION_TIME)
    private long vitaminDIngestionTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSunshineStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sunshine/DBSunshineStat$a;", "", "", "a", "AVG_V_D", "Ljava/lang/String;", "CLIENT_MODEL", "DATA_CLIENT", "DATE", "FAVORITE_TIME", "GOAL_COMPLETE", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "SUNSHINE_TYPE", "SYNC_STATUS", "TABLE_NAME", "TARGET_DURATION", "TOTAL_DURATION", "VITAMIN_D", "VITAMIN_D_INGESTION", "VITAMIN_D_INGESTION_TIME", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSunshineStat(ssoid TEXT not null,data_client TEXT not null,client_model TEXT,date INTEGER not null,total_duration INTEGER not null,target_duration INTEGER not null,vitamin_d INTEGER not null,vitamin_d_ingestion INTEGER not null,vitamin_d_ingestion_time INTEGER not null,avg_v_d INTEGER not null,goal_complete INTEGER not null,favorite_time INTEGER not null,sunshine_type INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,data_client,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSunshineStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSunshineStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSunshineStat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSunshineStat[] newArray(int i) {
            return new DBSunshineStat[i];
        }
    }

    public /* synthetic */ DBSunshineStat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) == 0 ? str2 : "", (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? 0 : i, (i11 & 16) != 0 ? 0 : i2, (i11 & 32) != 0 ? 0 : i3, (i11 & 64) != 0 ? 0 : i4, (i11 & 128) != 0 ? 0 : i5, (i11 & 256) != 0 ? 0L : j2, (i11 & 512) != 0 ? 0 : i6, (i11 & 1024) != 0 ? 0 : i7, (i11 & 2048) != 0 ? 0 : i8, (i11 & 4096) != 0 ? 0 : i9, (i11 & 8192) != 0 ? 0 : i10, (i11 & 16384) != 0 ? 0L : j3);
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

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getAvgVD() {
        return this.avgVD;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getGoalComplete() {
        return this.goalComplete;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFavoriteTime() {
        return this.favoriteTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSunshineType() {
        return this.sunshineType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientModel() {
        return this.clientModel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTargetDuration() {
        return this.targetDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVitaminD() {
        return this.vitaminD;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getVitaminDIngestion() {
        return this.vitaminDIngestion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getVitaminDIngestionTime() {
        return this.vitaminDIngestionTime;
    }

    @NotNull
    public final DBSunshineStat copy(@NotNull String ssoid, @NotNull String dataClient, @Nullable String clientModel, int date, int totalDuration, int targetDuration, int vitaminD, int vitaminDIngestion, long vitaminDIngestionTime, int avgVD, int goalComplete, int favoriteTime, int sunshineType, int syncStatus, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new DBSunshineStat(ssoid, dataClient, clientModel, date, totalDuration, targetDuration, vitaminD, vitaminDIngestion, vitaminDIngestionTime, avgVD, goalComplete, favoriteTime, sunshineType, syncStatus, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBSunshineStat)) {
            return false;
        }
        DBSunshineStat dBSunshineStat = (DBSunshineStat) other;
        return Intrinsics.areEqual(this.ssoid, dBSunshineStat.ssoid) && Intrinsics.areEqual(this.dataClient, dBSunshineStat.dataClient) && Intrinsics.areEqual(this.clientModel, dBSunshineStat.clientModel) && this.date == dBSunshineStat.date && this.totalDuration == dBSunshineStat.totalDuration && this.targetDuration == dBSunshineStat.targetDuration && this.vitaminD == dBSunshineStat.vitaminD && this.vitaminDIngestion == dBSunshineStat.vitaminDIngestion && this.vitaminDIngestionTime == dBSunshineStat.vitaminDIngestionTime && this.avgVD == dBSunshineStat.avgVD && this.goalComplete == dBSunshineStat.goalComplete && this.favoriteTime == dBSunshineStat.favoriteTime && this.sunshineType == dBSunshineStat.sunshineType && this.syncStatus == dBSunshineStat.syncStatus && this.modifiedTimestamp == dBSunshineStat.modifiedTimestamp;
    }

    public final int getAvgVD() {
        return this.avgVD;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    public final int getFavoriteTime() {
        return this.favoriteTime;
    }

    public final int getGoalComplete() {
        return this.goalComplete;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSunshineType() {
        return this.sunshineType;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getTargetDuration() {
        return this.targetDuration;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public final int getVitaminD() {
        return this.vitaminD;
    }

    public final int getVitaminDIngestion() {
        return this.vitaminDIngestion;
    }

    public final long getVitaminDIngestionTime() {
        return this.vitaminDIngestionTime;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.dataClient.hashCode()) * 31;
        String str = this.clientModel;
        return ((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.date)) * 31) + Integer.hashCode(this.totalDuration)) * 31) + Integer.hashCode(this.targetDuration)) * 31) + Integer.hashCode(this.vitaminD)) * 31) + Integer.hashCode(this.vitaminDIngestion)) * 31) + Long.hashCode(this.vitaminDIngestionTime)) * 31) + Integer.hashCode(this.avgVD)) * 31) + Integer.hashCode(this.goalComplete)) * 31) + Integer.hashCode(this.favoriteTime)) * 31) + Integer.hashCode(this.sunshineType)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final boolean sameValue(@Nullable DBSunshineStat mapValue) {
        return mapValue != null && this.totalDuration == mapValue.totalDuration && this.targetDuration == mapValue.targetDuration && this.vitaminD == mapValue.vitaminD && this.vitaminDIngestion == mapValue.vitaminDIngestion && this.vitaminDIngestionTime == mapValue.vitaminDIngestionTime && this.avgVD == mapValue.avgVD && this.goalComplete == mapValue.goalComplete && this.favoriteTime == mapValue.favoriteTime && this.sunshineType == mapValue.sunshineType;
    }

    public final void setAvgVD(int i) {
        this.avgVD = i;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setFavoriteTime(int i) {
        this.favoriteTime = i;
    }

    public final void setGoalComplete(int i) {
        this.goalComplete = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSunshineType(int i) {
        this.sunshineType = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTargetDuration(int i) {
        this.targetDuration = i;
    }

    public final void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public final void setVitaminD(int i) {
        this.vitaminD = i;
    }

    public final void setVitaminDIngestion(int i) {
        this.vitaminDIngestion = i;
    }

    public final void setVitaminDIngestionTime(long j2) {
        this.vitaminDIngestionTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSunshineStat(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", date=" + this.date + ", totalDuration=" + this.totalDuration + ", targetDuration=" + this.targetDuration + ", vitaminD=" + this.vitaminD + ", vitaminDIngestion=" + this.vitaminDIngestion + ", vitaminDIngestionTime=" + this.vitaminDIngestionTime + ", avgVD=" + this.avgVD + ", goalComplete=" + this.goalComplete + ", favoriteTime=" + this.favoriteTime + ", sunshineType=" + this.sunshineType + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.date);
        parcel.writeInt(this.totalDuration);
        parcel.writeInt(this.targetDuration);
        parcel.writeInt(this.vitaminD);
        parcel.writeInt(this.vitaminDIngestion);
        parcel.writeLong(this.vitaminDIngestionTime);
        parcel.writeInt(this.avgVD);
        parcel.writeInt(this.goalComplete);
        parcel.writeInt(this.favoriteTime);
        parcel.writeInt(this.sunshineType);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBSunshineStat(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.date = i;
        this.totalDuration = i2;
        this.targetDuration = i3;
        this.vitaminD = i4;
        this.vitaminDIngestion = i5;
        this.vitaminDIngestionTime = j2;
        this.avgVD = i6;
        this.goalComplete = i7;
        this.favoriteTime = i8;
        this.sunshineType = i9;
        this.syncStatus = i10;
        this.modifiedTimestamp = j3;
    }

    public DBSunshineStat() {
        this("", "", null, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0, 0L);
    }
}
