package com.heytap.connect.config;

import com.heytap.connect.Env;
import com.heytap.connect.config.ip.IDns;
import com.heytap.connect.service.ProtoMetaData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010$\u001a\u00020\u0013\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020\r\u0012\b\b\u0002\u0010)\u001a\u00020\r¢\u0006\u0004\bR\u0010SJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000fJ\u009a\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010$\u001a\u00020\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0004J\u0010\u0010-\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b-\u0010\u000bJ\u001a\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\b2\u0010\u0004\"\u0004\b3\u00104R\"\u0010(\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00105\u001a\u0004\b(\u0010\u000f\"\u0004\b6\u00107R\u0019\u0010\u001f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b9\u0010\bR$\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010:\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010=R\u0019\u0010 \u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\b?\u0010\u000bR\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\b@\u0010\u000f\"\u0004\bA\u00107R$\u0010%\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010B\u001a\u0004\bC\u0010\u0018\"\u0004\bD\u0010ER$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\bF\u0010\u0004\"\u0004\bG\u00104R\u0019\u0010!\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\bH\u0010\bR\"\u0010$\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010\u0015\"\u0004\bK\u0010LR\u0019\u0010\"\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\bM\u0010\u000fR\"\u0010)\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b)\u0010\u000f\"\u0004\bN\u00107R\"\u0010'\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010>\u001a\u0004\bO\u0010\u000b\"\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/heytap/connect/config/CommonConfig;", "", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()J", "", "component4", "()I", "component5", "", "component6", "()Z", "Lcom/heytap/connect/config/ip/IDns;", "component7", "()Lcom/heytap/connect/config/ip/IDns;", "Lcom/heytap/connect/Env;", "component8", "()Lcom/heytap/connect/Env;", "Lcom/heytap/connect/service/ProtoMetaData;", "component9", "()Lcom/heytap/connect/service/ProtoMetaData;", "component10", "component11", "component12", "component13", "serverName", "cmd", "heartBeatTime", "connectTimeOut", "pskCacheFileTimeout", "verifyPeerEnable", "dns", "apiEnv", "metadata", "hasMessageAck", "maxBytesInMessage", "isSign", "isUseStat", "copy", "(Ljava/lang/String;Ljava/lang/String;JIJZLcom/heytap/connect/config/ip/IDns;Lcom/heytap/connect/Env;Lcom/heytap/connect/service/ProtoMetaData;ZIZZ)Lcom/heytap/connect/config/CommonConfig;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCmd", "setCmd", "(Ljava/lang/String;)V", "Z", "setSign", "(Z)V", "J", "getHeartBeatTime", "Lcom/heytap/connect/config/ip/IDns;", "getDns", "setDns", "(Lcom/heytap/connect/config/ip/IDns;)V", "I", "getConnectTimeOut", "getHasMessageAck", "setHasMessageAck", "Lcom/heytap/connect/service/ProtoMetaData;", "getMetadata", "setMetadata", "(Lcom/heytap/connect/service/ProtoMetaData;)V", "getServerName", "setServerName", "getPskCacheFileTimeout", "Lcom/heytap/connect/Env;", "getApiEnv", "setApiEnv", "(Lcom/heytap/connect/Env;)V", "getVerifyPeerEnable", "setUseStat", "getMaxBytesInMessage", "setMaxBytesInMessage", "(I)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIJZLcom/heytap/connect/config/ip/IDns;Lcom/heytap/connect/Env;Lcom/heytap/connect/service/ProtoMetaData;ZIZZ)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CommonConfig {

    @NotNull
    private Env apiEnv;

    @Nullable
    private String cmd;
    private final int connectTimeOut;

    @Nullable
    private IDns dns;
    private boolean hasMessageAck;
    private final long heartBeatTime;
    private boolean isSign;
    private boolean isUseStat;
    private int maxBytesInMessage;

    @Nullable
    private ProtoMetaData metadata;
    private final long pskCacheFileTimeout;

    @Nullable
    private String serverName;
    private final boolean verifyPeerEnable;

    public CommonConfig(@Nullable String str, @Nullable String str2, long j2, int i, long j3, boolean z, @Nullable IDns iDns, @NotNull Env apiEnv, @Nullable ProtoMetaData protoMetaData, boolean z2, int i2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(apiEnv, "apiEnv");
        this.serverName = str;
        this.cmd = str2;
        this.heartBeatTime = j2;
        this.connectTimeOut = i;
        this.pskCacheFileTimeout = j3;
        this.verifyPeerEnable = z;
        this.dns = iDns;
        this.apiEnv = apiEnv;
        this.metadata = protoMetaData;
        this.hasMessageAck = z2;
        this.maxBytesInMessage = i2;
        this.isSign = z3;
        this.isUseStat = z4;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getHasMessageAck() {
        return this.hasMessageAck;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMaxBytesInMessage() {
        return this.maxBytesInMessage;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsSign() {
        return this.isSign;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsUseStat() {
        return this.isUseStat;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCmd() {
        return this.cmd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getHeartBeatTime() {
        return this.heartBeatTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getConnectTimeOut() {
        return this.connectTimeOut;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPskCacheFileTimeout() {
        return this.pskCacheFileTimeout;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getVerifyPeerEnable() {
        return this.verifyPeerEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final IDns getDns() {
        return this.dns;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Env getApiEnv() {
        return this.apiEnv;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ProtoMetaData getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final CommonConfig copy(@Nullable String serverName, @Nullable String cmd, long heartBeatTime, int connectTimeOut, long pskCacheFileTimeout, boolean verifyPeerEnable, @Nullable IDns dns, @NotNull Env apiEnv, @Nullable ProtoMetaData metadata, boolean hasMessageAck, int maxBytesInMessage, boolean isSign, boolean isUseStat) {
        Intrinsics.checkNotNullParameter(apiEnv, "apiEnv");
        return new CommonConfig(serverName, cmd, heartBeatTime, connectTimeOut, pskCacheFileTimeout, verifyPeerEnable, dns, apiEnv, metadata, hasMessageAck, maxBytesInMessage, isSign, isUseStat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonConfig)) {
            return false;
        }
        CommonConfig commonConfig = (CommonConfig) other;
        return Intrinsics.areEqual(this.serverName, commonConfig.serverName) && Intrinsics.areEqual(this.cmd, commonConfig.cmd) && this.heartBeatTime == commonConfig.heartBeatTime && this.connectTimeOut == commonConfig.connectTimeOut && this.pskCacheFileTimeout == commonConfig.pskCacheFileTimeout && this.verifyPeerEnable == commonConfig.verifyPeerEnable && Intrinsics.areEqual(this.dns, commonConfig.dns) && this.apiEnv == commonConfig.apiEnv && Intrinsics.areEqual(this.metadata, commonConfig.metadata) && this.hasMessageAck == commonConfig.hasMessageAck && this.maxBytesInMessage == commonConfig.maxBytesInMessage && this.isSign == commonConfig.isSign && this.isUseStat == commonConfig.isUseStat;
    }

    @NotNull
    public final Env getApiEnv() {
        return this.apiEnv;
    }

    @Nullable
    public final String getCmd() {
        return this.cmd;
    }

    public final int getConnectTimeOut() {
        return this.connectTimeOut;
    }

    @Nullable
    public final IDns getDns() {
        return this.dns;
    }

    public final boolean getHasMessageAck() {
        return this.hasMessageAck;
    }

    public final long getHeartBeatTime() {
        return this.heartBeatTime;
    }

    public final int getMaxBytesInMessage() {
        return this.maxBytesInMessage;
    }

    @Nullable
    public final ProtoMetaData getMetadata() {
        return this.metadata;
    }

    public final long getPskCacheFileTimeout() {
        return this.pskCacheFileTimeout;
    }

    @Nullable
    public final String getServerName() {
        return this.serverName;
    }

    public final boolean getVerifyPeerEnable() {
        return this.verifyPeerEnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.serverName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cmd;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.heartBeatTime)) * 31) + Integer.hashCode(this.connectTimeOut)) * 31) + Long.hashCode(this.pskCacheFileTimeout)) * 31;
        boolean z = this.verifyPeerEnable;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        IDns iDns = this.dns;
        int iHashCode3 = (((i + (iDns == null ? 0 : iDns.hashCode())) * 31) + this.apiEnv.hashCode()) * 31;
        ProtoMetaData protoMetaData = this.metadata;
        int iHashCode4 = (iHashCode3 + (protoMetaData != null ? protoMetaData.hashCode() : 0)) * 31;
        boolean z2 = this.hasMessageAck;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int iHashCode5 = (((iHashCode4 + r1) * 31) + Integer.hashCode(this.maxBytesInMessage)) * 31;
        boolean z3 = this.isSign;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i2 = (iHashCode5 + r3) * 31;
        boolean z4 = this.isUseStat;
        return i2 + (z4 ? 1 : z4);
    }

    public final boolean isSign() {
        return this.isSign;
    }

    public final boolean isUseStat() {
        return this.isUseStat;
    }

    public final void setApiEnv(@NotNull Env env) {
        Intrinsics.checkNotNullParameter(env, "<set-?>");
        this.apiEnv = env;
    }

    public final void setCmd(@Nullable String str) {
        this.cmd = str;
    }

    public final void setDns(@Nullable IDns iDns) {
        this.dns = iDns;
    }

    public final void setHasMessageAck(boolean z) {
        this.hasMessageAck = z;
    }

    public final void setMaxBytesInMessage(int i) {
        this.maxBytesInMessage = i;
    }

    public final void setMetadata(@Nullable ProtoMetaData protoMetaData) {
        this.metadata = protoMetaData;
    }

    public final void setServerName(@Nullable String str) {
        this.serverName = str;
    }

    public final void setSign(boolean z) {
        this.isSign = z;
    }

    public final void setUseStat(boolean z) {
        this.isUseStat = z;
    }

    @NotNull
    public String toString() {
        return "CommonConfig(serverName=" + ((Object) this.serverName) + ", cmd=" + ((Object) this.cmd) + ", heartBeatTime=" + this.heartBeatTime + ", connectTimeOut=" + this.connectTimeOut + ", pskCacheFileTimeout=" + this.pskCacheFileTimeout + ", verifyPeerEnable=" + this.verifyPeerEnable + ", dns=" + this.dns + ", apiEnv=" + this.apiEnv + ", metadata=" + this.metadata + ", hasMessageAck=" + this.hasMessageAck + ", maxBytesInMessage=" + this.maxBytesInMessage + ", isSign=" + this.isSign + ", isUseStat=" + this.isUseStat + ')';
    }

    public /* synthetic */ CommonConfig(String str, String str2, long j2, int i, long j3, boolean z, IDns iDns, Env env, ProtoMetaData protoMetaData, boolean z2, int i2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 30000L : j2, (i3 & 8) != 0 ? 5000 : i, (i3 & 16) != 0 ? 2592000000L : j3, (i3 & 32) != 0 ? false : z, iDns, (i3 & 128) != 0 ? Env.RELEASE : env, (i3 & 256) != 0 ? null : protoMetaData, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? 1024 : i2, (i3 & 2048) != 0 ? true : z3, (i3 & 4096) != 0 ? false : z4);
    }
}
