package com.heytap.sports.partner.model;

import com.oplus.aiunit.vision.imi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.partner.model.StatRepo", f = "StatRepo.kt", i = {}, l = {25}, m = "queryUserTaskStatList", n = {}, s = {})
final class StatRepo$queryUserTaskStatList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ imi this$0;

    public StatRepo$queryUserTaskStatList$1(imi imiVar, Continuation<? super StatRepo$queryUserTaskStatList$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
