package com.oplus.aiunit.vision;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Date;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class ck extends r7 {
    public static volatile long b = Long.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile long f10129c = 0;
    public static volatile boolean isServerTime = false;
    public static volatile long lastSavedServerTime;
    public final String a = "Date";

    public static long b() {
        return lastSavedServerTime;
    }

    public static long c() {
        return b;
    }

    public static synchronized long d() {
        if (isServerTime) {
            return f10129c + SystemClock.elapsedRealtime();
        }
        mb.b("AcIntercept.TimeSync", "CloudTimeSyncInterceptor return localTime");
        return System.currentTimeMillis();
    }

    public static synchronized void e(long j2, long j3) {
        boolean z = j3 <= c();
        boolean z2 = j2 - b() > 120000;
        mb.b("AcIntercept.TimeSync", "CloudTimeSyncInterceptor durationTime:" + j3 + ", isMoreAccurate:" + z + ", currServerTime:" + j2 + ", lastSavedServerTime: " + lastSavedServerTime + ", isExpired:" + z2);
        if (z2 || z) {
            f10129c = j2 - SystemClock.elapsedRealtime();
            g(j2);
            h(j3);
            f(true);
            mb.b("AcIntercept.TimeSync", "CloudTimeSyncInterceptor refresh Time");
        }
    }

    public static void f(boolean z) {
        isServerTime = z;
    }

    public static void g(long j2) {
        lastSavedServerTime = j2;
    }

    public static void h(long j2) {
        if (j2 <= 0) {
            return;
        }
        b = j2;
    }

    public final void a(long j2, Date date) {
        if (date == null) {
            return;
        }
        e(date.getTime(), j2);
    }

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request request = aVar.request();
        long jNanoTime = System.nanoTime();
        ytf ytfVarC = aVar.c(request);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        gj8 headers = ytfVarC.getHeaders();
        if (headers == null) {
            mb.b("AcIntercept.TimeSync", "heads is null, return response!");
            return ytfVarC;
        }
        String strA = headers.a("Date");
        if (TextUtils.isEmpty(strA)) {
            mb.b("AcIntercept.TimeSync", "standardTime is empty, return response!");
            return ytfVarC;
        }
        a(jNanoTime2, j9.a(strA));
        return ytfVarC;
    }
}
