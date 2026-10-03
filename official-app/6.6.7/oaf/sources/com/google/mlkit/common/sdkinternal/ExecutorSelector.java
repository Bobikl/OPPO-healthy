package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@KeepForSdk
public class ExecutorSelector {
    private final Provider zza;

    public ExecutorSelector(@NonNull Provider provider) {
        this.zza = provider;
    }

    @NonNull
    @KeepForSdk
    public Executor getExecutorToUse(@Nullable Executor executor) {
        return executor != null ? executor : (Executor) this.zza.get();
    }
}
