package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b1n {
    public static com.autonavi.aps.amapapi.storage.b g;
    public static t2n h;
    public static long i;
    public Context a;
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.autonavi.aps.amapapi.storage.b f9553c = null;
    public com.autonavi.aps.amapapi.storage.b d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9554e = 0;
    public boolean f = false;

    public b1n(Context context) {
        this.a = context.getApplicationContext();
    }

    public final AMapLocation a(AMapLocation aMapLocation, String str, long j2) {
        boolean zA;
        if (aMapLocation == null || aMapLocation.getErrorCode() == 0 || aMapLocation.getLocationType() == 1 || aMapLocation.getErrorCode() == 7) {
            return aMapLocation;
        }
        try {
            g();
            com.autonavi.aps.amapapi.storage.b bVar = g;
            if (bVar != null && bVar.a() != null) {
                if (TextUtils.isEmpty(str)) {
                    long jB = com.autonavi.aps.amapapi.utils.k.b() - g.d();
                    zA = jB >= 0 && jB <= j2;
                    aMapLocation.setTrustedLevel(3);
                } else {
                    zA = com.autonavi.aps.amapapi.utils.k.a(g.b(), str);
                    aMapLocation.setTrustedLevel(2);
                }
                if (!zA) {
                    return aMapLocation;
                }
                AMapLocation aMapLocationA = g.a();
                try {
                    com.autonavi.aps.amapapi.utils.a.a(aMapLocationA);
                    aMapLocationA.setLocationType(9);
                    aMapLocationA.setFixLastLocation(true);
                    aMapLocationA.setLocationDetail(aMapLocation.getLocationDetail());
                    return aMapLocationA;
                } catch (Throwable th) {
                    aMapLocation = aMapLocationA;
                    th = th;
                }
                com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "fixLastLocation");
                return aMapLocation;
            }
            return aMapLocation;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void b() {
        if (this.f) {
            return;
        }
        try {
            if (this.b == null) {
                this.b = com.autonavi.aps.amapapi.security.a.a("MD5", p0n.N());
            }
            if (h == null) {
                h = new t2n(this.a, t2n.c(com.autonavi.aps.amapapi.storage.c.class));
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "<init>:DBOperation");
        }
        this.f = true;
    }

    public final boolean c(AMapLocation aMapLocation, String str) {
        if (this.a != null && aMapLocation != null && com.autonavi.aps.amapapi.utils.k.a(aMapLocation) && aMapLocation.getLocationType() != 2 && !aMapLocation.isMock() && !aMapLocation.isFixLastLocation()) {
            com.autonavi.aps.amapapi.storage.b bVar = new com.autonavi.aps.amapapi.storage.b();
            bVar.a(aMapLocation);
            if (aMapLocation.getLocationType() == 1) {
                bVar.a((String) null);
            } else {
                bVar.a(str);
            }
            try {
                g = bVar;
                i = com.autonavi.aps.amapapi.utils.k.b();
                this.f9553c = bVar;
                com.autonavi.aps.amapapi.storage.b bVar2 = this.d;
                if ((bVar2 == null || com.autonavi.aps.amapapi.utils.k.a(bVar2.a(), bVar.a()) > 500.0f) && com.autonavi.aps.amapapi.utils.k.b() - this.f9554e > 30000) {
                    return true;
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "setLastFix");
            }
        }
        return false;
    }

    public final AMapLocation d() {
        g();
        com.autonavi.aps.amapapi.storage.b bVar = g;
        if (bVar != null && com.autonavi.aps.amapapi.utils.k.a(bVar.a())) {
            return g.a();
        }
        return null;
    }

    public final void e() {
        try {
            f();
            this.f9554e = 0L;
            this.f = false;
            this.f9553c = null;
            this.d = null;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "destroy");
        }
    }

    public final void f() {
        com.autonavi.aps.amapapi.storage.b bVar;
        String strF;
        try {
            b();
            com.autonavi.aps.amapapi.storage.b bVar2 = this.f9553c;
            if (bVar2 != null && com.autonavi.aps.amapapi.utils.k.a(bVar2.a()) && h != null && (bVar = this.f9553c) != this.d && bVar.d() == 0) {
                String str = this.f9553c.a().toStr();
                String strB = this.f9553c.b();
                this.d = this.f9553c;
                String str2 = null;
                if (TextUtils.isEmpty(str)) {
                    strF = null;
                } else {
                    String strF2 = q0n.f(com.autonavi.aps.amapapi.security.a.a(str.getBytes("UTF-8"), this.b));
                    strF = TextUtils.isEmpty(strB) ? null : q0n.f(com.autonavi.aps.amapapi.security.a.a(strB.getBytes("UTF-8"), this.b));
                    str2 = strF2;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.autonavi.aps.amapapi.storage.b bVar3 = new com.autonavi.aps.amapapi.storage.b();
                bVar3.b(str2);
                bVar3.a(com.autonavi.aps.amapapi.utils.k.b());
                bVar3.a(strF);
                h.h(bVar3, "_id=1");
                this.f9554e = com.autonavi.aps.amapapi.utils.k.b();
                com.autonavi.aps.amapapi.storage.b bVar4 = g;
                if (bVar4 != null) {
                    bVar4.a(com.autonavi.aps.amapapi.utils.k.b());
                }
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "saveLastFix");
        }
    }

    public final void g() {
        if (g == null || com.autonavi.aps.amapapi.utils.k.b() - i > nlk.MIN_DELAY_MS) {
            com.autonavi.aps.amapapi.storage.b bVarH = h();
            i = com.autonavi.aps.amapapi.utils.k.b();
            if (bVarH == null || !com.autonavi.aps.amapapi.utils.k.a(bVarH.a())) {
                return;
            }
            g = bVarH;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.autonavi.aps.amapapi.storage.b h() {
        com.autonavi.aps.amapapi.storage.b bVar;
        byte[] bArrB;
        byte[] bArrB2;
        String str = null;
        if (this.a == null) {
            return null;
        }
        b();
        try {
            t2n t2nVar = h;
            if (t2nVar == null) {
                return null;
            }
            List listP = t2nVar.p("_id=1", com.autonavi.aps.amapapi.storage.b.class);
            if (listP == null || listP.size() <= 0) {
                bVar = null;
            } else {
                bVar = (com.autonavi.aps.amapapi.storage.b) listP.get(0);
                try {
                    byte[] bArrG = q0n.g(bVar.c());
                    String str2 = (bArrG == null || bArrG.length <= 0 || (bArrB2 = com.autonavi.aps.amapapi.security.a.b(bArrG, this.b)) == null || bArrB2.length <= 0) ? null : new String(bArrB2, "UTF-8");
                    byte[] bArrG2 = q0n.g(bVar.b());
                    if (bArrG2 != null && bArrG2.length > 0 && (bArrB = com.autonavi.aps.amapapi.security.a.b(bArrG2, this.b)) != null && bArrB.length > 0) {
                        str = new String(bArrB, "UTF-8");
                    }
                    bVar.a(str);
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    str = bVar;
                }
            }
            if (TextUtils.isEmpty(str)) {
                return bVar;
            }
            AMapLocation aMapLocation = new AMapLocation("");
            com.autonavi.aps.amapapi.utils.c.a(aMapLocation, new JSONObject(str));
            if (!com.autonavi.aps.amapapi.utils.k.b(aMapLocation)) {
                return bVar;
            }
            bVar.a(aMapLocation);
            return bVar;
        } catch (Throwable th2) {
            th = th2;
        }
        com.autonavi.aps.amapapi.utils.c.a(th, "LastLocationManager", "readLastFix");
        return str;
    }
}
