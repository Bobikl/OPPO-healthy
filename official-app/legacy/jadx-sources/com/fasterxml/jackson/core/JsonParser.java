package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.RequestPayload;
import com.oplus.aiunit.vision.eia;
import com.oplus.aiunit.vision.fx7;
import com.oplus.aiunit.vision.yad;
import com.oplus.aiunit.vision.zla;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class JsonParser implements Closeable {
    public static final eia<StreamReadCapability> k = eia.a(StreamReadCapability.values());
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient RequestPayload f2236j;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (this._mask & i) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser() {
    }

    public JsonParser(int i) {
        this.i = i;
    }

    @Deprecated
    public abstract int A();

    public abstract BigDecimal B() throws IOException;

    public abstract double C() throws IOException;

    public Object D() throws IOException {
        return null;
    }

    public abstract float E() throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract NumberType H() throws IOException;

    public abstract Number I() throws IOException;

    public Number J() throws IOException {
        return I();
    }

    public Object K() throws IOException {
        return null;
    }

    public abstract zla L();

    public eia<StreamReadCapability> M() {
        return k;
    }

    public short N() throws IOException {
        int iF = F();
        if (iF < -32768 || iF > 32767) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", O()), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) iF;
    }

    public abstract String O() throws IOException;

    public abstract char[] P() throws IOException;

    public abstract int Q() throws IOException;

    public abstract int R() throws IOException;

    public abstract JsonLocation S();

    public Object T() throws IOException {
        return null;
    }

    public int U() throws IOException {
        return V(0);
    }

    public int V(int i) throws IOException {
        return i;
    }

    public long W() throws IOException {
        return X(0L);
    }

    public long X(long j2) throws IOException {
        return j2;
    }

    public String Y() throws IOException {
        return Z(null);
    }

    public abstract String Z(String str) throws IOException;

    public JsonParseException a(String str) {
        return new JsonParseException(this, str).withRequestPayload(this.f2236j);
    }

    public abstract boolean a0();

    public abstract boolean b0();

    public abstract boolean c0(JsonToken jsonToken);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract boolean d0(int i);

    public boolean e0(Feature feature) {
        return feature.enabledIn(this.i);
    }

    public boolean f0() {
        return n() == JsonToken.VALUE_NUMBER_INT;
    }

    public void g() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    public boolean g0() {
        return n() == JsonToken.START_ARRAY;
    }

    public boolean h() {
        return false;
    }

    public boolean h0() {
        return n() == JsonToken.START_OBJECT;
    }

    public boolean i() {
        return false;
    }

    public boolean i0() throws IOException {
        return false;
    }

    public String j0() throws IOException {
        if (l0() == JsonToken.FIELD_NAME) {
            return y();
        }
        return null;
    }

    public String k0() throws IOException {
        if (l0() == JsonToken.VALUE_STRING) {
            return O();
        }
        return null;
    }

    public abstract void l();

    public abstract JsonToken l0() throws IOException;

    public String m() throws IOException {
        return y();
    }

    public abstract JsonToken m0() throws IOException;

    public JsonToken n() {
        return z();
    }

    public JsonParser n0(int i, int i2) {
        return this;
    }

    public int o() {
        return A();
    }

    public JsonParser o0(int i, int i2) {
        return s0((i & i2) | (this.i & (~i2)));
    }

    public JsonParser p(Feature feature) {
        this.i = feature.getMask() | this.i;
        return this;
    }

    public int p0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        g();
        return 0;
    }

    public boolean q0() {
        return false;
    }

    public void r0(Object obj) {
        zla zlaVarL = L();
        if (zlaVarL != null) {
            zlaVarL.i(obj);
        }
    }

    public abstract BigInteger s() throws IOException;

    @Deprecated
    public JsonParser s0(int i) {
        this.i = i;
        return this;
    }

    public byte[] t() throws IOException {
        return u(a.a());
    }

    public void t0(fx7 fx7Var) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + fx7Var.a() + "'");
    }

    public abstract byte[] u(Base64Variant base64Variant) throws IOException;

    public abstract JsonParser u0() throws IOException;

    public byte v() throws IOException {
        int iF = F();
        if (iF < -128 || iF > 255) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", O()), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) iF;
    }

    public abstract yad w();

    public abstract JsonLocation x();

    public abstract String y() throws IOException;

    public abstract JsonToken z();
}
