package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/esim/nec/bean/MultiSIMServiceInfo;", "", "PrimaryDevice", "Lcom/heytap/health/esim/nec/bean/PrimaryDevice;", "PairedDeviceList", "", "Lcom/heytap/health/esim/nec/bean/PairedDeviceList;", "(Lcom/heytap/health/esim/nec/bean/PrimaryDevice;Ljava/util/List;)V", "getPairedDeviceList", "()Ljava/util/List;", "getPrimaryDevice", "()Lcom/heytap/health/esim/nec/bean/PrimaryDevice;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MultiSIMServiceInfo {
    public static final int $stable = 8;

    @NotNull
    private final List<PairedDeviceList> PairedDeviceList;

    @NotNull
    private final PrimaryDevice PrimaryDevice;

    public MultiSIMServiceInfo(@NotNull PrimaryDevice PrimaryDevice, @NotNull List<PairedDeviceList> PairedDeviceList) {
        Intrinsics.checkNotNullParameter(PrimaryDevice, "PrimaryDevice");
        Intrinsics.checkNotNullParameter(PairedDeviceList, "PairedDeviceList");
        this.PrimaryDevice = PrimaryDevice;
        this.PairedDeviceList = PairedDeviceList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSIMServiceInfo copy$default(MultiSIMServiceInfo multiSIMServiceInfo, PrimaryDevice primaryDevice, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            primaryDevice = multiSIMServiceInfo.PrimaryDevice;
        }
        if ((i & 2) != 0) {
            list = multiSIMServiceInfo.PairedDeviceList;
        }
        return multiSIMServiceInfo.copy(primaryDevice, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PrimaryDevice getPrimaryDevice() {
        return this.PrimaryDevice;
    }

    @NotNull
    public final List<PairedDeviceList> component2() {
        return this.PairedDeviceList;
    }

    @NotNull
    public final MultiSIMServiceInfo copy(@NotNull PrimaryDevice PrimaryDevice, @NotNull List<PairedDeviceList> PairedDeviceList) {
        Intrinsics.checkNotNullParameter(PrimaryDevice, "PrimaryDevice");
        Intrinsics.checkNotNullParameter(PairedDeviceList, "PairedDeviceList");
        return new MultiSIMServiceInfo(PrimaryDevice, PairedDeviceList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiSIMServiceInfo)) {
            return false;
        }
        MultiSIMServiceInfo multiSIMServiceInfo = (MultiSIMServiceInfo) other;
        return Intrinsics.areEqual(this.PrimaryDevice, multiSIMServiceInfo.PrimaryDevice) && Intrinsics.areEqual(this.PairedDeviceList, multiSIMServiceInfo.PairedDeviceList);
    }

    @NotNull
    public final List<PairedDeviceList> getPairedDeviceList() {
        return this.PairedDeviceList;
    }

    @NotNull
    public final PrimaryDevice getPrimaryDevice() {
        return this.PrimaryDevice;
    }

    public int hashCode() {
        return (this.PrimaryDevice.hashCode() * 31) + this.PairedDeviceList.hashCode();
    }

    @NotNull
    public String toString() {
        return "MultiSIMServiceInfo(PrimaryDevice=" + this.PrimaryDevice + ", PairedDeviceList=" + this.PairedDeviceList + ")";
    }
}
