package com.sensorsdata.analytics.android.sdk.encrypt.encryptor;

import com.heytap.connect.cipher.AESUtil;

/* JADX INFO: loaded from: classes10.dex */
public enum SymmetricEncryptMode {
    AES("AES", AESUtil.AES_PADDING),
    SM4("SM4", "SM4/CBC/PKCS5Padding");

    public String algorithm;
    public String transformation;

    SymmetricEncryptMode(String str, String str2) {
        this.algorithm = str;
        this.transformation = str2;
    }
}
