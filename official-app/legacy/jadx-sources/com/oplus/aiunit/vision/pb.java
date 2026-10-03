package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.common.constants.AcBaseConstants;

/* JADX INFO: loaded from: classes6.dex */
public class pb {
    public static final int COLOR_OS_5_0 = 9;
    public static final int COLOR_OS_7_2 = 18;
    public static final String DEFAULT_NULL = "";
    public static final int OPLUS_OS_12_1 = 24;

    public static int a() {
        try {
            Class<?> cls = Class.forName(AcBaseConstants.c.a());
            return ((Integer) cls.getDeclaredMethod(AcBaseConstants.c.b(), new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
