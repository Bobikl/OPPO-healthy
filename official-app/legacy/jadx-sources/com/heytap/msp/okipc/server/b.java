package com.heytap.msp.okipc.server;

import androidx.annotation.NonNull;
import com.heytap.msp.okipc.IErrorHandler;
import com.heytap.msp.okipc.aidl.IChannelCallback;
import com.heytap.msp.okipc.d;
import com.heytap.msp.okipc.e;
import com.heytap.msp.okipc.exception.IPCServerException;

/* JADX INFO: loaded from: classes19.dex */
public class b extends com.heytap.msp.okipc.c {
    public c d;

    public b(@NonNull d dVar, @NonNull IChannelCallback iChannelCallback, @NonNull c cVar) {
        this.a = dVar;
        this.f7324c = iChannelCallback;
        this.d = cVar;
    }

    public static b e(@NonNull d dVar, @NonNull IChannelCallback iChannelCallback, @NonNull c cVar) {
        return new b(dVar, iChannelCallback, cVar);
    }

    @Override // com.heytap.msp.okipc.c
    public void c(e eVar) {
        this.d.f(this, eVar);
        super.c(eVar);
    }

    @Override // com.heytap.msp.okipc.c
    public void d(Throwable th) {
        try {
            if (th instanceof IPCServerException) {
                c(e.h((IPCServerException) th));
            } else {
                c(e.e(th));
            }
        } catch (Exception e2) {
            IErrorHandler iErrorHandlerG = a.i().g();
            if (iErrorHandlerG != null) {
                iErrorHandlerG.handleError(e2);
            }
        }
    }

    @Override // com.heytap.msp.okipc.IPCRawCall
    public e response() {
        return this.b;
    }

    public String toString() {
        return "IPCServerCall{request=" + this.a + ", response=" + this.b + ", callback=" + this.f7324c + '}';
    }
}
