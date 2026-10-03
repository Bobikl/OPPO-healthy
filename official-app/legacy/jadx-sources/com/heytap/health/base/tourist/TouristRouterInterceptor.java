package com.heytap.health.base.tourist;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.h3k;

/* JADX INFO: loaded from: classes15.dex */
@Interceptor(name = "TouristRouterInterceptor", priority = 1)
public class TouristRouterInterceptor implements IInterceptor {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.alibaba.android.arouter.facade.template.IInterceptor
    public void process(Postcard postcard, InterceptorCallback interceptorCallback) {
        if (postcard.getType() != RouteType.ACTIVITY) {
            interceptorCallback.onContinue(postcard);
            a7b.f("TouristRouterInterceptor", "not activity,go");
            return;
        }
        if (!g3k.i(postcard.getPath())) {
            a7b.f("TouristRouterInterceptor", "has not agree internet, go to launch");
            return;
        }
        if (!h3k.a(postcard.getDestination().getName())) {
            a7b.f("TouristRouterInterceptor", "not app routes,go");
            interceptorCallback.onContinue(postcard);
            return;
        }
        if (!g3k.x()) {
            a7b.f("TouristRouterInterceptor", "is not in touristMode,不拦截该路由：" + postcard.getPath());
            interceptorCallback.onContinue(postcard);
            return;
        }
        if (g3k.A(postcard.getDestination().getName())) {
            interceptorCallback.onContinue(postcard);
            a7b.f("TouristRouterInterceptor", "token == null,该路由在拦截白名单里：" + postcard.getPath() + ",不拦截");
            return;
        }
        a7b.f("TouristRouterInterceptor", "原路径:" + postcard.getPath() + " 被拦截啦，改成跳转到oobe");
        StringBuilder sb = new StringBuilder();
        sb.append("tourist mode interrupt this route:");
        sb.append(postcard.getPath());
        interceptorCallback.onInterrupt(new Throwable(sb.toString()));
        g3k.q();
    }
}
