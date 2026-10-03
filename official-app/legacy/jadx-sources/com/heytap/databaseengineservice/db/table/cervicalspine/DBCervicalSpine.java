package com.heytap.databaseengineservice.db.table.cervicalspine;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DB\u008d\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010)\u001a\u00020\u0010\u0012\b\b\u0002\u0010,\u001a\u00020\u0010\u0012\b\b\u0002\u0010/\u001a\u00020\u0010\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\b\b\u0002\u00105\u001a\u00020\u0010\u0012\b\b\u0002\u00108\u001a\u00020\u0010\u0012\b\b\u0002\u0010;\u001a\u00020\u0005¢\u0006\u0004\b@\u0010AB\t\b\u0016¢\u0006\u0004\b@\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\"\u0010/\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\"\u00102\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u00105\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010$\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R\"\u00108\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010$\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\"\u0010;\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0019\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006E"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/cervicalspine/DBCervicalSpine;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "getEndTimestamp", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mEndTimestamp", "setEndTimestamp", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "startTimestamp", "J", "endTimestamp", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "lowHeadSeconds", "I", "getLowHeadSeconds", "()I", "setLowHeadSeconds", "(I)V", "wearSeconds", "getWearSeconds", "setWearSeconds", "goodSeconds", "getGoodSeconds", "setGoodSeconds", "mildSeconds", "getMildSeconds", "setMildSeconds", "heavySeconds", "getHeavySeconds", "setHeavySeconds", "lowHeadPercent", "getLowHeadPercent", "setLowHeadPercent", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IIIIIIIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "start_timestamp"}, tableName = DBCervicalSpine.TABLE_NAME)
public final class DBCervicalSpine extends SportHealthData implements Parcelable {

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String END_TIMESTAMP = "end_timestamp";

    @NotNull
    public static final String GOOD_SECONDS = "good_seconds";

    @NotNull
    public static final String HEAVY_SECONDS = "heavy_seconds";

    @NotNull
    public static final String LOW_HEAD_PERCENT = "low_head_percent";

    @NotNull
    public static final String LOW_HEAD_SECONDS = "low_head_seconds";

    @NotNull
    public static final String MILD_SECONDS = "mild_seconds";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBCervicalSpine";

    @NotNull
    public static final String WEAR_SECONDS = "wear_seconds";

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "data_client")
    @Nullable
    private String dataClient;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = GOOD_SECONDS)
    private int goodSeconds;

    @ColumnInfo(name = HEAVY_SECONDS)
    private int heavySeconds;

    @ColumnInfo(name = LOW_HEAD_PERCENT)
    private int lowHeadPercent;

    @ColumnInfo(name = LOW_HEAD_SECONDS)
    private int lowHeadSeconds;

    @ColumnInfo(name = MILD_SECONDS)
    private int mildSeconds;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = WEAR_SECONDS)
    private int wearSeconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBCervicalSpine> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.cervicalspine.DBCervicalSpine$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/cervicalspine/DBCervicalSpine$a;", "", "", "a", "CLIENT_MODEL", "Ljava/lang/String;", "DATA_CLIENT", "END_TIMESTAMP", "GOOD_SECONDS", "HEAVY_SECONDS", "LOW_HEAD_PERCENT", "LOW_HEAD_SECONDS", "MILD_SECONDS", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "START_TIMESTAMP", "SYNC_STATUS", "TABLE_NAME", "WEAR_SECONDS", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBCervicalSpine(ssoid TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,data_client TEXT,client_model TEXT,low_head_seconds INTEGER not null,wear_seconds INTEGER not null,good_seconds INTEGER not null,mild_seconds INTEGER not null,heavy_seconds INTEGER not null,low_head_percent INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,start_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBCervicalSpine> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBCervicalSpine createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBCervicalSpine(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBCervicalSpine[] newArray(int i) {
            return new DBCervicalSpine[i];
        }
    }

    public /* synthetic */ DBCervicalSpine(String str, long j2, long j3, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j4, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0L : j2, (i8 & 4) != 0 ? 0L : j3, (i8 & 8) != 0 ? null : str2, (i8 & 16) == 0 ? str3 : null, (i8 & 32) != 0 ? 0 : i, (i8 & 64) != 0 ? 0 : i2, (i8 & 128) != 0 ? 0 : i3, (i8 & 256) != 0 ? 0 : i4, (i8 & 512) != 0 ? 0 : i5, (i8 & 1024) != 0 ? 0 : i6, (i8 & 2048) == 0 ? i7 : 0, (i8 & 4096) != 0 ? 0L : j4);
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

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getGoodSeconds() {
        return this.goodSeconds;
    }

    public final int getHeavySeconds() {
        return this.heavySeconds;
    }

    public final int getLowHeadPercent() {
        return this.lowHeadPercent;
    }

    public final int getLowHeadSeconds() {
        return this.lowHeadSeconds;
    }

    public final int getMildSeconds() {
        return this.mildSeconds;
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

    public final int getWearSeconds() {
        return this.wearSeconds;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setEndTimestamp(long mEndTimestamp) {
        this.endTimestamp = mEndTimestamp;
    }

    public final void setGoodSeconds(int i) {
        this.goodSeconds = i;
    }

    public final void setHeavySeconds(int i) {
        this.heavySeconds = i;
    }

    public final void setLowHeadPercent(int i) {
        this.lowHeadPercent = i;
    }

    public final void setLowHeadSeconds(int i) {
        this.lowHeadSeconds = i;
    }

    public final void setMildSeconds(int i) {
        this.mildSeconds = i;
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

    public final void setWearSeconds(int i) {
        this.wearSeconds = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBCervicalSpine(ssoid='" + this.ssoid + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", lowHeadSeconds=" + this.lowHeadSeconds + ", wearSeconds=" + this.wearSeconds + ", goodSeconds=" + this.goodSeconds + ", mildSeconds=" + this.mildSeconds + ", heavySeconds=" + this.heavySeconds + ", lowHeadPercent=" + this.lowHeadPercent + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.lowHeadSeconds);
        parcel.writeInt(this.wearSeconds);
        parcel.writeInt(this.goodSeconds);
        parcel.writeInt(this.mildSeconds);
        parcel.writeInt(this.heavySeconds);
        parcel.writeInt(this.lowHeadPercent);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBCervicalSpine(@NotNull String ssoid, long j2, long j3, @Nullable String str, @Nullable String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = str;
        this.clientModel = str2;
        this.lowHeadSeconds = i;
        this.wearSeconds = i2;
        this.goodSeconds = i3;
        this.mildSeconds = i4;
        this.heavySeconds = i5;
        this.lowHeadPercent = i6;
        this.syncStatus = i7;
        this.modifiedTimestamp = j4;
    }

    public DBCervicalSpine() {
        this("", 0L, 0L, null, null, 0, 0, 0, 0, 0, 0, 0, 0L);
    }
}
