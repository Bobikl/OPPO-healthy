package com.heytap.health.health_archives.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.health_archives.helper.PdfFileHandler", f = "PdfFileHandler.kt", i = {0, 0, 0}, l = {83}, m = "openPdfFile", n = {"this", "docId", "originalUrl"}, s = {"L$0", "L$1", "L$2"})
public final class PdfFileHandler$openPdfFile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PdfFileHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfFileHandler$openPdfFile$1(PdfFileHandler pdfFileHandler, Continuation<? super PdfFileHandler$openPdfFile$1> continuation) {
        super(continuation);
        this.this$0 = pdfFileHandler;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(null, null, this);
    }
}
