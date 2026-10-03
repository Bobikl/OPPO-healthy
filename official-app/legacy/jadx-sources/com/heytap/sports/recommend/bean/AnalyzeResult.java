package com.heytap.sports.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/heytap/sports/recommend/bean/AnalyzeResult;", "Landroid/os/Parcelable;", "deviceUpdateTime", "", "task1", "Lcom/heytap/sports/recommend/bean/Task1;", "task2", "Lcom/heytap/sports/recommend/bean/Task2;", "retTimestamp", "(ILcom/heytap/sports/recommend/bean/Task1;Lcom/heytap/sports/recommend/bean/Task2;I)V", "getDeviceUpdateTime", "()I", "setDeviceUpdateTime", "(I)V", "getRetTimestamp", "setRetTimestamp", "getTask1", "()Lcom/heytap/sports/recommend/bean/Task1;", "getTask2", "()Lcom/heytap/sports/recommend/bean/Task2;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AnalyzeResult implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AnalyzeResult> CREATOR = new a();
    private int deviceUpdateTime;
    private int retTimestamp;

    @Nullable
    private final Task1 task1;

    @Nullable
    private final Task2 task2;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnalyzeResult> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnalyzeResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AnalyzeResult(parcel.readInt(), parcel.readInt() == 0 ? null : Task1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Task2.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AnalyzeResult[] newArray(int i) {
            return new AnalyzeResult[i];
        }
    }

    public AnalyzeResult(int i, @Nullable Task1 task1, @Nullable Task2 task2, int i2) {
        this.deviceUpdateTime = i;
        this.task1 = task1;
        this.task2 = task2;
        this.retTimestamp = i2;
    }

    public static /* synthetic */ AnalyzeResult copy$default(AnalyzeResult analyzeResult, int i, Task1 task1, Task2 task2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = analyzeResult.deviceUpdateTime;
        }
        if ((i3 & 2) != 0) {
            task1 = analyzeResult.task1;
        }
        if ((i3 & 4) != 0) {
            task2 = analyzeResult.task2;
        }
        if ((i3 & 8) != 0) {
            i2 = analyzeResult.retTimestamp;
        }
        return analyzeResult.copy(i, task1, task2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceUpdateTime() {
        return this.deviceUpdateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Task1 getTask1() {
        return this.task1;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Task2 getTask2() {
        return this.task2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRetTimestamp() {
        return this.retTimestamp;
    }

    @NotNull
    public final AnalyzeResult copy(int deviceUpdateTime, @Nullable Task1 task1, @Nullable Task2 task2, int retTimestamp) {
        return new AnalyzeResult(deviceUpdateTime, task1, task2, retTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyzeResult)) {
            return false;
        }
        AnalyzeResult analyzeResult = (AnalyzeResult) other;
        return this.deviceUpdateTime == analyzeResult.deviceUpdateTime && Intrinsics.areEqual(this.task1, analyzeResult.task1) && Intrinsics.areEqual(this.task2, analyzeResult.task2) && this.retTimestamp == analyzeResult.retTimestamp;
    }

    public final int getDeviceUpdateTime() {
        return this.deviceUpdateTime;
    }

    public final int getRetTimestamp() {
        return this.retTimestamp;
    }

    @Nullable
    public final Task1 getTask1() {
        return this.task1;
    }

    @Nullable
    public final Task2 getTask2() {
        return this.task2;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.deviceUpdateTime) * 31;
        Task1 task1 = this.task1;
        int iHashCode2 = (iHashCode + (task1 == null ? 0 : task1.hashCode())) * 31;
        Task2 task2 = this.task2;
        return ((iHashCode2 + (task2 != null ? task2.hashCode() : 0)) * 31) + Integer.hashCode(this.retTimestamp);
    }

    public final void setDeviceUpdateTime(int i) {
        this.deviceUpdateTime = i;
    }

    public final void setRetTimestamp(int i) {
        this.retTimestamp = i;
    }

    @NotNull
    public String toString() {
        return "AnalyzeResult(deviceUpdateTime=" + this.deviceUpdateTime + ", task1=" + this.task1 + ", task2=" + this.task2 + ", retTimestamp=" + this.retTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.deviceUpdateTime);
        Task1 task1 = this.task1;
        if (task1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            task1.writeToParcel(parcel, flags);
        }
        Task2 task2 = this.task2;
        if (task2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            task2.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.retTimestamp);
    }

    public /* synthetic */ AnalyzeResult(int i, Task1 task1, Task2 task2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, task1, task2, (i3 & 8) != 0 ? 0 : i2);
    }
}
