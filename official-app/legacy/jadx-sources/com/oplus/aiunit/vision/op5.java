package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class op5 {
    public static final String BAND = "Band";
    public static final String BAND2 = "BAND2";
    public static final String BANDHSB = "BANDHSB";
    public static final String[] BANDS;
    public static final String MANUAL = "Manual";
    public static final String MERGER = "merge";
    public static final String MOBILE = "mobile";
    public static final String[] NEED_ADD_WORKOUT_DEVICE;
    public static final String NOT_SET = "";
    public static final String PHONE = "Phone";
    public static final String[] PHONE_DEVICE;
    public static final String REALME_GT = "REALME_GT";
    public static final String[] ROUND_WATCH;
    public static final String[] SQUARE_BAND;
    public static final String[] SQUARE_WATCH;
    public static final String THIRD = "THIRD";
    public static final String WATCH = "Watch";
    public static final String WATCH2 = "WATCH2";
    public static final String WATCH3 = "WATCH3";
    public static final String WATCH3PRO = "WATCH3PRO";
    public static final String WATCH3SE = "WATCH3SE";
    public static final String WATCH4 = "WATCH4";
    public static final String WATCH4PRO = "WATCH4PRO";
    public static final String[] WATCHES;
    public static final String[] WATCHES_RX;
    public static final String WATCH_ASTRA;
    public static final String WATCH_BAGEL = "WATCH_BAGEL";
    public static final String WATCH_COCO;
    public static final String WATCH_COLUMBUS;
    public static final String WATCH_GT = "WATCH_GT";
    public static final String WATCH_OPPO_SPORT;
    public static final String[] WATCH_OR_BAND_DEVICE;
    public static final String WATCH_STAR = "WATCH_STAR";
    public static final String WATCH_STAR_RIVER = "WATCH_STAR_RIVER";
    public static final String WATCH_TAYCAN;
    public static final String WATCH_iWATCH;
    public static final String[] a;

    static {
        DeviceConstants.Companion aVar = DeviceConstants.INSTANCE;
        String strF = aVar.f();
        WATCH_ASTRA = strF;
        String strL = aVar.L();
        WATCH_OPPO_SPORT = strL;
        String strX = aVar.x();
        WATCH_COLUMBUS = strX;
        String strI = aVar.I();
        WATCH_iWATCH = strI;
        String strW = aVar.W();
        WATCH_TAYCAN = strW;
        String strT = aVar.t();
        WATCH_COCO = strT;
        a = new String[]{aVar.k0()};
        PHONE_DEVICE = new String[]{PHONE, "mobile", ""};
        WATCH_OR_BAND_DEVICE = new String[]{BAND, WATCH, WATCH2, WATCH3, WATCH3PRO, WATCH_GT, BAND2, REALME_GT, BANDHSB, WATCH3SE, WATCH4PRO, WATCH4, WATCH_STAR, WATCH_BAGEL, WATCH_STAR_RIVER, strF, strL, strX, strW, strT};
        WATCHES = new String[]{WATCH, WATCH2, WATCH3, WATCH3PRO, WATCH3SE, WATCH4PRO, WATCH4, WATCH_STAR, WATCH_BAGEL, WATCH_STAR_RIVER, strF, strL, strX, strW, strT};
        BANDS = new String[]{BAND, BAND2, BANDHSB};
        WATCHES_RX = new String[]{WATCH_GT, REALME_GT};
        ROUND_WATCH = new String[]{WATCH_GT, REALME_GT, WATCH_STAR, WATCH_BAGEL, strF, strL, WATCH_STAR_RIVER, strX, strW, strT};
        SQUARE_WATCH = new String[]{WATCH, WATCH2, WATCH3, WATCH3PRO, WATCH3SE, WATCH4PRO, WATCH4, strI};
        SQUARE_BAND = new String[]{BAND, BAND2, BANDHSB};
        NEED_ADD_WORKOUT_DEVICE = new String[]{PHONE, BAND, WATCH_GT};
    }

    public static boolean a(String str) {
        return Arrays.asList(ROUND_WATCH).contains(str);
    }

    public static boolean b(String str) {
        return Arrays.asList(SQUARE_BAND).contains(str);
    }

    public static boolean c(String str) {
        return Arrays.asList(SQUARE_WATCH).contains(str);
    }

    public static boolean d(String str) {
        if (hz.a(str)) {
            return false;
        }
        return Arrays.asList(WATCH_OR_BAND_DEVICE).contains(str);
    }

    public static boolean e(String str) {
        if (hz.a(str)) {
            return false;
        }
        return Arrays.asList(NEED_ADD_WORKOUT_DEVICE).contains(str);
    }

    public static boolean f(String str) {
        if (hz.a(str)) {
            return false;
        }
        return Arrays.asList(a).contains(str);
    }
}
