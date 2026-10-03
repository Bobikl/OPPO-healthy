package com.heytap.msp.okipc.client;

import androidx.annotation.NonNull;
import com.heytap.msp.okipc.IPCRawCall;
import com.heytap.msp.okipc.IPCRawCallback;
import com.heytap.msp.okipc.exception.ClientCallCreateException;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public class b<T> implements ICall<T> {
    public final c a;
    public final Converter<byte[], T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IPCClientCall f7328c;
    public final com.heytap.msp.okipc.d d;

    public class a implements IPCRawCallback {
        public final /* synthetic */ Callback a;

        public a(Callback callback) {
            this.a = callback;
        }

        public final void a(IPCRawCall iPCRawCall, Throwable th) {
            try {
                this.a.onFailure(b.this, th);
            } catch (Throwable unused) {
                c.k(th);
            }
        }

        @Override // com.heytap.msp.okipc.IPCRawCallback
        public void onFailure(@NonNull IPCRawCall iPCRawCall, @NonNull Throwable th) {
            a(iPCRawCall, th);
        }

        @Override // com.heytap.msp.okipc.IPCRawCallback
        public void onResponse(@NonNull IPCRawCall iPCRawCall, @NonNull com.heytap.msp.okipc.e eVar) {
            e<T> eVarB;
            try {
                eVarB = b.this.b(eVar);
            } catch (Throwable th) {
                a(iPCRawCall, th);
                eVarB = null;
            }
            try {
                this.a.onResponse(b.this, eVarB);
            } catch (Throwable th2) {
                c.k(th2);
            }
        }
    }

    public b(com.heytap.msp.okipc.d dVar, c cVar, Converter<byte[], T> converter) {
        this.d = dVar;
        this.a = cVar;
        this.b = converter;
    }

    public IPCClientCall a() {
        return this.a.newCall(this.d);
    }

    public e<T> b(com.heytap.msp.okipc.e eVar) throws IOException {
        byte[] bArr = eVar.a;
        int iB = eVar.b();
        if (iB < 200 || iB >= 300) {
            return e.a(bArr, eVar);
        }
        try {
            return e.b(this.b.convert(bArr), eVar);
        } catch (IOException unused) {
            return e.a(null, eVar);
        }
    }

    @Override // com.heytap.msp.okipc.client.ICall
    public void enqueue(Callback<T> callback) {
        IPCClientCall iPCClientCallA;
        synchronized (this) {
            iPCClientCallA = this.f7328c;
            if (iPCClientCallA == null) {
                try {
                    iPCClientCallA = a();
                    this.f7328c = iPCClientCallA;
                } catch (Exception e2) {
                    callback.onFailure(this, new ClientCallCreateException(e2));
                    return;
                }
            }
        }
        iPCClientCallA.e(new a(callback));
    }

    @Override // com.heytap.msp.okipc.client.ICall
    public e<T> execute() {
        return null;
    }

    @Override // com.heytap.msp.okipc.client.ICall
    public com.heytap.msp.okipc.d request() {
        return this.f7328c.request();
    }
}
