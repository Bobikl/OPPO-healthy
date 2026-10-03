package com.heytap.health.stress.viewmodel;

import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.stress.viewmodel.StressCardViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.s3j;
import com.oplus.aiunit.vision.v3j;
import com.oplus.aiunit.vision.w0j;
import com.oplus.aiunit.vision.y0j;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/stress/viewmodel/StressCardViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "startTime", "endTime", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", "stressDataStat", "", "x", "Lcom/oplus/aiunit/vision/v3j;", "j", "Lcom/oplus/aiunit/vision/v3j;", "mRepository", "Lcom/oplus/aiunit/vision/y0j;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/y0j;", "transform", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/oplus/aiunit/vision/w0j;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "A", "()Lcom/heytap/health/base/livedata/OLiveData;", "stressCardLiveData", "<init>", "()V", "Companion", "a", "stress_release"}, k = 1, mv = {1, 8, 0})
public final class StressCardViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v3j mRepository = new v3j();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final y0j transform = new y0j();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<w0j> stressCardLiveData = new OLiveData<>();

    public static final void y(StressCardViewModel this$0, StressDataStat stressDataStat, CommonBackBean commonBackBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stressDataStat, "$stressDataStat");
        ArrayList arrayList = new ArrayList();
        if (commonBackBean == null || commonBackBean.getErrorCode() != 0) {
            s3j.c("StressCardViewModel", "fetchStressCardData, data is null");
        } else {
            Object obj = commonBackBean.getObj();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.heytap.databaseengine.model.stress.Stress>");
            arrayList.addAll(TypeIntrinsics.asMutableList(obj));
            s3j.c("StressCardViewModel", "fetchStressCardData, size = :" + arrayList.size() + " , code:" + commonBackBean.getErrorCode());
        }
        this$0.stressCardLiveData.postValue(this$0.transform.a(arrayList, stressDataStat));
    }

    public static final void z(StressCardViewModel this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(th);
        s3j.b("StressCardViewModel", "fetchStressCardData failed, " + th.getMessage());
        this$0.stressCardLiveData.postValue(new w0j());
    }

    @NotNull
    public final OLiveData<w0j> A() {
        return this.stressCardLiveData;
    }

    public final void x(long startTime, long endTime, @NotNull final StressDataStat stressDataStat) {
        Intrinsics.checkNotNullParameter(stressDataStat, "stressDataStat");
        a aVarB = this.mRepository.b(cn.c().getSsoid(), startTime, endTime, -1, 0).b(new b24() { // from class: com.oplus.aiunit.vision.z0j
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                StressCardViewModel.y(this.i, stressDataStat, (CommonBackBean) obj);
            }
        }, new b24() { // from class: com.oplus.aiunit.vision.a1j
            @Override // com.oplus.aiunit.vision.b24
            public final void accept(Object obj) {
                StressCardViewModel.z(this.i, (Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarB, "mRepository.fetchStressD…ean())\n                })");
        u(aVarB);
    }
}