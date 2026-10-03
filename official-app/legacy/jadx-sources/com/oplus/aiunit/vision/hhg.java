package com.oplus.aiunit.vision;

import android.app.Application;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class hhg {
    public static synchronized String a(String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.f("SchemeRegister", "pageCode is null or empty");
            return "";
        }
        if (jhg.a.size() == 0) {
            a7b.b("SchemeRegister", "Scheme horse map size is 0");
            jhg.b(b78.b(), jhg.a);
        }
        for (Map.Entry<String, String> entry : jhg.a.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                a7b.f("SchemeRegister", "scheme founded success: key=" + entry.getKey() + " ---> value=" + entry.getValue());
                return entry.getValue();
            }
        }
        return "";
    }

    public static synchronized void b(Application application) {
        a7b.f("SchemeRegister", "scheme register init begin");
        c(application);
    }

    public static void c(Application application) {
        jhg.b(application, jhg.a);
        a7b.f("SchemeRegister", "loadScheme: " + jhg.a.size());
    }
}
