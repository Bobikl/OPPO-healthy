package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.ColorConnectManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public class jr0 implements ul4.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile Executor f12989j;
    public mug i;

    public jr0(Context context, int i) {
        c3f.b("HttpProxyServer", "init");
        mug mugVar = new mug(new po4(context), i);
        this.i = mugVar;
        this.i.y(new ColorConnectManager(context, i, mugVar));
        gl4.devicePrimary.nodeApi.g(this);
    }

    public static Executor a() {
        if (f12989j == null) {
            synchronized (jr0.class) {
                if (f12989j == null) {
                    f12989j = zq8.c("HttpProxy", Runtime.getRuntime().availableProcessors());
                }
            }
        }
        return f12989j;
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NonNull Node node) {
        c3f.c("HttpProxyServer", "onPeerConnected: ");
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NonNull Node node) {
        this.i.n();
    }
}
