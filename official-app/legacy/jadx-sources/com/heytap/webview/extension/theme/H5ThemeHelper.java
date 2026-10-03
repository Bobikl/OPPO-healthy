package com.heytap.webview.extension.theme;

import android.app.Activity;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.provider.Settings;
import android.webkit.WebView;
import com.heytap.webview.extension.adapter.WebViewInterface;
import com.heytap.webview.extension.adapter.webview.NativeWebViewImpl;
import com.heytap.webview.extension.cache.CacheConstants;
import com.heytap.webview.extension.protocol.ThemeConst;
import com.heytap.webview.extension.theme.H5ThemeHelper;
import com.oplus.aiunit.vision.x9f;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\nH\u0007J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0007J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0007J\b\u0010#\u001a\u00020\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/heytap/webview/extension/theme/H5ThemeHelper;", "", "()V", "darkModeListener", "com/heytap/webview/extension/theme/H5ThemeHelper$darkModeListener$2$1", "getDarkModeListener", "()Lcom/heytap/webview/extension/theme/H5ThemeHelper$darkModeListener$2$1;", "darkModeListener$delegate", "Lkotlin/Lazy;", "globalNight", "", "isSetNightMode", "themeObjects", "Ljava/util/WeakHashMap;", "Lcom/heytap/webview/extension/theme/ThemeObject;", "initCustomTheme", "", "webViewInterface", "Lcom/heytap/webview/extension/adapter/WebViewInterface;", "needBackground", "initTheme", "webView", "Landroid/webkit/WebView;", "isNightMode", CacheConstants.Word.CONFIGURATION, "Landroid/content/res/Configuration;", "notifyThemeChanged", "activity", "Landroid/app/Activity;", x9f.NIGHT, "putThemeObserver", "themeObject", "registerDarkModeListener", "setNightMode", "isNight", "updateDarkMode", "lib_webtheme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H5ThemeHelper {
    private static boolean globalNight;
    private static boolean isSetNightMode;

    @NotNull
    public static final H5ThemeHelper INSTANCE = new H5ThemeHelper();

    @NotNull
    private static final WeakHashMap<ThemeObject, Boolean> themeObjects = new WeakHashMap<>();

    /* JADX INFO: renamed from: darkModeListener$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy darkModeListener = LazyKt__LazyJVMKt.lazy(new Function0<H5ThemeHelper$darkModeListener$2.AnonymousClass1>() { // from class: com.heytap.webview.extension.theme.H5ThemeHelper$darkModeListener$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.webview.extension.theme.H5ThemeHelper$darkModeListener$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new ContentObserver() { // from class: com.heytap.webview.extension.theme.H5ThemeHelper$darkModeListener$2.1
                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    super.onChange(selfChange);
                    H5ThemeHelper.INSTANCE.updateDarkMode();
                }
            };
        }
    });

    private H5ThemeHelper() {
    }

    private final H5ThemeHelper$darkModeListener$2.AnonymousClass1 getDarkModeListener() {
        return (H5ThemeHelper$darkModeListener$2.AnonymousClass1) darkModeListener.getValue();
    }

    @JvmStatic
    public static final void initCustomTheme(@NotNull final WebViewInterface webViewInterface, boolean needBackground) {
        boolean zIsNightMode;
        Intrinsics.checkNotNullParameter(webViewInterface, "webViewInterface");
        if (isSetNightMode) {
            zIsNightMode = globalNight;
        } else {
            Configuration configuration = webViewInterface.getContext().getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "webViewInterface.getCont…).resources.configuration");
            zIsNightMode = isNightMode(configuration);
        }
        ThemeObject themeObject = new ThemeObject(webViewInterface, needBackground, zIsNightMode);
        webViewInterface.addJavascriptInterface(themeObject, ThemeConst.ObjectName.JS_INTERFACE_THEME);
        webViewInterface.setForceDarkAllowed(false);
        INSTANCE.putThemeObserver(themeObject);
        new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.nd8
            @Override // java.lang.Runnable
            public final void run() {
                H5ThemeHelper.initCustomTheme$lambda$1(webViewInterface);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCustomTheme$lambda$1(WebViewInterface webViewInterface) {
        Intrinsics.checkNotNullParameter(webViewInterface, "$webViewInterface");
        INSTANCE.registerDarkModeListener(webViewInterface);
    }

    @JvmStatic
    public static final void initTheme(@NotNull WebView webView, boolean needBackground) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        initCustomTheme(new NativeWebViewImpl(webView), needBackground);
    }

    @JvmStatic
    public static final boolean isNightMode(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return 32 == (configuration.uiMode & 48);
    }

    @JvmStatic
    public static final void notifyThemeChanged(@NotNull Activity activity, boolean night) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        for (ThemeObject themeObject : themeObjects.keySet()) {
            if (activity == themeObject.getContext()) {
                themeObject.onThemeChanged(night);
            }
        }
    }

    private final void putThemeObserver(ThemeObject themeObject) {
        themeObjects.put(themeObject, Boolean.TRUE);
    }

    private final void registerDarkModeListener(WebViewInterface webView) {
        webView.getContext().getApplicationContext().getContentResolver().registerContentObserver(Settings.Global.getUriFor("DarkMode_BackgroundMaxL"), true, getDarkModeListener());
    }

    @JvmStatic
    public static final boolean setNightMode(boolean isNight) {
        isSetNightMode = true;
        globalNight = isNight;
        return isNight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDarkMode() {
        Iterator<ThemeObject> it = themeObjects.keySet().iterator();
        while (it.hasNext()) {
            it.next().onDarkModeChanged();
        }
    }

    @JvmStatic
    public static final void notifyThemeChanged(@NotNull Activity activity, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        notifyThemeChanged(activity, isNightMode(configuration));
    }
}
