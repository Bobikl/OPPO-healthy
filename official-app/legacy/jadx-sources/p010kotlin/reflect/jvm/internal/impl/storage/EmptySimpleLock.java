package p010kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class EmptySimpleLock implements SimpleLock {

    @NotNull
    public static final EmptySimpleLock INSTANCE = new EmptySimpleLock();

    private EmptySimpleLock() {
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }
}
