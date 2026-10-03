package com.heytap.wearable.oms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.wearable.oms.common.Status;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b!\u0010\"B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b!\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b!\u0010$B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b!\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006)"}, d2 = {"Lcom/heytap/wearable/oms/internal/CapabilityOmsVersionParcelable;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "component1", "component2", "Lcom/heytap/wearable/oms/common/Status;", "component3", "selfVersion", "targetVersion", "status", "copy", "", "toString", "hashCode", "other", "", "equals", "I", "getSelfVersion", "()I", "getTargetVersion", "Lcom/heytap/wearable/oms/common/Status;", "getStatus", "()Lcom/heytap/wearable/oms/common/Status;", "getVersion", "version", "<init>", "(IILcom/heytap/wearable/oms/common/Status;)V", "(II)V", "(Lcom/heytap/wearable/oms/common/Status;)V", "source", "(Landroid/os/Parcel;)V", "Companion", "b", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CapabilityOmsVersionParcelable implements Parcelable {
    private final int selfVersion;

    @NotNull
    private final Status status;
    private final int targetVersion;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CapabilityOmsVersionParcelable> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/heytap/wearable/oms/internal/CapabilityOmsVersionParcelable$a", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/wearable/oms/internal/CapabilityOmsVersionParcelable;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/heytap/wearable/oms/internal/CapabilityOmsVersionParcelable;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<CapabilityOmsVersionParcelable> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CapabilityOmsVersionParcelable createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new CapabilityOmsVersionParcelable(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CapabilityOmsVersionParcelable[] newArray(int size) {
            return new CapabilityOmsVersionParcelable[size];
        }
    }

    public CapabilityOmsVersionParcelable(int i, int i2, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.selfVersion = i;
        this.targetVersion = i2;
        this.status = status;
    }

    public static /* synthetic */ CapabilityOmsVersionParcelable copy$default(CapabilityOmsVersionParcelable capabilityOmsVersionParcelable, int i, int i2, Status status, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = capabilityOmsVersionParcelable.getSelfVersion();
        }
        if ((i3 & 2) != 0) {
            i2 = capabilityOmsVersionParcelable.getTargetVersion();
        }
        if ((i3 & 4) != 0) {
            status = capabilityOmsVersionParcelable.getStatus();
        }
        return capabilityOmsVersionParcelable.copy(i, i2, status);
    }

    public final int component1() {
        return getSelfVersion();
    }

    public final int component2() {
        return getTargetVersion();
    }

    @NotNull
    public final Status component3() {
        return getStatus();
    }

    @NotNull
    public final CapabilityOmsVersionParcelable copy(int selfVersion, int targetVersion, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new CapabilityOmsVersionParcelable(selfVersion, targetVersion, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapabilityOmsVersionParcelable)) {
            return false;
        }
        CapabilityOmsVersionParcelable capabilityOmsVersionParcelable = (CapabilityOmsVersionParcelable) other;
        return getSelfVersion() == capabilityOmsVersionParcelable.getSelfVersion() && getTargetVersion() == capabilityOmsVersionParcelable.getTargetVersion() && Intrinsics.areEqual(getStatus(), capabilityOmsVersionParcelable.getStatus());
    }

    public int getSelfVersion() {
        return this.selfVersion;
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int getTargetVersion() {
        return this.targetVersion;
    }

    public int getVersion() {
        return Math.max(Math.min(getSelfVersion(), getTargetVersion()), 1);
    }

    public int hashCode() {
        return (((Integer.hashCode(getSelfVersion()) * 31) + Integer.hashCode(getTargetVersion())) * 31) + getStatus().hashCode();
    }

    @NotNull
    public String toString() {
        return "CapabilityOmsVersionParcelable(selfVersion=" + getSelfVersion() + ", targetVersion=" + getTargetVersion() + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(getSelfVersion());
        dest.writeInt(getTargetVersion());
        dest.writeParcelable(getStatus(), 0);
    }

    public CapabilityOmsVersionParcelable(int i, int i2) {
        this(i, i2, Status.SUCCESS);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CapabilityOmsVersionParcelable(@NotNull Status status) {
        this(-1, -1, status);
        Intrinsics.checkNotNullParameter(status, "status");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CapabilityOmsVersionParcelable(@NotNull Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int i = source.readInt();
        int i2 = source.readInt();
        Status status = (Status) source.readParcelable(Status.class.getClassLoader());
        this(i, i2, status == null ? new Status(8, null, 2, null) : status);
    }
}
