package com.sensorsdata.analytics.android.sdk.util;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.oplus.aiunit.vision.ilj;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.jsbridge.AppWebViewInterface;
import com.sensorsdata.analytics.android.sdk.plugin.encrypt.SAStoreManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class SensorsDataUtils {
    public static final String COMMAND_HARMONYOS_VERSION = "getprop hw_sc.build.platform.version";
    private static final String SHARED_PREF_APP_VERSION = "sensorsdata.app.version";
    private static final String TAG = "SA.SensorsDataUtils";
    private static String androidID = "";
    private static boolean isAndroidIDEnabled = true;
    private static boolean isOAIDEnabled = true;
    private static boolean isUniApp = false;
    private static final List<String> mInvalidAndroidId = new ArrayList<String>() { // from class: com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils.1
        {
            add("9774d56d682e549c");
            add("0123456789abcdef");
            add(ilj.DEFAULT_ANDROID_ID);
        }
    };

    public static boolean checkVersionIsNew(Context context, String str) {
        try {
            String string = SAStoreManager.getInstance().getString(SHARED_PREF_APP_VERSION, "");
            if (TextUtils.isEmpty(str) || str.equals(string)) {
                return false;
            }
            SAStoreManager.getInstance().setString(SHARED_PREF_APP_VERSION, str);
            return true;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return true;
        }
    }

    private static Class<?> compatActivity() {
        Class<?> classByName;
        try {
            classByName = ReflectUtil.getClassByName("android.support.v7.app.AppCompatActivity");
        } catch (Exception unused) {
            classByName = null;
        }
        if (classByName != null) {
            return classByName;
        }
        try {
            return ReflectUtil.getClassByName("androidx.appcompat.app.AppCompatActivity");
        } catch (Exception unused2) {
            return classByName;
        }
    }

    public static void enableAndroidId(boolean z) {
        isAndroidIDEnabled = z;
    }

    public static void enableOAID(boolean z) {
        isOAIDEnabled = z;
    }

    public static String getActivityTitle(Activity activity) {
        PackageManager packageManager;
        if (activity != null) {
            try {
                String toolbarTitle = getToolbarTitle(activity);
                if (TextUtils.isEmpty(toolbarTitle)) {
                    toolbarTitle = null;
                }
                if (TextUtils.isEmpty(toolbarTitle)) {
                    toolbarTitle = activity.getTitle().toString();
                }
                if (!TextUtils.isEmpty(toolbarTitle) || (packageManager = activity.getPackageManager()) == null) {
                    return toolbarTitle;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(activity.getComponentName(), 0);
                return !TextUtils.isEmpty(activityInfo.loadLabel(packageManager)) ? activityInfo.loadLabel(packageManager).toString() : toolbarTitle;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String getIdentifier(Context context) {
        return "";
    }

    public static String getToolbarTitle(Activity activity) {
        Object objInvoke;
        CharSequence charSequence;
        try {
            if ("com.tencent.connect.common.AssistActivity".equals(SnapCache.getInstance().getCanonicalName(activity.getClass()))) {
                if (TextUtils.isEmpty(activity.getTitle())) {
                    return null;
                }
                return activity.getTitle().toString();
            }
            ActionBar actionBar = activity.getActionBar();
            if (actionBar == null) {
                try {
                    Class<?> clsCompatActivity = compatActivity();
                    if (clsCompatActivity != null && clsCompatActivity.isInstance(activity) && (objInvoke = activity.getClass().getMethod("getSupportActionBar", new Class[0]).invoke(activity, new Object[0])) != null && (charSequence = (CharSequence) objInvoke.getClass().getMethod("getTitle", new Class[0]).invoke(objInvoke, new Object[0])) != null) {
                        return charSequence.toString();
                    }
                } catch (Exception unused) {
                }
            } else if (!TextUtils.isEmpty(actionBar.getTitle())) {
                return actionBar.getTitle().toString();
            }
            return null;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void handleSchemeUrl(Activity activity, Intent intent) {
        SASchemeHelper.handleSchemeUrl(activity, intent);
    }

    public static void initUniAppStatus() {
        try {
            Class.forName("io.dcloud.application.DCloudApplication");
            isUniApp = true;
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean isOAIDEnabled() {
        return isOAIDEnabled;
    }

    public static boolean isUniApp() {
        return isUniApp;
    }

    public static boolean isValidAndroidId(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !mInvalidAndroidId.contains(str.toLowerCase(Locale.getDefault()));
    }

    @Deprecated
    public static void mergeJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONUtils.mergeJSONObject(jSONObject, jSONObject2);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void showUpWebView(Context context, Object obj, JSONObject jSONObject, boolean z, boolean z2) {
        try {
            SALog.i(TAG, "SensorsDataUtils.showUpWebView called.x5WebView = " + obj + ", isSupportJellyBean = " + z + ", enableVerify = " + z2);
            if (obj == null) {
                return;
            }
            try {
                Class<?> cls = obj.getClass();
                try {
                    Object objInvoke = cls.getMethod("getSettings", new Class[0]).invoke(obj, new Object[0]);
                    if (objInvoke != null) {
                        objInvoke.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE).invoke(objInvoke, Boolean.TRUE);
                    }
                } catch (Exception unused) {
                }
                cls.getMethod("addJavascriptInterface", Object.class, String.class).invoke(obj, new AppWebViewInterface(context, jSONObject, z2), "SensorsData_APP_JS_Bridge");
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
            SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_ADD_VISUAL_JAVASCRIPTINTERFACE, obj);
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }
}
