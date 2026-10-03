package com.amap.api.location;

import android.content.Context;
import android.os.Handler;
import com.autonavi.aps.amapapi.utils.c;
import com.oplus.aiunit.vision.p0n;

/* JADX INFO: loaded from: classes12.dex */
public class UmidtokenInfo {
    private static AMapLocationClient d;
    static Handler a = new Handler();
    static String b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f896e = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f895c = true;

    public static class a implements AMapLocationListener {
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            try {
                if (UmidtokenInfo.d != null) {
                    UmidtokenInfo.a.removeCallbacksAndMessages(null);
                    UmidtokenInfo.d.onDestroy();
                }
            } catch (Throwable th) {
                c.a(th, "UmidListener", "onLocationChanged");
            }
        }
    }

    public static String getUmidtoken() {
        return b;
    }

    public static void setLocAble(boolean z) {
        f895c = z;
    }

    public static synchronized void setUmidtoken(Context context, String str) {
        try {
            b = str;
            p0n.r(str);
            if (d == null && f895c) {
                a aVar = new a();
                d = new AMapLocationClient(context);
                AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
                aMapLocationClientOption.setOnceLocation(true);
                aMapLocationClientOption.setNeedAddress(false);
                d.setLocationOption(aMapLocationClientOption);
                d.setLocationListener(aVar);
                d.startLocation();
                a.postDelayed(new Runnable() { // from class: com.amap.api.location.UmidtokenInfo.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (UmidtokenInfo.d != null) {
                                UmidtokenInfo.d.onDestroy();
                            }
                        } catch (Throwable th) {
                            c.a(th, "UmidListener", "postDelayed");
                        }
                    }
                }, 30000L);
            }
        } catch (Throwable th) {
            c.a(th, "UmidListener", "setUmidtoken");
        }
    }
}
