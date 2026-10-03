package com.oplus.drs.core.ratelimit;

/* JADX INFO: loaded from: classes6.dex */
public final class QuotaCheckResult {
    public final Status a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19788c;

    public enum Status {
        ALLOWED,
        APP_EXCEEDED,
        GLOBAL_EXCEEDED
    }

    public QuotaCheckResult(Status status, String str, long j2) {
        this.a = status;
        this.b = str;
        this.f19788c = j2;
    }

    public static QuotaCheckResult a(long j2) {
        return new QuotaCheckResult(Status.ALLOWED, null, j2);
    }

    public static QuotaCheckResult b(String str, long j2, long j3) {
        return new QuotaCheckResult(Status.APP_EXCEEDED, "quota_app_exceeded: appId=" + str + ", used=" + j2 + ", limit=" + j3, j3 - j2);
    }

    public static QuotaCheckResult c(long j2, long j3) {
        return new QuotaCheckResult(Status.GLOBAL_EXCEEDED, "quota_global_exceeded: used=" + j2 + ", limit=" + j3, j3 - j2);
    }

    public boolean d() {
        return this.a == Status.ALLOWED;
    }

    public String toString() {
        return "QuotaCheckResult{status=" + this.a + ", reason='" + this.b + "', remainingBytes=" + this.f19788c + '}';
    }
}
