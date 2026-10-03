package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.platform.account.webview.api.config.InitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class z80 {
    public static Map<String, InitConfig> a = new ConcurrentHashMap();

    @Nullable
    public static InitConfig a(String str) {
        if (str == null) {
            return null;
        }
        return a.get(str);
    }

    public static void b(String str, InitConfig initConfig) {
        if (str == null || initConfig == null) {
            bn.c("AppContext", "businessModule or appConfig is null");
        } else {
            a.put(str, initConfig);
        }
    }
}
