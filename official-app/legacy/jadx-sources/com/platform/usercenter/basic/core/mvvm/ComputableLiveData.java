package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ComputableLiveData<T> {
    final AtomicBoolean mComputing;
    final Executor mExecutor;
    final AtomicBoolean mInvalid;

    @VisibleForTesting
    final Runnable mInvalidationRunnable;
    final MutableLiveData<T> mLiveData;

    @VisibleForTesting
    final Runnable mRefreshRunnable;

    public ComputableLiveData() {
        this(AppExecutors.getInstance().diskIO());
    }

    @WorkerThread
    public abstract T compute();

    @NonNull
    public LiveData<T> getLiveData() {
        return this.mLiveData;
    }

    public void invalidate() {
        AppExecutors.getInstance().mainThread().execute(this.mInvalidationRunnable);
    }

    public ComputableLiveData(@NonNull Executor executor) {
        this.mInvalid = new AtomicBoolean(true);
        this.mComputing = new AtomicBoolean(false);
        this.mRefreshRunnable = new Runnable() { // from class: com.platform.usercenter.basic.core.mvvm.ComputableLiveData.2
            @Override // java.lang.Runnable
            @WorkerThread
            public void run() {
                do {
                    boolean z = false;
                    if (ComputableLiveData.this.mComputing.compareAndSet(false, true)) {
                        Object objCompute = null;
                        boolean z2 = false;
                        while (ComputableLiveData.this.mInvalid.compareAndSet(true, false)) {
                            try {
                                objCompute = ComputableLiveData.this.compute();
                                z2 = true;
                            } catch (Throwable th) {
                                ComputableLiveData.this.mComputing.set(false);
                                throw th;
                            }
                        }
                        if (z2) {
                            ComputableLiveData.this.mLiveData.postValue((T) objCompute);
                        }
                        ComputableLiveData.this.mComputing.set(false);
                        z = z2;
                    }
                    if (!z) {
                        return;
                    }
                } while (ComputableLiveData.this.mInvalid.get());
            }
        };
        this.mInvalidationRunnable = new Runnable() { // from class: com.platform.usercenter.basic.core.mvvm.ComputableLiveData.3
            @Override // java.lang.Runnable
            @MainThread
            public void run() {
                boolean zHasActiveObservers = ComputableLiveData.this.mLiveData.hasActiveObservers();
                if (ComputableLiveData.this.mInvalid.compareAndSet(false, true) && zHasActiveObservers) {
                    ComputableLiveData computableLiveData = ComputableLiveData.this;
                    computableLiveData.mExecutor.execute(computableLiveData.mRefreshRunnable);
                }
            }
        };
        this.mExecutor = executor;
        this.mLiveData = new MutableLiveData<T>() { // from class: com.platform.usercenter.basic.core.mvvm.ComputableLiveData.1
            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                ComputableLiveData computableLiveData = ComputableLiveData.this;
                computableLiveData.mExecutor.execute(computableLiveData.mRefreshRunnable);
            }
        };
    }
}
