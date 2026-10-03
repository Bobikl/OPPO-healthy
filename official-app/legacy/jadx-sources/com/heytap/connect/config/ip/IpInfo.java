package com.heytap.connect.config.ip;

import com.heytap.connect.TapConst;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010BA\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010\u0004\"\u0004\b#\u0010$R\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010(R\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010%\u001a\u0004\b)\u0010\t\"\u0004\b*\u0010(R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010 R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b-\u0010\u0004¨\u00061"}, d2 = {"Lcom/heytap/connect/config/ip/IpInfo;", "", "", "toString", "()Ljava/lang/String;", "toSimpleString", "component1", "", "component2", "()I", "", "component3", "()J", "component4", "component5", "component6", "ip", "port", "ttl", "weight", "sp", SpeechConstant.KEY_TTS_TIMESTAMP, "copy", "(Ljava/lang/String;IJILjava/lang/String;J)Lcom/heytap/connect/config/ip/IpInfo;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTtl", "setTtl", "(J)V", "Ljava/lang/String;", "getSp", "setSp", "(Ljava/lang/String;)V", "I", "getPort", "setPort", "(I)V", "getWeight", "setWeight", "getTimeStamp", "setTimeStamp", "getIp", "<init>", "(Ljava/lang/String;IJILjava/lang/String;J)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IpInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String ip;
    private int port;

    @NotNull
    private String sp;
    private long timeStamp;
    private long ttl;
    private int weight;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/connect/config/ip/IpInfo$Companion;", "", "Lcom/heytap/connect/config/ip/IpInfo;", "ipInfo", "", "isValid", "(Lcom/heytap/connect/config/ip/IpInfo;)Z", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isValid(@Nullable IpInfo ipInfo) {
            if (ipInfo == null) {
                return false;
            }
            String ip = ipInfo.getIp();
            return !(ip == null || ip.length() == 0) && ipInfo.getPort() > 0;
        }
    }

    public IpInfo(@NotNull String ip, int i, long j2, int i2, @NotNull String sp, long j3) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(sp, "sp");
        this.ip = ip;
        this.port = i;
        this.ttl = j2;
        this.weight = i2;
        this.sp = sp;
        this.timeStamp = j3;
    }

    @JvmStatic
    public static final boolean isValid(@Nullable IpInfo ipInfo) {
        return INSTANCE.isValid(ipInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSp() {
        return this.sp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final IpInfo copy(@NotNull String ip, int port, long ttl, int weight, @NotNull String sp, long timeStamp) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(sp, "sp");
        return new IpInfo(ip, port, ttl, weight, sp, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IpInfo)) {
            return false;
        }
        IpInfo ipInfo = (IpInfo) other;
        return Intrinsics.areEqual(this.ip, ipInfo.ip) && this.port == ipInfo.port && this.ttl == ipInfo.ttl && this.weight == ipInfo.weight && Intrinsics.areEqual(this.sp, ipInfo.sp) && this.timeStamp == ipInfo.timeStamp;
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }

    public final int getPort() {
        return this.port;
    }

    @NotNull
    public final String getSp() {
        return this.sp;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((this.ip.hashCode() * 31) + Integer.hashCode(this.port)) * 31) + Long.hashCode(this.ttl)) * 31) + Integer.hashCode(this.weight)) * 31) + this.sp.hashCode()) * 31) + Long.hashCode(this.timeStamp);
    }

    public final void setPort(int i) {
        this.port = i;
    }

    public final void setSp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sp = str;
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    public final void setTtl(long j2) {
        this.ttl = j2;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    @NotNull
    public final String toSimpleString() {
        return this.ip + ':' + this.port;
    }

    @NotNull
    public String toString() {
        return "IpInfo(ip='" + this.ip + "', port=" + this.port + ", ttl=" + this.ttl + ", weight=" + this.weight + ", sp='" + this.sp + "', timeStamp=" + this.timeStamp + ')';
    }

    public /* synthetic */ IpInfo(String str, int i, long j2, int i2, String str2, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 80 : i, (i3 & 4) != 0 ? TapConst.IP_TTL_DEFAULT : j2, (i3 & 8) != 0 ? 1 : i2, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? System.currentTimeMillis() : j3);
    }
}
