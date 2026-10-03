package com.heytap.sports.record.details.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.network.core.a;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sports.record.details.bean.SwimNationalStandardImgBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cki;
import com.oplus.aiunit.vision.j70;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/heytap/sports/record/details/model/NetworkRepository;", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/cki;", "kotlin.jvm.PlatformType", "Lcom/oplus/aiunit/vision/cki;", "mDataSource", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NetworkRepository {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final cki mDataSource = (cki) a.j(cki.class);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object a(@NotNull Continuation<? super String> continuation) {
        NetworkRepository$getNationalStandardImgConfig$1 networkRepository$getNationalStandardImgConfig$1;
        if (continuation instanceof NetworkRepository$getNationalStandardImgConfig$1) {
            networkRepository$getNationalStandardImgConfig$1 = (NetworkRepository$getNationalStandardImgConfig$1) continuation;
            int i = networkRepository$getNationalStandardImgConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                networkRepository$getNationalStandardImgConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                networkRepository$getNationalStandardImgConfig$1 = new NetworkRepository$getNationalStandardImgConfig$1(this, continuation);
            }
        } else {
            networkRepository$getNationalStandardImgConfig$1 = new NetworkRepository$getNationalStandardImgConfig$1(this, continuation);
        }
        Object objB = networkRepository$getNationalStandardImgConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = networkRepository$getNationalStandardImgConfig$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            cki ckiVar = this.mDataSource;
            Map<String, String> mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.to("switchType", j70.SWIM_NATIONAL_STANDARD_IMG));
            networkRepository$getNationalStandardImgConfig$1.label = 1;
            objB = ckiVar.b(mapMapOf, networkRepository$getNationalStandardImgConfig$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        NetResult netResult = (NetResult) objB;
        a7b.f("NetworkRepository", "getNationalStandardImgConfig:" + netResult.errorCode + " " + netResult.body);
        SwimNationalStandardImgBean swimNationalStandardImgBean = (SwimNationalStandardImgBean) GsonUtil.a(((cki.NetConfig) netResult.body).getData(), SwimNationalStandardImgBean.class);
        if (swimNationalStandardImgBean != null) {
            return swimNationalStandardImgBean.getImg();
        }
        return null;
    }
}
