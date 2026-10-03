package com.lifesense.plugin.ble.device.proto.A5.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private File a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8756c;
    private byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8757e;
    private String f;

    public b(File file, int i, int i2) {
        this.a = file;
        this.b = i;
        this.f8756c = i2;
        this.f8757e = 0;
        this.d = a(file);
        this.f = file.getName();
        byte[] bArr = this.d;
        if (bArr != null) {
            this.f8757e = bArr.length;
        }
    }

    public float a(int i, int i2, int i3) {
        return (i2 - i) / i3;
    }

    public int b() {
        return this.f8757e;
    }

    public c a(int i, int i2) {
        if (i < 0) {
            return null;
        }
        int i3 = this.f8757e;
        if (i >= i3) {
            return new c(true);
        }
        int i4 = i2 * this.f8756c;
        if ((i3 - i) / i4 > 0) {
            byte[] bArr = new byte[i4];
            System.arraycopy(this.d, i, bArr, 0, i4);
            c cVar = new c(com.lifesense.plugin.ble.c.a.a(bArr, this.f8756c), i4);
            cVar.a(false);
            return cVar;
        }
        int i5 = i3 - i;
        byte[] bArr2 = new byte[i5];
        System.arraycopy(this.d, i, bArr2, 0, i5);
        c cVar2 = new c(com.lifesense.plugin.ble.c.a.a(bArr2, this.f8756c), i5);
        cVar2.a(true);
        return cVar2;
    }

    public byte[] b(int i, int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.d, i, bArr, 0, i2);
        return com.lifesense.plugin.ble.c.a.j(bArr);
    }

    public void a(int i) {
        this.f8756c = i;
    }

    public byte[] a() {
        int i = this.b;
        byte[] bArr = new byte[i];
        byte[] bArr2 = this.d;
        if (bArr2 != null && i < bArr2.length) {
            System.arraycopy(bArr2, 0, bArr, 0, i);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        r3.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] a(File file) throws Throwable {
        Exception exc;
        byte[] bArr;
        FileInputStream fileInputStream;
        Throwable th;
        byte[] bArr2 = null;
        bArr2 = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    bArr2 = new byte[fileInputStream.available()];
                    do {
                    } while (fileInputStream.read(bArr2) > 0);
                    fileInputStream.close();
                } catch (Exception e2) {
                    bArr = bArr2;
                    fileInputStream2 = fileInputStream;
                    exc = e2;
                    exc.printStackTrace();
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    bArr2 = bArr;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = bArr2;
                th = th3;
            }
        } catch (Exception e5) {
            exc = e5;
            bArr = null;
        }
        return bArr2;
    }
}
