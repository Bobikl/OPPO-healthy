package com.platform.account.third.api.data;

import androidx.annotation.Keep;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class BiometricBean {
    private int authenticationType;
    private Cipher cipher;

    public BiometricBean(int i, Cipher cipher) {
        this.authenticationType = i;
        this.cipher = cipher;
    }

    public int getAuthenticationType() {
        return this.authenticationType;
    }

    public Cipher getCipher() {
        return this.cipher;
    }

    public void setAuthenticationType(int i) {
        this.authenticationType = i;
    }

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
    }
}
