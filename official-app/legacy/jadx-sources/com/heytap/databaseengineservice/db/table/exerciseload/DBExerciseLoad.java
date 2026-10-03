package com.heytap.databaseengineservice.db.table.exerciseload;

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
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00018Ba\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\u001a\u0012\b\b\u0002\u0010$\u001a\u00020\u001a\u0012\b\b\u0002\u0010'\u001a\u00020\u001a\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b4\u00105B\t\b\u0016¢\u0006\u0004\b4\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010'\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\"\u0010*\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/exerciseload/DBExerciseLoad;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "", "getSsoid", "mSsoid", "", "setSsoid", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "writeToParcel", "ssoid", "Ljava/lang/String;", "date", "I", "getDate", "()I", "setDate", "(I)V", "totalExerciseLoad", "getTotalExerciseLoad", "setTotalExerciseLoad", "", "acuteFatigueLoad", "D", "getAcuteFatigueLoad", "()D", "setAcuteFatigueLoad", "(D)V", "chronicTrainingLoad", "getChronicTrainingLoad", "setChronicTrainingLoad", "reasonableRangeLow", "getReasonableRangeLow", "setReasonableRangeLow", "reasonableRangeHigh", "getReasonableRangeHigh", "setReasonableRangeHigh", "syncStatus", "getSyncStatus", "setSyncStatus", "", "modifiedTimestamp", "J", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "<init>", "(Ljava/lang/String;IIDDDDIJ)V", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@Entity(primaryKeys = {"ssoid", "date"}, tableName = DBExerciseLoad.TABLE_NAME)
public final class DBExerciseLoad extends SportHealthData implements Parcelable {

    @NotNull
    public static final String ACUTE_FATIGUE_LOAD = "acute_fatigue_load";

    @NotNull
    public static final String CHRONIC_TRAINING_LOAD = "chronic_training_load";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String MODIFIED_TIMESTAMP = "modified_timestamp";

    @NotNull
    public static final String REASONABLE_RANGE_HIGH = "reasonable_range_high";

    @NotNull
    public static final String REASONABLE_RANGE_LOW = "reasonable_range_low";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String SYNC_STATUS = "sync_status";

    @NotNull
    public static final String TABLE_NAME = "DBExerciseLoad";

    @NotNull
    public static final String TOTAL_EXERCISE_LOAD = "total_exercise_load";

    @ColumnInfo(name = ACUTE_FATIGUE_LOAD)
    private double acuteFatigueLoad;

    @ColumnInfo(name = CHRONIC_TRAINING_LOAD)
    private double chronicTrainingLoad;

    @ColumnInfo(name = "date")
    private int date;

    @ColumnInfo(name = "modified_timestamp")
    private long modifiedTimestamp;

    @ColumnInfo(name = "reasonable_range_high")
    private double reasonableRangeHigh;

    @ColumnInfo(name = "reasonable_range_low")
    private double reasonableRangeLow;

    @ColumnInfo(name = "ssoid")
    @NotNull
    private String ssoid;

    @ColumnInfo(name = "sync_status")
    private int syncStatus;

    @ColumnInfo(name = TOTAL_EXERCISE_LOAD)
    private int totalExerciseLoad;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DBExerciseLoad> CREATOR = new b();

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.db.table.exerciseload.DBExerciseLoad$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/heytap/databaseengineservice/db/table/exerciseload/DBExerciseLoad$a;", "", "", "a", "ACUTE_FATIGUE_LOAD", "Ljava/lang/String;", "CHRONIC_TRAINING_LOAD", "DATE", "MODIFIED_TIMESTAMP", "REASONABLE_RANGE_HIGH", "REASONABLE_RANGE_LOW", PdfViewActivity.SSOID, "SYNC_STATUS", "TABLE_NAME", "TOTAL_EXERCISE_LOAD", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a() {
            String str = "create table if not exists DBExerciseLoad(ssoid TEXT not null,date INTEGER not null,total_exercise_load INTEGER not null,acute_fatigue_load REAL not null,chronic_training_load REAL not null,reasonable_range_low REAL not null,reasonable_range_high REAL not null,sync_status INTEGER not null,modified_timestamp INTEGER not null,primary key(ssoid,date))";
            Intrinsics.checkNotNullExpressionValue(str, "strSql.toString()");
            return str;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DBExerciseLoad> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBExerciseLoad createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DBExerciseLoad(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DBExerciseLoad[] newArray(int i) {
            return new DBExerciseLoad[i];
        }
    }

    public /* synthetic */ DBExerciseLoad(String str, int i, int i2, double d, double d2, double d3, double d4, int i3, long j2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0.0d : d, (i4 & 16) != 0 ? 0.0d : d2, (i4 & 32) != 0 ? 0.0d : d3, (i4 & 64) == 0 ? d4 : 0.0d, (i4 & 128) == 0 ? i3 : 0, (i4 & 256) != 0 ? 0L : j2);
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

    public final double getAcuteFatigueLoad() {
        return this.acuteFatigueLoad;
    }

    public final double getChronicTrainingLoad() {
        return this.chronicTrainingLoad;
    }

    public final int getDate() {
        return this.date;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final double getReasonableRangeHigh() {
        return this.reasonableRangeHigh;
    }

    public final double getReasonableRangeLow() {
        return this.reasonableRangeLow;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getTotalExerciseLoad() {
        return this.totalExerciseLoad;
    }

    public final void setAcuteFatigueLoad(double d) {
        this.acuteFatigueLoad = d;
    }

    public final void setChronicTrainingLoad(double d) {
        this.chronicTrainingLoad = d;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setReasonableRangeHigh(double d) {
        this.reasonableRangeHigh = d;
    }

    public final void setReasonableRangeLow(double d) {
        this.reasonableRangeLow = d;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setTotalExerciseLoad(int i) {
        this.totalExerciseLoad = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "DBExerciseLoad(ssoid='" + this.ssoid + "', date=" + this.date + ", totalExerciseLoad=" + this.totalExerciseLoad + ", acuteFatigueLoad=" + this.acuteFatigueLoad + ", chronicTrainingLoad=" + this.chronicTrainingLoad + ", reasonableRangeLow=" + this.reasonableRangeLow + ", reasonableRangeHigh=" + this.reasonableRangeHigh + ", syncStatus=" + this.syncStatus + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeInt(this.totalExerciseLoad);
        parcel.writeDouble(this.acuteFatigueLoad);
        parcel.writeDouble(this.chronicTrainingLoad);
        parcel.writeDouble(this.reasonableRangeLow);
        parcel.writeDouble(this.reasonableRangeHigh);
        parcel.writeInt(this.syncStatus);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public DBExerciseLoad(@NotNull String ssoid, int i, int i2, double d, double d2, double d3, double d4, int i3, long j2) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.date = i;
        this.totalExerciseLoad = i2;
        this.acuteFatigueLoad = d;
        this.chronicTrainingLoad = d2;
        this.reasonableRangeLow = d3;
        this.reasonableRangeHigh = d4;
        this.syncStatus = i3;
        this.modifiedTimestamp = j2;
    }

    public DBExerciseLoad() {
        this("", 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0L);
    }
}
