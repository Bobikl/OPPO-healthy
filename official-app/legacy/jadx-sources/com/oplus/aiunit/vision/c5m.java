package com.oplus.aiunit.vision;

import java.io.IOException;
import java.security.Principal;

/* JADX INFO: loaded from: classes11.dex */
public class c5m extends a5m implements Principal {
    @Override // com.oplus.aiunit.vision.m1
    public byte[] d() {
        try {
            return e("DER");
        } catch (IOException e2) {
            throw new RuntimeException(e2.toString());
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }
}
