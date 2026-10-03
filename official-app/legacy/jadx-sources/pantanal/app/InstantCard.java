package pantanal.app;

import android.os.Bundle;
import android.view.View;
import com.oplus.aiunit.vision.fr9;
import com.oplus.aiunit.vision.oba;
import com.oplus.aiunit.vision.oea;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\"\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0014H&J\u001c\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0016H&J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001aH&¨\u0006\u001c"}, d2 = {"Lpantanal/app/InstantCard;", "Lpantanal/app/Card;", "Lcom/oplus/aiunit/vision/fr9;", oea.CALLBACK, "", "registerCardMessageCallback", "", "code", "", "msg", "sendMessage", "replyMessage", "Landroid/os/Bundle;", "bundle", "Lcom/oplus/aiunit/vision/oba;", "instantCardInfo", "Lpantanal/app/OnLoadCallback;", "callback", "load", "onLoadData", "", "supportLoadData", "", "Ljava/lang/Object;", BridgeConstant.KEY_EXTRAS, "setExtras", "Lpantanal/app/PantanalNotifyCallback;", "notifyEngine", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0})
public interface InstantCard extends Card {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object getInnerCard(@NotNull InstantCard instantCard) {
            return Card.DefaultImpls.getInnerCard(instantCard);
        }

        @Nullable
        public static View getView(@NotNull InstantCard instantCard) {
            return Card.DefaultImpls.getView(instantCard);
        }

        public static void onForceUpdate(@NotNull InstantCard instantCard, @NotNull ICardLifecycle.LifeCycleValue lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Card.DefaultImpls.onForceUpdate(instantCard, lifecycle);
        }

        public static void onRenderFailed(@NotNull InstantCard instantCard) {
            Card.DefaultImpls.onRenderFailed(instantCard);
        }

        public static void onScrollState(@NotNull InstantCard instantCard, int i) {
            Card.DefaultImpls.onScrollState(instantCard, i);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_54)
        public static void setAllowCardRefreshable(@NotNull InstantCard instantCard, boolean z) {
            Card.DefaultImpls.setAllowCardRefreshable(instantCard, z);
        }

        public static void setUIDataInterceptor(@NotNull InstantCard instantCard, @NotNull UIDataInterceptor cb) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Card.DefaultImpls.setUIDataInterceptor(instantCard, cb);
        }
    }

    void load(@NotNull Bundle bundle, @Nullable oba instantCardInfo, @NotNull OnLoadCallback callback);

    void notifyEngine(@NotNull Bundle bundle, @Nullable PantanalNotifyCallback callback);

    void onLoadData();

    void registerCardMessageCallback(@Nullable fr9 cb);

    void replyMessage(int code, @NotNull String msg);

    void sendMessage(int code, @NotNull String msg);

    void setExtras(@NotNull Map<String, ? extends Object> extras);

    boolean supportLoadData();
}
