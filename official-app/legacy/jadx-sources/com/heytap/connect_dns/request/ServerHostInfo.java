package com.heytap.connect_dns.request;

import com.heytap.connect_dns.IWeight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b \b\u0086\b\u0018\u0000 ?2\u00020\u0001:\u0001?B[\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b=\u0010>J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u000b\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014Jd\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0004J\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010'R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010+R\u0013\u0010,\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u00020\b8F@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b/\u0010\u0004\"\u0004\b0\u0010+R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010'R$\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010$\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010'R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010'R\"\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00107\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010:R\"\u0010\u001b\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00107\u001a\u0004\b;\u0010\u0014\"\u0004\b<\u0010:¨\u0006@"}, d2 = {"Lcom/heytap/connect_dns/request/ServerHostInfo;", "Lcom/heytap/connect_dns/IWeight;", "", "weight", "()I", "", "presetHost", "carrier", "", "isMatched$connect_release", "(Ljava/lang/String;Ljava/lang/String;)Z", "isMatched", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "", "component6", "()J", "component7", "component8", "scheme", "host", "port", "expiredAt", "_id", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJIJ)Lcom/heytap/connect_dns/request/ServerHostInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHost", "setHost", "(Ljava/lang/String;)V", "I", "getPort", "setPort", "(I)V", "isValid", "()Z", "isExpired", "getWeight", "setWeight", "getCarrier", "setCarrier", "getScheme", "setScheme", "getPresetHost", "setPresetHost", "J", "getExpiredAt", "setExpiredAt", "(J)V", "get_id", "set_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJIJ)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ServerHostInfo implements IWeight {

    @NotNull
    public static final String COLUMN_CARRIER = "carrier";

    @NotNull
    public static final String COLUMN_EXPIRE = "expiredAt";

    @NotNull
    public static final String COLUMN_HOST = "host";

    @NotNull
    public static final String COLUMN_PORT = "port";

    @NotNull
    public static final String COLUMN_PRESET_HOST = "presetHost";

    @NotNull
    public static final String COLUMN_SCHEMA = "scheme";

    @NotNull
    public static final String COLUMN_WEIGHT = "weight";

    @NotNull
    public static final String TABLE = "server_host";
    private long _id;

    @NotNull
    private String carrier;
    private long expiredAt;

    @Nullable
    private String host;
    private int port;

    @NotNull
    private String presetHost;

    @Nullable
    private String scheme;
    private int weight;

    public ServerHostInfo() {
        this(null, null, null, null, 0, 0L, 0, 0L, 255, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPresetHost() {
        return this.presetHost;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getExpiredAt() {
        return this.expiredAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    @NotNull
    public final ServerHostInfo copy(@NotNull String presetHost, @NotNull String carrier, @Nullable String scheme, @Nullable String host, int port, long expiredAt, int weight, long _id) {
        Intrinsics.checkNotNullParameter(presetHost, "presetHost");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        return new ServerHostInfo(presetHost, carrier, scheme, host, port, expiredAt, weight, _id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerHostInfo)) {
            return false;
        }
        ServerHostInfo serverHostInfo = (ServerHostInfo) other;
        return Intrinsics.areEqual(this.presetHost, serverHostInfo.presetHost) && Intrinsics.areEqual(this.carrier, serverHostInfo.carrier) && Intrinsics.areEqual(this.scheme, serverHostInfo.scheme) && Intrinsics.areEqual(this.host, serverHostInfo.host) && this.port == serverHostInfo.port && this.expiredAt == serverHostInfo.expiredAt && this.weight == serverHostInfo.weight && this._id == serverHostInfo._id;
    }

    @NotNull
    public final String getCarrier() {
        return this.carrier;
    }

    public final long getExpiredAt() {
        return this.expiredAt;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    public final int getPort() {
        return this.port;
    }

    @NotNull
    public final String getPresetHost() {
        return this.presetHost;
    }

    @Nullable
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        int iHashCode = ((this.presetHost.hashCode() * 31) + this.carrier.hashCode()) * 31;
        String str = this.scheme;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.host;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.port)) * 31) + Long.hashCode(this.expiredAt)) * 31) + Integer.hashCode(this.weight)) * 31) + Long.hashCode(this._id);
    }

    public final boolean isExpired() {
        return this.expiredAt < System.currentTimeMillis();
    }

    public final boolean isMatched$connect_release(@Nullable String presetHost, @Nullable String carrier) {
        return presetHost != null && StringsKt__StringsJVMKt.equals(presetHost, this.presetHost, true) && carrier != null && StringsKt__StringsJVMKt.equals(carrier, this.carrier, true);
    }

    public final boolean isValid() {
        String str;
        String str2 = this.scheme;
        if (str2 != null) {
            Intrinsics.checkNotNull(str2);
            if (str2.length() > 0 && (str = this.host) != null) {
                Intrinsics.checkNotNull(str);
                if (str.length() > 0 && this.port > 0 && this.weight > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void setCarrier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.carrier = str;
    }

    public final void setExpiredAt(long j2) {
        this.expiredAt = j2;
    }

    public final void setHost(@Nullable String str) {
        this.host = str;
    }

    public final void setPort(int i) {
        this.port = i;
    }

    public final void setPresetHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presetHost = str;
    }

    public final void setScheme(@Nullable String str) {
        this.scheme = str;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "ServerHostInfo(presetHost=" + this.presetHost + ", carrier=" + this.carrier + ", scheme=" + ((Object) this.scheme) + ", host=" + ((Object) this.host) + ", port=" + this.port + ", expiredAt=" + this.expiredAt + ", weight=" + this.weight + ", _id=" + this._id + ')';
    }

    @Override // com.heytap.connect_dns.IWeight
    public int weight() {
        return this.weight;
    }

    public ServerHostInfo(@NotNull String presetHost, @NotNull String carrier, @Nullable String str, @Nullable String str2, int i, long j2, int i2, long j3) {
        Intrinsics.checkNotNullParameter(presetHost, "presetHost");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        this.presetHost = presetHost;
        this.carrier = carrier;
        this.scheme = str;
        this.host = str2;
        this.port = i;
        this.expiredAt = j2;
        this.weight = i2;
        this._id = j3;
    }

    public /* synthetic */ ServerHostInfo(String str, String str2, String str3, String str4, int i, long j2, int i2, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0L : j2, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? 0L : j3);
    }
}
