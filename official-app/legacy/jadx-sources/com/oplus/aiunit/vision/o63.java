package com.oplus.aiunit.vision;

import com.heytap.wallet.business.bus.bean.TrafficCardInfo;

/* JADX INFO: loaded from: classes19.dex */
public class o63 extends q63 {
    public o63() {
        super("4351515041592E5359533331", z60.APPLET_VENDER_KE_WEI);
        this.f = q63.h;
    }

    @Override // com.oplus.aiunit.vision.q63
    public void B(ha2 ha2Var, z92 z92Var) {
    }

    @Override // com.oplus.aiunit.vision.w92
    public boolean k(int i) {
        return ((long) (i & 2)) > 0 || ((long) (i & 4)) > 0;
    }

    @Override // com.oplus.aiunit.vision.q63
    public boolean m(z92 z92Var, int i) {
        z92Var.d("00A40000023F00", ".*(9000)$");
        z92Var.c(1300, "00B0850030", ".*(9000)$");
        if ((i & 4) <= 0) {
            return true;
        }
        z92Var.d(z60.CMD_APDU_CARD_INFO_00A40000023F01, ".*(9000)$");
        z92Var.c(3100, z60.CMD_APDU_CARD_INFO_00B0950000, ".*(9000)$");
        return true;
    }

    @Override // com.oplus.aiunit.vision.q63
    public boolean r(z92 z92Var, int i) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.q63
    public void u(ha2 ha2Var, z92 z92Var) {
        v92 v92VarA = z92Var.a(1300);
        v92 v92VarA2 = z92Var.a(3100);
        String result = v92VarA != null ? v92VarA.getResult() : null;
        if (result == null || result.length() <= 56) {
            return;
        }
        String strSubstring = result.substring(0, 16);
        String strV = v(ha2Var, z92Var);
        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
        trafficCardInfo.cardNo = strV;
        trafficCardInfo.aid = this.a;
        trafficCardInfo.isInBlackList = false;
        trafficCardInfo.cardIssuerId = strSubstring;
        String result2 = v92VarA2 != null ? v92VarA2.getResult() : null;
        if (result2 != null && result2.length() >= 20) {
            trafficCardInfo.startDate = result2.substring(8, 16);
            trafficCardInfo.endDate = result2.substring(16, 24);
        }
        t6b.b(this.f15640e, trafficCardInfo.toString());
        ha2Var.h(4, trafficCardInfo);
    }
}
