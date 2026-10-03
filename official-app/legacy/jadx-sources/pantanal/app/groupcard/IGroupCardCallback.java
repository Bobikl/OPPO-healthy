package pantanal.app.groupcard;

import android.content.Intent;
import android.view.View;
import com.oplus.aiunit.vision.pne;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH'J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H'J.\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00062\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H'J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002H'J\u0012\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¨\u0006!"}, d2 = {"Lpantanal/app/groupcard/IGroupCardCallback;", "", "", "title", "", "onTitleChanged", "", "isSupportSceneAbility", "onGroupCardModeChanged", "Landroid/view/View;", "view", "", "radius", "", "Landroid/content/Intent;", "intentList", "onStartActivity", "isInAnimation", "onGroupCardViewInAnimation", "targetView", "needBlur", "", BridgeConstant.KEY_EXTRAS, "onRequestBlur", "", "code", "data", "onMessage", "Lcom/oplus/aiunit/vision/pne;", "popupItems", "onLongClick", "Companion", "a", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public interface IGroupCardCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: pantanal.app.groupcard.IGroupCardCallback$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpantanal/app/groupcard/IGroupCardCallback$a;", "", "<init>", "()V", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    void onGroupCardModeChanged(boolean isSupportSceneAbility);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_14)
    void onGroupCardViewInAnimation(boolean isInAnimation);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
    boolean onLongClick(@Nullable pne popupItems);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_48)
    void onMessage(int code, @NotNull String data);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_24)
    boolean onRequestBlur(@NotNull View targetView, boolean needBlur, @NotNull Map<String, ? extends Object> extras);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    void onStartActivity(@NotNull View view, @NotNull float[] radius, @NotNull List<? extends Intent> intentList);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    void onTitleChanged(@NotNull String title);
}
