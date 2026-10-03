package com.oplus.aiunit.vision;

import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class nmk {
    public static HashMap<String, String> a;

    static {
        HashMap<String, String> map = new HashMap<>();
        a = map;
        map.put("/nfc/entrance", "/entrance/index");
        a.put("/nfc/entrance/entranceForward", "/entrance/entranceForward");
        a.put("/nfc/entrance/addCardType", "/entrance/addCardType");
        a.put("/nfc/entrance/findOutMore", "/entrance/findOutMore");
        a.put("/nfc/entrance/useTips", "/entrance/useTips");
        a.put("/nfc/entrance/realNameAuth", "/entrance/realNameAuth");
        a.put("/nfc/entrance/addWhiteCard", "/entrance/addWhiteCard");
        a.put("/nfc/entrance/suckCard", "/entrance/suckCard");
        a.put("/nfc/entrance/preWriteData", "/entrance/preWriteData");
        a.put("/nfc/entrance/writeData", "/entrance/writeData");
        a.put("/nfc/entrance/operateService", "/entrance/operateService");
    }

    public static String a(String str) {
        String strC = c(str);
        return str.replace(strC, a.get(strC));
    }

    public static String b(String str) {
        return a.containsKey(c(str)) ? a(str) : str;
    }

    public static String c(String str) {
        if (str == null) {
            return str;
        }
        String strReplace = str.replace("wallet://fintech", "");
        return strReplace.contains("?") ? strReplace.substring(0, strReplace.indexOf("?")) : strReplace;
    }
}
