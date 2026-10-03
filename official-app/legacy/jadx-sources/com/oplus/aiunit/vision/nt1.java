package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.wearable.emergency.api.R$string;

/* JADX INFO: loaded from: classes2.dex */
public class nt1 {
    public static final int BLOOD_TYPE_AB_YANG = 5;
    public static final int BLOOD_TYPE_AB_YIN = 6;
    public static final int BLOOD_TYPE_A_YANG = 1;
    public static final int BLOOD_TYPE_A_YIN = 2;
    public static final int BLOOD_TYPE_B_YANG = 3;
    public static final int BLOOD_TYPE_B_YIN = 4;
    public static final int BLOOD_TYPE_HH = 9;
    public static final int BLOOD_TYPE_O_YANG = 7;
    public static final int BLOOD_TYPE_O_YIN = 8;
    public static final int BLOOD_TYPE_UNKNOWN = 10;

    public static String a(int i) {
        switch (i) {
            case 1:
            case 2:
                return BaseApplication.a().getString(R$string.settings_blood_type_a);
            case 3:
            case 4:
                return BaseApplication.a().getString(R$string.settings_blood_type_b);
            case 5:
            case 6:
                return BaseApplication.a().getString(R$string.settings_blood_type_ab);
            case 7:
            case 8:
                return BaseApplication.a().getString(R$string.settings_blood_type_o);
            case 9:
                return BaseApplication.a().getString(R$string.settings_blood_type_hh);
            default:
                return BaseApplication.a().getString(R$string.settings_blood_type_unknown);
        }
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return BaseApplication.a().getString(R$string.settings_blood_type_a_yang);
            case 2:
                return BaseApplication.a().getString(R$string.settings_blood_type_a_yin);
            case 3:
                return BaseApplication.a().getString(R$string.settings_blood_type_b_yang);
            case 4:
                return BaseApplication.a().getString(R$string.settings_blood_type_b_yin);
            case 5:
                return BaseApplication.a().getString(R$string.settings_blood_type_ab_yang);
            case 6:
                return BaseApplication.a().getString(R$string.settings_blood_type_ab_yin);
            case 7:
                return BaseApplication.a().getString(R$string.settings_blood_type_o_yang);
            case 8:
                return BaseApplication.a().getString(R$string.settings_blood_type_o_yin);
            case 9:
                return BaseApplication.a().getString(R$string.settings_blood_type_hh_non);
            default:
                return BaseApplication.a().getString(R$string.settings_blood_type_unknown);
        }
    }

    public static int c(@NonNull String str, boolean z) {
        if (str.equalsIgnoreCase(BaseApplication.a().getString(R$string.settings_blood_type_a))) {
            return z ? 2 : 1;
        }
        if (str.equalsIgnoreCase(BaseApplication.a().getString(R$string.settings_blood_type_b))) {
            return z ? 4 : 3;
        }
        if (str.equalsIgnoreCase(BaseApplication.a().getString(R$string.settings_blood_type_ab))) {
            return z ? 6 : 5;
        }
        if (str.equalsIgnoreCase(BaseApplication.a().getString(R$string.settings_blood_type_o))) {
            return z ? 8 : 7;
        }
        return str.equalsIgnoreCase(BaseApplication.a().getString(R$string.settings_blood_type_hh)) ? 9 : 10;
    }

    public static boolean d(int i) {
        return (i == 9 || i == 10 || i % 2 != 0) ? false : true;
    }
}
