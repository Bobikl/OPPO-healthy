package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.heytap.health.watchface.network.bean.WatchFaceHomeInfoResp;
import com.heytap.theme.watch.domain.dto.response.common.ResponsesBody;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class hx6 extends i51<ResponsesBody<WatchFaceHomeInfoResp>> {
    public static final String TAG = "ExperimentListPresenter";

    @Override // com.oplus.aiunit.vision.i51
    public void L0(coi coiVar) {
        coiVar.I(z0j.c(coiVar.o(), z0j.DATA_FMT1));
    }

    @Override // com.oplus.aiunit.vision.s41
    public lbd<ResponsesBody<WatchFaceHomeInfoResp>> M(uo9 uo9Var, int i, int i2) {
        return uo9Var.a(i, i2);
    }

    @Override // com.oplus.aiunit.vision.s41
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public guf<o41> G(ResponsesBody<WatchFaceHomeInfoResp> responsesBody) {
        x72 x72Var;
        if (responsesBody == null) {
            return null;
        }
        if (responsesBody.getErrorCode() != 0) {
            ltl.i(TAG, "resp is error." + responsesBody.getErrorCode());
            return null;
        }
        WatchFaceHomeInfoResp body = responsesBody.getBody();
        if (body == null) {
            return null;
        }
        List<WatchFaceHomeCard> cards = body.getCards();
        ArrayList arrayList = new ArrayList();
        if (cards != null) {
            for (WatchFaceHomeCard.Item item : F(cards)) {
                coi coiVar = new coi();
                coiVar.B(item.getThumbnailPic());
                coiVar.M(item.getAppName());
                coiVar.N(item.getPkgNameMd5());
                coiVar.y(item.getMasterId());
                coiVar.L(item.getVersionId());
                coiVar.H(item.getFileSize());
                coiVar.x(item.getJumpUrl());
                coiVar.I(z0j.c(item.getTestTime(), z0j.DATA_FMT1));
                coiVar.J(item.getTestTime());
                coiVar.A(item.getPay());
                coiVar.z(item.isNotSupport());
                coiVar.K(item.getVersionCode());
                i11 i11VarJ = ntl.m().j(this.f13600n);
                if (i11VarJ != null) {
                    BaseWatchFaceBean baseWatchFaceBeanA = ial.a(i11VarJ, item.getPkgNameMd5());
                    if (baseWatchFaceBeanA == null) {
                        x72Var = new x72(0, R$string.watch_face_install_experienment);
                    } else if (vrl.b(baseWatchFaceBeanA.getWfVersion()) < item.getVersionCode()) {
                        x72Var = new x72(1, R$string.watch_face_install_update);
                    } else {
                        boolean zIsCurrent = baseWatchFaceBeanA.isCurrent();
                        x72 x72Var2 = zIsCurrent ? new x72(4, R$string.watch_face_install_experienting) : new x72(0, R$string.watch_face_install_experienment);
                        x72Var2.f(!zIsCurrent);
                        x72Var = x72Var2;
                    }
                } else {
                    x72Var = new x72(0, R$string.watch_face_install_experienment);
                }
                coiVar.v(x72Var);
                coiVar.w(item);
                arrayList.add(coiVar);
            }
        }
        return new guf<>(body.getIsEnd(), arrayList);
    }
}
