package com.heytap.connect.config.event;

import com.heytap.connect.api.logger.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class StartTimeUtils {
    public static long startTime;

    public static void end(String str) {
        Logger.INSTANCE.d(str + " time_cost:", String.valueOf(System.currentTimeMillis() - startTime), null, new Object[0]);
    }

    public static void start() {
        startTime = System.currentTimeMillis();
    }
}
