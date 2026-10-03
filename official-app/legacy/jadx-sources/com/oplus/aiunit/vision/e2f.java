package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class e2f<T extends IInterface> {
    public final String a;
    public final ExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f10763c;
    public final b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d<T> f10764e;
    public final int f;
    public final int g;
    public final Object h;
    public final e<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f10765j;
    public final c<T> k;

    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            a7b.f(e2f.this.a, "binderDied: ");
            synchronized (e2f.this.h) {
                if (e2f.this.f10763c != null) {
                    e2f.this.f10763c.asBinder().unlinkToDeath(this, 0);
                    e2f.this.f10763c = null;
                }
                if (e2f.this.d != null) {
                    e2f.this.d.a();
                }
            }
        }
    }

    public interface b {
        void a();
    }

    public interface c<T> {
        T getInterface();
    }

    public interface d<T> {
    }

    public interface e<T extends IInterface> {
        void a(T t);
    }

    public e2f(String str, d<T> dVar, c<T> cVar, e<T> eVar, b bVar) {
        this(str, 2, 2000, dVar, cVar, eVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(IInterface iInterface) {
        this.i.a(iInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IInterface j(long j2) throws Exception {
        final T t;
        int i = 0;
        while (true) {
            t = this.f10763c;
            if (t != null || i >= this.f) {
                break;
            }
            this.f10763c = this.k.getInterface();
            i++;
            long jUptimeMillis = SystemClock.uptimeMillis() - j2;
            String str = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("getApiSync: retryTime=");
            sb.append(i);
            sb.append(" delay=");
            sb.append(jUptimeMillis);
            sb.append(" mApi=");
            sb.append(this.f10763c != null);
            a7b.f(str, sb.toString());
        }
        if (t != null && this.i != null) {
            t.asBinder().linkToDeath(this.f10765j, 0);
            this.b.submit(new Runnable() { // from class: com.oplus.aiunit.vision.d2f
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.i(t);
                }
            });
        }
        return this.f10763c;
    }

    @Nullable
    public T h(Context context, boolean z, String str) {
        Throwable th;
        Throwable th2;
        T t = this.f10763c;
        if (t != null) {
            return t;
        }
        boolean zH = m3k.h();
        synchronized (this) {
            T t2 = this.f10763c;
            if (t2 != null) {
                return t2;
            }
            Throwable th3 = null;
            if (!zH) {
                a7b.f(this.a, "getApi: agreeProtocol false");
                return null;
            }
            if (!z && !gxe.i(context, str)) {
                a7b.f(this.a, "getApi: pName=" + str + " not running");
                return null;
            }
            final long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z2 = true;
            try {
                try {
                    this.b.submit(new Callable() { // from class: com.oplus.aiunit.vision.c2f
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.i.j(jUptimeMillis);
                        }
                    }).get((this.f + 1) * this.g, TimeUnit.MILLISECONDS);
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (jUptimeMillis2 > xx0.SCROLL_DELAYED) {
                        th2 = new Throwable("called in main thread time out" + jUptimeMillis2);
                    } else {
                        th2 = null;
                    }
                    String str2 = this.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("getApiSync: delay=");
                    sb.append(jUptimeMillis2);
                    sb.append(" mApi=");
                    if (this.f10763c == null) {
                        z2 = false;
                    }
                    sb.append(z2);
                    sb.append(" e=");
                    sb.append((Object) null);
                    sb.append(" caller=");
                    sb.append(a7b.e(th2));
                    a7b.f(str2, sb.toString());
                } catch (Exception e2) {
                    long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (jUptimeMillis3 > xx0.SCROLL_DELAYED) {
                        th3 = new Throwable("called in main thread time out" + jUptimeMillis3);
                    }
                    String str3 = this.a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getApiSync: delay=");
                    sb2.append(jUptimeMillis3);
                    sb2.append(" mApi=");
                    if (this.f10763c == null) {
                        z2 = false;
                    }
                    sb2.append(z2);
                    sb2.append(" e=");
                    sb2.append(e2);
                    sb2.append(" caller=");
                    sb2.append(a7b.e(th3));
                    a7b.f(str3, sb2.toString());
                }
                return this.f10763c;
            } catch (Throwable th4) {
                long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (jUptimeMillis4 > xx0.SCROLL_DELAYED) {
                    th = new Throwable("called in main thread time out" + jUptimeMillis4);
                } else {
                    th = null;
                }
                String str4 = this.a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getApiSync: delay=");
                sb3.append(jUptimeMillis4);
                sb3.append(" mApi=");
                if (this.f10763c == null) {
                    z2 = false;
                }
                sb3.append(z2);
                sb3.append(" e=");
                sb3.append((Object) null);
                sb3.append(" caller=");
                sb3.append(a7b.e(th));
                a7b.f(str4, sb3.toString());
                throw th4;
            }
        }
    }

    public e2f(String str, int i, int i2, d<T> dVar, c<T> cVar, e<T> eVar, b bVar) {
        this.h = new Object();
        this.f10765j = new a();
        String str2 = "Api-" + str;
        this.a = str2;
        this.b = zq8.e(str2);
        this.k = cVar;
        this.f10764e = dVar;
        this.f = i;
        this.g = i2;
        this.i = eVar;
        this.d = bVar;
    }
}
