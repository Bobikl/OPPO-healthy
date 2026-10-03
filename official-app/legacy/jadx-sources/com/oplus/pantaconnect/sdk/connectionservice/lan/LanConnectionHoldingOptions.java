package com.oplus.pantaconnect.sdk.connectionservice.lan;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/lan/LanConnectionHoldingOptions;", "", "deviceId", "", "isForcedHolding", "", "(Ljava/lang/String;Z)V", "getDeviceId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LanConnectionHoldingOptions {

    @NotNull
    private final String deviceId;
    private final boolean isForcedHolding;

    public LanConnectionHoldingOptions(@NotNull String str, boolean z) {
        this.deviceId = str;
        this.isForcedHolding = z;
    }

    public static /* synthetic */ LanConnectionHoldingOptions copy$default(LanConnectionHoldingOptions lanConnectionHoldingOptions, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lanConnectionHoldingOptions.deviceId;
        }
        if ((i & 2) != 0) {
            z = lanConnectionHoldingOptions.isForcedHolding;
        }
        return lanConnectionHoldingOptions.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsForcedHolding() {
        return this.isForcedHolding;
    }

    @NotNull
    public final LanConnectionHoldingOptions copy(@NotNull String deviceId, boolean isForcedHolding) {
        return new LanConnectionHoldingOptions(deviceId, isForcedHolding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanConnectionHoldingOptions)) {
            return false;
        }
        LanConnectionHoldingOptions lanConnectionHoldingOptions = (LanConnectionHoldingOptions) other;
        return Intrinsics.areEqual(this.deviceId, lanConnectionHoldingOptions.deviceId) && this.isForcedHolding == lanConnectionHoldingOptions.isForcedHolding;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isForcedHolding) + (this.deviceId.hashCode() * 31);
    }

    public final boolean isForcedHolding() {
        return this.isForcedHolding;
    }

    @NotNull
    public String toString() {
        return "LanConnectionHoldingOptions(deviceId=" + this.deviceId + ", isForcedHolding=" + this.isForcedHolding + ')';
    }
}
