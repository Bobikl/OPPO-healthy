package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.os.Handler;
import com.amap.api.col.p0003sl.bb;
import com.amap.api.col.p0003sl.f0;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.jrm;
import com.oplus.aiunit.vision.ljm;
import com.oplus.aiunit.vision.ojm;
import com.oplus.aiunit.vision.r0n;
import com.oplus.aiunit.vision.xsm;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class OfflineMapManager {
    ojm a;
    ljm b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f922c;
    private OfflineMapDownloadListener d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OfflineLoadedListener f923e;
    private Handler f;
    private Handler g;

    public interface OfflineLoadedListener {
        void onVerifyComplete();
    }

    public interface OfflineMapDownloadListener {
        void onCheckUpdate(boolean z, String str);

        void onDownload(int i, int i2, String str);

        void onRemove(boolean z, String str, String str2);
    }

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener) throws Exception {
        f0 f0VarA = iu.a(context, xsm.t());
        if (f0VarA.a != iu.c.SuccessCode) {
            throw new Exception(f0VarA.b);
        }
        this.d = offlineMapDownloadListener;
        this.f922c = context.getApplicationContext();
        this.f = new Handler(this.f922c.getMainLooper());
        this.g = new Handler(this.f922c.getMainLooper());
        a(context);
        r0n.a().c(this.f922c);
    }

    public final void destroy() {
        try {
            ljm ljmVar = this.b;
            if (ljmVar != null) {
                ljmVar.A();
            }
            b();
            Handler handler = this.f;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f = null;
            Handler handler2 = this.g;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            this.g = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByCityCode(String str) throws AMapException {
        try {
            this.b.C(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByCityName(String str) throws AMapException {
        try {
            this.b.y(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void downloadByProvinceName(String str) throws AMapException {
        try {
            a();
            OfflineMapProvince itemByProvinceName = getItemByProvinceName(str);
            if (itemByProvinceName == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            Iterator<OfflineMapCity> it = itemByProvinceName.getCityList().iterator();
            while (it.hasNext()) {
                final String city = it.next().getCity();
                this.g.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            OfflineMapManager.this.b.y(city);
                        } catch (AMapException e2) {
                            c2n.r(e2, "OfflineMapManager", "downloadByProvinceName");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            if (th instanceof AMapException) {
                throw th;
            }
            c2n.r(th, "OfflineMapManager", "downloadByProvinceName");
        }
    }

    public final ArrayList<OfflineMapCity> getDownloadOfflineMapCityList() {
        return this.a.s();
    }

    public final ArrayList<OfflineMapProvince> getDownloadOfflineMapProvinceList() {
        return this.a.t();
    }

    public final ArrayList<OfflineMapCity> getDownloadingCityList() {
        return this.a.u();
    }

    public final ArrayList<OfflineMapProvince> getDownloadingProvinceList() {
        return this.a.v();
    }

    public final OfflineMapCity getItemByCityCode(String str) {
        return this.a.a(str);
    }

    public final OfflineMapCity getItemByCityName(String str) {
        return this.a.m(str);
    }

    public final OfflineMapProvince getItemByProvinceName(String str) {
        return this.a.r(str);
    }

    public final ArrayList<OfflineMapCity> getOfflineMapCityList() {
        return this.a.n();
    }

    public final ArrayList<OfflineMapProvince> getOfflineMapProvinceList() {
        return this.a.b();
    }

    public final void pause() {
        this.b.w();
    }

    public final void pauseByName(String str) {
        this.b.v(str);
    }

    public final void remove(String str) {
        try {
            if (this.b.m(str)) {
                this.b.r(str);
                return;
            }
            OfflineMapProvince offlineMapProvinceR = this.a.r(str);
            if (offlineMapProvinceR != null && offlineMapProvinceR.getCityList() != null) {
                Iterator<OfflineMapCity> it = offlineMapProvinceR.getCityList().iterator();
                while (it.hasNext()) {
                    final String city = it.next().getCity();
                    this.g.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            OfflineMapManager.this.b.r(city);
                        }
                    });
                }
                return;
            }
            OfflineMapDownloadListener offlineMapDownloadListener = this.d;
            if (offlineMapDownloadListener != null) {
                offlineMapDownloadListener.onRemove(false, str, "没有该城市");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void restart() {
    }

    public final void setOnOfflineLoadedListener(OfflineLoadedListener offlineLoadedListener) {
        this.f923e = offlineLoadedListener;
    }

    public final void stop() {
        this.b.t();
    }

    public final void updateOfflineCityByCode(String str) throws AMapException {
        OfflineMapCity itemByCityCode = getItemByCityCode(str);
        if (itemByCityCode == null || itemByCityCode.getCity() == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        a(itemByCityCode.getCity());
    }

    public final void updateOfflineCityByName(String str) throws AMapException {
        a(str);
    }

    public final void updateOfflineMapProvinceByName(String str) throws AMapException {
        a(str);
    }

    private void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f922c = applicationContext;
        ljm.b = false;
        ljm ljmVarB = ljm.b(applicationContext);
        this.b = ljmVarB;
        ljmVarB.g(new ljm.d() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1
            @Override // com.oplus.aiunit.vision.ljm.d
            public final void a(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            OfflineMapManager.this.d.onDownload(bbVar.c().d(), bbVar.getcompleteCode(), bbVar.getCity());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.oplus.aiunit.vision.ljm.d
            public final void b(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (!bbVar.c().equals(bbVar.g) && !bbVar.c().equals(bbVar.a)) {
                                OfflineMapManager.this.d.onCheckUpdate(false, bbVar.getCity());
                                return;
                            }
                            OfflineMapManager.this.d.onCheckUpdate(true, bbVar.getCity());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.oplus.aiunit.vision.ljm.d
            public final void c(final bb bbVar) {
                if (OfflineMapManager.this.d == null || bbVar == null) {
                    return;
                }
                OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (bbVar.c().equals(bbVar.a)) {
                                OfflineMapManager.this.d.onRemove(true, bbVar.getCity(), "");
                            } else {
                                OfflineMapManager.this.d.onRemove(false, bbVar.getCity(), "");
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.oplus.aiunit.vision.ljm.d
            public final void a() {
                if (OfflineMapManager.this.f923e != null) {
                    OfflineMapManager.this.f.post(new Runnable() { // from class: com.amap.api.maps.offlinemap.OfflineMapManager.1.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                OfflineMapManager.this.f923e.onVerifyComplete();
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    });
                }
            }
        });
        try {
            this.b.d();
            this.a = this.b.f13734n;
            jrm.i(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b() {
        this.d = null;
    }

    private void a(String str) throws AMapException {
        this.b.h(str);
    }

    public OfflineMapManager(Context context, OfflineMapDownloadListener offlineMapDownloadListener, AMap aMap) {
        this.d = offlineMapDownloadListener;
        this.f922c = context.getApplicationContext();
        this.f = new Handler(this.f922c.getMainLooper());
        this.g = new Handler(this.f922c.getMainLooper());
        try {
            a(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a() throws AMapException {
        if (!xsm.j0(this.f922c)) {
            throw new AMapException(AMapException.ERROR_CONNECTION);
        }
    }
}
