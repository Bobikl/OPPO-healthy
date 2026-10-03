package com.heytap.databaseengine.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/heytap/databaseengine/model/IndicatorStatExtends;", "Landroid/os/Parcelable;", "isAnalysisNew", "", "(I)V", "()I", "setAnalysisNew", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IndicatorStatExtends implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndicatorStatExtends> CREATOR = new a();
    private int isAnalysisNew;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IndicatorStatExtends> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndicatorStatExtends createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndicatorStatExtends(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IndicatorStatExtends[] newArray(int i) {
            return new IndicatorStatExtends[i];
        }
    }

    public IndicatorStatExtends() {
        this(0, 1, null);
    }

    public static /* synthetic */ IndicatorStatExtends copy$default(IndicatorStatExtends indicatorStatExtends, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = indicatorStatExtends.isAnalysisNew;
        }
        return indicatorStatExtends.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIsAnalysisNew() {
        return this.isAnalysisNew;
    }

    @NotNull
    public final IndicatorStatExtends copy(int isAnalysisNew) {
        return new IndicatorStatExtends(isAnalysisNew);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IndicatorStatExtends) && this.isAnalysisNew == ((IndicatorStatExtends) other).isAnalysisNew;
    }

    public int hashCode() {
        return Integer.hashCode(this.isAnalysisNew);
    }

    public final int isAnalysisNew() {
        return this.isAnalysisNew;
    }

    public final void setAnalysisNew(int i) {
        this.isAnalysisNew = i;
    }

    @NotNull
    public String toString() {
        return "IndicatorStatExtends(isAnalysisNew=" + this.isAnalysisNew + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isAnalysisNew);
    }

    public IndicatorStatExtends(int i) {
        this.isAnalysisNew = i;
    }

    public /* synthetic */ IndicatorStatExtends(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
