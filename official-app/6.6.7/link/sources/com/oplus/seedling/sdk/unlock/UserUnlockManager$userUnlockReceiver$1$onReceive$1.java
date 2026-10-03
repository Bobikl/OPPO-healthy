package com.oplus.seedling.sdk.unlock;

import android.content.Context;
import com.oplus.seedling.sdk.SeedlingSdk;
import com.pantanal.fundation.internal.utils.STraceUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.seedling.sdk.unlock.UserUnlockManager$userUnlockReceiver$1$onReceive$1", f = "UserUnlockManager.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class UserUnlockManager$userUnlockReceiver$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.unlock.UserUnlockManager$userUnlockReceiver$1$onReceive$1$1", f = "UserUnlockManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class 1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isSupport;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(boolean z, Continuation<? super 1> continuation) {
            super(2, continuation);
            this.$isSupport = z;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new 1(this.$isSupport, continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            STraceUtils.a("panta:sdk:UserUnlockManager.notifyAllObserver");
            UserUnlockManager.INSTANCE.notifyAllObserver(this.$isSupport);
            STraceUtils.b();
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

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
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            STraceUtils.a("panta:sdk:UserUnlockManager.onReceive");
            boolean zIsSupportFluidCloud = SeedlingSdk.isSupportFluidCloud(this.$context);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            1 r3 = new 1(zIsSupportFluidCloud, null);
            this.label = 1;
            if (BuildersKt.withContext(main, r3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        UserUnlockManager.INSTANCE.release();
        STraceUtils.b();
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
