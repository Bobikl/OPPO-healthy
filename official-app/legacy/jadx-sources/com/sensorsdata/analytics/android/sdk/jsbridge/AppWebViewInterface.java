package com.sensorsdata.analytics.android.sdk.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.internal.beans.ServerUrl;
import com.sensorsdata.analytics.android.sdk.util.ReflectUtil;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AppWebViewInterface {
    private static final String TAG = "SA.AppWebViewInterface";
    private final boolean enableVerify;
    private final Context mContext;
    private WeakReference<View> mWebView;
    private JSONObject properties;

    public AppWebViewInterface(Context context, JSONObject jSONObject, boolean z) {
        this(context, jSONObject, z, null);
    }

    @JavascriptInterface
    public boolean sensorsdata_abtest_module() {
        try {
            SALog.i(TAG, "sensorsdata_abtest_module");
            return ReflectUtil.callStaticMethod(ReflectUtil.getCurrentClass(new String[]{"com.sensorsdata.abtest.SensorsABTest"}), "shareInstance", new Object[0]) != null;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    @JavascriptInterface
    public String sensorsdata_call_app() {
        try {
            SALog.i(TAG, "sensorsdata_call_app");
            if (this.properties == null) {
                this.properties = new JSONObject();
            }
            this.properties.put("type", DeviceInfoUtil.SYSTEM_NAME);
            String loginId = SensorsDataAPI.sharedInstance(this.mContext).getLoginId();
            if (TextUtils.isEmpty(loginId)) {
                this.properties.put("distinct_id", SensorsDataAPI.sharedInstance(this.mContext).getAnonymousId());
                this.properties.put("is_login", false);
            } else {
                this.properties.put("distinct_id", loginId);
                this.properties.put("is_login", true);
            }
            return this.properties.toString();
        } catch (JSONException e2) {
            SALog.i(TAG, e2.getMessage());
            return null;
        }
    }

    @JavascriptInterface
    public String sensorsdata_get_app_visual_config() {
        try {
            SALog.i(TAG, "sensorsdata_get_app_visual_config");
            return (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_H5_GET_APPVISUAL_CONFIG, new Object[0]);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    @JavascriptInterface
    public String sensorsdata_get_server_url() {
        try {
            SALog.i(TAG, "sensorsdata_get_server_url");
            return AbstractSensorsDataAPI.getConfigOptions().isAutoTrackWebView() ? AbstractSensorsDataAPI.getConfigOptions().getServerUrl() : "";
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    @JavascriptInterface
    public void sensorsdata_js_call_app(String str) {
        try {
            SALog.i(TAG, "sensorsdata_js_call_app, content = " + str);
            WeakReference<View> weakReference = this.mWebView;
            if (weakReference != null) {
                H5Helper.handleJsMessage(weakReference, str);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @JavascriptInterface
    public void sensorsdata_track(String str) {
        try {
            SALog.i(TAG, "sensorsdata_track event = " + str);
            H5Helper.trackEventFromH5(str, this.enableVerify);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            SALog.i(TAG, "sensorsdata_track event = exception = " + str);
        }
    }

    @JavascriptInterface
    public boolean sensorsdata_verify(String str) {
        try {
            SALog.i(TAG, "sensorsdata_verify event = " + str + ", enableVerify = " + this.enableVerify);
            if (this.enableVerify) {
                return H5Helper.verifyEventFromH5(str);
            }
            sensorsdata_track(str);
            return true;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            SALog.i(TAG, "sensorsdata_verify return false,exception = " + e2.getMessage());
            return false;
        }
    }

    @JavascriptInterface
    public boolean sensorsdata_visual_verify(String str) {
        try {
            if (!this.enableVerify) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String strOptString = new JSONObject(str).optString("server_url");
            if (!TextUtils.isEmpty(strOptString)) {
                return new ServerUrl(strOptString).check(new ServerUrl(AbstractSensorsDataAPI.getConfigOptions().getServerUrl()));
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return false;
    }

    public AppWebViewInterface(Context context, JSONObject jSONObject, boolean z, View view) {
        this.mContext = context;
        this.properties = jSONObject;
        this.enableVerify = z;
        if (view != null) {
            this.mWebView = new WeakReference<>(view);
        }
    }
}
