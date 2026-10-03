package pantanal.app;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.ColorInt;
import com.oplus.seedling.sdk.callback.ParseDataByEngineCallback;
import com.oplus.seedling.sdk.seedling.IViewStatusListener;
import com.oplus.seedling.sdk.seedling.SeedlingCardType;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0005H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\r\u001a\u00020\u000eH&J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0005H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0018H&J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH&J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000eH&J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H&J\u001e\u0010%\u001a\u00020\u001a2\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010'H&J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001aH&J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H&J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u000eH&J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000eH&J\u0018\u0010/\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\f2\u0006\u00100\u001a\u00020\u000eH&J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000eH&J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u001aH&J \u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u000eH&J\u001a\u00107\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u000109H&J\u001a\u0010:\u001a\u00020\u00182\b\b\u0001\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u001aH&¨\u0006="}, d2 = {"Lpantanal/app/SeedlingCard;", "Lpantanal/app/Card;", "getCardEngineType", "Lcom/oplus/seedling/sdk/seedling/SeedlingCardEngineType;", "getCodeContext", "", "getCurrentPageId", "getServiceId", "getTimestamp", "", "getUpkVersion", "getViewBySize", "Landroid/view/View;", "cardSize", "", "getViewListBySize", "", "getViewProperty", "", "view", "key", "getViewScreenShot", "Landroid/graphics/Bitmap;", "notifyCanStartAnimation", "", "canStartAnimation", "", "notifyLiteReload", "notifySizeChange", "oldSize", "newSize", "onTrimMemory", "level", "parseDataByEngine", "data", "callback", "Lcom/oplus/seedling/sdk/callback/ParseDataByEngineCallback;", "performCardClickAction", "params", "", "setAODStatus", "status", "setDynamicConfiguration", "configurations", "Landroid/os/Bundle;", "setMaxHeight", ParserTag.TAG_MAX_HEIGHT, "setMaxWidth", ParserTag.TAG_MAX_WIDTH, "setScreenLocked", "locked", "setSecondaryScreenCapsuleDarkMode", "isDarkMode", "isNeedAnimation", "duration", "setViewStatusListener", "listener", "Lcom/oplus/seedling/sdk/seedling/IViewStatusListener;", "setWidgetColor", "color", "isColorReversed", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SeedlingCard extends Card {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object getInnerCard(@NotNull SeedlingCard seedlingCard) {
            return Card.DefaultImpls.getInnerCard(seedlingCard);
        }

        @Nullable
        public static View getView(@NotNull SeedlingCard seedlingCard) {
            return Card.DefaultImpls.getView(seedlingCard);
        }

        public static void onForceUpdate(@NotNull SeedlingCard seedlingCard, @NotNull ICardLifecycle.LifeCycleValue lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Card.DefaultImpls.onForceUpdate(seedlingCard, lifecycle);
        }

        public static void onRenderFailed(@NotNull SeedlingCard seedlingCard) {
            Card.DefaultImpls.onRenderFailed(seedlingCard);
        }

        public static void onScrollState(@NotNull SeedlingCard seedlingCard, int i) {
            Card.DefaultImpls.onScrollState(seedlingCard, i);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_54)
        public static void setAllowCardRefreshable(@NotNull SeedlingCard seedlingCard, boolean z) {
            Card.DefaultImpls.setAllowCardRefreshable(seedlingCard, z);
        }

        public static void setUIDataInterceptor(@NotNull SeedlingCard seedlingCard, @NotNull UIDataInterceptor cb) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Card.DefaultImpls.setUIDataInterceptor(seedlingCard, cb);
        }
    }

    @NotNull
    SeedlingCardType getCardEngineType();

    @Nullable
    String getCodeContext();

    @NotNull
    String getCurrentPageId();

    @NotNull
    String getServiceId();

    long getTimestamp();

    @NotNull
    String getUpkVersion();

    @Nullable
    View getViewBySize(int cardSize);

    @NotNull
    List<View> getViewListBySize(int cardSize);

    @Nullable
    Object getViewProperty(@NotNull View view, @NotNull String key);

    @Nullable
    Bitmap getViewScreenShot();

    void notifyCanStartAnimation(@NotNull View view, boolean canStartAnimation);

    void notifyLiteReload();

    void notifySizeChange(int oldSize, int newSize);

    void onTrimMemory(int level);

    void parseDataByEngine(@NotNull String data, @NotNull ParseDataByEngineCallback callback);

    boolean performCardClickAction(@Nullable Map<String, ? extends Object> params);

    void setAODStatus(boolean status);

    void setDynamicConfiguration(@NotNull View view, @NotNull Bundle configurations);

    void setMaxHeight(int maxHeight);

    void setMaxHeight(@NotNull View view, int maxHeight);

    void setMaxWidth(int maxWidth);

    void setMaxWidth(@NotNull View view, int maxWidth);

    void setScreenLocked(boolean locked);

    void setSecondaryScreenCapsuleDarkMode(boolean isDarkMode, boolean isNeedAnimation, int duration);

    void setViewStatusListener(@NotNull View view, @Nullable IViewStatusListener listener);

    void setWidgetColor(@ColorInt int color, boolean isColorReversed);
}
