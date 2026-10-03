package com.heytap.webview.extension;

import com.heytap.webview.extension.activity.FragmentStyle;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/heytap/webview/extension/WebExtEnvironment;", "", "()V", "value", "", FragmentStyle.DEBUG, "getDebug", "()Z", "setDebug", "(Z)V", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebExtEnvironment {

    @NotNull
    public static final WebExtEnvironment INSTANCE = new WebExtEnvironment();
    private static volatile boolean debug;

    private WebExtEnvironment() {
    }

    public final boolean getDebug() {
        return debug;
    }

    public final void setDebug(boolean z) {
        debug = z;
    }
}
