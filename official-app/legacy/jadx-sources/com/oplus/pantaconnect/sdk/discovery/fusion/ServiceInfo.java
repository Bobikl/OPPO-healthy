package com.oplus.pantaconnect.sdk.discovery.fusion;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceInfo;", "", "serviceId", "", ServiceNodeBundleKeys.SERVICE_DATA, "", "(Ljava/lang/String;[B)V", "getServiceData", "()[B", "getServiceId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ServiceInfo {

    @NotNull
    private final byte[] serviceData;

    @NotNull
    private final String serviceId;

    public ServiceInfo(@NotNull String str, @NotNull byte[] bArr) {
        this.serviceId = str;
        this.serviceData = bArr;
    }

    public static /* synthetic */ ServiceInfo copy$default(ServiceInfo serviceInfo, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceInfo.serviceId;
        }
        if ((i & 2) != 0) {
            bArr = serviceInfo.serviceData;
        }
        return serviceInfo.copy(str, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getServiceData() {
        return this.serviceData;
    }

    @NotNull
    public final ServiceInfo copy(@NotNull String serviceId, @NotNull byte[] serviceData) {
        return new ServiceInfo(serviceId, serviceData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ServiceInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.pantaconnect.sdk.discovery.fusion.ServiceInfo");
        ServiceInfo serviceInfo = (ServiceInfo) other;
        return Intrinsics.areEqual(this.serviceId, serviceInfo.serviceId) && Arrays.equals(this.serviceData, serviceInfo.serviceData);
    }

    @NotNull
    public final byte[] getServiceData() {
        return this.serviceData;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        return Arrays.hashCode(this.serviceData) + (this.serviceId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ServiceInfo(serviceId=" + this.serviceId + ", serviceData=" + Arrays.toString(this.serviceData) + ')';
    }
}
