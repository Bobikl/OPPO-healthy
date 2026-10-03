package com.heytap.health.core.provider.model;

import com.heytap.health.core.provider.adapter.open.StepCheckinAdapter;
import com.heytap.health.core.provider.bean.StepCheckDetailsBean;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.log.util.DateUtil;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.toi;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.HashMap;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/core/provider/model/StepCheckinModel;", "", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/core/provider/bean/StepCheckDetailsBean;", "detailsBean", "", "b", "", ClickApiEntity.TIME, "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "Companion", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class StepCheckinModel {

    @NotNull
    public static final DateTimeFormatter b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "StepCheckinModel";

    static {
        DateTimeFormatter dateTimeFormatterWithDecimalStyle = DateTimeFormatter.ofPattern(DateUtil.DATEFORMATMONTH, Locale.US).withDecimalStyle(DecimalStyle.STANDARD);
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterWithDecimalStyle, "ofPattern(\"yyyy-MM\", Loc…le(DecimalStyle.STANDARD)");
        b = dateTimeFormatterWithDecimalStyle;
    }

    public final String a(long time) {
        String str = Instant.ofEpochMilli(time).atZone(ZoneId.systemDefault()).toLocalDate().format(b);
        Intrinsics.checkNotNullExpressionValue(str, "ofEpochMilli(time)\n     …at(QUERY_MONTH_FORMATTER)");
        return str;
    }

    public final boolean b(StepCheckDetailsBean detailsBean) {
        if (detailsBean != null && detailsBean.getCheckInDates() != null) {
            LocalDate localDateNow = LocalDate.now();
            long[] checkInDates = detailsBean.getCheckInDates();
            Intrinsics.checkNotNullExpressionValue(checkInDates, "detailsBean.checkInDates");
            for (long j2 : checkInDates) {
                if (Intrinsics.areEqual(Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).toLocalDate(), localDateNow)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull Continuation<? super String> continuation) {
        StepCheckinModel$stepCheckin$1 stepCheckinModel$stepCheckin$1;
        if (continuation instanceof StepCheckinModel$stepCheckin$1) {
            stepCheckinModel$stepCheckin$1 = (StepCheckinModel$stepCheckin$1) continuation;
            int i = stepCheckinModel$stepCheckin$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepCheckinModel$stepCheckin$1.label = i - Integer.MIN_VALUE;
            } else {
                stepCheckinModel$stepCheckin$1 = new StepCheckinModel$stepCheckin$1(this, continuation);
            }
        } else {
            stepCheckinModel$stepCheckin$1 = new StepCheckinModel$stepCheckin$1(this, continuation);
        }
        Object objA = stepCheckinModel$stepCheckin$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepCheckinModel$stepCheckin$1.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            HashMap<String, Object> map = new HashMap<>();
            map.put("queryMonth", a(System.currentTimeMillis()));
            map.put("checkInType", Boxing.boxInt(1));
            toi toiVar = (toi) com.heytap.health.network.core.a.j(toi.class);
            stepCheckinModel$stepCheckin$1.L$0 = this;
            stepCheckinModel$stepCheckin$1.label = 1;
            objA = toiVar.a(map, stepCheckinModel$stepCheckin$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (StepCheckinModel) stepCheckinModel$stepCheckin$1.L$0;
            ResultKt.throwOnFailure(objA);
        }
        BaseResponse baseResponse = (BaseResponse) objA;
        a7b.f(this.TAG, " stepCardDetailsBean = " + baseResponse);
        if (!baseResponse.isSuccess() || baseResponse.getBody() == null) {
            String strG = sc8.g(new StepCheckinAdapter.StepCheckinData(false, i3, null));
            Intrinsics.checkNotNullExpressionValue(strG, "toJson(StepCheckinAdapter.StepCheckinData())");
            return strG;
        }
        String stepCheckinResult = sc8.g(new StepCheckinAdapter.StepCheckinData(this.b((StepCheckDetailsBean) baseResponse.getBody())));
        a7b.f(this.TAG, " isTodayCheckedIn  = " + stepCheckinResult);
        Intrinsics.checkNotNullExpressionValue(stepCheckinResult, "stepCheckinResult");
        return stepCheckinResult;
    }
}
