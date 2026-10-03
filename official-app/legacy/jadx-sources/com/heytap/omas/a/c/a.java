package com.heytap.omas.a.c;

import android.text.TextUtils;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.h;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    private static final String a = "CipherUtil";

    /* JADX INFO: renamed from: com.heytap.omas.a.c.a$a, reason: collision with other inner class name */
    public static final class C0731a {
        private static final d a = e.a();
        private static final d b = c.a();

        private C0731a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static d b(String str) {
            return b.c(str);
        }
    }

    public static d a() {
        return C0731a.b;
    }

    public static void b() {
        try {
            Method declaredMethod = Class.forName("com.heytap.omasjce.provider.OmasProvider").getDeclaredMethod("registerOmasProvider", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e2) {
            i.b(a, "registerOmasProviderToSecurity: " + e2);
            throw new IllegalArgumentException("Should use Implementation 'com.heytap.omas.seckit:jce-andr:$jce-version' for omas-jce dependencies." + e2);
        }
    }

    public static d a(h hVar) {
        return hVar == null ? a() : a(hVar.getCipherProvider());
    }

    public static d a(String str) {
        return TextUtils.isEmpty(str) ? a() : C0731a.b(str);
    }
}
