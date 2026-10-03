package com.platform.usercenter.tools.ui;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public class LayoutGridHelper {
    public static final int COLUMN_DEFAULT = 4;
    public static final int COLUMN_EXPANDED = 12;
    private static final int COLUMN_GUTTER = 8;
    public static final int COLUMN_MEDIUM = 8;
    public static final int MARGIN_LARGE = 24;
    public static final int MARGIN_SMALL = 16;
    private static final int SCREEN_EXPANDED = 840;
    private static final int SCREEN_MEDIUM = 600;

    public static int getContentWidthPx(Context context, int i) {
        int iDip2px = DisplayUtil.dip2px(context, 8.0f);
        int gridColumns = getGridColumns(context) - (getMarginColumns(context) * 2);
        return (oneColumnWidthPx(context, i) * gridColumns) + ((gridColumns - 1) * iDip2px);
    }

    public static int getDefaultContentWidthPx(Context context) {
        return getContentWidthPx(context, DisplayUtil.dip2px(context, 16.0f));
    }

    public static int getDefaultMarginPx(Context context) {
        return getMarginPx(context, DisplayUtil.dip2px(context, 16.0f));
    }

    public static int getGridColumns(Context context) {
        int i = context.getResources().getConfiguration().screenWidthDp;
        if (i >= 840) {
            return 12;
        }
        return i >= 600 ? 8 : 4;
    }

    public static int getMarginColumns(Context context) {
        int i = context.getResources().getConfiguration().screenWidthDp;
        if (i >= 840) {
            return 2;
        }
        return i >= 600 ? 1 : 0;
    }

    public static int getMarginPx(Context context, int i) {
        int iDip2px = DisplayUtil.dip2px(context, 8.0f);
        return i + ((iDip2px + oneColumnWidthPx(context, i)) * getMarginColumns(context));
    }

    public static int oneColumnWidthPx(Context context, int i) {
        int iDip2px = DisplayUtil.dip2px(context, context.getResources().getConfiguration().screenWidthDp);
        int iDip2px2 = DisplayUtil.dip2px(context, 8.0f);
        int gridColumns = getGridColumns(context);
        return ((iDip2px - (i * 2)) - (iDip2px2 * (gridColumns - 1))) / gridColumns;
    }
}
