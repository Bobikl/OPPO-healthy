package com.oplus.pantanal.seedling.event;

import com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/pantanal/seedling/event/BaseEventProcessor;", "Lcom/oplus/pantanal/seedling/event/ISeedlingEventProcessor;", "()V", "mLifecycleList", "", "Lcom/oplus/pantanal/seedling/lifecycle/ISeedlingCardLifecycle;", "getMLifecycleList", "()Ljava/util/List;", "clear", "", "register", "lifecycle", "unregister", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseEventProcessor implements ISeedlingEventProcessor {

    @NotNull
    private final List<ISeedlingCardLifecycle> mLifecycleList = new ArrayList();

    public final void clear() {
        this.mLifecycleList.clear();
    }

    @NotNull
    public final List<ISeedlingCardLifecycle> getMLifecycleList() {
        return this.mLifecycleList;
    }

    public final void register(@NotNull ISeedlingCardLifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.mLifecycleList.add(lifecycle);
    }

    public final void unregister(@NotNull ISeedlingCardLifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.mLifecycleList.remove(lifecycle);
    }
}
