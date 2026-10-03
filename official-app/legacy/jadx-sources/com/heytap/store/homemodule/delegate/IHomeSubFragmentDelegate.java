package com.heytap.store.homemodule.delegate;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u000eH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/homemodule/delegate/IHomeSubFragmentDelegate;", "", "delegateEnv", "Lcom/heytap/store/homemodule/delegate/DelegateEnv;", "(Lcom/heytap/store/homemodule/delegate/DelegateEnv;)V", "getDelegateEnv", "()Lcom/heytap/store/homemodule/delegate/DelegateEnv;", "delegateManagement", "Lcom/heytap/store/homemodule/delegate/DelegateManagement;", "getDelegateManagement", "()Lcom/heytap/store/homemodule/delegate/DelegateManagement;", "setDelegateManagement", "(Lcom/heytap/store/homemodule/delegate/DelegateManagement;)V", "initArgs", "", "args", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class IHomeSubFragmentDelegate {

    @NotNull
    private final DelegateEnv delegateEnv;

    @Nullable
    private DelegateManagement delegateManagement;

    public IHomeSubFragmentDelegate(@NotNull DelegateEnv delegateEnv) {
        Intrinsics.checkNotNullParameter(delegateEnv, "delegateEnv");
        this.delegateEnv = delegateEnv;
    }

    @NotNull
    public final DelegateEnv getDelegateEnv() {
        return this.delegateEnv;
    }

    @Nullable
    public final DelegateManagement getDelegateManagement() {
        return this.delegateManagement;
    }

    public abstract void initArgs(@NotNull Bundle args);

    public abstract void onDestroy();

    public abstract void onViewCreated();

    public final void setDelegateManagement(@Nullable DelegateManagement delegateManagement) {
        this.delegateManagement = delegateManagement;
    }
}
