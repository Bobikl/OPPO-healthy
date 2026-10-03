package com.heytap.health.health_archives.viewmodel;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.heytap.databaseengine.model.healtharchive.HealthDiseaseRisk;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health_archives.R$string;
import com.heytap.health.health_archives.bean.RiskWarningCardBean;
import com.heytap.health.health_archives.helper.HealthArchivesHelper;
import com.heytap.health.health_archives.model.HealthArchivesRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.qtf;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/health_archives/viewmodel/RiskWarningViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "Lcom/heytap/health/health_archives/bean/RiskWarningCardBean;", "x", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "A", "", "diseaseRiskType", "Lcom/heytap/databaseengine/model/healtharchive/HealthDiseaseRisk;", "w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "y", "z", "v", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "j", "Lcom/heytap/health/health_archives/model/HealthArchivesRepository;", "mRepository", MapSchema.FIELD_NAME_KEY, "Z", "mUseDefaultData", "", LogFieldKey.LEVEL_KEY, "Ljava/util/List;", "mCardConfigs", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRiskWarningViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiskWarningViewModel.kt\ncom/heytap/health/health_archives/viewmodel/RiskWarningViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,120:1\n1477#2:121\n1502#2,3:122\n1505#2,3:132\n372#3,7:125\n*S KotlinDebug\n*F\n+ 1 RiskWarningViewModel.kt\ncom/heytap/health/health_archives/viewmodel/RiskWarningViewModel\n*L\n61#1:121\n61#1:122,3\n61#1:132,3\n61#1:125,7\n*E\n"})
public final class RiskWarningViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mUseDefaultData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HealthArchivesRepository mRepository = new HealthArchivesRepository();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<RiskWarningCardBean> mCardConfigs = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object A(@NotNull Continuation<? super Unit> continuation) {
        RiskWarningViewModel$updateRiskCardValue$1 riskWarningViewModel$updateRiskCardValue$1;
        if (continuation instanceof RiskWarningViewModel$updateRiskCardValue$1) {
            riskWarningViewModel$updateRiskCardValue$1 = (RiskWarningViewModel$updateRiskCardValue$1) continuation;
            int i = riskWarningViewModel$updateRiskCardValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                riskWarningViewModel$updateRiskCardValue$1.label = i - Integer.MIN_VALUE;
            } else {
                riskWarningViewModel$updateRiskCardValue$1 = new RiskWarningViewModel$updateRiskCardValue$1(this, continuation);
            }
        } else {
            riskWarningViewModel$updateRiskCardValue$1 = new RiskWarningViewModel$updateRiskCardValue$1(this, continuation);
        }
        Object objN = riskWarningViewModel$updateRiskCardValue$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = riskWarningViewModel$updateRiskCardValue$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objN);
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            riskWarningViewModel$updateRiskCardValue$1.L$0 = this;
            riskWarningViewModel$updateRiskCardValue$1.label = 1;
            objN = HealthArchivesRepository.n(healthArchivesRepository, null, riskWarningViewModel$updateRiskCardValue$1, 1, null);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (RiskWarningViewModel) riskWarningViewModel$updateRiskCardValue$1.L$0;
            ResultKt.throwOnFailure(objN);
        }
        List list = (List) objN;
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String diseaseType = ((HealthDiseaseRisk) obj).getDiseaseType();
            Object arrayList = linkedHashMap.get(diseaseType);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(diseaseType, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (RiskWarningCardBean riskWarningCardBean : this.mCardConfigs) {
            List list2 = (List) linkedHashMap.get(riskWarningCardBean.getType());
            List list3 = list2;
            if (!(list3 == null || list3.isEmpty())) {
                HealthDiseaseRisk healthDiseaseRisk = (HealthDiseaseRisk) CollectionsKt___CollectionsKt.first(list2);
                if (HealthArchivesHelper.K(healthDiseaseRisk.getRiskRank())) {
                    riskWarningCardBean.setLevel(Integer.parseInt(healthDiseaseRisk.getRiskRank()));
                    riskWarningCardBean.setAiSuggestions(healthDiseaseRisk.getAiSuggestions());
                    riskWarningCardBean.setReferences(healthDiseaseRisk.getReferences());
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final List<RiskWarningCardBean> v() {
        ArrayMap arrayMap = new ArrayMap();
        Context contextD = qtf.d();
        int i = R$string.health_archives_risk_level_1;
        String string = contextD.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getContext().getString(R…th_archives_risk_level_1)");
        String str = HealthArchivesHelper.B().get(1);
        Intrinsics.checkNotNullExpressionValue(str, "sRiskColorMap[1]");
        arrayMap.put("1", new RiskWarningCardBean.RiskLevelUI(string, str));
        Context contextD2 = qtf.d();
        int i2 = R$string.health_archives_risk_level_3;
        String string2 = contextD2.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "getContext().getString(R…th_archives_risk_level_3)");
        String str2 = HealthArchivesHelper.B().get(3);
        Intrinsics.checkNotNullExpressionValue(str2, "sRiskColorMap[3]");
        arrayMap.put("3", new RiskWarningCardBean.RiskLevelUI(string2, str2));
        Context contextD3 = qtf.d();
        int i3 = R$string.health_archives_risk_level_4;
        String string3 = contextD3.getString(i3);
        Intrinsics.checkNotNullExpressionValue(string3, "getContext().getString(R…th_archives_risk_level_4)");
        String str3 = HealthArchivesHelper.B().get(4);
        Intrinsics.checkNotNullExpressionValue(str3, "sRiskColorMap[4]");
        arrayMap.put("4", new RiskWarningCardBean.RiskLevelUI(string3, str3));
        RiskWarningCardBean riskWarningCardBean = new RiskWarningCardBean(qtf.l(R$string.health_archives_hypertension), null, 0, 0, null, null, arrayMap, 62, null);
        ArrayMap arrayMap2 = new ArrayMap();
        String string4 = qtf.d().getString(i);
        Intrinsics.checkNotNullExpressionValue(string4, "getContext().getString(R…th_archives_risk_level_1)");
        String str4 = HealthArchivesHelper.B().get(1);
        Intrinsics.checkNotNullExpressionValue(str4, "sRiskColorMap[1]");
        arrayMap2.put("1", new RiskWarningCardBean.RiskLevelUI(string4, str4));
        String string5 = qtf.d().getString(R$string.health_archives_risk_level_2);
        Intrinsics.checkNotNullExpressionValue(string5, "getContext().getString(R…th_archives_risk_level_2)");
        String str5 = HealthArchivesHelper.B().get(2);
        Intrinsics.checkNotNullExpressionValue(str5, "sRiskColorMap[2]");
        arrayMap2.put("2", new RiskWarningCardBean.RiskLevelUI(string5, str5));
        String string6 = qtf.d().getString(i2);
        Intrinsics.checkNotNullExpressionValue(string6, "getContext().getString(R…th_archives_risk_level_3)");
        String str6 = HealthArchivesHelper.B().get(3);
        Intrinsics.checkNotNullExpressionValue(str6, "sRiskColorMap[3]");
        arrayMap2.put("3", new RiskWarningCardBean.RiskLevelUI(string6, str6));
        String string7 = qtf.d().getString(i3);
        Intrinsics.checkNotNullExpressionValue(string7, "getContext().getString(R…th_archives_risk_level_4)");
        String str7 = HealthArchivesHelper.B().get(4);
        Intrinsics.checkNotNullExpressionValue(str7, "sRiskColorMap[4]");
        arrayMap2.put("4", new RiskWarningCardBean.RiskLevelUI(string7, str7));
        String string8 = qtf.d().getString(R$string.health_archives_risk_level_5);
        Intrinsics.checkNotNullExpressionValue(string8, "getContext().getString(R…th_archives_risk_level_5)");
        String str8 = HealthArchivesHelper.B().get(5);
        Intrinsics.checkNotNullExpressionValue(str8, "sRiskColorMap[5]");
        arrayMap2.put("5", new RiskWarningCardBean.RiskLevelUI(string8, str8));
        return CollectionsKt__CollectionsKt.listOf((Object[]) new RiskWarningCardBean[]{riskWarningCardBean, new RiskWarningCardBean(qtf.l(R$string.health_archives_type_2_diabetes), null, 0, 0, null, null, arrayMap2, 62, null)});
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w(@NotNull String str, @NotNull Continuation<? super HealthDiseaseRisk> continuation) {
        RiskWarningViewModel$getLatestRiskDataByType$1 riskWarningViewModel$getLatestRiskDataByType$1;
        if (continuation instanceof RiskWarningViewModel$getLatestRiskDataByType$1) {
            riskWarningViewModel$getLatestRiskDataByType$1 = (RiskWarningViewModel$getLatestRiskDataByType$1) continuation;
            int i = riskWarningViewModel$getLatestRiskDataByType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                riskWarningViewModel$getLatestRiskDataByType$1.label = i - Integer.MIN_VALUE;
            } else {
                riskWarningViewModel$getLatestRiskDataByType$1 = new RiskWarningViewModel$getLatestRiskDataByType$1(this, continuation);
            }
        } else {
            riskWarningViewModel$getLatestRiskDataByType$1 = new RiskWarningViewModel$getLatestRiskDataByType$1(this, continuation);
        }
        Object objM = riskWarningViewModel$getLatestRiskDataByType$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = riskWarningViewModel$getLatestRiskDataByType$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM);
            HealthArchivesRepository healthArchivesRepository = this.mRepository;
            riskWarningViewModel$getLatestRiskDataByType$1.label = 1;
            objM = healthArchivesRepository.m(str, riskWarningViewModel$getLatestRiskDataByType$1);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM);
        }
        List list = (List) objM;
        if (list.isEmpty()) {
            return null;
        }
        return CollectionsKt___CollectionsKt.first(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x(@NotNull Continuation<? super List<RiskWarningCardBean>> continuation) {
        RiskWarningViewModel$getRiskCardData$1 riskWarningViewModel$getRiskCardData$1;
        if (continuation instanceof RiskWarningViewModel$getRiskCardData$1) {
            riskWarningViewModel$getRiskCardData$1 = (RiskWarningViewModel$getRiskCardData$1) continuation;
            int i = riskWarningViewModel$getRiskCardData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                riskWarningViewModel$getRiskCardData$1.label = i - Integer.MIN_VALUE;
            } else {
                riskWarningViewModel$getRiskCardData$1 = new RiskWarningViewModel$getRiskCardData$1(this, continuation);
            }
        } else {
            riskWarningViewModel$getRiskCardData$1 = new RiskWarningViewModel$getRiskCardData$1(this, continuation);
        }
        Object obj = riskWarningViewModel$getRiskCardData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = riskWarningViewModel$getRiskCardData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String strD = qg0.e().D(qg0.RISK_CARD_CONFIG_DATA);
            if (strD == null || strD.length() == 0) {
                this.mUseDefaultData = true;
                return v();
            }
            List listC = GsonUtil.c(strD, RiskWarningCardBean.class);
            List list = listC;
            if (list == null || list.isEmpty()) {
                this.mUseDefaultData = true;
                return v();
            }
            int size = listC.size();
            StringBuilder sb = new StringBuilder();
            sb.append("cardConfigs = ");
            sb.append(size);
            this.mUseDefaultData = false;
            this.mCardConfigs.clear();
            this.mCardConfigs.addAll(listC);
            riskWarningViewModel$getRiskCardData$1.L$0 = this;
            riskWarningViewModel$getRiskCardData$1.label = 1;
            if (A(riskWarningViewModel$getRiskCardData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (RiskWarningViewModel) riskWarningViewModel$getRiskCardData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return this.mCardConfigs;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getMUseDefaultData() {
        return this.mUseDefaultData;
    }

    public final void z() {
        a aVarC = this.mRepository.K().c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "mRepository.syncHealthArchivesData().subscribe()");
        u(aVarC);
    }
}
