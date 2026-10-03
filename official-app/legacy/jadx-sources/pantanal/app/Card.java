package pantanal.app;

import android.view.View;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.bean.CardCategory;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH'J\n\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H\u0016J(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\n2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0014H'J\b\u0010\u0015\u001a\u00020\u0004H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\rH\u0017¨\u0006\u0018"}, d2 = {"Lpantanal/app/Card;", "Lpantanal/app/IPantanalService;", "Lpantanal/app/ICardLifecycle;", "exitLongPressMode", "", "getCardType", "Lpantanal/app/bean/CardCategory;", "getCustomConfig", "", "key", "", "getInnerCard", "onDragEnd", "", "needReplaceChannel", "onDragStart", "onRenderFailed", "performMenuItemClickAction", "action", "extraMap", "", "releaseView", "setAllowCardRefreshable", "refreshable", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Card extends IPantanalService, ICardLifecycle {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object getInnerCard(@NotNull Card card) {
            return new Object();
        }

        @Nullable
        public static View getView(@NotNull Card card) {
            return IPantanalService.DefaultImpls.getView(card);
        }

        public static /* synthetic */ boolean onDragEnd$default(Card card, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDragEnd");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return card.onDragEnd(z);
        }

        public static void onForceUpdate(@NotNull Card card, @NotNull ICardLifecycle.LifeCycleValue lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            ICardLifecycle.DefaultImpls.onForceUpdate(card, lifecycle);
        }

        public static void onRenderFailed(@NotNull Card card) {
        }

        public static void onScrollState(@NotNull Card card, int i) {
            ICardLifecycle.DefaultImpls.onScrollState(card, i);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_54)
        public static void setAllowCardRefreshable(@NotNull Card card, boolean z) {
        }

        public static void setUIDataInterceptor(@NotNull Card card, @NotNull UIDataInterceptor cb) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            IPantanalService.DefaultImpls.setUIDataInterceptor(card, cb);
        }
    }

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
    void exitLongPressMode();

    @NotNull
    CardCategory getCardType();

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
    @Nullable
    Object getCustomConfig(@NotNull String key);

    @Nullable
    Object getInnerCard();

    boolean onDragEnd(boolean needReplaceChannel);

    void onDragStart();

    void onRenderFailed();

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
    boolean performMenuItemClickAction(@NotNull String action, @Nullable Map<String, ? extends Object> extraMap);

    void releaseView();

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_54)
    void setAllowCardRefreshable(boolean refreshable);
}
