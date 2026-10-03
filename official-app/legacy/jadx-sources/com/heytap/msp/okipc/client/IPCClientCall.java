package com.heytap.msp.okipc.client;

import com.heytap.msp.okipc.IErrorHandler;
import com.heytap.msp.okipc.IPCRawCallback;
import com.heytap.msp.okipc.aidl.IChannelCallback;
import com.heytap.msp.okipc.wild.IClientCallback;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class IPCClientCall extends com.heytap.msp.okipc.c {
    public c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7326e = new AtomicBoolean(false);
    public EventListener f = EventListener.NONE;

    public static class CallbackWrapper extends IChannelCallbackWrapper implements IClientCallback {
        IPCClientCall call;
        IPCRawCallback callback;

        public CallbackWrapper(IPCClientCall iPCClientCall, IPCRawCallback iPCRawCallback, Executor executor) {
            super(executor);
            this.callback = iPCRawCallback;
            this.call = iPCClientCall;
        }

        @Override // com.heytap.msp.okipc.wild.IClientCallback
        public void onClientError(Throwable th) {
            try {
                this.callback.onFailure(this.call, th);
            } catch (Throwable th2) {
                IErrorHandler iErrorHandlerI = c.i();
                if (iErrorHandlerI != null) {
                    iErrorHandlerI.handleError(th2);
                }
            }
        }

        @Override // com.heytap.msp.okipc.client.IChannelCallbackWrapper
        public void onIntermediate(com.heytap.msp.okipc.b bVar) {
            super.onIntermediate(bVar);
        }

        @Override // com.heytap.msp.okipc.client.IChannelCallbackWrapper
        public void onResponse(com.heytap.msp.okipc.e eVar) {
            super.onResponse(eVar);
            IPCClientCall iPCClientCall = this.call;
            iPCClientCall.b = eVar;
            iPCClientCall.f().a(this.call);
            try {
                if (eVar.f()) {
                    this.callback.onResponse(this.call, eVar);
                } else {
                    this.callback.onFailure(this.call, eVar.c());
                }
            } catch (Throwable th) {
                IErrorHandler iErrorHandlerI = c.i();
                if (iErrorHandlerI != null) {
                    iErrorHandlerI.handleError(th);
                }
            }
        }
    }

    public IPCClientCall(c cVar, com.heytap.msp.okipc.d dVar) {
        this.d = cVar;
        this.a = dVar;
    }

    @Override // com.heytap.msp.okipc.c
    public void d(Throwable th) {
        if (!this.f7326e.compareAndSet(false, true)) {
            IErrorHandler iErrorHandlerI = c.i();
            if (iErrorHandlerI != null) {
                iErrorHandlerI.handleError(th);
                return;
            }
            return;
        }
        this.f.b(this, th);
        try {
            IChannelCallback iChannelCallback = this.f7324c;
            if (iChannelCallback instanceof IClientCallback) {
                ((IClientCallback) iChannelCallback).onClientError(th);
            }
        } catch (Throwable th2) {
            IErrorHandler iErrorHandlerI2 = c.i();
            if (iErrorHandlerI2 != null) {
                iErrorHandlerI2.handleError(th2);
            }
        }
    }

    public void e(IPCRawCallback iPCRawCallback) {
        this.f7324c = new CallbackWrapper(this, iPCRawCallback, this.d.j());
        this.d.enqueue(this);
    }

    public EventListener f() {
        return this.f;
    }

    public void g(EventListener eventListener) {
        this.f = eventListener;
    }

    @Override // com.heytap.msp.okipc.IPCRawCall
    public com.heytap.msp.okipc.e response() {
        return this.b;
    }
}
