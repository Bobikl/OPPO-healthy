package com.oplus.aiunit.vision;

import com.heytap.health.sleep.formula.formula.jni.HealthLogProxy;
import com.heytap.health.sleep.formula.formula.jni.OsaAlgorithm;

/* JADX INFO: loaded from: classes18.dex */
public class byh {
    public static boolean a = false;

    public class a implements HealthLogProxy {
        @Override // com.heytap.health.sleep.formula.formula.jni.HealthLogProxy
        public void debug(String str) {
        }

        @Override // com.heytap.health.sleep.formula.formula.jni.HealthLogProxy
        public void error(String str) {
            a7b.b("CToJavaLog", str);
        }

        @Override // com.heytap.health.sleep.formula.formula.jni.HealthLogProxy
        public void info(String str) {
            a7b.f("CToJavaLog", str);
        }
    }

    public static void a() {
        if (a) {
            a7b.f("SnoreLogManager", "already init health log success");
        } else if (OsaAlgorithm.initHealthLog(new a()) == 0) {
            a7b.f("SnoreLogManager", "init health log success");
            a = true;
        }
    }
}
