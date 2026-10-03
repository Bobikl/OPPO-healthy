package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.oplus.aiunit.vision.b2f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final b2f<BackendRegistry> backendRegistryProvider;
    private final b2f<EventStore> eventStoreProvider;
    private final b2f<Executor> executorProvider;
    private final b2f<SynchronizationGuard> guardProvider;
    private final b2f<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(b2f<Executor> b2fVar, b2f<BackendRegistry> b2fVar2, b2f<WorkScheduler> b2fVar3, b2f<EventStore> b2fVar4, b2f<SynchronizationGuard> b2fVar5) {
        this.executorProvider = b2fVar;
        this.backendRegistryProvider = b2fVar2;
        this.workSchedulerProvider = b2fVar3;
        this.eventStoreProvider = b2fVar4;
        this.guardProvider = b2fVar5;
    }

    public static DefaultScheduler_Factory create(b2f<Executor> b2fVar, b2f<BackendRegistry> b2fVar2, b2f<WorkScheduler> b2fVar3, b2f<EventStore> b2fVar4, b2f<SynchronizationGuard> b2fVar5) {
        return new DefaultScheduler_Factory(b2fVar, b2fVar2, b2fVar3, b2fVar4, b2fVar5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }
}
