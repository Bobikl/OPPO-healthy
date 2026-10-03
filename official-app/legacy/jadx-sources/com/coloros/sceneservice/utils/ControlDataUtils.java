package com.coloros.sceneservice.utils;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public class ControlDataUtils {
    public static final String CARD_LIFE_TIME = "card_life_time";
    public static final String KEY_NO_BIND = "no_bind";
    public static final String KEY_SERVICE_ID = "serviceId";
    public static final String SILENCE_SHOW = "silence_show";

    public static long getCardLifeTime(Bundle bundle) {
        if (bundle != null) {
            long j2 = bundle.getLong(CARD_LIFE_TIME, -1L);
            if (j2 > 0) {
                return j2;
            }
        }
        return -1L;
    }

    public static String getServiceId(Bundle bundle) {
        return bundle != null ? bundle.getString("serviceId") : "";
    }

    public static boolean isNoBind(Bundle bundle) {
        return bundle.getBoolean(KEY_NO_BIND, false);
    }

    public static boolean isSilenceShow(Bundle bundle) {
        return bundle.getBoolean(SILENCE_SHOW, false);
    }
}
