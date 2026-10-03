package com.oplus.aiunit.vision;

import com.heytap.msp.okipc.IPCRawCall;
import com.heytap.msp.okipc.client.EventListener;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes19.dex */
public class c8b extends EventListener {
    public final AtomicLong a = new AtomicLong();
    public final AtomicLong b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f9986c = new AtomicLong();

    public static String l(int i) {
        if (i >= 1024) {
            return String.format("%.2fKB", Double.valueOf(((double) i) / 1024.0d));
        }
        return i + c8l.KEY_B;
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void a(IPCRawCall iPCRawCall) {
        TrackLogger.c("DRS_SDK_COMMON_IPC_CLI", "callEnd: path=%s, statusCode=%d, respBodySize=%s, took=%.2fms, body=%s", iPCRawCall.request().a, Integer.valueOf(iPCRawCall.response() != null ? iPCRawCall.response().f7339c : -1), l((iPCRawCall.response() == null || iPCRawCall.response().a == null) ? 0 : iPCRawCall.response().a.length), Double.valueOf((System.nanoTime() - this.a.get()) / 1000000.0d), new String(iPCRawCall.response().a));
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void b(IPCRawCall iPCRawCall, Throwable th) {
        TrackLogger.e("DRS_SDK_COMMON_IPC_CLI", "callFailed:  %s, %s, took %sms", iPCRawCall.request().a, th, iPCRawCall.request(), Double.valueOf((System.nanoTime() - this.a.get()) / 1000000.0d));
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void c(IPCRawCall iPCRawCall) {
        this.a.set(System.nanoTime());
        TrackLogger.c("DRS_SDK_COMMON_IPC_CLI", "callStart: path=%s, headers=%s, bodySize=%s, body=%s", iPCRawCall.request().a, iPCRawCall.request().b, l((iPCRawCall.request() == null || iPCRawCall.request().f7337c == null) ? 0 : iPCRawCall.request().f7337c.length), new String(iPCRawCall.request().f7337c));
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void d(IPCRawCall iPCRawCall) {
        TrackLogger.c("DRS_SDK_COMMON_IPC_CLI", "connectEnd: %s, took %sms", iPCRawCall.request().f(), Double.valueOf((System.nanoTime() - this.b.get()) / 1000000.0d));
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void e(IPCRawCall iPCRawCall, Throwable th) {
        TrackLogger.d("DRS_SDK_COMMON_IPC_CLI", "connectFailed: %s, took %sms", th, iPCRawCall.request().f(), Double.valueOf((System.nanoTime() - this.b.get()) / 1000000.0d));
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void f(IPCRawCall iPCRawCall) {
        this.b.set(System.nanoTime());
        TrackLogger.c("DRS_SDK_COMMON_IPC_CLI", "connectStart: %s:%s", iPCRawCall.request().f(), iPCRawCall.request().d());
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void g(IPCRawCall iPCRawCall) {
        TrackLogger.c("DRS_SDK_COMMON_IPC_CLI", "connectionAcquired", new Object[0]);
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void i(IPCRawCall iPCRawCall) {
        TrackLogger.c("DRS_SDK_COMMON_IPC_CLI", "requestEnd, took %sms", Double.valueOf((System.nanoTime() - this.f9986c.get()) / 1000000.0d));
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void j(IPCRawCall iPCRawCall, Throwable th) {
        TrackLogger.d("DRS_SDK_COMMON_IPC_CLI", "requestFailed, took %sms", th, Double.valueOf((System.nanoTime() - this.f9986c.get()) / 1000000.0d));
    }

    @Override // com.heytap.msp.okipc.client.EventListener
    public void k(IPCRawCall iPCRawCall) {
        this.f9986c.set(System.nanoTime());
        TrackLogger.c("DRS_SDK_COMMON_IPC_CLI", "requestStart: path=%s, headers=%s, bodySize=%s, body=%s", iPCRawCall.request().a, iPCRawCall.request().b, l((iPCRawCall.request() == null || iPCRawCall.request().f7337c == null) ? 0 : iPCRawCall.request().f7337c.length), new String(iPCRawCall.request().f7337c));
    }
}
