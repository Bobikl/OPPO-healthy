package com.heytap.accessory.utils;

import android.content.Intent;

/* JADX INFO: loaded from: classes14.dex */
public class BroadcastUtils {
    public static final String INTENT_REGISTER_AGENT = "com.heytap.accessory.action.REGISTER_AGENT";

    public static Intent getRegistrationIntent(String str) {
        Intent intent = new Intent("com.heytap.accessory.action.REGISTER_AGENT");
        intent.setPackage(str);
        intent.addFlags(32);
        intent.addFlags(536870912);
        return intent;
    }
}
