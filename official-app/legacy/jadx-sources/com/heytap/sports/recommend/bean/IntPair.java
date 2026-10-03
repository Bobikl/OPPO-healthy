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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/heytap/sports/recommend/bean/IntPair;", "Landroid/os/Parcelable;", "first", "", "second", "(II)V", "getFirst", "()I", "getSecond", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IntPair implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<IntPair> CREATOR = new a();
    private final int first;
    private final int second;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IntPair> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IntPair createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntPair(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IntPair[] newArray(int i) {
            return new IntPair[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntPair() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ IntPair copy$default(IntPair intPair, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = intPair.first;
        }
        if ((i3 & 2) != 0) {
            i2 = intPair.second;
        }
        return intPair.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSecond() {
        return this.second;
    }

    @NotNull
    public final IntPair copy(int first, int second) {
        return new IntPair(first, second);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntPair)) {
            return false;
        }
        IntPair intPair = (IntPair) other;
        return this.first == intPair.first && this.second == intPair.second;
    }

    public final int getFirst() {
        return this.first;
    }

    public final int getSecond() {
        return this.second;
    }

    public int hashCode() {
        return (Integer.hashCode(this.first) * 31) + Integer.hashCode(this.second);
    }

    @NotNull
    public String toString() {
        return "IntPair(first=" + this.first + ", second=" + this.second + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.first);
        parcel.writeInt(this.second);
    }

    public IntPair(int i, int i2) {
        this.first = i;
        this.second = i2;
    }

    public /* synthetic */ IntPair(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
