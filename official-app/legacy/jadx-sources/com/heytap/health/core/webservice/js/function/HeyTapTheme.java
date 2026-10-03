package com.heytap.health.core.webservice.js.function;

import android.content.res.Configuration;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.webview.extension.protocol.ThemeConst;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.pja;
import com.oplus.aiunit.vision.qe0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@pja(namespace = ThemeConst.ObjectName.JS_INTERFACE_THEME)
@Keep
public class HeyTapTheme {
    private boolean isNightMode;
    private WebView webView;

    public HeyTapTheme(WebView webView) {
        this.webView = webView;
        this.isNightMode = qe0.y(webView.getContext());
    }

    @JavascriptInterface
    public final String getDarkConfiguration() {
        float f = Settings.Global.getFloat(b78.a().getContentResolver(), "DarkMode_DialogBgMaxL", -1.0f);
        float f2 = Settings.Global.getFloat(b78.a().getContentResolver(), "DarkMode_BackgroundMaxL", -1.0f);
        float f3 = Settings.Global.getFloat(b78.a().getContentResolver(), "DarkMode_ForegroundMinL", -1.0f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("darkModeBackground", f2);
            jSONObject.put("darkModeForeground", f3);
            jSONObject.put("dialogBackground", f);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.getMessage();
            return null;
        }
    }

    @JavascriptInterface
    public final boolean isNight() {
        return qe0.y(b78.a());
    }

    public void notifyThemeChanged(@NonNull Configuration configuration) {
        boolean z = 32 == (configuration.uiMode & 48);
        if (z == this.isNightMode) {
            this.webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DARK_LEVEL_MODE, null);
            return;
        }
        if (z) {
            this.webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_NIGHT_MODE, null);
        } else {
            this.webView.evaluateJavascript(ThemeConst.Function.JS_TEMPLATE_NOTIFY_DAY_MODE, null);
        }
        this.isNightMode = z;
    }
}
