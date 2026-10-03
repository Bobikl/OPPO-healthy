package org.iccoa.android.digitalkey;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.zs5;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class ServiceConnector {

    public class DigitalKeyCallbackWrapper extends IDigitalKeyCallback.Stub {
        private final IDigitalKeyCallback digitalKeyCallback;
        private final AtomicBoolean result = new AtomicBoolean(false);
        final /* synthetic */ ServiceConnector this$0;

        public DigitalKeyCallbackWrapper(ServiceConnector serviceConnector, IDigitalKeyCallback iDigitalKeyCallback) {
            this.digitalKeyCallback = iDigitalKeyCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResult$0(Bundle bundle) {
            try {
                this.digitalKeyCallback.onResult(bundle);
            } catch (RemoteException e2) {
                Log.e("DKF.SDK.ServiceConnector", "RemoteException " + e2);
            }
        }

        public void disconnected() {
            if (this.result.compareAndSet(false, true)) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("code", f04.ERROR_REMOTE_SERVICE_DISCONNECTED);
                    this.digitalKeyCallback.onResult(bundle);
                } catch (Exception e2) {
                    Log.e("DKF.SDK.ServiceConnector", DeviceInfoCompat.DeviceState.DISCONNECTED, e2);
                }
            }
        }

        @Override // org.iccoa.android.digitalkey.IDigitalKeyCallback
        public void onResult(final Bundle bundle) throws RemoteException {
            if (this.result.compareAndSet(false, true)) {
                zs5.b().d(new Runnable() { // from class: org.iccoa.android.digitalkey.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$onResult$0(bundle);
                    }
                });
                ServiceConnector.a(null, this);
            }
        }
    }

    public static /* synthetic */ void a(ServiceConnector serviceConnector, DigitalKeyCallbackWrapper digitalKeyCallbackWrapper) {
        throw null;
    }
}
