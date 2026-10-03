package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\b\u0018\u00010\u0019R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/v3e;", "", "", "data", "", "f", "", "j", "", b2n.f, "i", "savingData", b2n.g, "Lcom/oplus/aiunit/vision/zwe;", "a", "Lcom/oplus/aiunit/vision/zwe;", "packetDataProcessor", "", "b", "Ljava/lang/String;", "fetcherName", "Ljava/util/concurrent/LinkedBlockingQueue;", "c", "Ljava/util/concurrent/LinkedBlockingQueue;", "saveDataQueue", "Lcom/oplus/aiunit/vision/v3e$a;", "d", "Lcom/oplus/aiunit/vision/v3e$a;", "saveDataThread", "Ljava/util/concurrent/CountDownLatch;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/concurrent/CountDownLatch;", "saveResultDownLatch", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "saveResultCode", "Z", "noMoreData", "<init>", "(Lcom/oplus/aiunit/vision/zwe;Ljava/lang/String;)V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class v3e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final zwe packetDataProcessor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String fetcherName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<byte[]> saveDataQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public a saveDataThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CountDownLatch saveResultDownLatch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger saveResultCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public volatile boolean noMoreData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/v3e$a;", "Ljava/lang/Thread;", "", "run", "", "b", "a", "i", "Z", "running", "<init>", "(Lcom/oplus/aiunit/vision/v3e;)V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public final class a extends Thread {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public volatile boolean running = true;

        public a() {
        }

        public final void a() {
            this.running = false;
            interrupt();
        }

        public final boolean b() {
            return isAlive() && this.running;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.running) {
                try {
                    try {
                        if (v3e.this.saveDataQueue.isEmpty() && v3e.this.noMoreData) {
                            a7b.f("Data-Sync", "noMore data break packet data save cycle");
                            break;
                        }
                        byte[] savingData = (byte[]) v3e.this.saveDataQueue.take();
                        v3e v3eVar = v3e.this;
                        Intrinsics.checkNotNullExpressionValue(savingData, "savingData");
                        v3eVar.h(savingData);
                    } catch (InterruptedException e2) {
                        a7b.b("Data-Sync", v3e.this.fetcherName + " run: ex " + e2);
                    }
                } finally {
                    v3e.this.saveResultDownLatch.countDown();
                }
            }
        }
    }

    public v3e(@NotNull zwe packetDataProcessor, @NotNull String fetcherName) {
        Intrinsics.checkNotNullParameter(packetDataProcessor, "packetDataProcessor");
        Intrinsics.checkNotNullParameter(fetcherName, "fetcherName");
        this.packetDataProcessor = packetDataProcessor;
        this.fetcherName = fetcherName;
        this.saveDataQueue = new LinkedBlockingQueue<>();
        this.saveResultDownLatch = new CountDownLatch(1);
        this.saveResultCode = new AtomicInteger(1);
    }

    public final void f(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.saveDataQueue.offer(data);
        i();
    }

    public final boolean g() {
        return this.saveResultCode.get() != 1;
    }

    public final void h(byte[] savingData) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.packetDataProcessor.e(savingData).getProcessCode() != 1) {
                this.saveResultCode.set(4);
                a aVar = this.saveDataThread;
                if (aVar != null) {
                    aVar.a();
                }
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            a7b.f("Data-Sync", this.fetcherName + " processHasMorePacketData error " + thM5290exceptionOrNullimpl.getMessage());
            this.saveResultCode.set(3);
        }
    }

    public final synchronized void i() {
        a aVar = this.saveDataThread;
        if (aVar != null) {
            boolean z = false;
            if (aVar != null && aVar.b()) {
                z = true;
            }
            if (z) {
                return;
            }
        }
        this.saveResultCode.set(1);
        a aVar2 = this.saveDataThread;
        if (aVar2 != null) {
            aVar2.a();
        }
        a aVar3 = new a();
        this.saveDataThread = aVar3;
        aVar3.start();
    }

    public final int j() {
        this.noMoreData = true;
        try {
            this.saveResultDownLatch.await(60L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            zlj.c("Data-Sync", "result: ex " + e2);
        }
        a aVar = this.saveDataThread;
        if (aVar != null) {
            aVar.a();
        }
        return this.saveResultCode.get();
    }
}
