package com.oplus.aiunit.vision;

import java.util.Hashtable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class qe8 implements edb {
    public static Hashtable h;
    public ns5 a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15766c;
    public gsb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gsb f15767e;
    public byte[] f;
    public byte[] g;

    static {
        Hashtable hashtable = new Hashtable();
        h = hashtable;
        hashtable.put("GOST3411", kca.b(32));
        h.put(MessageDigestAlgorithms.MD2, kca.b(16));
        h.put("MD4", kca.b(64));
        h.put("MD5", kca.b(64));
        h.put("RIPEMD128", kca.b(64));
        h.put("RIPEMD160", kca.b(64));
        h.put(MessageDigestAlgorithms.SHA_1, kca.b(64));
        h.put(MessageDigestAlgorithms.SHA_224, kca.b(64));
        h.put(MessageDigestAlgorithms.SHA_256, kca.b(64));
        h.put(MessageDigestAlgorithms.SHA_384, kca.b(128));
        h.put(MessageDigestAlgorithms.SHA_512, kca.b(128));
        h.put("Tiger", kca.b(64));
        h.put("Whirlpool", kca.b(64));
    }

    public qe8(ns5 ns5Var) {
        this(ns5Var, f(ns5Var));
    }

    public static int f(ns5 ns5Var) {
        if (ns5Var instanceof nz6) {
            return ((nz6) ns5Var).g();
        }
        Integer num = (Integer) h.get(ns5Var.c());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + ns5Var.c());
    }

    public static void g(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    @Override // com.oplus.aiunit.vision.edb
    public int a(byte[] bArr, int i) {
        this.a.a(this.g, this.f15766c);
        gsb gsbVar = this.f15767e;
        if (gsbVar != null) {
            ((gsb) this.a).d(gsbVar);
            ns5 ns5Var = this.a;
            ns5Var.update(this.g, this.f15766c, ns5Var.f());
        } else {
            ns5 ns5Var2 = this.a;
            byte[] bArr2 = this.g;
            ns5Var2.update(bArr2, 0, bArr2.length);
        }
        int iA = this.a.a(bArr, i);
        int i2 = this.f15766c;
        while (true) {
            byte[] bArr3 = this.g;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        gsb gsbVar2 = this.d;
        if (gsbVar2 != null) {
            ((gsb) this.a).d(gsbVar2);
        } else {
            ns5 ns5Var3 = this.a;
            byte[] bArr4 = this.f;
            ns5Var3.update(bArr4, 0, bArr4.length);
        }
        return iA;
    }

    @Override // com.oplus.aiunit.vision.edb
    public void b(byte b) {
        this.a.b(b);
    }

    @Override // com.oplus.aiunit.vision.edb
    public String c() {
        return this.a.c() + "/HMAC";
    }

    @Override // com.oplus.aiunit.vision.edb
    public int d() {
        return this.b;
    }

    @Override // com.oplus.aiunit.vision.edb
    public void e(eb3 eb3Var) {
        byte[] bArr;
        this.a.reset();
        byte[] bArrA = ((eoa) eb3Var).a();
        int length = bArrA.length;
        if (length > this.f15766c) {
            this.a.update(bArrA, 0, length);
            this.a.a(this.f, 0);
            length = this.b;
        } else {
            System.arraycopy(bArrA, 0, this.f, 0, length);
        }
        while (true) {
            bArr = this.f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.g, 0, this.f15766c);
        g(this.f, this.f15766c, (byte) 54);
        g(this.g, this.f15766c, (byte) 92);
        ns5 ns5Var = this.a;
        if (ns5Var instanceof gsb) {
            gsb gsbVarCopy = ((gsb) ns5Var).copy();
            this.f15767e = gsbVarCopy;
            ((ns5) gsbVarCopy).update(this.g, 0, this.f15766c);
        }
        ns5 ns5Var2 = this.a;
        byte[] bArr2 = this.f;
        ns5Var2.update(bArr2, 0, bArr2.length);
        ns5 ns5Var3 = this.a;
        if (ns5Var3 instanceof gsb) {
            this.d = ((gsb) ns5Var3).copy();
        }
    }

    @Override // com.oplus.aiunit.vision.edb
    public void update(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }

    public qe8(ns5 ns5Var, int i) {
        this.a = ns5Var;
        int iF = ns5Var.f();
        this.b = iF;
        this.f15766c = i;
        this.f = new byte[i];
        this.g = new byte[i + iF];
    }
}
