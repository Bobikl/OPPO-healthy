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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/DeviceModuleParcelable;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "component1", "component2", "Lcom/oplus/ocs/wearengine/common/Status;", "component3", "isMainModule", "isStubModule", "status", "copy", "", "toString", "hashCode", "other", "equals", "Z", "()Z", "Lcom/oplus/ocs/wearengine/common/Status;", "getStatus", "()Lcom/oplus/ocs/wearengine/common/Status;", "<init>", "(ZZLcom/oplus/ocs/wearengine/common/Status;)V", "parcel", "(Landroid/os/Parcel;)V", "(Lcom/oplus/ocs/wearengine/common/Status;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DeviceModuleParcelable implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isMainModule;
    private final boolean isStubModule;

    @NotNull
    private final Status status;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.DeviceModuleParcelable$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/DeviceModuleParcelable$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/bean/DeviceModuleParcelable;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/bean/DeviceModuleParcelable;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<DeviceModuleParcelable> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceModuleParcelable createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceModuleParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceModuleParcelable[] newArray(int size) {
            return new DeviceModuleParcelable[size];
        }
    }

    public DeviceModuleParcelable(boolean z, boolean z2, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.isMainModule = z;
        this.isStubModule = z2;
        this.status = status;
    }

    public static /* synthetic */ DeviceModuleParcelable copy$default(DeviceModuleParcelable deviceModuleParcelable, boolean z, boolean z2, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceModuleParcelable.getIsMainModule();
        }
        if ((i & 2) != 0) {
            z2 = deviceModuleParcelable.getIsStubModule();
        }
        if ((i & 4) != 0) {
            status = deviceModuleParcelable.getStatus();
        }
        return deviceModuleParcelable.copy(z, z2, status);
    }

    public final boolean component1() {
        return getIsMainModule();
    }

    public final boolean component2() {
        return getIsStubModule();
    }

    @NotNull
    public final Status component3() {
        return getStatus();
    }

    @NotNull
    public final DeviceModuleParcelable copy(boolean isMainModule, boolean isStubModule, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new DeviceModuleParcelable(isMainModule, isStubModule, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceModuleParcelable)) {
            return false;
        }
        DeviceModuleParcelable deviceModuleParcelable = (DeviceModuleParcelable) other;
        return getIsMainModule() == deviceModuleParcelable.getIsMainModule() && getIsStubModule() == deviceModuleParcelable.getIsStubModule() && Intrinsics.areEqual(getStatus(), deviceModuleParcelable.getStatus());
    }

    @NotNull
    public Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        boolean isMainModule = getIsMainModule();
        int i = isMainModule;
        if (isMainModule) {
            i = 1;
        }
        int i2 = i * 31;
        boolean isStubModule = getIsStubModule();
        return ((i2 + (isStubModule ? 1 : isStubModule)) * 31) + getStatus().hashCode();
    }

    /* JADX INFO: renamed from: isMainModule, reason: from getter */
    public boolean getIsMainModule() {
        return this.isMainModule;
    }

    /* JADX INFO: renamed from: isStubModule, reason: from getter */
    public boolean getIsStubModule() {
        return this.isStubModule;
    }

    @NotNull
    public String toString() {
        return "DeviceModuleParcelable(isMainModule=" + getIsMainModule() + ", isStubModule=" + getIsStubModule() + ", status=" + getStatus() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByte(getIsMainModule() ? (byte) 1 : (byte) 0);
        dest.writeByte(getIsStubModule() ? (byte) 1 : (byte) 0);
        dest.writeParcelable(getStatus(), 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceModuleParcelable(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        boolean z = parcel.readByte() != 0;
        boolean z2 = parcel.readByte() != 0;
        Status status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this(z, z2, status == null ? new Status(8, null, 2, null) : status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceModuleParcelable(@NotNull Status status) {
        this(false, false, status);
        Intrinsics.checkNotNullParameter(status, "status");
    }
}
