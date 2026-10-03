package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final b2f<Context> applicationContextProvider;
    private final b2f<Clock> monotonicClockProvider;
    private final b2f<Clock> wallClockProvider;

    public CreationContextFactory_Factory(b2f<Context> b2fVar, b2f<Clock> b2fVar2, b2f<Clock> b2fVar3) {
        this.applicationContextProvider = b2fVar;
        this.wallClockProvider = b2fVar2;
        this.monotonicClockProvider = b2fVar3;
    }

    public static CreationContextFactory_Factory create(b2f<Context> b2fVar, b2f<Clock> b2fVar2, b2f<Clock> b2fVar3) {
        return new CreationContextFactory_Factory(b2fVar, b2fVar2, b2fVar3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }
}
