package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "R", "before", ParserTag.TAG_AFTER, "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", i = {}, l = {604}, m = "invokeSuspend", n = {}, s = {})
public final class SeparatorsKt$insertEventSeparators$separatorState$1<R, T> extends SuspendLambda implements Function3<T, T, Continuation<? super R>, Object> {
    final /* synthetic */ Function3<T, T, Continuation<? super R>, Object> $generator;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorsKt$insertEventSeparators$separatorState$1(Function3<? super T, ? super T, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super SeparatorsKt$insertEventSeparators$separatorState$1> continuation) {
        super(3, continuation);
        this.$generator = function3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1<R, T> for r5v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p010kotlin.ResultKt.throwOnFailure(r6)
            goto L2c
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L17:
            p010kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            java.lang.Object r1 = r5.L$1
            kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r5.$generator
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r3.invoke(r6, r1, r5)
            if (r6 != r0) goto L2c
            return r0
        L2c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p010kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@Nullable T t, @Nullable T t2, @Nullable Continuation<? super R> continuation) {
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.$generator, continuation);
        separatorsKt$insertEventSeparators$separatorState$1.L$0 = t;
        separatorsKt$insertEventSeparators$separatorState$1.L$1 = t2;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(Unit.INSTANCE);
    }
}
