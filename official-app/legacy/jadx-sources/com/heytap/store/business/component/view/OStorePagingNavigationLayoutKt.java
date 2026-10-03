package com.heytap.store.business.component.view;

import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"DEFAULT_COL", "", "DEFAULT_ROW", "MAX_COL", "MIN_COL", "MIN_ROW", "TAG", "", "clickedIcon", "", "", "getClickedIcon", "()Ljava/util/Map;", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OStorePagingNavigationLayoutKt {
    public static final int DEFAULT_COL = 5;
    public static final int DEFAULT_ROW = 2;
    public static final int MAX_COL = 5;
    public static final int MIN_COL = 1;
    public static final int MIN_ROW = 1;

    @NotNull
    private static final String TAG = "OStorePagingNavigationLayout";

    @NotNull
    private static final Map<Integer, Long> clickedIcon = new LinkedHashMap();

    @NotNull
    public static final Map<Integer, Long> getClickedIcon() {
        return clickedIcon;
    }
}
