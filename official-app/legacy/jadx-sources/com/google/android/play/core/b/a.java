package com.google.android.play.core.b;

import androidx.annotation.NonNull;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallException;
import com.oplus.oms.split.full.core.tasks.OplusRuntimeExecutionException;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    @NonNull
    public static Exception a(@NonNull Exception exc) {
        return exc instanceof OplusSplitInstallException ? new SplitInstallException(((OplusSplitInstallException) exc).getErrorCode()) : exc;
    }

    @NonNull
    public static RuntimeException a(@NonNull RuntimeException runtimeException) {
        return runtimeException instanceof OplusRuntimeExecutionException ? new RuntimeExecutionException(runtimeException.getCause()) : runtimeException;
    }
}
