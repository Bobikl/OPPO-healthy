package com.oplus.pantaconnect.sdk.discovery.fusion;

import android.bluetooth.le.ScanFilter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/DiscoveryFilter;", "", "filterType", "Lcom/oplus/pantaconnect/sdk/discovery/fusion/DiscoveryFilterType;", "leScanFilter", "", "Landroid/bluetooth/le/ScanFilter;", "(Lcom/oplus/pantaconnect/sdk/discovery/fusion/DiscoveryFilterType;Ljava/util/List;)V", "getFilterType", "()Lcom/oplus/pantaconnect/sdk/discovery/fusion/DiscoveryFilterType;", "getLeScanFilter", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DiscoveryFilter {

    @NotNull
    private final DiscoveryFilterType filterType;

    @Nullable
    private final List<ScanFilter> leScanFilter;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DiscoveryFilter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiscoveryFilter copy$default(DiscoveryFilter discoveryFilter, DiscoveryFilterType discoveryFilterType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            discoveryFilterType = discoveryFilter.filterType;
        }
        if ((i & 2) != 0) {
            list = discoveryFilter.leScanFilter;
        }
        return discoveryFilter.copy(discoveryFilterType, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DiscoveryFilterType getFilterType() {
        return this.filterType;
    }

    @Nullable
    public final List<ScanFilter> component2() {
        return this.leScanFilter;
    }

    @NotNull
    public final DiscoveryFilter copy(@NotNull DiscoveryFilterType filterType, @Nullable List<ScanFilter> leScanFilter) {
        return new DiscoveryFilter(filterType, leScanFilter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscoveryFilter)) {
            return false;
        }
        DiscoveryFilter discoveryFilter = (DiscoveryFilter) other;
        return this.filterType == discoveryFilter.filterType && Intrinsics.areEqual(this.leScanFilter, discoveryFilter.leScanFilter);
    }

    @NotNull
    public final DiscoveryFilterType getFilterType() {
        return this.filterType;
    }

    @Nullable
    public final List<ScanFilter> getLeScanFilter() {
        return this.leScanFilter;
    }

    public int hashCode() {
        int iHashCode = this.filterType.hashCode() * 31;
        List<ScanFilter> list = this.leScanFilter;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "DiscoveryFilter(filterType=" + this.filterType + ", leScanFilter=" + this.leScanFilter + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DiscoveryFilter(@NotNull DiscoveryFilterType discoveryFilterType) {
        this(discoveryFilterType, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public DiscoveryFilter(@NotNull DiscoveryFilterType discoveryFilterType, @Nullable List<ScanFilter> list) {
        this.filterType = discoveryFilterType;
        this.leScanFilter = list;
    }

    public /* synthetic */ DiscoveryFilter(DiscoveryFilterType discoveryFilterType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DiscoveryFilterType.DISCOVERY_FILTER_TYPE_DEFAULT : discoveryFilterType, (i & 2) != 0 ? null : list);
    }
}
