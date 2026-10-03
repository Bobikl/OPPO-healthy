package com.oplus.aiunit.vision;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hrc {
    public static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList("https")));

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
