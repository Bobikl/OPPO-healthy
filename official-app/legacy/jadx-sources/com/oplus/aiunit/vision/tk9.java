package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes17.dex */
public class tk9 {
    public static synchronized void a(Bundle bundle) {
        a7b.f("HttpTokenInvalidCategory", "token invalid intercept, send login broadcast");
        Context contextA = b78.a();
        String packageName = contextA.getPackageName();
        Intent intent = new Intent("com.heytap.health.action.account_token_invalid");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setPackage(packageName);
        contextA.sendOrderedBroadcast(intent, null);
    }
}
