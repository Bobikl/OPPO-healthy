package com.oplus.aiunit.vision;

import android.content.Intent;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class efk {
    public static efk b;
    public Map<String, a> a;

    public class a {
        public int a;
        public iz9 b;

        public a(int i, iz9 iz9Var) {
            this.a = i;
            this.b = iz9Var;
        }
    }

    public efk() {
        Map<String, a> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        this.a = mapSynchronizedMap;
        if (mapSynchronizedMap == null) {
            this.a = Collections.synchronizedMap(new HashMap());
        }
    }

    public static efk a() {
        if (b == null) {
            b = new efk();
        }
        return b;
    }

    public iz9 b(String str) {
        a aVar;
        if (str == null) {
            q8g.f("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.a) {
            aVar = this.a.get(str);
            this.a.remove(str);
        }
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public void c(Intent intent, iz9 iz9Var) {
        q8g.i("openSDK_LOG.UIListenerManager", "handleDataToListener");
        if (intent == null) {
            iz9Var.onCancel();
            return;
        }
        String stringExtra = intent.getStringExtra(s04.KEY_ACTION);
        if ("action_login".equals(stringExtra)) {
            int intExtra = intent.getIntExtra(s04.KEY_ERROR_CODE, 0);
            if (intExtra != 0) {
                q8g.f("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
                iz9Var.onError(new yfk(intExtra, intent.getStringExtra(s04.KEY_ERROR_MSG), intent.getStringExtra(s04.KEY_ERROR_DETAIL)));
                return;
            }
            String stringExtra2 = intent.getStringExtra(s04.KEY_RESPONSE);
            if (stringExtra2 == null) {
                q8g.d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                iz9Var.onComplete(new JSONObject());
                return;
            }
            try {
                iz9Var.onComplete(com.tencent.open.utils.b.C(stringExtra2));
                return;
            } catch (JSONException e2) {
                iz9Var.onError(new yfk(-4, s04.MSG_JSON_ERROR, stringExtra2));
                q8g.g("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e2);
                return;
            }
        }
        if ("action_share".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra("result");
            String stringExtra4 = intent.getStringExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
            if ("cancel".equals(stringExtra3)) {
                iz9Var.onCancel();
                return;
            }
            if ("error".equals(stringExtra3)) {
                iz9Var.onError(new yfk(-6, "unknown error", stringExtra4 + ""));
                return;
            }
            if ("complete".equals(stringExtra3)) {
                try {
                    iz9Var.onComplete(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                    iz9Var.onError(new yfk(-4, "json error", stringExtra4 + ""));
                }
            }
        }
    }

    public Object d(int i, iz9 iz9Var) {
        a aVarPut;
        String strD = yzm.d(i);
        if (strD == null) {
            q8g.f("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=" + i);
            return null;
        }
        synchronized (this.a) {
            aVarPut = this.a.put(strD, new a(i, iz9Var));
        }
        if (aVarPut == null) {
            return null;
        }
        return aVarPut.b;
    }

    public Object e(String str, iz9 iz9Var) {
        a aVarPut;
        int iA = yzm.a(str);
        if (iA == -1) {
            q8g.f("openSDK_LOG.UIListenerManager", "setListnerWithAction fail, action = " + str);
            return null;
        }
        synchronized (this.a) {
            aVarPut = this.a.put(str, new a(iA, iz9Var));
        }
        if (aVarPut == null) {
            return null;
        }
        return aVarPut.b;
    }
}
