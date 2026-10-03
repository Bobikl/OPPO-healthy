package com.heytap.sporthealth.blib.compose.modifier;

import com.garmin.fit.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sporthealth.blib.compose.modifier.OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1", f = "OverScrollModifier.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {e.TotalFractionalDescentFieldNum, 160, 173}, m = "onPreFling-QWom1Mo", n = {"this", "available", "this", "available", "leftVelocity", "available", "parentConsumed"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "J$1"})
public final class OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1(OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1 overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1, Continuation<? super OverScrollModifierKt$overScrollVertical$2$nestedConnection$1$1$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = overScrollModifierKt$overScrollVertical$2$nestedConnection$1$1;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo490onPreFlingQWom1Mo(0L, this);
    }
}
