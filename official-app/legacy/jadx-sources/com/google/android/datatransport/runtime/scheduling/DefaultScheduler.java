package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class DefaultScheduler implements Scheduler {
    private static final Logger LOGGER = Logger.getLogger(TransportRuntime.class.getName());
    private final BackendRegistry backendRegistry;
    private final EventStore eventStore;
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler workScheduler;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    public static /* synthetic */ Object lambda$schedule$0(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        defaultScheduler.eventStore.persist(transportContext, eventInternal);
        defaultScheduler.workScheduler.schedule(transportContext, 1);
        return null;
    }

    public static /* synthetic */ void lambda$schedule$1(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = defaultScheduler.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend != null) {
                defaultScheduler.guard.runCriticalSection(DefaultScheduler$$Lambda$2.lambdaFactory$(defaultScheduler, transportContext, transportBackend.decorate(eventInternal)));
                transportScheduleCallback.onSchedule(null);
            } else {
                String str = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                LOGGER.warning(str);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(str));
            }
        } catch (Exception e2) {
            LOGGER.warning("Error scheduling event " + e2.getMessage());
            transportScheduleCallback.onSchedule(e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
    }
}
