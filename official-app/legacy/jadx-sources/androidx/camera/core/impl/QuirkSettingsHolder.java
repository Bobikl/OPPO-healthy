package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.core.util.Consumer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class QuirkSettingsHolder {
    public static final QuirkSettings DEFAULT = QuirkSettings.withDefaultBehavior();
    private static final QuirkSettingsHolder sInstance = new QuirkSettingsHolder();
    private final MutableStateObservable<QuirkSettings> mObservable = MutableStateObservable.withInitialState(DEFAULT);

    public static class ObserverToConsumerAdapter<T> implements Observable.Observer<T> {
        private static final String TAG = "ObserverToConsumerAdapter";
        private final Consumer<T> mDelegate;

        public ObserverToConsumerAdapter(@NonNull Consumer<T> consumer) {
            this.mDelegate = consumer;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(@NonNull Throwable th) {
            Logger.e(TAG, "Unexpected error in Observable", th);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(@Nullable T t) {
            this.mDelegate.accept(t);
        }
    }

    @NonNull
    public static QuirkSettingsHolder instance() {
        return sInstance;
    }

    @NonNull
    public QuirkSettings get() {
        try {
            return this.mObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e2);
        }
    }

    public void observe(@NonNull Executor executor, @NonNull Consumer<QuirkSettings> consumer) {
        this.mObservable.addObserver(executor, new ObserverToConsumerAdapter(consumer));
    }

    @VisibleForTesting
    public void reset() {
        this.mObservable.removeObservers();
        this.mObservable.setState(DEFAULT);
    }

    public void set(@NonNull QuirkSettings quirkSettings) {
        this.mObservable.setState(quirkSettings);
    }
}
