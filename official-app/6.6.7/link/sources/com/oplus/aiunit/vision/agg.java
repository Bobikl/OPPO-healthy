package com.oplus.aiunit.vision;

import com.oplus.web.container.config.model.ConfigInfo;
import com.oplus.web.container.config.model.InfoType;
import com.oplus.web.container.config.model.WhitelistConfig;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class agg {
    public static void a(String str) {
        hu3.b(str);
    }

    public static boolean b(String str) {
        List<WhitelistConfig> list;
        if (str != null && str.equals(q94.b().getPackageName())) {
            return true;
        }
        ConfigInfo configInfoA = hu3.a();
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
        String strA = drk.a(str);
        ConfigInfo configInfoA = hu3.a();
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
        if (!hrc.a(str)) {
            y8b.l("verifyWhiteHost", "isFileUrl");
            return true;
        }
        String strA = drk.a(str);
        ConfigInfo configInfoA = hu3.a();
        if (configInfoA == null || (list = configInfoA.whitelistConfig) == null) {
            return true;
        }
        for (WhitelistConfig whitelistConfig : list) {
            if (strA == null || strA.endsWith(whitelistConfig.whitelistContent)) {
                return true;
            }
        }
        return strA != null && ija.a(strA);
    }
}
