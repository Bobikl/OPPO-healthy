package com.heytap.databaseengine.model.exerciseload;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\b\u0010#\u001a\u00020\u0005H\u0016J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005J\b\u0010'\u001a\u00020\u0005H\u0016J\u0019\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019¨\u0006,"}, d2 = {"Lcom/heytap/databaseengine/model/exerciseload/ExerciseLoad;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "date", "", "totalExerciseLoad", "acuteFatigueLoad", "", "chronicTrainingLoad", "reasonableRangeLow", "reasonableRangeHigh", "syncStatus", "(Ljava/lang/String;IIDDDDI)V", "getAcuteFatigueLoad", "()D", "setAcuteFatigueLoad", "(D)V", "getChronicTrainingLoad", "setChronicTrainingLoad", "getDate", "()I", "setDate", "(I)V", "getReasonableRangeHigh", "setReasonableRangeHigh", "getReasonableRangeLow", "setReasonableRangeLow", "getSyncStatus", "setSyncStatus", "getTotalExerciseLoad", "setTotalExerciseLoad", "describeContents", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExerciseLoad extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExerciseLoad> CREATOR = new a();
    private double acuteFatigueLoad;
    private double chronicTrainingLoad;
    private int date;
    private double reasonableRangeHigh;
    private double reasonableRangeLow;

    @NotNull
    private String ssoid;
    private int syncStatus;
    private int totalExerciseLoad;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExerciseLoad> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExerciseLoad createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExerciseLoad(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExerciseLoad[] newArray(int i) {
            return new ExerciseLoad[i];
        }
    }

    public /* synthetic */ ExerciseLoad(String str, int i, int i2, double d, double d2, double d3, double d4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0.0d : d, (i4 & 16) != 0 ? 0.0d : d2, (i4 & 32) != 0 ? 0.0d : d3, (i4 & 64) == 0 ? d4 : 0.0d, (i4 & 128) == 0 ? i3 : 0);
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
        return "ExerciseLoad(ssoid='" + this.ssoid + "', date=" + this.date + ", totalExerciseLoad=" + this.totalExerciseLoad + ", acuteFatigueLoad=" + this.acuteFatigueLoad + ", chronicTrainingLoad=" + this.chronicTrainingLoad + ", reasonableRangeLow=" + this.reasonableRangeLow + ", reasonableRangeHigh=" + this.reasonableRangeHigh + ", syncStatus=" + this.syncStatus + ")";
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
    }

    public ExerciseLoad(@NotNull String ssoid, int i, int i2, double d, double d2, double d3, double d4, int i3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.date = i;
        this.totalExerciseLoad = i2;
        this.acuteFatigueLoad = d;
        this.chronicTrainingLoad = d2;
        this.reasonableRangeLow = d3;
        this.reasonableRangeHigh = d4;
        this.syncStatus = i3;
    }

    public ExerciseLoad() {
        this("", 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0);
    }
}
