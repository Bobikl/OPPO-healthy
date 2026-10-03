package com.heytap.httpdns.dnsList;

import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.httpdns.IpInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@s15(addedVersion = 1, tableName = AddressInfo.TABLE)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001<BU\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b9\u0010:J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\tHÆ\u0003JW\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\tHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,¨\u0006="}, d2 = {"Lcom/heytap/httpdns/dnsList/AddressInfo;", "", "", "isAddressAvailable", "", "component1", "", "component2", "component3", "", "component4", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/httpdns/IpInfo;", "component5", "component6", "component7", "host", "dnsType", "carrier", "timestamp", "ipList", "latelyIp", "_id", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "I", "getDnsType", "()I", "setDnsType", "(I)V", "getCarrier", "setCarrier", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getIpList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setIpList", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "Lokhttp3/httpdns/IpInfo;", "getLatelyIp", "()Lokhttp3/httpdns/IpInfo;", "setLatelyIp", "(Lokhttp3/httpdns/IpInfo;)V", "get_id", "set_id", "<init>", "(Ljava/lang/String;ILjava/lang/String;JLjava/util/concurrent/CopyOnWriteArrayList;Lokhttp3/httpdns/IpInfo;J)V", "Companion", "a", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AddressInfo {

    @NotNull
    public static final String COLUMN_CARRIER = "carrier";

    @NotNull
    public static final String COLUMN_DNS_TYPE = "dnsType";

    @NotNull
    public static final String COLUMN_HOST = "host";

    @NotNull
    public static final String COLUMN_TIMESTAMP = "timestamp";

    @NotNull
    public static final String TABLE = "address_info";
    private long _id;

    @t15(dbColumnName = "carrier")
    @NotNull
    private String carrier;

    @t15(dbColumnName = "dnsType")
    private int dnsType;

    @t15(dbColumnName = "host")
    @NotNull
    private String host;

    @NotNull
    private CopyOnWriteArrayList<IpInfo> ipList;

    @Nullable
    private volatile IpInfo latelyIp;

    @t15(dbColumnName = "timestamp")
    private long timestamp;
    private static final float AVALIABLE_WEIGHT = 0.75f;

    public AddressInfo() {
        this(null, 0, null, 0L, null, null, 0L, 127, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDnsType() {
        return this.dnsType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final CopyOnWriteArrayList<IpInfo> component5() {
        return this.ipList;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final IpInfo getLatelyIp() {
        return this.latelyIp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    @NotNull
    public final AddressInfo copy(@NotNull String host, int dnsType, @NotNull String carrier, long timestamp, @NotNull CopyOnWriteArrayList<IpInfo> ipList, @Nullable IpInfo latelyIp, long _id) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(ipList, "ipList");
        return new AddressInfo(host, dnsType, carrier, timestamp, ipList, latelyIp, _id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressInfo)) {
            return false;
        }
        AddressInfo addressInfo = (AddressInfo) other;
        return Intrinsics.areEqual(this.host, addressInfo.host) && this.dnsType == addressInfo.dnsType && Intrinsics.areEqual(this.carrier, addressInfo.carrier) && this.timestamp == addressInfo.timestamp && Intrinsics.areEqual(this.ipList, addressInfo.ipList) && Intrinsics.areEqual(this.latelyIp, addressInfo.latelyIp) && this._id == addressInfo._id;
    }

    @NotNull
    public final String getCarrier() {
        return this.carrier;
    }

    public final int getDnsType() {
        return this.dnsType;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final CopyOnWriteArrayList<IpInfo> getIpList() {
        return this.ipList;
    }

    @Nullable
    public final IpInfo getLatelyIp() {
        return this.latelyIp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.dnsType) * 31;
        String str2 = this.carrier;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.timestamp;
        int i = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        CopyOnWriteArrayList<IpInfo> copyOnWriteArrayList = this.ipList;
        int iHashCode3 = (i + (copyOnWriteArrayList != null ? copyOnWriteArrayList.hashCode() : 0)) * 31;
        IpInfo ipInfo = this.latelyIp;
        int iHashCode4 = (iHashCode3 + (ipInfo != null ? ipInfo.hashCode() : 0)) * 31;
        long j3 = this._id;
        return iHashCode4 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final boolean isAddressAvailable() {
        if (this.ipList.size() <= 0) {
            return false;
        }
        Iterator<IpInfo> it = this.ipList.iterator();
        while (it.hasNext()) {
            if (!IpInfo.isFailedRecently$default(it.next(), 0L, 1, null)) {
                return true;
            }
        }
        return false;
    }

    public final void setCarrier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.carrier = str;
    }

    public final void setDnsType(int i) {
        this.dnsType = i;
    }

    public final void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void setIpList(@NotNull CopyOnWriteArrayList<IpInfo> copyOnWriteArrayList) {
        Intrinsics.checkNotNullParameter(copyOnWriteArrayList, "<set-?>");
        this.ipList = copyOnWriteArrayList;
    }

    public final void setLatelyIp(@Nullable IpInfo ipInfo) {
        this.latelyIp = ipInfo;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "AddressInfo(host=" + this.host + ", dnsType=" + this.dnsType + ", carrier=" + this.carrier + ", timestamp=" + this.timestamp + ", ipList=" + this.ipList + ", latelyIp=" + this.latelyIp + ", _id=" + this._id + ")";
    }

    public AddressInfo(@NotNull String host, int i, @NotNull String carrier, long j2, @NotNull CopyOnWriteArrayList<IpInfo> ipList, @Nullable IpInfo ipInfo, long j3) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(ipList, "ipList");
        this.host = host;
        this.dnsType = i;
        this.carrier = carrier;
        this.timestamp = j2;
        this.ipList = ipList;
        this.latelyIp = ipInfo;
        this._id = j3;
    }

    public /* synthetic */ AddressInfo(String str, int i, String str2, long j2, CopyOnWriteArrayList copyOnWriteArrayList, IpInfo ipInfo, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList, (i2 & 32) != 0 ? null : ipInfo, (i2 & 64) != 0 ? 0L : j3);
    }
}
