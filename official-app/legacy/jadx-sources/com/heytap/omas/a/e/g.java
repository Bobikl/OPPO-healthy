package com.heytap.omas.a.e;

import androidx.annotation.NonNull;
import com.heytap.omas.omkms.data.EnvConfig;

/* JADX INFO: loaded from: classes19.dex */
public final class g {
    private static final String a = "GenUserInfoUtils";

    public static String a(@NonNull com.heytap.omas.omkms.data.h hVar) {
        StringBuilder sb;
        String strA;
        if (hVar == null) {
            throw new IllegalArgumentException("InitParamSpec cannot be null");
        }
        EnvConfig envConfig = EnvConfig.RELEASE;
        if (hVar.getEnvConfig() != null) {
            envConfig = hVar.getEnvConfig();
        }
        hVar.getAreaCode().toString();
        String authMode = hVar.getAuthMode();
        authMode.hashCode();
        if (authMode.equals(com.heytap.omas.a.b.c.b)) {
            byte[] bArrA = c.a(com.heytap.omas.a.b.c.b.getBytes(), hVar.getAppName(), hVar.getAreaCode().toString().getBytes());
            sb = new StringBuilder();
            sb.append(envConfig.getEnvName());
            sb.append("_");
            strA = d.a(bArrA);
        } else {
            if (!authMode.equals("WB")) {
                throw new IllegalStateException("Always should not take place here, Unexpected authMode value: " + hVar.getAuthMode());
            }
            byte[] bArrA2 = c.a("WB".getBytes(), hVar.getAppName(), hVar.getWbId(), hVar.getWbKeyId(), hVar.getWbVersionBytes(), hVar.getAreaCode().toString().getBytes());
            sb = new StringBuilder();
            sb.append(envConfig.getEnvName());
            sb.append("_");
            strA = d.a(bArrA2);
        }
        sb.append(strA);
        String string = sb.toString();
        hVar.getAuthMode();
        return string;
    }
}
