package com.heytap.databaseengineservice.db.table.sleepdaystat;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.oplus.aiunit.vision.t04;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepPiece, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001'BC\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepPiece;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "getDeviceUniqueId", "", "getStartTimestamp", "getEndTimestamp", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "ssoid", "Ljava/lang/String;", t04.DEVICE_UNIQUE_ID, "startTimestamp", "J", "endTimestamp", "sleepType", "I", "getSleepType", "()I", "setSleepType", "(I)V", "", "stageSleepEnd", "Z", "getStageSleepEnd", "()Z", "setStageSleepEnd", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIZ)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "start_timestamp", "end_timestamp", "type"}, tableName = "DBSleepPiece")
public final class SleepPiece extends SportHealthData implements Parcelable {

    @ColumnInfo(name = DBAssessmentRecord.DEVICE_UNIQUE_ID)
    @NotNull
    private String deviceUniqueId;

    @ColumnInfo(name = "end_timestamp")
    private long endTimestamp;

    @ColumnInfo(name = "type")
    private int sleepType;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "stage_sleep_end")
    private boolean stageSleepEnd;

    @ColumnInfo(name = "start_timestamp")
    private long startTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<SleepPiece> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepPiece$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepPiece$a;", "", "", "a", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBSleepPiece(ssoid TEXT not null,device_unique_id TEXT not null,start_timestamp INTEGER not null,end_timestamp INTEGER not null,type INTEGER not null,stage_sleep_end INTEGER not null,primary key(ssoid,start_timestamp,end_timestamp,type))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepPiece$b */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SleepPiece> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepPiece createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SleepPiece(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepPiece[] newArray(int i) {
            return new SleepPiece[i];
        }
    }

    public SleepPiece() {
        this(null, null, 0L, 0L, 0, false, 63, null);
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

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final int getSleepType() {
        return this.sleepType;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final boolean getStageSleepEnd() {
        return this.stageSleepEnd;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setSleepType(int i) {
        this.sleepType = i;
    }

    public final void setStageSleepEnd(boolean z) {
        this.stageSleepEnd = z;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SleepPiece(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", sleepType=" + this.sleepType + ", stageSleepEnd=" + this.stageSleepEnd + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeLong(this.startTimestamp);
        parcel.writeLong(this.endTimestamp);
        parcel.writeInt(this.sleepType);
        parcel.writeInt(this.stageSleepEnd ? 1 : 0);
    }

    public /* synthetic */ SleepPiece(String str, String str2, long j2, long j3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? 0L : j3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z);
    }

    public SleepPiece(@NonNull @NotNull String ssoid, @NonNull @NotNull String deviceUniqueId, long j2, long j3, int i, boolean z) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        this.ssoid = ssoid;
        this.deviceUniqueId = deviceUniqueId;
        this.startTimestamp = j2;
        this.endTimestamp = j3;
        this.sleepType = i;
        this.stageSleepEnd = z;
    }
}
