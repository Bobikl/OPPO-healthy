package com.amap.api.fence;

import android.app.PendingIntent;
import android.content.Context;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.utils.c;
import com.oplus.aiunit.vision.wam;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class GeoFenceClient {
    public static final int GEOFENCE_IN = 1;
    public static final int GEOFENCE_OUT = 2;
    public static final int GEOFENCE_STAYED = 4;
    Context a;
    wam b;

    public GeoFenceClient(Context context) {
        this.a = null;
        this.b = null;
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.b = a(applicationContext);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "<init>");
        }
    }

    private static wam a(Context context) {
        return new wam(context);
    }

    public void addGeoFence(DPoint dPoint, float f, String str) {
        try {
            this.b.o(dPoint, f, str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence round");
        }
    }

    public PendingIntent createPendingIntent(String str) {
        try {
            return this.b.d(str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "creatPendingIntent");
            return null;
        }
    }

    public List<GeoFence> getAllGeoFence() {
        ArrayList arrayList = new ArrayList();
        try {
            return this.b.C();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "getGeoFenceList");
            return arrayList;
        }
    }

    public boolean isPause() {
        try {
            return this.b.a0();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "isPause");
            return true;
        }
    }

    public void pauseGeoFence() {
        try {
            this.b.T();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "pauseGeoFence");
        }
    }

    public void removeGeoFence() {
        try {
            this.b.g();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "removeGeoFence");
        }
    }

    public void resumeGeoFence() {
        try {
            this.b.X();
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "resumeGeoFence");
        }
    }

    public void setActivateAction(int i) {
        try {
            this.b.h(i);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setActivatesAction");
        }
    }

    public void setGeoFenceAble(String str, boolean z) {
        try {
            this.b.t(str, z);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceAble");
        }
    }

    public void setGeoFenceListener(GeoFenceListener geoFenceListener) {
        try {
            this.b.l(geoFenceListener);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void setLocationClientOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.b.n(aMapLocationClientOption);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void addGeoFence(List<DPoint> list, String str) {
        try {
            this.b.u(list, str);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence polygon");
        }
    }

    public boolean removeGeoFence(GeoFence geoFence) {
        try {
            return this.b.w(geoFence);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "removeGeoFence1");
            return false;
        }
    }

    public void addGeoFence(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            this.b.r(str, str2, dPoint, f, i, str3);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2, String str3, int i, String str4) {
        try {
            this.b.s(str, str2, str3, i, str4);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2) {
        try {
            this.b.q(str, str2);
        } catch (Throwable th) {
            c.a(th, "GeoFenceClient", "addGeoFence district");
        }
    }
}
