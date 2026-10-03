package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements ab {
    public static l b;
    public static final ThreadFactory i = new n();
    public Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f553c;
    public b d = b.a("android");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f554e;
    public long f;
    public long g;
    public int h;

    public l(Context context) {
        this.a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f553c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final synchronized l b(Context context) {
        l lVar = b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(context);
        b = lVar2;
        return lVar2;
    }

    public final b a() {
        return this.d;
    }

    public final void c(long j2) {
        this.g += j2;
    }

    public static final l a(Context context) {
        l lVar = b;
        return lVar != null ? lVar : b(context);
    }

    public final void b(long j2) {
        this.f += j2;
        this.h++;
    }

    @Override // com.alipay.android.phone.mrpc.core.ab
    public final Future<u> a(t tVar) {
        if (s.a(this.a)) {
            String str = "HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f553c.getActiveCount());
            objArr[1] = Long.valueOf(this.f553c.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f553c.getTaskCount());
            long j2 = this.g;
            objArr[3] = Long.valueOf(j2 == 0 ? 0L : ((this.f554e * 1000) / j2) >> 10);
            int i2 = this.h;
            objArr[4] = Long.valueOf(i2 != 0 ? this.f / ((long) i2) : 0L);
            objArr[5] = Long.valueOf(this.f554e);
            objArr[6] = Long.valueOf(this.f);
            objArr[7] = Long.valueOf(this.g);
            objArr[8] = Integer.valueOf(this.h);
            String.format(str, objArr);
        }
        q qVar = new q(this, (o) tVar);
        m mVar = new m(this, qVar, qVar);
        this.f553c.execute(mVar);
        return mVar;
    }

    public final void a(long j2) {
        this.f554e += j2;
    }
}
