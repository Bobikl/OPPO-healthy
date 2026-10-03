package com.heytap.sports.track.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.track.data.TraceStyle", f = "StyleConfig.kt", i = {}, l = {217}, m = "finishBitmap", n = {}, s = {})
public final class TraceStyle$finishBitmap$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TraceStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraceStyle$finishBitmap$1(TraceStyle traceStyle, Continuation<? super TraceStyle$finishBitmap$1> continuation) {
        super(continuation);
        this.this$0 = traceStyle;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
