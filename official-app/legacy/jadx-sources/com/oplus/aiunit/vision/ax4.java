package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class ax4 {
    public static final Map<Integer, String> a;
    public static final Map<Integer, String> b;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        map.put(1, "com.heytap.wsport.courier.DailyEventCourier$Courier");
        map.put(2, "com.heytap.wsport.courier.HeartRateCourier$Courier");
        map.put(6, "com.heytap.wsport.courier.RestHeartRateCourier$Courier");
        map.put(3, "com.heytap.wsport.courier.SleepCourier$Courier");
        map.put(5, "com.heytap.wsport.courier.SportRecordCourier$Courier");
        map.put(7, "com.heytap.wsport.courier.StepDetailCourier$Courier");
        map.put(9, "com.heytap.wsport.courier.FitRecordFileCourier$Courier");
        map.put(12, "com.heytap.wsport.courier.EcgRecordCourier$Courier");
        map.put(13, "HeartRateNoticeCourier$Courier");
        map2.put(1, "com.heytap.wsport.courier.BLEDailyEventCourier$Courier");
        map2.put(2, "com.heytap.wsport.courier.BLEHeartRateCourier$Courier");
        map2.put(3, "com.heytap.wsport.courier.BLESleepCourier$Courier");
        map2.put(7, "com.heytap.wsport.courier.BLEStepDetailCourier$Courier");
    }

    public static v9g a() {
        return v9g.x(ad5.SP_NAME_DATA_START_TIME_FOR_WATCH_1);
    }

    public static int b(int i, String str, boolean z) {
        int iG;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String strC = c(i, z);
        if (strC == null) {
            d(i);
            return 0;
        }
        int iZ = a().z(erk.c(strC), 0);
        if (i == 2 && iZ > (iG = mzj.g())) {
            iZ = iG;
        }
        return Math.max(iZ, 0);
    }

    public static String c(int i, boolean z) {
        return (z ? b : a).get(Integer.valueOf(i));
    }

    public static void d(int i) {
        a7b.b("Data-Sync", "Watch 1 data type not config for start time manager, dataType=" + i);
    }

    public static void e(int i, String str, int i2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strC = c(i, z);
        if (strC == null) {
            d(i);
            return;
        }
        String strC2 = erk.c(strC);
        a7b.f("Data-Sync", "Save sport health data start time for w1, dataType=" + i + ", time=" + i2);
        a().S(strC2, i2);
    }
}
