package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.oplus.aiunit.vision.b2f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final b2f<Executor> executorProvider;
    private final b2f<SynchronizationGuard> guardProvider;
    private final b2f<WorkScheduler> schedulerProvider;
    private final b2f<EventStore> storeProvider;

    public WorkInitializer_Factory(b2f<Executor> b2fVar, b2f<EventStore> b2fVar2, b2f<WorkScheduler> b2fVar3, b2f<SynchronizationGuard> b2fVar4) {
        this.executorProvider = b2fVar;
        this.storeProvider = b2fVar2;
        this.schedulerProvider = b2fVar3;
        this.guardProvider = b2fVar4;
    }

    public static WorkInitializer_Factory create(b2f<Executor> b2fVar, b2f<EventStore> b2fVar2, b2f<WorkScheduler> b2fVar3, b2f<SynchronizationGuard> b2fVar4) {
        return new WorkInitializer_Factory(b2fVar, b2fVar2, b2fVar3, b2fVar4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
