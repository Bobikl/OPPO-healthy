package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final b2f<Clock> eventClockProvider;
    private final b2f<WorkInitializer> initializerProvider;
    private final b2f<Scheduler> schedulerProvider;
    private final b2f<Uploader> uploaderProvider;
    private final b2f<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(b2f<Clock> b2fVar, b2f<Clock> b2fVar2, b2f<Scheduler> b2fVar3, b2f<Uploader> b2fVar4, b2f<WorkInitializer> b2fVar5) {
        this.eventClockProvider = b2fVar;
        this.uptimeClockProvider = b2fVar2;
        this.schedulerProvider = b2fVar3;
        this.uploaderProvider = b2fVar4;
        this.initializerProvider = b2fVar5;
    }

    public static TransportRuntime_Factory create(b2f<Clock> b2fVar, b2f<Clock> b2fVar2, b2f<Scheduler> b2fVar3, b2f<Uploader> b2fVar4, b2f<WorkInitializer> b2fVar5) {
        return new TransportRuntime_Factory(b2fVar, b2fVar2, b2fVar3, b2fVar4, b2fVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
