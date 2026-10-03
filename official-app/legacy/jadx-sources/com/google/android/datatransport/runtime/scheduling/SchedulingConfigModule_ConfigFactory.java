package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final b2f<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(b2f<Clock> b2fVar) {
        this.clockProvider = b2fVar;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(b2f<Clock> b2fVar) {
        return new SchedulingConfigModule_ConfigFactory(b2fVar);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public SchedulerConfig get() {
        return config(this.clockProvider.get());
    }
}
