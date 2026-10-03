package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes8.dex */
public class wda {
    public static Intent a(String str, int i) throws URISyntaxException {
        Intent uri = Intent.parseUri(str, i);
        uri.setComponent(null);
        uri.setSelector(null);
        return uri;
    }

    public static Intent b(Context context, String str, int i, String str2) throws URISyntaxException {
        Intent uri = Intent.parseUri(str, i);
        uri.setComponent(null);
        uri.setSelector(null);
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(uri, 0);
        if (resolveInfoResolveActivity != null) {
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            if (!activityInfo.exported) {
                bae.d("parseUriSecurity exported = false");
                return null;
            }
            if (activityInfo.permission == null) {
                return uri;
            }
            if (!b1j.a(str2) && str2.equals(resolveInfoResolveActivity.activityInfo.packageName)) {
                return uri;
            }
        }
        bae.d("parseUriSecurity intent = null");
        return null;
    }
}
