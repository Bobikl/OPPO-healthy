package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.kk9, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 \u0012\f\b\u0002\u0010*\u001a\u00060%j\u0002`&\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020+0 \u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020+0 \u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020+0 \u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020+0 \u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020+0 \u0012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020 \u0012\b\b\u0002\u0010<\u001a\u00020+\u0012\b\b\u0002\u0010>\u001a\u00020+\u0012\b\b\u0002\u0010@\u001a\u00020+¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\fR\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0010\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001b\u0010*\u001a\u00060%j\u0002`&8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0 8\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b\u001a\u0010#R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020+0 8\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b\u0013\u0010#R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020+0 8\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010#R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020+0 8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b2\u0010#R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020+0 8\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b4\u0010#R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0006¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b/\u0010#R\"\u0010<\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b7\u00109\"\u0004\b:\u0010;R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00108\u001a\u0004\b,\u00109\"\u0004\b=\u0010;R\"\u0010@\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00108\u001a\u0004\b\t\u00109\"\u0004\b?\u0010;¨\u0006C"}, d2 = {"Lcom/oplus/aiunit/vision/kk9;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "domain", "b", "j", "path", "c", "Z", "o", "()Z", "t", "(Z)V", "isSuccess", "d", "I", "()I", "q", "(I)V", "connCount", "", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/List;", "()Ljava/util/List;", "dnsTypeInfo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", b2n.g, "()Ljava/lang/StringBuilder;", "errorMessage", "", b2n.f, "dnsTimes", "connectTimes", "i", "n", "tlsTimes", MapSchema.FIELD_NAME_KEY, "requestTimes", LogFieldKey.LEVEL_KEY, "responseHeaderTimes", "extraTimes", LogFieldKey.MESSAGE_KEY, "J", "()J", "s", "(J)V", "startTime", "r", "endTime", LogFieldKey.PROCESS_NAME_KEY, "bodyTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/util/List;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJJ)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HttpStat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String domain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isSuccess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int connCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<String> dnsTypeInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final StringBuilder errorMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Long> dnsTimes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Long> connectTimes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Long> tlsTimes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<Long> requestTimes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Long> responseHeaderTimes;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<String> extraTimes;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    public long startTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public long endTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    public long bodyTime;

    public HttpStat(@NotNull String domain, @NotNull String path, boolean z, int i, @NotNull List<String> dnsTypeInfo, @NotNull StringBuilder errorMessage, @NotNull List<Long> dnsTimes, @NotNull List<Long> connectTimes, @NotNull List<Long> tlsTimes, @NotNull List<Long> requestTimes, @NotNull List<Long> responseHeaderTimes, @NotNull List<String> extraTimes, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(dnsTypeInfo, "dnsTypeInfo");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(dnsTimes, "dnsTimes");
        Intrinsics.checkNotNullParameter(connectTimes, "connectTimes");
        Intrinsics.checkNotNullParameter(tlsTimes, "tlsTimes");
        Intrinsics.checkNotNullParameter(requestTimes, "requestTimes");
        Intrinsics.checkNotNullParameter(responseHeaderTimes, "responseHeaderTimes");
        Intrinsics.checkNotNullParameter(extraTimes, "extraTimes");
        this.domain = domain;
        this.path = path;
        this.isSuccess = z;
        this.connCount = i;
        this.dnsTypeInfo = dnsTypeInfo;
        this.errorMessage = errorMessage;
        this.dnsTimes = dnsTimes;
        this.connectTimes = connectTimes;
        this.tlsTimes = tlsTimes;
        this.requestTimes = requestTimes;
        this.responseHeaderTimes = responseHeaderTimes;
        this.extraTimes = extraTimes;
        this.startTime = j2;
        this.endTime = j3;
        this.bodyTime = j4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBodyTime() {
        return this.bodyTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getConnCount() {
        return this.connCount;
    }

    @NotNull
    public final List<Long> c() {
        return this.connectTimes;
    }

    @NotNull
    public final List<Long> d() {
        return this.dnsTimes;
    }

    @NotNull
    public final List<String> e() {
        return this.dnsTypeInfo;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpStat)) {
            return false;
        }
        HttpStat httpStat = (HttpStat) other;
        return Intrinsics.areEqual(this.domain, httpStat.domain) && Intrinsics.areEqual(this.path, httpStat.path) && this.isSuccess == httpStat.isSuccess && this.connCount == httpStat.connCount && Intrinsics.areEqual(this.dnsTypeInfo, httpStat.dnsTypeInfo) && Intrinsics.areEqual(this.errorMessage, httpStat.errorMessage) && Intrinsics.areEqual(this.dnsTimes, httpStat.dnsTimes) && Intrinsics.areEqual(this.connectTimes, httpStat.connectTimes) && Intrinsics.areEqual(this.tlsTimes, httpStat.tlsTimes) && Intrinsics.areEqual(this.requestTimes, httpStat.requestTimes) && Intrinsics.areEqual(this.responseHeaderTimes, httpStat.responseHeaderTimes) && Intrinsics.areEqual(this.extraTimes, httpStat.extraTimes) && this.startTime == httpStat.startTime && this.endTime == httpStat.endTime && this.bodyTime == httpStat.bodyTime;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final StringBuilder getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public int hashCode() {
        String str = this.domain;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.path;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isSuccess;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (((iHashCode2 + r2) * 31) + this.connCount) * 31;
        List<String> list = this.dnsTypeInfo;
        int iHashCode3 = (i + (list != null ? list.hashCode() : 0)) * 31;
        StringBuilder sb = this.errorMessage;
        int iHashCode4 = (iHashCode3 + (sb != null ? sb.hashCode() : 0)) * 31;
        List<Long> list2 = this.dnsTimes;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Long> list3 = this.connectTimes;
        int iHashCode6 = (iHashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Long> list4 = this.tlsTimes;
        int iHashCode7 = (iHashCode6 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<Long> list5 = this.requestTimes;
        int iHashCode8 = (iHashCode7 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<Long> list6 = this.responseHeaderTimes;
        int iHashCode9 = (iHashCode8 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<String> list7 = this.extraTimes;
        int iHashCode10 = (iHashCode9 + (list7 != null ? list7.hashCode() : 0)) * 31;
        long j2 = this.startTime;
        int i2 = (iHashCode10 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.endTime;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.bodyTime;
        return i3 + ((int) (j4 ^ (j4 >>> 32)));
    }

    @NotNull
    public final List<String> i() {
        return this.extraTimes;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final List<Long> k() {
        return this.requestTimes;
    }

    @NotNull
    public final List<Long> l() {
        return this.responseHeaderTimes;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final List<Long> n() {
        return this.tlsTimes;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void p(long j2) {
        this.bodyTime = j2;
    }

    public final void q(int i) {
        this.connCount = i;
    }

    public final void r(long j2) {
        this.endTime = j2;
    }

    public final void s(long j2) {
        this.startTime = j2;
    }

    public final void t(boolean z) {
        this.isSuccess = z;
    }

    @NotNull
    public String toString() {
        return "HttpStat(domain=" + this.domain + ", path=" + this.path + ", isSuccess=" + this.isSuccess + ", connCount=" + this.connCount + ", dnsTypeInfo=" + this.dnsTypeInfo + ", errorMessage=" + ((Object) this.errorMessage) + ", dnsTimes=" + this.dnsTimes + ", connectTimes=" + this.connectTimes + ", tlsTimes=" + this.tlsTimes + ", requestTimes=" + this.requestTimes + ", responseHeaderTimes=" + this.responseHeaderTimes + ", extraTimes=" + this.extraTimes + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", bodyTime=" + this.bodyTime + ")";
    }

    public /* synthetic */ HttpStat(String str, String str2, boolean z, int i, List list, StringBuilder sb, List list2, List list3, List list4, List list5, List list6, List list7, long j2, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new ArrayList() : list, (i2 & 32) != 0 ? new StringBuilder() : sb, (i2 & 64) != 0 ? new ArrayList() : list2, (i2 & 128) != 0 ? new ArrayList() : list3, (i2 & 256) != 0 ? new ArrayList() : list4, (i2 & 512) != 0 ? new ArrayList() : list5, (i2 & 1024) != 0 ? new ArrayList() : list6, (i2 & 2048) != 0 ? new ArrayList() : list7, (i2 & 4096) != 0 ? 0L : j2, (i2 & 8192) != 0 ? 0L : j3, (i2 & 16384) != 0 ? 0L : j4);
    }
}
