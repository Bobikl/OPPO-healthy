package com.heytap.accessory.pair.utils;

import com.heytap.accessory.pair.logging.PairLog;
import com.oplus.aiunit.vision.v9g;

/* JADX INFO: loaded from: classes14.dex */
public class FalseCountUtils {
    private static final String SECURITY_FC_PREFIX = "security_fc_";
    private static final String SECURITY_TIME_PREFIX = "security_time_";
    private static final String TAG = "FalseCountUtils";

    public static boolean checkFalseCountMax(String str) {
        FalseCount falseCountLoadFalseCount = loadFalseCount(str);
        if (falseCountLoadFalseCount.isValidInTime()) {
            return falseCountLoadFalseCount.isMaxCount();
        }
        if (falseCountLoadFalseCount.getCount() <= 0) {
            return false;
        }
        falseCountLoadFalseCount.reset();
        saveFalseCount(str, falseCountLoadFalseCount);
        return false;
    }

    public static void increaseFalseCount(String str) {
        FalseCount falseCountLoadFalseCount = loadFalseCount(str);
        falseCountLoadFalseCount.increase();
        PairLog.w(TAG, "increaseFalseCount, fc: " + falseCountLoadFalseCount.getCount() + "; id = " + str);
        saveFalseCount(str, falseCountLoadFalseCount);
    }

    private static FalseCount loadFalseCount(String str) {
        return FalseCount.createByStoreValue(PlatformUtils.getPrivateSharedPreferences().E(SECURITY_FC_PREFIX + str, ""));
    }

    private static void saveFalseCount(String str, FalseCount falseCount) {
        if (falseCount == null) {
            return;
        }
        v9g privateSharedPreferences = PlatformUtils.getPrivateSharedPreferences();
        privateSharedPreferences.U(SECURITY_FC_PREFIX + str, falseCount.getStoreValue());
        privateSharedPreferences.i();
    }
}
