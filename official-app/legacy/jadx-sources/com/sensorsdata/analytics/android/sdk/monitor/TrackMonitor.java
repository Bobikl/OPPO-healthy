package com.sensorsdata.analytics.android.sdk.monitor;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.listener.SAFunctionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TrackMonitor {
    private JSONObject cacheData;
    private List<SAFunctionListener> mFunctionListener;

    public static class SingletonHolder {
        private static final TrackMonitor INSTANCE = new TrackMonitor();

        private SingletonHolder() {
        }
    }

    private void call(String str, JSONObject jSONObject) {
        List<SAFunctionListener> list;
        if (TextUtils.isEmpty(str) || (list = this.mFunctionListener) == null) {
            return;
        }
        Iterator<SAFunctionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().call(str, jSONObject);
        }
    }

    public static TrackMonitor getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addFunctionListener(SAFunctionListener sAFunctionListener) {
        try {
            if (this.mFunctionListener == null) {
                this.mFunctionListener = new ArrayList();
            }
            if (sAFunctionListener != null && !this.mFunctionListener.contains(sAFunctionListener)) {
                this.mFunctionListener.add(sAFunctionListener);
            }
            JSONObject jSONObject = this.cacheData;
            if (jSONObject != null) {
                call("trackEvent", jSONObject);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void callEnableDataCollect() {
        call("enableDataCollect", null);
    }

    public void callIdentify(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("distinctId", str);
            call("identify", jSONObject);
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void callLogin(String str) {
        if (this.mFunctionListener == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("distinctId", str);
            call("login", jSONObject);
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void callLogout() {
        call("logout", null);
    }

    public void callResetAnonymousId(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("distinctId", str);
            call("resetAnonymousId", jSONObject);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void callSetServerUrl() {
        call("setServerUrl", null);
    }

    public void callTrack(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("eventJSON", jSONObject);
            if (!"$AppStart".equals(jSONObject.optString("event")) || this.mFunctionListener != null) {
                call("trackEvent", jSONObject2);
            } else {
                this.cacheData = jSONObject2;
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.monitor.TrackMonitor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TrackMonitor.this.cacheData = null;
                    }
                }, 2000L);
            }
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void removeFunctionListener(SAFunctionListener sAFunctionListener) {
        List<SAFunctionListener> list = this.mFunctionListener;
        if (list == null || sAFunctionListener == null) {
            return;
        }
        list.remove(sAFunctionListener);
    }

    private TrackMonitor() {
    }
}
