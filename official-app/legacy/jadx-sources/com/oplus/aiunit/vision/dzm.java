package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.net.URL;

/* JADX INFO: loaded from: classes10.dex */
public class dzm {
    public static dzm b;
    public volatile WeakReference<SharedPreferences> a = null;

    public static synchronized dzm a() {
        if (b == null) {
            b = new dzm();
        }
        return b;
    }

    public String b(Context context, String str) {
        if (this.a == null || this.a.get() == null) {
            this.a = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                q8g.f("openSDK_LOG.ServerSetting", "Get host error. url=" + str);
                return str;
            }
            String string = this.a.get().getString(host, null);
            if (string != null && !host.equals(string)) {
                String strReplace = str.replace(host, string);
                q8g.j("openSDK_LOG.ServerSetting", "return environment url : " + strReplace);
                return strReplace;
            }
            q8g.j("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e2) {
            q8g.f("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e2.getMessage());
            return str;
        }
    }
}
