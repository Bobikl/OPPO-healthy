package com.oplus.aiunit.vision;

import com.heytap.theme.watch.domain.dto.request.AppImpInfo;

/* JADX INFO: loaded from: classes19.dex */
public class vrl {
    public static AppImpInfo a(String str, String str2) {
        AppImpInfo appImpInfo = new AppImpInfo();
        appImpInfo.setPkgNameMd5(str);
        appImpInfo.setVersionCode(b(str2));
        return appImpInfo;
    }

    public static int b(String str) {
        return c(str);
    }

    public static int c(String str) {
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception e2) {
            ltl.i("WfInfoUtil", "getVersion " + e2);
            return 0;
        }
    }
}
