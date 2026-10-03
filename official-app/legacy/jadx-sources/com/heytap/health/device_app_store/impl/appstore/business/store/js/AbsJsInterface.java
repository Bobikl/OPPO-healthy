package com.heytap.health.device_app_store.impl.appstore.business.store.js;

import android.content.Context;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.device_app_store.impl.appstore.bean.WaBaseCallBackBean;
import com.oplus.aiunit.vision.rja;
import com.oplus.aiunit.vision.s5l;
import com.oplus.aiunit.vision.sr9;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbsJsInterface extends sr9 {
    public static final String TAG = "AbsJsInterface";
    private final JsonParser jsonParser;

    public AbsJsInterface(String str) {
        super(str);
        this.jsonParser = new JsonParser();
    }

    public <T> void callbackToJs(String str, int i, T t) throws InterruptedException {
        callbackToJs(str, i, t, false);
    }

    public void finishActivity() {
        WebView webView = getWebView();
        if (webView != null) {
            Context context = webView.getContext();
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).finish();
            }
        }
    }

    public String getCallBackName(JsonObject jsonObject) {
        return jsonObject.get("callback").getAsString();
    }

    public abstract Object getChildInstance();

    @NotNull
    public Map<String, Object> jsonToMap(JsonObject jsonObject) {
        HashMap map = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value != null) {
                map.put(key, value.getAsString());
            }
        }
        return map;
    }

    @Override // com.oplus.aiunit.vision.sr9
    public rja onMethodCall(Context context, String str, String str2) {
        s5l.a(TAG, "[onMethodCall] methodName: " + str + ",param: " + str2);
        try {
            JsonObject jsonObject = (JsonObject) this.jsonParser.parse(str2);
            Object childInstance = getChildInstance();
            Method declaredMethod = childInstance.getClass().getDeclaredMethod(str, JsonObject.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(childInstance, jsonObject);
            return rja.NO_RESULT;
        } catch (NoSuchMethodException unused) {
            s5l.b(TAG, "[onMethodCall] No have implement method: " + str + "(JsonObject jo).");
            return rja.NOT_INVOKED;
        } catch (Exception e2) {
            s5l.b(TAG, "[onMethodCall] Exception " + e2);
            return rja.NOT_INVOKED;
        }
    }

    public <T> void callbackToJs(String str, int i, T t, boolean z) throws InterruptedException {
        WaBaseCallBackBean waBaseCallBackBean = new WaBaseCallBackBean();
        waBaseCallBackBean.setCode(i);
        waBaseCallBackBean.setData(t);
        AppStoreCallJsHelperKt.a(this, str, new Gson().toJson(waBaseCallBackBean), z);
    }
}
