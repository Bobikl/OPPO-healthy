package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.ColorConnectManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class as0 implements km4.a {
    public static volatile Executor j;
    public cyg i;

    public as0(Context context, int i) {
        o5f.b("HttpProxyServer", "init");
        cyg cygVar = new cyg(new fp4(context), i);
        this.i = cygVar;
        this.i.y(new ColorConnectManager(context, i, cygVar));
        wl4.devicePrimary.a.g(this);
    }

    public static Executor a() {
        if (j == null) {
            synchronized (as0.class) {
                if (j == null) {
                    j = cs8.c("HttpProxy", Runtime.getRuntime().availableProcessors());
                }
            }
        }
        return j;
    }

    public void onPeerConnected(@NonNull Node node) {
        o5f.c("HttpProxyServer", "onPeerConnected: ");
    }

    public void onPeerDisconnected(@NonNull Node node) {
        this.i.n();
    }
}
