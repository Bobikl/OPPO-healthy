package pantanal.app.groupcard.plugininterface;

import android.content.Context;
import android.os.Bundle;
import com.oplus.aiunit.vision.bc8;
import com.oplus.aiunit.vision.io9;
import com.oplus.aiunit.vision.ln9;
import com.oplus.aiunit.vision.ox9;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J@\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH'J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¨\u0006\u0016"}, d2 = {"Lpantanal/app/groupcard/plugininterface/IPluginGroupCard;", "", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/ln9;", "cardCreator", "Lcom/oplus/aiunit/vision/ox9;", "decisionProxy", "Lcom/oplus/aiunit/vision/io9;", "contentManagerProxy", "", "init", "", "", "extraMap", "destroy", "Lcom/oplus/aiunit/vision/bc8;", "groupCardInfo", "Landroid/os/Bundle;", "bundle", "Lpantanal/app/groupcard/plugininterface/IGroupCard;", "createGroupCard", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public interface IPluginGroupCard {
    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    @Nullable
    IGroupCard createGroupCard(@NotNull Context context, @NotNull bc8 groupCardInfo, @Nullable Bundle bundle);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    void destroy(@NotNull Context context);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_10)
    void init(@NotNull Context context, @NotNull ln9 cardCreator, @NotNull ox9 decisionProxy, @NotNull io9 contentManagerProxy);

    @RequiresVersionSdk(version = VersionSdk.SDK_1_3_0)
    void init(@NotNull Context context, @NotNull ln9 cardCreator, @NotNull ox9 decisionProxy, @NotNull io9 contentManagerProxy, @Nullable Map<String, ? extends Object> extraMap);
}
