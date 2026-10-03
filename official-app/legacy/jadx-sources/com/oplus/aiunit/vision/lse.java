package com.oplus.aiunit.vision;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class lse extends BufferedInputStream {
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mv9 f13817j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13818l;

    public lse(File file, String str, mv9 mv9Var) throws FileNotFoundException {
        super(new FileInputStream(file));
        this.f13818l = 0;
        this.i = str;
        this.k = System.currentTimeMillis();
        this.f13817j = mv9Var;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f13818l == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, i2);
        if (i3 == -1) {
            this.f13818l = -1;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
            if (this.f13817j != null && jCurrentTimeMillis > 80) {
                HashMap map = new HashMap(2);
                map.put("pt", "" + jCurrentTimeMillis);
                map.put("pu", "" + this.i);
                this.f13817j.upload(map);
            }
        }
        return i3;
    }
}
