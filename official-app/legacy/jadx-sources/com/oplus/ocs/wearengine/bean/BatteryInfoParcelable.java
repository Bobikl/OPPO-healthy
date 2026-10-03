package com.oplus.ocs.wearengine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010 J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/BatteryInfoParcelable;", "", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "dest", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "component1", "Lcom/oplus/ocs/wearengine/common/Status;", "component2", "currentBattery", "status", "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getCurrentBattery", "()I", "Lcom/oplus/ocs/wearengine/common/Status;", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "<init>", "(ILcom/oplus/ocs/wearengine/common/Status;)V", "parcel", "(Landroid/os/Parcel;)V", "(Lcom/oplus/ocs/wearengine/common/Status;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BatteryInfoParcelable implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int currentBattery;

    @NotNull
    private final Status status;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.BatteryInfoParcelable$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/BatteryInfoParcelable$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/BatteryInfoParcelable;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/BatteryInfoParcelable;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<BatteryInfoParcelable> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatteryInfoParcelable createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BatteryInfoParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BatteryInfoParcelable[] newArray(int size) {
            return new BatteryInfoParcelable[size];
        }
    }

    public BatteryInfoParcelable(int i, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.currentBattery = i;
        this.status = status;
    }

    public static /* synthetic */ BatteryInfoParcelable copy$default(BatteryInfoParcelable batteryInfoParcelable, int i, Status status, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = batteryInfoParcelable.getCurrentBattery();
        }
        if ((i2 & 2) != 0) {
            status = batteryInfoParcelable.getStatus();
        }
        return batteryInfoParcelable.copy(i, status);
    }

    public final int component1() {
        return getCurrentBattery();
    }

    @NotNull
    public final Status component2() {
        return getStatus();
    }

    @NotNull
    public final BatteryInfoParcelable copy(int currentBattery, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new BatteryInfoParcelable(currentBattery, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatteryInfoParcelable)) {
            return false;
        }
        BatteryInfoParcelable batteryInfoParcelable = (BatteryInfoParcelable) other;
        return getCurrentBattery() == batteryInfoParcelable.getCurrentBattery() && Intrinsics.areEqual(getStatus(), batteryInfoParcelable.getStatus());
    }

    public int getCurrentBattery() {
        return this.currentBattery;
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Integer.hashCode(getCurrentBattery()) * 31) + getStatus().hashCode();
    }

    @NotNull
    public String toString() {
        return "BatteryInfoParcelable(currentBattery=" + getCurrentBattery() + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(getCurrentBattery());
        dest.writeParcelable(getStatus(), 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BatteryInfoParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = parcel.readInt();
        Status status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this(i, status == null ? new Status(8, null, 2, null) : status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryInfoParcelable(@NotNull Status status) {
        this(-1, status);
        Intrinsics.checkNotNullParameter(status, "status");
    }
}
