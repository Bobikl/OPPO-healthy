package com.heytap.health.devicelog.feedback;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.devicelog.feedback.UploadFileOcloud", f = "LogGetInterceptors.kt", i = {1, 1, 1}, l = {281, 315, 327}, m = "intercept", n = {"chain", "request", "toUploadFiles"}, s = {"L$0", "L$1", "L$2"})
public final class UploadFileOcloud$intercept$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadFileOcloud this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileOcloud$intercept$1(UploadFileOcloud uploadFileOcloud, Continuation<? super UploadFileOcloud$intercept$1> continuation) {
        super(continuation);
        this.this$0 = uploadFileOcloud;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
