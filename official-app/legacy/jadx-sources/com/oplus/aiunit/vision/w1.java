package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes11.dex */
public class w1 {
    public final InputStream a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[][] f18075c;

    public w1(InputStream inputStream) {
        this(inputStream, lwi.c(inputStream));
    }

    public f1 a(int i) throws IOException {
        if (i == 4) {
            return new pp0(this);
        }
        if (i == 8) {
            return new mj4(this);
        }
        if (i == 16) {
            return new rp0(this);
        }
        if (i == 17) {
            return new tp0(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
    }

    public f1 b() throws IOException {
        int i = this.a.read();
        if (i == -1) {
            return null;
        }
        e(false);
        int iT = j1.t(this.a, i);
        boolean z = (i & 32) != 0;
        int iP = j1.p(this.a, this.b);
        if (iP < 0) {
            if (!z) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            w1 w1Var = new w1(new e6a(this.a, this.b), this.b);
            if ((i & 64) != 0) {
                return new mp0(iT, w1Var);
            }
            return (i & 128) != 0 ? new vp0(true, iT, w1Var) : w1Var.a(iT);
        }
        z75 z75Var = new z75(this.a, iP);
        if ((i & 64) != 0) {
            return new ij4(z, iT, z75Var.h());
        }
        if ((i & 128) != 0) {
            return new vp0(z, iT, new w1(z75Var));
        }
        if (!z) {
            if (iT == 4) {
                return new uj4(z75Var);
            }
            try {
                return j1.i(iT, z75Var, this.f18075c);
            } catch (IllegalArgumentException e2) {
                throw new ASN1Exception("corrupted stream detected", e2);
            }
        }
        if (iT == 4) {
            return new pp0(new w1(z75Var));
        }
        if (iT == 8) {
            return new mj4(new w1(z75Var));
        }
        if (iT == 16) {
            return new yj4(new w1(z75Var));
        }
        if (iT == 17) {
            return new ak4(new w1(z75Var));
        }
        throw new IOException("unknown tag " + iT + " encountered");
    }

    public r1 c(boolean z, int i) throws IOException {
        if (!z) {
            return new ck4(false, i, new tj4(((z75) this.a).h()));
        }
        g1 g1VarD = d();
        if (this.a instanceof e6a) {
            return g1VarD.c() == 1 ? new up0(true, i, g1VarD.b(0)) : new up0(false, i, np0.a(g1VarD));
        }
        return g1VarD.c() == 1 ? new ck4(true, i, g1VarD.b(0)) : new ck4(false, i, nj4.a(g1VarD));
    }

    public g1 d() throws IOException {
        g1 g1Var = new g1();
        while (true) {
            f1 f1VarB = b();
            if (f1VarB == null) {
                return g1Var;
            }
            if (f1VarB instanceof x5a) {
                g1Var.a(((x5a) f1VarB).a());
            } else {
                g1Var.a(f1VarB.c());
            }
        }
    }

    public final void e(boolean z) {
        InputStream inputStream = this.a;
        if (inputStream instanceof e6a) {
            ((e6a) inputStream).i(z);
        }
    }

    public w1(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
        this.f18075c = new byte[11][];
    }
}
