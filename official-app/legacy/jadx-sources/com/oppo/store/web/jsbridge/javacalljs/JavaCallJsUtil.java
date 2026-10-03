package com.oppo.store.web.jsbridge.javacalljs;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class JavaCallJsUtil {
    public static void clickTab(String str, String str2, WebView webView) {
        if (webView != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", str);
                jSONObject.put("status", str2);
                JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_NAV_TAB_SWITCH, jSONObject, new ValueCallback() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.2
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Object obj) {
                    }
                });
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void getCalendarJs(final String str, final String str2, final WebView webView) {
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.4
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("type", str);
                        jSONObject.put("status", str2);
                        JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_CALENDAR_STATUS, jSONObject, new ValueCallback() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.4.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Object obj) {
                            }
                        });
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    public static void navShare(String str, WebView webView) {
        StatisticsUtil.nagvationClk("分享", "");
        if (webView != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", str);
                JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_NAV_SHARE, jSONObject, new ValueCallback() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.1
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Object obj) {
                    }
                });
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void notifyCloseAlert(WebView webView) {
        JSONObject jSONObject = new JSONObject();
        if (webView != null) {
            try {
                jSONObject.put("status", "success");
                JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_NOTIFY_CLOSE_ALERT, jSONObject, new ValueCallback() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.7
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Object obj) {
                    }
                });
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void onCloseHalfScreen(WebView webView) {
        if (webView != null) {
            JavaCallJs javaCallJsNewInstance = JavaCallJs.newInstance(webView, JavaCallJs.JS_METHOD_ON_CLOSE_HALF_SCREEN);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", "success");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            javaCallJsNewInstance.call(true, jSONObject, "0");
        }
    }

    public static void onNavStyleChange(boolean z, WebView webView) {
        if (webView != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isSticky", z);
                JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_NAV_STYLE_CHANGE, jSONObject, new ValueCallback() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.3
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Object obj) {
                    }
                });
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void setCalendarStatu(final boolean z, final WebView webView) {
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.5
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("calendarStatu", z);
                        JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_CALENDAR, jSONObject, new ValueCallback() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.5.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Object obj) {
                            }
                        });
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    public static void setVersionValue(WebView webView) {
        if (webView != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
                jSONObject.put("walletVersion", DeviceInfoUtil.getWalletApkVersion(contextGetterUtils.getApp()));
                jSONObject.put("userCenterVersion", DeviceInfoUtil.getUsercenterApkVersion(contextGetterUtils.getApp()));
                jSONObject.put("model", DeviceInfoUtil.getPhoneModel());
                JavaCallJs.javaCallJs(webView, JavaCallJs.JS_METHOD_GETVERSION, jSONObject, new ValueCallback() { // from class: com.oppo.store.web.jsbridge.javacalljs.JavaCallJsUtil.6
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Object obj) {
                    }
                });
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void webCallBack(String str, WebView webView) {
        if (webView != null) {
            JavaCallJs javaCallJsNewInstance = JavaCallJs.newInstance(webView, JavaCallJs.JS_METHOD_ON_TITLE_RIGHT_ICON_TEXT_CLICK);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            javaCallJsNewInstance.call(true, jSONObject, "0");
        }
    }
}
