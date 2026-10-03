package com.heytap.health.core.webservice.js.function;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.pja;
import com.oplus.aiunit.vision.qe0;

/* JADX INFO: loaded from: classes16.dex */
@pja(namespace = "AppDarkMode")
@Keep
public class JsDarkMode {
    public final String TAG = "JsDarkMode";

    @JavascriptInterface
    public boolean isDarkMode() {
        boolean zY = qe0.y(b78.a());
        StringBuilder sb = new StringBuilder();
        sb.append("isDarkMode: ");
        sb.append(zY);
        return zY;
    }
}
