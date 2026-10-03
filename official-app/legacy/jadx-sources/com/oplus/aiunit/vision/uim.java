package com.oplus.aiunit.vision;

import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class uim {
    public static String a(String str) {
        String strA;
        try {
            strA = zum.a(str);
        } catch (Throwable unused) {
            strA = "";
        }
        if (!vam.c(strA)) {
            return strA;
        }
        return pmm.a(".SystemConfig" + File.separator + str);
    }
}
