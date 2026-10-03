package com.oplus.seedling.sdk.seedling;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import com.oplus.seedling.sdk.callback.ParseDataByEngineCallback;
import com.oplus.seedling.sdk.callback.StartActivityCallback;
import com.oplus.seedling.sdk.entity.ShortcutsConfig;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0005H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\b\u0010\u0013\u001a\u00020\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0019H'J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\tH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\u0006\u0010\u001b\u001a\u00020\tH&J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H&J\n\u0010 \u001a\u0004\u0018\u00010!H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u0003H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH&J\b\u0010*\u001a\u00020\u0003H&J\b\u0010+\u001a\u00020\u0003H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\tH&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00052\u0006\u0010\r\u001a\u000200H&J\u001e\u00101\u001a\u00020%2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u000103H&J\u001e\u00104\u001a\u00020\u00032\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u000103H'J\u0010\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020%H&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020%H&J\u0018\u00109\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010:\u001a\u00020;H&J\u0018\u0010<\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\tH&J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\tH&J\u0018\u0010>\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\tH&J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\tH&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020%H&J \u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020\tH&J\u001a\u0010F\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010G\u001a\u0004\u0018\u00010HH&J\u0012\u0010I\u001a\u00020\u00032\b\b\u0001\u0010J\u001a\u00020\tH'J\u001a\u0010I\u001a\u00020\u00032\b\b\u0001\u0010J\u001a\u00020\t2\u0006\u0010K\u001a\u00020%H&J\u0010\u0010L\u001a\u00020\u00032\u0006\u0010/\u001a\u00020MH&J\u0010\u0010L\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0005H&¨\u0006N"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/ISeedling;", "", "destroy", "", "getBusinessPkgName", "", "getCardEngineType", "Lcom/oplus/seedling/sdk/seedling/SeedlingCardEngineType;", "getCardType", "", "getCodeContext", "getCurrentPageId", "getIntentList", "callback", "Lcom/oplus/seedling/sdk/callback/StartActivityCallback;", "getServiceId", "getShortcutsConfigInfo", "", "Lcom/oplus/seedling/sdk/entity/ShortcutsConfig;", "getTimestamp", "", "getUIData", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "getUpkVersion", "getView", "Landroid/view/View;", "getViewBySize", "cardSize", "getViewListBySize", "getViewProperty", "view", "key", "getViewScreenshot", "Landroid/graphics/Bitmap;", "interceptStartActivity", "notifyCanStartAnimation", "canStartAnimation", "", "notifyLiteReload", "notifySizeChange", "oldSize", "newSize", "onHide", "onShow", "onTrimMemory", "level", "parseDataByEngine", "data", "Lcom/oplus/seedling/sdk/callback/ParseDataByEngineCallback;", "performCardClickAction", "params", "", "performClick", "setAODStatus", "status", "setAllowCardRefreshable", "refreshable", "setDynamicConfiguration", "configurations", "Landroid/os/Bundle;", "setMaxHeight", ParserTag.TAG_MAX_HEIGHT, "setMaxWidth", ParserTag.TAG_MAX_WIDTH, "setScreenLocked", "locked", "setSecondaryScreenCapsuleDarkMode", "isDarkMode", "isNeedAnimation", "duration", "setViewStatusListener", "listener", "Lcom/oplus/seedling/sdk/seedling/IViewStatusListener;", "setWidgetColor", "color", "isColorReversed", "updateData", "", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ISeedling {
    void destroy();

    @Nullable
    String getBusinessPkgName();

    @NotNull
    SeedlingCardType getCardEngineType();

    int getCardType();

    @Nullable
    String getCodeContext();

    @NotNull
    String getCurrentPageId();

    @Deprecated(message = "do not use it")
    void getIntentList(@NotNull StartActivityCallback callback);

    @NotNull
    String getServiceId();

    @NotNull
    List<ShortcutsConfig> getShortcutsConfigInfo();

    long getTimestamp();

    @Nullable
    SeedlingUIData getUIData();

    @NotNull
    String getUpkVersion();

    @Deprecated(message = "do not use it after fluid cloud version, please use getViewBySize or getViewListBySize")
    @NotNull
    View getView();

    @Nullable
    View getViewBySize(int cardSize);

    @NotNull
    List<View> getViewListBySize(int cardSize);

    @Nullable
    Object getViewProperty(@NotNull View view, @NotNull String key);

    @Nullable
    Bitmap getViewScreenshot();

    void interceptStartActivity(@NotNull StartActivityCallback callback);

    void notifyCanStartAnimation(@NotNull View view, boolean canStartAnimation);

    void notifyLiteReload();

    void notifySizeChange(int oldSize, int newSize);

    void onHide();

    void onShow();

    void onTrimMemory(int level);

    void parseDataByEngine(@NotNull String data, @NotNull ParseDataByEngineCallback callback);

    boolean performCardClickAction(@Nullable Map<String, ? extends Object> params);

    @Deprecated(message = "do not use it after fluid cloud version, please use performCardClickAction")
    void performClick(@Nullable Map<String, ? extends Object> params);

    void setAODStatus(boolean status);

    void setAllowCardRefreshable(boolean refreshable);

    void setDynamicConfiguration(@NotNull View view, @NotNull Bundle configurations);

    void setMaxHeight(int maxHeight);

    void setMaxHeight(@NotNull View view, int maxHeight);

    void setMaxWidth(int maxWidth);

    void setMaxWidth(@NotNull View view, int maxWidth);

    void setScreenLocked(boolean locked);

    void setSecondaryScreenCapsuleDarkMode(boolean isDarkMode, boolean isNeedAnimation, int duration);

    void setViewStatusListener(@NotNull View view, @Nullable IViewStatusListener listener);

    @Deprecated(message = "do not use it after sdk 1.0.35 version, please use params contain both color and isColorReversed")
    void setWidgetColor(@ColorInt int color);

    void setWidgetColor(@ColorInt int color, boolean isColorReversed);

    void updateData(@NotNull String data);

    void updateData(@NotNull byte[] data);
}
