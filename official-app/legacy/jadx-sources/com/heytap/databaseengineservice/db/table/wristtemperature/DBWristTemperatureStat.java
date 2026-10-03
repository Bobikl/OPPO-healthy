package com.heytap.databaseengineservice.db.table.wristtemperature;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.time.ZoneId;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001GB¡\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\b\b\u0002\u0010.\u001a\u00020\t\u0012\b\b\u0002\u00101\u001a\u00020\t\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u000207\u0012\b\b\u0002\u0010>\u001a\u00020\t\u0012\b\b\u0002\u0010A\u001a\u000207¢\u0006\u0004\bD\u0010EJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010\"\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010(\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u0010.\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\"\u00101\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001a\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\"\u00108\u001a\u0002078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010>\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001a\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\"\u0010A\u001a\u0002078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\bB\u0010;\"\u0004\bC\u0010=¨\u0006H"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/wristtemperature/DBWristTemperatureStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "dataClient", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "clientModel", "getClientModel", "setClientModel", "date", "I", "getDate", "()I", "setDate", "(I)V", "timezone", "getTimezone", "setTimezone", "dayBaseLineWristTemperature", "getDayBaseLineWristTemperature", "setDayBaseLineWristTemperature", "confidence", "getConfidence", "setConfidence", "wristTemperature", "getWristTemperature", "setWristTemperature", "min", "getMin", "setMin", "max", "getMax", "setMax", DBWristTemperatureStat.SYMPTOMS, "getSymptoms", "setSymptoms", DBWristTemperatureStat.ACTIONS, "getActions", "setActions", "", "updateTimestamp", "J", "getUpdateTimestamp", "()J", "setUpdateTimestamp", "(J)V", "syncStatus", "getSyncStatus", "setSyncStatus", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIIIIIIJIJ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "date"}, tableName = DBWristTemperatureStat.TABLE_NAME)
public final class DBWristTemperatureStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final String ACTIONS = "actions";

    @NotNull
    public static final String CLIENT_MODEL = "client_model";

    @NotNull
    public static final String CONFIDENCE = "confidence";

    @NotNull
    public static final String DATA_CLIENT = "data_client";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String DAY_BASELINE_VALUE = "day_baseline_value";

    @NotNull
    public static final String MAX = "max_value";

    @NotNull
    public static final String MIN = "min_value";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYMPTOMS = "symptoms";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBWristTemperatureStat";

    @NotNull
    public static final String TIMEZONE = "timezone";

    @NotNull
    public static final String UPDATE_TIMESTAMP = "update_timestamp";

    @NotNull
    public static final String VALUE = "value";

    @ColumnInfo(name = ACTIONS)
    private int actions;

    @ColumnInfo(name = "client_model")
    @Nullable
    private String clientModel;

    @ColumnInfo(name = "confidence")
    private int confidence;

    @ColumnInfo(name = "data_client")
    @Nullable
    private String dataClient;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = DAY_BASELINE_VALUE)
    private int dayBaseLineWristTemperature;

    @ColumnInfo(name = "max_value")
    private int max;

    @ColumnInfo(name = "min_value")
    private int min;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = SYMPTOMS)
    private int symptoms;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = "timezone")
    @NotNull
    private String timezone;

    @ColumnInfo(name = "update_timestamp")
    private long updateTimestamp;

    @ColumnInfo(name = "value")
    private int wristTemperature;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBWristTemperatureStat> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/wristtemperature/DBWristTemperatureStat$a;", "", "", "a", "ACTIONS", "Ljava/lang/String;", "CLIENT_MODEL", "CONFIDENCE", "DATA_CLIENT", "DATE", "DAY_BASELINE_VALUE", "MAX", "MIN", "MODIFIED_TIMESTAMP", PdfViewActivity.SSOID, "SYMPTOMS", "SYNC_STATUS", "TABLE_NAME", "TIMEZONE", "UPDATE_TIMESTAMP", "VALUE", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBWristTemperatureStat(ssoid TEXT not null,data_client TEXT,client_model TEXT,date INTEGER not null,timezone TEXT not null,day_baseline_value INTEGER not null,value INTEGER not null,confidence INTEGER not null,min_value INTEGER not null,max_value INTEGER not null,symptoms INTEGER not null,actions INTEGER not null,update_timestamp INTEGER not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBWristTemperatureStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBWristTemperatureStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBWristTemperatureStat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBWristTemperatureStat[] newArray(int i) {
            return new DBWristTemperatureStat[i];
        }
    }

    public DBWristTemperatureStat() {
        this(null, null, null, 0, null, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0L, 32767, null);
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

    public final int getActions() {
        return this.actions;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDayBaseLineWristTemperature() {
        return this.dayBaseLineWristTemperature;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSymptoms() {
        return this.symptoms;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    public final String getTimezone() {
        return this.timezone;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public final int getWristTemperature() {
        return this.wristTemperature;
    }

    public final void setActions(int i) {
        this.actions = i;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setConfidence(int i) {
        this.confidence = i;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDayBaseLineWristTemperature(int i) {
        this.dayBaseLineWristTemperature = i;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSymptoms(int i) {
        this.symptoms = i;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTimezone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timezone = str;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setWristTemperature(int i) {
        this.wristTemperature = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBWristTemperatureStat(ssoid='" + this.ssoid + "', dataClient=" + this.dataClient + ", clientModel=" + this.clientModel + ", date=" + this.date + ", timezone='" + this.timezone + "', dayBaseLineWristTemperature=" + this.dayBaseLineWristTemperature + ", confidence=" + this.confidence + ", wristTemperature=" + this.wristTemperature + ", min=" + this.min + ", max=" + this.max + ", symptoms=" + this.symptoms + ", actions=" + this.actions + ", updateTimestamp=" + this.updateTimestamp + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeInt(this.date);
        parcel.writeString(this.timezone);
        parcel.writeInt(this.dayBaseLineWristTemperature);
        parcel.writeInt(this.confidence);
        parcel.writeInt(this.wristTemperature);
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
        parcel.writeInt(this.symptoms);
        parcel.writeInt(this.actions);
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DBWristTemperatureStat(String str, String str2, String str3, int i, String str4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, long j3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String id;
        String str5 = (i10 & 1) != 0 ? "" : str;
        String str6 = (i10 & 2) != 0 ? null : str2;
        String str7 = (i10 & 4) == 0 ? str3 : null;
        int i11 = (i10 & 8) != 0 ? 0 : i;
        if ((i10 & 16) != 0) {
            id = ZoneId.systemDefault().getId();
            Intrinsics.checkNotNullExpressionValue(id, "systemDefault().id");
        } else {
            id = str4;
        }
        this(str5, str6, str7, i11, id, (i10 & 32) != 0 ? 0 : i2, (i10 & 64) != 0 ? 0 : i3, (i10 & 128) != 0 ? 0 : i4, (i10 & 256) != 0 ? 0 : i5, (i10 & 512) != 0 ? 0 : i6, (i10 & 1024) != 0 ? 0 : i7, (i10 & 2048) != 0 ? 0 : i8, (i10 & 4096) != 0 ? 0L : j2, (i10 & 8192) == 0 ? i9 : 0, (i10 & 16384) == 0 ? j3 : 0L);
    }

    public DBWristTemperatureStat(@NotNull String ssoid, @Nullable String str, @Nullable String str2, int i, @NotNull String timezone, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.ssoid = ssoid;
        this.dataClient = str;
        this.clientModel = str2;
        this.date = i;
        this.timezone = timezone;
        this.dayBaseLineWristTemperature = i2;
        this.confidence = i3;
        this.wristTemperature = i4;
        this.min = i5;
        this.max = i6;
        this.symptoms = i7;
        this.actions = i8;
        this.updateTimestamp = j2;
        this.syncStatus = i9;
        this.modifiedTimestamp = j3;
    }
}
