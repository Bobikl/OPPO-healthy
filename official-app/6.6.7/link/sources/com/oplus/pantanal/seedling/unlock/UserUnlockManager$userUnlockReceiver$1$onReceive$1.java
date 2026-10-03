package com.oplus.pantanal.seedling.unlock;

import android.content.Context;
import com.oplus.pantanal.seedling.util.SeedlingTool;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.oplus.pantanal.seedling.unlock.UserUnlockManager$userUnlockReceiver$1$onReceive$1", f = "UserUnlockManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UserUnlockManager$userUnlockReceiver$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserUnlockManager$userUnlockReceiver$1$onReceive$1(Context context, Continuation<? super UserUnlockManager$userUnlockReceiver$1$onReceive$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UserUnlockManager$userUnlockReceiver$1$onReceive$1(this.$context, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean zIsSupportFluidCloud = SeedlingTool.isSupportFluidCloud(this.$context);
        UserUnlockManager userUnlockManager = UserUnlockManager.INSTANCE;
        userUnlockManager.notifyAllObserver(zIsSupportFluidCloud);
        userUnlockManager.release(this.$context);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
