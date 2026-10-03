package com.heytap.health.esim.nsc.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource;
import com.heytap.health.esim.nsc.utils.NSCHelper;
import com.oplus.aiunit.vision.AcInfo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.hgl;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ(\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014R\u001c\u0010\u001c\u001a\u00020\u00028\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u00020\u00028\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\"\u001a\u00020\u00028\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/RedteaRepo;", "", "", "eid", "imei", "mac", "Lcom/oplus/aiunit/vision/fa;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "retry", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "runnable", "", "d", "", "Lcom/oplus/aiunit/vision/hgl;", "simInfos", "Lkotlin/Function1;", "", "result", "a", "getAc", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "ac", "getCc", b2n.f, "cc", "getIccid", b2n.g, "iccid", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RedteaRepo {
    public static final int $stable = 8;
    public final /* synthetic */ RedteaSp a = new RedteaSp();

    public final void a(@NotNull List<hgl> simInfos, @NotNull Function1<? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(simInfos, "simInfos");
        Intrinsics.checkNotNullParameter(result, "result");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b("NetWorkDel")), null, null, new RedteaRepo$checkNetworkProfile$1(simInfos, result, null), 3, null);
    }

    @Nullable
    public final Object b(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Continuation<? super AcInfo> continuation) {
        return NSCHelper.INSTANCE.e(i, new RedteaRepo$confirmAndCacheAcInfo$2(this, str, str2, str3, null), continuation);
    }

    public final void d(@NotNull String mac, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b("NetWorkDel")), null, null, new RedteaRepo$delNetWorkServiceOnUnpair$1(mac, runnable, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super AcInfo> continuation) {
        RedteaRepo$getAndCacheAcInfo$1 redteaRepo$getAndCacheAcInfo$1;
        if (continuation instanceof RedteaRepo$getAndCacheAcInfo$1) {
            redteaRepo$getAndCacheAcInfo$1 = (RedteaRepo$getAndCacheAcInfo$1) continuation;
            int i = redteaRepo$getAndCacheAcInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                redteaRepo$getAndCacheAcInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                redteaRepo$getAndCacheAcInfo$1 = new RedteaRepo$getAndCacheAcInfo$1(this, continuation);
            }
        } else {
            redteaRepo$getAndCacheAcInfo$1 = new RedteaRepo$getAndCacheAcInfo$1(this, continuation);
        }
        Object objF = redteaRepo$getAndCacheAcInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = redteaRepo$getAndCacheAcInfo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objF);
            NetWorkServiceNetSource netWorkServiceNetSource = NetWorkServiceNetSource.INSTANCE;
            redteaRepo$getAndCacheAcInfo$1.L$0 = this;
            redteaRepo$getAndCacheAcInfo$1.label = 1;
            objF = netWorkServiceNetSource.f(str3, str2, str, redteaRepo$getAndCacheAcInfo$1);
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (RedteaRepo) redteaRepo$getAndCacheAcInfo$1.L$0;
            ResultKt.throwOnFailure(objF);
        }
        AcInfo acInfo = (AcInfo) objF;
        this.h(acInfo.getIccid());
        this.f(acInfo.getAc());
        this.g(acInfo.getCc());
        return objF;
    }

    public void f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a.k(str);
    }

    public void g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a.l(str);
    }

    public void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a.p(str);
    }
}
