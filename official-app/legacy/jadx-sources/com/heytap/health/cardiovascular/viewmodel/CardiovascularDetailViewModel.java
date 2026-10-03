package com.heytap.health.cardiovascular.viewmodel;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.AssessmentRecord;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.cardiovascular.model.CardiovascularRepository;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.bga;
import com.oplus.aiunit.vision.dte;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.id6;
import com.oplus.aiunit.vision.k19;
import com.oplus.aiunit.vision.li8;
import com.oplus.aiunit.vision.luk;
import com.oplus.aiunit.vision.pn9;
import com.oplus.aiunit.vision.qgi;
import com.oplus.aiunit.vision.ql1;
import com.oplus.aiunit.vision.rtk;
import com.oplus.aiunit.vision.s59;
import com.oplus.aiunit.vision.sgi;
import com.oplus.aiunit.vision.t23;
import com.oplus.aiunit.vision.vw7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/cardiovascular/viewmodel/CardiovascularDetailViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "ecgId", "Lcom/heytap/databaseengine/model/ECGRecord;", "x", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "data", "", "Lcom/oplus/aiunit/vision/pn9;", "v", "Lcom/heytap/health/cardiovascular/model/CardiovascularRepository;", "j", "Lkotlin/Lazy;", "w", "()Lcom/heytap/health/cardiovascular/model/CardiovascularRepository;", "repository", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardiovascularDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardiovascularDetailViewModel.kt\ncom/heytap/health/cardiovascular/viewmodel/CardiovascularDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n766#2:104\n857#2,2:105\n1603#2,9:107\n1855#2:116\n1856#2:118\n1612#2:119\n1603#2,9:120\n1855#2:129\n1856#2:131\n1612#2:132\n1#3:117\n1#3:130\n*S KotlinDebug\n*F\n+ 1 CardiovascularDetailViewModel.kt\ncom/heytap/health/cardiovascular/viewmodel/CardiovascularDetailViewModel\n*L\n60#1:104\n60#1:105,2\n67#1:107,9\n67#1:116\n67#1:118\n67#1:119\n73#1:120,9\n73#1:129\n73#1:131\n73#1:132\n67#1:117\n73#1:130\n*E\n"})
public final class CardiovascularDetailViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy repository = LazyKt__LazyJVMKt.lazy(new Function0<CardiovascularRepository>() { // from class: com.heytap.health.cardiovascular.viewmodel.CardiovascularDetailViewModel$repository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CardiovascularRepository invoke() {
            return new CardiovascularRepository();
        }
    });

    @NotNull
    public final List<pn9> v(@NotNull AssessmentRecord data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Pair[] pairArr = new Pair[5];
        Float pwv = data.getPwv();
        float fFloatValue = pwv == null ? 0.0f : pwv.floatValue();
        String pwvId = data.getPwvId();
        Intrinsics.checkNotNullExpressionValue(pwvId, "data.pwvId");
        Integer degreeVascularElasticity = data.getDegreeVascularElasticity();
        pairArr[0] = TuplesKt.to(3, new luk(fFloatValue, pwvId, degreeVascularElasticity == null ? 0 : degreeVascularElasticity.intValue(), !Intrinsics.areEqual(data.getPwv(), 0.0f), false, 16, null));
        String ecgId = data.getEcgId();
        Intrinsics.checkNotNullExpressionValue(ecgId, "data.ecgId");
        Integer ecgDiagnosisResults = data.getEcgDiagnosisResults();
        pairArr[1] = TuplesKt.to(2, new id6(ecgId, ecgDiagnosisResults == null ? -1 : ecgDiagnosisResults.intValue(), null, false, 8, null));
        Integer heartRate = data.getHeartRate();
        pairArr[2] = TuplesKt.to(4, new s59(heartRate == null ? 0 : heartRate.intValue(), true));
        Integer stress = data.getStress();
        pairArr[3] = TuplesKt.to(6, new dte(stress == null ? 0 : stress.intValue(), true));
        Integer spo2 = data.getSpo2();
        pairArr[4] = TuplesKt.to(5, new ql1(spo2 == null ? 0 : spo2.intValue(), true));
        Map mapMapOf = MapsKt__MapsKt.mapOf(pairArr);
        t23 t23Var = t23.INSTANCE;
        String validMeasurementItems = data.getValidMeasurementItems();
        Intrinsics.checkNotNullExpressionValue(validMeasurementItems, "data.validMeasurementItems");
        List listG = t23.g(t23Var, validMeasurementItems, false, 2, null);
        String focusMeasurementItems = data.getFocusMeasurementItems();
        Intrinsics.checkNotNullExpressionValue(focusMeasurementItems, "data.focusMeasurementItems");
        List listG2 = t23.g(t23Var, focusMeasurementItems, false, 2, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (!listG2.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new li8(data.getValidMeasurementItems(), data.getFocusMeasurementItems(), data.getEndTimestamp()));
        if (!listG2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = listG2.iterator();
            while (it.hasNext()) {
                pn9 pn9Var = (pn9) mapMapOf.get(Integer.valueOf(((Number) it.next()).intValue()));
                if (pn9Var != null) {
                    arrayList3.add(pn9Var);
                }
            }
            arrayList2.addAll(arrayList3);
            if (!arrayList.isEmpty()) {
                arrayList2.add(new rtk());
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                pn9 pn9Var2 = (pn9) mapMapOf.get(Integer.valueOf(((Number) it2.next()).intValue()));
                if (pn9Var2 != null) {
                    arrayList4.add(pn9Var2);
                }
            }
            arrayList2.addAll(arrayList4);
        }
        t23 t23Var2 = t23.INSTANCE;
        String validMeasurementItems2 = data.getValidMeasurementItems();
        Intrinsics.checkNotNullExpressionValue(validMeasurementItems2, "data.validMeasurementItems");
        if (!t23Var2.f(validMeasurementItems2, true).isEmpty()) {
            arrayList2.add(new bga(data.getValidMeasurementItems()));
        }
        String currActiveMac = gl4.managerApi.getCurrActiveMac();
        if (!TextUtils.isEmpty(currActiveMac)) {
            qgi qgiVarA = sgi.a(currActiveMac);
            boolean zT4 = qgiVarA.T4();
            boolean zI3 = qgiVarA.I3();
            a7b.f("CardiovascularViewModel", "supportSetting() afib=" + zT4 + " QRNotify=" + zI3 + " ");
            if (zT4 || zI3) {
                arrayList2.add(new k19(currActiveMac, null, 2, null));
            }
        }
        arrayList2.add(new vw7());
        a7b.f("CardiovascularViewModel", "getConvertData() size = " + arrayList2.size() + " ");
        return arrayList2;
    }

    public final CardiovascularRepository w() {
        return (CardiovascularRepository) this.repository.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x(@NotNull String str, @NotNull Continuation<? super ECGRecord> continuation) {
        CardiovascularDetailViewModel$requestEcgData$1 cardiovascularDetailViewModel$requestEcgData$1;
        if (continuation instanceof CardiovascularDetailViewModel$requestEcgData$1) {
            cardiovascularDetailViewModel$requestEcgData$1 = (CardiovascularDetailViewModel$requestEcgData$1) continuation;
            int i = cardiovascularDetailViewModel$requestEcgData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardiovascularDetailViewModel$requestEcgData$1.label = i - Integer.MIN_VALUE;
            } else {
                cardiovascularDetailViewModel$requestEcgData$1 = new CardiovascularDetailViewModel$requestEcgData$1(this, continuation);
            }
        } else {
            cardiovascularDetailViewModel$requestEcgData$1 = new CardiovascularDetailViewModel$requestEcgData$1(this, continuation);
        }
        Object objK = cardiovascularDetailViewModel$requestEcgData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cardiovascularDetailViewModel$requestEcgData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objK);
            CardiovascularRepository cardiovascularRepositoryW = w();
            cardiovascularDetailViewModel$requestEcgData$1.label = 1;
            objK = cardiovascularRepositoryW.k(str, cardiovascularDetailViewModel$requestEcgData$1);
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objK);
        }
        return CollectionsKt___CollectionsKt.getOrNull((List) objK, 0);
    }
}
