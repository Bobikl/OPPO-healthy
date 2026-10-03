package com.heytap.webpro.theme;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.webkit.WebView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.cache.CacheConstants;
import com.heytap.webview.extension.protocol.ThemeConst;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.kol;
import com.oplus.aiunit.vision.lfc;
import com.oplus.aiunit.vision.x9f;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\b*\u0001#\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0002R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006*"}, d2 = {"Lcom/heytap/webpro/theme/H5ThemeHelper;", "", "Landroid/webkit/WebView;", "webView", "", "needBackground", "", "f", "Lcom/oplus/aiunit/vision/kol;", "webViewInterface", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/res/Configuration;", CacheConstants.Word.CONFIGURATION, b2n.f, "Landroid/app/Activity;", "activity", x9f.NIGHT, "i", b2n.g, "Landroid/content/Context;", "context", "c", "Lcom/heytap/webpro/theme/ThemeObject;", "themeObject", "j", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "Ljava/util/WeakHashMap;", "a", "Ljava/util/WeakHashMap;", "themeObjects", "b", "Z", "globalNight", "isSetNightMode", "com/heytap/webpro/theme/H5ThemeHelper$darkModeListener$2$a", "d", "Lkotlin/Lazy;", "()Lcom/heytap/webpro/theme/H5ThemeHelper$darkModeListener$2$a;", "darkModeListener", "<init>", "()V", "lib_webpro_theme_release"}, k = 1, mv = {1, 4, 0})
public final class H5ThemeHelper {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean globalNight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean isSetNightMode;
    public static final H5ThemeHelper INSTANCE = new H5ThemeHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final WeakHashMap<ThemeObject, Boolean> themeObjects = new WeakHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Lazy darkModeListener = LazyKt__LazyJVMKt.lazy(new Function0<H5ThemeHelper$darkModeListener$2.a>() { // from class: com.heytap.webpro.theme.H5ThemeHelper$darkModeListener$2

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/webpro/theme/H5ThemeHelper$darkModeListener$2$a", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "lib_webpro_theme_release"}, k = 1, mv = {1, 4, 0})
        public static final class a extends ContentObserver {
            public a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                super.onChange(selfChange);
                H5ThemeHelper.INSTANCE.l();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
            return new a(null);
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {
        public final /* synthetic */ kol i;

        public a(kol kolVar) {
            this.i = kolVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            H5ThemeHelper.INSTANCE.k(this.i);
        }
    }

    @JvmStatic
    public static final boolean c(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return (resources.getConfiguration().uiMode & 48) == 16;
    }

    @JvmStatic
    public static final void e(@NotNull kol webViewInterface, boolean needBackground) {
        boolean zG;
        Intrinsics.checkNotNullParameter(webViewInterface, "webViewInterface");
        if (isSetNightMode) {
            zG = globalNight;
        } else {
            Resources resources = webViewInterface.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "webViewInterface.getContext().resources");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "webViewInterface.getCont…).resources.configuration");
            zG = g(configuration);
        }
        ThemeObject themeObject = new ThemeObject(webViewInterface, needBackground, zG);
        webViewInterface.addJavascriptInterface(themeObject, ThemeConst.ObjectName.JS_INTERFACE_THEME);
        webViewInterface.setForceDarkAllowed(false);
        INSTANCE.j(themeObject);
        new Thread(new a(webViewInterface)).start();
    }

    @JvmStatic
    public static final void f(@NotNull WebView webView, boolean needBackground) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        e(new lfc(webView), needBackground);
    }

    @JvmStatic
    public static final boolean g(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return 32 == (configuration.uiMode & 48);
    }

    @JvmStatic
    public static final void h(@NotNull Activity activity, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        i(activity, g(configuration));
    }

    @JvmStatic
    public static final void i(@NotNull Activity activity, boolean night) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        for (ThemeObject themeObject : themeObjects.keySet()) {
            if (activity == themeObject.b()) {
                themeObject.e(night);
            }
        }
    }

    public final H5ThemeHelper$darkModeListener$2.a d() {
        return (H5ThemeHelper$darkModeListener$2.a) darkModeListener.getValue();
    }

    public final void j(ThemeObject themeObject) {
        themeObjects.put(themeObject, Boolean.TRUE);
    }

    public final void k(kol webView) {
        Context applicationContext = webView.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "webView.getContext().applicationContext");
        applicationContext.getContentResolver().registerContentObserver(Settings.Global.getUriFor("DarkMode_BackgroundMaxL"), true, d());
    }

    public final void l() {
        Iterator<ThemeObject> it = themeObjects.keySet().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }
}
