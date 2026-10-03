package com.heytap.msp.okipc.client;

import com.heytap.msp.okipc.IPCRawCall;

/* JADX INFO: loaded from: classes19.dex */
public abstract class EventListener {
    public static final EventListener NONE = new a();

    public interface Factory {
        EventListener create(IPCRawCall iPCRawCall);
    }

    public class a extends EventListener {
    }

    public void a(IPCRawCall iPCRawCall) {
    }

    public void b(IPCRawCall iPCRawCall, Throwable th) {
    }

    public void c(IPCRawCall iPCRawCall) {
    }

    public void d(IPCRawCall iPCRawCall) {
    }

    public void e(IPCRawCall iPCRawCall, Throwable th) {
    }

    public void f(IPCRawCall iPCRawCall) {
    }

    public void g(IPCRawCall iPCRawCall) {
    }

    public void h(com.heytap.msp.okipc.c cVar) {
    }

    public void i(IPCRawCall iPCRawCall) {
    }

    public void j(IPCRawCall iPCRawCall, Throwable th) {
    }

    public void k(IPCRawCall iPCRawCall) {
    }
}
