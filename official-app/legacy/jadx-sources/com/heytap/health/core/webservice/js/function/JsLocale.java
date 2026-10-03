package com.heytap.health.core.webservice.js.function;

import android.content.Context;
import android.os.LocaleList;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.pja;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@pja(namespace = "AppLocale")
@Keep
public class JsLocale {
    private Context mContext;
    private String TAG = "JsLocale";
    private final Locale LOCALE_EN = Locale.ENGLISH;

    public JsLocale(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public String onFetchLocale() {
        Locale locale = this.LOCALE_EN;
        LocaleList locales = this.mContext.getApplicationContext().getResources().getConfiguration().getLocales();
        if (locales != null && locales.size() > 0) {
            locale = locales.get(0);
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }
}
