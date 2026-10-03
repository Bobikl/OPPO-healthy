package com.heytap.health.cervical_vertebra.repository;

import com.heytap.health.cervical_vertebra.bean.CSData;
import com.heytap.health.cervical_vertebra.bean.CSStatData;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x05;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cervical_vertebra/repository/CSRepository;", "", "", "type", "", "startTime", "endTime", "", "Lcom/heytap/health/cervical_vertebra/bean/CSStatData;", "b", "(IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/cervical_vertebra/bean/CSData;", "a", "dataList", "c", "<init>", "()V", "Companion", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class CSRepository {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.util.ArrayList] */
    @Nullable
    public final Object a(int i, long j2, long j3, @NotNull Continuation<? super List<CSData>> continuation) {
        CSRepository$fetchCSData$1 cSRepository$fetchCSData$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof CSRepository$fetchCSData$1) {
            cSRepository$fetchCSData$1 = (CSRepository$fetchCSData$1) continuation;
            int i2 = cSRepository$fetchCSData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cSRepository$fetchCSData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                cSRepository$fetchCSData$1 = new CSRepository$fetchCSData$1(this, continuation);
            }
        } else {
            cSRepository$fetchCSData$1 = new CSRepository$fetchCSData$1(this, continuation);
        }
        Object obj = cSRepository$fetchCSData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cSRepository$fetchCSData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new ArrayList();
            CoroutineContext coroutineContextE = wq8.INSTANCE.e();
            CSRepository$fetchCSData$2 cSRepository$fetchCSData$2 = new CSRepository$fetchCSData$2(j2, j3, i, objectRef2, null);
            cSRepository$fetchCSData$1.L$0 = objectRef2;
            cSRepository$fetchCSData$1.label = 1;
            if (BuildersKt.withContext(coroutineContextE, cSRepository$fetchCSData$2, cSRepository$fetchCSData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) cSRepository$fetchCSData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object b(int i, long j2, long j3, @NotNull Continuation<? super List<CSStatData>> continuation) {
        CSRepository$fetchCSStatData$1 cSRepository$fetchCSStatData$1;
        List list;
        if (continuation instanceof CSRepository$fetchCSStatData$1) {
            cSRepository$fetchCSStatData$1 = (CSRepository$fetchCSStatData$1) continuation;
            int i2 = cSRepository$fetchCSStatData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cSRepository$fetchCSStatData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                cSRepository$fetchCSStatData$1 = new CSRepository$fetchCSStatData$1(this, continuation);
            }
        } else {
            cSRepository$fetchCSStatData$1 = new CSRepository$fetchCSStatData$1(this, continuation);
        }
        Object obj = cSRepository$fetchCSStatData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cSRepository$fetchCSStatData$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            cSRepository$fetchCSStatData$1.L$0 = arrayList;
            cSRepository$fetchCSStatData$1.label = 1;
            Object objA = a(i, j2, j3, cSRepository$fetchCSStatData$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            obj = objA;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = (List) cSRepository$fetchCSStatData$1.L$0;
                ResultKt.throwOnFailure(obj);
                return list2;
            }
            list = (List) cSRepository$fetchCSStatData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        CoroutineContext coroutineContextE = wq8.INSTANCE.e();
        CSRepository$fetchCSStatData$2 cSRepository$fetchCSStatData$2 = new CSRepository$fetchCSStatData$2((List) obj, list, null);
        cSRepository$fetchCSStatData$1.L$0 = list;
        cSRepository$fetchCSStatData$1.label = 2;
        return BuildersKt.withContext(coroutineContextE, cSRepository$fetchCSStatData$2, cSRepository$fetchCSStatData$1) == coroutine_suspended ? coroutine_suspended : list;
    }

    @NotNull
    public final List<CSData> c(long startTime, long endTime, @NotNull List<CSData> dataList, int type) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        a7b.f("CSRepository", "startTime" + x05.a(startTime, "yyyy-MM-dd HH:mm:ss"));
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), ZoneId.systemDefault());
        LocalDateTime localDateTimeAtStartOfDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        int totalMonths = type == 2 ? (int) (Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant.toLocalDate().withDayOfMonth(1)).toTotalMonths() + 1) : ((int) Math.ceil((localDateTimeOfInstant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / ((long) 86400000))) + 1;
        ArrayList arrayList = new ArrayList(totalMonths);
        for (int i = 0; i < totalMonths; i++) {
            CSData cSData = new CSData(0L, 0, 0, 0, 0, 0, 0, 0, 255, null);
            cSData.setDate(type == 2 ? localDateTimeAtStartOfDay.plusMonths(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() : localDateTimeAtStartOfDay.plusDays(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
            arrayList.add(cSData);
        }
        for (CSData cSData2 : dataList) {
            LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(cSData2.getDate()), ZoneId.systemDefault());
            arrayList.set(type == 2 ? (int) Period.between(localDateTimeAtStartOfDay.toLocalDate().withDayOfMonth(1), localDateTimeOfInstant2.toLocalDate().withDayOfMonth(1)).toTotalMonths() : (int) Math.ceil((localDateTimeOfInstant2.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - localDateTimeAtStartOfDay.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) / ((long) 86400000)), cSData2);
        }
        return arrayList;
    }
}
