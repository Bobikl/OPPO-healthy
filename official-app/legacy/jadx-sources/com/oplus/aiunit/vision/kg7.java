package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class kg7 {
    public static String a(String str) {
        try {
            String[] strArrSplit = str.split("\\.");
            return (strArrSplit.length == 3 && strArrSplit[1].length() == 1) ? strArrSplit[1] : "A";
        } catch (Exception unused) {
            ltl.b("FirmwareUtil", "[getFirmwareId] firmwareVersion " + str + " convert error.");
            return "A";
        }
    }

    public static int b(String str) {
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length != 3 || strArrSplit[1].length() != 1) {
                return 1;
            }
            String[] strArrSplit2 = strArrSplit[2].split("_");
            return (Integer.valueOf(strArrSplit2[0]).intValue() * 10000) + Integer.valueOf(strArrSplit2[1]).intValue();
        } catch (Exception unused) {
            ltl.b("FirmwareUtil", "[getFirmwareVersionCode] firmwareVersion " + str + " convert error.");
            return 1;
        }
    }
}
