package com.heytap.store.base.core.util.encryption;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes3.dex */
public enum EncryptMode {
    AES512("AES", 512),
    AES256("AES", 256),
    AES128("AES", 128),
    AES192("AES", 192),
    RSA("RSA", 512);

    private int mode;
    private String type;

    EncryptMode(String str, int i) {
        this.type = str;
        this.mode = i;
    }

    public List<? extends Key> getKey() throws Exception {
        if (this.type.equals("AES")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(this.type);
            keyGenerator.init(this.mode);
            return BaseUtils.createList(keyGenerator.generateKey());
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(this.type);
        keyPairGenerator.initialize(this.mode);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        return BaseUtils.createList((RSAPublicKey) keyPairGenerateKeyPair.getPublic(), (RSAPrivateKey) keyPairGenerateKeyPair.getPrivate());
    }

    public List<String> getKeyStr() throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Key> it = getKey().iterator();
        while (it.hasNext()) {
            arrayList.add(android.util.Base64.encodeToString(it.next().getEncoded(), 2));
        }
        return arrayList;
    }

    public int getMode() {
        return this.mode;
    }

    public String getType() {
        return this.type;
    }
}
