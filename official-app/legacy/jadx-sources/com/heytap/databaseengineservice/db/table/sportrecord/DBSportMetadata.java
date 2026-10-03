package com.heytap.databaseengineservice.db.table.sportrecord;

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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001UB\u0085\u0001\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0016\u0012\b\b\u0002\u0010%\u001a\u00020\u0016\u0012\b\b\u0002\u0010&\u001a\u00020\u0019\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010(\u001a\u00020\u0016\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bR\u0010SJ\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÂ\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0000J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0016HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0016HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0016HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010$\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010&\u001a\u00020\u00192\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010(\u001a\u00020\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0016HÖ\u0001J\u0013\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u00101\u001a\u00020\u0016HÖ\u0001J\u0019\u00105\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0016HÖ\u0001R\"\u0010\u001e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010;R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010;R\"\u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R$\u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u00106\u001a\u0004\b>\u00108\"\u0004\b?\u0010:R\"\u0010$\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010%\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\"\u0010&\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u00106\u001a\u0004\bL\u00108\"\u0004\bM\u0010:R\"\u0010(\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010@\u001a\u0004\bN\u0010B\"\u0004\bO\u0010DR$\u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u00106\u001a\u0004\bP\u00108\"\u0004\bQ\u0010:¨\u0006V"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sportrecord/DBSportMetadata;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "component2", "", "component3", "component4", "getSsoid", "getStartTimestamp", "getEndTimestamp", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mEndTimestamp", "setEndTimestamp", "copyData", "component1", "component5", "component6", "", "component7", "component8", "", "component9", "component10", "component11", "component12", "clientDataId", "ssoid", "startTimestamp", "endTimestamp", "dataClient", "clientModel", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "type", "value", "sportName", "abnormalTrack", DBSportMetadata.EXTENSION, "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "Ljava/lang/String;", "getClientDataId", "()Ljava/lang/String;", "setClientDataId", "(Ljava/lang/String;)V", "J", "getDataClient", "setDataClient", "getClientModel", "setClientModel", "I", "getSportMode", "()I", "setSportMode", "(I)V", "getType", "setType", "D", "getValue", "()D", "setValue", "(D)V", "getSportName", "setSportName", "getAbnormalTrack", "setAbnormalTrack", "getExtension", "setExtension", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IIDLjava/lang/String;ILjava/lang/String;)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", DBSportMetadata.CLIENT_DATA_ID, "start_timestamp", "end_timestamp", "sport_mode", "type"}, tableName = DBSportMetadata.TABLE_NAME)
public final /* data */ class DBSportMetadata extends SportHealthData implements Parcelable {

    @NotNull
    public static final String ABNORMAL_TRACK = "abnormal_track";

    @NotNull
    public static final String CLIENT_DATA_ID = "client_data_id";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String END_TIMESTAMP = "end_timestamp";

    @NotNull
    public static final String EXTENSION = "extension";

    @NotNull
    public static final String SPORT_MODE = "sport_mode";

    @NotNull
    public static final String SPORT_NAME = "sport_name";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String TABLE_NAME = "DBSportMetadata";

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String VALUE = "value";

    @ColumnInfo(name = ABNORMAL_TRACK)
    private int abnormalTrack;

    @ColumnInfo(name = CLIENT_DATA_ID)
    @NotNull
    private String clientDataId;

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = EXTENSION)
    @Nullable
    private String extension;

    @ColumnInfo(name = "sport_mode")
    private int sportMode;

    @ColumnInfo(name = SPORT_NAME)
    @Nullable
    private String sportName;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "value")
    private double value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBSportMetadata> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sportrecord/DBSportMetadata$a;", "", "", "a", "ABNORMAL_TRACK", "Ljava/lang/String;", "CLIENT_DATA_ID", "CLIENT_MODEL", "DATA_CLIENT", "END_TIMESTAMP", "EXTENSION", "SPORT_MODE", "SPORT_NAME", PdfViewActivity.SSOID, "START_TIMESTAMP", "TABLE_NAME", "TYPE", "VALUE", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSportMetadata(ssoid TEXT not null,client_data_id TEXT not null,data_client TEXT not null,client_model TEXT,start_timestamp INTEGER not null,end_timestamp INTEGER not null,sport_mode INTEGER not null,type INTEGER not null,value REAL not null,sport_name TEXT,abnormal_track INTEGER not null,extension TEXT,primary key(ssoid,data_client," + DBSportMetadata.CLIENT_DATA_ID + ",start_timestamp,end_timestamp,sport_mode,type))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBSportMetadata> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBSportMetadata createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBSportMetadata(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBSportMetadata[] newArray(int i) {
            return new DBSportMetadata[i];
        }
    }

    public DBSportMetadata() {
        this(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @JvmStatic
    @NotNull
    public static final String createTable() {
        return INSTANCE.a();
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientDataId() {
        return this.clientDataId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getClientModel() {
        return this.clientModel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @NotNull
    public final DBSportMetadata copy(@NotNull String clientDataId, @NotNull String ssoid, long startTimestamp, long endTimestamp, @NotNull String dataClient, @Nullable String clientModel, int sportMode, int type, double value, @Nullable String sportName, int abnormalTrack, @Nullable String extension) {
        Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new DBSportMetadata(clientDataId, ssoid, startTimestamp, endTimestamp, dataClient, clientModel, sportMode, type, value, sportName, abnormalTrack, extension);
    }

    @NotNull
    public final DBSportMetadata copyData() {
        DBSportMetadata dBSportMetadata = new DBSportMetadata(null, null, 0L, 0L, null, null, 0, 0, 0.0d, null, 0, null, 4095, null);
        dBSportMetadata.ssoid = this.ssoid;
        dBSportMetadata.dataClient = this.dataClient;
        dBSportMetadata.clientModel = this.clientModel;
        dBSportMetadata.startTimestamp = this.startTimestamp;
        dBSportMetadata.endTimestamp = this.endTimestamp;
        dBSportMetadata.clientDataId = this.clientDataId;
        dBSportMetadata.sportMode = this.sportMode;
        dBSportMetadata.sportName = this.sportName;
        dBSportMetadata.abnormalTrack = this.abnormalTrack;
        dBSportMetadata.extension = this.extension;
        dBSportMetadata.type = this.type;
        dBSportMetadata.value = this.value;
        return dBSportMetadata;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBSportMetadata)) {
            return false;
        }
        DBSportMetadata dBSportMetadata = (DBSportMetadata) other;
        return Intrinsics.areEqual(this.clientDataId, dBSportMetadata.clientDataId) && Intrinsics.areEqual(this.ssoid, dBSportMetadata.ssoid) && this.startTimestamp == dBSportMetadata.startTimestamp && this.endTimestamp == dBSportMetadata.endTimestamp && Intrinsics.areEqual(this.dataClient, dBSportMetadata.dataClient) && Intrinsics.areEqual(this.clientModel, dBSportMetadata.clientModel) && this.sportMode == dBSportMetadata.sportMode && this.type == dBSportMetadata.type && Double.compare(this.value, dBSportMetadata.value) == 0 && Intrinsics.areEqual(this.sportName, dBSportMetadata.sportName) && this.abnormalTrack == dBSportMetadata.abnormalTrack && Intrinsics.areEqual(this.extension, dBSportMetadata.extension);
    }

    public final int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    @NotNull
    public final String getClientDataId() {
        return this.clientDataId;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    @Nullable
    public final String getSportName() {
        return this.sportName;
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

    public final int getType() {
        return this.type;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.clientDataId.hashCode() * 31) + this.ssoid.hashCode()) * 31) + Long.hashCode(this.startTimestamp)) * 31) + Long.hashCode(this.endTimestamp)) * 31) + this.dataClient.hashCode()) * 31;
        String str = this.clientModel;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.sportMode)) * 31) + Integer.hashCode(this.type)) * 31) + Double.hashCode(this.value)) * 31;
        String str2 = this.sportName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.abnormalTrack)) * 31;
        String str3 = this.extension;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAbnormalTrack(int i) {
        this.abnormalTrack = i;
    }

    public final void setClientDataId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientDataId = str;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setEndTimestamp(long mEndTimestamp) {
        this.endTimestamp = mEndTimestamp;
    }

    public final void setExtension(@Nullable String str) {
        this.extension = str;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    public final void setSportName(@Nullable String str) {
        this.sportName = str;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(double d) {
        this.value = d;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBSportMetadata(clientDataId=" + this.clientDataId + ", ssoid=" + this.ssoid + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", sportMode=" + this.sportMode + ", type=" + this.type + ", value=" + this.value + ", sportName=" + this.sportName + ", abnormalTrack=" + this.abnormalTrack + ", extension=" + this.extension + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.clientDataId);
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.sportMode);
        parcel.writeInt(this.type);
        parcel.writeDouble(this.value);
        parcel.writeString(this.sportName);
        parcel.writeInt(this.abnormalTrack);
        parcel.writeString(this.extension);
    }

    public /* synthetic */ DBSportMetadata(String str, String str2, long j2, long j3, String str3, String str4, int i, int i2, double d, String str5, int i3, String str6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0L : j2, (i4 & 8) == 0 ? j3 : 0L, (i4 & 16) == 0 ? str3 : "", (i4 & 32) != 0 ? null : str4, (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? 0.0d : d, (i4 & 512) != 0 ? null : str5, (i4 & 1024) == 0 ? i3 : 0, (i4 & 2048) != 0 ? null : str6);
    }

    public DBSportMetadata(@NotNull String clientDataId, @NotNull String ssoid, long j2, long j3, @NotNull String dataClient, @Nullable String str, int i, int i2, double d, @Nullable String str2, int i3, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.clientDataId = clientDataId;
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.sportMode = i;
        this.type = i2;
        this.value = d;
        this.sportName = str2;
        this.abnormalTrack = i3;
        this.extension = str3;
    }
}
