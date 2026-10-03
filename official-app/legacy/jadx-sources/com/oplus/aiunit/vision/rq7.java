package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
public class rq7 extends PushbackReader {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16306j;
    public int k;

    public rq7(Reader reader) {
        super(reader, 8);
        this.i = 0;
        this.f16306j = 0;
        this.k = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (com.oplus.aiunit.vision.srk.c((char) r10.f16306j) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (com.oplus.aiunit.vision.srk.c((char) r10.f16306j) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final char a(char c2) {
        int i = this.i;
        if (i == 0) {
            if (c2 == '&') {
                this.i = 1;
            }
            return c2;
        }
        if (i == 1) {
            if (c2 == '#') {
                this.i = 2;
            } else {
                this.i = 5;
            }
            return c2;
        }
        if (i == 2) {
            if (c2 == 'x') {
                this.f16306j = 0;
                this.k = 0;
                this.i = 3;
            } else if ('0' > c2 || c2 > '9') {
                this.i = 5;
            } else {
                this.f16306j = Character.digit(c2, 10);
                this.k = 1;
                this.i = 4;
            }
            return c2;
        }
        if (i == 3) {
            if (('0' <= c2 && c2 <= '9') || (('a' <= c2 && c2 <= 'f') || ('A' <= c2 && c2 <= 'F'))) {
                this.f16306j = (this.f16306j * 16) + Character.digit(c2, 16);
                int i2 = this.k + 1;
                this.k = i2;
                if (i2 <= 4) {
                    this.i = 3;
                }
                return c2;
            }
            if (c2 == ';') {
            }
            this.i = 5;
            return c2;
        }
        if (i != 4) {
            if (i != 5) {
                return c2;
            }
            this.i = 0;
            return c2;
        }
        if ('0' <= c2 && c2 <= '9') {
            this.f16306j = (this.f16306j * 10) + Character.digit(c2, 10);
            int i3 = this.k + 1;
            this.k = i3;
            if (i3 <= 5) {
                this.i = 4;
            }
            return c2;
        }
        if (c2 == ';') {
        }
        this.i = 5;
        return c2;
        this.i = 0;
        return (char) this.f16306j;
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        boolean z;
        char[] cArr2 = new char[8];
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            z = true;
            while (true) {
                if (!z || i3 >= i2) {
                    break loop0;
                }
                z = super.read(cArr2, i4, 1) == 1;
                if (z) {
                    char cA = a(cArr2[i4]);
                    int i5 = this.i;
                    if (i5 == 0) {
                        if (srk.c(cA)) {
                            cA = StringUtil.SPACE;
                        }
                        cArr[i] = cA;
                        i3++;
                        i++;
                    } else {
                        i4++;
                        if (i5 == 5) {
                            unread(cArr2, 0, i4);
                        }
                    }
                    i4 = 0;
                } else if (i4 > 0) {
                    break;
                }
            }
            unread(cArr2, 0, i4);
            this.i = 5;
            i4 = 0;
        }
        if (i3 > 0 || z) {
            return i3;
        }
        return -1;
    }
}
