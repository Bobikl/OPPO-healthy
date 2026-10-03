package p010kotlin.reflect.jvm.internal.impl.storage;

import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public interface MemoizedFunctionToNullable<P, R> extends Function1<P, R> {
    boolean isComputed(P p);
}
