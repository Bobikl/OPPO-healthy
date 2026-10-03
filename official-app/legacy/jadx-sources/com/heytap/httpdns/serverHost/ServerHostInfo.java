package com.heytap.httpdns.serverHost;

import com.heytap.common.util.TimeUtilKt;
import com.oplus.aiunit.vision.h1a;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@s15(addedVersion = 1, tableName = "server_host")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0001>B[\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0016J#\u0010\n\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0010HÆ\u0003J]\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0010HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010*\u001a\u0004\b4\u0010,\"\u0004\b5\u0010.R\"\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u0011\u00108\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b:\u00109¨\u0006?"}, d2 = {"Lcom/heytap/httpdns/serverHost/ServerHostInfo;", "Lcom/oplus/aiunit/vision/h1a;", "", "weight", "", "presetHost", "carrier", "", "isMatched$com_heytap_nearx_httpdns", "(Ljava/lang/String;Ljava/lang/String;)Z", "isMatched", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "component8", "scheme", "host", "port", "expiredAt", "_id", "copy", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getPresetHost", "()Ljava/lang/String;", "setPresetHost", "(Ljava/lang/String;)V", "getCarrier", "setCarrier", "getScheme", "setScheme", "getHost", "setHost", "I", "getPort", "()I", "setPort", "(I)V", "J", "getExpiredAt", "()J", "setExpiredAt", "(J)V", "getWeight", "setWeight", "get_id", "set_id", "isValid", "()Z", "isExpired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJIJ)V", "Companion", "a", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ServerHostInfo implements h1a {

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

    @t15(dbColumnName = "carrier")
    @NotNull
    private String carrier;

    @t15(dbColumnName = "expiredAt")
    private long expiredAt;

    @t15(dbColumnName = "host")
    @Nullable
    private String host;

    @t15(dbColumnName = "port")
    private int port;

    @t15(dbColumnName = "presetHost")
    @NotNull
    private String presetHost;

    @t15(dbColumnName = "scheme")
    @Nullable
    private String scheme;

    @t15(dbColumnName = "weight")
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
        String str = this.presetHost;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.carrier;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.scheme;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.host;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.port) * 31;
        long j2 = this.expiredAt;
        int i = (((iHashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.weight) * 31;
        long j3 = this._id;
        return i + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final boolean isExpired() {
        return this.expiredAt < TimeUtilKt.b();
    }

    public final boolean isMatched$com_heytap_nearx_httpdns(@Nullable String presetHost, @Nullable String carrier) {
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
        return "ServerHostInfo(presetHost=" + this.presetHost + ", carrier=" + this.carrier + ", scheme=" + this.scheme + ", host=" + this.host + ", port=" + this.port + ", expiredAt=" + this.expiredAt + ", weight=" + this.weight + ", _id=" + this._id + ")";
    }

    @Override // com.oplus.aiunit.vision.h1a
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
