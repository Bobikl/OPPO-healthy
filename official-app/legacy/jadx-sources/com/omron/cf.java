package com.omron;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class cf extends ca {
    private static final String[] h = {"http://www.", "https://www.", "http://", "https://"};
    private static final String[] i = {".com/", ".org/", ".edu/", ".net/", ".info/", ".biz/", ".gov/", ".com", ".org", ".edu", ".net", ".info", ".biz", ".gov"};
    private final int f;
    private final URL g;

    public cf(int i2, int i3, byte[] bArr) {
        super(i2, i3, bArr, ca.a.URL);
        this.f = b(bArr);
        this.g = c(bArr);
    }

    private String a(byte[] bArr) {
        byte b;
        if (bArr.length >= 5 && (b = bArr[4]) >= 0) {
            String[] strArr = h;
            if (strArr.length > b) {
                return strArr[b];
            }
        }
        return null;
    }

    private int b(byte[] bArr) {
        if (4 <= bArr.length) {
            return bArr[3];
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    private URL c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        String strA = a(bArr);
        if (strA != null) {
            sb.append(strA);
        }
        for (int i2 = 5; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            if (b >= 0) {
                String[] strArr = i;
                if (b < strArr.length) {
                    sb.append(strArr[b]);
                } else if (32 >= b && b < 127) {
                    sb.append((char) b);
                }
            } else if (32 >= b) {
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // com.omron.cq, com.omron.by
    public String toString() {
        return String.format("EddystoneURL(TxPower=%d,URL=%s)", Integer.valueOf(this.f), this.g);
    }
}
