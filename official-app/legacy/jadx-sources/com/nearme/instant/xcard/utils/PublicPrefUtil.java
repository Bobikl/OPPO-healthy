package com.nearme.instant.xcard.utils;

import android.content.Context;
import com.nearme.instant.xcard.provider.PublicSharedPreferences;

/* JADX INFO: loaded from: classes5.dex */
public class PublicPrefUtil {
    public static final int INIT_STATUS_NOT_INITIALIZED = 0;
    public static final int INIT_STATUS_START_FINISHED = 2;
    public static final int INIT_STATUS_START_NOT_FINISHED = 1;
    private static final String PREF_KEY_CARD_INIT_STATUS = "pref_card_init_status";
    private static final String PREF_KEY_SDK_CLASSES_LIST = "pref_sdk_classes_list";
    private static final String PUBLIC_SHARED_PREF = "public_shared_pref";
    private static Context sContext;

    public static void checkCardPkgListUpdate() {
        String string = new PublicSharedPreferences(sContext).getString(PREF_KEY_SDK_CLASSES_LIST, "");
        if (string.equals(getCardPackageList())) {
            return;
        }
        setCardPackageList(string);
    }

    @InitStat
    public static int getCardInitStatus() {
        return sContext.getSharedPreferences(PUBLIC_SHARED_PREF, 0).getInt(PREF_KEY_CARD_INIT_STATUS, 0);
    }

    public static String getCardPackageList() {
        return sContext.getSharedPreferences(PUBLIC_SHARED_PREF, 0).getString(PREF_KEY_SDK_CLASSES_LIST, "");
    }

    public static void init(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            sContext = context;
        } else {
            sContext = applicationContext;
        }
    }

    public static void setCardInitStatus(@InitStat int i) {
        sContext.getSharedPreferences(PUBLIC_SHARED_PREF, 0).edit().putInt(PREF_KEY_CARD_INIT_STATUS, i).commit();
    }

    public static void setCardPackageList(String str) {
        sContext.getSharedPreferences(PUBLIC_SHARED_PREF, 0).edit().putString(PUBLIC_SHARED_PREF, str);
    }
}
