package com.heytap.health.cardiovascular.viewmodel;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.AssessmentRecord;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.cardiovascular.bean.QueryAiAnalysisCrossRsp;
import com.heytap.health.cardiovascular.bean.QueryAiAnalysisNoRiskList;
import com.heytap.health.cardiovascular.bean.QueryAiAnalysisTextRsp;
import com.heytap.health.cardiovascular.bean.QueryAiAnalysisTrendRsp;
import com.heytap.health.cardiovascular.bean.QueryAiCrossAnalysisReq;
import com.heytap.health.cardiovascular.bean.QueryAiTrendAnalysisReq;
import com.heytap.health.cardiovascular.bean.QueryRecordAiAnalysisReq;
import com.heytap.health.cardiovascular.bean.QuicklyCheckupV2CardType;
import com.heytap.health.cardiovascular.bean.RecordReportData;
import com.heytap.health.cardiovascular.bean.RecordRiskItem;
import com.heytap.health.cardiovascular.model.CardiovascularRepository;
import com.heytap.health.cardiovascular.model.HrvFocusBehaviorItem;
import com.heytap.health.cardiovascular.model.HrvInfo;
import com.heytap.health.cardiovascular.util.AiAnalysisUtil;
import com.heytap.health.cardiovascular.util.QuicklyCheckupV2DateUtil;
import com.heytap.health.cardiovascular.util.b;
import com.heytap.health.cardiovascular.viewmodel.QuicklyCheckupAiViewModel;
import com.oplus.aiunit.vision.TagSelectItemData;
import com.oplus.aiunit.vision.c8l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/heytap/health/cardiovascular/viewmodel/QuicklyCheckupAiViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "Landroid/content/Context;", "context", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "record", "Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisTextRsp;", c8l.KEY_B, "(Landroid/content/Context;Lcom/heytap/databaseengine/model/AssessmentRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "", "", "y", "(Lcom/heytap/databaseengine/model/AssessmentRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aiAnalysisType", "Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisTrendRsp;", "C", "(Landroid/content/Context;ILcom/heytap/databaseengine/model/AssessmentRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "subTagField", "subTagFieldEnd", "Lcom/heytap/health/cardiovascular/bean/QueryAiAnalysisCrossRsp;", "x", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/heytap/databaseengine/model/AssessmentRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/fnj;", "D", "Lcom/heytap/health/cardiovascular/model/CardiovascularRepository;", "j", "Lcom/heytap/health/cardiovascular/model/CardiovascularRepository;", "getRepository", "()Lcom/heytap/health/cardiovascular/model/CardiovascularRepository;", "repository", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuicklyCheckupAiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuicklyCheckupAiViewModel.kt\ncom/heytap/health/cardiovascular/viewmodel/QuicklyCheckupAiViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1855#2,2:175\n1855#2,2:177\n1549#2:179\n1620#2,3:180\n766#2:183\n857#2,2:184\n766#2:187\n857#2,2:188\n766#2:190\n857#2,2:191\n1549#2:193\n1620#2,3:194\n766#2:197\n857#2,2:198\n1#3:186\n*S KotlinDebug\n*F\n+ 1 QuicklyCheckupAiViewModel.kt\ncom/heytap/health/cardiovascular/viewmodel/QuicklyCheckupAiViewModel\n*L\n63#1:175,2\n66#1:177,2\n138#1:179\n138#1:180,3\n140#1:183\n140#1:184,2\n164#1:187\n164#1:188,2\n165#1:190\n165#1:191,2\n166#1:193\n166#1:194,3\n171#1:197\n171#1:198,2\n*E\n"})
public final class QuicklyCheckupAiViewModel extends BaseViewModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CardiovascularRepository repository = new CardiovascularRepository();

    public static final boolean A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    public static final boolean z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    @Nullable
    public final Object B(@NotNull Context context, @NotNull AssessmentRecord assessmentRecord, @NotNull Continuation<? super QueryAiAnalysisTextRsp> continuation) {
        AiAnalysisUtil.Companion companion = AiAnalysisUtil.INSTANCE;
        List<RecordRiskItem> listE = companion.e(context, assessmentRecord);
        List<String> listI = companion.i(context, assessmentRecord);
        QueryRecordAiAnalysisReq queryRecordAiAnalysisReq = new QueryRecordAiAnalysisReq(assessmentRecord.getStartTimestamp(), listE, companion.m(assessmentRecord), listI);
        StringBuilder sb = new StringBuilder();
        sb.append("fetchAiAnalysisResult() request = ");
        sb.append(queryRecordAiAnalysisReq);
        return this.repository.h(queryRecordAiAnalysisReq, continuation);
    }

    @Nullable
    public final Object C(@NotNull Context context, int i, @NotNull AssessmentRecord assessmentRecord, @NotNull Continuation<? super QueryAiAnalysisTrendRsp> continuation) {
        AiAnalysisUtil.Companion companion = AiAnalysisUtil.INSTANCE;
        List<RecordRiskItem> listE = companion.e(context, assessmentRecord);
        RecordReportData recordReportDataL = companion.l(i, assessmentRecord);
        String metricValue = recordReportDataL != null ? recordReportDataL.getMetricValue() : null;
        QueryAiTrendAnalysisReq queryAiTrendAnalysisReq = new QueryAiTrendAnalysisReq(assessmentRecord.getStartTimestamp(), i, metricValue, listE, companion.m(assessmentRecord));
        StringBuilder sb = new StringBuilder();
        sb.append("fetchAiAnalysisTrend() request = ");
        sb.append(queryAiTrendAnalysisReq);
        return this.repository.i(queryAiTrendAnalysisReq, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @NotNull
    public final List<TagSelectItemData> D(@NotNull AssessmentRecord record) {
        ?? r1;
        List<HrvFocusBehaviorItem> hrvFocusBehaviorList;
        Intrinsics.checkNotNullParameter(record, "record");
        List<QuicklyCheckupV2CardType> listC = QuicklyCheckupV2DateUtil.INSTANCE.c(record);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC, 10));
        for (QuicklyCheckupV2CardType quicklyCheckupV2CardType : listC) {
            arrayList.add(TuplesKt.to(Integer.valueOf(quicklyCheckupV2CardType.getAiAnalysisType()), QuicklyCheckupV2DateUtil.INSTANCE.l(quicklyCheckupV2CardType).a(record)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) ((Pair) next).getFirst()).intValue() != QuicklyCheckupV2CardType.HRV_FOCUS_ACTION.getAiAnalysisType()) {
                arrayList2.add(next);
            }
        }
        AiAnalysisUtil.Companion companion = AiAnalysisUtil.INSTANCE;
        boolean zBooleanValue = companion.k(record).component2().booleanValue();
        boolean zBooleanValue2 = companion.n(record).component2().booleanValue();
        HrvInfo hrvInfo = (HrvInfo) b.INSTANCE.m(record.getHrvInfo(), HrvInfo.class);
        HrvFocusBehaviorItem hrvFocusBehaviorItem = null;
        Object obj = null;
        hrvFocusBehaviorItem = null;
        if (hrvInfo != null && (hrvFocusBehaviorList = hrvInfo.getHrvFocusBehaviorList()) != null) {
            for (Object obj2 : hrvFocusBehaviorList) {
                if ((((HrvFocusBehaviorItem) obj2).getBehaviorType() == 1) != false) {
                    obj = obj2;
                    break;
                }
            }
            hrvFocusBehaviorItem = (HrvFocusBehaviorItem) obj;
        }
        boolean z = hrvFocusBehaviorItem != null && hrvFocusBehaviorItem.getFocusDayData() > 0;
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        mutableList.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(9, Boolean.valueOf(z)), TuplesKt.to(12, Boolean.valueOf(zBooleanValue)), TuplesKt.to(13, Boolean.valueOf(zBooleanValue2))}));
        List list = CollectionsKt___CollectionsKt.toList(mutableList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (Intrinsics.areEqual(((Pair) obj3).getSecond(), Boolean.TRUE)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (!Intrinsics.areEqual(((Pair) obj4).getSecond(), Boolean.TRUE)) {
                arrayList4.add(obj4);
            }
        }
        List<Pair> listPlus = CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList4);
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10));
        for (Pair pair : listPlus) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            arrayList5.add(new TagSelectItemData(iIntValue, "", AiAnalysisUtil.INSTANCE.h(record, iIntValue), Boolean.valueOf(Intrinsics.areEqual(pair.getSecond(), Boolean.TRUE))));
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList5) {
            TagSelectItemData tagSelectItemData = (TagSelectItemData) obj5;
            if (tagSelectItemData.getDataType() == -1) {
                r1 = false;
            } else if ((tagSelectItemData.getName().length() > 0) == true) {
                r1 = true;
            } else {
                r1 = false;
            }
            if (r1 != false) {
                arrayList6.add(obj5);
            }
        }
        return arrayList6;
    }

    @Nullable
    public final Object x(@NotNull Context context, int i, @NotNull String str, @NotNull String str2, @NotNull AssessmentRecord assessmentRecord, @NotNull Continuation<? super QueryAiAnalysisCrossRsp> continuation) {
        AiAnalysisUtil.Companion companion = AiAnalysisUtil.INSTANCE;
        List<RecordRiskItem> listE = companion.e(context, assessmentRecord);
        RecordReportData recordReportDataL = companion.l(i, assessmentRecord);
        String metricValue = recordReportDataL != null ? recordReportDataL.getMetricValue() : null;
        QueryAiCrossAnalysisReq queryAiCrossAnalysisReq = new QueryAiCrossAnalysisReq(assessmentRecord.getStartTimestamp(), i, metricValue, str, str2, listE, companion.m(assessmentRecord));
        StringBuilder sb = new StringBuilder();
        sb.append("fetchAiAnalysisTrend() request = ");
        sb.append(queryAiCrossAnalysisReq);
        return this.repository.g(queryAiCrossAnalysisReq, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y(@NotNull AssessmentRecord assessmentRecord, @NotNull Continuation<? super List<Pair<Integer, Boolean>>> continuation) throws Throwable {
        QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1 quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1;
        List list;
        if (continuation instanceof QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1) {
            quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1 = (QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1) continuation;
            int i = quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.label = i - Integer.MIN_VALUE;
            } else {
                quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1 = new QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1(this, continuation);
            }
        } else {
            quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1 = new QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1(this, continuation);
        }
        Object obj = quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            CardiovascularRepository cardiovascularRepository = this.repository;
            long startTimestamp = assessmentRecord.getStartTimestamp();
            quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.L$0 = assessmentRecord;
            quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.L$1 = arrayList;
            quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.label = 1;
            Object objJ = cardiovascularRepository.j(startTimestamp, quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objJ;
            list = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.L$1;
            assessmentRecord = (AssessmentRecord) quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        QueryAiAnalysisNoRiskList queryAiAnalysisNoRiskList = (QueryAiAnalysisNoRiskList) obj;
        if (queryAiAnalysisNoRiskList != null) {
            List<Integer> keyIndex = queryAiAnalysisNoRiskList.getKeyIndex();
            if (keyIndex != null) {
                Iterator<T> it = keyIndex.iterator();
                while (it.hasNext()) {
                    list.add(TuplesKt.to(Boxing.boxInt(((Number) it.next()).intValue()), Boxing.boxBoolean(true)));
                }
            }
            List<Integer> commonIndex = queryAiAnalysisNoRiskList.getCommonIndex();
            if (commonIndex != null) {
                Iterator<T> it2 = commonIndex.iterator();
                while (it2.hasNext()) {
                    list.add(TuplesKt.to(Boxing.boxInt(((Number) it2.next()).intValue()), Boxing.boxBoolean(false)));
                }
            }
        }
        if (QuicklyCheckupV2DateUtil.INSTANCE.u(assessmentRecord)) {
            final QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$3 quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$3 = new Function1<Pair<? extends Integer, ? extends Boolean>, Boolean>() { // from class: com.heytap.health.cardiovascular.viewmodel.QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$3
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Boolean invoke2(@NotNull Pair<Integer, Boolean> it3) {
                    Intrinsics.checkNotNullParameter(it3, "it");
                    return Boolean.valueOf(it3.getFirst().intValue() == QuicklyCheckupV2CardType.SLEEP_SNORE.getAiAnalysisType());
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Integer, ? extends Boolean> pair) {
                    return invoke2((Pair<Integer, Boolean>) pair);
                }
            };
            list.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.b8f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return QuicklyCheckupAiViewModel.z(quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$3, obj2);
                }
            });
        } else {
            final QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$4 quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$4 = new Function1<Pair<? extends Integer, ? extends Boolean>, Boolean>() { // from class: com.heytap.health.cardiovascular.viewmodel.QuicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$4
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Boolean invoke2(@NotNull Pair<Integer, Boolean> it3) {
                    Intrinsics.checkNotNullParameter(it3, "it");
                    return Boolean.valueOf(it3.getFirst().intValue() == QuicklyCheckupV2CardType.SLEEP_SNORE_V2.getAiAnalysisType());
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Integer, ? extends Boolean> pair) {
                    return invoke2((Pair<Integer, Boolean>) pair);
                }
            };
            list.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.c8f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return QuicklyCheckupAiViewModel.A(quicklyCheckupAiViewModel$fetchAiAnalysisNoRiskList$4, obj2);
                }
            });
        }
        return list;
    }
}
