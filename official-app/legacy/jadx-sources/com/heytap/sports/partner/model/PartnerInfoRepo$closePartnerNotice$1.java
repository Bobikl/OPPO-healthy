package com.heytap.sports.partner.model;

import com.oplus.aiunit.vision.e9e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.sports.partner.model.PartnerInfoRepo", f = "PartnerInfoRepo.kt", i = {}, l = {58}, m = "closePartnerNotice", n = {}, s = {})
final class PartnerInfoRepo$closePartnerNotice$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e9e this$0;

    public PartnerInfoRepo$closePartnerNotice$1(e9e e9eVar, Continuation<? super PartnerInfoRepo$closePartnerNotice$1> continuation) {
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
