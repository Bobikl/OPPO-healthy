package com.oplus.aiunit.vision;

import android.os.Parcelable;
import android.text.TextUtils;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;
import com.heytap.wallet.business.bus.bean.TrafficCardInfo;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes19.dex */
public abstract class q63 extends w92 {
    public static final a g = new a(21, 40);
    public static final a h = new a(24, 40);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15640e;
    public a f;

    public static class a {
        public int a;
        public int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String a(String str) {
            int i;
            t6b.b("NoParser", "parseHci" + str);
            int i2 = this.a;
            if (i2 >= 0 && (i = this.b) >= 0 && i > i2 && str != null && str.length() > this.a) {
                int length = str.length();
                int i3 = this.b;
                if (length >= i3) {
                    return str.substring(this.a, i3);
                }
            }
            t6b.i("NoParser", "parseHci fail" + str);
            return null;
        }
    }

    public q63() {
        this.f15640e = "_bsc_";
    }

    public ha2 A(TaskResult taskResult, long j2) {
        ha2 ha2Var = new ha2();
        if (taskResult != null) {
            Content content = taskResult.getContent();
            if (9000 == taskResult.getResultCode() && (content instanceof z92)) {
                z92 z92Var = (z92) content;
                if ((1 & j2) > 0 && k(1)) {
                    w(ha2Var, z92Var, 1);
                } else if ((2 & j2) > 0 && k(2)) {
                    w(ha2Var, z92Var, 2);
                } else if ((4 & j2) > 0 && k(4)) {
                    w(ha2Var, z92Var, 4);
                } else if ((8 & j2) > 0 && k(8)) {
                    w(ha2Var, z92Var, 8);
                } else if ((j2 & 16) > 0 && k(16)) {
                    w(ha2Var, z92Var, 16);
                }
            }
        } else {
            ha2Var.a = 1;
        }
        return ha2Var;
    }

    public abstract void B(ha2 ha2Var, z92 z92Var);

    @Override // com.oplus.aiunit.vision.w92
    public z92 d(int i) {
        z92 z92Var = new z92();
        if (i > 0 && k(i)) {
            try {
                z92Var.b = n(z92Var, i);
            } catch (Exception e2) {
                t6b.d(this.f15640e, "buildContent, exception: " + e2.getMessage());
            }
        }
        return z92Var;
    }

    @Override // com.oplus.aiunit.vision.w92
    public ha2 h(TaskResult taskResult, int i) {
        long j2 = i;
        if (j2 <= 0) {
            return new ha2();
        }
        try {
            return A(taskResult, j2);
        } catch (Exception e2) {
            t6b.d(this.f15640e, "parseResult, exception: " + e2.getMessage());
            return new ha2(2);
        }
    }

    public boolean l(z92 z92Var, int i) {
        z92Var.c(1200, z60.CMD_APDU_BALANCE_805C000204, ".*(9000)$");
        return true;
    }

    public boolean m(z92 z92Var, int i) {
        z92Var.c(1300, z60.CMD_APDU_CARD_INFO_00B095001E, ".*(9000)$");
        return true;
    }

    public boolean n(z92 z92Var, int i) {
        q(z92Var, i);
        r(z92Var, i);
        return o(z92Var, i);
    }

    public boolean o(z92 z92Var, int i) {
        boolean zP = false;
        if ((i & 1) > 0 && k(1)) {
            zP = false | l(z92Var, i);
        }
        if (((i & 2) > 0 && k(2)) || ((i & 4) > 0 && k(4))) {
            zP |= m(z92Var, i);
        }
        if ((i & 8) > 0 && k(8)) {
            zP |= p(z92Var, i);
        }
        return ((i & 16) <= 0 || !k(16)) ? zP : zP | s(z92Var, i);
    }

    public boolean p(z92 z92Var, int i) {
        z92Var.b(1400, z60.TRANS_RECORD_CODES_C400_18, ".*(9000|6A83)$");
        return true;
    }

    public void q(z92 z92Var, int i) {
        z92Var.c(1100, w92.e(g()), ".*(9000)$");
    }

    public abstract boolean r(z92 z92Var, int i);

