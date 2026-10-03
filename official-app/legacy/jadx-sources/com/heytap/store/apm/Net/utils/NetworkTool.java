package com.heytap.store.apm.Net.utils;

import android.app.Application;
import android.content.Context;
import com.heytap.store.apm.Net.NetworkManager;
import com.heytap.store.apm.Net.stetho.NetworkInterceptor;
import com.heytap.store.apm.Net.stetho.NetworkListener;
import com.oplus.aiunit.vision.efd;
import java.net.Proxy;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkTool {
    private static NetworkTool INSTANCE;
    private Application app;
    private efd.a localBuild;

    public static NetworkTool getInstance() {
        if (INSTANCE == null) {
            synchronized (NetworkTool.class) {
                if (INSTANCE == null) {
                    INSTANCE = new NetworkTool();
                }
            }
        }
        return INSTANCE;
    }

    public efd.a addOkHttp(efd.a aVar, boolean z) throws Throwable {
        NetLogUtils.i("OkHttpHook-------addOkHttp");
        if (this.localBuild == null) {
            efd.a aVarB = aVar.k(NetworkListener.get(0L)).b(new NetworkInterceptor());
            this.localBuild = aVarB;
            if (z) {
                aVarB.W(Proxy.NO_PROXY);
            }
        }
        return this.localBuild;
    }

    public Application getApplication() {
        return this.app;
    }

    public void init(Application application) {
        this.app = application;
        setOkHttpHook();
        NetworkManager.get().startMonitor();
    }

    public void setFloat(Context context) {
    }

    public void setOkHttpHook() {
    }

    public void stopMonitor() {
        NetworkManager.get().stopMonitor();
    }
}
