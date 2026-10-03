package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.webview.extension.activity.FragmentStyle;

/* JADX INFO: loaded from: classes16.dex */
public class n72 extends ofg {
    @Override // com.oplus.aiunit.vision.dx9
    public boolean d(String str) {
        return FragmentStyle.BROWSER.equalsIgnoreCase(str);
    }

    @Override // com.oplus.aiunit.vision.ofg
    public void f(Uri uri, String str, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("childDispatcher uri = ");
        sb.append(uri.toString());
        String strReplaceAll = uri.toString().replaceAll(" +", "");
        if (!strReplaceAll.contains("jumpUrl")) {
            a7b.f("BrowserSchemeInterceptor", "jumpUrl is not config, try to config first");
            return;
        }
        String strSubstring = strReplaceAll.substring(strReplaceAll.indexOf("jumpUrl") + 8);
        if (TextUtils.isEmpty(strSubstring)) {
            return;
        }
        if (strSubstring.startsWith("http/")) {
            strSubstring = strSubstring.replaceFirst("http/", "http://");
        }
        if (strSubstring.startsWith("https/")) {
            strSubstring = strSubstring.replaceFirst("https/", "https://");
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strSubstring));
        intent2.addFlags(268435456);
        intent2.addCategory("android.intent.category.BROWSABLE");
        b78.a().startActivity(intent2);
    }
}
