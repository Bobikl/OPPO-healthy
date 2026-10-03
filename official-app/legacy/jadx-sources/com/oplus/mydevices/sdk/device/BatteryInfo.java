package com.oplus.mydevices.sdk.device;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/oplus/mydevices/sdk/device/BatteryInfo;", "Landroid/os/Parcelable;", "batteryType", "Lcom/oplus/mydevices/sdk/device/BatteryType;", "value", "", "charge", "", "(Lcom/oplus/mydevices/sdk/device/BatteryType;IZ)V", "getBatteryType", "()Lcom/oplus/mydevices/sdk/device/BatteryType;", "setBatteryType", "(Lcom/oplus/mydevices/sdk/device/BatteryType;)V", "getCharge", "()Z", "setCharge", "(Z)V", "getValue", "()I", "setValue", "(I)V", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BatteryInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();

    @Nullable
    private BatteryType batteryType;
    private boolean charge;
    private int value;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new BatteryInfo(in.readInt() != 0 ? (BatteryType) Enum.valueOf(BatteryType.class, in.readString()) : null, in.readInt(), in.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object[] newArray(int i) {
            return new BatteryInfo[i];
        }
    }

    @JvmOverloads
    public BatteryInfo() {
        this(null, 0, false, 7, null);
    }

    public static /* synthetic */ BatteryInfo copy$default(BatteryInfo batteryInfo, BatteryType batteryType, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            batteryType = batteryInfo.batteryType;
        }
        if ((i2 & 2) != 0) {
            i = batteryInfo.value;
        }
        if ((i2 & 4) != 0) {
            z = batteryInfo.charge;
        }
        return batteryInfo.copy(batteryType, i, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BatteryType getBatteryType() {
        return this.batteryType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCharge() {
        return this.charge;
    }

    @NotNull
    public final BatteryInfo copy(@Nullable BatteryType batteryType, int value, boolean charge) {
        return new BatteryInfo(batteryType, value, charge);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryInfo)) {
            return false;
        }
        BatteryInfo batteryInfo = (BatteryInfo) other;
        return Intrinsics.areEqual(this.batteryType, batteryInfo.batteryType) && this.value == batteryInfo.value && this.charge == batteryInfo.charge;
    }

    @Nullable
    public final BatteryType getBatteryType() {
        return this.batteryType;
    }

    public final boolean getCharge() {
        return this.charge;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        BatteryType batteryType = this.batteryType;
        int iHashCode = (((batteryType != null ? batteryType.hashCode() : 0) * 31) + this.value) * 31;
        boolean z = this.charge;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final void setBatteryType(@Nullable BatteryType batteryType) {
        this.batteryType = batteryType;
    }

    public final void setCharge(boolean z) {
        this.charge = z;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "BatteryInfo(batteryType=" + this.batteryType + ", value=" + this.value + ", charge=" + this.charge + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        BatteryType batteryType = this.batteryType;
        if (batteryType != null) {
            parcel.writeInt(1);
            parcel.writeString(batteryType.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.value);
        parcel.writeInt(this.charge ? 1 : 0);
    }

    @JvmOverloads
    public BatteryInfo(@Nullable BatteryType batteryType) {
        this(batteryType, 0, false, 6, null);
    }

    @JvmOverloads
    public BatteryInfo(@Nullable BatteryType batteryType, int i) {
        this(batteryType, i, false, 4, null);
    }

    @JvmOverloads
    public BatteryInfo(@Nullable BatteryType batteryType, int i, boolean z) {
        this.batteryType = batteryType;
        this.value = i;
        this.charge = z;
    }

    public /* synthetic */ BatteryInfo(BatteryType batteryType, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : batteryType, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}
