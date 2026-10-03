package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import com.amap.api.col.p0003sl.i0;
import com.amap.api.col.p0003sl.la;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.autonavi.aps.amapapi.utils.k;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.oplus.aiunit.vision.n0n;
import com.oplus.aiunit.vision.o0n;
import com.oplus.aiunit.vision.q3n;
import com.oplus.aiunit.vision.r0n;
import com.oplus.aiunit.vision.u0n;
import com.oplus.aiunit.vision.w0n;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    private static c b;
    i0 a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f1154c;
    private int d = com.autonavi.aps.amapapi.utils.c.i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1155e = false;
    private int f = 0;

    private c(Context context) {
        this.a = null;
        this.f1154c = null;
        try {
            r0n.a().c(context);
        } catch (Throwable unused) {
        }
        this.f1154c = context;
        this.a = i0.b();
    }

    public static c a(Context context) {
        if (b == null) {
            b = new c(context);
        }
        return b;
    }

    public final void a(long j2, boolean z, int i) {
        try {
            this.f1155e = z;
            this.d = Long.valueOf(j2).intValue();
            this.f = i;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LocNetManager", "setOption");
        }
    }

    public final d a(Context context, byte[] bArr, String str, String str2, boolean z) {
        try {
            HashMap map = new HashMap(16);
            d dVar = new d(context, com.autonavi.aps.amapapi.utils.c.c());
            try {
                map.put("Content-Type", FileSyncModel.streamMime);
                map.put("Accept-Encoding", "gzip");
                map.put("gzipped", "1");
                map.put("Connection", "Keep-Alive");
                map.put("User-Agent", "AMAP_Location_SDK_Android 6.5.1");
                map.put("KEY", n0n.j(context));
                map.put("enginever", com.autonavi.aps.amapapi.utils.c.a);
                String strA = o0n.a();
                String strC = o0n.c(context, strA, "key=" + n0n.j(context));
                map.put("ts", strA);
                map.put("scode", strC);
                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.a).doubleValue() >= 5.3d) {
                    map.put("aps_s_src", "openapi");
                }
                map.put("encr", "1");
                dVar.b(map);
                String str3 = z ? "loc" : "locf";
                dVar.b(true);
                dVar.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "6.5.1", str3, 3));
                dVar.a(z);
                dVar.b(str);
                dVar.c(str2);
                dVar.c(k.a(bArr));
                dVar.setProxy(u0n.a(context));
                HashMap map2 = new HashMap(16);
                map2.put("output", "bin");
                map2.put("policy", AMap3DTileBuildType.AIRPORT_TERMINAL);
                int i = this.f;
                if (i == 0) {
                    map2.remove("custom");
                } else if (i == 1) {
                    map2.put("custom", "language:cn");
                } else if (i != 2) {
                    map2.remove("custom");
                } else {
                    map2.put("custom", "language:en");
                }
                dVar.a(map2);
                dVar.setConnectionTimeout(this.d);
                dVar.setSoTimeout(this.d);
                if (!this.f1155e) {
                    return dVar;
                }
                dVar.setHttpProtocol(la.c.HTTPS);
                return dVar;
            } catch (Throwable unused) {
                return dVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final q3n a(d dVar) throws Throwable {
        if (this.f1155e) {
            dVar.setHttpProtocol(la.c.HTTPS);
        }
        return i0.d(dVar);
    }

    public final String a(Context context, double d, double d2) {
        try {
            HashMap map = new HashMap(16);
            d dVar = new d(context, com.autonavi.aps.amapapi.utils.c.c());
            map.clear();
            map.put("Content-Type", FileSyncModel.FormMime);
            map.put("Connection", "Keep-Alive");
            map.put("User-Agent", "AMAP_Location_SDK_Android 6.5.1");
            HashMap map2 = new HashMap(16);
            map2.put("custom", "26260A1F00020002");
            map2.put("key", n0n.j(context));
            int i = this.f;
            if (i == 0) {
                map2.remove("language");
            } else if (i == 1) {
                map2.put("language", "zh-CN");
            } else if (i != 2) {
                map2.remove("language");
            } else {
                map2.put("language", "en");
            }
            map2.put("curLocationType", k.m(this.f1154c) ? "coarseLoc" : "fineLoc");
            String strA = o0n.a();
            String strC = o0n.c(context, strA, w0n.q(map2));
            map2.put("ts", strA);
            map2.put("scode", strC);
            dVar.b(("output=json&radius=1000&extensions=all&location=" + d2 + "," + d).getBytes("UTF-8"));
            dVar.b(false);
            dVar.a(true);
            dVar.a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "6.5.1", "loc", 3));
            dVar.a(map2);
            dVar.b(map);
            dVar.setProxy(u0n.a(context));
            dVar.setConnectionTimeout(com.autonavi.aps.amapapi.utils.c.i);
            dVar.setSoTimeout(com.autonavi.aps.amapapi.utils.c.i);
            try {
                dVar.c("http://dualstack-arestapi.amap.com/v3/geocode/regeo");
                dVar.b("http://restsdk.amap.com/v3/geocode/regeo");
                if (this.f1155e) {
                    dVar.setHttpProtocol(la.c.HTTPS);
                }
                return new String(i0.d(dVar).a, "utf-8");
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "LocNetManager", "post");
                return null;
            }
        } catch (Throwable unused) {
        }
    }
}
