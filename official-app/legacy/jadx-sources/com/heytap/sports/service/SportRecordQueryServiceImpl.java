package com.heytap.sports.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.sport.ISportRecordQueryService;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.sports.record.list.helper.DataHelper;
import com.heytap.sports.record.list.model.SportRecordListRepository;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/sports/SportRecordQueryService")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016Je\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016JI\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/heytap/sports/service/SportRecordQueryServiceImpl;", "Lcom/heytap/health/sport/ISportRecordQueryService;", "Landroid/content/Context;", "context", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "record", "Lkotlin/Pair;", "", "", "p1", "data", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "valueStr", "", "value", "formatString", "", "callback", "e3", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "r8", "trainType", "", "startTime", "endTime", "sortOrder", "anchor", "count", "", "a0", "(IJJIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "Lcom/heytap/sports/record/list/model/SportRecordListRepository;", "i", "Lcom/heytap/sports/record/list/model/SportRecordListRepository;", "repository", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SportRecordQueryServiceImpl implements ISportRecordQueryService {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final SportRecordListRepository repository = new SportRecordListRepository();

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.heytap.health.sport.ISportRecordQueryService
    @Nullable
    public Object a0(int i, long j2, long j3, int i2, int i3, int i4, @NotNull Continuation<? super List<? extends TrackMetadataStat>> continuation) {
        SportRecordQueryServiceImpl$findHistoryRecords$1 sportRecordQueryServiceImpl$findHistoryRecords$1;
        if (continuation instanceof SportRecordQueryServiceImpl$findHistoryRecords$1) {
            sportRecordQueryServiceImpl$findHistoryRecords$1 = (SportRecordQueryServiceImpl$findHistoryRecords$1) continuation;
            int i5 = sportRecordQueryServiceImpl$findHistoryRecords$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                sportRecordQueryServiceImpl$findHistoryRecords$1.label = i5 - Integer.MIN_VALUE;
            } else {
                sportRecordQueryServiceImpl$findHistoryRecords$1 = new SportRecordQueryServiceImpl$findHistoryRecords$1(this, continuation);
            }
        } else {
            sportRecordQueryServiceImpl$findHistoryRecords$1 = new SportRecordQueryServiceImpl$findHistoryRecords$1(this, continuation);
        }
        SportRecordQueryServiceImpl$findHistoryRecords$1 sportRecordQueryServiceImpl$findHistoryRecords$2 = sportRecordQueryServiceImpl$findHistoryRecords$1;
        Object objA = sportRecordQueryServiceImpl$findHistoryRecords$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = sportRecordQueryServiceImpl$findHistoryRecords$2.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(objA);
            SportRecordListRepository sportRecordListRepository = this.repository;
            sportRecordQueryServiceImpl$findHistoryRecords$2.label = 1;
            objA = sportRecordListRepository.a(i, j2, j3, i2, i3, i4, sportRecordQueryServiceImpl$findHistoryRecords$2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        NetResult netResult = (NetResult) objA;
        if (!netResult.isSucceed()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        D d = netResult.body;
        Intrinsics.checkNotNullExpressionValue(d, "result.body");
        return (List) d;
    }

    @Override // com.heytap.health.sport.ISportRecordQueryService
    public void e3(@NotNull Context context, @NotNull TrackMetadataStat data, @NotNull final Function3<? super String, ? super Double, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DataHelper.m(DataHelper.INSTANCE, context, false, data, new Function3<Object, Double, String, Unit>() { // from class: com.heytap.sports.service.SportRecordQueryServiceImpl$setRecordItemNameValueUnit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Double d, String str) {
                invoke(obj, d.doubleValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Object valueObj, double d, @NotNull String formatStr) {
                Intrinsics.checkNotNullParameter(valueObj, "valueObj");
                Intrinsics.checkNotNullParameter(formatStr, "formatStr");
                callback.invoke(valueObj.toString(), Double.valueOf(d), formatStr);
            }
        }, 2, null);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.sport.ISportRecordQueryService
    @NotNull
    public Pair<String, Integer> p1(@NotNull Context context, @NotNull TrackMetadataStat record) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(record, "record");
        return DataHelper.INSTANCE.h(context, record);
    }

    @Override // com.heytap.health.sport.ISportRecordQueryService
    public int r8(int sportMode) {
        return DataHelper.INSTANCE.a(sportMode);
    }
}
