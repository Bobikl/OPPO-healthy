package pantanal.app.groupcard.plugininterface;

import android.view.MotionEvent;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.jha;
import com.oplus.aiunit.vision.t6e;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.Card;
import pantanal.app.ICardLifecycle;
import pantanal.app.UIDataInterceptor;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H'J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0017J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0017J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H'J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¨\u0006\u0018"}, d2 = {"Lpantanal/app/groupcard/plugininterface/IGroupCard;", "Lpantanal/app/Card;", "", "", "gap", "", "setGap", "", "isBright", "setIsBright", "isSupportBlur", "isLightColor", "notifyHostBlurAbilityChanged", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "onSizeChange", "Landroid/view/MotionEvent;", "event", "dispatchTouchEventFromHost", "code", "", "msg", "sendMessage", "replyMessage", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public interface IGroupCard extends Card {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void a(@NotNull IGroupCard iGroupCard) {
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "clearCarouselViews", false, null, false, 0, false, null, 252, null);
        }

        @Nullable
        public static Map<String, Object> b(@NotNull IGroupCard iGroupCard) {
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "getAnimatorParams", false, null, false, 0, false, null, 252, null);
            return null;
        }

        @Nullable
        public static Object c(@NotNull IGroupCard iGroupCard) {
            return Card.DefaultImpls.getInnerCard(iGroupCard);
        }

        @Nullable
        public static Map<String, String> d(@NotNull IGroupCard iGroupCard) {
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "getMorePopup", false, null, false, 0, false, null, 252, null);
            return null;
        }

        public static void e(@NotNull IGroupCard iGroupCard, @NotNull List<jha> itemList, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(itemList, "itemList");
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "initCarouselViews itemList:" + itemList.size() + ",focusIndex:" + i + ",updateDots:" + z + ",dotsAnim:" + z2, false, null, false, 0, false, null, 252, null);
        }

        public static boolean f(@NotNull IGroupCard iGroupCard, @NotNull String featureKey) {
            Intrinsics.checkNotNullParameter(featureKey, "featureKey");
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "isSupportFeature", false, null, false, 0, false, null, 252, null);
            return false;
        }

        public static void g(@NotNull IGroupCard iGroupCard, @NotNull ICardLifecycle.LifeCycleValue lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Card.DefaultImpls.onForceUpdate(iGroupCard, lifecycle);
        }

        public static void h(@NotNull IGroupCard iGroupCard) {
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "onItemChangeAnimationEnd", false, null, false, 0, false, null, 252, null);
        }

        public static void i(@NotNull IGroupCard iGroupCard) {
            Card.DefaultImpls.onRenderFailed(iGroupCard);
        }

        public static void j(@NotNull IGroupCard iGroupCard, int i) {
            Card.DefaultImpls.onScrollState(iGroupCard, i);
        }

        public static void k(@NotNull IGroupCard iGroupCard, @NotNull String openStackType) {
            Intrinsics.checkNotNullParameter(openStackType, "openStackType");
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "openStack openStackType:" + openStackType, false, null, false, 0, false, null, 252, null);
        }

        public static void l(@NotNull IGroupCard iGroupCard, @NotNull UIDataInterceptor cb) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Card.DefaultImpls.setUIDataInterceptor(iGroupCard, cb);
        }

        public static void m(@NotNull IGroupCard iGroupCard, @NotNull jha item, @NotNull Function1<? super Integer, Unit> callback) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(callback, "callback");
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "showActionMenu item:" + item, false, null, false, 0, false, null, 252, null);
        }

        public static void n(@NotNull IGroupCard iGroupCard, @Nullable String str) {
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "showToast", false, null, false, 0, false, null, 252, null);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_24)
        public static void notifyHostBlurAbilityChanged(@NotNull IGroupCard iGroupCard, boolean z, boolean z2) {
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "notifyHostBlurAbilityChanged isSupportBlur= " + z + ",isLightColor:" + z2, false, null, false, 0, false, null, 252, null);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_32)
        public static void onSizeChange(@NotNull IGroupCard iGroupCard, int i, int i2) {
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "onSizeChange width= " + i + ",height:" + i2, false, null, false, 0, false, null, 252, null);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
        public static void replyMessage(@NotNull IGroupCard iGroupCard, int i, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "replyMessage code= " + i + ",msg:" + msg, false, null, false, 0, false, null, 252, null);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
        public static void sendMessage(@NotNull IGroupCard iGroupCard, int i, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            bs9.a.c(t6e.INSTANCE, "IGroupCard", "sendMessage code= " + i + ",msg:" + msg, false, null, false, 0, false, null, 252, null);
        }

        @RequiresVersionSdk(version = VersionSdk.SDK_1_2_54)
        public static void setAllowCardRefreshable(@NotNull IGroupCard iGroupCard, boolean z) {
            Card.DefaultImpls.setAllowCardRefreshable(iGroupCard, z);
        }
    }

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_32)
    void dispatchTouchEventFromHost(@NotNull MotionEvent event);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_24)
    void notifyHostBlurAbilityChanged(boolean isSupportBlur, boolean isLightColor);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_32)
    void onSizeChange(int width, int height);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
    void replyMessage(int code, @NotNull String msg);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
    void sendMessage(int code, @NotNull String msg);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    void setGap(int gap);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_14)
    void setIsBright(boolean isBright);
}
