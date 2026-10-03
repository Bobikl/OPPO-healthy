package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.store.bean.WfDownloadInfoBean;
import com.heytap.health.watchface.business.store.installer.bean.WfStatusBean;
import com.heytap.health.watchface.network.bean.WatchFaceHomeInfoResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes19.dex */
public class q26 extends i51<WatchFaceHomeInfoResp> {
    public static final String TAG = "DownloadInfoPresenter";

    public static /* synthetic */ boolean O0(WfDownloadInfoBean wfDownloadInfoBean) {
        return vnc.INSTANCE.a(wfDownloadInfoBean.getResUrl());
    }

    @Override // com.oplus.aiunit.vision.i51
    public void J0(coi coiVar, WfStatusBean wfStatusBean, int i, int i2) {
        ltl.a(TAG, "currentPos " + i + " position " + i2 + " info " + coiVar);
        x72 x72VarB = coiVar.b();
        int status = wfStatusBean.getStatus();
        x72VarB.h(wfStatusBean.getProcess());
        if (status == 7) {
            P0(i2);
        } else {
            super.J0(coiVar, wfStatusBean, i, i2);
        }
    }

    @Override // com.oplus.aiunit.vision.s41
    public lbd<WatchFaceHomeInfoResp> M(uo9 uo9Var, int i, int i2) {
        WatchFaceHomeInfoResp watchFaceHomeInfoResp = new WatchFaceHomeInfoResp();
        watchFaceHomeInfoResp.setIsEnd(true);
        return lbd.h0(watchFaceHomeInfoResp).L0(su8.c()).i1(su8.c()).n0(f30.c());
    }

    @Override // com.oplus.aiunit.vision.s41
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public guf<o41> G(WatchFaceHomeInfoResp watchFaceHomeInfoResp) {
        if (watchFaceHomeInfoResp == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<WfDownloadInfoBean> list = (List) this.q.U().stream().filter(new Predicate() { // from class: com.oplus.aiunit.vision.p26
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return q26.O0((WfDownloadInfoBean) obj);
            }
        }).collect(Collectors.toList());
        ltl.a(TAG, "fetchDataList " + list);
        if (list != null && list.size() > 0) {
            for (WfDownloadInfoBean wfDownloadInfoBean : list) {
                coi coiVar = new coi();
                String uniqueId = wfDownloadInfoBean.getUniqueId();
                coiVar.B(wfDownloadInfoBean.getPreviewUrl());
                coiVar.N(uniqueId);
                coiVar.M(wfDownloadInfoBean.getWfName());
                i11 i11VarJ = ntl.m().j(this.f13600n);
                if (i11VarJ != null) {
                    WfStatusBean wfStatusBeanV = this.q.V(i11VarJ, uniqueId);
                    if (wfStatusBeanV == null || wfStatusBeanV.getStatus() != 1) {
                        coiVar.I(z0j.e(wfDownloadInfoBean.getSize()));
                    } else if (i() != null) {
                        coiVar.I(i().getString(R$string.watch_face_store_waiting));
                    }
                } else {
                    coiVar.I(z0j.e(wfDownloadInfoBean.getSize()));
                }
                coiVar.H(wfDownloadInfoBean.getSize());
                coiVar.x(wfDownloadInfoBean.getJumpUrl());
                x72 x72Var = new x72(5, R$string.watch_face_store_cancel);
                x72Var.f(true);
                coiVar.v(x72Var);
                arrayList.add(coiVar);
            }
        }
        return new guf<>(watchFaceHomeInfoResp.getIsEnd(), arrayList);
    }

    public final void P0(int i) {
        List<o41> listE0 = e0();
        if (listE0 != null) {
            listE0.remove(listE0.get(i));
            A0(i);
        }
    }

    @Override // com.oplus.aiunit.vision.i51
    public void c0(int i, int i2, coi coiVar) {
        P0(i2);
    }
}
