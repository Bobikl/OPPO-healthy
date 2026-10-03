package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l7f, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u001b\u0012\b\b\u0002\u0010$\u001a\u00020\u001b\u0012\b\b\u0002\u0010'\u001a\u00020\u001b\u0012\b\b\u0002\u0010*\u001a\u00020\u001b\u0012\b\b\u0002\u0010,\u001a\u00020\u001b\u0012\b\b\u0002\u0010/\u001a\u00020\u001b\u0012\f\b\u0002\u00106\u001a\u000600j\u0002`1\u0012\b\b\u0002\u00108\u001a\u00020\u001b¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010'\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b\u0014\u0010\u001e\"\u0004\b&\u0010 R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b\u0010\u0010\u001e\"\u0004\b)\u0010 R\"\u0010,\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b+\u0010 R\"\u0010/\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b\t\u0010\u001e\"\u0004\b.\u0010 R&\u00106\u001a\u000600j\u0002`18\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b%\u00103\"\u0004\b4\u00105R\"\u00108\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b7\u0010 ¨\u0006;"}, d2 = {"Lcom/oplus/aiunit/vision/l7f;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "quicDomain", "b", b2n.g, "setQuicPath", "quicPath", "c", "Z", MapSchema.FIELD_NAME_KEY, "()Z", "t", "(Z)V", "isQuicSuccess", "", "J", "j", "()J", "s", "(J)V", "quicStartTime", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.PROCESS_NAME_KEY, "quicEndTime", "f", "n", "quicDnsTime", b2n.f, LogFieldKey.MESSAGE_KEY, "quicConnectTime", "q", "quicHeaderTime", "i", LogFieldKey.LEVEL_KEY, "quicBodyTime", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "()Ljava/lang/StringBuilder;", "setQuicErrorMessage", "(Ljava/lang/StringBuilder;)V", "quicErrorMessage", "r", "quicRtt", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZJJJJJJLjava/lang/StringBuilder;J)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class QuicStat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String quicDomain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String quicPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isQuicSuccess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public long quicStartTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public long quicEndTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public long quicDnsTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public long quicConnectTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public long quicHeaderTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public long quicBodyTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public StringBuilder quicErrorMessage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public long quicRtt;

    public QuicStat() {
        this(null, null, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 2047, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getQuicBodyTime() {
        return this.quicBodyTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getQuicConnectTime() {
        return this.quicConnectTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getQuicDnsTime() {
        return this.quicDnsTime;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuicDomain() {
        return this.quicDomain;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getQuicEndTime() {
        return this.quicEndTime;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuicStat)) {
            return false;
        }
        QuicStat quicStat = (QuicStat) other;
        return Intrinsics.areEqual(this.quicDomain, quicStat.quicDomain) && Intrinsics.areEqual(this.quicPath, quicStat.quicPath) && this.isQuicSuccess == quicStat.isQuicSuccess && this.quicStartTime == quicStat.quicStartTime && this.quicEndTime == quicStat.quicEndTime && this.quicDnsTime == quicStat.quicDnsTime && this.quicConnectTime == quicStat.quicConnectTime && this.quicHeaderTime == quicStat.quicHeaderTime && this.quicBodyTime == quicStat.quicBodyTime && Intrinsics.areEqual(this.quicErrorMessage, quicStat.quicErrorMessage) && this.quicRtt == quicStat.quicRtt;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final StringBuilder getQuicErrorMessage() {
        return this.quicErrorMessage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getQuicHeaderTime() {
        return this.quicHeaderTime;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getQuicPath() {
        return this.quicPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public int hashCode() {
        String str = this.quicDomain;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.quicPath;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isQuicSuccess;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        long j2 = this.quicStartTime;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.quicEndTime;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.quicDnsTime;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.quicConnectTime;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.quicHeaderTime;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.quicBodyTime;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        StringBuilder sb = this.quicErrorMessage;
        int iHashCode3 = (i7 + (sb != null ? sb.hashCode() : 0)) * 31;
        long j8 = this.quicRtt;
        return iHashCode3 + ((int) (j8 ^ (j8 >>> 32)));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getQuicRtt() {
        return this.quicRtt;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getQuicStartTime() {
        return this.quicStartTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsQuicSuccess() {
        return this.isQuicSuccess;
    }

    public final void l(long j2) {
        this.quicBodyTime = j2;
    }

    public final void m(long j2) {
        this.quicConnectTime = j2;
    }

    public final void n(long j2) {
        this.quicDnsTime = j2;
    }

    public final void o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.quicDomain = str;
    }

    public final void p(long j2) {
        this.quicEndTime = j2;
    }

    public final void q(long j2) {
        this.quicHeaderTime = j2;
    }

    public final void r(long j2) {
        this.quicRtt = j2;
    }

    public final void s(long j2) {
        this.quicStartTime = j2;
    }

    public final void t(boolean z) {
        this.isQuicSuccess = z;
    }

    @NotNull
    public String toString() {
        return "QuicStat(quicDomain=" + this.quicDomain + ", quicPath=" + this.quicPath + ", isQuicSuccess=" + this.isQuicSuccess + ", quicStartTime=" + this.quicStartTime + ", quicEndTime=" + this.quicEndTime + ", quicDnsTime=" + this.quicDnsTime + ", quicConnectTime=" + this.quicConnectTime + ", quicHeaderTime=" + this.quicHeaderTime + ", quicBodyTime=" + this.quicBodyTime + ", quicErrorMessage=" + ((Object) this.quicErrorMessage) + ", quicRtt=" + this.quicRtt + ")";
    }

    public QuicStat(@NotNull String quicDomain, @NotNull String quicPath, boolean z, long j2, long j3, long j4, long j5, long j6, long j7, @NotNull StringBuilder quicErrorMessage, long j8) {
        Intrinsics.checkNotNullParameter(quicDomain, "quicDomain");
        Intrinsics.checkNotNullParameter(quicPath, "quicPath");
        Intrinsics.checkNotNullParameter(quicErrorMessage, "quicErrorMessage");
        this.quicDomain = quicDomain;
        this.quicPath = quicPath;
        this.isQuicSuccess = z;
        this.quicStartTime = j2;
        this.quicEndTime = j3;
        this.quicDnsTime = j4;
        this.quicConnectTime = j5;
        this.quicHeaderTime = j6;
        this.quicBodyTime = j7;
        this.quicErrorMessage = quicErrorMessage;
        this.quicRtt = j8;
    }

    public /* synthetic */ QuicStat(String str, String str2, boolean z, long j2, long j3, long j4, long j5, long j6, long j7, StringBuilder sb, long j8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? true : z, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? 0L : j4, (i & 64) != 0 ? 0L : j5, (i & 128) != 0 ? 0L : j6, (i & 256) != 0 ? 0L : j7, (i & 512) != 0 ? new StringBuilder() : sb, (i & 1024) == 0 ? j8 : 0L);
    }
}
