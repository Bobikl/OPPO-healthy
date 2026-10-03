package com.oplus.aiunit.vision;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b0n<T, V> extends com.amap.api.col.p0003sl.l {
    public T r;
    public Context t;
    public String u;
    public int s = 1;
    public boolean v = false;

    public b0n(Context context, T t) {
        g(context, t);
    }

    public V c(q3n q3nVar) throws com.amap.api.col.p0003sl.ic {
        return null;
    }

    public abstract V e(String str) throws com.amap.api.col.p0003sl.ic;

    public V f(byte[] bArr) throws com.amap.api.col.p0003sl.ic {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e2) {
            e2.printStackTrace();
            str = null;
        }
        if (str == null || "".equals(str)) {
            return null;
        }
        i0n.c(str);
        return e(str);
    }

    public final void g(Context context, T t) {
        this.t = context;
        this.r = t;
        this.s = 1;
        setSoTimeout(30000);
        setConnectionTimeout(30000);
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        v0n v0nVarT = xsm.t();
        String strE = v0nVarT != null ? v0nVarT.e() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", c9n.d);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", strE, "3dmap"));
        hashtable.put("X-INFO", o0n.i(this.t));
        hashtable.put("key", n0n.j(this.t));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    public final V h(q3n q3nVar) throws com.amap.api.col.p0003sl.ic {
        return c(q3nVar);
    }

    public final V i(byte[] bArr) throws com.amap.api.col.p0003sl.ic {
        return f(bArr);
    }

    public final V m() throws com.amap.api.col.p0003sl.ic {
        if (this.r == null) {
            return null;
        }
        try {
            return n();
        } catch (com.amap.api.col.p0003sl.ic e2) {
            xsm.E(e2);
            throw e2;
        }
    }

    public final V n() throws com.amap.api.col.p0003sl.ic {
        V vH = null;
        int i = 0;
        while (i < this.s) {
            try {
                setProxy(u0n.a(this.t));
                vH = this.v ? h(makeHttpRequestNeedHeader()) : i(makeHttpRequest());
                i = this.s;
            } catch (com.amap.api.col.p0003sl.ic e2) {
                i++;
                if (i >= this.s) {
                    throw new com.amap.api.col.p0003sl.ic(e2.a());
                }
            } catch (com.amap.api.col.p0003sl.ik e3) {
                i++;
                if (i >= this.s) {
                    if (AMapException.ERROR_CONNECTION.equals(e3.getMessage()) || AMapException.ERROR_SOCKET.equals(e3.getMessage()) || AMapException.ERROR_UNKNOWN.equals(e3.a()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e3.getMessage())) {
                        throw new com.amap.api.col.p0003sl.ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                    }
                    throw new com.amap.api.col.p0003sl.ic(e3.a());
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    if (AMapException.ERROR_CONNECTION.equals(e3.getMessage()) || AMapException.ERROR_SOCKET.equals(e3.getMessage()) || AMapException.ERROR_UNKNOW_SERVICE.equals(e3.getMessage())) {
                        throw new com.amap.api.col.p0003sl.ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_NETWORK_EXCEPTION);
                    }
                    throw new com.amap.api.col.p0003sl.ic(e3.a());
                }
            } catch (Throwable unused2) {
                throw new com.amap.api.col.p0003sl.ic(com.amap.api.services.core.AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
            }
        }
        return vH;
    }
}
