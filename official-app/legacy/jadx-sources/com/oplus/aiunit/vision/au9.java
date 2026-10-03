package com.oplus.aiunit.vision;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public interface au9 {
    public static final String SERVICE_ACTION = "deepthinker.intent.action.BIND_INTERFACE_SERVER";
    public static final String SERVICE_PKG = "com.oplus.deepthinker";

    static Intent a() {
        Intent intent = new Intent();
        intent.setAction(SERVICE_ACTION);
        intent.setPackage(SERVICE_PKG);
        return intent;
    }
}
