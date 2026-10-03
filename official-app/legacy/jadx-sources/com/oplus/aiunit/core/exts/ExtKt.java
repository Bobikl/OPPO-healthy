package com.oplus.aiunit.core.exts;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.oplus.aiunit.core.ConfigPackage;
import com.oplus.aiunit.core.FramePackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0016\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007\u001a\u0016\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0000H\u0007¨\u0006\r"}, d2 = {"Landroid/os/Bundle;", "Lcom/oplus/aiunit/core/ConfigPackage;", "configPackage", "setConfigPackage", "getConfigPackage", "Lcom/oplus/aiunit/core/FramePackage;", "framePackage", "setFramePackage", "getFramePackage", "", "pluginId", "setPluginId", "getPluginId", "aiunit.sdk.core_release"}, k = 2, mv = {1, 9, 0})
public final class ExtKt {
    @Keep
    @Nullable
    public static final ConfigPackage getConfigPackage(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return (ConfigPackage) bundle.getParcelable("ConfigPackage");
    }

    @Keep
    @Nullable
    public static final FramePackage getFramePackage(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return (FramePackage) bundle.getParcelable("FramePackage");
    }

    @Keep
    @Nullable
    public static final String getPluginId(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return bundle.getString("pluginId");
    }

    @Keep
    @NotNull
    public static final Bundle setConfigPackage(@NotNull Bundle bundle, @Nullable ConfigPackage configPackage) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        bundle.putParcelable("ConfigPackage", configPackage);
        return bundle;
    }

    @Keep
    @NotNull
    public static final Bundle setFramePackage(@NotNull Bundle bundle, @Nullable FramePackage framePackage) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        bundle.putParcelable("FramePackage", framePackage);
        return bundle;
    }

    @Keep
    @NotNull
    public static final Bundle setPluginId(@NotNull Bundle bundle, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        bundle.putString("pluginId", str);
        return bundle;
    }
}
