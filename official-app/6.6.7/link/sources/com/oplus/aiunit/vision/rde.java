package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.statistic.model.BizKeyType;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.TraceSource;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class rde {
    public static final String KEY_COUNTRY_CODE = "countryCode";
    public static final String PAY_SDK_ANDROIDVER = "androidVer";
    public static final String PAY_SDK_APP_PACKAGENAME = "appPackageName";
    public static final String PAY_SDK_APP_VERSIONCODE = "appVersionCode";
    public static final String PAY_SDK_BRAND = "paySdkBrand";
    public static final String PAY_SDK_COUNTRY_CODE = "osCountryCode";
    public static final String PAY_SDK_EVENT_TIME = "eventTime";
    public static final String PAY_SDK_GUID = "guid";
    public static final String PAY_SDK_HWTYPE = "hwType";
    public static final String PAY_SDK_ISPREPAY = "isPrePay";
    public static final String PAY_SDK_MODEL = "paySdkModel";
    public static final String PAY_SDK_ORDER = "order";
    public static final String PAY_SDK_OS_VERCODE = "osVerCode";
    public static final String PAY_SDK_OUID = "ouid";
    public static final String PAY_SDK_PACKAGENAME = "packageName";
    public static final String PAY_SDK_PARTNERID = "partnerId";
    public static final String PAY_SDK_PREPAYTOKEN = "prePayToken";
    public static final String PAY_SDK_PRODUCTNAME = "productName";
    public static final String PAY_SDK_REQUEST = "paySdkRequest";
    public static final String PAY_SDK_REQUEST_ID = "paySdkRequestId";
    public static final String PAY_SDK_ROMVER = "romVer";
    public static final String PAY_SDK_SOURCE = "source";
    public static final String PAY_SDK_VERSION_CODE = "sdkVersionCode";
    public static final String PAY_SDK_VERSION_NAME = "sdkVersionName";

    public static Map<String, String> a(PayParameters payParameters) {
        String strA = wce.a(payParameters.expandInfo);
        String value = TraceSource.Merch.getValue();
        if (!TextUtils.isEmpty(strA) && sck.INSTANCE.f(strA)) {
            value = TraceSource.SDK.getValue();
        }
        HashMap map = new HashMap();
        map.put(BizKeyType.KEY_TRACE_ID.getValue(), strA);
        map.put(BizKeyType.KEY_BIZ_NODE.getValue(), BizNode.START_PAY.getValue());
        map.put(BizKeyType.KEY_TRACE_SOURCE.getValue(), value);
        map.put(BizKeyType.KEY_TRACE_CONTEXT.getValue(), wce.b(payParameters.expandInfo));
        return map;
    }

    public static Map<String, String> b(Context context, PayParameters payParameters) {
        PayParameters payParametersC = ua4.c(payParameters);
        HashMap map = new HashMap();
        payParametersC.mToken = "";
        map.put(PAY_SDK_REQUEST, payParametersC.convert());
        map.put(PAY_SDK_REQUEST_ID, payParametersC.mPayId);
        map.put(PAY_SDK_COUNTRY_CODE, nke.e());
        map.put(PAY_SDK_VERSION_NAME, "3.3.1");
        map.put(PAY_SDK_VERSION_CODE, "30301");
        map.put(PAY_SDK_MODEL, Build.MODEL);
        map.put(PAY_SDK_BRAND, Build.BRAND);
        map.put(PAY_SDK_ORDER, payParametersC.mPartnerOrder);
        map.put(PAY_SDK_PARTNERID, payParametersC.mPartnerId);
        map.put("source", payParametersC.mSource);
        map.put("packageName", TextUtils.isEmpty(payParametersC.mPackageName) ? context.getApplicationContext().getPackageName() : payParametersC.mPackageName);
        map.put(PAY_SDK_PRODUCTNAME, payParametersC.mProductName);
        map.put(KEY_COUNTRY_CODE, payParametersC.mCountryCode);
        map.put(PAY_SDK_PREPAYTOKEN, payParametersC.prePayToken);
        map.put(PAY_SDK_ISPREPAY, (!TextUtils.isEmpty(payParametersC.prePayToken) ? 1 : 0) + "");
        map.put(PAY_SDK_OUID, "");
        map.put(PAY_SDK_GUID, "");
        map.put(PAY_SDK_APP_PACKAGENAME, context.getPackageName());
        map.put(PAY_SDK_APP_VERSIONCODE, vde.g(context, context.getPackageName()) + "");
        map.put(PAY_SDK_HWTYPE, oi5.c(context));
        map.put(PAY_SDK_ROMVER, nke.c());
        map.put(PAY_SDK_OS_VERCODE, nke.g() + "");
        map.put(PAY_SDK_ANDROIDVER, nke.i());
        map.put(PAY_SDK_EVENT_TIME, System.currentTimeMillis() + "");
        map.putAll(a(payParametersC));
        return map;
    }

    public static void c(Context context, PayParameters payParameters) {
        HashMap map = new HashMap();
        map.put(KEY_COUNTRY_CODE, payParameters.mCountryCode);
        Map<String, String> mapB = b(context, payParameters);
        fri friVar = fri.INSTANCE;
        friVar.e();
        friVar.d(new jri()).f(context, map, mapB);
    }
}
