package com.heytap.health.base.routerFlag;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.heytap.health.base.routerFlag.ShareInterceptor;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.m3k;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
@Interceptor(name = "ShareInterceptor", priority = 5)
public class ShareInterceptor implements IInterceptor {
    public static /* synthetic */ Unit h1(InterceptorCallback interceptorCallback, Postcard postcard, Boolean bool) {
        if (bool.booleanValue()) {
            interceptorCallback.onInterrupt(new Throwable("ShareInterceptor is cross country, do nothing"));
            return null;
        }
        interceptorCallback.onContinue(postcard);
        return null;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.alibaba.android.arouter.facade.template.IInterceptor
    public void process(final Postcard postcard, final InterceptorCallback interceptorCallback) {
        a7b.f("ShareInterceptor", "ShareInterceptor destination:" + postcard.getDestination());
        if (!m3k.f()) {
            a7b.f("ShareInterceptor", "ShareInterceptor user has not granted, continue");
            interceptorCallback.onContinue(postcard);
        } else if (ShareInterceptHelper.d(postcard.getDestination())) {
            a7b.f("ShareInterceptor", "is shareFlag route, intercept");
            ShareInterceptHelper.a(new Function1() { // from class: com.oplus.aiunit.vision.v0h
                @Override // p010kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShareInterceptor.h1(interceptorCallback, postcard, (Boolean) obj);
                }
            });
        } else {
            a7b.f("ShareInterceptor", "not shareFlag route, go");
            interceptorCallback.onContinue(postcard);
        }
    }
}
