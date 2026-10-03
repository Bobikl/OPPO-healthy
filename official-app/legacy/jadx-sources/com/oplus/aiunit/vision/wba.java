package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.instant.router.Instant;

/* JADX INFO: loaded from: classes16.dex */
public class wba extends ofg {
    @Override // com.oplus.aiunit.vision.dx9
    public boolean d(String str) {
        return Instant.HOST_INSTANT.equalsIgnoreCase(str);
    }

    @Override // com.oplus.aiunit.vision.ofg
    public void f(Uri uri, String str, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("childDispatcher uri = ");
        sb.append(uri.toString());
        Context contextA = b78.a();
        String strReplaceAll = uri.toString().replaceAll(" +", "");
        if (!strReplaceAll.contains("jumpUrl")) {
            a7b.f("InstantSchemeInterceptor", "jumpUrl is not config, try to config first");
            return;
        }
        String strSubstring = strReplaceAll.substring(strReplaceAll.indexOf("jumpUrl") + 8);
        if (Instant.isInstantPlatformInstalled(contextA)) {
            Instant.createBuilder("8162", "77eef930f039230432a29d3de9037f45").setFrom(contextA.getPackageName()).setPackage(contextA.getPackageName()).setRequestUrl(strSubstring).build().request(contextA);
            return;
        }
        a7b.f("InstantSchemeInterceptor", "instant is uninstall");
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(strSubstring));
            intent2.addFlags(268435456);
            contextA.startActivity(intent2);
        } catch (Exception unused) {
            a7b.m("InstantSchemeInterceptor", "unsupported Quick application");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            mmd.c().a(Uri.parse(str), null);
        }
    }
}
