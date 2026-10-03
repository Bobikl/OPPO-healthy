package com.oplus.usagecalculate.utils;

import android.content.Context;
import com.oplus.aiunit.vision.e3e;
import com.oplus.aiunit.vision.lp2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "com.oplus.usagecalculate.utils.AppInstallReceiver$onReceive$1$1", f = "AppInstallReceiver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AppInstallReceiver$onReceive$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $pkgName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppInstallReceiver$onReceive$1$1(String str, Context context, Continuation<? super AppInstallReceiver$onReceive$1$1> continuation) {
        super(2, continuation);
        this.$pkgName = str;
        this.$context = context;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AppInstallReceiver$onReceive$1$1(this.$pkgName, this.$context, continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$pkgName;
        if (str != null) {
            Context context = this.$context;
            if (context == null) {
                unit = null;
            } else {
                if (e3e.h(context, str)) {
                    e3e.a(context, str);
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                lp2.c(AppInstallReceiver.TAG, "context is null!");
            }
        }
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AppInstallReceiver$onReceive$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
