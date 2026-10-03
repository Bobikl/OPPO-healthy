package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.oplus.aiunit.vision.b2f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class Uploader_Factory implements Factory<Uploader> {
    private final b2f<BackendRegistry> backendRegistryProvider;
    private final b2f<Clock> clockProvider;
    private final b2f<Context> contextProvider;
    private final b2f<EventStore> eventStoreProvider;
    private final b2f<Executor> executorProvider;
    private final b2f<SynchronizationGuard> guardProvider;
    private final b2f<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(b2f<Context> b2fVar, b2f<BackendRegistry> b2fVar2, b2f<EventStore> b2fVar3, b2f<WorkScheduler> b2fVar4, b2f<Executor> b2fVar5, b2f<SynchronizationGuard> b2fVar6, b2f<Clock> b2fVar7) {
        this.contextProvider = b2fVar;
        this.backendRegistryProvider = b2fVar2;
        this.eventStoreProvider = b2fVar3;
        this.workSchedulerProvider = b2fVar4;
        this.executorProvider = b2fVar5;
        this.guardProvider = b2fVar6;
        this.clockProvider = b2fVar7;
    }

    public static Uploader_Factory create(b2f<Context> b2fVar, b2f<BackendRegistry> b2fVar2, b2f<EventStore> b2fVar3, b2f<WorkScheduler> b2fVar4, b2f<Executor> b2fVar5, b2f<SynchronizationGuard> b2fVar6, b2f<Clock> b2fVar7) {
        return new Uploader_Factory(b2fVar, b2fVar2, b2fVar3, b2fVar4, b2fVar5, b2fVar6, b2fVar7);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get());
    }
}
