package com.oplus.aiunit.vision;

import java.security.Provider;
import java.security.Security;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes11.dex */
public class ip0 extends q2f {
    public static volatile Provider b;

    public ip0() {
        super(b());
    }

    public static Provider b() {
        if (Security.getProvider("SC") != null) {
            return Security.getProvider("SC");
        }
        if (b != null) {
            return b;
        }
        b = new BouncyCastleProvider();
        return b;
    }
}
