package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.httpdns.HttpDnsCore;
import com.heytap.httpdns.webkit.extension.api.DnsImpl;
import com.heytap.httpdns.webkit.extension.api.HeaderInterceptorImpl;
import com.heytap.httpdns.webkit.extension.api.RedirectFollowUpHandlerImpl;
import com.heytap.httpdns.webkit.extension.api.ResponseHandlerImpl;
import com.heytap.nearx.taphttp.core.HeyCenter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class rj9 {
    public final HeyCenter a;
    public final vx5 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ji8 f16220c;
    public final ckf d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fuf f16221e;

    public static class a implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ xt3 f16222j;
        public final /* synthetic */ qt2 k;

        public a(Context context, xt3 xt3Var, qt2 qt2Var) {
            this.i = context;
            this.f16222j = xt3Var;
            this.k = qt2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            HeyCenter heyCenterA = z79.INSTANCE.a(this.i, this.f16222j);
            a aVar = null;
            if (heyCenterA != null) {
                this.k.a(true, new rj9(heyCenterA, aVar), "");
            } else {
                this.k.a(false, null, "init failed");
            }
        }
    }

    public /* synthetic */ rj9(HeyCenter heyCenter, a aVar) {
        this(heyCenter);
    }

    public static void b(Context context, xt3 xt3Var, qt2 qt2Var) {
        HeyCenter.INSTANCE.b().execute(new a(context, xt3Var, qt2Var));
    }

    public void a(String str, String str2) {
        HttpDnsCore httpDnsCore;
        if (!(this.a.g(lj9.class) instanceof HttpDnsCore) || (httpDnsCore = (HttpDnsCore) this.a.g(lj9.class)) == null) {
            return;
        }
        httpDnsCore.m().h(str, str2);
    }

    public List<DnsInfo> c(String str) {
        return this.b.lookup(str);
    }

    public List<DnsInfo> d(String str, int i) {
        return this.b.a(str, i);
    }

    public void e(String str, String str2, int i, Map<String, String> map) {
        this.f16221e.a(str, str2, i, map);
    }

    public rj9(HeyCenter heyCenter) {
        this.a = heyCenter;
        this.b = new DnsImpl(heyCenter);
        this.f16220c = new HeaderInterceptorImpl(heyCenter);
        this.d = new RedirectFollowUpHandlerImpl(heyCenter);
        this.f16221e = new ResponseHandlerImpl(heyCenter);
    }
}
