package com.oplus.seedling.sdk.task;

import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/seedling/sdk/task/SeedlingTaskCompatibleImpl;", "Lcom/oplus/seedling/sdk/task/ISeedlingTask;", "()V", "cancel", "", "defaultLog", "", "methodName", "", "getStatus", "", "getTaskName", "isCanceled", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SeedlingTaskCompatibleImpl implements ISeedlingTask {

    @NotNull
    private static final String TAG = "SeedlingTaskCompatibleImpl";

    private final void defaultLog(String methodName) {
        bs9.a.e(t6e.INSTANCE, TAG, "warning, default impl! maybe version is not compatible, methodName:" + methodName, false, null, false, 0, false, null, 252, null);
    }

    @Override // com.oplus.seedling.sdk.task.ISeedlingTask
    public boolean cancel() {
        defaultLog("cancel");
        return false;
    }

    @Override // com.oplus.seedling.sdk.task.ISeedlingTask
    @NotNull
    public Object getStatus() {
        defaultLog("getStatus");
        return new Object();
    }

    @Override // com.oplus.seedling.sdk.task.ISeedlingTask
    @NotNull
    public Object getTaskName() {
        defaultLog("getTaskName");
        return new Object();
    }

    @Override // com.oplus.seedling.sdk.task.ISeedlingTask
    public boolean isCanceled() {
        defaultLog("isCanceled");
        return false;
    }
}
