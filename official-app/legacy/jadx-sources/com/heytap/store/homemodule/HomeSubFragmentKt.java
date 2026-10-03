package com.heytap.store.homemodule;

import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.platform.tools.ContextGetterUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"REQUEST_INTERVAL_TIME", "", "SCREEN_BIG_SIZE", "", "SCREEN_NO", "SCREEN_PAD", "SCREEN_PHONE", "SCREEN_SMALL_SIZE", "SCROLL_TOP_ICON_VISIBLE_THRESHOLD", "TAG", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HomeSubFragmentKt {
    public static final int REQUEST_INTERVAL_TIME = 60;

    @NotNull
    private static final String SCREEN_BIG_SIZE = "1680x2400";
    public static final int SCREEN_NO = 0;
    public static final int SCREEN_PAD = 2;
    public static final int SCREEN_PHONE = 1;

    @NotNull
    private static final String SCREEN_SMALL_SIZE = "960x1920";
    private static final int SCROLL_TOP_ICON_VISIBLE_THRESHOLD = DisplayUtil.getScreenHeight(ContextGetterUtils.INSTANCE.getApp());

    @NotNull
    private static final String TAG = "HomeSubFragment";
}
