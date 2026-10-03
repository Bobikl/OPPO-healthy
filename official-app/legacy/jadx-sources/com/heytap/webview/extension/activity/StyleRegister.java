package com.heytap.webview.extension.activity;

import androidx.annotation.Keep;
import com.heytap.webview.extension.fragment.WebExtFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/webview/extension/activity/StyleRegister;", "", "()V", "fragmentByStyle", "", "", "Ljava/lang/Class;", "Lcom/heytap/webview/extension/fragment/WebExtFragment;", "getFragment", "styleName", "getFragment$lib_webext_release", "registerFragment", "", "fragmentClass", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StyleRegister {

    @NotNull
    public static final StyleRegister INSTANCE = new StyleRegister();

    @NotNull
    private static final Map<String, Class<? extends WebExtFragment>> fragmentByStyle = new LinkedHashMap();

    private StyleRegister() {
    }

    @JvmStatic
    @Keep
    public static final void registerFragment(@NotNull String styleName, @NotNull Class<? extends WebExtFragment> fragmentClass) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        fragmentByStyle.put(styleName, fragmentClass);
    }

    @Nullable
    public final Class<? extends WebExtFragment> getFragment$lib_webext_release(@NotNull String styleName) {
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        return fragmentByStyle.get(styleName);
    }
}
