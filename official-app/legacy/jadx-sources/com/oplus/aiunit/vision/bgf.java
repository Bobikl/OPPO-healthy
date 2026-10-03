package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bgf {
    public static final String RECONCILIATION_APP_KEY = a7m.a(":;=;");
    public static final String RECONCILIATION_APP_SECRET = a7m.a("\u007fGB9O_Xnz8~b8]:GIb1[|RDey}{^;I~L");

    public static boolean a(String str) {
        MinCommonConfig minCommonConfigJ;
        List<String> reconciliationAppIds;
        if (TextUtils.isEmpty(str) || "149700".equals(str)) {
            return false;
        }
        try {
            ou3 ou3Var = t56.configService;
            if (ou3Var != null && (minCommonConfigJ = ou3Var.j()) != null && (reconciliationAppIds = minCommonConfigJ.getReconciliationAppIds()) != null && !reconciliationAppIds.isEmpty()) {
                return reconciliationAppIds.contains("ALL") || reconciliationAppIds.contains(str);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
