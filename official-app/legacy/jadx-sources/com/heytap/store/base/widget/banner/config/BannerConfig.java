package com.heytap.store.base.widget.banner.config;

import com.heytap.store.platform.tools.SizeUtils;

/* JADX INFO: loaded from: classes3.dex */
public class BannerConfig {
    public static final int ANIM_DURATION = 150;
    public static final int INDICATOR_HEIGHT;
    public static final int INDICATOR_MARGIN;
    public static final int INDICATOR_NORMAL_COLOR = -1;
    public static final int INDICATOR_NORMAL_WIDTH;
    public static final int INDICATOR_RADIUS;
    public static final int INDICATOR_SELECTED_COLOR = -7829368;
    public static final int INDICATOR_SELECTED_WIDTH;
    public static final int INDICATOR_SPACE;
    public static final boolean IS_AUTO_LOOP = true;
    public static final boolean IS_INFINITE_LOOP = true;
    public static final int LOOP_TIME = 3500;
    public static final int SCROLL_TIME = 800;

    static {
        SizeUtils sizeUtils = SizeUtils.INSTANCE;
        INDICATOR_NORMAL_WIDTH = sizeUtils.dp2px(5.0f);
        INDICATOR_SELECTED_WIDTH = sizeUtils.dp2px(7.0f);
        INDICATOR_SPACE = sizeUtils.dp2px(5.0f);
        INDICATOR_MARGIN = sizeUtils.dp2px(5.0f);
        INDICATOR_HEIGHT = sizeUtils.dp2px(3.0f);
        INDICATOR_RADIUS = sizeUtils.dp2px(3.0f);
    }
}
