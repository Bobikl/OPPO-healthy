package com.heytap.nearx.tangramconfig.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.device.CommonConditions;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/heytap/nearx/tangramconfig/util/ScreenUtil;", "", "()V", "getExResolution", "Lcom/heytap/nearx/tangramconfig/device/CommonConditions;", "context", "Landroid/content/Context;", "getResolution", "", "getScreenHeight", "", "getScreenWidth", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ScreenUtil {

    @NotNull
    public static final ScreenUtil INSTANCE = new ScreenUtil();

    private ScreenUtil() {
    }

    @NotNull
    public final CommonConditions getExResolution(@NotNull Context context) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        int screenWidth = getScreenWidth(context);
        int screenHeight = getScreenHeight(context);
        if (context.getResources().getConfiguration().orientation != 2) {
            i2 = screenHeight;
            i = screenWidth;
        } else {
            i = screenHeight;
            i2 = screenWidth;
        }
        return new CommonConditions(i, i2, null, 4, null);
    }

    @NotNull
    public final String getResolution(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        sb.append(getScreenWidth(context));
        sb.append(':');
        sb.append(getScreenHeight(context));
        return sb.toString();
    }

    public final int getScreenHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "windowManager.getDefaultDisplay()");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final int getScreenWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "windowManager.getDefaultDisplay()");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
