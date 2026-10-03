package com.oplus.seedling.sdk.plugin;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.aiunit.vision.toe;
import com.oplus.seedling.sdk.SeedlingSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/seedling/sdk/plugin/PluginManager$hostConfigurationChangedCallback$1", "Landroid/content/ComponentCallbacks;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PluginManager$hostConfigurationChangedCallback$1 implements ComponentCallbacks {
    final /* synthetic */ PluginManager this$0;

    public PluginManager$hostConfigurationChangedCallback$1(PluginManager pluginManager) {
        this.this$0 = pluginManager;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Resources resources;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        ht9.a.c(s8e.INSTANCE, "PluginManager", "hostConfigurationChangedCallback onConfigurationChanged", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        PluginManager pluginManager = this.this$0;
        toe pluginContext = pluginManager.getPluginContext();
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        pluginManager.showConfigMsg("before updateNewConfig", pluginContext, seedlingSdk.getSAppContext$pantanal_client_release(), newConfig);
        this.this$0.updateNewConfig(seedlingSdk.getSAppContext$pantanal_client_release(), newConfig);
        toe pluginContext2 = this.this$0.getPluginContext();
        if (pluginContext2 != null && (resources = pluginContext2.getResources()) != null) {
            resources.updateConfiguration(newConfig, seedlingSdk.getSAppContext$pantanal_client_release().getResources().getDisplayMetrics());
        }
        PluginManager pluginManager2 = this.this$0;
        PluginManager.showConfigMsg$default(pluginManager2, "after updateConfiguration", pluginManager2.getPluginContext(), null, null, 12, null);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        ht9.a.c(s8e.INSTANCE, "PluginManager", "hostConfigurationChangedCallback onLowMemory", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }
}
