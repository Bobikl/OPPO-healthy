package com.heytap.health.base.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import com.heytap.health.base.resposiveui.config.a;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.srf;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseApplication extends Application {
    public static BaseApplication i;

    public static BaseApplication a() {
        return i;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        b78.d(this);
        srf.a(this);
        i = this;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.m(this).v(configuration);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
    }
}
