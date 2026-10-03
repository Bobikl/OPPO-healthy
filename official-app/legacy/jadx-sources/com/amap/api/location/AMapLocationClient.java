package com.amap.api.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.amap.api.col.p0003sl.f0;
import com.amap.api.col.p0003sl.i0;
import com.amap.api.col.p0003sl.iu;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.e;
import com.autonavi.aps.amapapi.utils.i;
import com.oplus.aiunit.vision.p0n;
import com.oplus.aiunit.vision.pom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AMapLocationClient {
    Context a;
    pom b;

    public AMapLocationClient(Context context) throws Exception {
        a(context);
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            e.a(applicationContext);
            this.b = new pom(this.a, null, null);
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne1");
        }
    }

    private static void a(Context context) throws Exception {
        f0 f0VarA = iu.a(context, c.c());
        if (f0VarA.a == iu.c.SuccessCode) {
            return;
        }
        Log.e("AMapLocationClient", f0VarA.b);
        throw new Exception(f0VarA.b);
    }

    public static String getDeviceId(Context context) {
        return p0n.X(context);
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.a = str;
        } catch (Throwable th) {
            c.a(th, "AMClt", "sKey");
        }
    }

    public static void setHost(String str) {
        if (TextUtils.isEmpty(str)) {
            i0.a = -1;
            i0.b = "";
        } else {
            i0.a = 1;
            i0.b = str;
        }
    }

    public static void updatePrivacyAgree(Context context, boolean z) {
        iu.i(context, z, c.c());
    }

    public static void updatePrivacyShow(Context context, boolean z, boolean z2) {
        iu.j(context, z, z2, c.c());
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.E(z);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "dBackL");
        }
    }

    public void enableBackgroundLocation(int i, Notification notification) {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.e(i, notification);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "eBackL");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                return pomVar.g0();
            }
            return null;
        } catch (Throwable th) {
            c.a(th, "AMClt", "gLastL");
            return null;
        }
    }

    public void getReGeoLocation(AMapLocation aMapLocation) {
        pom pomVar = this.b;
        if (pomVar != null) {
            pomVar.n(aMapLocation);
        }
    }

    public String getVersion() {
        return "6.5.1";
    }

    public boolean isStarted() {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                return pomVar.F();
            }
            return false;
        } catch (Throwable th) {
            c.a(th, "AMClt", "isS");
            return false;
        }
    }

    public void onDestroy() {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.a0();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "onDy");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (aMapLocationListener == null) {
                throw new IllegalArgumentException("listener参数不能为null");
            }
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.r(aMapLocationListener);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sLocL");
        }
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (aMapLocationClientOption == null) {
                throw new IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.q(aMapLocationClientOption);
            }
            if (aMapLocationClientOption.b) {
                aMapLocationClientOption.b = false;
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(aMapLocationClientOption.f884c)) {
                    jSONObject.put("amap_loc_scenes_type", aMapLocationClientOption.f884c);
                }
                i.a(this.a, "O019", jSONObject);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sLocnO");
        }
    }

    public void setReGeoLocationCallback(IReGeoLocationCallback iReGeoLocationCallback) {
        pom pomVar = this.b;
        if (pomVar != null) {
            pomVar.s(iReGeoLocationCallback);
        }
    }

    public void startAssistantLocation(WebView webView) {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.m(webView);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "sttAssL1");
        }
    }

    public void startLocation() {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.J();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stl");
        }
    }

    public void stopAssistantLocation() {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.k0();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stAssL");
        }
    }

    public void stopLocation() {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.U();
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "stl");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            pom pomVar = this.b;
            if (pomVar != null) {
                pomVar.N(aMapLocationListener);
            }
        } catch (Throwable th) {
            c.a(th, "AMClt", "unRL");
        }
    }

    public AMapLocationClient(Context context, Intent intent) throws Exception {
        a(context);
        try {
            if (context != null) {
                this.a = context.getApplicationContext();
                this.b = new pom(this.a, intent, null);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne2");
        }
    }

    public AMapLocationClient(Looper looper, Context context) throws Exception {
        a(context);
        try {
            if (context != null) {
                this.a = context.getApplicationContext();
                this.b = new pom(this.a, null, looper);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            c.a(th, "AMClt", "ne3");
        }
    }
}
