package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final b2f<Clock> clockProvider;
    private final b2f<EventStoreConfig> configProvider;
    private final b2f<SchemaManager> schemaManagerProvider;
    private final b2f<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(b2f<Clock> b2fVar, b2f<Clock> b2fVar2, b2f<EventStoreConfig> b2fVar3, b2f<SchemaManager> b2fVar4) {
        this.wallClockProvider = b2fVar;
        this.clockProvider = b2fVar2;
        this.configProvider = b2fVar3;
        this.schemaManagerProvider = b2fVar4;
    }

    public static SQLiteEventStore_Factory create(b2f<Clock> b2fVar, b2f<Clock> b2fVar2, b2f<EventStoreConfig> b2fVar3, b2f<SchemaManager> b2fVar4) {
        return new SQLiteEventStore_Factory(b2fVar, b2fVar2, b2fVar3, b2fVar4);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get());
    }
}
