package com.oplus.accountsdk.open.callback;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AcOpenSingleResultReceiver extends ResultReceiver {
    private final Executor callbackExecutor;

    public AcOpenSingleResultReceiver(@NonNull Context context) {
        super(null);
        this.callbackExecutor = ContextCompat.getMainExecutor(context.getApplicationContext());
    }

    @NonNull
    public abstract String getLogTag();

    @Nullable
    public abstract Runnable handleResultOnce(int i, Bundle bundle);

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        Runnable runnableHandleResultOnce = handleResultOnce(i, bundle);
        if (runnableHandleResultOnce != null) {
            this.callbackExecutor.execute(runnableHandleResultOnce);
        }
    }
}
