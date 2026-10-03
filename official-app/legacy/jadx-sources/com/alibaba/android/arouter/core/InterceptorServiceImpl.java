package com.alibaba.android.arouter.core;

import android.content.Context;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.oplus.aiunit.vision.qfb;
import com.oplus.aiunit.vision.t8b;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y7l;
import com.oplus.aiunit.vision.zw2;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
@Route(path = "/arouter/service/interceptor")
public class InterceptorServiceImpl implements InterceptorService {
    public static boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f541j = new Object();

    public class a implements Runnable {
        public final /* synthetic */ Postcard i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ InterceptorCallback f542j;

        public a(Postcard postcard, InterceptorCallback interceptorCallback) {
            this.i = postcard;
            this.f542j = interceptorCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            zw2 zw2Var = new zw2(y7l.f.size());
            try {
                InterceptorServiceImpl.c(0, zw2Var, this.i);
                zw2Var.await(this.i.getTimeout(), TimeUnit.SECONDS);
                if (zw2Var.getCount() > 0) {
                    this.f542j.onInterrupt(new HandlerException("The interceptor processing timed out."));
                } else if (this.i.getTag() != null) {
                    this.f542j.onInterrupt((Throwable) this.i.getTag());
                } else {
                    this.f542j.onContinue(this.i);
                }
            } catch (Exception e2) {
                this.f542j.onInterrupt(e2);
            }
        }
    }

    public static class b implements InterceptorCallback {
        public final /* synthetic */ zw2 a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Postcard f543c;

        public b(zw2 zw2Var, int i, Postcard postcard) {
            this.a = zw2Var;
            this.b = i;
            this.f543c = postcard;
        }

        @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
        public void onContinue(Postcard postcard) {
            this.a.countDown();
            InterceptorServiceImpl.c(this.b + 1, this.a, postcard);
        }

        @Override // com.alibaba.android.arouter.facade.callback.InterceptorCallback
        public void onInterrupt(Throwable th) {
            Postcard postcard = this.f543c;
            if (th == null) {
                th = new HandlerException("No message.");
            }
            postcard.setTag(th);
            this.a.a();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context i;

        public c(Context context) {
            this.i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (qfb.b(y7l.f18918e)) {
                Iterator<Map.Entry<Integer, Class<? extends IInterceptor>>> it = y7l.f18918e.entrySet().iterator();
                while (it.hasNext()) {
                    Class<? extends IInterceptor> value = it.next().getValue();
                    try {
                        IInterceptor iInterceptorNewInstance = value.getConstructor(new Class[0]).newInstance(new Object[0]);
                        iInterceptorNewInstance.init(this.i);
                        y7l.f.add(iInterceptorNewInstance);
                    } catch (Exception e2) {
                        throw new HandlerException("ARouter::ARouter init interceptor error! name = [" + value.getName() + "], reason = [" + e2.getMessage() + "]");
                    }
                }
                boolean unused = InterceptorServiceImpl.i = true;
                x0.logger.info(ILogger.defaultTag, "ARouter interceptors init over.");
                synchronized (InterceptorServiceImpl.f541j) {
                    InterceptorServiceImpl.f541j.notifyAll();
                }
            }
        }
    }

    public static void c(int i2, zw2 zw2Var, Postcard postcard) {
        if (i2 < y7l.f.size()) {
            y7l.f.get(i2).process(postcard, new b(zw2Var, i2, postcard));
        }
    }

    public static void q6() {
        synchronized (f541j) {
            while (!i) {
                try {
                    f541j.wait(10000L);
                } catch (InterruptedException e2) {
                    throw new HandlerException("ARouter::Interceptor init cost too much time error! reason = [" + e2.getMessage() + "]");
                }
            }
        }
    }

    @Override // com.alibaba.android.arouter.facade.service.InterceptorService
    public void doInterceptions(Postcard postcard, InterceptorCallback interceptorCallback) {
        if (!qfb.b(y7l.f18918e)) {
            interceptorCallback.onContinue(postcard);
            return;
        }
        q6();
        if (i) {
            t8b.b.execute(new a(postcard, interceptorCallback));
        } else {
            interceptorCallback.onInterrupt(new HandlerException("Interceptors initialization takes too much time."));
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        t8b.b.execute(new c(context));
    }
}
