package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class bca {
    public int a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9673c;
    public final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9674e;
    public int f;
    public int g;

    public bca() {
        this(51, 0.8f);
    }

    public boolean a(int i) {
        if (i == 0) {
            if (this.f9673c) {
                return false;
            }
            this.f9673c = true;
            this.a++;
            return true;
        }
        int iD = d(i);
        if (iD >= 0) {
            return false;
        }
        int i2 = -(iD + 1);
        int[] iArr = this.b;
        iArr[i2] = i;
        int i3 = this.a + 1;
        this.a = i3;
        if (i3 >= this.f9674e) {
            g(iArr.length << 1);
        }
        return true;
    }

    public final void b(int i) {
        int[] iArr = this.b;
        int iE = e(i);
        while (iArr[iE] != 0) {
            iE = (iE + 1) & this.g;
        }
        iArr[iE] = i;
    }

    public boolean c(int i) {
        if (i == 0) {
            return this.f9673c;
        }
        return d(i) >= 0;
    }

    public final int d(int i) {
        int[] iArr = this.b;
        int iE = e(i);
        while (true) {
            int i2 = iArr[iE];
            if (i2 == 0) {
                return -(iE + 1);
            }
            if (i2 == i) {
                return iE;
            }
            iE = (iE + 1) & this.g;
        }
    }

    public int e(int i) {
        return (int) ((((long) i) * (-7046029254386353131L)) >>> this.f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bca)) {
            return false;
        }
        bca bcaVar = (bca) obj;
        if (bcaVar.a != this.a || bcaVar.f9673c != this.f9673c) {
            return false;
        }
        for (int i : this.b) {
            if (i != 0 && !bcaVar.c(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean f(int i) {
        if (i == 0) {
            if (!this.f9673c) {
                return false;
            }
            this.f9673c = false;
            this.a--;
            return true;
        }
        int iD = d(i);
        if (iD < 0) {
            return false;
        }
        int[] iArr = this.b;
        int i2 = this.g;
        int i3 = iD + 1;
        while (true) {
            int i4 = i3 & i2;
            int i5 = iArr[i4];
            if (i5 == 0) {
                iArr[iD] = 0;
                this.a--;
                return true;
            }
            int iE = e(i5);
            if (((i4 - iE) & i2) > ((iD - iE) & i2)) {
                iArr[iD] = i5;
                iD = i4;
            }
            i3 = i4 + 1;
        }
    }

    public final void g(int i) {
        int length = this.b.length;
        this.f9674e = (int) (i * this.d);
        int i2 = i - 1;
        this.g = i2;
        this.f = Long.numberOfLeadingZeros(i2);
        int[] iArr = this.b;
        this.b = new int[i];
        if (this.a > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr[i3];
                if (i4 != 0) {
                    b(i4);
                }
            }
        }
    }

    public int hashCode() {
        int i = this.a;
        for (int i2 : this.b) {
            if (i2 != 0) {
                i += i2;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[EDGE_INSN: B:21:0x0037->B:15:0x002d BREAK  A[LOOP:0: B:9:0x0020->B:13:0x0028]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:16:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.a
            if (r0 != 0) goto L7
            java.lang.String r4 = "[]"
            return r4
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r4.b
            int r2 = r1.length
            boolean r4 = r4.f9673c
            if (r4 == 0) goto L20
            java.lang.String r4 = "0"
            r0.append(r4)
            goto L2e
        L20:
            int r4 = r2 + (-1)
            if (r2 <= 0) goto L2d
            r2 = r1[r4]
            if (r2 != 0) goto L2a
            r2 = r4
            goto L20
        L2a:
            r0.append(r2)
        L2d:
            r2 = r4
        L2e:
            int r4 = r2 + (-1)
            if (r2 <= 0) goto L40
            r2 = r1[r4]
            if (r2 != 0) goto L37
            goto L2d
        L37:
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r2)
            goto L2d
        L40:
            r4 = 93
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oplus.aiunit.vision.bca.toString():java.lang.String");
    }

    public bca(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.d = f;
        int iH = com.badlogic.gdx.utils.j.h(i, f);
        this.f9674e = (int) (iH * f);
        int i2 = iH - 1;
        this.g = i2;
        this.f = Long.numberOfLeadingZeros(i2);
        this.b = new int[iH];
    }
}
