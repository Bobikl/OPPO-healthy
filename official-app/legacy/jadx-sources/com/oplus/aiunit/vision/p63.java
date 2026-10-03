package com.oplus.aiunit.vision;

import android.os.Parcelable;
import android.text.TextUtils;
import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes19.dex */
public class p63 extends q63 {
    public p63() {
        super("A0000006320101055800022058100000", z60.APPLET_VENDER_SNB);
        this.f = q63.g;
    }

    @Override // com.oplus.aiunit.vision.q63
    public void B(ha2 ha2Var, z92 z92Var) {
    }

    public final NfcConsumeRecord C(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 46) {
            return null;
        }
        NfcConsumeRecord nfcConsumeRecord = new NfcConsumeRecord();
        nfcConsumeRecord.serialNumber = str.substring(0, 4);
        nfcConsumeRecord.amount = e1j.f(e1j.e(str.substring(10, 18)));
        nfcConsumeRecord.terminalCode = str.substring(20, 32);
        nfcConsumeRecord.transeType = str.substring(18, 20);
        nfcConsumeRecord.transTime = str.substring(32, 46);
        return nfcConsumeRecord;
    }

    public final NfcConsumeRecord D(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 46) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        String strSubstring = str.substring(36, 46);
        try {
            if (i2 < Integer.valueOf(strSubstring.substring(0, 2)).intValue()) {
                i--;
            }
        } catch (Exception e2) {
            t6b.d(this.f15640e, "formatGuangdongMoc, date handle exception: " + e2.getMessage());
        }
        String str2 = String.valueOf(i) + strSubstring;
        NfcConsumeRecord nfcConsumeRecord = new NfcConsumeRecord();
        nfcConsumeRecord.serialNumber = str.substring(0, 4);
        nfcConsumeRecord.amount = e1j.f(e1j.e(str.substring(10, 18)));
        nfcConsumeRecord.terminalCode = str.substring(20, 32);
        nfcConsumeRecord.transeType = str.substring(18, 20);
        nfcConsumeRecord.transTime = str2;
        return nfcConsumeRecord;
    }

    @Override // com.oplus.aiunit.vision.w92
    public boolean k(int i) {
        return ((long) (i & 8)) > 0;
    }

    @Override // com.oplus.aiunit.vision.q63
    public boolean p(z92 z92Var, int i) {
        String[] strArr = z60.TRANS_RECORD_CODES_C400_18;
        z92Var.b(1400, strArr, ".*(9000|6A83)$");
        z92Var.d("00A40400105943542E555345525800022058100000", ".*(9000)$");
        z92Var.d("00A4000002ddf1", ".*(9000)$");
        z92Var.d("00A4000002adf3", ".*(9000)$");
        z92Var.b(4100, strArr, ".*(9000|6A83)$");
        return true;
    }

    @Override // com.oplus.aiunit.vision.q63
    public boolean r(z92 z92Var, int i) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.q63
    public void z(ha2 ha2Var, z92 z92Var) {
        String result;
        NfcConsumeRecord nfcConsumeRecordD;
        String result2;
        NfcConsumeRecord nfcConsumeRecordC;
        ArrayList<? extends Parcelable> arrayListA = h0b.a();
        if (drk.e(z92Var.getCommands())) {
            return;
        }
        for (int i = 0; i < z60.TRANS_RECORD_CODES_0400.length; i++) {
            v92 v92VarA = z92Var.a(i + 1400);
            if (v92VarA != null && !TextUtils.isEmpty(v92VarA.getResult())) {
                t6b.b("RecordParser", v92VarA.getResult());
                if (!Pattern.matches("0{31,}9000", v92VarA.getResult()) && (result2 = v92VarA.getResult()) != null && (nfcConsumeRecordC = C(result2)) != null) {
                    arrayListA.add(nfcConsumeRecordC);
                }
            }
        }
        for (int i2 = 0; i2 < z60.TRANS_RECORD_CODES_0400.length; i2++) {
            v92 v92VarA2 = z92Var.a(i2 + 4100);
            if (v92VarA2 != null && !TextUtils.isEmpty(v92VarA2.getResult())) {
                t6b.b("RecordParser2", v92VarA2.getResult());
                if (!Pattern.matches("0{31,}9000", v92VarA2.getResult()) && (result = v92VarA2.getResult()) != null && (nfcConsumeRecordD = D(result)) != null) {
                    arrayListA.add(nfcConsumeRecordD);
                }
            }
        }
        ha2Var.i(8, arrayListA);
    }
}
