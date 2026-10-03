package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import com.alibaba.android.arouter.exception.HandlerException;
import java.util.HashSet;

/* JADX INFO: loaded from: classes18.dex */
public class mzf {
    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            t6b.c("context is not Application");
            return;
        }
        try {
            x0.e((Application) applicationContext);
        } catch (HandlerException e2) {
            t6b.i("RuntimeEnvironment", "ARouter init HandlerException " + e2.getMessage());
            context.getSharedPreferences("SP_AROUTER_CACHE", 0).edit().putInt("LAST_VERSION_CODE", 0).putStringSet("ROUTER_MAP", new HashSet()).apply();
            x0.e((Application) applicationContext);
        }
    }
}
