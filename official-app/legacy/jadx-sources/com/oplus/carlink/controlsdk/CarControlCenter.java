package com.oplus.carlink.controlsdk;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.d1d;
import com.oplus.aiunit.vision.f1d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class CarControlCenter extends com.oplus.carlink.controlsdk.a {
    private static final Object LOCK = new Object();
    private static final String TAG = "CarControlCenter";
    private static final int THREAD_POOL_SIZE = 10;
    private static volatile CarControlCenter sINSTANCE;
    private ExecutorService mExecutorService = Executors.newFixedThreadPool(10);
    private O0O mServiceConnector;

    public class a implements O0O.c {
        @Override // com.oplus.carlink.controlsdk.O0O.c
        public final void a(@NonNull f1d f1dVar) {
            d1d.a(CarControlCenter.TAG, "onConnectionSuccessful");
        }

        @Override // com.oplus.carlink.controlsdk.O0O.c
        public final void b(int i) {
            d1d.a(CarControlCenter.TAG, "onConnectionFailed:" + i);
        }
    }

    public class b implements O0O.c {
        public final /* synthetic */ com.oplus.carlink.controlsdk.a.InterfaceC0954a a;
        public final /* synthetic */ CarControlCallback b;

        public b(com.oplus.carlink.controlsdk.a.InterfaceC0954a interfaceC0954a, CarControlCallback carControlCallback) {
            this.a = interfaceC0954a;
            this.b = carControlCallback;
        }

        @Override // com.oplus.carlink.controlsdk.O0O.c
        public final void a(f1d f1dVar) {
            try {
                this.a.a(f1dVar);
            } catch (Exception unused) {
                this.b.onError(-1, Constant.getErrorMessageByCode(-1), "");
            }
        }

        @Override // com.oplus.carlink.controlsdk.O0O.c
        public final void b(int i) {
            this.b.onError(i, Constant.getErrorMessageByCode(i), "");
        }
    }

    private CarControlCenter(Context context) {
        Intent intent = new Intent("oplus.intent.action.carlink.SDK_EXPORTED_SERVICE");
        intent.setClassName("com.heytap.opluscarlink", "com.heytap.opluscarlink.carcontrol.export.ControlSDKService");
        O0O o0o = new O0O(context, intent);
        this.mServiceConnector = o0o;
        o0o.f(new a());
    }

    public static CarControlCenter getInstance(@NonNull Context context) {
        if (sINSTANCE == null) {
            synchronized (LOCK) {
                if (sINSTANCE == null) {
                    sINSTANCE = new CarControlCenter(context);
                }
            }
        }
        return sINSTANCE;
    }

    @Override // com.oplus.carlink.controlsdk.a
    public void safeCall(@NonNull CarControlCallback<?> carControlCallback, @NonNull com.oplus.carlink.controlsdk.a.InterfaceC0954a interfaceC0954a) {
        O0O o0o = this.mServiceConnector;
        if (o0o != null) {
            o0o.f(new b(interfaceC0954a, carControlCallback));
        } else {
            carControlCallback.onError(-1, Constant.getErrorMessageByCode(-1), "");
        }
    }

    public void threadCall(final Runnable runnable) {
        try {
            this.mExecutorService.submit(new Runnable() { // from class: com.oplus.aiunit.vision.uy2
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            });
        } catch (Exception e2) {
            d1d.c(TAG, "RemoteException " + e2);
        }
    }
}
