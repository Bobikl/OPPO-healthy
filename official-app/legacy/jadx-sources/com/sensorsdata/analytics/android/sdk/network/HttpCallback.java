package com.sensorsdata.analytics.android.sdk.network;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class HttpCallback<T> {
    static Handler sMainHandler = new Handler(Looper.getMainLooper());

    public static abstract class JsonCallback extends HttpCallback<JSONObject> {
        @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
        public void onAfter() {
        }

        @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
        public JSONObject onParseResponse(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return new JSONObject(str);
            } catch (JSONException e2) {
                SALog.printStackTrace(e2);
                return null;
            }
        }
    }

    public static abstract class StringCallback extends HttpCallback<String> {
        @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
        public String onParseResponse(String str) {
            return str;
        }
    }

    public abstract void onAfter();

    public void onError(final RealResponse realResponse) {
        final String string;
        if (!TextUtils.isEmpty(realResponse.result)) {
            string = realResponse.result;
        } else if (TextUtils.isEmpty(realResponse.errorMsg)) {
            Exception exc = realResponse.exception;
            string = exc != null ? exc.toString() : "unknown error";
        } else {
            string = realResponse.errorMsg;
        }
        sMainHandler.post(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.network.HttpCallback.1
            @Override // java.lang.Runnable
            public void run() {
                HttpCallback.this.onFailure(realResponse.code, string);
                HttpCallback.this.onAfter();
            }
        });
    }

    public abstract void onFailure(int i, String str);

    public abstract T onParseResponse(String str);

    public abstract void onResponse(T t);

    public void onSuccess(RealResponse realResponse) {
        final T tOnParseResponse = onParseResponse(realResponse.result);
        sMainHandler.post(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.network.HttpCallback.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                HttpCallback.this.onResponse(tOnParseResponse);
                HttpCallback.this.onAfter();
            }
        });
    }
}
