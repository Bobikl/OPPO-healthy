package com.oplus.aiunit.vision;

import com.heytap.accessory.logging.CommonLog;
import com.heytap.accessory.utils.XmlReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class t35 {
    public static final Map<String, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("CN", "CN");
        map.put(alf.IN, alf.IN);
        String[] strArr = {"PR", alf.PS, "PW", "PY", alf.QA, "AD", alf.AE, CommonLog.COMMON_TAG, "AG", c0.SPNAME, "AL", "AM", "AO", "AQ", "AR", "AS", "RE", "AU", "AW", "AX", "AZ", "BB", "BD", "BF", "RW", alf.BH, "BI", "BJ", "BL", "BM", "BN", "BO", alf.SA, "BQ", "SB", alf.BR, "SC", "BS", "SD", XmlReader.TRANSPORT_BT, "BV", alf.SG, "BW", "SH", alf.BY, "SJ", "BZ", "SL", "SM", "SN", "SO", alf.CA, "SR", "CC", apj.Thread_Type_ScheduledExecutor_Single, "ST", "CD", "CF", "SV", "CG", alf.SY, "CI", "SZ", "CK", "CL", "CM", alf.CO, "CR", "TC", "TD", "CU", "TF", "CV", "TG", alf.TH, "CX", "TJ", "TK"};
        for (int i = 0; i < 78; i++) {
            a.put(strArr[i], alf.SG);
        }
        a.put(alf.RU, alf.RU);
        String[] strArr2 = {"DE", "NO", apj.Thread_Type_Rxjava_Single, "BE", "FI", "PT", "BG", "DK", "LT", "LU", "LV", "HR", "FR", "HU", "SE", "SI", "SK", "GB", "IE", "EE", "CH", "MT", "IS", "GR", "IT", apj.Thread_Type_Executor_Single, "AT", "CY", "CZ", "PL", "RO", "LI", "NL", alf.TR, "BA", "EUEX"};
        for (int i2 = 0; i2 < 36; i2++) {
            a.put(strArr2[i2], "EU");
        }
    }

    public static String a(String str) {
        String str2;
        return (str == null || str.isEmpty() || (str2 = a.get(str.toUpperCase())) == null) ? alf.SG : str2;
    }
}
