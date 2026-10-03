package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes11.dex */
public class op0 extends o1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o1[] f15011j;

    public class a implements Enumeration {
        public int a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.a < op0.this.f15011j.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            o1[] o1VarArr = op0.this.f15011j;
            int i = this.a;
            this.a = i + 1;
            return o1VarArr[i];
        }
    }

    public op0(byte[] bArr) {
        super(bArr);
    }

    public static op0 q(s1 s1Var) {
        o1[] o1VarArr = new o1[s1Var.size()];
        Enumeration enumerationQ = s1Var.q();
        int i = 0;
        while (enumerationQ.hasMoreElements()) {
            o1VarArr[i] = (o1) enumerationQ.nextElement();
            i++;
        }
        return new op0(o1VarArr);
    }

    public static byte[] t(o1[] o1VarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != o1VarArr.length; i++) {
            try {
                byteArrayOutputStream.write(((tj4) o1VarArr[i]).o());
            } catch (IOException e2) {
                throw new IllegalArgumentException("exception converting octets " + e2.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(o1VarArr[i].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.c(36);
        q1Var.c(128);
        Enumeration enumerationS = s();
        while (enumerationS.hasMoreElements()) {
            q1Var.j((f1) enumerationS.nextElement());
        }
        q1Var.c(0);
        q1Var.c(0);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        Enumeration enumerationS = s();
        int iH = 0;
        while (enumerationS.hasMoreElements()) {
            iH += ((f1) enumerationS.nextElement()).c().h();
        }
        return iH + 2 + 2;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.o1
    public byte[] o() {
        return this.i;
    }

    public final Vector r() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.i;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = i + 1000;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i, bArr2, 0, length);
            vector.addElement(new tj4(bArr2));
            i = i2;
        }
    }

    public Enumeration s() {
        return this.f15011j == null ? r().elements() : new a();
    }

    public op0(o1[] o1VarArr) {
        super(t(o1VarArr));
        this.f15011j = o1VarArr;
    }
}
