package com.oplus.drs.core.ntp;

import android.os.SystemClock;
import android.util.Pair;
import com.oplus.aiunit.vision.u56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.base.util.NetworkUtils;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static final int LOCAL_TIME = 2;
    public static final int NTP_TIME = 1;
    public volatile c a;
    public volatile long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f19785c;
    public volatile String d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b = SystemClock.elapsedRealtime();
            b.this.f19785c = true;
            try {
                b bVar = b.this;
                Long lH = bVar.h(bVar.d);
                if (lH == null || lH.longValue() <= 0) {
                    lH = b.this.h("pool.ntp.org");
                }
                b.this.f19785c = false;
                if (lH != null) {
                    b.this.a = new c(lH.longValue(), SystemClock.elapsedRealtime());
                }
            } catch (Exception e2) {
                z6b.u("NtpHelper", "initNetTimeAsync error=[" + e2.getMessage() + "]");
            }
        }
    }

    /* JADX INFO: renamed from: com.oplus.drs.core.ntp.b$b, reason: collision with other inner class name */
    public static class C0960b {
        public static final b a = new b();
    }

    public static class c {
        public final long a;
        public final long b;

        public c(long j2, long j3) {
            this.a = j2;
            this.b = j3;
        }
    }

    public static b f() {
        return C0960b.a;
    }

    public final long g(c cVar) {
        return cVar.a + (SystemClock.elapsedRealtime() - cVar.b);
    }

    public final Long h(String str) {
        com.oplus.drs.core.ntp.a aVar = new com.oplus.drs.core.ntp.a();
        try {
            aVar.d(5000);
            TimeStamp timeStampE = aVar.e(InetAddress.getByName(str)).b().e();
            Long lValueOf = timeStampE != null ? Long.valueOf(timeStampE.getTime()) : null;
            z6b.k("NtpHelper", "getNtpNetTime success! time=[" + lValueOf + "]");
            return lValueOf;
        } catch (Exception e2) {
            z6b.v("NtpHelper", "getNtpNetTime error=", e2);
            return null;
        } finally {
            aVar.a();
        }
    }

    public synchronized Pair<Long, Integer> i() {
        Pair<Long, Integer> pair;
        c cVar = this.a;
        pair = cVar != null ? new Pair<>(Long.valueOf(g(cVar)), 1) : new Pair<>(Long.valueOf(System.currentTimeMillis()), 2);
        j(this.d);
        return pair;
    }

    public void j(String str) {
        if (str != null && !str.trim().isEmpty()) {
            this.d = str;
        }
        if (!NetworkUtils.k()) {
            z6b.k("NtpHelper", "error=[No network connected!]");
            return;
        }
        if (SystemClock.elapsedRealtime() - this.b >= 120000 && !this.f19785c) {
            u56.l().submit(new a());
            return;
        }
        z6b.k("NtpHelper", "not allow request, 2 minutes interval or already has a ntpTask running[" + this.f19785c + "]");
    }

    public b() {
        this.a = null;
        this.b = 0L;
        this.f19785c = false;
        this.d = "pool.ntp.org";
    }
}
