package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.mcssdk.PushService;

/* JADX INFO: loaded from: classes19.dex */
public class trm {
    public Context a;
    public SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17133c;

    public static class b {
        public static trm a = new trm();
    }

    public trm() {
        this.f17133c = new Object();
        Context contextH = PushService.j().h();
        if (contextH != null) {
            this.a = a(contextH);
        }
        Context context = this.a;
        if (context != null) {
            this.b = context.getSharedPreferences("shared_msg_sdk", 0);
        }
    }

    public static trm d() {
        return b.a;
    }

    public final Context a(Context context) {
        boolean zB = fbm.b();
        cpm.a("fbeVersion is " + zB);
        return zB ? context.createDeviceProtectedStorageContext() : context.getApplicationContext();
    }

    public void b(String str) {
        SharedPreferences sharedPreferencesE = e();
        if (sharedPreferencesE != null) {
            sharedPreferencesE.edit().putString("decryptTag", str).commit();
        }
    }

    public String c() {
        SharedPreferences sharedPreferencesE = e();
        return sharedPreferencesE != null ? sharedPreferencesE.getString("decryptTag", "DES") : "DES";
    }

    public final SharedPreferences e() {
        Context context;
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.f17133c) {
            SharedPreferences sharedPreferences2 = this.b;
            if (sharedPreferences2 != null || (context = this.a) == null) {
                return sharedPreferences2;
            }
            SharedPreferences sharedPreferences3 = context.getSharedPreferences("shared_msg_sdk", 0);
            this.b = sharedPreferences3;
            return sharedPreferences3;
        }
    }
}
