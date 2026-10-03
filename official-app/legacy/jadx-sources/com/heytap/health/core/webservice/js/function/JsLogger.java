package com.heytap.health.core.webservice.js.function;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.pja;

/* JADX INFO: loaded from: classes16.dex */
@pja(namespace = "AppLog")
@Keep
public class JsLogger {
    @JavascriptInterface
    public void printJsLog(int i, String str, String str2) {
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            return;
        }
        if (i == 3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            return;
        }
        if (i == 4) {
            a7b.f("Js", str + ": " + str2);
            return;
        }
        if (i == 5) {
            a7b.m("Js", str + ": " + str2);
            return;
        }
        if (i == 6) {
            a7b.b("Js", str + ": " + str2);
        }
    }
}
