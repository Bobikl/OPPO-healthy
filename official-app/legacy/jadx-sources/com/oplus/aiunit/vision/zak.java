package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public class zak implements Cloneable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19346l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f19347n;
    public Handler o;
    public Runnable p;
    public wc2 s;
    public cn6 t;
    public volatile int i = 20;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f19345j = 10;
    public volatile int k = 20;
    public boolean q = false;
    public boolean r = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wil.d("TLayer", "receive: timeout");
            zak.this.r = false;
            synchronized (zak.this) {
                if (zak.this.s != null && zak.this.s.f() > 0) {
                    zak.this.q = true;
                    zak.this.z(true);
                }
            }
        }
    }

    public interface b {
        void a(br0 br0Var);
    }

    public synchronized void A(byte[] bArr) {
        if (this.s == null) {
            this.s = new wc2(this.k * 2);
        }
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length;
            f(bArr.length * 2);
            int i = 0;
            while (length > 0) {
                int iC = this.s.c() - this.s.f();
                if (length <= iC) {
                    iC = length;
                }
                this.s.a(bArr, i, iC);
                z(false);
                i += iC;
                length -= iC;
            }
            return;
        }
        wil.a("TLayer", "spliceMTUPackage: dataContent == null");
    }

    public List<byte[]> B(br0 br0Var) {
        return k(br0Var);
    }

    public List<byte[]> C(byte[] bArr) {
        int i = this.i;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        if (length <= i) {
            arrayList.add(bArr);
        } else {
            int i2 = length % i > 0 ? (length / i) + 1 : length / i;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 * i;
                arrayList.add(Arrays.copyOfRange(bArr, i4, (i3 == i2 + (-1) ? length - (i * i3) : i) + i4));
                i3++;
            }
        }
        return arrayList;
    }

    public final int e(int i, int i2, int i3) {
        if (i3 <= 131) {
            return 1;
        }
        if (i == 0) {
            if (i2 <= 125) {
                return 1;
            }
        } else if (i2 <= 124) {
            return 1;
        }
        return 2;
    }

    public final synchronized void f(int i) {
        wc2 wc2Var = this.s;
        if (wc2Var == null) {
            this.s = new wc2(i);
        } else if (wc2Var.c() < i) {
            wil.d("TLayer", "checkBufferSize bufferExpand: old " + this.s.c() + " ,new " + i);
            byte[] bArrG = this.s.g();
            wc2 wc2Var2 = new wc2(i);
            this.s = wc2Var2;
            wc2Var2.a(bArrG, 0, bArrG.length);
        }
    }

    public synchronized void i() {
        wil.a("TLayer", "clean");
        wc2 wc2Var = this.s;
        if (wc2Var != null) {
            wc2Var.d();
        }
        u();
        this.o = null;
        this.m = null;
        this.f19346l = -1;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public zak clone() {
        try {
            return (zak) super.clone();
        } catch (CloneNotSupportedException e2) {
            wil.b("TLayer", "CloneNotSupportedException: " + e2.getMessage());
            return null;
        }
    }

    public final List<byte[]> k(br0 br0Var) {
        boolean z;
        zak zakVar = this;
        byte[] bArrE = null;
        if (br0Var == null) {
            wil.b("TLayer", "getFrameList: btCommand == null");
            return null;
        }
        byte[] bArrC = br0Var.c();
        boolean zE = br0Var.e();
        boolean zF = br0Var.f();
        if (bArrC == null || bArrC.length == 0) {
            wil.b("TLayer", "getFrameList: dataContent == null");
            return null;
        }
        if (r()) {
            try {
                bArrE = eqg.g().e(bArrC, zakVar.t.c(), zakVar.t.b(), zakVar.t.a());
            } catch (Exception unused) {
                wil.b("TLayer", "getFrameList: encrypt fail");
            }
            if (bArrE != null) {
                zF = zakVar.t.d();
                bArrC = bArrE;
            }
        }
        int i = zakVar.k;
        ArrayList arrayList = new ArrayList();
        int length = bArrC.length;
        int i2 = 0;
        int i3 = 0;
        byte b2 = 0;
        int i4 = 0;
        while (length > 0) {
            int iE = zakVar.e(i2, length, i);
            int i5 = (((i - iE) - 1) - 2) - 2;
            if (i2 == 0) {
                if (length <= i5) {
                    i3 = length;
                    b2 = 0;
                    z = false;
                } else {
                    i3 = i5 - 1;
                    b2 = 1;
                    z = true;
                }
            } else if (i2 <= 0) {
                z = true;
            } else {
                i3 = i5 - 1;
                if (length <= i3) {
                    b2 = 3;
                    i3 = length;
                    z = true;
                } else {
                    z = true;
                    b2 = 2;
                }
            }
            int i6 = z ? i3 + 3 : i3 + 2;
            int i7 = i6 + 1 + iE + 2;
            byte[] bArr = new byte[i7];
            bArr[0] = -86;
            int i8 = i;
            if (i6 <= 127) {
                bArr[1] = (byte) (i6 & 127);
            } else {
                bArr[1] = (byte) ((i6 & 127) | 128);
                bArr[2] = (byte) ((i6 >>> 7) & 127);
            }
            byte b3 = zE ? (byte) 8 : (byte) 0;
            if (zF) {
                b3 = (byte) (b3 | 64);
            }
            byte b4 = (byte) (b3 | b2);
            int i9 = iE + 1;
            bArr[i9] = b4;
            bArr[i9 + 1] = (byte) (b4 >> 8);
            int i10 = i9 + 2;
            if (z) {
                bArr[i10] = (byte) (i2 & 255);
                i10++;
            }
            System.arraycopy(bArrC, i4, bArr, i10, i3);
            int i11 = i7 - 2;
            int iA = on2.a(bArr, 0, i11);
            bArr[i11] = (byte) (iA & 255);
            bArr[i7 - 1] = (byte) ((iA >>> 8) & 255);
            arrayList.add(bArr);
            i2++;
            i4 += i3;
            length -= i3;
            zakVar = this;
            i = i8;
        }
        wil.a("TLayer", "getFrameList: input " + bArrC.length + " to " + arrayList.size() + " frames");
        return arrayList;
    }

    public final void m(byte[] bArr, int i, int i2) {
        b bVar;
        br0 br0VarS = s(bArr, i, i2);
        if (br0VarS == null || (bVar = this.f19347n) == null) {
            return;
        }
        bVar.a(br0VarS);
    }

    public final void q() {
        if (Looper.myLooper() != null && this.o == null) {
            this.o = new Handler(Looper.myLooper());
        }
        if (this.p == null) {
            this.p = new a();
        }
    }

    public final boolean r() {
        cn6 cn6Var = this.t;
        return cn6Var != null && cn6Var.d();
    }

    public final synchronized br0 s(byte[] bArr, int i, int i2) {
        int i3;
        try {
            if (i2 - i < 6) {
                wil.k("TLayer", "parseResponsePacket, length is invalid with data = " + fe8.a(bArr));
                return null;
            }
            if (bArr[i] != -86) {
                wil.k("TLayer", "strDataContentHex length is invalid with data = " + fe8.a(bArr));
                return null;
            }
            int i4 = i + 1;
            byte b2 = bArr[i4];
            int i5 = b2 & ByteCompanionObject.MAX_VALUE;
            if ((b2 & ByteCompanionObject.MIN_VALUE) > 0) {
                i4++;
                byte b3 = bArr[i4];
                if ((b3 & ByteCompanionObject.MIN_VALUE) > 0) {
                    return null;
                }
                i3 = b3 & ByteCompanionObject.MAX_VALUE;
            } else {
                i3 = 0;
            }
            int i6 = (i3 << 7) | i5;
            if (this.k > 512 && i6 > this.k) {
                return null;
            }
            int i7 = i4 + 1;
            byte b4 = bArr[i7];
            int i8 = i7 + 1;
            int i9 = (b4 | (bArr[i8] << 8)) & 65535;
            boolean z = (i9 & 64) > 0;
            int i10 = i9 & 3;
            if (i10 == 0) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i8 + 1, i2 - 2);
                if (z && r()) {
                    wil.a("TLayer", "parseLinkLayerPacket: data " + fe8.a(bArrCopyOfRange));
                    bArrCopyOfRange = eqg.g().c(bArrCopyOfRange, this.t.c(), this.t.b(), this.t.a());
                    wil.a("TLayer", "parseLinkLayerPacket: decrypt " + fe8.a(bArrCopyOfRange));
                }
                br0 br0Var = new br0(bArrCopyOfRange);
                br0Var.h(z);
                return br0Var;
            }
            int i11 = i8 + 1;
            int i12 = bArr[i11] & 255;
            int i13 = i11 + 1;
            wil.a("TLayer", "parseLinkLayerPacket lastFsn=" + this.f19346l + " fsn=" + i12 + " ,controlFSN=" + i10);
            if (i10 == 1) {
                this.f19346l = i12;
                this.m = Arrays.copyOfRange(bArr, i13, i2 - 2);
                return null;
            }
            int i14 = this.f19346l;
            if (i14 >= 0 && i12 != ((i14 + 1) & 255)) {
                wil.b("TLayer", "parseLinkLayerPacket mLastFsn " + this.f19346l);
                return null;
            }
            byte[] bArr2 = this.m;
            if (bArr2 == null) {
                wil.d("TLayer", "parseLinkLayerPacket mReceiveDataCache == null");
                return null;
            }
            byte[] bArrC = new byte[((bArr2.length + i2) - i13) - 2];
            System.arraycopy(bArr2, 0, bArrC, 0, bArr2.length);
            System.arraycopy(bArr, i13, bArrC, this.m.length, (i2 - i13) - 2);
            if (i10 != 3) {
                this.f19346l = i12;
                this.m = bArrC;
                return null;
            }
            this.f19346l = -1;
            if (z && r()) {
                wil.a("TLayer", "parseLinkLayerPacket: data " + fe8.a(bArrC));
                bArrC = eqg.g().c(bArrC, this.t.c(), this.t.b(), this.t.a());
                wil.a("TLayer", "parseLinkLayerPacket: decrypt " + fe8.a(bArrC));
            }
            br0 br0Var2 = new br0(bArrC);
            br0Var2.h(z);
            return br0Var2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setOnPackedListener(b bVar) {
        this.f19347n = bVar;
    }

    public final void t() {
        q();
        Handler handler = this.o;
        if (handler != null) {
            this.r = true;
            handler.removeCallbacks(this.p);
            this.o.postDelayed(this.p, 15000L);
        }
    }

    public final void u() {
        this.q = false;
        Handler handler = this.o;
        if (handler != null && this.r) {
            handler.removeCallbacks(this.p);
        }
        this.r = false;
    }

    public synchronized void v(int i) {
        wil.d("TLayer", "setDeviceMaxFrameSize: mDeviceMaxFrameSize change old " + this.k + " ,new " + i);
        this.k = i;
        f(i * 2);
    }

    public void w(cn6 cn6Var) {
        this.t = cn6Var;
        wil.a("TLayer", "setEncryptConfig: " + this.t);
    }

    public void x(int i) {
        wil.a("TLayer", "setMTU: mtu change old " + this.i + " ,new " + i);
        this.i = i;
    }

    public void y(int i) {
        this.f19345j = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.oplus.aiunit.vision.zak] */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.oplus.aiunit.vision.wc2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.oplus.aiunit.vision.wc2] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final synchronized void z(boolean z) {
        int i;
        int i2;
        if (this.s == null) {
            wil.a("TLayer", "spliceMTUPackage: buffer == null");
            return;
        }
        if (z != 0) {
            wil.k("TLayer", "spliceMTUPackage: buffer =" + this.s.f() + " fromTimeout true");
        }
        int iF = this.s.f();
        byte[] bArrB = this.s.b();
        while (true) {
            boolean z2 = false;
            ?? r13 = z;
            while (true) {
                if (r13 >= iF) {
                    this.s.d();
                    return;
                }
                if (bArrB[r13] == -86) {
                    break;
                }
                if (!z2) {
                    wil.k("TLayer", "spliceMTUPackage SOF check error " + r13);
                    z2 = true;
                }
                r13++;
            }
            if (r13 + 6 <= iF) {
                int i3 = r13 + 1;
                byte b2 = bArrB[i3];
                int i4 = b2 & ByteCompanionObject.MAX_VALUE;
                if ((b2 & ByteCompanionObject.MIN_VALUE) > 0) {
                    i2 = i3 + 1;
                    byte b3 = bArrB[i2];
                    if ((b3 & ByteCompanionObject.MIN_VALUE) > 0) {
                        wil.k("TLayer", "spliceMTUPackage length overflow to 3bytes");
                    } else {
                        i = b3 & ByteCompanionObject.MAX_VALUE;
                    }
                    z = i3;
                } else {
                    i = 0;
                    i2 = i3;
                }
                int i5 = i4 | (i << 7);
                if (this.k <= 512 || i5 <= this.k) {
                    int i6 = i2 + i5;
                    int i7 = i6 + 2;
                    if (i7 < iF) {
                        int i8 = i6 + 1;
                        int i9 = bArrB[i8] & 255;
                        int i10 = bArrB[i7] & 255;
                        int i11 = ((i10 << 8) | i9) & 65535;
                        int i12 = (i10 | (i9 << 8)) & 65535;
                        int iA = on2.a(bArrB, r13, i8);
                        if (i11 == iA || i12 == iA) {
                            u();
                            int i13 = i2 + i5 + 2 + 1;
                            m(bArrB, r13, i13);
                            z = i13;
                        } else {
                            wil.k("TLayer", "spliceMTUPackage crc check error frameStartPosition=" + r13 + " rCrc=" + i11 + " lCrc=" + iA);
                        }
                    } else if (!this.q) {
                        this.s.d();
                        this.s.a(bArrB, r13, iF - r13);
                        t();
                        return;
                    } else {
                        this.q = false;
                        wil.k("TLayer", "spliceMTUPackage out of time2, require len=" + i7 + " rcvLen=" + iF);
                    }
                } else {
                    wil.k("TLayer", "spliceMTUPackage length overflow " + i5 + " maxLen=" + this.k);
                }
                z = i3;
            } else {
                if (!this.q) {
                    this.s.d();
                    this.s.a(bArrB, r13, iF - r13);
                    t();
                    return;
                }
                z = r13 + 1;
                this.q = false;
                wil.k("TLayer", "spliceMTUPackage out of time1, require len=" + (z + 6) + " rcvLen=" + iF);
            }
        }
    }
}