    public boolean s(z92 z92Var, int i) {
        z92Var.c(1500, z60.CMD_APDU_SITE_STATE_00B201D400, ".*(9000)$");
        return true;
    }

    public void t(ha2 ha2Var, z92 z92Var) {
        v92 v92VarA = z92Var.a(1200);
        String result = v92VarA != null ? v92VarA.getResult() : null;
        if (result == null || result.length() < 12) {
            return;
        }
        ha2Var.g(1, e1j.f(e1j.e(result.substring(2, result.length() - 4))));
    }

    public void u(ha2 ha2Var, z92 z92Var) {
        v92 v92VarA = z92Var.a(1300);
        String result = v92VarA != null ? v92VarA.getResult() : null;
        if (result == null || result.length() <= 56) {
            return;
        }
        String strSubstring = result.substring(0, 16);
        String strV = v(ha2Var, z92Var);
        String strSubstring2 = result.substring(40, 48);
        String strSubstring3 = result.substring(48, 56);
        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
        trafficCardInfo.cardNo = strV;
        trafficCardInfo.startDate = strSubstring2;
        trafficCardInfo.endDate = strSubstring3;
        trafficCardInfo.aid = this.a;
        trafficCardInfo.status = result.substring(18, 20);
        trafficCardInfo.isInBlackList = false;
        trafficCardInfo.cardIssuerId = strSubstring;
        t6b.b(this.f15640e, trafficCardInfo.toString());
        ha2Var.h(4, trafficCardInfo);
    }

    public String v(ha2 ha2Var, z92 z92Var) {
        v92 v92VarA = z92Var.a(1300);
        String result = v92VarA != null ? v92VarA.getResult() : null;
        a aVar = this.f;
        if (aVar == null || result == null) {
            return null;
        }
        String strA = aVar.a(result);
        if (strA != null) {
            ha2Var.j(2, strA);
        }
        return strA;
    }

    public void w(ha2 ha2Var, z92 z92Var, int i) {
        if (i == 1) {
            t(ha2Var, z92Var);
            return;
        }
        if (i == 2) {
            v(ha2Var, z92Var);
            return;
        }
        if (i == 4) {
            u(ha2Var, z92Var);
        } else if (i == 8) {
            z(ha2Var, z92Var);
        } else {
            if (i != 16) {
                return;
            }
            B(ha2Var, z92Var);
        }
    }

    public NfcConsumeRecord x(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 46) {
            return null;
        }
        NfcConsumeRecord nfcConsumeRecord = new NfcConsumeRecord();
        nfcConsumeRecord.serialNumber = str.substring(0, 4);
        nfcConsumeRecord.creditLine = Integer.valueOf(e1j.f(e1j.e(str.substring(4, 10))));
        nfcConsumeRecord.amount = e1j.f(e1j.e(str.substring(10, 18)));
        nfcConsumeRecord.transeType = str.substring(18, 20);
        nfcConsumeRecord.terminalCode = str.substring(20, 32);
        nfcConsumeRecord.transTime = str.substring(32, 46);
        return nfcConsumeRecord;
    }

    public void y(z92 z92Var, int i, int i2, ArrayList<NfcConsumeRecord> arrayList) {
        NfcConsumeRecord nfcConsumeRecordX;
        if (drk.e(z92Var.getCommands())) {
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            v92 v92VarA = z92Var.a(i + i3);
            if (v92VarA != null && !TextUtils.isEmpty(v92VarA.getResult())) {
                t6b.b("RecordParser", v92VarA.getResult());
                if (!Pattern.matches("0{46}9000", v92VarA.getResult()) && (nfcConsumeRecordX = x(v92VarA.getResult())) != null) {
                    arrayList.add(nfcConsumeRecordX);
                }
            }
        }
    }

    public void z(ha2 ha2Var, z92 z92Var) {
        ArrayList<? extends Parcelable> arrayListA = h0b.a();
        y(z92Var, 1400, 10, arrayListA);
        ha2Var.i(8, arrayListA);
    }

    public q63(String str, String str2) {
        super(str, str2);
        this.f15640e = "_bsc_";
    }
}
