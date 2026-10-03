package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.kla;
import com.oplus.aiunit.vision.l1k;
import com.oplus.aiunit.vision.zla;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class a extends kla {
    public TokenFilter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2241n;
    public TokenFilter.Inclusion o;
    public JsonToken p;
    public JsonToken q;
    public l1k r;
    public l1k s;
    public TokenFilter t;
    public int u;

    public a(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z) {
        super(jsonParser);
        this.m = tokenFilter;
        this.t = tokenFilter;
        this.r = l1k.o(tokenFilter);
        this.o = inclusion;
        this.f2241n = z;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public final int A() {
        return o();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public BigDecimal B() throws IOException {
        return this.f13339l.B();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public double C() throws IOException {
        return this.f13339l.C();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public Object D() throws IOException {
        return this.f13339l.D();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public float E() throws IOException {
        return this.f13339l.E();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public int F() throws IOException {
        return this.f13339l.F();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public long G() throws IOException {
        return this.f13339l.G();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType H() throws IOException {
        return this.f13339l.H();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public Number I() throws IOException {
        return this.f13339l.I();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public zla L() {
        return v0();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public short N() throws IOException {
        return this.f13339l.N();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public String O() throws IOException {
        return this.p == JsonToken.FIELD_NAME ? m() : this.f13339l.O();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public char[] P() throws IOException {
        return this.p == JsonToken.FIELD_NAME ? m().toCharArray() : this.f13339l.P();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public int Q() throws IOException {
        return this.p == JsonToken.FIELD_NAME ? m().length() : this.f13339l.Q();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public int R() throws IOException {
        if (this.p == JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.f13339l.R();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public JsonLocation S() {
        return this.f13339l.S();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public int U() throws IOException {
        return this.f13339l.U();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public int V(int i) throws IOException {
        return this.f13339l.V(i);
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public long W() throws IOException {
        return this.f13339l.W();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public long X(long j2) throws IOException {
        return this.f13339l.X(j2);
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public String Y() throws IOException {
        return this.p == JsonToken.FIELD_NAME ? m() : this.f13339l.Y();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public String Z(String str) throws IOException {
        return this.p == JsonToken.FIELD_NAME ? m() : this.f13339l.Z(str);
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public boolean a0() {
        return this.p != null;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public boolean b0() {
        if (this.p == JsonToken.FIELD_NAME) {
            return false;
        }
        return this.f13339l.b0();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public final boolean c0(JsonToken jsonToken) {
        return this.p == jsonToken;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public boolean d0(int i) {
        JsonToken jsonToken = this.p;
        if (jsonToken == null) {
            return i == 0;
        }
        return jsonToken.id() == i;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public boolean g0() {
        return this.p == JsonToken.START_ARRAY;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public boolean h0() {
        return this.p == JsonToken.START_OBJECT;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public void l() {
        JsonToken jsonToken = this.p;
        if (jsonToken != null) {
            this.q = jsonToken;
            this.p = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x019e  */
    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken l0() throws IOException {
        TokenFilter tokenFilterL;
        JsonToken jsonTokenY0;
        boolean zS;
        TokenFilter tokenFilterQ;
        TokenFilter tokenFilterL2;
        JsonToken jsonTokenY1;
        TokenFilter tokenFilterF;
        JsonToken jsonTokenY2;
        TokenFilter tokenFilterL3;
        JsonToken jsonToken;
        if (!this.f2241n && (jsonToken = this.p) != null && this.s == null && jsonToken.isScalarValue() && !this.r.s() && this.o == TokenFilter.Inclusion.ONLY_INCLUDE_ALL && this.t == TokenFilter.INCLUDE_ALL) {
            this.p = null;
            return null;
        }
        l1k l1kVarP = this.s;
        if (l1kVarP != null) {
            while (true) {
                JsonToken jsonTokenT = l1kVarP.t();
                if (jsonTokenT != null) {
                    this.p = jsonTokenT;
                    return jsonTokenT;
                }
                l1k l1kVar = this.r;
                if (l1kVarP == l1kVar) {
                    this.s = null;
                    if (!l1kVarP.f()) {
                        JsonToken jsonTokenN = this.f13339l.n();
                        if (jsonTokenN == JsonToken.FIELD_NAME) {
                            break;
                        }
                        this.p = jsonTokenN;
                        return jsonTokenN;
                    }
                    JsonToken jsonTokenZ = this.f13339l.z();
                    this.p = jsonTokenZ;
                    return jsonTokenZ;
                }
                l1kVarP = l1kVar.p(l1kVarP);
                this.s = l1kVarP;
                if (l1kVarP == null) {
                    throw a("Unexpected problem: chain of filtered context broken");
                }
            }
        }
        JsonToken jsonTokenL0 = this.f13339l.l0();
        if (jsonTokenL0 == null) {
            this.p = jsonTokenL0;
            return jsonTokenL0;
        }
        int iId = jsonTokenL0.id();
        if (iId == 1) {
            TokenFilter tokenFilter = this.t;
            TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter == tokenFilter2) {
                this.r = this.r.n(tokenFilter, true);
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
            if (tokenFilter == null || (tokenFilterL = this.r.l(tokenFilter)) == null) {
                this.f13339l.u0();
            } else {
                if (tokenFilterL != tokenFilter2) {
                    tokenFilterL = tokenFilterL.d();
                }
                this.t = tokenFilterL;
                if (tokenFilterL == tokenFilter2) {
                    this.r = this.r.n(tokenFilterL, true);
                    this.p = jsonTokenL0;
                    return jsonTokenL0;
                }
                if (tokenFilterL != null && this.o == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.r = this.r.n(tokenFilterL, true);
                    this.p = jsonTokenL0;
                    return jsonTokenL0;
                }
                l1k l1kVarN = this.r.n(tokenFilterL, false);
                this.r = l1kVarN;
                if (this.o == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenY0 = y0(l1kVarN)) != null) {
                    this.p = jsonTokenY0;
                    return jsonTokenY0;
                }
            }
        } else if (iId == 2) {
            zS = this.r.s();
            tokenFilterQ = this.r.q();
            if (tokenFilterQ != null && tokenFilterQ != TokenFilter.INCLUDE_ALL) {
                tokenFilterQ.b();
            }
            l1k l1kVarE = this.r.e();
            this.r = l1kVarE;
            this.t = l1kVarE.q();
            if (zS) {
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
        } else if (iId == 3) {
            TokenFilter tokenFilter3 = this.t;
            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter3 == tokenFilter4) {
                this.r = this.r.m(tokenFilter3, true);
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
            if (tokenFilter3 == null || (tokenFilterL2 = this.r.l(tokenFilter3)) == null) {
                this.f13339l.u0();
            } else {
                if (tokenFilterL2 != tokenFilter4) {
                    tokenFilterL2 = tokenFilterL2.c();
                }
                this.t = tokenFilterL2;
                if (tokenFilterL2 == tokenFilter4) {
                    this.r = this.r.m(tokenFilterL2, true);
                    this.p = jsonTokenL0;
                    return jsonTokenL0;
                }
                if (tokenFilterL2 != null && this.o == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.r = this.r.m(tokenFilterL2, true);
                    this.p = jsonTokenL0;
                    return jsonTokenL0;
                }
                l1k l1kVarM = this.r.m(tokenFilterL2, false);
                this.r = l1kVarM;
                if (this.o == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenY1 = y0(l1kVarM)) != null) {
                    this.p = jsonTokenY1;
                    return jsonTokenY1;
                }
            }
        } else if (iId == 4) {
            zS = this.r.s();
            tokenFilterQ = this.r.q();
            if (tokenFilterQ != null) {
                tokenFilterQ.b();
            }
            l1k l1kVarE2 = this.r.e();
            this.r = l1kVarE2;
            this.t = l1kVarE2.q();
            if (zS) {
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
        } else if (iId != 5) {
            TokenFilter tokenFilter5 = this.t;
            TokenFilter tokenFilter6 = TokenFilter.INCLUDE_ALL;
            if (tokenFilter5 == tokenFilter6) {
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
            if (tokenFilter5 != null && (((tokenFilterL3 = this.r.l(tokenFilter5)) == tokenFilter6 || (tokenFilterL3 != null && tokenFilterL3.h(this.f13339l))) && z0())) {
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
        } else {
            String strY = this.f13339l.y();
            TokenFilter tokenFilterV = this.r.v(strY);
            TokenFilter tokenFilter7 = TokenFilter.INCLUDE_ALL;
            if (tokenFilterV == tokenFilter7) {
                this.t = tokenFilterV;
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
            if (tokenFilterV == null || (tokenFilterF = tokenFilterV.f(strY)) == null) {
                this.f13339l.l0();
                this.f13339l.u0();
            } else {
                this.t = tokenFilterF;
                if (tokenFilterF == tokenFilter7) {
                    if (!z0()) {
                        this.f13339l.l0();
                        this.f13339l.u0();
                    } else if (this.o == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                        this.p = jsonTokenL0;
                        return jsonTokenL0;
                    }
                }
                if (this.o != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenY2 = y0(this.r)) != null) {
                    this.p = jsonTokenY2;
                    return jsonTokenY2;
                }
            }
        }
        return x0();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public String m() throws IOException {
        zla zlaVarV0 = v0();
        JsonToken jsonToken = this.p;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return zlaVarV0.b();
        }
        zla zlaVarE = zlaVarV0.e();
        if (zlaVarE == null) {
            return null;
        }
        return zlaVarE.b();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public JsonToken m0() throws IOException {
        JsonToken jsonTokenL0 = l0();
        return jsonTokenL0 == JsonToken.FIELD_NAME ? l0() : jsonTokenL0;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public JsonToken n() {
        return this.p;
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public final int o() {
        JsonToken jsonToken = this.p;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public int p0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.f13339l.p0(base64Variant, outputStream);
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public BigInteger s() throws IOException {
        return this.f13339l.s();
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public byte[] u(Base64Variant base64Variant) throws IOException {
        return this.f13339l.u(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser u0() throws IOException {
        JsonToken jsonToken = this.p;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken jsonTokenL0 = l0();
            if (jsonTokenL0 == null) {
                return this;
            }
            if (jsonTokenL0.isStructStart()) {
                i++;
            } else if (jsonTokenL0.isStructEnd() && (i = i - 1) == 0) {
                return this;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public byte v() throws IOException {
        return this.f13339l.v();
    }

    public zla v0() {
        l1k l1kVar = this.s;
        return l1kVar != null ? l1kVar : this.r;
    }

    public final JsonToken w0(l1k l1kVar) throws IOException {
        this.s = l1kVar;
        JsonToken jsonTokenT = l1kVar.t();
        if (jsonTokenT != null) {
            return jsonTokenT;
        }
        while (l1kVar != this.r) {
            l1kVar = this.s.p(l1kVar);
            this.s = l1kVar;
            if (l1kVar == null) {
                throw a("Unexpected problem: chain of filtered context broken");
            }
            JsonToken jsonTokenT2 = l1kVar.t();
            if (jsonTokenT2 != null) {
                return jsonTokenT2;
            }
        }
        throw a("Internal error: failed to locate expected buffered tokens");
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public JsonLocation x() {
        return this.f13339l.x();
    }

    public final JsonToken x0() throws IOException {
        TokenFilter tokenFilterL;
        JsonToken jsonTokenY0;
        JsonToken jsonTokenY1;
        JsonToken jsonTokenY2;
        while (true) {
            JsonToken jsonTokenL0 = this.f13339l.l0();
            if (jsonTokenL0 == null) {
                this.p = jsonTokenL0;
                return jsonTokenL0;
            }
            int iId = jsonTokenL0.id();
            if (iId != 1) {
                if (iId != 2) {
                    if (iId == 3) {
                        TokenFilter tokenFilter = this.t;
                        TokenFilter tokenFilter2 = TokenFilter.INCLUDE_ALL;
                        if (tokenFilter == tokenFilter2) {
                            this.r = this.r.m(tokenFilter, true);
                            this.p = jsonTokenL0;
                            return jsonTokenL0;
                        }
                        if (tokenFilter == null) {
                            this.f13339l.u0();
                        } else {
                            TokenFilter tokenFilterL2 = this.r.l(tokenFilter);
                            if (tokenFilterL2 == null) {
                                this.f13339l.u0();
                            } else {
                                if (tokenFilterL2 != tokenFilter2) {
                                    tokenFilterL2 = tokenFilterL2.c();
                                }
                                this.t = tokenFilterL2;
                                if (tokenFilterL2 == tokenFilter2) {
                                    this.r = this.r.m(tokenFilterL2, true);
                                    this.p = jsonTokenL0;
                                    return jsonTokenL0;
                                }
                                if (tokenFilterL2 != null && this.o == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                    this.r = this.r.m(tokenFilterL2, true);
                                    this.p = jsonTokenL0;
                                    return jsonTokenL0;
                                }
                                l1k l1kVarM = this.r.m(tokenFilterL2, false);
                                this.r = l1kVarM;
                                if (this.o == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenY1 = y0(l1kVarM)) != null) {
                                    this.p = jsonTokenY1;
                                    return jsonTokenY1;
                                }
                            }
                        }
                    } else if (iId != 4) {
                        if (iId != 5) {
                            TokenFilter tokenFilter3 = this.t;
                            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilter3 == tokenFilter4) {
                                this.p = jsonTokenL0;
                                return jsonTokenL0;
                            }
                            if (tokenFilter3 != null && ((tokenFilterL = this.r.l(tokenFilter3)) == tokenFilter4 || (tokenFilterL != null && tokenFilterL.h(this.f13339l)))) {
                                if (z0()) {
                                    this.p = jsonTokenL0;
                                    return jsonTokenL0;
                                }
                            }
                        } else {
                            String strY = this.f13339l.y();
                            TokenFilter tokenFilterV = this.r.v(strY);
                            TokenFilter tokenFilter5 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilterV == tokenFilter5) {
                                this.t = tokenFilterV;
                                this.p = jsonTokenL0;
                                return jsonTokenL0;
                            }
                            if (tokenFilterV == null) {
                                this.f13339l.l0();
                                this.f13339l.u0();
                            } else {
                                TokenFilter tokenFilterF = tokenFilterV.f(strY);
                                if (tokenFilterF == null) {
                                    this.f13339l.l0();
                                    this.f13339l.u0();
                                } else {
                                    this.t = tokenFilterF;
                                    if (tokenFilterF == tokenFilter5) {
                                        if (!z0()) {
                                            this.f13339l.l0();
                                            this.f13339l.u0();
                                        } else if (this.o == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                            this.p = jsonTokenL0;
                                            return jsonTokenL0;
                                        }
                                    } else if (this.o != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenY0 = y0(this.r)) != null) {
                                        this.p = jsonTokenY0;
                                        return jsonTokenY0;
                                    }
                                }
                            }
                        }
                    }
                }
                boolean zS = this.r.s();
                TokenFilter tokenFilterQ = this.r.q();
                if (tokenFilterQ != null && tokenFilterQ != TokenFilter.INCLUDE_ALL) {
                    tokenFilterQ.b();
                }
                l1k l1kVarE = this.r.e();
                this.r = l1kVarE;
                this.t = l1kVarE.q();
                if (zS) {
                    this.p = jsonTokenL0;
                    return jsonTokenL0;
                }
            } else {
                TokenFilter tokenFilter6 = this.t;
                TokenFilter tokenFilter7 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter6 == tokenFilter7) {
                    this.r = this.r.n(tokenFilter6, true);
                    this.p = jsonTokenL0;
                    return jsonTokenL0;
                }
                if (tokenFilter6 == null) {
                    this.f13339l.u0();
                } else {
                    TokenFilter tokenFilterL3 = this.r.l(tokenFilter6);
                    if (tokenFilterL3 == null) {
                        this.f13339l.u0();
                    } else {
                        if (tokenFilterL3 != tokenFilter7) {
                            tokenFilterL3 = tokenFilterL3.d();
                        }
                        this.t = tokenFilterL3;
                        if (tokenFilterL3 == tokenFilter7) {
                            this.r = this.r.n(tokenFilterL3, true);
                            this.p = jsonTokenL0;
                            return jsonTokenL0;
                        }
                        if (tokenFilterL3 != null && this.o == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.r = this.r.n(tokenFilterL3, true);
                            this.p = jsonTokenL0;
                            return jsonTokenL0;
                        }
                        l1k l1kVarN = this.r.n(tokenFilterL3, false);
                        this.r = l1kVarN;
                        if (this.o == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenY2 = y0(l1kVarN)) != null) {
                            this.p = jsonTokenY2;
                            return jsonTokenY2;
                        }
                    }
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public String y() throws IOException {
        zla zlaVarV0 = v0();
        JsonToken jsonToken = this.p;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return zlaVarV0.b();
        }
        zla zlaVarE = zlaVarV0.e();
        if (zlaVarE == null) {
            return null;
        }
        return zlaVarE.b();
    }

    public final JsonToken y0(l1k l1kVar) throws IOException {
        TokenFilter tokenFilterL;
        while (true) {
            JsonToken jsonTokenL0 = this.f13339l.l0();
            if (jsonTokenL0 == null) {
                return jsonTokenL0;
            }
            int iId = jsonTokenL0.id();
            boolean z = false;
            if (iId != 1) {
                if (iId != 2) {
                    if (iId == 3) {
                        TokenFilter tokenFilterL2 = this.r.l(this.t);
                        if (tokenFilterL2 == null) {
                            this.f13339l.u0();
                        } else {
                            TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
                            if (tokenFilterL2 != tokenFilter) {
                                tokenFilterL2 = tokenFilterL2.c();
                            }
                            this.t = tokenFilterL2;
                            if (tokenFilterL2 == tokenFilter) {
                                this.r = this.r.m(tokenFilterL2, true);
                                return w0(l1kVar);
                            }
                            if (tokenFilterL2 != null && this.o == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                                this.r = this.r.m(tokenFilterL2, true);
                                return w0(l1kVar);
                            }
                            this.r = this.r.m(tokenFilterL2, false);
                        }
                    } else if (iId != 4) {
                        if (iId != 5) {
                            TokenFilter tokenFilter2 = this.t;
                            TokenFilter tokenFilter3 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilter2 == tokenFilter3) {
                                return w0(l1kVar);
                            }
                            if (tokenFilter2 != null && ((tokenFilterL = this.r.l(tokenFilter2)) == tokenFilter3 || (tokenFilterL != null && tokenFilterL.h(this.f13339l)))) {
                                if (z0()) {
                                    return w0(l1kVar);
                                }
                            }
                        } else {
                            String strY = this.f13339l.y();
                            TokenFilter tokenFilterV = this.r.v(strY);
                            TokenFilter tokenFilter4 = TokenFilter.INCLUDE_ALL;
                            if (tokenFilterV == tokenFilter4) {
                                this.t = tokenFilterV;
                                return w0(l1kVar);
                            }
                            if (tokenFilterV == null) {
                                this.f13339l.l0();
                                this.f13339l.u0();
                            } else {
                                TokenFilter tokenFilterF = tokenFilterV.f(strY);
                                if (tokenFilterF == null) {
                                    this.f13339l.l0();
                                    this.f13339l.u0();
                                } else {
                                    this.t = tokenFilterF;
                                    if (tokenFilterF != tokenFilter4) {
                                        continue;
                                    } else {
                                        if (z0()) {
                                            return w0(l1kVar);
                                        }
                                        this.t = this.r.v(strY);
                                    }
                                }
                            }
                        }
                    }
                }
                TokenFilter tokenFilterQ = this.r.q();
                if (tokenFilterQ != null && tokenFilterQ != TokenFilter.INCLUDE_ALL) {
                    tokenFilterQ.b();
                }
                l1k l1kVar2 = this.r;
                if ((l1kVar2 == l1kVar) && l1kVar2.s()) {
                    z = true;
                }
                l1k l1kVarE = this.r.e();
                this.r = l1kVarE;
                this.t = l1kVarE.q();
                if (z) {
                    return jsonTokenL0;
                }
            } else {
                TokenFilter tokenFilter5 = this.t;
                TokenFilter tokenFilter6 = TokenFilter.INCLUDE_ALL;
                if (tokenFilter5 == tokenFilter6) {
                    this.r = this.r.n(tokenFilter5, true);
                    return jsonTokenL0;
                }
                if (tokenFilter5 == null) {
                    this.f13339l.u0();
                } else {
                    TokenFilter tokenFilterL3 = this.r.l(tokenFilter5);
                    if (tokenFilterL3 == null) {
                        this.f13339l.u0();
                    } else {
                        if (tokenFilterL3 != tokenFilter6) {
                            tokenFilterL3 = tokenFilterL3.d();
                        }
                        this.t = tokenFilterL3;
                        if (tokenFilterL3 == tokenFilter6) {
                            this.r = this.r.n(tokenFilterL3, true);
                            return w0(l1kVar);
                        }
                        if (tokenFilterL3 != null && this.o == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.r = this.r.m(tokenFilterL3, true);
                            return w0(l1kVar);
                        }
                        this.r = this.r.n(tokenFilterL3, false);
                    }
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser
    public JsonToken z() {
        return this.p;
    }

    public final boolean z0() throws IOException {
        int i = this.u;
        if (i != 0 && !this.f2241n) {
            return false;
        }
        this.u = i + 1;
        return true;
    }
}
