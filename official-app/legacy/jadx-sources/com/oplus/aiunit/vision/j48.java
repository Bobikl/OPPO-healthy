package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class j48 extends m1 implements e1 {
    public static final int dNSName = 2;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int iPAddress = 7;
    public static final int otherName = 0;
    public static final int registeredID = 8;
    public static final int rfc822Name = 1;
    public static final int uniformResourceIdentifier = 6;
    public static final int x400Address = 3;
    public f1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12750j;

    public j48(int i, f1 f1Var) {
        this.i = f1Var;
        this.f12750j = i;
    }

    public static j48 f(Object obj) {
        if (obj == null || (obj instanceof j48)) {
            return (j48) obj;
        }
        if (obj instanceof y1) {
            y1 y1Var = (y1) obj;
            int iO = y1Var.o();
            switch (iO) {
                case 0:
                    return new j48(iO, s1.m(y1Var, false));
                case 1:
                    return new j48(iO, qj4.m(y1Var, false));
                case 2:
                    return new j48(iO, qj4.m(y1Var, false));
                case 3:
                    throw new IllegalArgumentException("unknown tag: " + iO);
                case 4:
                    return new j48(iO, x4m.f(y1Var, true));
                case 5:
                    return new j48(iO, s1.m(y1Var, false));
                case 6:
                    return new j48(iO, qj4.m(y1Var, false));
                case 7:
                    return new j48(iO, o1.m(y1Var, false));
                case 8:
                    return new j48(iO, n1.r(y1Var, false));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return f(r1.i((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return this.f12750j == 4 ? new ck4(true, this.f12750j, this.i) : new ck4(false, this.f12750j, this.i);
    }

    public f1 g() {
        return this.i;
    }

    public int h() {
        return this.f12750j;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f12750j);
        stringBuffer.append(": ");
        int i = this.f12750j;
        if (i == 1 || i == 2) {
            stringBuffer.append(qj4.n(this.i).getString());
        } else if (i == 4) {
            stringBuffer.append(x4m.h(this.i).toString());
        } else if (i != 6) {
            stringBuffer.append(this.i.toString());
        } else {
            stringBuffer.append(qj4.n(this.i).getString());
        }
        return stringBuffer.toString();
    }
}
