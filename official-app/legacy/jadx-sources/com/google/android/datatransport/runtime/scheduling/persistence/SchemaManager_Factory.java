package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final b2f<Context> contextProvider;
    private final b2f<String> dbNameProvider;
    private final b2f<Integer> schemaVersionProvider;

    public SchemaManager_Factory(b2f<Context> b2fVar, b2f<String> b2fVar2, b2f<Integer> b2fVar3) {
        this.contextProvider = b2fVar;
        this.dbNameProvider = b2fVar2;
        this.schemaVersionProvider = b2fVar3;
    }

    public static SchemaManager_Factory create(b2f<Context> b2fVar, b2f<String> b2fVar2, b2f<Integer> b2fVar3) {
        return new SchemaManager_Factory(b2fVar, b2fVar2, b2fVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
