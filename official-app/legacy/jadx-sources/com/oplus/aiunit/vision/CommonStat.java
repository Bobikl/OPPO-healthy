package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.okhttp.extension.request.OKHttpRequestHandler;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.vo3, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001c\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\u0004\b1\u00102J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010$R\"\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u001d\u0010\f\"\u0004\b,\u0010$R(\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001e\u001a\u0004\b!\u0010\u001f\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/oplus/aiunit/vision/vo3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "packageName", "b", "netType", "", "c", "J", "i", "()J", SpeechConstant.KEY_TTS_TIMESTAMP, "d", "clientVersion", "Lcom/oplus/aiunit/vision/opc;", "Lcom/oplus/aiunit/vision/opc;", "()Lcom/oplus/aiunit/vision/opc;", "networkTypeStat", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "networkInfo", b2n.f, b2n.g, LogFieldKey.MESSAGE_KEY, "(Ljava/lang/String;)V", OKHttpRequestHandler.RSP_TARGET_IP, "Z", "j", "()Z", MapSchema.FIELD_NAME_KEY, "(Z)V", "isConnected", LogFieldKey.LEVEL_KEY, "protocol", "setProtocols", "(Ljava/util/List;)V", "protocols", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/oplus/aiunit/vision/opc;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class CommonStat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String netType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long timeStamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String clientVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final opc networkTypeStat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<String> networkInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public String targetIp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public boolean isConnected;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public String protocol;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public List<String> protocols;

    public CommonStat(@NotNull String packageName, @NotNull String netType, long j2, @NotNull String clientVersion, @NotNull opc networkTypeStat, @NotNull List<String> networkInfo, @NotNull String targetIp, boolean z, @NotNull String protocol, @NotNull List<String> protocols) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(netType, "netType");
        Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
        Intrinsics.checkNotNullParameter(networkTypeStat, "networkTypeStat");
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        Intrinsics.checkNotNullParameter(targetIp, "targetIp");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        this.packageName = packageName;
        this.netType = netType;
        this.timeStamp = j2;
        this.clientVersion = clientVersion;
        this.networkTypeStat = networkTypeStat;
        this.networkInfo = networkInfo;
        this.targetIp = targetIp;
        this.isConnected = z;
        this.protocol = protocol;
        this.protocols = protocols;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClientVersion() {
        return this.clientVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNetType() {
        return this.netType;
    }

    @NotNull
    public final List<String> c() {
        return this.networkInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final opc getNetworkTypeStat() {
        return this.networkTypeStat;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonStat)) {
            return false;
        }
        CommonStat commonStat = (CommonStat) other;
        return Intrinsics.areEqual(this.packageName, commonStat.packageName) && Intrinsics.areEqual(this.netType, commonStat.netType) && this.timeStamp == commonStat.timeStamp && Intrinsics.areEqual(this.clientVersion, commonStat.clientVersion) && Intrinsics.areEqual(this.networkTypeStat, commonStat.networkTypeStat) && Intrinsics.areEqual(this.networkInfo, commonStat.networkInfo) && Intrinsics.areEqual(this.targetIp, commonStat.targetIp) && this.isConnected == commonStat.isConnected && Intrinsics.areEqual(this.protocol, commonStat.protocol) && Intrinsics.areEqual(this.protocols, commonStat.protocols);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final List<String> g() {
        return this.protocols;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTargetIp() {
        return this.targetIp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v30 */
    public int hashCode() {
        String str = this.packageName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.netType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.timeStamp;
        int i = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.clientVersion;
        int iHashCode3 = (i + (str3 != null ? str3.hashCode() : 0)) * 31;
        opc opcVar = this.networkTypeStat;
        int iHashCode4 = (iHashCode3 + (opcVar != null ? opcVar.hashCode() : 0)) * 31;
        List<String> list = this.networkInfo;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.targetIp;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isConnected;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i2 = (iHashCode6 + r2) * 31;
        String str5 = this.protocol;
        int iHashCode7 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list2 = this.protocols;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public final void k(boolean z) {
        this.isConnected = z;
    }

    public final void l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.protocol = str;
    }

    public final void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetIp = str;
    }

    @NotNull
    public String toString() {
        return "CommonStat(packageName=" + this.packageName + ", netType=" + this.netType + ", timeStamp=" + this.timeStamp + ", clientVersion=" + this.clientVersion + ", networkTypeStat=" + this.networkTypeStat + ", networkInfo=" + this.networkInfo + ", targetIp=" + this.targetIp + ", isConnected=" + this.isConnected + ", protocol=" + this.protocol + ", protocols=" + this.protocols + ")";
    }

    public /* synthetic */ CommonStat(String str, String str2, long j2, String str3, opc opcVar, List list, String str4, boolean z, String str5, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j2, str3, opcVar, (i & 32) != 0 ? new ArrayList() : list, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? true : z, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? new ArrayList() : list2);
    }
}
