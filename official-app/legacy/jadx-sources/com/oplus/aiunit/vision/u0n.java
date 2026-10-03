package com.oplus.aiunit.vision;

import android.content.Context;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class u0n {
    public static Proxy a(Context context) {
        try {
            return b(context, new URI("http://restsdk.amap.com"));
        } catch (Throwable th) {
            c2n.r(th, "pu", "gp");
            return null;
        }
    }

    public static Proxy b(Context context, URI uri) {
        Proxy proxy;
        if (c(context)) {
            try {
                List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                if (listSelect == null || listSelect.isEmpty() || (proxy = listSelect.get(0)) == null || proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                return proxy;
            } catch (Throwable th) {
                c2n.r(th, "pu", "gpsc");
            }
        }
        return null;
    }

    public static boolean c(Context context) {
        return p0n.K(context) == 0;
    }
}
