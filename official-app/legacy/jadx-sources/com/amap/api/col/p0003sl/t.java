package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.oplus.aiunit.vision.izm;
import com.oplus.aiunit.vision.q3n;
import com.oplus.aiunit.vision.qvg;
import com.oplus.aiunit.vision.qxm;
import com.oplus.aiunit.vision.r0n;
import com.oplus.aiunit.vision.s0n;

/* JADX INFO: loaded from: classes12.dex */
public abstract class t<T, V> extends s0n {
    public T s;
    public Context v;
    public boolean r = true;
    public int t = 1;
    public String u = "";
    public int w = 1;
    public String x = "";

    public t(Context context, T t) {
        g(context, t);
    }

    public abstract V e(String str) throws AMapException;

    public V f(byte[] bArr) throws AMapException {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e2) {
            qxm.g(e2, "ProtocalHandler", "loadData");
            str = null;
        }
        if (str == null || str.equals("")) {
            return null;
        }
        qxm.i(str);
        return e(str);
    }

    public final void g(Context context, T t) {
        this.v = context;
        this.s = t;
        this.t = 1;
        setSoTimeout(qvg.b().e());
        setConnectionTimeout(qvg.b().a());
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getSDKName() {
        return "sea";
    }

    public final byte[] h(int i, m0 m0Var, s0n s0nVar) throws ik {
        setHttpProtocol(i == 1 ? la.c.HTTP : la.c.HTTPS);
        q3n q3nVarD = this.r ? i0.d(s0nVar) : m0.r(s0nVar);
        if (q3nVarD == null) {
            return null;
        }
        byte[] bArr = q3nVarD.a;
        this.x = q3nVarD.d;
        return bArr;
    }

    public final V i(byte[] bArr) throws AMapException {
        return f(bArr);
    }

    public final V m() throws AMapException {
        if (this.s == null) {
            return null;
        }
        try {
            return p();
        } catch (AMapException e2) {
            izm.f(g(), o(), e2);
            throw e2;
        }
    }

    public x.b n() {
        return null;
    }

    public final String o() {
        return this.x;
    }

    public final V p() throws AMapException {
        Object obj;
        x xVarB;
        x.c cVarA;
        Object obj2;
        try {
            x.b bVarN = n();
            boolean zH = x.b().h(bVarN);
            boolean z = false;
            int i = 0;
            boolean z2 = false;
            V vI = null;
            while (i < this.t) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        try {
                            int iD = qvg.b().d();
                            r0n.a().c(this.v);
                            m0 m0VarP = m0.p();
                            if (zH && (cVarA = x.b().a(bVarN)) != null && (obj2 = cVarA.a) != null) {
                                try {
                                    izm.e(this.v, bVarN.a, cVarA.b);
                                    z2 = true;
                                    vI = (V) obj2;
                                } catch (ik e2) {
                                    e = e2;
                                    z2 = true;
                                    vI = (V) obj2;
                                    izm.d(this.v, g(), System.currentTimeMillis() - jCurrentTimeMillis, z);
                                    i++;
                                    if (i >= this.t) {
                                        if (!com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_UNKNOWN.equals(e.a()) && !com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e.getMessage())) {
                                            throw new AMapException(e.a(), 1, e.c());
                                        }
                                        throw new AMapException(AMapException.AMAP_CLIENT_NETWORK_EXCEPTION, 1, e.c());
                                    }
                                    try {
                                        Thread.sleep(this.w * 1000);
                                        if (zH && !z2) {
                                            x.b().e(bVarN, vI);
                                        }
                                    } catch (InterruptedException unused) {
                                        if (!com.amap.api.maps.AMapException.ERROR_CONNECTION.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_SOCKET.equals(e.getMessage()) && !com.amap.api.maps.AMapException.ERROR_UNKNOW_SERVICE.equals(e.getMessage())) {
                                            throw new AMapException(e.a(), 1, e.c());
                                        }
                                        throw new AMapException(AMapException.AMAP_CLIENT_NETWORK_EXCEPTION, 1, e.c());
                                    }
                                } catch (AMapException e3) {
                                    e = e3;
                                    z2 = true;
                                    vI = (V) obj2;
                                    izm.d(this.v, g(), System.currentTimeMillis() - jCurrentTimeMillis, z);
                                    i++;
                                    if (i >= this.t) {
                                        throw e;
                                    }
                                    if (zH && !z2) {
                                        xVarB = x.b();
                                        xVarB.e(bVarN, vI);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = true;
                                    obj = obj2;
                                    if (zH) {
                                        x.b().e(bVarN, obj);
                                    }
                                    throw th;
                                }
                            }
                            if (vI == null) {
                                byte[] bArrH = h(iD, m0VarP, this);
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                vI = i(bArrH);
                                izm.d(this.v, g(), jCurrentTimeMillis2 - jCurrentTimeMillis, true);
                            }
                            i = this.t;
                            if (!zH || z2) {
                                z = false;
                            } else {
                                xVarB = x.b();
                                xVarB.e(bVarN, vI);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = vI;
                        if (zH && !z2) {
                            x.b().e(bVarN, obj);
                        }
                        throw th;
                    }
                } catch (ik e4) {
                    e = e4;
                } catch (AMapException e5) {
                    e = e5;
                }
            }
            return vI;
        } catch (AMapException e6) {
            throw e6;
        } catch (Throwable th4) {
            th4.printStackTrace();
            throw new AMapException(AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
        }
    }

    public final String g() {
        String ipv6url = getIPV6URL();
        if (ipv6url == null) {
            return null;
        }
        try {
            int iIndexOf = ipv6url.indexOf(".com/");
            int iIndexOf2 = ipv6url.indexOf("?");
            if (iIndexOf2 == -1) {
                return ipv6url.substring(iIndexOf + 5);
            }
            return ipv6url.substring(iIndexOf + 5, iIndexOf2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
