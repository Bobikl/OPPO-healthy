package androidx.paging;

import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", f = "FlowExt.kt", i = {}, l = {149, 152}, m = "emit", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1\n*L\n1#1,224:1\n*E\n"})
public final class FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt$combineWithoutBatching$2$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(FlowExtKt$combineWithoutBatching$2$1$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 for r1v2 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r1 = r2.emit(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
