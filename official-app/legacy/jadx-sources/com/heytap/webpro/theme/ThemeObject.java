package com.heytap.webpro.theme;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import com.heytap.webview.extension.protocol.ThemeConst;
import com.oplus.aiunit.vision.kol;
import com.oplus.aiunit.vision.x9f;
import com.oplus.aiunit.vision.zwj;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/webpro/theme/ThemeObject;", "", "", "getDarkConfiguration", "", x9f.NIGHT, "", MapSchema.FIELD_NAME_ENTRY, "d", "Lcom/oplus/aiunit/vision/kol;", "webView", "c", "<set-?>", "a", "Z", "isNight", "()Z", "b", "Lcom/oplus/aiunit/vision/kol;", "needBackground", "Landroid/content/Context;", "()Landroid/content/Context;", "context", "<init>", "(Lcom/oplus/aiunit/vision/kol;ZZ)V", "lib_webpro_theme_release"}, k = 1, mv = {1, 4, 0})
public final class ThemeObject {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isNight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final kol webView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean needBackground;

    public ThemeObject(@NotNull kol webView, boolean z, boolean z2) {
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

    @NotNull
    public final Context b() {
        return this.webView.getContext();
    }

    public final void c(kol webView, boolean night) {
        if (night) {
            if (this.needBackground) {
                webView.setBackgroundColor(-16777216);
            }
            webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_NIGHT_MODE, new Function0<Unit>() { // from class: com.heytap.webpro.theme.ThemeObject$notifyThemeChange$1
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
            webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DAY_MODE, new Function0<Unit>() { // from class: com.heytap.webpro.theme.ThemeObject$notifyThemeChange$2
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

    public final void d() {
        Resources resources = this.webView.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "webView.getContext().resources");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "webView.getContext().resources.configuration");
        if (H5ThemeHelper.g(configuration)) {
            zwj.b(zwj.INSTANCE, 0L, new Function0<Unit>() { // from class: com.heytap.webpro.theme.ThemeObject$onDarkModeChanged$1
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
                    this.this$0.webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DARK_LEVEL_MODE, new Function0<Unit>() { // from class: com.heytap.webpro.theme.ThemeObject$onDarkModeChanged$1.1
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

    public final void e(boolean night) {
        if (night != this.isNight) {
            this.isNight = night;
            c(this.webView, night);
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getDarkConfiguration() throws JSONException {
        float f = Settings.Global.getFloat(b().getContentResolver(), "DarkMode_DialogBgMaxL", -1.0f);
        float f2 = Settings.Global.getFloat(b().getContentResolver(), "DarkMode_BackgroundMaxL", -1.0f);
        float f3 = Settings.Global.getFloat(b().getContentResolver(), "DarkMode_ForegroundMinL", -1.0f);
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
}
