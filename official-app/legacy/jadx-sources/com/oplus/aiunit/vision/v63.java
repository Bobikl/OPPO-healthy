package com.oplus.aiunit.vision;

import com.heytap.wallet.business.bus.bean.TrafficCardInfo;

/* JADX INFO: loaded from: classes19.dex */
public class v63 extends q63 {
    public v63() {
        super("A0000053425748544B", z60.APPLET_VENDER_SNB);
        this.f = new q63.a(0, 10);
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
        z92Var.c(1300, "00B08A0000", ".*(9000)$");
        if ((i & 4) <= 0) {
            return true;
        }
        z92Var.d("00A40000021001", ".*(9000)$");
        z92Var.d("0020000003123456", ".*(9000)$");
        z92Var.c(3100, z60.CMD_APDU_CARD_INFO_00B0950000, ".*(9000)$");
        return true;
    }

    @Override // com.oplus.aiunit.vision.q63
    public boolean r(z92 z92Var, int i) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.q63
    public void u(ha2 ha2Var, z92 z92Var) {
        v92 v92VarA = z92Var.a(3100);
        String result = v92VarA != null ? v92VarA.getResult() : null;
        if (result == null || result.length() <= 56) {
            return;
        }
        String strSubstring = result.substring(0, 4);
        String strV = v(ha2Var, z92Var);
        String strSubstring2 = result.substring(40, 48);
        String strSubstring3 = result.substring(48, 56);
        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
        trafficCardInfo.cardNo = strV;
        trafficCardInfo.startDate = strSubstring2;
        trafficCardInfo.endDate = strSubstring3;
        trafficCardInfo.aid = this.a;
        trafficCardInfo.status = result.substring(16, 18);
        trafficCardInfo.isInBlackList = false;
        trafficCardInfo.cardIssuerId = strSubstring;
        ha2Var.h(4, trafficCardInfo);
    }
}
