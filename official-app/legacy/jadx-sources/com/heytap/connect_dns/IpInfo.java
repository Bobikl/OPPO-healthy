package com.heytap.connect_dns;

import com.oplus.aiunit.vision.ap6;
import java.net.InetAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b)\b\u0086\b\u0018\u0000 [2\u00020\u0001:\u0001[B\u0091\u0001\u0012\b\b\u0002\u0010&\u001a\u00020\f\u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010)\u001a\u00020\f\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010-\u001a\u00020\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010/\u001a\u00020\n¢\u0006\u0004\bY\u0010ZJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0004J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0004J\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u009a\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\f2\b\b\u0002\u0010'\u001a\u00020\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010)\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010-\u001a\u00020\n2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010/\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u0004J\u001a\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\"\u0010/\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00107\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010:R\"\u0010-\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u00107\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010:R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010=\u001a\u0004\b>\u0010\u0004\"\u0004\b?\u0010@R\"\u0010&\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010A\u001a\u0004\bB\u0010\u0015\"\u0004\bC\u0010DR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010=\u001a\u0004\bE\u0010\u0004\"\u0004\bF\u0010@R\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00107\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u0010:R$\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010A\u001a\u0004\bI\u0010\u0015\"\u0004\bJ\u0010DR$\u0010,\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010A\u001a\u0004\bK\u0010\u0015\"\u0004\bL\u0010DR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00107\u001a\u0004\bM\u0010\u0018\"\u0004\bN\u0010:R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\bO\u0010\u0004\"\u0004\bP\u0010@R\"\u0010)\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010A\u001a\u0004\bQ\u0010\u0015\"\u0004\bR\u0010DR$\u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010A\u001a\u0004\bS\u0010\u0015\"\u0004\bT\u0010DR$\u0010.\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010U\u001a\u0004\bV\u0010$\"\u0004\bW\u0010X¨\u0006\\"}, d2 = {"Lcom/heytap/connect_dns/IpInfo;", "Lcom/heytap/connect_dns/IWeight;", "", "weight", "()I", "", "isExpire", "()Z", "markSuccess", "failCount", "", "failTime", "", "msg", "", "markFailed", "(IJLjava/lang/String;)V", "failExpireTime", "isFailedRecently", "(J)Z", "toString", "()Ljava/lang/String;", "component1", "component2", "()J", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "Ljava/net/InetAddress;", "component12", "()Ljava/net/InetAddress;", "component13", "host", "ttl", "carrier", "ip", "port", "dnUnitSet", "failMsg", "expire", "inetAddress", "_id", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;IJLjava/lang/String;JLjava/net/InetAddress;J)Lcom/heytap/connect_dns/IpInfo;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "get_id", "set_id", "(J)V", "getExpire", "setExpire", "I", "getPort", "setPort", "(I)V", "Ljava/lang/String;", "getHost", "setHost", "(Ljava/lang/String;)V", "getWeight", "setWeight", "getTtl", "setTtl", "getDnUnitSet", "setDnUnitSet", "getFailMsg", "setFailMsg", "getFailTime", "setFailTime", "getFailCount", "setFailCount", "getIp", "setIp", "getCarrier", "setCarrier", "Ljava/net/InetAddress;", "getInetAddress", "setInetAddress", "(Ljava/net/InetAddress;)V", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;IJLjava/lang/String;JLjava/net/InetAddress;J)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class IpInfo implements IWeight {

    @NotNull
    public static final String COLUMN_CARRIER = "carrier";

    @NotNull
    public static final String COLUMN_DN_UNIT_SET = "dn_unit_set";

    @NotNull
    public static final String COLUMN_EXPIRED_AT = "expireAt";

    @NotNull
    public static final String COLUMN_FAIL_COUNT = "failCount";

    @NotNull
    public static final String COLUMN_FAIL_MSG = "failMsg";

    @NotNull
    public static final String COLUMN_FAIL_TIME = "failTime";

    @NotNull
    public static final String COLUMN_HOST = "host";

    @NotNull
    public static final String COLUMN_IP = "ip";

    @NotNull
    public static final String COLUMN_PORT = "port";

    @NotNull
    public static final String COLUMN_TTL = "ttl";

    @NotNull
    public static final String COLUMN_WEIGHT = "weight";

    @NotNull
    public static final String TABLE = "ip_list_info";
    private long _id;

    @Nullable
    private String carrier;

    @Nullable
    private String dnUnitSet;
    private long expire;
    private int failCount;

    @Nullable
    private String failMsg;
    private long failTime;

    @NotNull
    private String host;

    @Nullable
    private InetAddress inetAddress;

    @NotNull
    private String ip;
    private int port;
    private long ttl;
    private int weight;

    public IpInfo() {
        this(null, 0L, null, null, 0, 0, null, 0, 0L, null, 0L, null, 0L, 8191, null);
    }

    public static /* synthetic */ boolean isFailedRecently$default(IpInfo ipInfo, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL;
        }
        return ipInfo.isFailedRecently(j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFailMsg() {
        return this.failMsg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getExpire() {
        return this.expire;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final InetAddress getInetAddress() {
        return this.inetAddress;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDnUnitSet() {
        return this.dnUnitSet;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFailCount() {
        return this.failCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getFailTime() {
        return this.failTime;
    }

    @NotNull
    public final IpInfo copy(@NotNull String host, long ttl, @Nullable String carrier, @NotNull String ip, int port, int weight, @Nullable String dnUnitSet, int failCount, long failTime, @Nullable String failMsg, long expire, @Nullable InetAddress inetAddress, long _id) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ip, "ip");
        return new IpInfo(host, ttl, carrier, ip, port, weight, dnUnitSet, failCount, failTime, failMsg, expire, inetAddress, _id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IpInfo)) {
            return false;
        }
        IpInfo ipInfo = (IpInfo) other;
        return Intrinsics.areEqual(this.host, ipInfo.host) && this.ttl == ipInfo.ttl && Intrinsics.areEqual(this.carrier, ipInfo.carrier) && Intrinsics.areEqual(this.ip, ipInfo.ip) && this.port == ipInfo.port && this.weight == ipInfo.weight && Intrinsics.areEqual(this.dnUnitSet, ipInfo.dnUnitSet) && this.failCount == ipInfo.failCount && this.failTime == ipInfo.failTime && Intrinsics.areEqual(this.failMsg, ipInfo.failMsg) && this.expire == ipInfo.expire && Intrinsics.areEqual(this.inetAddress, ipInfo.inetAddress) && this._id == ipInfo._id;
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final String getDnUnitSet() {
        return this.dnUnitSet;
    }

    public final long getExpire() {
        return this.expire;
    }

    public final int getFailCount() {
        return this.failCount;
    }

    @Nullable
    public final String getFailMsg() {
        return this.failMsg;
    }

    public final long getFailTime() {
        return this.failTime;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final InetAddress getInetAddress() {
        return this.inetAddress;
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }

    public final int getPort() {
        return this.port;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        int iHashCode = ((this.host.hashCode() * 31) + Long.hashCode(this.ttl)) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.ip.hashCode()) * 31) + Integer.hashCode(this.port)) * 31) + Integer.hashCode(this.weight)) * 31;
        String str2 = this.dnUnitSet;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.failCount)) * 31) + Long.hashCode(this.failTime)) * 31;
        String str3 = this.failMsg;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.expire)) * 31;
        InetAddress inetAddress = this.inetAddress;
        return ((iHashCode4 + (inetAddress != null ? inetAddress.hashCode() : 0)) * 31) + Long.hashCode(this._id);
    }

    public final boolean isExpire() {
        return this.expire < UtilKt.timeMillis();
    }

    public final boolean isFailedRecently(long failExpireTime) {
        return this.failCount > 0 && UtilKt.timeMillis() - this.failTime < failExpireTime;
    }

    public final synchronized void markFailed(int failCount, long failTime, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.failCount = failCount;
        this.failTime = failTime;
        this.failMsg = msg;
    }

    public final synchronized boolean markSuccess() {
        if (this.failCount == 0) {
            return false;
        }
        this.failCount = 0;
        this.failTime = 0L;
        this.failMsg = null;
        return true;
    }

    public final void setCarrier(@Nullable String str) {
        this.carrier = str;
    }

    public final void setDnUnitSet(@Nullable String str) {
        this.dnUnitSet = str;
    }

    public final void setExpire(long j2) {
        this.expire = j2;
    }

    public final void setFailCount(int i) {
        this.failCount = i;
    }

    public final void setFailMsg(@Nullable String str) {
        this.failMsg = str;
    }

    public final void setFailTime(long j2) {
        this.failTime = j2;
    }

    public final void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void setInetAddress(@Nullable InetAddress inetAddress) {
        this.inetAddress = inetAddress;
    }

    public final void setIp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ip = str;
    }

    public final void setPort(int i) {
        this.port = i;
    }

    public final void setTtl(long j2) {
        this.ttl = j2;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "IpInfo(host='" + this.host + "', ttl=" + this.ttl + ", carrier=" + ((Object) this.carrier) + ", ip='" + this.ip + "', port=" + this.port + ", weight=" + this.weight + ", dnUnitSet=" + ((Object) this.dnUnitSet) + ", failCount=" + this.failCount + ", failTime=" + this.failTime + ", failMsg=" + ((Object) this.failMsg) + ", expire=" + this.expire + ", inetAddress=" + this.inetAddress + ", _id=" + this._id + ')';
    }

    @Override // com.heytap.connect_dns.IWeight
    public int weight() {
        return this.weight;
    }

    public IpInfo(@NotNull String host, long j2, @Nullable String str, @NotNull String ip, int i, int i2, @Nullable String str2, int i3, long j3, @Nullable String str3, long j4, @Nullable InetAddress inetAddress, long j5) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.host = host;
        this.ttl = j2;
        this.carrier = str;
        this.ip = ip;
        this.port = i;
        this.weight = i2;
        this.dnUnitSet = str2;
        this.failCount = i3;
        this.failTime = j3;
        this.failMsg = str3;
        this.expire = j4;
        this.inetAddress = inetAddress;
        this._id = j5;
        if (j4 <= 0) {
            this.expire = UtilKt.timeMillis() + (this.ttl * ((long) 1000));
        }
    }

    public /* synthetic */ IpInfo(String str, long j2, String str2, String str3, int i, int i2, String str4, int i3, long j3, String str5, long j4, InetAddress inetAddress, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? "" : str4, (i4 & 128) == 0 ? i3 : 0, (i4 & 256) != 0 ? 0L : j3, (i4 & 512) == 0 ? str5 : "", (i4 & 1024) != 0 ? 0L : j4, (i4 & 2048) != 0 ? null : inetAddress, (i4 & 4096) != 0 ? 0L : j5);
    }
}
