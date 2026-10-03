package com.heytap.health.health_archives.helper;

import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.health_archives.helper.PdfFileHandler", f = "PdfFileHandler.kt", i = {0, 0, 0, 1, 1}, l = {FitnessProto$FitnessCmdId.CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME_VALUE, 200}, m = "validatePdfFile", n = {"this", "originalUrl", "localPath", "localPath", "localValid"}, s = {"L$0", "L$1", "L$2", "L$0", "I$0"})
public final class PdfFileHandler$validatePdfFile$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PdfFileHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfFileHandler$validatePdfFile$1(PdfFileHandler pdfFileHandler, Continuation<? super PdfFileHandler$validatePdfFile$1> continuation) {
        super(continuation);
        this.this$0 = pdfFileHandler;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(null, null, this);
    }
}
