package com.heytap.webview.extension.theme;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import com.heytap.webview.extension.adapter.WebViewInterface;
import com.heytap.webview.extension.protocol.ThemeConst;
import com.oplus.aiunit.vision.x9f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/webview/extension/theme/ThemeObject;", "", "webView", "Lcom/heytap/webview/extension/adapter/WebViewInterface;", "needBackground", "", x9f.NIGHT, "(Lcom/heytap/webview/extension/adapter/WebViewInterface;ZZ)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "isNight", "()Z", "getDarkConfiguration", "", "notifyThemeChange", "", "onDarkModeChanged", "onThemeChanged", "lib_webtheme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeObject {
    private boolean isNight;
    private final boolean needBackground;

    @NotNull
    private final WebViewInterface webView;

    public ThemeObject(@NotNull WebViewInterface webView, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        this.needBackground = z;
        this.isNight = z2;
        if (z) {
            if (z2) {
                webView.setBackgroundColor(-16777216);
            } else {
                webView.setBackgroundColor(-1);
            }
        }
    }

    private final void notifyThemeChange(WebViewInterface webView, boolean night) {
        if (night) {
            if (this.needBackground) {
                webView.setBackgroundColor(-16777216);
            }
            webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_NIGHT_MODE, new Function0<Unit>() { // from class: com.heytap.webview.extension.theme.ThemeObject.notifyThemeChange.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
        } else {
            if (this.needBackground) {
                webView.setBackgroundColor(-1);
            }
            webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DAY_MODE, new Function0<Unit>() { // from class: com.heytap.webview.extension.theme.ThemeObject.notifyThemeChange.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @NotNull
    public final Context getContext() {
        return this.webView.getContext();
    }

    @JavascriptInterface
    @NotNull
    public final String getDarkConfiguration() throws JSONException {
        float f = Settings.Global.getFloat(getContext().getContentResolver(), "DarkMode_DialogBgMaxL", -1.0f);
        float f2 = Settings.Global.getFloat(getContext().getContentResolver(), "DarkMode_BackgroundMaxL", -1.0f);
        float f3 = Settings.Global.getFloat(getContext().getContentResolver(), "DarkMode_ForegroundMinL", -1.0f);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("darkModeBackground", Float.valueOf(f2));
        jSONObject.put("darkModeForeground", Float.valueOf(f3));
        jSONObject.put("dialogBackground", Float.valueOf(f));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return string;
    }

    @JavascriptInterface
    /* JADX INFO: renamed from: isNight, reason: from getter */
    public final boolean getIsNight() {
        return this.isNight;
    }

    public final void onDarkModeChanged() {
        Configuration configuration = this.webView.getContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "webView.getContext().resources.configuration");
        if (H5ThemeHelper.isNightMode(configuration)) {
            ThreadUtil.postToUIThread$default(ThreadUtil.INSTANCE, 0L, new Function0<Unit>() { // from class: com.heytap.webview.extension.theme.ThemeObject.onDarkModeChanged.1
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ThemeObject.this.webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DARK_LEVEL_MODE, new Function0<Unit>() { // from class: com.heytap.webview.extension.theme.ThemeObject.onDarkModeChanged.1.1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    });
                }
            }, 1, null);
        }
    }

    public final void onThemeChanged(boolean night) {
        if (night != this.isNight) {
            this.isNight = night;
            notifyThemeChange(this.webView, night);
        }
    }
}
