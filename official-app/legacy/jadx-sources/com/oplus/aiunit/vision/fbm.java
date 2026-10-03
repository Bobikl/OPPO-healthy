package com.oplus.aiunit.vision;

import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes19.dex */
public class fbm {
    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b() {
        return Const.Scheme.SCHEME_FILE.equals(a("ro.crypto.type"));
    }
}
