package com.oplus.aiunit.vision;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class snl {
    public UrlQuerySanitizer a;
    public Uri b;

    public snl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a = new UrlQuerySanitizer(str);
        this.b = Uri.parse(str);
    }

    public static snl d(String str) {
        return new snl(str);
    }

    public String a() {
        Uri uri = this.b;
        return uri != null ? uri.getHost() : "";
    }

    public String b() {
        Uri uri = this.b;
        return uri != null ? uri.getPath() : "";
    }

    public String c(String str) {
        UrlQuerySanitizer urlQuerySanitizer = this.a;
        return urlQuerySanitizer != null ? urlQuerySanitizer.getValue(str) : "";
    }
}
