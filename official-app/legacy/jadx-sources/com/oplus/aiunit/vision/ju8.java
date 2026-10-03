package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.healthbase.bean.TargetBean;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.operations.router.providers.IOperatorProvider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class ju8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Integer> f13036c = new CopyOnWriteArrayList();
    public hp9 a = (hp9) com.heytap.health.network.core.a.j(hp9.class);
    public wa5 b = new wa5();

    public static /* synthetic */ Boolean d(BaseResponse baseResponse) throws Throwable {
        if (baseResponse.isSuccess()) {
            return Boolean.TRUE;
        }
        y0k.h(baseResponse.getMessage());
        return Boolean.FALSE;
    }

    public static /* synthetic */ Boolean e(Throwable th) throws Throwable {
        y0k.h(th.getMessage());
        return Boolean.FALSE;
    }

    public static /* synthetic */ void f(TargetBean targetBean, xm3 xm3Var, Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            targetBean.setSignInStatus(1);
        }
        xm3Var.onResult(bool);
    }

    @SuppressLint({"CheckResult"})
    public void g(final TargetBean targetBean, int i, final xm3<Boolean> xm3Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("syncGoalState goalId:");
        sb.append(targetBean.getGoalId());
        sb.append("/state:");
        sb.append(i);
        Map<String, Object> mapK = NxTrackHelper.K("goalId", targetBean.getGoalId());
        mapK.put("syncStatus", Integer.valueOf(i));
        IOperatorProvider iOperatorProvider = (IOperatorProvider) x0.d().h(IOperatorProvider.class);
        (iOperatorProvider != null ? iOperatorProvider.b(mapK) : ((bz2) com.heytap.health.network.core.a.j(bz2.class)).b(mapK)).L0(su8.c()).j0(new d08() { // from class: com.oplus.aiunit.vision.gu8
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return ju8.d((BaseResponse) obj);
            }
        }).t0(new d08() { // from class: com.oplus.aiunit.vision.hu8
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return ju8.e((Throwable) obj);
            }
        }).n0(f30.c()).a(new o14() { // from class: com.oplus.aiunit.vision.iu8
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ju8.f(targetBean, xm3Var, (Boolean) obj);
            }
        });
    }
}
