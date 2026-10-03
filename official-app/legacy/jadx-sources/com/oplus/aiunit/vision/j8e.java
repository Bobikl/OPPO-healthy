package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.io.ContentReference;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public abstract class j8e extends k8e {
    public static final eia<StreamReadCapability> Y = JsonParser.k;
    public int A;
    public long B;
    public int C;
    public int D;
    public long E;
    public int F;
    public int G;
    public rla H;
    public JsonToken I;
    public final gsj J;
    public char[] K;
    public boolean L;
    public xc2 M;
    public byte[] N;
    public int O;
    public int P;
    public long Q;
    public double R;
    public BigInteger S;
    public BigDecimal T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public final ht9 x;
    public boolean y;
    public int z;

    public j8e(ht9 ht9Var, int i) {
        super(i);
        this.C = 1;
        this.F = 1;
        this.O = 0;
        this.x = ht9Var;
        this.J = ht9Var.k();
        this.H = rla.o(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? v66.f(this) : null);
    }

    public static int[] w1(int[] iArr, int i) {
        return iArr == null ? new int[i] : Arrays.copyOf(iArr, iArr.length + i);
    }

    public final JsonToken A1(String str, double d) {
        this.J.B(str);
        this.R = d;
        this.O = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal B() throws IOException {
        int i = this.O;
        if ((i & 16) == 0) {
            if (i == 0) {
                h1(16);
            }
            if ((this.O & 16) == 0) {
                q1();
            }
        }
        return this.T;
    }

    public final JsonToken B1(boolean z, int i, int i2, int i3) {
        this.U = z;
        this.V = i;
        this.W = i2;
        this.X = i3;
        this.O = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double C() throws IOException {
        int i = this.O;
        if ((i & 8) == 0) {
            if (i == 0) {
                h1(8);
            }
            if ((this.O & 8) == 0) {
                s1();
            }
        }
        return this.R;
    }

    public final JsonToken C1(boolean z, int i) {
        this.U = z;
        this.V = i;
        this.W = 0;
        this.X = 0;
        this.O = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float E() throws IOException {
        return (float) C();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int F() throws IOException {
        int i = this.O;
        if ((i & 1) == 0) {
            if (i == 0) {
                return g1();
            }
            if ((i & 1) == 0) {
                t1();
            }
        }
        return this.P;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long G() throws IOException {
        int i = this.O;
        if ((i & 2) == 0) {
            if (i == 0) {
                h1(2);
            }
            if ((this.O & 2) == 0) {
                u1();
            }
        }
        return this.Q;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType H() throws IOException {
        if (this.O == 0) {
            h1(0);
        }
        if (this.f13193l != JsonToken.VALUE_NUMBER_INT) {
            return (this.O & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.DOUBLE;
        }
        int i = this.O;
        if ((i & 1) != 0) {
            return JsonParser.NumberType.INT;
        }
        return (i & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number I() throws IOException {
        if (this.O == 0) {
            h1(0);
        }
        if (this.f13193l == JsonToken.VALUE_NUMBER_INT) {
            int i = this.O;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.P);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.Q);
            }
            if ((i & 4) != 0) {
                return this.S;
            }
            L0();
        }
        int i2 = this.O;
        if ((i2 & 16) != 0) {
            return this.T;
        }
        if ((i2 & 8) == 0) {
            L0();
        }
        return Double.valueOf(this.R);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number J() throws IOException {
        if (this.f13193l == JsonToken.VALUE_NUMBER_INT) {
            if (this.O == 0) {
                h1(0);
            }
            int i = this.O;
            if ((i & 1) != 0) {
                return Integer.valueOf(this.P);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.Q);
            }
            if ((i & 4) != 0) {
                return this.S;
            }
            L0();
        }
        if (this.O == 0) {
            h1(16);
        }
        int i2 = this.O;
        if ((i2 & 16) != 0) {
            return this.T;
        }
        if ((i2 & 8) == 0) {
            L0();
        }
        return Double.valueOf(this.R);
    }

    public void W0(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) == 0 || (i & mask) == 0) {
            return;
        }
        if (this.H.q() == null) {
            this.H = this.H.v(v66.f(this));
        } else {
            this.H = this.H.v(null);
        }
    }

    public abstract void X0() throws IOException;

    public ContentReference Y0() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.i) ? this.x.l() : ContentReference.unknown();
    }

    public final int Z0(Base64Variant base64Variant, char c2, int i) throws IOException {
        if (c2 != '\\') {
            throw x1(base64Variant, c2, i);
        }
        char cB1 = b1();
        if (cB1 <= ' ' && i == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char(cB1);
        if (iDecodeBase64Char >= 0 || (iDecodeBase64Char == -2 && i >= 2)) {
            return iDecodeBase64Char;
        }
        throw x1(base64Variant, cB1, i);
    }

    public final int a1(Base64Variant base64Variant, int i, int i2) throws IOException {
        if (i != 92) {
            throw x1(base64Variant, i, i2);
        }
        char cB1 = b1();
        if (cB1 <= ' ' && i2 == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char((int) cB1);
        if (iDecodeBase64Char >= 0 || iDecodeBase64Char == -2) {
            return iDecodeBase64Char;
        }
        throw x1(base64Variant, cB1, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean b0() {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this.L;
        }
        return false;
    }

    public abstract char b1() throws IOException;

    public final int c1() throws JsonParseException {
        y0();
        return -1;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.y) {
            return;
        }
        this.z = Math.max(this.z, this.A);
        this.y = true;
        try {
            X0();
        } finally {
            k1();
        }
    }

    public xc2 d1() {
        xc2 xc2Var = this.M;
        if (xc2Var == null) {
            this.M = new xc2();
        } else {
            xc2Var.s();
        }
        return this.M;
    }

    public void e1(Base64Variant base64Variant) throws IOException {
        C0(base64Variant.missingPaddingMessage());
    }

    public char f1(char c2) throws JsonProcessingException {
        if (e0(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c2;
        }
        if (c2 == '\'' && e0(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c2;
        }
        C0("Unrecognized character escape " + k8e.x0(c2));
        return c2;
    }

    public int g1() throws IOException {
        if (this.y) {
            C0("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.f13193l != JsonToken.VALUE_NUMBER_INT || this.V > 9) {
            h1(1);
            if ((this.O & 1) == 0) {
                t1();
            }
            return this.P;
        }
        int iJ = this.J.j(this.U);
        this.P = iJ;
        this.O = 1;
        return iJ;
    }

    public void h1(int i) throws IOException {
        if (this.y) {
            C0("Internal error: _parseNumericValue called when parser instance closed");
        }
        JsonToken jsonToken = this.f13193l;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                i1(i);
                return;
            } else {
                D0("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
                return;
            }
        }
        int i2 = this.V;
        if (i2 <= 9) {
            this.P = this.J.j(this.U);
            this.O = 1;
            return;
        }
        if (i2 > 18) {
            j1(i);
            return;
        }
        long jK = this.J.k(this.U);
        if (i2 == 10) {
            if (this.U) {
                if (jK >= -2147483648L) {
                    this.P = (int) jK;
                    this.O = 1;
                    return;
                }
            } else if (jK <= 2147483647L) {
                this.P = (int) jK;
                this.O = 1;
                return;
            }
        }
        this.Q = jK;
        this.O = 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean i0() {
        if (this.f13193l != JsonToken.VALUE_NUMBER_FLOAT || (this.O & 8) == 0) {
            return false;
        }
        double d = this.R;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    public final void i1(int i) throws IOException {
        try {
            if (i == 16) {
                this.T = this.J.h();
                this.O = 16;
            } else {
                this.R = this.J.i();
                this.O = 8;
            }
        } catch (NumberFormatException e2) {
            N0("Malformed numeric value (" + B0(this.J.l()) + ")", e2);
        }
    }

    public final void j1(int i) throws IOException {
        String strL = this.J.l();
        try {
            int i2 = this.V;
            char[] cArrU = this.J.u();
            int iV = this.J.v();
            boolean z = this.U;
            if (z) {
                iV++;
            }
            if (mzc.b(cArrU, iV, i2, z)) {
                this.Q = Long.parseLong(strL);
                this.O = 2;
                return;
            }
            if (i == 1 || i == 2) {
                m1(i, strL);
            }
            if (i != 8 && i != 32) {
                this.S = new BigInteger(strL);
                this.O = 4;
                return;
            }
            this.R = mzc.i(strL);
            this.O = 8;
        } catch (NumberFormatException e2) {
            N0("Malformed numeric value (" + B0(strL) + ")", e2);
        }
    }

    public void k1() throws IOException {
        this.J.x();
        char[] cArr = this.K;
        if (cArr != null) {
            this.K = null;
            this.x.q(cArr);
        }
    }

    public void l1(int i, char c2) throws JsonParseException {
        rla rlaVarL = L();
        C0(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c2), rlaVarL.j(), rlaVarL.u(Y0())));
    }

    public void m1(int i, String str) throws IOException {
        if (i == 1) {
            Q0(str);
        } else {
            T0(str);
        }
    }

    public void n1(int i, String str) throws JsonParseException {
        if (!e0(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            C0("Illegal unquoted character (" + k8e.x0((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser o0(int i, int i2) {
        int i3 = this.i;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.i = i4;
            W0(i4, i5);
        }
        return this;
    }

    public String o1() throws IOException {
        return p1();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser p(JsonParser.Feature feature) {
        this.i |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this.H.q() == null) {
            this.H = this.H.v(v66.f(this));
        }
        return this;
    }

    public String p1() throws IOException {
        return e0(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public void q1() throws IOException {
        int i = this.O;
        if ((i & 8) != 0) {
            this.T = mzc.f(O());
        } else if ((i & 4) != 0) {
            this.T = new BigDecimal(this.S);
        } else if ((i & 2) != 0) {
            this.T = BigDecimal.valueOf(this.Q);
        } else if ((i & 1) != 0) {
            this.T = BigDecimal.valueOf(this.P);
        } else {
            L0();
        }
        this.O |= 16;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void r0(Object obj) {
        this.H.i(obj);
    }

    public void r1() throws IOException {
        int i = this.O;
        if ((i & 16) != 0) {
            this.S = this.T.toBigInteger();
        } else if ((i & 2) != 0) {
            this.S = BigInteger.valueOf(this.Q);
        } else if ((i & 1) != 0) {
            this.S = BigInteger.valueOf(this.P);
        } else if ((i & 8) != 0) {
            this.S = BigDecimal.valueOf(this.R).toBigInteger();
        } else {
            L0();
        }
        this.O |= 4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger s() throws IOException {
        int i = this.O;
        if ((i & 4) == 0) {
            if (i == 0) {
                h1(4);
            }
            if ((this.O & 4) == 0) {
                r1();
            }
        }
        return this.S;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser s0(int i) {
        int i2 = this.i ^ i;
        if (i2 != 0) {
            this.i = i;
            W0(i, i2);
        }
        return this;
    }

    public void s1() throws IOException {
        int i = this.O;
        if ((i & 16) != 0) {
            this.R = this.T.doubleValue();
        } else if ((i & 4) != 0) {
            this.R = this.S.doubleValue();
        } else if ((i & 2) != 0) {
            this.R = this.Q;
        } else if ((i & 1) != 0) {
            this.R = this.P;
        } else {
            L0();
        }
        this.O |= 8;
    }

    public void t1() throws IOException {
        int i = this.O;
        if ((i & 2) != 0) {
            long j2 = this.Q;
            int i2 = (int) j2;
            if (i2 != j2) {
                R0(O(), n());
            }
            this.P = i2;
        } else if ((i & 4) != 0) {
            if (k8e.p.compareTo(this.S) > 0 || k8e.q.compareTo(this.S) < 0) {
                P0();
            }
            this.P = this.S.intValue();
        } else if ((i & 8) != 0) {
            double d = this.R;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                P0();
            }
            this.P = (int) this.R;
        } else if ((i & 16) != 0) {
            if (k8e.v.compareTo(this.T) > 0 || k8e.w.compareTo(this.T) < 0) {
                P0();
            }
            this.P = this.T.intValue();
        } else {
            L0();
        }
        this.O |= 1;
    }

    public void u1() throws IOException {
        int i = this.O;
        if ((i & 1) != 0) {
            this.Q = this.P;
        } else if ((i & 4) != 0) {
            if (k8e.r.compareTo(this.S) > 0 || k8e.s.compareTo(this.S) < 0) {
                S0();
            }
            this.Q = this.S.longValue();
        } else if ((i & 8) != 0) {
            double d = this.R;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                S0();
            }
            this.Q = (long) this.R;
        } else if ((i & 16) != 0) {
            if (k8e.t.compareTo(this.T) > 0 || k8e.u.compareTo(this.T) < 0) {
                S0();
            }
            this.Q = this.T.longValue();
        } else {
            L0();
        }
        this.O |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public rla L() {
        return this.H;
    }

    public IllegalArgumentException x1(Base64Variant base64Variant, int i, int i2) throws IllegalArgumentException {
        return y1(base64Variant, i, i2, null);
    }

    @Override // com.oplus.aiunit.vision.k8e, com.fasterxml.jackson.core.JsonParser
    public String y() throws IOException {
        rla rlaVarE;
        JsonToken jsonToken = this.f13193l;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (rlaVarE = this.H.e()) != null) ? rlaVarE.b() : this.H.b();
    }

    @Override // com.oplus.aiunit.vision.k8e
    public void y0() throws JsonParseException {
        if (this.H.h()) {
            return;
        }
        H0(String.format(": expected close marker for %s (start marker at %s)", this.H.f() ? "Array" : "Object", this.H.u(Y0())), null);
    }

    public IllegalArgumentException y1(Base64Variant base64Variant, int i, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else if (base64Variant.usesPaddingChar(i)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    public final JsonToken z1(boolean z, int i, int i2, int i3) {
        return (i2 >= 1 || i3 >= 1) ? B1(z, i, i2, i3) : C1(z, i);
    }
}
