package com.heytap.store.homemodule.utils;

import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.util.Consumer;
import com.heytap.store.base.core.util.SpUtil;
import com.heytap.store.business.component.utils.ColorParseUtilKt;
import com.heytap.store.homemodule.data.ThemeInfo;
import com.heytap.store.platform.tools.GsonUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ThemeUtils {
    private static final String TAG = "ThemeUtils";
    private static final String THEME_SP_KEY = "indexTheme";
    private static ThemeInfo sCurrentThemeInfo;

    public class a extends SpUtil.SpResultSubscriber<String> {
        public final /* synthetic */ Consumer i;

        public a(Consumer consumer) {
            this.i = consumer;
        }

        @Override // com.heytap.store.base.core.util.SpUtil.SpResultSubscriber
        public void onFailure(Throwable th) {
            super.onFailure(th);
            this.i.accept(null);
        }

        @Override // com.heytap.store.base.core.util.SpUtil.SpResultSubscriber
        public void onSuccess(String str) {
            this.i.accept(ThemeInfo.fromJsonString(str));
        }
    }

    public static void getCachedIndexTheme(Consumer<ThemeInfo> consumer) {
        ThemeInfo themeInfo = sCurrentThemeInfo;
        if (themeInfo != null) {
            consumer.accept(themeInfo);
        } else {
            getCachedIndexTheme(new a(consumer));
        }
    }

    public static ThemeInfo getThemeInfo() {
        ThemeInfo themeInfo = sCurrentThemeInfo;
        return themeInfo == null ? new ThemeInfo() : themeInfo;
    }

    @ColorInt
    public static int parseColorSafely(String str, @ColorInt int i) {
        return ColorParseUtilKt.parseColorSafely(str, i);
    }

    public static void saveIndexTheme(ThemeInfo themeInfo) {
        sCurrentThemeInfo = themeInfo;
        SpUtil.putStringOnBackground(THEME_SP_KEY, GsonUtils.INSTANCE.toJson(themeInfo.getInfoMap()));
    }

    public static void setForceDarkAllowed(boolean z, View... viewArr) {
        if (viewArr == null || viewArr.length < 1) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setForceDarkAllowed(z);
            }
        }
    }

    @ColorInt
    public static int parseColorSafely(String str) {
        return parseColorSafely(str, -16777216);
    }

    private static void getCachedIndexTheme(SpUtil.SpResultSubscriber<String> spResultSubscriber) {
        SpUtil.getStringAsync(THEME_SP_KEY, GsonUtils.INSTANCE.toJson(new ThemeInfo()), spResultSubscriber);
    }
}
