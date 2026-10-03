package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final b2f<Clock> clockProvider;
    private final b2f<SchedulerConfig> configProvider;
    private final b2f<Context> contextProvider;
    private final b2f<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(b2f<Context> b2fVar, b2f<EventStore> b2fVar2, b2f<SchedulerConfig> b2fVar3, b2f<Clock> b2fVar4) {
        this.contextProvider = b2fVar;
        this.eventStoreProvider = b2fVar2;
        this.configProvider = b2fVar3;
        this.clockProvider = b2fVar4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(b2f<Context> b2fVar, b2f<EventStore> b2fVar2, b2f<SchedulerConfig> b2fVar3, b2f<Clock> b2fVar4) {
        return new SchedulingModule_WorkSchedulerFactory(b2fVar, b2fVar2, b2fVar3, b2fVar4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNull(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }
}
