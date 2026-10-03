package com.heytap.health.base.sp;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.base.sp.MultiProgressDataStoreRepository$runBlockingInner$2", f = "MultiProgressDataStoreRepository.kt", i = {}, l = {654}, m = "invokeSuspend", n = {}, s = {})
public final class MultiProgressDataStoreRepository$runBlockingInner$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ Object $lock;
    final /* synthetic */ Ref.ObjectRef<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiProgressDataStoreRepository$runBlockingInner$2(Ref.ObjectRef<T> objectRef, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Object obj, Continuation<? super MultiProgressDataStoreRepository$runBlockingInner$2> continuation) {
        super(2, continuation);
        this.$result = objectRef;
        this.$block = function2;
        this.$lock = obj;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MultiProgressDataStoreRepository$runBlockingInner$2 multiProgressDataStoreRepository$runBlockingInner$2 = new MultiProgressDataStoreRepository$runBlockingInner$2(this.$result, this.$block, this.$lock, continuation);
        multiProgressDataStoreRepository$runBlockingInner$2.L$0 = obj;
        return multiProgressDataStoreRepository$runBlockingInner$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.heytap.health.base.sp.MultiProgressDataStoreRepository$runBlockingInner$2 for r4v7 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p010kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r4.L$0
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            p010kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L5b
            goto L39
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L1b:
            p010kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            java.lang.String r1 = "DataStoreRepository"
            java.lang.String r3 = "block executing"
            com.oplus.aiunit.vision.a7b.f(r1, r3)
            kotlin.jvm.internal.Ref$ObjectRef<T> r1 = r4.$result     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r3 = r4.$block     // Catch: java.lang.Throwable -> L5b
            r4.L$0 = r1     // Catch: java.lang.Throwable -> L5b
            r4.label = r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r3.invoke(r5, r4)     // Catch: java.lang.Throwable -> L5b
            if (r5 != r0) goto L38
            return r0
        L38:
            r0 = r1
        L39:
            r0.element = r5     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r4.$lock
            monitor-enter(r5)
            r5.notifyAll()     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r0 = p010kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)
            kotlin.jvm.internal.Ref$ObjectRef<T> r4 = r4.$result
            T r4 = r4.element
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "coroutineScope result "
            r5.append(r0)
            r5.append(r4)
            kotlin.Unit r4 = p010kotlin.Unit.INSTANCE
            return r4
        L58:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L5b:
            r5 = move-exception
            java.lang.Object r4 = r4.$lock
            monitor-enter(r4)
            r4.notifyAll()     // Catch: java.lang.Throwable -> L66
            kotlin.Unit r0 = p010kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L66
            monitor-exit(r4)
            throw r5
        L66:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.base.sp.MultiProgressDataStoreRepository$runBlockingInner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MultiProgressDataStoreRepository$runBlockingInner$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
