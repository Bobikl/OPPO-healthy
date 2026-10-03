package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;

/* JADX INFO: loaded from: classes19.dex */
public class thf {
    public static thf b;
    public final String a = "RecordParser";

    public static thf e() {
        if (b == null) {
            synchronized (thf.class) {
                if (b == null) {
                    b = new thf();
                }
            }
        }
        return b;
    }

    public final String a(String str) {
        if (str == null || str.length() != 14) {
            return null;
        }
        String strB = e1j.b(System.currentTimeMillis(), e1j.format1);
        String strSubstring = strB.substring(0, 4);
        String strSubstring2 = strB.substring(4, 6);
        if (str.startsWith(strSubstring)) {
            return str;
        }
        if (Integer.valueOf(str.substring(4, 6)).intValue() <= Integer.valueOf(strSubstring2).intValue()) {
            return strSubstring + str.substring(4, str.length());
        }
        if (str.startsWith(String.valueOf(Integer.valueOf(strSubstring).intValue() - 1))) {
            return str;
        }
        return String.valueOf(Integer.valueOf(strSubstring).intValue() - 1) + str.substring(4, str.length());
    }

    public final NfcConsumeRecord b(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 46) {
            return null;
        }
        NfcConsumeRecord nfcConsumeRecord = new NfcConsumeRecord();
        nfcConsumeRecord.serialNumber = str.substring(0, 4);
        nfcConsumeRecord.amount = e1j.f(e1j.e(str.substring(10, 18)));
        nfcConsumeRecord.transeType = str.substring(18, 20);
        nfcConsumeRecord.terminalCode = str.substring(20, 32);
        nfcConsumeRecord.transTime = str.substring(32, 46);
        return nfcConsumeRecord;
    }

    public final NfcConsumeRecord c(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 46) {
            return null;
        }
        t6b.f("RecordParser", "formatGuangdong result = " + str);
        NfcConsumeRecord nfcConsumeRecord = new NfcConsumeRecord();
        nfcConsumeRecord.serialNumber = str.substring(0, 4);
        nfcConsumeRecord.amount = e1j.f(e1j.e(str.substring(10, 18)));
        nfcConsumeRecord.terminalCode = str.substring(20, 32);
        nfcConsumeRecord.transeType = str.substring(18, 20);
        nfcConsumeRecord.transTime = a(str.substring(32, 46));
        return nfcConsumeRecord;
    }

    public final NfcConsumeRecord d(String str) {
        NfcConsumeRecord nfcConsumeRecord = null;
        if (!TextUtils.isEmpty(str) && str.length() >= 36) {
            if (str.length() >= 50) {
                nfcConsumeRecord = new NfcConsumeRecord();
                nfcConsumeRecord.serialNumber = str.substring(0, 4);
                nfcConsumeRecord.balance = Integer.valueOf(e1j.f(e1j.e(str.substring(4, 10))));
                nfcConsumeRecord.amount = e1j.f(e1j.e(str.substring(10, 18)));
                nfcConsumeRecord.transeType = str.substring(18, 20);
                nfcConsumeRecord.terminalCode = str.substring(20, 32);
                nfcConsumeRecord.transTime = str.substring(32, 46);
            } else {
                t6b.h("RecordParse erro reulst:" + str + " length:" + str.length());
            }
            t6b.b("RecordParser", "record:" + nfcConsumeRecord);
        }
        return nfcConsumeRecord;
    }

    public NfcConsumeRecord f(String str, String str2) {
        NfcConsumeRecord nfcConsumeRecordD;
        if (TextUtils.isEmpty(str2)) {
            t6b.b("RecordParser", "cmdRlt is null");
            return null;
        }
        if ("5943542E555345525800022058100000".equalsIgnoreCase(str)) {
            nfcConsumeRecordD = c(str2);
        } else {
            nfcConsumeRecordD = v13.h(str) ? d(str2) : b(str2);
        }
        t6b.b("RecordParser", "NfcConsumeRecord = " + nfcConsumeRecordD);
        return nfcConsumeRecordD;
    }
}
