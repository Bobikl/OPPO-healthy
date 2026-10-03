package com.sensorsdata.analytics.android.sdk.encrypt.impl;

import android.net.Uri;
import com.sensorsdata.analytics.android.sdk.encrypt.SecreteKey;

/* JADX INFO: loaded from: classes10.dex */
public interface SAEncryptAPI {
    String decryptAES(String str);

    String encryptAES(String str);

    <T> T encryptEventData(T t);

    <T> T encryptEventData(T t, SecreteKey secreteKey);

    String loadSecretKey();

    void storeSecretKey(String str);

    String verifySecretKey(Uri uri);
}
