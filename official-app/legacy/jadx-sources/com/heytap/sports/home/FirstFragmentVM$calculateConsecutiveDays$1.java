package com.heytap.sports.home;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.home.FirstFragmentVM", f = "FirstFragmentVM.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {89, 113}, m = "calculateConsecutiveDays", n = {"this", "today", "yesterday", "allActiveDates", "loadedMonths", "this", "allActiveDates", "loadedMonths", "currentDate", "count"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "I$0"})
public final class FirstFragmentVM$calculateConsecutiveDays$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirstFragmentVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstFragmentVM$calculateConsecutiveDays$1(FirstFragmentVM firstFragmentVM, Continuation<? super FirstFragmentVM$calculateConsecutiveDays$1> continuation) {
        super(continuation);
        this.this$0 = firstFragmentVM;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.y(null, this);
    }
}
