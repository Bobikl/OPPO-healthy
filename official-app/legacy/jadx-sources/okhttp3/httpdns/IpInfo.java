package okhttp3.httpdns;

import com.heytap.common.util.TimeUtilKt;
import com.oplus.aiunit.vision.ap6;
import com.oplus.aiunit.vision.h1a;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import java.net.InetAddress;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@s15(addedVersion = 1, tableName = "ip_list_info")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0001cB\u00ad\u0001\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010*\u001a\u00020\b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001f\u0012\b\b\u0002\u0010-\u001a\u00020\b¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\nH\u0016J\t\u0010\u0011\u001a\u00020\nHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u0015\u001a\u00020\nHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0002HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001fHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J¯\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010*\u001a\u00020\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001f2\b\b\u0002\u0010-\u001a\u00020\bHÆ\u0001J\t\u0010/\u001a\u00020\u0002HÖ\u0001J\u0013\u00102\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003R\"\u0010\"\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010%\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\"\u0010&\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u00103\u001a\u0004\bD\u00105\"\u0004\bE\u00107R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u00108\u001a\u0004\bF\u0010:\"\u0004\bG\u0010<R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u00108\u001a\u0004\bH\u0010:\"\u0004\bI\u0010<R$\u0010(\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u00103\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u00108\u001a\u0004\bL\u0010:\"\u0004\bM\u0010<R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\bN\u0010?\"\u0004\bO\u0010AR$\u0010)\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u00103\u001a\u0004\bP\u00105\"\u0004\bQ\u00107R\"\u0010*\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010=\u001a\u0004\bR\u0010?\"\u0004\bS\u0010AR$\u0010+\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010-\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010=\u001a\u0004\b^\u0010?\"\u0004\b_\u0010A¨\u0006d"}, d2 = {"Lokhttp3/httpdns/IpInfo;", "Lcom/oplus/aiunit/vision/h1a;", "", "weight", "", "isExpire", "markSuccess", "failCount", "", "failTime", "", "msg", "", "markFailed", "failExpireTime", "isFailedRecently", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "Ljava/net/InetAddress;", "component13", "Ljava/util/concurrent/CopyOnWriteArrayList;", "component14", "component15", "host", "dnsType", "ttl", "carrier", "ip", "port", "dnUnitSet", "failMsg", "expire", "inetAddress", "inetAddressList", "_id", "copy", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "I", "getDnsType", "()I", "setDnsType", "(I)V", "J", "getTtl", "()J", "setTtl", "(J)V", "getCarrier", "setCarrier", "getIp", "setIp", "getPort", "setPort", "getWeight", "setWeight", "getDnUnitSet", "setDnUnitSet", "getFailCount", "setFailCount", "getFailTime", "setFailTime", "getFailMsg", "setFailMsg", "getExpire", "setExpire", "Ljava/net/InetAddress;", "getInetAddress", "()Ljava/net/InetAddress;", "setInetAddress", "(Ljava/net/InetAddress;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getInetAddressList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setInetAddressList", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "get_id", "set_id", "<init>", "(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;IILjava/lang/String;IJLjava/lang/String;JLjava/net/InetAddress;Ljava/util/concurrent/CopyOnWriteArrayList;J)V", "Companion", "a", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final /* data */ class IpInfo implements h1a {

    @NotNull
    public static final String COLUMN_CARRIER = "carrier";

    @NotNull
    public static final String COLUMN_DNS_TYPE = "dnsType";

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

    @t15(dbColumnName = "carrier")
    @Nullable
    private String carrier;

    @t15(dbColumnName = "dn_unit_set")
    @Nullable
    private String dnUnitSet;

    @t15(dbColumnName = "dnsType")
    private int dnsType;

    @t15(dbColumnName = "expireAt")
    private long expire;

    @t15(dbColumnName = "failCount")
    private int failCount;

    @t15(dbColumnName = "failMsg")
    @Nullable
    private String failMsg;

    @t15(dbColumnName = "failTime")
    private long failTime;

    @t15(dbColumnName = "host")
    @NotNull
    private String host;

    @Nullable
    private InetAddress inetAddress;

    @Nullable
    private CopyOnWriteArrayList<InetAddress> inetAddressList;

    @t15(dbColumnName = "ip")
    @NotNull
    private String ip;

    @t15(dbColumnName = "port")
    private int port;

    @t15(dbColumnName = "ttl")
    private long ttl;

    @t15(dbColumnName = "weight")
    private int weight;

    public IpInfo() {
        this(null, 0, 0L, null, null, 0, 0, null, 0, 0L, null, 0L, null, null, 0L, 32767, null);
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

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getFailTime() {
        return this.failTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFailMsg() {
        return this.failMsg;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getExpire() {
        return this.expire;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final InetAddress getInetAddress() {
        return this.inetAddress;
    }

    @Nullable
    public final CopyOnWriteArrayList<InetAddress> component14() {
        return this.inetAddressList;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDnsType() {
        return this.dnsType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDnUnitSet() {
        return this.dnUnitSet;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFailCount() {
        return this.failCount;
    }

    @NotNull
    public final IpInfo copy(@NotNull String host, int dnsType, long ttl, @Nullable String carrier, @NotNull String ip, int port, int weight, @Nullable String dnUnitSet, int failCount, long failTime, @Nullable String failMsg, long expire, @Nullable InetAddress inetAddress, @Nullable CopyOnWriteArrayList<InetAddress> inetAddressList, long _id) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ip, "ip");
        return new IpInfo(host, dnsType, ttl, carrier, ip, port, weight, dnUnitSet, failCount, failTime, failMsg, expire, inetAddress, inetAddressList, _id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IpInfo)) {
            return false;
        }
        IpInfo ipInfo = (IpInfo) other;
        return Intrinsics.areEqual(this.host, ipInfo.host) && this.dnsType == ipInfo.dnsType && this.ttl == ipInfo.ttl && Intrinsics.areEqual(this.carrier, ipInfo.carrier) && Intrinsics.areEqual(this.ip, ipInfo.ip) && this.port == ipInfo.port && this.weight == ipInfo.weight && Intrinsics.areEqual(this.dnUnitSet, ipInfo.dnUnitSet) && this.failCount == ipInfo.failCount && this.failTime == ipInfo.failTime && Intrinsics.areEqual(this.failMsg, ipInfo.failMsg) && this.expire == ipInfo.expire && Intrinsics.areEqual(this.inetAddress, ipInfo.inetAddress) && Intrinsics.areEqual(this.inetAddressList, ipInfo.inetAddressList) && this._id == ipInfo._id;
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final String getDnUnitSet() {
        return this.dnUnitSet;
    }

    public final int getDnsType() {
        return this.dnsType;
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

    @Nullable
    public final CopyOnWriteArrayList<InetAddress> getInetAddressList() {
        return this.inetAddressList;
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
        String str = this.host;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.dnsType) * 31;
        long j2 = this.ttl;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.carrier;
        int iHashCode2 = (i + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ip;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.port) * 31) + this.weight) * 31;
        String str4 = this.dnUnitSet;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.failCount) * 31;
        long j3 = this.failTime;
        int i2 = (iHashCode4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.failMsg;
        int iHashCode5 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        long j4 = this.expire;
        int i3 = (iHashCode5 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        InetAddress inetAddress = this.inetAddress;
        int iHashCode6 = (i3 + (inetAddress != null ? inetAddress.hashCode() : 0)) * 31;
        CopyOnWriteArrayList<InetAddress> copyOnWriteArrayList = this.inetAddressList;
        int iHashCode7 = (iHashCode6 + (copyOnWriteArrayList != null ? copyOnWriteArrayList.hashCode() : 0)) * 31;
        long j5 = this._id;
        return iHashCode7 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final boolean isExpire() {
        return this.expire < TimeUtilKt.b();
    }

    public final boolean isFailedRecently(long failExpireTime) {
        return this.failCount > 0 && TimeUtilKt.b() - this.failTime < failExpireTime;
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

    public final void setDnsType(int i) {
        this.dnsType = i;
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

    public final void setInetAddressList(@Nullable CopyOnWriteArrayList<InetAddress> copyOnWriteArrayList) {
        this.inetAddressList = copyOnWriteArrayList;
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
        return "IpInfo(host='" + this.host + "', dnsType=" + this.dnsType + ", ttl=" + this.ttl + ", carrier=" + this.carrier + ", ip='" + this.ip + "', port=" + this.port + ", weight=" + this.weight + ", dnUnitSet=" + this.dnUnitSet + ", failCount=" + this.failCount + ", failTime=" + this.failTime + ", failMsg=" + this.failMsg + ", expire=" + this.expire + ")";
    }

    @Override // com.oplus.aiunit.vision.h1a
    public int weight() {
        return this.weight;
    }

    public IpInfo(@NotNull String host, int i, long j2, @Nullable String str, @NotNull String ip, int i2, int i3, @Nullable String str2, int i4, long j3, @Nullable String str3, long j4, @Nullable InetAddress inetAddress, @Nullable CopyOnWriteArrayList<InetAddress> copyOnWriteArrayList, long j5) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.host = host;
        this.dnsType = i;
        this.ttl = j2;
        this.carrier = str;
        this.ip = ip;
        this.port = i2;
        this.weight = i3;
        this.dnUnitSet = str2;
        this.failCount = i4;
        this.failTime = j3;
        this.failMsg = str3;
        this.expire = j4;
        this.inetAddress = inetAddress;
        this.inetAddressList = copyOnWriteArrayList;
        this._id = j5;
        if (j4 <= 0) {
            this.expire = TimeUtilKt.b() + (this.ttl * ((long) 1000));
        }
    }

    public /* synthetic */ IpInfo(String str, int i, long j2, String str2, String str3, int i2, int i3, String str4, int i4, long j3, String str5, long j4, InetAddress inetAddress, CopyOnWriteArrayList copyOnWriteArrayList, long j5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0L : j2, (i5 & 8) != 0 ? "" : str2, (i5 & 16) != 0 ? "" : str3, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? "" : str4, (i5 & 256) == 0 ? i4 : 0, (i5 & 512) != 0 ? 0L : j3, (i5 & 1024) == 0 ? str5 : "", (i5 & 2048) != 0 ? 0L : j4, (i5 & 4096) != 0 ? null : inetAddress, (i5 & 8192) != 0 ? null : copyOnWriteArrayList, (i5 & 16384) != 0 ? 0L : j5);
    }
}
