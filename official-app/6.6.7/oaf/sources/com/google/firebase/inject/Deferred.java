package com.google.firebase.inject;

import androidx.annotation.NonNull;
import com.google.firebase.annotations.DeferredApi;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface Deferred<T> {

    public interface DeferredHandler<T> {
        @DeferredApi
        void handle(Provider<T> provider);
    }

    void whenAvailable(@NonNull DeferredHandler<T> deferredHandler);
}
