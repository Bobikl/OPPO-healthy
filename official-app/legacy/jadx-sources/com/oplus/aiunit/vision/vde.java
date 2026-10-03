package com.oplus.aiunit.vision;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class vde extends BufferedWriter {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char[] f17819j;

    public vde(Writer writer) {
        super(writer);
        this.f17819j = new char[64];
        String strD = Strings.d();
        if (strD != null) {
            this.i = strD.length();
        } else {
            this.i = 2;
        }
    }

    public final void a(byte[] bArr) throws IOException {
        char[] cArr;
        int i;
        byte[] bArrA = py0.a(bArr);
        int length = 0;
        while (length < bArrA.length) {
            int i2 = 0;
            while (true) {
                cArr = this.f17819j;
                if (i2 == cArr.length || (i = length + i2) >= bArrA.length) {
                    break;
                }
                cArr[i2] = (char) bArrA[i];
                i2++;
            }
            write(cArr, 0, i2);
            newLine();
            length += this.f17819j.length;
        }
    }

    public void g(ude udeVar) throws IOException {
        tde tdeVarA = udeVar.a();
        i(tdeVarA.d());
        if (!tdeVarA.c().isEmpty()) {
            for (sde sdeVar : tdeVarA.c()) {
                write(sdeVar.b());
                write(": ");
                write(sdeVar.c());
                newLine();
            }
            newLine();
        }
        a(tdeVarA.b());
        h(tdeVarA.d());
    }

    public final void h(String str) throws IOException {
        write("-----END " + str + "-----");
        newLine();
    }

    public final void i(String str) throws IOException {
        write("-----BEGIN " + str + "-----");
        newLine();
    }
}
