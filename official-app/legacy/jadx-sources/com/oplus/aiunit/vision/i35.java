package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;

/* JADX INFO: loaded from: classes16.dex */
public class i35 extends ofg {
    @Override // com.oplus.aiunit.vision.dx9
    public boolean d(String str) {
        return "deeplink".equalsIgnoreCase(str);
    }

    @Override // com.oplus.aiunit.vision.ofg
    public void f(Uri uri, String str, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("childDispatcher uri = ");
        sb.append(uri.toString());
        String strReplaceAll = uri.toString().replaceAll(" +", "");
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.addCategory("android.intent.category.BROWSABLE");
        if (strReplaceAll.contains("jumpUrl")) {
            a7b.f("DeeplinkSchemeInterceptor", "config jumpUrl");
            String strSubstring = strReplaceAll.substring(strReplaceAll.indexOf("jumpUrl") + 8);
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            intent2.setData(Uri.parse(strSubstring));
            intent2.setComponent(null);
        }
        intent2.addFlags(268435456);
        if (k(b78.a(), intent2)) {
            b78.a().startActivity(intent2);
            return;
        }
        a7b.b(DeepLinkInterpreter.KEY_DEEP_LINK, "activity is not exist");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mmd.c().a(Uri.parse(str), null);
    }

    public final boolean k(Context context, Intent intent) {
        boolean z = false;
        if (context != null && intent != null) {
            try {
                if (context.getApplicationContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                    z = true;
                }
            } catch (Exception e2) {
                a7b.b("DeeplinkSchemeInterceptor", "isActivityExists e:" + e2.getMessage());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isActivityExists intent=");
        sb.append(intent != null ? intent.toString() : "null");
        sb.append(",result=");
        sb.append(z);
        return z;
    }
}
