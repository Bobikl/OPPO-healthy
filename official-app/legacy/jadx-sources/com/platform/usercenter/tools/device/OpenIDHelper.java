package com.platform.usercenter.tools.device;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.provider.OpenIdBean;
import com.platform.usercenter.basic.provider.OpenIdFactory;
import com.platform.usercenter.tools.device.OpenIDHelper;
import com.platform.usercenter.tools.env.EnvConstantManager;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.UCOSVersionUtil;
import com.platform.usercenter.tools.thread.BackgroundExecutor;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OpenIDHelper {
    public static final String APID = "APID";
    public static final String AUID = "AUID";
    public static final String DUID = "DUID";
    public static final String GUID = "GUID";
    public static final String HEADER_X_CLIENT_APID = "X-Client-APID";
    public static final String HEADER_X_CLIENT_AUID = "X-Client-AUID";
    public static final String HEADER_X_CLIENT_DUID = "X-Client-DUID";
    public static final String HEADER_X_CLIENT_GUID = "X-Client-GUID";
    public static final String HEADER_X_CLIENT_OUID = "X-Client-OUID";
    public static final String OPENID_PACKAGE_NAME = "openid_packageName";
    public static final String OUID = "OUID";
    private static final String TAG = "OpenIDHelper";
    private static ConcurrentHashMap<String, String> sOpenidMap = new ConcurrentHashMap<>(5);

    private static String checkNullValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        UCLogUtil.i(TAG, "id is NULL");
        return "";
    }

    public static String getAPID() {
        ConcurrentHashMap<String, String> concurrentHashMap = sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-APID");
    }

    public static String getAUID() {
        ConcurrentHashMap<String, String> concurrentHashMap = sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-AUID");
    }

    @Deprecated
    public static String getDUID() {
        return "";
    }

    public static String getGUID() {
        ConcurrentHashMap<String, String> concurrentHashMap = sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-GUID");
    }

    public static String getOUID() {
        ConcurrentHashMap<String, String> concurrentHashMap = sOpenidMap;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get("X-Client-OUID");
    }

    public static String getOpenIDJson(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OPENID_PACKAGE_NAME, context.getPackageName());
            OpenIdBean openIdBean = (OpenIdBean) OpenIdFactory.getInstance(context).iterator();
            if (openIdBean != null) {
                jSONObject.put(GUID, openIdBean.getGuid());
                jSONObject.put(OUID, openIdBean.getOuid());
                jSONObject.put(DUID, openIdBean.getDuid());
                jSONObject.put(AUID, openIdBean.getAuid());
                jSONObject.put(APID, openIdBean.getApid());
            }
            String string = jSONObject.toString();
            if (EnvConstantManager.getInstance().DEBUG()) {
                UCLogUtil.i("openId = " + string);
            }
            return string;
        } catch (Exception e2) {
            UCLogUtil.i("bean0 = " + e2.getMessage());
            return jSONObject.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getOpenId(Context context) {
        OpenIdBean openIdBean = (OpenIdBean) OpenIdFactory.getInstance(context).iterator();
        if (openIdBean != null) {
            sOpenidMap.put("X-Client-GUID", checkNullValue(openIdBean.getGuid()));
            sOpenidMap.put("X-Client-OUID", checkNullValue(openIdBean.getOuid()));
            sOpenidMap.put("X-Client-DUID", checkNullValue(openIdBean.getDuid()));
            sOpenidMap.put("X-Client-AUID", checkNullValue(openIdBean.getAuid()));
            sOpenidMap.put("X-Client-APID", checkNullValue(openIdBean.getApid()));
        }
        if (EnvConstantManager.getInstance().DEBUG()) {
            for (String str : sOpenidMap.keySet()) {
                UCLogUtil.d("k = " + str + " , values = " + sOpenidMap.get(str));
            }
        }
    }

    public static ConcurrentHashMap<String, String> getOpenIdHeader(final Context context, boolean z) {
        try {
            ConcurrentHashMap<String, String> concurrentHashMap = sOpenidMap;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                return sOpenidMap;
            }
            if (z) {
                return sOpenidMap;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                UCLogUtil.i("getOpenIdHeader Cannot run on MainThread");
                return sOpenidMap;
            }
            if (UCOSVersionUtil.getOSVersionCode() == 19 || UCOSVersionUtil.getOSVersionCode() == 20 || UCOSVersionUtil.getOSVersionCode() == 21) {
                BackgroundExecutor.runOnWorkThread(new Runnable() { // from class: com.oplus.aiunit.vision.hld
                    @Override // java.lang.Runnable
                    public final void run() {
                        OpenIDHelper.getOpenId(context);
                    }
                });
            } else {
                getOpenId(context);
            }
            return sOpenidMap;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
        }
    }

    public static ConcurrentHashMap<String, String> getOpenIdHeader(Context context) {
        return getOpenIdHeader(context, false);
    }
}
