package com.heytap.nearx.uikit.widget.banner;

import com.oplus.aiunit.vision.whc;

/* JADX INFO: loaded from: classes18.dex */
public class NearBannerUtil {
    public static final float DEFAULT_CENTER = 0.5f;
    public static final int DEF_DURATION = 5;
    public static final int DEF_LEFT_ITEM_WIDTH = 0;
    public static final int DEF_PAGE_MARGIN = whc.c(24);
    public static final int DEF_RIGHT_ITEM_WIDTH = 0;
    public static final int INCREASE_COUNT = 2;
    public static final int INVALID_VALUE = -1;
    public static final boolean IS_AUTO_LOOP = true;
    public static final boolean IS_INFINITE_LOOP = true;

    public static int getRealPosition(boolean z, int i, int i2) {
        if (!z) {
            return i;
        }
        if (i == 0) {
            return i2 - 1;
        }
        if (i == i2 + 1) {
            return 0;
        }
        return i - 1;
    }
}
