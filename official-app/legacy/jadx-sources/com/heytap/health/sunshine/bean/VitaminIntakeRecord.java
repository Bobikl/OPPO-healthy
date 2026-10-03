package com.heytap.health.sunshine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/sunshine/bean/VitaminIntakeRecord;", "Landroid/os/Parcelable;", "timestampMillis", "", "intakeIU", "", "(JI)V", "getIntakeIU", "()I", "getTimestampMillis", "()J", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "sunshine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class VitaminIntakeRecord implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<VitaminIntakeRecord> CREATOR = new a();
    private final int intakeIU;
    private final long timestampMillis;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VitaminIntakeRecord> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VitaminIntakeRecord createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VitaminIntakeRecord(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VitaminIntakeRecord[] newArray(int i) {
            return new VitaminIntakeRecord[i];
        }
    }

    public VitaminIntakeRecord(long j2, int i) {
        this.timestampMillis = j2;
        this.intakeIU = i;
    }

    public static /* synthetic */ VitaminIntakeRecord copy$default(VitaminIntakeRecord vitaminIntakeRecord, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = vitaminIntakeRecord.timestampMillis;
        }
        if ((i2 & 2) != 0) {
            i = vitaminIntakeRecord.intakeIU;
        }
        return vitaminIntakeRecord.copy(j2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIntakeIU() {
        return this.intakeIU;
    }

    @NotNull
    public final VitaminIntakeRecord copy(long timestampMillis, int intakeIU) {
        return new VitaminIntakeRecord(timestampMillis, intakeIU);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VitaminIntakeRecord)) {
            return false;
        }
        VitaminIntakeRecord vitaminIntakeRecord = (VitaminIntakeRecord) other;
        return this.timestampMillis == vitaminIntakeRecord.timestampMillis && this.intakeIU == vitaminIntakeRecord.intakeIU;
    }

    public final int getIntakeIU() {
        return this.intakeIU;
    }

    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    public int hashCode() {
        return (Long.hashCode(this.timestampMillis) * 31) + Integer.hashCode(this.intakeIU);
    }

    @NotNull
    public String toString() {
        return "VitaminIntakeRecord(timestampMillis=" + this.timestampMillis + ", intakeIU=" + this.intakeIU + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.timestampMillis);
        parcel.writeInt(this.intakeIU);
    }
}
