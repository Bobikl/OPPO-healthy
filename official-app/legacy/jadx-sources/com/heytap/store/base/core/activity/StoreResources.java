package com.heytap.store.base.core.activity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import com.heytap.store.base.core.util.app.AppConfig;
import com.heytap.store.platform.tools.ContextGetterUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R$\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/base/core/activity/StoreResources;", "", "()V", "nightModeEnable", "", "kotlin.jvm.PlatformType", "getNightModeEnable", "()Ljava/lang/Boolean;", "setNightModeEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "nightModeGlobalDisable", "getNightModeGlobalDisable", "()Z", "setNightModeGlobalDisable", "(Z)V", "getCustomResources", "Landroid/content/res/Resources;", "oriResources", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StoreResources {

    @NotNull
    public static final StoreResources INSTANCE = new StoreResources();
    private static Boolean nightModeEnable = AppConfig.getInstance().getDarkModeEnable();
    private static boolean nightModeGlobalDisable = true;

    private StoreResources() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    @NotNull
    public final Resources getCustomResources(@NotNull Resources oriResources) {
        Intrinsics.checkNotNullParameter(oriResources, "oriResources");
        Configuration configuration = oriResources.getConfiguration();
        boolean z = true;
        boolean z2 = false;
        if (!(oriResources.getConfiguration().fontScale == 1.0f)) {
            configuration.fontScale = 1.0f;
            Log.d("StoreResources", "updateConfiguration fontScale");
            z2 = true;
        }
        if (nightModeEnable.booleanValue()) {
            z = z2;
        } else {
            Resources resources = ContextGetterUtils.INSTANCE.getApp().getApplicationContext().getResources();
            if (resources.getConfiguration().uiMode != 16 && nightModeGlobalDisable) {
                resources.getConfiguration().uiMode = 16;
                resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
                Log.d("StoreResources", "updateConfiguration uiMode");
            }
            if (configuration.uiMode != 16) {
                configuration.uiMode = 16;
                Log.d("StoreResources", "updateConfiguration activity uiMode");
            } else {
                z = z2;
            }
        }
        if (z) {
            oriResources.updateConfiguration(configuration, oriResources.getDisplayMetrics());
        }
        return oriResources;
    }

    public final Boolean getNightModeEnable() {
        return nightModeEnable;
    }

    public final boolean getNightModeGlobalDisable() {
        return nightModeGlobalDisable;
    }

    public final void setNightModeEnable(Boolean bool) {
        nightModeEnable = bool;
    }

    public final void setNightModeGlobalDisable(boolean z) {
        nightModeGlobalDisable = z;
    }
}
