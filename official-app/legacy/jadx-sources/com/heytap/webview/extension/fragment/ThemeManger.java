package com.heytap.webview.extension.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.webkit.WebView;
import com.heytap.webview.extension.theme.H5ThemeHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0010R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/webview/extension/fragment/ThemeManger;", "", "()V", "bundle", "Landroid/os/Bundle;", "<set-?>", "", "isNight", "()Z", "webView", "Landroid/webkit/WebView;", "enableDarkModel", "onCreate", "", "onCreate$lib_webext_release", "onDestroy", "onDestroy$lib_webext_release", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeManger {

    @Nullable
    private Bundle bundle;
    private boolean isNight;

    @Nullable
    private WebView webView;

    private final boolean enableDarkModel() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return bundle.getBoolean(ArgumentKey.ENABLE_DARK_MODEL, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: isNight, reason: from getter */
    public final boolean getIsNight() {
        return this.isNight;
    }

    public final void onCreate$lib_webext_release(@NotNull WebView webView, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.bundle = bundle;
        if (enableDarkModel()) {
            this.webView = webView;
            Configuration configuration = webView.getContext().getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "webView.context.resources.configuration");
            this.isNight = H5ThemeHelper.isNightMode(configuration);
            H5ThemeHelper.initTheme(webView, false);
        }
    }

    public final void onDestroy$lib_webext_release() {
        this.webView = null;
    }
}
