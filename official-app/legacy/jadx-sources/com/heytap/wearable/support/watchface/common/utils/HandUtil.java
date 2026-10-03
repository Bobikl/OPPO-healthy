package com.heytap.wearable.support.watchface.common.utils;

import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class HandUtil {
    private static final float HOUR_DEGREE = 30.0f;
    private static final float HOUR_TO_MINUTE = 60.0f;
    private static final float MINUTE_DEGREE = 6.0f;
    private static final float MINUTE_TO_SECOND = 60.0f;
    private static final float SECOND_DEGREE = 6.0f;

    public static float[] getHandDegrees(Calendar calendar) {
        int i = calendar.get(10);
        float f = calendar.get(12);
        float f2 = calendar.get(13);
        return new float[]{(i * 30.0f) + ((f / 60.0f) * 30.0f), (f * 6.0f) + ((f2 / 60.0f) * 6.0f), f2 * 6.0f};
    }

    public static float getHourHandDegree(Calendar calendar) {
        return (calendar.get(10) * 30.0f) + ((calendar.get(12) / 60.0f) * 30.0f);
    }

    public static float[] getPreviewTimeHandDegrees(Calendar calendar) {
        return new float[]{calendar.get(10) * 30.0f, calendar.get(12) * 6.0f, calendar.get(13) * 6.0f};
    }
}
