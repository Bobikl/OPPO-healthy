package com.oplus.aiunit.vision;

import android.net.Uri;
import com.heytap.webview.extension.protocol.Const;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ppc {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(Const.Scheme.SCHEME_HTTPS)));

    public static boolean a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            return (scheme == null || !a.contains(scheme.toLowerCase(Locale.US)) || host == null || host.isEmpty()) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
