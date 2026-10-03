package defpackage;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lc;", "", "", "toString", "", "hashCode", "other", "", "equals", "La;", "La;", "()La;", "fixedHeader", "", "b", "[B", "()[B", "packetData", "<init>", "(La;[B)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MQTTMsg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final FixedHeader fixedHeader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final byte[] packetData;

    public MQTTMsg(@NotNull FixedHeader fixedHeader, @NotNull byte[] packetData) {
        Intrinsics.checkNotNullParameter(fixedHeader, "fixedHeader");
        Intrinsics.checkNotNullParameter(packetData, "packetData");
        this.fixedHeader = fixedHeader;
        this.packetData = packetData;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FixedHeader getFixedHeader() {
        return this.fixedHeader;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getPacketData() {
        return this.packetData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MQTTMsg)) {
            return false;
        }
        MQTTMsg mQTTMsg = (MQTTMsg) other;
        return Intrinsics.areEqual(this.fixedHeader, mQTTMsg.fixedHeader) && Intrinsics.areEqual(this.packetData, mQTTMsg.packetData);
    }

    public int hashCode() {
        return (this.fixedHeader.hashCode() * 31) + Arrays.hashCode(this.packetData);
    }

    @NotNull
    public String toString() {
        return "MQTTMsg(fixedHeader=" + this.fixedHeader + ", packetData=" + Arrays.toString(this.packetData) + ")";
    }
}
