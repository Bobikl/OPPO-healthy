package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final b2f<Context> applicationContextProvider;
    private final b2f<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(b2f<Context> b2fVar, b2f<CreationContextFactory> b2fVar2) {
        this.applicationContextProvider = b2fVar;
        this.creationContextFactoryProvider = b2fVar2;
    }

    public static MetadataBackendRegistry_Factory create(b2f<Context> b2fVar, b2f<CreationContextFactory> b2fVar2) {
        return new MetadataBackendRegistry_Factory(b2fVar, b2fVar2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.oplus.aiunit.vision.b2f
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
