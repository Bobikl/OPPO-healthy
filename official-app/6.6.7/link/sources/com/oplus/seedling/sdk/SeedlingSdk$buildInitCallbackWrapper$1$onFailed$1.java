package com.oplus.seedling.sdk;

import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.seedling.sdk.callback.InitCallback;
import com.pantanal.fundation.internal.utils.STraceUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.seedling.sdk.SeedlingSdk$buildInitCallbackWrapper$1$onFailed$1", f = "SeedlingSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SeedlingSdk$buildInitCallbackWrapper$1$onFailed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InitCallback $entranceCallBack;
    final /* synthetic */ int $errorCode;
    final /* synthetic */ String $errorMsg;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedlingSdk$buildInitCallbackWrapper$1$onFailed$1(int i, String str, InitCallback initCallback, Continuation<? super SeedlingSdk$buildInitCallbackWrapper$1$onFailed$1> continuation) {
        super(2, continuation);
        this.$errorCode = i;
        this.$errorMsg = str;
        this.$entranceCallBack = initCallback;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SeedlingSdk$buildInitCallbackWrapper$1$onFailed$1(this.$errorCode, this.$errorMsg, this.$entranceCallBack, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ht9.a.b(s8e.INSTANCE, "SeedlingSdkInterface", "notify entrance sdk init fail, pkgName:" + SeedlingSdk.INSTANCE.getEntrancePkgName$pantanal_client_release() + ", errorCode:" + this.$errorCode + ", errorMsg:" + this.$errorMsg, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        STraceUtils.a("panta:sdk:SeedlingSdk.InitCb.failed");
        this.$entranceCallBack.onFailed(this.$errorCode, this.$errorMsg);
        STraceUtils.b();
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
