package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.oplus.aiunit.vision.oum;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.vam;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class APSecuritySdk implements oum {
    public static APSecuritySdk a;
    public static APSecBgCheckerInterface bgChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static IDeviceInfo f576c;
    public static Object d = new Object();
    public Context b;

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f576c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (a == null) {
            synchronized (d) {
                if (a == null) {
                    a = new APSecuritySdk(context);
                }
            }
        }
        return a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f576c = iDeviceInfo;
    }

    @Override // com.oplus.aiunit.vision.oum
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f576c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String strA = a.a(this.b, "");
        if (vam.c(strA)) {
            initToken(0, new HashMap(), null);
        }
        return strA;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202311031119";
    }

    @Override // com.oplus.aiunit.vision.oum
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f576c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.b, "");
            tokenResult.clientKey = h.f(this.b);
            tokenResult.apdid = a.a(this.b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.b);
            if (vam.c(tokenResult.apdid) || vam.c(tokenResult.apdidToken) || vam.c(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i);
        String strB = h.b(this.b);
        String strC = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (vam.f(strB) && !vam.d(strB, strC)) {
            com.alipay.apmobilesecuritysdk.e.a.a(this.b);
            d.a(this.b);
            g.a(this.b);
            i.h();
        }
        if (!vam.d(strB, strC)) {
            h.c(this.b, strC);
        }
        String strB2 = vam.b(map, "utdid", "");
        String strB3 = vam.b(map, "tid", "");
        String strB4 = vam.b(map, "userId", "");
        if (vam.c(strB2)) {
            strB2 = UtdidWrapper.getUtdid(this.b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strB2);
        map2.put("tid", strB3);
        map2.put("userId", strB4);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", s04.VIA_SHARE_TYPE_PUBLISHVIDEO);
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new a(APSecuritySdk.this.b).a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }

    @Override // com.oplus.aiunit.vision.oum
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}
