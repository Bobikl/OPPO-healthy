package com.heytap.health.bodyfat.viewmodel;

import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.gw1;
import com.oplus.aiunit.vision.m8b;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.bodyfat.viewmodel.BodyFatCardViewModel$fetchCardDataList$1", f = "BodyFatCardViewModel.kt", i = {0, 0, 1}, l = {46, 71}, m = "invokeSuspend", n = {BloodGlucoseWarningActivity.SSOID, "zoneId", "startTime"}, s = {"L$0", "L$1", "J$0"})
public final class BodyFatCardViewModel$fetchCardDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BodyFatCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyFatCardViewModel$fetchCardDataList$1(BodyFatCardViewModel bodyFatCardViewModel, Continuation<? super BodyFatCardViewModel$fetchCardDataList$1> continuation) {
        super(2, continuation);
        this.this$0 = bodyFatCardViewModel;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new BodyFatCardViewModel$fetchCardDataList$1(this.this$0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:25:0x0137  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x00ef, please report this as an issue */
    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ZoneId zoneIdSystemDefault;
        String str;
        long j2;
        List list;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                zoneIdSystemDefault = (ZoneId) this.L$1;
                String str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            Intrinsics.checkNotNullExpressionValue(obj, "repository.fetchLatestWe…            ).awaitOnce()");
            list = (List) obj;
            if (!list.isEmpty()) {
                WeightBodyFat weightBodyFat = (WeightBodyFat) CollectionsKt___CollectionsKt.last(list);
                StringBuilder sb = new StringBuilder();
                sb.append("lastData:");
                sb.append(weightBodyFat);
                m8b.f("BodyFatCardViewModel", "lastData time:" + weightBodyFat.getMeasurementTime());
                gw1 gw1Var = new gw1();
                gw1Var.d(this.this$0.y(j2, list));
                gw1Var.e(weightBodyFat);
                this.this$0.z().postValue(gw1Var);
            } else {
                this.this$0.z().postValue(new gw1());
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        String ssoid = cn.c().getSsoid();
        zoneIdSystemDefault = ZoneId.systemDefault();
        ddd<List<WeightBodyFat>> dddVarI = this.this$0.A().I(ssoid, System.currentTimeMillis(), 1, 1);
        Intrinsics.checkNotNullExpressionValue(dddVarI, "repository.fetchWeightBo…erType.DESC\n            )");
        this.L$0 = ssoid;
        this.L$1 = zoneIdSystemDefault;
        this.label = 1;
        Object objC = RxExtendKt.c(dddVarI, this);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = ssoid;
        obj = objC;
        Intrinsics.checkNotNullExpressionValue(obj, "repository.fetchWeightBo…            ).awaitOnce()");
        WeightBodyFat weightBodyFat2 = (WeightBodyFat) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
        if (weightBodyFat2 == null) {
            this.this$0.z().postValue(new gw1());
            return Unit.INSTANCE;
        }
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(weightBodyFat2.getMeasurementTime()), zoneIdSystemDefault).toLocalDate();
        long epochMilli = LocalDateTime.of(localDate.minusDays(6L), LocalTime.MIN).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        ddd<List<WeightBodyFat>> dddVarH = this.this$0.A().H(str, epochMilli, LocalDateTime.of(localDate, LocalTime.MAX).atZone(zoneIdSystemDefault).toInstant().toEpochMilli(), 0);
        Intrinsics.checkNotNullExpressionValue(dddVarH, "repository.fetchLatestWe…derType.ASC\n            )");
        this.L$0 = null;
        this.L$1 = null;
        this.J$0 = epochMilli;
        this.label = 2;
        obj = RxExtendKt.c(dddVarH, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        j2 = epochMilli;
        Intrinsics.checkNotNullExpressionValue(obj, "repository.fetchLatestWe…            ).awaitOnce()");
        list = (List) obj;
        if (!list.isEmpty()) {
            WeightBodyFat weightBodyFat3 = (WeightBodyFat) CollectionsKt___CollectionsKt.last(list);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lastData:");
            sb2.append(weightBodyFat3);
            m8b.f("BodyFatCardViewModel", "lastData time:" + weightBodyFat3.getMeasurementTime());
            gw1 gw1Var2 = new gw1();
            gw1Var2.d(this.this$0.y(j2, list));
            gw1Var2.e(weightBodyFat3);
            this.this$0.z().postValue(gw1Var2);
        } else {
            this.this$0.z().postValue(new gw1());
        }
        return Unit.INSTANCE;
    }

    @Override // p010kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BodyFatCardViewModel$fetchCardDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}