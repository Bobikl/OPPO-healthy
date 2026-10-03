package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class n3h {
    public final BigInteger a;
    public final int b;

    public n3h(BigInteger bigInteger, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.a = bigInteger;
        this.b = i;
    }

    public n3h a(n3h n3hVar) {
        c(n3hVar);
        return new n3h(this.a.add(n3hVar.a), this.b);
    }

    public n3h b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        int i2 = this.b;
        return i == i2 ? this : new n3h(this.a.shiftLeft(i - i2), i);
    }

    public final void c(n3h n3hVar) {
        if (this.b != n3hVar.b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    public int d(BigInteger bigInteger) {
        return this.a.compareTo(bigInteger.shiftLeft(this.b));
    }

    public BigInteger e() {
        return this.a.shiftRight(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3h)) {
            return false;
        }
        n3h n3hVar = (n3h) obj;
        return this.a.equals(n3hVar.a) && this.b == n3hVar.b;
    }

    public int f() {
        return this.b;
    }

    public n3h g() {
        return new n3h(this.a.negate(), this.b);
    }

    public BigInteger h() {
        return a(new n3h(z76.ONE, 1).b(this.b)).e();
    }

    public int hashCode() {
        return this.b ^ this.a.hashCode();
    }

    public n3h i(n3h n3hVar) {
        return a(n3hVar.g());
    }

    public n3h j(BigInteger bigInteger) {
        return new n3h(this.a.subtract(bigInteger.shiftLeft(this.b)), this.b);
    }

    public String toString() {
        if (this.b == 0) {
            return this.a.toString();
        }
        BigInteger bigIntegerE = e();
        BigInteger bigIntegerSubtract = this.a.subtract(bigIntegerE.shiftLeft(this.b));
        if (this.a.signum() == -1) {
            bigIntegerSubtract = z76.ONE.shiftLeft(this.b).subtract(bigIntegerSubtract);
        }
        if (bigIntegerE.signum() == -1 && !bigIntegerSubtract.equals(z76.ZERO)) {
            bigIntegerE = bigIntegerE.add(z76.ONE);
        }
        String string = bigIntegerE.toString();
        char[] cArr = new char[this.b];
        String string2 = bigIntegerSubtract.toString(2);
        int length = string2.length();
        int i = this.b - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = string2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
