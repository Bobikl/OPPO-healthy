package com.heytap.nearx.uikit.widget.grid;

import android.content.Context;
import android.content.res.Resources;
import com.heytap.nearx.uikit.R$dimen;

/* JADX INFO: loaded from: classes18.dex */
public class NearPercentUtils {
    private static final int CARD_LIST_FLAG = 2;
    private static final int LARGE_SCRREN_GRID_SIZE = 12;
    private static final int LARGE_SCRREN_WIDTH_LIMIT = 840;
    private static final int MEDIUM_SCRREN_GRID_SIZE = 8;
    private static final int MEDIUM_SCRREN_WIDTH_LIMIT = 600;
    private static final int PADDING_COUNT = 2;
    private static final int PREFERENCE_FLAG = 1;
    private static final int SMALL_SCRREN_GRID_SIZE = 4;
    private static final int SMALL_SCRREN_WIDTH_LIMIT = 480;

    public static float calculateWidth(float f, int i, int i2, int i3, Context context) {
        if (i <= 0 || i > i2) {
            return f;
        }
        boolean z = i3 == 1 || i3 == 2;
        int dimensionPixelOffset = (i3 == 2 ? context.getResources().getDimensionPixelOffset(R$dimen.grid_guide_coulmn_card_margin_start) : context.getResources().getDimensionPixelOffset(R$dimen.grid_guide_coulmn_default_margin_start)) * 2;
        Resources resources = context.getResources();
        int i4 = R$dimen.grid_guide_coulmn_gap;
        return ((((f - dimensionPixelOffset) - ((i2 - 1) * resources.getDimensionPixelOffset(i4))) / i2) * i) + (context.getResources().getDimensionPixelOffset(i4) * Math.max(i - 1, 0)) + (z ? dimensionPixelOffset : 0);
    }

    public static int getTotalGridSize(Context context) {
        int i = context.getResources().getConfiguration().screenWidthDp;
        if (i < 600) {
            return 4;
        }
        if (i < 840) {
            return 8;
        }
        return i > 840 ? 12 : 4;
    }
}
