package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    public static final class InstanceHolder {
        private static final TimeModule_UptimeClockFactory INSTANCE = new TimeModule_UptimeClockFactory();

        private InstanceHolder() {
        }
    }

    public static TimeModule_UptimeClockFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.uptimeClock(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public Clock get() {
        return uptimeClock();
    }
}
