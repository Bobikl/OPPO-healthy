package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.us2, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010!\u001a\u00020\u001d\u0012\u0006\u0010&\u001a\u00020\"\u0012\u0006\u0010+\u001a\u00020'¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001c\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0002J\u001c\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0002J\u001c\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0002R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/us2;", "", "", "", LogFieldKey.LEVEL_KEY, "n", LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_KEY, "toString", "", "hashCode", "other", "", "equals", "", "map", "", "a", "b", "c", "Z", b2n.g, "()Z", "j", "(Z)V", "isFinish", b2n.f, "i", "isBodyException", "Lcom/oplus/aiunit/vision/vo3;", "Lcom/oplus/aiunit/vision/vo3;", "d", "()Lcom/oplus/aiunit/vision/vo3;", "commonStat", "Lcom/oplus/aiunit/vision/kk9;", "Lcom/oplus/aiunit/vision/kk9;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/kk9;", "httpStat", "Lcom/oplus/aiunit/vision/l7f;", "Lcom/oplus/aiunit/vision/l7f;", "f", "()Lcom/oplus/aiunit/vision/l7f;", "quicStat", "<init>", "(Lcom/oplus/aiunit/vision/vo3;Lcom/oplus/aiunit/vision/kk9;Lcom/oplus/aiunit/vision/l7f;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class CallStat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isFinish;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isBodyException;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final CommonStat commonStat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final HttpStat httpStat;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final QuicStat quicStat;

    public CallStat(@NotNull CommonStat commonStat, @NotNull HttpStat httpStat, @NotNull QuicStat quicStat) {
        Intrinsics.checkNotNullParameter(commonStat, "commonStat");
        Intrinsics.checkNotNullParameter(httpStat, "httpStat");
        Intrinsics.checkNotNullParameter(quicStat, "quicStat");
        this.commonStat = commonStat;
        this.httpStat = httpStat;
        this.quicStat = quicStat;
    }

    public final void a(Map<String, String> map) {
        map.put("target_ip", this.commonStat.getTargetIp());
        map.put("package_name", this.commonStat.getPackageName());
        map.put("net_type", this.commonStat.getNetType());
        map.put("time_stamp", String.valueOf(this.commonStat.getTimeStamp()));
        map.put("client_version", this.commonStat.getClientVersion());
        map.put("isConnected", String.valueOf(this.commonStat.getIsConnected()));
    }

    public final void b(Map<String, String> map) {
        map.put("domain", this.httpStat.getDomain());
        map.put("path_segment", this.httpStat.getPath());
        map.put("is_success", String.valueOf(this.httpStat.getIsSuccess()));
        String string = this.httpStat.getErrorMessage().toString();
        Intrinsics.checkNotNullExpressionValue(string, "httpStat.errorMessage.toString()");
        map.put("error_message", string);
        map.put("protocol", this.commonStat.getProtocol());
    }

    public final void c(Map<String, String> map) {
        map.put("domain", this.quicStat.getQuicDomain());
        map.put("path_segment", this.quicStat.getQuicPath());
        map.put("is_success", String.valueOf(this.quicStat.getIsQuicSuccess()));
        String string = this.quicStat.getQuicErrorMessage().toString();
        Intrinsics.checkNotNullExpressionValue(string, "quicStat.quicErrorMessage.toString()");
        map.put("error_message", string);
        map.put(vs2.RTT_COST, String.valueOf(this.quicStat.getQuicRtt()));
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final CommonStat getCommonStat() {
        return this.commonStat;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final HttpStat getHttpStat() {
        return this.httpStat;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStat)) {
            return false;
        }
        CallStat callStat = (CallStat) other;
        return Intrinsics.areEqual(this.commonStat, callStat.commonStat) && Intrinsics.areEqual(this.httpStat, callStat.httpStat) && Intrinsics.areEqual(this.quicStat, callStat.quicStat);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final QuicStat getQuicStat() {
        return this.quicStat;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsBodyException() {
        return this.isBodyException;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsFinish() {
        return this.isFinish;
    }

    public int hashCode() {
        CommonStat commonStat = this.commonStat;
        int iHashCode = (commonStat != null ? commonStat.hashCode() : 0) * 31;
        HttpStat httpStat = this.httpStat;
        int iHashCode2 = (iHashCode + (httpStat != null ? httpStat.hashCode() : 0)) * 31;
        QuicStat quicStat = this.quicStat;
        return iHashCode2 + (quicStat != null ? quicStat.hashCode() : 0);
    }

    public final void i(boolean z) {
        this.isBodyException = z;
    }

    public final void j(boolean z) {
        this.isFinish = z;
    }

    @NotNull
    public final Map<String, String> k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap);
        b(linkedHashMap);
        linkedHashMap.put("body_time", String.valueOf(this.httpStat.getBodyTime()));
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, String> l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap);
        b(linkedHashMap);
        linkedHashMap.put("conn_count", String.valueOf(this.httpStat.getConnCount()));
        linkedHashMap.put("dns_info", CollectionsKt___CollectionsKt.joinToString$default(this.httpStat.e(), ";", null, null, 0, null, null, 62, null));
        linkedHashMap.put("dns_time", this.httpStat.d().toString());
        linkedHashMap.put("connect_time", this.httpStat.c().toString());
        linkedHashMap.put("tls_time", this.httpStat.n().toString());
        linkedHashMap.put("request_time", this.httpStat.k().toString());
        linkedHashMap.put("response_header_time", this.httpStat.l().toString());
        linkedHashMap.put("cost_time", String.valueOf(this.httpStat.getEndTime() - this.httpStat.getStartTime()));
        linkedHashMap.put("protocols", this.commonStat.g().toString());
        linkedHashMap.put("network_type", this.commonStat.getNetworkTypeStat().toString());
        linkedHashMap.put("network_info", CollectionsKt___CollectionsKt.joinToString$default(this.commonStat.c(), ";", null, null, 0, null, null, 62, null));
        linkedHashMap.put("extra_time", CollectionsKt___CollectionsKt.joinToString$default(this.httpStat.i(), ";", null, null, 0, null, null, 62, null));
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, String> m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap);
        c(linkedHashMap);
        linkedHashMap.put("body_time", String.valueOf(this.quicStat.getQuicBodyTime()));
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, String> n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(linkedHashMap);
        c(linkedHashMap);
        linkedHashMap.put("dns_time", String.valueOf(this.quicStat.getQuicDnsTime()));
        linkedHashMap.put("connect_time", String.valueOf(this.quicStat.getQuicConnectTime()));
        linkedHashMap.put("header_time", String.valueOf(this.quicStat.getQuicHeaderTime()));
        linkedHashMap.put("total_time", String.valueOf(this.quicStat.getQuicEndTime() - this.quicStat.getQuicStartTime()));
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "CallStat(commonStat=" + this.commonStat + ", httpStat=" + this.httpStat + ", quicStat=" + this.quicStat + ")";
    }
}
