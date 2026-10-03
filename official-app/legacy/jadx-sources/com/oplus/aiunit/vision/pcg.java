package com.oplus.aiunit.vision;

import com.oplus.web.container.config.model.ConfigInfo;
import com.oplus.web.container.config.model.InfoType;
import com.oplus.web.container.config.model.WhitelistConfig;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class pcg {
    public static void a(String str) {
        tt3.b(str);
    }

    public static boolean b(String str) {
        List<WhitelistConfig> list;
        if (str != null && str.equals(c94.b().getPackageName())) {
            return true;
        }
        ConfigInfo configInfoA = tt3.a();
        if (configInfoA != null && (list = configInfoA.whitelistConfig) != null) {
            for (WhitelistConfig whitelistConfig : list) {
                if (InfoType.PKG_NAME.value.equalsIgnoreCase(whitelistConfig.whitelistType)) {
                    String str2 = whitelistConfig.whitelistContent;
                    return str2 != null && str2.equals(str);
                }
            }
        }
        return false;
    }

    public static boolean c(String str, int i) {
        List<WhitelistConfig> list;
        String strA = ymk.a(str);
        ConfigInfo configInfoA = tt3.a();
        if (configInfoA == null || (list = configInfoA.whitelistConfig) == null) {
            return true;
        }
        Iterator<WhitelistConfig> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return i == HostSecurityLevel.NONE.value;
            }
            WhitelistConfig next = it.next();
            if (InfoType.DOMAIN.value.equalsIgnoreCase(next.whitelistType)) {
                if (strA != null && strA.endsWith(next.whitelistContent)) {
                    z = true;
                }
                if (z && i <= next.riskLevel) {
                    return true;
                }
            }
        }
    }

    public static boolean d(String str) {
        List<WhitelistConfig> list;
        if (!ppc.a(str)) {
            m7b.l("verifyWhiteHost", "isFileUrl");
            return true;
        }
        String strA = ymk.a(str);
        ConfigInfo configInfoA = tt3.a();
        if (configInfoA == null || (list = configInfoA.whitelistConfig) == null) {
            return true;
        }
        for (WhitelistConfig whitelistConfig : list) {
            if (strA == null || strA.endsWith(whitelistConfig.whitelistContent)) {
                return true;
            }
        }
        return strA != null && aia.a(strA);
    }
}
