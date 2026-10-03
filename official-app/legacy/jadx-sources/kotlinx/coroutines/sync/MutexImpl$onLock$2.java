package kotlinx.coroutines.sync;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements Function3<MutexImpl, Object, Object, Object> {
    public static final MutexImpl$onLock$2 INSTANCE = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, MutexImpl.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull MutexImpl mutexImpl, @Nullable Object obj, @Nullable Object obj2) {
        return mutexImpl.onLockProcessResult(obj, obj2);
    }
}
