package com.oplus.aiunit.vision;

import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes10.dex */
public class rcm {
    public SSLContext a = null;
    public String b;

    public rcm(String str) {
        this.b = str;
    }

    public static SSLContext b(String str) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new nim(str)}, null);
            return sSLContext;
        } catch (Exception e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final SSLContext a() {
        if (this.a == null) {
            this.a = b(this.b);
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(rcm.class);
    }

    public int hashCode() {
        return rcm.class.hashCode();
    }
}
