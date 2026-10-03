package com.glyphix.mas.service;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.glyphix.mas.api.GxMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class c {
    private static String b = "com.glyphix.mas.service.c";
    private Context a;

    public class a implements GxMessage.b {
        public a() {
        }

        @Override // com.glyphix.mas.api.GxMessage.b
        public void c(String str) {
            String string;
            try {
                com.glyphix.mas.utils.b.c().c(c.b, "receive: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string2 = jSONObject.getString("app");
                string = jSONObject.getString("replier");
                try {
                    com.glyphix.mas.service.b bVarFindReceiver = NoticeReceiverManager.instance().findReceiver(string2);
                    if (bVarFindReceiver != null) {
                        bVarFindReceiver.a(jSONObject);
                    } else {
                        com.glyphix.mas.service.b.a(com.glyphix.mas.service.a.NotSupportApp, "Not support the app", string);
                    }
                } catch (Exception unused) {
                    if (string.isEmpty()) {
                        return;
                    }
                    com.glyphix.mas.service.b.a(com.glyphix.mas.service.a.NotSupportApp, "Not support the app", string);
                }
            } catch (Exception unused2) {
                string = "";
            }
        }
    }

    public class b implements GxMessage.b {
        final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // com.glyphix.mas.api.GxMessage.b
        public void c(String str) {
            com.glyphix.mas.utils.b.c().c(c.b, "receive: " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("app");
                String string2 = jSONObject.getString("replier");
                boolean z = jSONObject.getBoolean("status");
                if (!c.this.a(this.a)) {
                    com.glyphix.mas.service.b.a(com.glyphix.mas.service.a.NoPermission, "No permission use notification", string2);
                    return;
                }
                com.glyphix.mas.service.b bVarFindReceiver = NoticeReceiverManager.instance().findReceiver(string);
                if (bVarFindReceiver != null) {
                    bVarFindReceiver.a(z, string2);
                } else {
                    com.glyphix.mas.service.b.a(com.glyphix.mas.service.a.NotSupportApp, "Not support the app", string2);
                }
            } catch (Exception e2) {
                if ("".isEmpty()) {
                    return;
                }
                com.glyphix.mas.service.b.a(com.glyphix.mas.service.a.UnknownError, "Unknown error: " + e2.getMessage(), "");
            }
        }
    }

    public c(Context context) {
        this.a = context;
        NoticeReceiverManager.context = context;
        new IntentFilter(UiModeManager.ACTION_EXIT_CAR_MODE);
        GxMessage.subscribe("gx.notification.reply", new a());
        GxMessage.subscribe("gx.notification.start", new b(context));
    }

    public boolean a(Context context) {
        String packageName = context.getPackageName();
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(":")) {
                Log.i(b, "isNotificationListenerEnabled: " + str);
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && TextUtils.equals(packageName, componentNameUnflattenFromString.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
