package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    public static final class InstanceHolder {
        private static final EventStoreModule_StoreConfigFactory INSTANCE = new EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventStoreConfig storeConfig() {
        return (EventStoreConfig) Preconditions.checkNotNull(EventStoreModule.storeConfig(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public EventStoreConfig get() {
        return storeConfig();
    }
}
