package com.oplus.pantanal.seedling.observer;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J\u0006\u0010\b\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/pantanal/seedling/observer/BaseSeedlingCardObserver;", "Lcom/oplus/pantanal/seedling/observer/ISeedlingCardObserver;", "()V", "mObserverList", "", "addObserver", "", "observer", "clear", "getObserverList", "removeObserver", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseSeedlingCardObserver implements ISeedlingCardObserver {

    @NotNull
    private final List<ISeedlingCardObserver> mObserverList = new ArrayList();

    public final void addObserver(@NotNull ISeedlingCardObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mObserverList.add(observer);
    }

    public final void clear() {
        this.mObserverList.clear();
    }

    @NotNull
    public final List<ISeedlingCardObserver> getObserverList() {
        return this.mObserverList;
    }

    public final void removeObserver(@NotNull ISeedlingCardObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.mObserverList.remove(observer);
    }
}
