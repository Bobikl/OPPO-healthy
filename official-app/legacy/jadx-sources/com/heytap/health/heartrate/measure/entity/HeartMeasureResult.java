package com.heytap.health.heartrate.measure.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006$"}, d2 = {"Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "Landroid/os/Parcelable;", "respRate", "", RecordCombinedLineChart.KEY_HEART_RATE, "warnStatus", "motionStatus", "(IIII)V", "getHeartRate", "()I", "setHeartRate", "(I)V", "getMotionStatus", "setMotionStatus", "getRespRate", "setRespRate", "getWarnStatus", "setWarnStatus", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "heartrate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HeartMeasureResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HeartMeasureResult> CREATOR = new a();
    private int heartRate;
    private int motionStatus;
    private int respRate;
    private int warnStatus;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeartMeasureResult> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeartMeasureResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HeartMeasureResult(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HeartMeasureResult[] newArray(int i) {
            return new HeartMeasureResult[i];
        }
    }

    public HeartMeasureResult() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ HeartMeasureResult copy$default(HeartMeasureResult heartMeasureResult, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = heartMeasureResult.respRate;
        }
        if ((i5 & 2) != 0) {
            i2 = heartMeasureResult.heartRate;
        }
        if ((i5 & 4) != 0) {
            i3 = heartMeasureResult.warnStatus;
        }
        if ((i5 & 8) != 0) {
            i4 = heartMeasureResult.motionStatus;
        }
        return heartMeasureResult.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRespRate() {
        return this.respRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWarnStatus() {
        return this.warnStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMotionStatus() {
        return this.motionStatus;
    }

    @NotNull
    public final HeartMeasureResult copy(int respRate, int heartRate, int warnStatus, int motionStatus) {
        return new HeartMeasureResult(respRate, heartRate, warnStatus, motionStatus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartMeasureResult)) {
            return false;
        }
        HeartMeasureResult heartMeasureResult = (HeartMeasureResult) other;
        return this.respRate == heartMeasureResult.respRate && this.heartRate == heartMeasureResult.heartRate && this.warnStatus == heartMeasureResult.warnStatus && this.motionStatus == heartMeasureResult.motionStatus;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getMotionStatus() {
        return this.motionStatus;
    }

    public final int getRespRate() {
        return this.respRate;
    }

    public final int getWarnStatus() {
        return this.warnStatus;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.respRate) * 31) + Integer.hashCode(this.heartRate)) * 31) + Integer.hashCode(this.warnStatus)) * 31) + Integer.hashCode(this.motionStatus);
    }

    public final void setHeartRate(int i) {
        this.heartRate = i;
    }

    public final void setMotionStatus(int i) {
        this.motionStatus = i;
    }

    public final void setRespRate(int i) {
        this.respRate = i;
    }

    public final void setWarnStatus(int i) {
        this.warnStatus = i;
    }

    @NotNull
    public String toString() {
        return "respRate is : " + this.respRate + " heartRate is : " + this.heartRate + " warnStatus is : " + this.warnStatus + " motionStatus is : " + this.motionStatus;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.respRate);
        parcel.writeInt(this.heartRate);
        parcel.writeInt(this.warnStatus);
        parcel.writeInt(this.motionStatus);
    }

    public HeartMeasureResult(int i, int i2, int i3, int i4) {
        this.respRate = i;
        this.heartRate = i2;
        this.warnStatus = i3;
        this.motionStatus = i4;
    }

    public /* synthetic */ HeartMeasureResult(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
