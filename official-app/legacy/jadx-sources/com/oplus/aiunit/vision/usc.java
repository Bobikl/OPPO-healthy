package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.heytap.health.watchface.network.bean.WatchFaceHomeInfoResp;
import com.heytap.theme.watch.domain.dto.response.common.ResponsesBody;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class usc extends i51<ResponsesBody<WatchFaceHomeInfoResp>> {
    public static final String TAG = "NoCompatibleListPresenter";

    @Override // com.oplus.aiunit.vision.i51
    public void L0(coi coiVar) {
        coiVar.I(String.format(i().getString(R$string.watch_face_my_buy_fmt), z0j.c(coiVar.h(), z0j.DATA_FMT1)));
    }

    @Override // com.oplus.aiunit.vision.s41
    public lbd<ResponsesBody<WatchFaceHomeInfoResp>> M(uo9 uo9Var, int i, int i2) {
        return uo9Var.c(i, i2);
    }

    @Override // com.oplus.aiunit.vision.s41
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public guf<o41> G(ResponsesBody<WatchFaceHomeInfoResp> responsesBody) {
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
                coiVar.H(item.getFileSize());
                coiVar.I(String.format(i().getString(item.isGiven() ? R$string.watch_face_my_buy_given_fmt : R$string.watch_face_my_buy_fmt), z0j.c(item.getPurchaseTime(), z0j.DATA_FMT1)));
                coiVar.A(item.getPay());
                coiVar.C(item.getPurchaseTime());
                coiVar.x(item.getJumpUrl());
                coiVar.K(item.getVersionCode());
                coiVar.z(item.isNotSupport());
                coiVar.F(item.getShape());
                P0(coiVar, item.getScreen(), item.getRadius());
                coiVar.L(item.getVersionId());
                coiVar.y(item.getMasterId());
                coiVar.v(N0(item));
                coiVar.w(item);
                arrayList.add(coiVar);
            }
        }
        return new guf<>(body.getIsEnd(), arrayList);
    }

    @NonNull
    public final x72 N0(WatchFaceHomeCard.Item item) {
        BaseWatchFaceBean baseWatchFaceBeanA;
        i11 i11VarJ = ntl.m().j(this.f13600n);
        if (i11VarJ != null && (baseWatchFaceBeanA = ial.a(i11VarJ, item.getPkgNameMd5())) != null) {
            if (vrl.b(baseWatchFaceBeanA.getWfVersion()) < item.getVersionCode()) {
                return new x72(1, R$string.watch_face_install_update);
            }
            boolean zIsCurrent = baseWatchFaceBeanA.isCurrent();
            x72 x72Var = zIsCurrent ? new x72(4, R$string.watch_face_install_had_apply) : new x72(0, R$string.watch_face_install_apply);
            x72Var.f(!zIsCurrent);
            return x72Var;
        }
        return new x72(0, R$string.watch_face_install_apply);
    }

    public final int O0(String str) {
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception e2) {
            ltl.i(TAG, "getValue " + e2);
            return 0;
        }
    }

    public final void P0(coi coiVar, String str, int i) {
        String[] strArrSplit;
        coiVar.E(i);
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split("#")) == null || strArrSplit.length != 2) {
            return;
        }
        coiVar.D(O0(strArrSplit[0]));
        coiVar.G(O0(strArrSplit[1]));
    }
}
