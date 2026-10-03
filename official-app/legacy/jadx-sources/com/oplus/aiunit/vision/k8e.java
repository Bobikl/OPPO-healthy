package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k8e extends JsonParser {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f13192n = new byte[0];
    public static final int[] o = new int[0];
    public static final BigInteger p;
    public static final BigInteger q;
    public static final BigInteger r;
    public static final BigInteger s;
    public static final BigDecimal t;
    public static final BigDecimal u;
    public static final BigDecimal v;
    public static final BigDecimal w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public JsonToken f13193l;
    public JsonToken m;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        p = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        q = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        r = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        s = bigIntegerValueOf4;
        t = new BigDecimal(bigIntegerValueOf3);
        u = new BigDecimal(bigIntegerValueOf4);
        v = new BigDecimal(bigIntegerValueOf);
        w = new BigDecimal(bigIntegerValueOf2);
    }

    public k8e(int i) {
        super(i);
    }

    public static final String x0(int i) {
        char c2 = (char) i;
        if (Character.isISOControl(c2)) {
            return "(CTRL-CHAR, code " + i + ")";
        }
        if (i <= 255) {
            return "'" + c2 + "' (code " + i + ")";
        }
        return "'" + c2 + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public int A() {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public String A0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public String B0(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final void C0(String str) throws JsonParseException {
        throw a(str);
    }

    public final void D0(String str, Object obj) throws JsonParseException {
        throw a(String.format(str, obj));
    }

    public final void E0(String str, Object obj, Object obj2) throws JsonParseException {
        throw a(String.format(str, obj, obj2));
    }

    public void F0(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    public void G0() throws JsonParseException {
        H0(" in " + this.f13193l, this.f13193l);
    }

    public void H0(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    public void I0(JsonToken jsonToken) throws JsonParseException {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        H0(str, jsonToken);
    }

    public void J0(int i) throws JsonParseException {
        K0(i, "Expected space separating root-level values");
    }

    public void K0(int i, String str) throws JsonParseException {
        if (i < 0) {
            G0();
        }
        String str2 = String.format("Unexpected character (%s)", x0(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        C0(str2);
    }

    public final void L0() {
        fvk.c();
    }

    public void M0(int i) throws JsonParseException {
        C0("Illegal character (" + x0((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public final void N0(String str, Throwable th) throws JsonParseException {
        throw v0(str, th);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String O() throws IOException;

    public void O0(String str) throws JsonParseException {
        C0("Invalid numeric value: " + str);
    }

    public void P0() throws IOException {
        Q0(O());
    }

    public void Q0(String str) throws IOException {
        R0(str, n());
    }

    public void R0(String str, JsonToken jsonToken) throws IOException {
        F0(String.format("Numeric value (%s) out of range of int (%d - %s)", A0(str), Integer.MIN_VALUE, Integer.MAX_VALUE), jsonToken, Integer.TYPE);
    }

    public void S0() throws IOException {
        T0(O());
    }

    public void T0(String str) throws IOException {
        U0(str, n());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int U() throws IOException {
        JsonToken jsonToken = this.f13193l;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? F() : V(0);
    }

    public void U0(String str, JsonToken jsonToken) throws IOException {
        F0(String.format("Numeric value (%s) out of range of long (%d - %s)", A0(str), Long.MIN_VALUE, Long.MAX_VALUE), jsonToken, Long.TYPE);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int V(int i) throws IOException {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return F();
        }
        if (jsonToken != null) {
            int iId = jsonToken.id();
            if (iId == 6) {
                String strO = O();
                if (z0(strO)) {
                    return 0;
                }
                return mzc.d(strO, i);
            }
            switch (iId) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object objD = D();
                    if (objD instanceof Number) {
                        return ((Number) objD).intValue();
                    }
                default:
                    return i;
            }
        }
        return i;
    }

    public void V0(int i, String str) throws JsonParseException {
        String str2 = String.format("Unexpected character (%s) in numeric value", x0(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        C0(str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long W() throws IOException {
        JsonToken jsonToken = this.f13193l;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? G() : X(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long X(long j2) throws IOException {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return G();
        }
        if (jsonToken != null) {
            int iId = jsonToken.id();
            if (iId == 6) {
                String strO = O();
                if (z0(strO)) {
                    return 0L;
                }
                return mzc.e(strO, j2);
            }
            switch (iId) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object objD = D();
                    if (objD instanceof Number) {
                        return ((Number) objD).longValue();
                    }
                default:
                    return j2;
            }
        }
        return j2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String Y() throws IOException {
        return Z(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String Z(String str) throws IOException {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return O();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return y();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : O();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean a0() {
        return this.f13193l != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean c0(JsonToken jsonToken) {
        return this.f13193l == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean d0(int i) {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken == null) {
            return i == 0;
        }
        return jsonToken.id() == i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean f0() {
        return this.f13193l == JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean g0() {
        return this.f13193l == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean h0() {
        return this.f13193l == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void l() {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken != null) {
            this.m = jsonToken;
            this.f13193l = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonToken l0() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken m0() throws IOException {
        JsonToken jsonTokenL0 = l0();
        return jsonTokenL0 == JsonToken.FIELD_NAME ? l0() : jsonTokenL0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken n() {
        return this.f13193l;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int o() {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser u0() throws IOException {
        JsonToken jsonToken = this.f13193l;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken jsonTokenL0 = l0();
            if (jsonTokenL0 == null) {
                y0();
                return this;
            }
            if (jsonTokenL0.isStructStart()) {
                i++;
            } else if (jsonTokenL0.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (jsonTokenL0 == JsonToken.NOT_AVAILABLE) {
                D0("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    public final JsonParseException v0(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    public void w0(String str, xc2 xc2Var, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, xc2Var);
        } catch (IllegalArgumentException e2) {
            C0(e2.getMessage());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String y() throws IOException;

    public abstract void y0() throws JsonParseException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken z() {
        return this.f13193l;
    }

    public boolean z0(String str) {
        return "null".equals(str);
    }
}
