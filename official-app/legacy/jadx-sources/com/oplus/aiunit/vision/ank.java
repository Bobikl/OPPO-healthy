package com.oplus.aiunit.vision;

import android.net.UrlQuerySanitizer;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class ank {
    public UrlQuerySanitizer a;

    public ank(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a = new UrlQuerySanitizer(str);
    }

    public static ank b(String str) {
        return new ank(str);
    }

    public String a(String str) {
        UrlQuerySanitizer urlQuerySanitizer = this.a;
        return urlQuerySanitizer != null ? urlQuerySanitizer.getValue(str) : "";
    }
}
