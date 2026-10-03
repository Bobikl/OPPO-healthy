package com.oplus.seedling.sdk.seedling;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.seedling.sdk.callback.ParseDataByEngineCallback;
import com.oplus.seedling.sdk.callback.StartActivityCallback;
import com.oplus.seedling.sdk.entity.ShortcutsConfig;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0017\u0018\u0000 R2\u00020\u0001:\u0001RB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0006H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\fH\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u000204H\u0016J\u001e\u00105\u001a\u00020)2\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!\u0018\u000107H\u0016J\u001e\u00108\u001a\u00020\u00042\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!\u0018\u000107H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020)H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020)H\u0016J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020?H\u0016J\u0018\u0010@\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\fH\u0016J\u0010\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\fH\u0016J\u0018\u0010B\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\fH\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0016J \u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020\fH\u0016J\u001a\u0010J\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001c2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\fH\u0016J\u0018\u0010M\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\f2\u0006\u0010O\u001a\u00020)H\u0016J\u0010\u0010P\u001a\u00020\u00042\u0006\u00103\u001a\u00020QH\u0016J\u0010\u0010P\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0006H\u0016¨\u0006S"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/SeedlingCompatibleImpl;", "Lcom/oplus/seedling/sdk/seedling/ISeedling;", "()V", "defaultLog", "", "methodName", "", "destroy", "getBusinessPkgName", "getCardEngineType", "Lcom/oplus/seedling/sdk/seedling/SeedlingCardEngineType;", "getCardType", "", "getCodeContext", "getCurrentPageId", "getIntentList", "callback", "Lcom/oplus/seedling/sdk/callback/StartActivityCallback;", "getServiceId", "getShortcutsConfigInfo", "", "Lcom/oplus/seedling/sdk/entity/ShortcutsConfig;", "getTimestamp", "", "getUIData", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "getUpkVersion", "getView", "Landroid/view/View;", "getViewBySize", "cardSize", "getViewListBySize", "getViewProperty", "", "view", Node.I_KEY, "getViewScreenshot", "Landroid/graphics/Bitmap;", "interceptStartActivity", "notifyCanStartAnimation", "canStartAnimation", "", "notifyLiteReload", "notifySizeChange", "oldSize", "newSize", "onHide", "onShow", "onTrimMemory", "level", "parseDataByEngine", "data", "Lcom/oplus/seedling/sdk/callback/ParseDataByEngineCallback;", "performCardClickAction", "params", "", "performClick", "setAODStatus", "status", "setAllowCardRefreshable", "refreshable", "setDynamicConfiguration", "configurations", "Landroid/os/Bundle;", "setMaxHeight", ParserTag.TAG_MAX_HEIGHT, "setMaxWidth", ParserTag.TAG_MAX_WIDTH, "setScreenLocked", "locked", "setSecondaryScreenCapsuleDarkMode", "isDarkMode", "isNeedAnimation", "duration", "setViewStatusListener", "listener", "Lcom/oplus/seedling/sdk/seedling/IViewStatusListener;", "setWidgetColor", "color", "isColorReversed", "updateData", "", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SeedlingCompatibleImpl implements ISeedling {

    @NotNull
    private static final String TAG = "SeedlingManagerDefaultImpl";

    private final void defaultLog(String methodName) {
        ht9.a.e(s8e.INSTANCE, TAG, "warning, default impl! maybe version is not compatible, method name:" + methodName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void destroy() {
        defaultLog("destroy");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @Nullable
    public String getBusinessPkgName() {
        defaultLog("getBusinessPkgName");
        return null;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @NotNull
    public SeedlingCardType getCardEngineType() {
        SeedlingCardType seedlingCardType = SeedlingCardType.ENGINE_TYPE_UNKNOWN;
        defaultLog("getSeedlingCardType,return defaultType = " + seedlingCardType);
        return seedlingCardType;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public int getCardType() {
        defaultLog("getCardType");
        return -1;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @Nullable
    public String getCodeContext() {
        defaultLog("getCodeContext");
        return null;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @NotNull
    public String getCurrentPageId() {
        defaultLog("getCurrentPageId");
        return "";
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @Deprecated(message = "do not use it")
    public void getIntentList(@NotNull StartActivityCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        defaultLog("getIntentList");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @NotNull
    public String getServiceId() {
        defaultLog("getServiceId");
        return "";
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @NotNull
    public List<ShortcutsConfig> getShortcutsConfigInfo() {
        defaultLog("getShortcutsConfigInfo");
        return CollectionsKt.emptyList();
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public long getTimestamp() {
        defaultLog("getTimestamp");
        return 0L;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @Nullable
    public SeedlingUIData getUIData() {
        defaultLog("getUIData");
        return null;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @NotNull
    public String getUpkVersion() {
        defaultLog("getUpkVersion");
        return "";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @NotNull
    public View getView() throws KotlinNothingValueException {
        defaultLog("getView");
        Intrinsics.checkNotNull((Object) null);
        throw new KotlinNothingValueException();
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @Nullable
    public View getViewBySize(int cardSize) {
        defaultLog("getViewBySize");
        return null;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @NotNull
    public List<View> getViewListBySize(int cardSize) {
        defaultLog("getViewListBySize");
        return CollectionsKt.emptyList();
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @Nullable
    public Object getViewProperty(@NotNull View view, @NotNull String key) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        defaultLog("getViewProperty");
        return null;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    @Nullable
    public Bitmap getViewScreenshot() {
        defaultLog("getViewScreenshot");
        return null;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void interceptStartActivity(@NotNull StartActivityCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        defaultLog("interceptStartActivity");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void notifyCanStartAnimation(@NotNull View view, boolean canStartAnimation) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultLog("notifyCanStartAnimation");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void notifyLiteReload() {
        defaultLog("notifyLiteReload");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void notifySizeChange(int oldSize, int newSize) {
        defaultLog("notifySizeChange");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void onHide() {
        defaultLog("onHide");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void onShow() {
        defaultLog("onShow");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void onTrimMemory(int level) {
        defaultLog("onTrimMemory");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void parseDataByEngine(@NotNull String data, @NotNull ParseDataByEngineCallback callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        defaultLog("parseDataByEngine");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public boolean performCardClickAction(@Nullable Map<String, ? extends Object> params) {
        defaultLog("performCardClickAction");
        return false;
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void performClick(@Nullable Map<String, ? extends Object> params) {
        defaultLog("performClick");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setAODStatus(boolean status) {
        defaultLog("setAODStatus");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setAllowCardRefreshable(boolean refreshable) {
        defaultLog("setAllowCardRefreshable,refreshable:" + refreshable);
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setDynamicConfiguration(@NotNull View view, @NotNull Bundle configurations) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        defaultLog("setDynamicConfiguration");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setMaxHeight(int maxHeight) {
        defaultLog("setMaxHeight for all view");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setMaxWidth(int maxWidth) {
        defaultLog("setMaxWidth for all view");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setScreenLocked(boolean locked) {
        defaultLog("setScreenLocked");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setSecondaryScreenCapsuleDarkMode(boolean isDarkMode, boolean isNeedAnimation, int duration) {
        defaultLog("setSecondaryScreenCapsuleDarkMode");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setViewStatusListener(@NotNull View view, @Nullable IViewStatusListener listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultLog("setViewStatusListener");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setWidgetColor(int color) {
        defaultLog("setWidgetColor(color)");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void updateData(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        defaultLog("updateData string");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setMaxHeight(@NotNull View view, int maxHeight) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultLog("setMaxHeight for single view");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setMaxWidth(@NotNull View view, int maxWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        defaultLog("setMaxWidth for single view");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void setWidgetColor(int color, boolean isColorReversed) {
        defaultLog("setWidgetColor(color, isColorReversed)");
    }

    @Override // com.oplus.seedling.sdk.seedling.ISeedling
    public void updateData(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        defaultLog("updateData byteArray");
    }
}
