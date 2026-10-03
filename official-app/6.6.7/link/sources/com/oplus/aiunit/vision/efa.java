package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class efa {
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
                ace.d("parseUriSecurity exported = false");
                return null;
            }
            if (activityInfo.permission == null) {
                return uri;
            }
            if (!u4j.a(str2) && str2.equals(resolveInfoResolveActivity.activityInfo.packageName)) {
                return uri;
            }
        }
        ace.d("parseUriSecurity intent = null");
        return null;
    }
}
