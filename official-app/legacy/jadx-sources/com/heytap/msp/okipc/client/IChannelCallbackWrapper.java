package com.heytap.msp.okipc.client;

import android.os.Bundle;
import com.heytap.msp.okipc.IErrorHandler;
import com.heytap.msp.okipc.aidl.IChannelCallback;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes19.dex */
public class IChannelCallbackWrapper extends IChannelCallback.Stub {
    Executor executor;

    public class a implements Runnable {
        public final /* synthetic */ Bundle i;

        public a(Bundle bundle) {
            this.i = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bundle bundle = this.i;
                int i = bundle != null ? bundle.getInt("ipc_transaction_type") : 0;
                if (i == 0) {
                    IChannelCallbackWrapper.this.onResponse(com.heytap.msp.okipc.e.a(this.i));
                } else {
                    if (i != 1) {
                        return;
                    }
                    IChannelCallbackWrapper iChannelCallbackWrapper = IChannelCallbackWrapper.this;
                    com.heytap.msp.okipc.b.a(this.i);
                    iChannelCallbackWrapper.onIntermediate(null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public IChannelCallbackWrapper(Executor executor) {
        this.executor = executor;
    }

    @Override // com.heytap.msp.okipc.aidl.IChannelCallback
    public final void callback(Bundle bundle) {
        try {
            this.executor.execute(new a(bundle));
        } catch (RejectedExecutionException e2) {
            IErrorHandler iErrorHandlerI = c.i();
            if (iErrorHandlerI != null) {
                iErrorHandlerI.handleError(e2);
            }
        }
    }

    public void onIntermediate(com.heytap.msp.okipc.b bVar) {
    }

    public void onResponse(com.heytap.msp.okipc.e eVar) {
    }
}
