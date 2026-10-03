package androidx.concurrent.futures;

import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.SuspendFunction;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SuspendToFutureAdapter$launchFuture$1$1<T> extends FunctionReferenceImpl implements Function1<Continuation<? super T>, Object>, SuspendFunction {
    public SuspendToFutureAdapter$launchFuture$1$1(Object obj) {
        super(1, obj, Deferred.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@NotNull Continuation<? super T> continuation) {
        return ((Deferred) this.receiver).await(continuation);
    }
}
