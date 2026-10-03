package com.heytap.databaseengineservice.db.table.wristtemperature;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0081\u0001\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010)\u001a\u00020\u0010\u0012\b\b\u0002\u0010,\u001a\u00020\u0010\u0012\b\b\u0002\u0010/\u001a\u00020\u0010\u0012\b\b\u0002\u00102\u001a\u00020\u0010\u0012\b\b\u0002\u00105\u001a\u00020\u0005\u0012\b\b\u0002\u0010:\u001a\u00020\u0010¢\u0006\u0004\b=\u0010>B\t\b\u0016¢\u0006\u0004\b=\u0010?J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\"\u0010/\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\"\u00102\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u00105\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0019\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(¨\u0006B"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/wristtemperature/DBWristTemperature;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "", "getStartTimestamp", "getEndTimestamp", "mSsoid", "", "setSsoid", "mStartTimestamp", "setStartTimestamp", "mEndTimestamp", "setEndTimestamp", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "startTimestamp", "J", "endTimestamp", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "value", "I", "getValue", "()I", "setValue", "(I)V", "confidence", "getConfidence", "setConfidence", "status", "getStatus", "setStatus", "baseLine", "getBaseLine", "setBaseLine", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "display", "getDisplay", "setDisplay", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IIIIIJI)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "data_client", "start_timestamp"}, tableName = DBWristTemperature.TABLE_NAME)
public final class DBWristTemperature extends SportHealthData implements Parcelable {

    @NotNull
    public static final String BASE_LINE = "base_line";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String CONFIDENCE = "confidence";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DISPLAY = "display";

    @NotNull
    public static final String END_TIMESTAMP = "end_timestamp";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String START_TIMESTAMP = "start_timestamp";

    @NotNull
    public static final String STATUS = "status";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBWristTemperature";

    @NotNull
    public static final String VALUE = "value";

    @ColumnInfo(name = BASE_LINE)
    private int baseLine;

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "confidence")
    private int confidence;

    @ColumnInfo(name = "data_client")
    @NotNull
    private String dataClient;

    @ColumnInfo(name = "display")
    private int display;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    @ColumnInfo(name = "status")
    private int status;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "value")
    private int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBWristTemperature> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperature$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/wristtemperature/DBWristTemperature$a;", "", "", "a", "BASE_LINE", "Ljava/lang/String;", "CLIENT_MODEL", "CONFIDENCE", "DATA_CLIENT", "DISPLAY", "END_TIMESTAMP", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "START_TIMESTAMP", "STATUS", "SYNC_STATUS", "TABLE_NAME", "VALUE", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBWristTemperature(ssoid TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,data_client TEXT not null,client_model TEXT,value INTEGER not null,confidence INTEGER not null,status INTEGER not null,base_line INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,display INTEGER not null,primary key(ssoid,data_client,start_timestamp))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBWristTemperature> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBWristTemperature createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBWristTemperature(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBWristTemperature[] newArray(int i) {
            return new DBWristTemperature[i];
        }
    }

    public /* synthetic */ DBWristTemperature(String str, long j2, long j3, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j4, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? 0L : j2, (i7 & 4) != 0 ? 0L : j3, (i7 & 8) == 0 ? str2 : "", (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? 0 : i, (i7 & 64) != 0 ? 0 : i2, (i7 & 128) != 0 ? 0 : i3, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) == 0 ? i5 : 0, (i7 & 1024) == 0 ? j4 : 0L, (i7 & 2048) != 0 ? 1 : i6);
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

    public final int getBaseLine() {
        return this.baseLine;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDisplay() {
        return this.display;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
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

    public final int getStatus() {
        return this.status;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setBaseLine(int i) {
        this.baseLine = i;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setConfidence(int i) {
        this.confidence = i;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDisplay(int i) {
        this.display = i;
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

    public final void setStatus(int i) {
        this.status = i;
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
        return "DBWristTemperature(ssoid='" + this.ssoid + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", value=" + this.value + ", confidence=" + this.confidence + ", status=" + this.status + ", baseLine=" + this.baseLine + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.value);
        parcel.writeInt(this.confidence);
        parcel.writeInt(this.status);
        parcel.writeInt(this.baseLine);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
        parcel.writeInt(this.display);
    }

    public DBWristTemperature(@NotNull String ssoid, long j2, long j3, @NotNull String dataClient, @Nullable String str, int i, int i2, int i3, int i4, int i5, long j4, int i6) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.value = i;
        this.confidence = i2;
        this.status = i3;
        this.baseLine = i4;
        this.syncStatus = i5;
        this.modifiedTimestamp = j4;
        this.display = i6;
    }

    public DBWristTemperature() {
        this("", 0L, 0L, "", null, 0, 0, 0, 0, 0, 0L, 1);
    }
}
