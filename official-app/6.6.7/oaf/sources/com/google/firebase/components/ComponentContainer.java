package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface ComponentContainer {
    <T> T get(Class<T> cls);

    <T> Deferred<T> getDeferred(Class<T> cls);

    <T> Provider<T> getProvider(Class<T> cls);

    <T> Set<T> setOf(Class<T> cls);

    <T> Provider<Set<T>> setOfProvider(Class<T> cls);
}
