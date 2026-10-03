package com.oplus.aiunit.vision;

import com.heytap.common.bean.BoolConfig;
import com.heytap.common.bean.ConnectMode;
import com.heytap.common.bean.ReUseMode;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.okhttp.extension.request.OKHttpRequestHandler;
import com.heytap.trace.TraceLevel;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.eqf, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010`\u001a\u00020\u0002¢\u0006\u0004\ba\u0010bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b\u0014\u0010.\"\u0004\b2\u00100R\"\u00105\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b\u000e\u0010'\"\u0004\b4\u0010)R\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010&\u001a\u0004\b+\u0010'\"\u0004\b6\u0010)R\"\u0010:\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010&\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010,\u001a\u0004\bB\u0010.\"\u0004\bC\u00100R\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010W\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010S\u001a\u0004\b1\u0010T\"\u0004\bU\u0010VR\"\u0010Z\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010S\u001a\u0004\b\u001a\u0010T\"\u0004\bY\u0010VR\"\u0010]\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010S\u001a\u0004\b \u0010T\"\u0004\b\\\u0010VR\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/oplus/aiunit/vision/eqf;", "", "", "ip", "", "n", "o", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/vf8;", "a", "Lcom/oplus/aiunit/vision/vf8;", b2n.g, "()Lcom/oplus/aiunit/vision/vf8;", "retry_389", "Lcom/oplus/aiunit/vision/wf8;", "b", "Lcom/oplus/aiunit/vision/wf8;", "i", "()Lcom/oplus/aiunit/vision/wf8;", "retry_399", "Lcom/oplus/aiunit/vision/xf8;", "c", "Lcom/oplus/aiunit/vision/xf8;", "j", "()Lcom/oplus/aiunit/vision/xf8;", "retry_common", "Lcom/oplus/aiunit/vision/z4f;", "d", "Lcom/oplus/aiunit/vision/z4f;", "getRetry_quic", "()Lcom/oplus/aiunit/vision/z4f;", "retry_quic", MapSchema.FIELD_NAME_ENTRY, "I", "()I", LogFieldKey.MESSAGE_KEY, "(I)V", "lastCode", "f", "Z", "isTraceKeep", "()Z", "setTraceKeep", "(Z)V", b2n.f, "setEnableCustomizeHeader", "enableCustomizeHeader", "setConnectTimeoutMillKeep", "connectTimeoutMillKeep", "setReadTimeoutMillKeep", "readTimeoutMillKeep", LogFieldKey.LEVEL_KEY, "setWriteTimeoutMillKeep", "writeTimeoutMillKeep", "Lcom/heytap/trace/TraceLevel;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/trace/TraceLevel;", "()Lcom/heytap/trace/TraceLevel;", "setTraceLevel", "(Lcom/heytap/trace/TraceLevel;)V", "traceLevel", "isZeroRtt", "setZeroRtt", "Lcom/heytap/common/bean/ReUseMode;", "Lcom/heytap/common/bean/ReUseMode;", "getReUseMode", "()Lcom/heytap/common/bean/ReUseMode;", "setReUseMode", "(Lcom/heytap/common/bean/ReUseMode;)V", "reUseMode", "Lcom/heytap/common/bean/ConnectMode;", "Lcom/heytap/common/bean/ConnectMode;", "getConnectMode", "()Lcom/heytap/common/bean/ConnectMode;", "setConnectMode", "(Lcom/heytap/common/bean/ConnectMode;)V", "connectMode", "Lcom/heytap/common/bean/BoolConfig;", "Lcom/heytap/common/bean/BoolConfig;", "()Lcom/heytap/common/bean/BoolConfig;", "setRetryOnConnectionFailureKeep", "(Lcom/heytap/common/bean/BoolConfig;)V", "retryOnConnectionFailureKeep", LogFieldKey.PROCESS_NAME_KEY, "setFollowRedirectsKeep", "followRedirectsKeep", "q", "setFollowSslRedirectsKeep", "followSslRedirectsKeep", "r", "Ljava/lang/String;", OKHttpRequestHandler.RSP_TARGET_IP, "<init>", "(Ljava/lang/String;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final /* data */ class RequestAttachInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final vf8 retry_389;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final wf8 retry_399;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xf8 retry_common;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final z4f retry_quic;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int lastCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isTraceKeep;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean enableCustomizeHeader;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int connectTimeoutMillKeep;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int readTimeoutMillKeep;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int writeTimeoutMillKeep;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public TraceLevel traceLevel;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isZeroRtt;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public ReUseMode reUseMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ConnectMode connectMode;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public BoolConfig retryOnConnectionFailureKeep;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public BoolConfig followRedirectsKeep;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public BoolConfig followSslRedirectsKeep;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    public String targetIp;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestAttachInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getConnectTimeoutMillKeep() {
        return this.connectTimeoutMillKeep;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnableCustomizeHeader() {
        return this.enableCustomizeHeader;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BoolConfig getFollowRedirectsKeep() {
        return this.followRedirectsKeep;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BoolConfig getFollowSslRedirectsKeep() {
        return this.followSslRedirectsKeep;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLastCode() {
        return this.lastCode;
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof RequestAttachInfo) && Intrinsics.areEqual(this.targetIp, ((RequestAttachInfo) other).targetIp);
        }
        return true;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getReadTimeoutMillKeep() {
        return this.readTimeoutMillKeep;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BoolConfig getRetryOnConnectionFailureKeep() {
        return this.retryOnConnectionFailureKeep;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final vf8 getRetry_389() {
        return this.retry_389;
    }

    public int hashCode() {
        String str = this.targetIp;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final wf8 getRetry_399() {
        return this.retry_399;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final xf8 getRetry_common() {
        return this.retry_common;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final TraceLevel getTraceLevel() {
        return this.traceLevel;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getWriteTimeoutMillKeep() {
        return this.writeTimeoutMillKeep;
    }

    public final void m(int i) {
        this.lastCode = i;
    }

    public final void n(@NotNull String ip) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.targetIp = ip;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getTargetIp() {
        return this.targetIp;
    }

    @NotNull
    public String toString() {
        return "RequestAttachInfo(targetIp=" + this.targetIp + ")";
    }

    public RequestAttachInfo(@NotNull String targetIp) {
        Intrinsics.checkNotNullParameter(targetIp, "targetIp");
        this.targetIp = targetIp;
        this.retry_389 = new vf8(0);
        this.retry_399 = new wf8(0);
        this.retry_common = new xf8(0, false, 2, null);
        this.retry_quic = new z4f(false, 1, null);
        this.isTraceKeep = true;
        this.enableCustomizeHeader = true;
        this.traceLevel = TraceLevel.DEFAULT;
        this.isZeroRtt = true;
        this.reUseMode = ReUseMode.ALL;
        this.connectMode = ConnectMode.TCP;
        BoolConfig boolConfig = BoolConfig.NONE;
        this.retryOnConnectionFailureKeep = boolConfig;
        this.followRedirectsKeep = boolConfig;
        this.followSslRedirectsKeep = boolConfig;
    }

    public /* synthetic */ RequestAttachInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
