package com.oplus.aiunit.vision;

import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.constant.Constants;
import com.heytap.health.watch.oaf.wrapper.AbsFtAgent;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.proto.WifiState;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.u0e, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010,¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R$\u00101\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010-\u001a\u0004\b\u0014\u0010.\"\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/oplus/aiunit/vision/u0e;", "Lcom/oplus/aiunit/vision/cqf;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "[B", "b", "()[B", "i", "([B)V", "deviceId", b2n.g, "alias", "c", MapSchema.FIELD_NAME_ENTRY, MapSchema.FIELD_NAME_KEY, "ksc", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "ip", "Lcom/heytap/wearable/proto/WifiState;", "Lcom/heytap/wearable/proto/WifiState;", b2n.f, "()Lcom/heytap/wearable/proto/WifiState;", LogFieldKey.MESSAGE_KEY, "(Lcom/heytap/wearable/proto/WifiState;)V", "wifiState", "Lcom/heytap/accessory/bean/PeerAccessory;", "f", "Lcom/heytap/accessory/bean/PeerAccessory;", "()Lcom/heytap/accessory/bean/PeerAccessory;", LogFieldKey.LEVEL_KEY, "(Lcom/heytap/accessory/bean/PeerAccessory;)V", Constants.EXTRA_PEER_ACCESSORY, "Lcom/heytap/health/watch/oaf/wrapper/AbsFtAgent;", "Lcom/heytap/health/watch/oaf/wrapper/AbsFtAgent;", "()Lcom/heytap/health/watch/oaf/wrapper/AbsFtAgent;", "setFtAgent", "(Lcom/heytap/health/watch/oaf/wrapper/AbsFtAgent;)V", "ftAgent", "<init>", "([B[B[BLjava/lang/String;Lcom/heytap/wearable/proto/WifiState;Lcom/heytap/accessory/bean/PeerAccessory;Lcom/heytap/health/watch/oaf/wrapper/AbsFtAgent;)V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class P2PReq implements cqf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public byte[] deviceId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public byte[] alias;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public byte[] ksc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public String ip;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public WifiState wifiState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public PeerAccessory peerAccessory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public AbsFtAgent ftAgent;

    public P2PReq() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getAlias() {
        return this.alias;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbsFtAgent getFtAgent() {
        return this.ftAgent;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final byte[] getKsc() {
        return this.ksc;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof P2PReq)) {
            return false;
        }
        P2PReq p2PReq = (P2PReq) other;
        return Intrinsics.areEqual(this.deviceId, p2PReq.deviceId) && Intrinsics.areEqual(this.alias, p2PReq.alias) && Intrinsics.areEqual(this.ksc, p2PReq.ksc) && Intrinsics.areEqual(this.ip, p2PReq.ip) && Intrinsics.areEqual(this.wifiState, p2PReq.wifiState) && Intrinsics.areEqual(this.peerAccessory, p2PReq.peerAccessory) && Intrinsics.areEqual(this.ftAgent, p2PReq.ftAgent);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final PeerAccessory getPeerAccessory() {
        return this.peerAccessory;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final WifiState getWifiState() {
        return this.wifiState;
    }

    public final void h(@Nullable byte[] bArr) {
        this.alias = bArr;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.deviceId) * 31;
        byte[] bArr = this.alias;
        int iHashCode2 = (((((iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31) + Arrays.hashCode(this.ksc)) * 31) + this.ip.hashCode()) * 31;
        WifiState wifiState = this.wifiState;
        int iHashCode3 = (iHashCode2 + (wifiState == null ? 0 : wifiState.hashCode())) * 31;
        PeerAccessory peerAccessory = this.peerAccessory;
        int iHashCode4 = (iHashCode3 + (peerAccessory == null ? 0 : peerAccessory.hashCode())) * 31;
        AbsFtAgent absFtAgent = this.ftAgent;
        return iHashCode4 + (absFtAgent != null ? absFtAgent.hashCode() : 0);
    }

    public final void i(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.deviceId = bArr;
    }

    public final void j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ip = str;
    }

    public final void k(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.ksc = bArr;
    }

    public final void l(@Nullable PeerAccessory peerAccessory) {
        this.peerAccessory = peerAccessory;
    }

    public final void m(@Nullable WifiState wifiState) {
        this.wifiState = wifiState;
    }

    @NotNull
    public String toString() {
        return "P2PReq(deviceId=" + Arrays.toString(this.deviceId) + ", alias=" + Arrays.toString(this.alias) + ", ksc=" + Arrays.toString(this.ksc) + ", ip=" + this.ip + ", wifiState=" + this.wifiState + ", peerAccessory=" + this.peerAccessory + ", ftAgent=" + this.ftAgent + ")";
    }

    public P2PReq(@NotNull byte[] deviceId, @Nullable byte[] bArr, @NotNull byte[] ksc, @NotNull String ip, @Nullable WifiState wifiState, @Nullable PeerAccessory peerAccessory, @Nullable AbsFtAgent absFtAgent) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(ksc, "ksc");
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.deviceId = deviceId;
        this.alias = bArr;
        this.ksc = ksc;
        this.ip = ip;
        this.wifiState = wifiState;
        this.peerAccessory = peerAccessory;
        this.ftAgent = absFtAgent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ P2PReq(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, WifiState wifiState, PeerAccessory peerAccessory, AbsFtAgent absFtAgent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            bArr = "".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
        }
        if ((i & 2) != 0) {
            bArr2 = "123456".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bArr2, "getBytes(...)");
        }
        byte[] bArr4 = bArr2;
        if ((i & 4) != 0) {
            bArr3 = "1234567890123456".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bArr3, "getBytes(...)");
        }
        this(bArr, bArr4, bArr3, (i & 8) == 0 ? str : "", (i & 16) != 0 ? null : wifiState, (i & 32) != 0 ? null : peerAccessory, (i & 64) != 0 ? null : absFtAgent);
    }
}
