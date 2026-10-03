package com.heytap.databaseengine.model.newsleep;

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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\b\u0010#\u001a\u00020\u0005H\u0016J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005J\b\u0010'\u001a\u00020\u0005H\u0016J\u0019\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013¨\u0006,"}, d2 = {"Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "date", "", "minHeartRate", "maxHeartRate", "reasonableRangeLow", "reasonableRangeHigh", "warningNumber", "avgSleepHeartRate", "syncStatus", "(Ljava/lang/String;IIIIIIII)V", "getAvgSleepHeartRate", "()I", "setAvgSleepHeartRate", "(I)V", "getDate", "setDate", "getMaxHeartRate", "setMaxHeartRate", "getMinHeartRate", "setMinHeartRate", "getReasonableRangeHigh", "setReasonableRangeHigh", "getReasonableRangeLow", "setReasonableRangeLow", "getSyncStatus", "setSyncStatus", "getWarningNumber", "setWarningNumber", "describeContents", "getSsoid", "setSsoid", "", "mSsoid", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepHeartRateStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepHeartRateStat> CREATOR = new a();
    private int avgSleepHeartRate;
    private int date;
    private int maxHeartRate;
    private int minHeartRate;
    private int reasonableRangeHigh;
    private int reasonableRangeLow;

    @NotNull
    private String ssoid;
    private int syncStatus;
    private int warningNumber;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepHeartRateStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepHeartRateStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SleepHeartRateStat(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepHeartRateStat[] newArray(int i) {
            return new SleepHeartRateStat[i];
        }
    }

    public /* synthetic */ SleepHeartRateStat(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i2, (i9 & 8) != 0 ? 0 : i3, (i9 & 16) != 0 ? 0 : i4, (i9 & 32) != 0 ? 0 : i5, (i9 & 64) != 0 ? 0 : i6, (i9 & 128) != 0 ? 0 : i7, (i9 & 256) == 0 ? i8 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAvgSleepHeartRate() {
        return this.avgSleepHeartRate;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final int getReasonableRangeHigh() {
        return this.reasonableRangeHigh;
    }

    public final int getReasonableRangeLow() {
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

    public final int getWarningNumber() {
        return this.warningNumber;
    }

    public final void setAvgSleepHeartRate(int i) {
        this.avgSleepHeartRate = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public final void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public final void setReasonableRangeHigh(int i) {
        this.reasonableRangeHigh = i;
    }

    public final void setReasonableRangeLow(int i) {
        this.reasonableRangeLow = i;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setWarningNumber(int i) {
        this.warningNumber = i;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "SleepHeartRateStat(ssoid='" + this.ssoid + "', date=" + this.date + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", reasonableRangeLow=" + this.reasonableRangeLow + ", reasonableRangeHigh=" + this.reasonableRangeHigh + ", warningNumber=" + this.warningNumber + ", avgSleepHeartRate=" + this.avgSleepHeartRate + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeInt(this.date);
        parcel.writeInt(this.minHeartRate);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeInt(this.reasonableRangeLow);
        parcel.writeInt(this.reasonableRangeHigh);
        parcel.writeInt(this.warningNumber);
        parcel.writeInt(this.avgSleepHeartRate);
        parcel.writeInt(this.syncStatus);
    }

    public SleepHeartRateStat(@NotNull String ssoid, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
        this.date = i;
        this.minHeartRate = i2;
        this.maxHeartRate = i3;
        this.reasonableRangeLow = i4;
        this.reasonableRangeHigh = i5;
        this.warningNumber = i6;
        this.avgSleepHeartRate = i7;
        this.syncStatus = i8;
    }

    public SleepHeartRateStat() {
        this("", 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
