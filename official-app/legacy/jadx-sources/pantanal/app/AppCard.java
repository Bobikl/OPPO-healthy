package pantanal.app;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lpantanal/app/AppCard;", "Lpantanal/app/Card;", "getSupportedMorphSizeList", "", "", "onSizeChange", "", "view", "Landroid/view/View;", "data", "Landroid/os/Bundle;", "setClientAliveComponent", "pkg", "", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AppCard extends Card {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object getInnerCard(@NotNull AppCard appCard) {
            return Card.DefaultImpls.getInnerCard(appCard);
        }

        @Nullable
        public static View getView(@NotNull AppCard appCard) {
            return Card.DefaultImpls.getView(appCard);
        }

        public static void onForceUpdate(@NotNull AppCard appCard, @NotNull ICardLifecycle.LifeCycleValue lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Card.DefaultImpls.onForceUpdate(appCard, lifecycle);
        }

        public static void onRenderFailed(@NotNull AppCard appCard) {
            Card.DefaultImpls.onRenderFailed(appCard);
        }

        public static void onScrollState(@NotNull AppCard appCard, int i) {
            Card.DefaultImpls.onScrollState(appCard, i);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_54)
        public static void setAllowCardRefreshable(@NotNull AppCard appCard, boolean z) {
            Card.DefaultImpls.setAllowCardRefreshable(appCard, z);
        }

        public static void setUIDataInterceptor(@NotNull AppCard appCard, @NotNull UIDataInterceptor cb) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Card.DefaultImpls.setUIDataInterceptor(appCard, cb);
        }
    }

    @Nullable
    List<Integer> getSupportedMorphSizeList();

    void onSizeChange(@NotNull View view, @NotNull Bundle data);

    void setClientAliveComponent(@NotNull String pkg);
}
