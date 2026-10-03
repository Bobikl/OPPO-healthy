package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;

/* JADX INFO: loaded from: classes12.dex */
public class b8e {
    public String a;
    public int b = 0;

    public b8e(String str) {
        this.a = str;
    }

    public char a() {
        if (this.b < this.a.length()) {
            return this.a.charAt(this.b);
        }
        return (char) 0;
    }

    public char b(int i) {
        if (i < this.a.length()) {
            return this.a.charAt(i);
        }
        return (char) 0;
    }

    public int c(String str, int i) throws XMPException {
        char cB = b(this.b);
        int i2 = 0;
        boolean z = false;
        while ('0' <= cB && cB <= '9') {
            i2 = (i2 * 10) + (cB - '0');
            z = true;
            int i3 = this.b + 1;
            this.b = i3;
            cB = b(i3);
        }
        if (!z) {
            throw new XMPException(str, 5);
        }
        if (i2 > i) {
            return i;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public boolean d() {
        return this.b < this.a.length();
    }

    public int e() {
        return this.b;
    }

    public void f() {
        this.b++;
    }
}
