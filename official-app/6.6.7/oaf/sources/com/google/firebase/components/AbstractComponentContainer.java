package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
abstract class AbstractComponentContainer implements ComponentContainer {
    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        Provider<T> provider = getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Set<T> setOf(Class<T> cls) {
        return setOfProvider(cls).get();
    }
}
