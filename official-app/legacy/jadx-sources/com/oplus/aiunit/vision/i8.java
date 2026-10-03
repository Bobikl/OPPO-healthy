package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.config.AcAccountConfig;
import com.oplus.accountsdk.base.account.trace.AcLimitConcurrentLinkedQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class i8 {
    public static final HashMap<String, AcAccountConfig> a = new HashMap<>();
    public static volatile ConcurrentLinkedQueue<Map<String, String>> sHostChangeEvent = new AcLimitConcurrentLinkedQueue();

    public static AcAccountConfig a(String str) {
        return a.get(str);
    }

    public static void b(String str, AcAccountConfig acAccountConfig) {
        a.put(str, acAccountConfig);
    }
}
