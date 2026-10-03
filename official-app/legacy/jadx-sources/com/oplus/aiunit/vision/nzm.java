package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.services.district.DistrictSearchQuery;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class nzm {
    public Context b;
    public WebView d;
    public b h;
    public Object a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AMapLocationClient f14714c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14715e = "AMap.Geolocation.cbk";
    public AMapLocationClientOption f = null;
    public volatile boolean g = false;

    public class a implements ValueCallback<String> {
        public a() {
        }

        @Override // android.webkit.ValueCallback
        public final /* bridge */ /* synthetic */ void onReceiveValue(String str) {
        }
    }

    public class b implements AMapLocationListener {
        public b() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            if (nzm.this.g) {
                nzm.this.g(nzm.e(aMapLocation));
            }
        }
    }

    public nzm(Context context, WebView webView) {
        this.d = null;
        this.h = null;
        this.b = context.getApplicationContext();
        this.d = webView;
        this.h = new b();
    }

    public static String e(AMapLocation aMapLocation) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (aMapLocation == null) {
                jSONObject.put("errorCode", -1);
                jSONObject.put(MyLocationStyle.ERROR_INFO, "unknownError");
            } else if (aMapLocation.getErrorCode() == 0) {
                jSONObject.put("errorCode", 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", aMapLocation.getLongitude());
                jSONObject2.put("y", aMapLocation.getLatitude());
                jSONObject2.put("precision", aMapLocation.getAccuracy());
                jSONObject2.put("type", aMapLocation.getLocationType());
                jSONObject2.put("country", aMapLocation.getCountry());
                jSONObject2.put(DistrictSearchQuery.KEYWORDS_PROVINCE, aMapLocation.getProvince());
                jSONObject2.put(DistrictSearchQuery.KEYWORDS_CITY, aMapLocation.getCity());
                jSONObject2.put("cityCode", aMapLocation.getCityCode());
                jSONObject2.put(DistrictSearchQuery.KEYWORDS_DISTRICT, aMapLocation.getDistrict());
                jSONObject2.put("adCode", aMapLocation.getAdCode());
                jSONObject2.put("street", aMapLocation.getStreet());
                jSONObject2.put("streetNum", aMapLocation.getStreetNum());
                jSONObject2.put("floor", aMapLocation.getFloor());
                jSONObject2.put("address", aMapLocation.getAddress());
                jSONObject.put("result", jSONObject2);
            } else {
                jSONObject.put("errorCode", aMapLocation.getErrorCode());
                jSONObject.put(MyLocationStyle.ERROR_INFO, aMapLocation.getErrorInfo());
                jSONObject.put("locationDetail", aMapLocation.getLocationDetail());
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public final void b() {
        if (this.d == null || this.b == null || this.g) {
            return;
        }
        try {
            this.d.getSettings().setJavaScriptEnabled(true);
            this.d.addJavascriptInterface(this, "AMapAndroidLoc");
            if (!TextUtils.isEmpty(this.d.getUrl())) {
                this.d.reload();
            }
            if (this.f14714c == null) {
                AMapLocationClient aMapLocationClient = new AMapLocationClient(this.b);
                this.f14714c = aMapLocationClient;
                aMapLocationClient.setLocationListener(this.h);
            }
            this.g = true;
        } catch (Throwable unused) {
        }
    }

    public final void d(String str) {
        boolean z;
        boolean z2;
        if (this.f == null) {
            this.f = new AMapLocationClientOption();
        }
        int iOptInt = 5;
        long jOptLong = 30000;
        boolean z3 = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jOptLong = jSONObject.optLong(TypedValues.TransitionType.S_TO, 30000L);
            z = jSONObject.optInt("useGPS", 1) == 1;
            try {
                z2 = jSONObject.optInt(DeviceInfoCompat.DeviceType.WATCH, 0) == 1;
                try {
                    iOptInt = jSONObject.optInt("interval", 5);
                    String strOptString = jSONObject.optString("callback", null);
                    if (TextUtils.isEmpty(strOptString)) {
                        this.f14715e = "AMap.Geolocation.cbk";
                    } else {
                        this.f14715e = strOptString;
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z2 = false;
            }
        } catch (Throwable unused3) {
            z = false;
            z2 = false;
        }
        try {
            this.f.setHttpTimeOut(jOptLong);
            if (z) {
                this.f.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
            } else {
                this.f.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
            }
            AMapLocationClientOption aMapLocationClientOption = this.f;
            if (z2) {
                z3 = false;
            }
            aMapLocationClientOption.setOnceLocation(z3);
            if (z2) {
                this.f.setInterval(iOptInt * 1000);
            }
        } catch (Throwable unused4) {
        }
    }

    public final void f() {
        synchronized (this.a) {
            this.g = false;
            AMapLocationClient aMapLocationClient = this.f14714c;
            if (aMapLocationClient != null) {
                aMapLocationClient.unRegisterLocationListener(this.h);
                this.f14714c.stopLocation();
                this.f14714c.onDestroy();
                this.f14714c = null;
            }
            this.f = null;
        }
    }

    @SuppressLint({"NewApi"})
    public final void g(String str) {
        try {
            WebView webView = this.d;
            if (webView != null) {
                webView.evaluateJavascript("javascript:" + this.f14715e + "('" + str + "')", new a());
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "H5LocationClient", "callbackJs()");
        }
    }

    @JavascriptInterface
    public final void getLocation(String str) {
        synchronized (this.a) {
            if (this.g) {
                d(str);
                AMapLocationClient aMapLocationClient = this.f14714c;
                if (aMapLocationClient != null) {
                    aMapLocationClient.setLocationOption(this.f);
                    this.f14714c.stopLocation();
                    this.f14714c.startLocation();
                }
            }
        }
    }

    @JavascriptInterface
    public final void stopLocation() {
        AMapLocationClient aMapLocationClient;
        if (this.g && (aMapLocationClient = this.f14714c) != null) {
            aMapLocationClient.stopLocation();
        }
    }
}
