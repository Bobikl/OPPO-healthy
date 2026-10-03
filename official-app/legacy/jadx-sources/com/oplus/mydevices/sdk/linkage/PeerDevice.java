package com.oplus.mydevices.sdk.linkage;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/oplus/mydevices/sdk/linkage/PeerDevice;", "", "name", "", "isScreenOn", "", "isCallActive", "isMusicActive", "isConnected", "autoSwitch", "(Ljava/lang/String;ZZZZZ)V", "getAutoSwitch", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class PeerDevice {
    private final boolean autoSwitch;
    private final boolean isCallActive;
    private final boolean isConnected;
    private final boolean isMusicActive;
    private final boolean isScreenOn;

    @NotNull
    private final String name;

    public PeerDevice(@NotNull String name, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.isScreenOn = z;
        this.isCallActive = z2;
        this.isMusicActive = z3;
        this.isConnected = z4;
        this.autoSwitch = z5;
    }

    public static /* synthetic */ PeerDevice copy$default(PeerDevice peerDevice, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerDevice.name;
        }
        if ((i & 2) != 0) {
            z = peerDevice.isScreenOn;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = peerDevice.isCallActive;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = peerDevice.isMusicActive;
        }
        boolean z8 = z3;
        if ((i & 16) != 0) {
            z4 = peerDevice.isConnected;
        }
        boolean z9 = z4;
        if ((i & 32) != 0) {
            z5 = peerDevice.autoSwitch;
        }
        return peerDevice.copy(str, z6, z7, z8, z9, z5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsScreenOn() {
        return this.isScreenOn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCallActive() {
        return this.isCallActive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMusicActive() {
        return this.isMusicActive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    @NotNull
    public final PeerDevice copy(@NotNull String name, boolean isScreenOn, boolean isCallActive, boolean isMusicActive, boolean isConnected, boolean autoSwitch) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PeerDevice(name, isScreenOn, isCallActive, isMusicActive, isConnected, autoSwitch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeerDevice)) {
            return false;
        }
        PeerDevice peerDevice = (PeerDevice) other;
        return Intrinsics.areEqual(this.name, peerDevice.name) && this.isScreenOn == peerDevice.isScreenOn && this.isCallActive == peerDevice.isCallActive && this.isMusicActive == peerDevice.isMusicActive && this.isConnected == peerDevice.isConnected && this.autoSwitch == peerDevice.autoSwitch;
    }

    public final boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isScreenOn;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isCallActive;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isMusicActive;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.isConnected;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.autoSwitch;
        return i4 + (z5 ? 1 : z5);
    }

    public final boolean isCallActive() {
        return this.isCallActive;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMusicActive() {
        return this.isMusicActive;
    }

    public final boolean isScreenOn() {
        return this.isScreenOn;
    }

    @NotNull
    public String toString() {
        return "PeerDevice(name=" + this.name + ", isScreenOn=" + this.isScreenOn + ", isCallActive=" + this.isCallActive + ", isMusicActive=" + this.isMusicActive + ", isConnected=" + this.isConnected + ", autoSwitch=" + this.autoSwitch + ")";
    }
}
