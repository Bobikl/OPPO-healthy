package com.oplus.pantaconnect.sdk.ext;

import java.util.function.Consumer;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
public final class CompletableFutureExt$sam$i$java_util_function_Consumer$0 implements Consumer {
    private final /* synthetic */ Function1 function;

    public CompletableFutureExt$sam$i$java_util_function_Consumer$0(Function1 function1) {
        this.function = function1;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.function.invoke(obj);
    }
}
