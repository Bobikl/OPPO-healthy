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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/heytap/sports/recommend/bean/SleepCell;", "Landroid/os/Parcelable;", "sleepScore", "", "sleepDuration", "(II)V", "getSleepDuration", "()I", "getSleepScore", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepCell implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<SleepCell> CREATOR = new a();
    private final int sleepDuration;
    private final int sleepScore;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SleepCell> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepCell createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SleepCell(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SleepCell[] newArray(int i) {
            return new SleepCell[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SleepCell() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ SleepCell copy$default(SleepCell sleepCell, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepCell.sleepScore;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepCell.sleepDuration;
        }
        return sleepCell.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @NotNull
    public final SleepCell copy(int sleepScore, int sleepDuration) {
        return new SleepCell(sleepScore, sleepDuration);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepCell)) {
            return false;
        }
        SleepCell sleepCell = (SleepCell) other;
        return this.sleepScore == sleepCell.sleepScore && this.sleepDuration == sleepCell.sleepDuration;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    public final int getSleepScore() {
        return this.sleepScore;
    }

    public int hashCode() {
        return (Integer.hashCode(this.sleepScore) * 31) + Integer.hashCode(this.sleepDuration);
    }

    @NotNull
    public String toString() {
        return "SleepCell(sleepScore=" + this.sleepScore + ", sleepDuration=" + this.sleepDuration + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.sleepScore);
        parcel.writeInt(this.sleepDuration);
    }

    public SleepCell(int i, int i2) {
        this.sleepScore = i;
        this.sleepDuration = i2;
    }

    public /* synthetic */ SleepCell(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
