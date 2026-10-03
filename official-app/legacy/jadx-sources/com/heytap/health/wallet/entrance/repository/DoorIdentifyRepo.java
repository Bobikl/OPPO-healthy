package com.heytap.health.wallet.entrance.repository;

import com.amap.api.services.help.Tip;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.wallet.bean.CardInfo;
import com.heytap.health.wallet.bean.ProbeDataDto;
import com.heytap.health.wallet.bean.SmartSecretKey;
import com.heytap.health.wallet.entrance.ui.fragment.ErrorInfoFragment;
import com.heytap.health.wallet.network.door.params.InverseKeyParam;
import com.heytap.health.wallet.network.door.params.QueryInverseKeyParam;
import com.heytap.health.wallet.network.door.params.UploadCorrectKeyParam;
import com.heytap.health.wallet.network.door.rsp.QuerySmartKeyVo;
import com.heytap.health.wallet.network.door.rsp.SrvKeysDto;
import com.heytap.health.wallet.transmit.WearMsgProcessorKt;
import com.heytap.wallet.business.entrance.domain.req.AddressInfo;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.e7l;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.k06;
import com.oplus.aiunit.vision.smc;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.vz5;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0018\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001e\u001a\u00020\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/heytap/health/wallet/entrance/repository/DoorIdentifyRepo;", "", "", "uidStr", "Lcom/heytap/health/wallet/network/door/rsp/QuerySmartKeyVo;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", TriggerEvent.EXTRA_UID, "", "Lcom/heytap/health/wallet/bean/ProbeDataDto;", "probeData", "", "f", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/wallet/network/door/rsp/SrvKeysDto;", "keys", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/wallet/bean/SmartSecretKey;", "correctKeysFrmDev", "isSuc", "Lcom/amap/api/services/help/Tip;", "poiInfo", MapSchema.FIELD_NAME_ENTRY, "(JLjava/util/List;ZLcom/amap/api/services/help/Tip;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/wallet/bean/CardInfo;", "c", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "<init>", "()V", "Companion", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final class DoorIdentifyRepo {

    @NotNull
    public static final HashMap<Long, CardInfo> a = new HashMap<>();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/wallet/entrance/repository/DoorIdentifyRepo$b", "Lcom/oplus/aiunit/vision/ie7;", "Lcom/heytap/health/wallet/network/door/rsp/QuerySmartKeyVo;", "result", "", "d", "", "errCode", "errMsg", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ie7<QuerySmartKeyVo> {
        public final /* synthetic */ Continuation<QuerySmartKeyVo> i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Continuation<? super QuerySmartKeyVo> continuation) {
            this.i = continuation;
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NotNull String errCode, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errCode, "errCode");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            t6b.d("IdentifyRepo", "querySrvInvertible onError: " + errMsg + "[" + errCode + "]");
            Throwable th = new Throwable(ErrorInfoFragment.ERROR_TAG_NET + errMsg + "[" + errCode + "]");
            Continuation<QuerySmartKeyVo> continuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(th)));
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(@NotNull QuerySmartKeyVo result) {
            Intrinsics.checkNotNullParameter(result, "result");
            t6b.b("IdentifyRepo", "onSuccess rsp: " + result);
            this.i.resumeWith(Result.m5287constructorimpl(result));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/wallet/entrance/repository/DoorIdentifyRepo$c", "Lcom/oplus/aiunit/vision/ie7;", "", "result", "", "d", "", "errCode", "errMsg", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ie7<Boolean> {
        public final /* synthetic */ Continuation<Boolean> i;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Continuation<? super Boolean> continuation) {
            this.i = continuation;
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NotNull String errCode, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errCode, "errCode");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            t6b.d("IdentifyRepo", "uploadCorrectKeys onError: " + errMsg + "[" + errCode + "]");
            Throwable th = new Throwable(ErrorInfoFragment.ERROR_TAG_NET + errMsg + "[" + errCode + "]");
            Continuation<Boolean> continuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(th)));
        }

        @Override // com.oplus.aiunit.vision.ie7
        public /* bridge */ /* synthetic */ void c(Boolean bool) {
            d(bool.booleanValue());
        }

        public void d(boolean result) {
            t6b.b("IdentifyRepo", "uploadCorrectKeys, onSuccess rsp: " + result);
            Continuation<Boolean> continuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(Boolean.valueOf(result)));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/wallet/entrance/repository/DoorIdentifyRepo$d", "Lcom/oplus/aiunit/vision/ie7;", "", "result", "", "d", "", "errCode", "errMsg", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends ie7<Boolean> {
        public final /* synthetic */ Continuation<Boolean> i;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Continuation<? super Boolean> continuation) {
            this.i = continuation;
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NotNull String errCode, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(errCode, "errCode");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            t6b.d("IdentifyRepo", "uploadProbeData onFail: " + errMsg + "[" + errCode + "]");
            Throwable th = new Throwable(ErrorInfoFragment.ERROR_TAG_NET + errMsg + "[" + errCode + "]");
            Continuation<Boolean> continuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(th)));
        }

        @Override // com.oplus.aiunit.vision.ie7
        public /* bridge */ /* synthetic */ void c(Boolean bool) {
            d(bool.booleanValue());
        }

        public void d(boolean result) {
            t6b.b("IdentifyRepo", "onSuccess rsp: " + result);
            Continuation<Boolean> continuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(Boolean.valueOf(result)));
        }
    }

    @Nullable
    public final Object a(@NotNull List<SrvKeysDto> list, @NotNull Continuation<? super Boolean> continuation) {
        String strE = GsonUtil.e(list);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(keys)");
        return WearMsgProcessorKt.a(strE, continuation);
    }

    public final void b() {
        a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(long j2, @NotNull Continuation<? super CardInfo> continuation) {
        DoorIdentifyRepo$getCardInfo$1 doorIdentifyRepo$getCardInfo$1;
        CardInfo cardInfo;
        if (continuation instanceof DoorIdentifyRepo$getCardInfo$1) {
            doorIdentifyRepo$getCardInfo$1 = (DoorIdentifyRepo$getCardInfo$1) continuation;
            int i = doorIdentifyRepo$getCardInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                doorIdentifyRepo$getCardInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                doorIdentifyRepo$getCardInfo$1 = new DoorIdentifyRepo$getCardInfo$1(this, continuation);
            }
        } else {
            doorIdentifyRepo$getCardInfo$1 = new DoorIdentifyRepo$getCardInfo$1(this, continuation);
        }
        Object objD = doorIdentifyRepo$getCardInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = doorIdentifyRepo$getCardInfo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objD);
            cardInfo = a.get(Boxing.boxLong(j2));
            if (cardInfo == null) {
                t6b.i("IdentifyRepo", "no card info cached!");
                doorIdentifyRepo$getCardInfo$1.J$0 = j2;
                doorIdentifyRepo$getCardInfo$1.label = 1;
                objD = WearMsgProcessorKt.d(doorIdentifyRepo$getCardInfo$1);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return cardInfo;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = doorIdentifyRepo$getCardInfo$1.J$0;
        ResultKt.throwOnFailure(objD);
        cardInfo = (CardInfo) objD;
        if (cardInfo != null) {
            a.put(Boxing.boxLong(j2), cardInfo);
        }
        return cardInfo;
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull Continuation<? super QuerySmartKeyVo> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        ((k06) e7l.INSTANCE.a(k06.class)).c(new QueryInverseKeyParam(aec.o(), str)).L0(su8.c()).n0(f30.c()).subscribe(new b(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public final Object e(long j2, @Nullable List<SmartSecretKey> list, boolean z, @Nullable Tip tip, @NotNull Continuation<? super Boolean> continuation) throws Exception {
        UploadCorrectKeyParam uploadCorrectKeyParam;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (tip == null) {
            t6b.b("IdentifyRepo", "uploadCorrectKeys, uid str: " + vz5.a(j2, 16, 8));
            uploadCorrectKeyParam = new UploadCorrectKeyParam(vz5.a(j2, 16, 8), list, z);
        } else {
            String strE = GsonUtil.e(new AddressInfo(String.valueOf(tip.getPoint().getLongitude()), String.valueOf(tip.getPoint().getLatitude()), tip.getName(), ""));
            t6b.b("IdentifyRepo", "addressInfo toJson: " + strE);
            String strE2 = smc.e(aec.o());
            String strO = aec.o();
            Intrinsics.checkNotNullExpressionValue(strO, "getcplc()");
            String strSubstring = strO.substring(52, 68);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            uploadCorrectKeyParam = new UploadCorrectKeyParam(vz5.a(j2, 16, 8), list, z, smc.c(strE, strE2, strSubstring));
        }
        c cVar = new c(safeContinuation);
        uploadCorrectKeyParam.setCplc(aec.o());
        ((k06) e7l.INSTANCE.a(k06.class)).o(uploadCorrectKeyParam).L0(su8.c()).n0(f30.c()).subscribe(cVar);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public final Object f(long j2, @Nullable List<? extends ProbeDataDto> list, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        List<? extends ProbeDataDto> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m5287constructorimpl(Boxing.boxBoolean(true)));
        }
        ((k06) e7l.INSTANCE.a(k06.class)).g(new InverseKeyParam(Boxing.boxLong(j2), list, aec.o())).L0(su8.c()).n0(f30.c()).subscribe(new d(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
