package com.oplus.aiunit.vision;

import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/xz6;", "", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "", "J", "getDns", "()J", "c", "(J)V", "dns", "b", "getConnect", "connect", "getTls", "d", "tls", "<init>", "(JJJ)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class xz6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long dns;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long connect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long tls;

    public xz6() {
        this(0L, 0L, 0L, 7, null);
    }

    public final void a() {
        this.dns = 0L;
        this.connect = 0L;
        this.tls = 0L;
    }

    public final void b(long j2) {
        this.connect = j2;
    }

    public final void c(long j2) {
        this.dns = j2;
    }

    public final void d(long j2) {
        this.tls = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof xz6)) {
            return false;
        }
        xz6 xz6Var = (xz6) other;
        return this.dns == xz6Var.dns && this.connect == xz6Var.connect && this.tls == xz6Var.tls;
    }

    public int hashCode() {
        long j2 = this.dns;
        long j3 = this.connect;
        int i = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.tls;
        return i + ((int) ((j4 >>> 32) ^ j4));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dns);
        sb.append(Soundex.SILENT_MARKER);
        sb.append(this.connect);
        sb.append(Soundex.SILENT_MARKER);
        sb.append(this.tls);
        return sb.toString();
    }

    public xz6(long j2, long j3, long j4) {
        this.dns = j2;
        this.connect = j3;
        this.tls = j4;
    }

    public /* synthetic */ xz6(long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? 0L : j4);
    }
}
