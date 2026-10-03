package com.heytap.health.settings.me.settings2.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.oplus.aiunit.vision.av1;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/heytap/health/settings/me/settings2/viewmodel/NetWorkServiceSupportCheckerNetSource;", "", "params", "", "a", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NetWorkServiceSupportCheckerNetSource {
    public static final int $stable = 0;

    @NotNull
    public static final NetWorkServiceSupportCheckerNetSource INSTANCE = new NetWorkServiceSupportCheckerNetSource();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@av1 @Nullable Object obj, @NotNull Continuation<? super List<Object>> continuation) {
        NetWorkServiceSupportCheckerNetSource$queryUserComboList$1 netWorkServiceSupportCheckerNetSource$queryUserComboList$1;
        if (continuation instanceof NetWorkServiceSupportCheckerNetSource$queryUserComboList$1) {
            netWorkServiceSupportCheckerNetSource$queryUserComboList$1 = (NetWorkServiceSupportCheckerNetSource$queryUserComboList$1) continuation;
            int i = netWorkServiceSupportCheckerNetSource$queryUserComboList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netWorkServiceSupportCheckerNetSource$queryUserComboList$1.label = i - Integer.MIN_VALUE;
            } else {
                netWorkServiceSupportCheckerNetSource$queryUserComboList$1 = new NetWorkServiceSupportCheckerNetSource$queryUserComboList$1(this, continuation);
            }
        } else {
            netWorkServiceSupportCheckerNetSource$queryUserComboList$1 = new NetWorkServiceSupportCheckerNetSource$queryUserComboList$1(this, continuation);
        }
        Object objA = netWorkServiceSupportCheckerNetSource$queryUserComboList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = netWorkServiceSupportCheckerNetSource$queryUserComboList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            a aVar = (a) com.heytap.health.network.core.a.l(a.class);
            netWorkServiceSupportCheckerNetSource$queryUserComboList$1.label = 1;
            objA = aVar.a(obj, netWorkServiceSupportCheckerNetSource$queryUserComboList$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        NetResult netResult = (NetResult) objA;
        if (netResult.isSucceed()) {
            List list = (List) netResult.body;
            return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
        }
        throw new NetDataErrorException(netResult.errorCode, "queryUserComboList=>" + netResult.message);
    }
}
