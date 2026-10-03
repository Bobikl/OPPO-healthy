package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.oplus.aiunit.vision.eia;
import com.oplus.aiunit.vision.fvk;
import com.oplus.aiunit.vision.gte;
import com.oplus.aiunit.vision.wtg;
import com.oplus.aiunit.vision.zla;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public abstract class JsonGenerator implements Closeable, Flushable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final eia<StreamWriteCapability> f2234j;
    public static final eia<StreamWriteCapability> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final eia<StreamWriteCapability> f2235l;
    public gte i;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

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

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            a = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        eia<StreamWriteCapability> eiaVarA = eia.a(StreamWriteCapability.values());
        f2234j = eiaVarA;
        k = eiaVarA.c(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        f2235l = eiaVarA.c(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    @Deprecated
    public abstract JsonGenerator A(int i);

    public abstract JsonGenerator B(int i);

    public JsonGenerator C(gte gteVar) {
        this.i = gteVar;
        return this;
    }

    public JsonGenerator D(wtg wtgVar) {
        throw new UnsupportedOperationException();
    }

    public void E(double[] dArr, int i, int i2) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        h(dArr.length, i, i2);
        o0(dArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            U(dArr[i]);
            i++;
        }
        O();
    }

    public void F(int[] iArr, int i, int i2) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        h(iArr.length, i, i2);
        o0(iArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            W(iArr[i]);
            i++;
        }
        O();
    }

    public void G(long[] jArr, int i, int i2) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        h(jArr.length, i, i2);
        o0(jArr, i2);
        int i3 = i2 + i;
        while (i < i3) {
            X(jArr[i]);
            i++;
        }
        O();
    }

    public abstract int H(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException;

    public int I(InputStream inputStream, int i) throws IOException {
        return H(com.fasterxml.jackson.core.a.a(), inputStream, i);
    }

    public abstract void J(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException;

    public void K(byte[] bArr) throws IOException {
        J(com.fasterxml.jackson.core.a.a(), bArr, 0, bArr.length);
    }

    public void L(byte[] bArr, int i, int i2) throws IOException {
        J(com.fasterxml.jackson.core.a.a(), bArr, i, i2);
    }

    public abstract void M(boolean z) throws IOException;

    public void N(Object obj) throws IOException {
        if (obj == null) {
            T();
        } else {
            if (obj instanceof byte[]) {
                K((byte[]) obj);
                return;
            }
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public abstract void O() throws IOException;

    public abstract void P() throws IOException;

    public void Q(long j2) throws IOException {
        S(Long.toString(j2));
    }

    public abstract void R(wtg wtgVar) throws IOException;

    public abstract void S(String str) throws IOException;

    public abstract void T() throws IOException;

    public abstract void U(double d) throws IOException;

    public abstract void V(float f) throws IOException;

    public abstract void W(int i) throws IOException;

    public abstract void X(long j2) throws IOException;

    public abstract void Y(String str) throws IOException;

    public abstract void Z(BigDecimal bigDecimal) throws IOException;

    public void a(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public abstract void a0(BigInteger bigInteger) throws IOException;

    public void b0(short s) throws IOException {
        W(s);
    }

    public void c0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public void d0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void e0(String str) throws IOException {
    }

    public abstract void f0(char c2) throws IOException;

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public final void g() {
        fvk.c();
    }

    public void g0(wtg wtgVar) throws IOException {
        h0(wtgVar.getValue());
    }

    public final void h(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public abstract void h0(String str) throws IOException;

    public void i(Object obj) throws IOException {
        if (obj == null) {
            T();
            return;
        }
        if (obj instanceof String) {
            t0((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                W(number.intValue());
                return;
            }
            if (number instanceof Long) {
                X(number.longValue());
                return;
            }
            if (number instanceof Double) {
                U(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                V(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                b0(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                b0(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                a0((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                Z((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                W(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                X(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            K((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            M(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            M(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    public abstract void i0(char[] cArr, int i, int i2) throws IOException;

    public void j0(wtg wtgVar) throws IOException {
        k0(wtgVar.getValue());
    }

    public abstract void k0(String str) throws IOException;

    public boolean l() {
        return true;
    }

    public abstract void l0() throws IOException;

    public boolean m() {
        return false;
    }

    @Deprecated
    public void m0(int i) throws IOException {
        l0();
    }

    public boolean n() {
        return false;
    }

    public void n0(Object obj) throws IOException {
        l0();
        z(obj);
    }

    public boolean o() {
        return false;
    }

    public void o0(Object obj, int i) throws IOException {
        m0(i);
        z(obj);
    }

    public abstract JsonGenerator p(Feature feature);

    public abstract void p0() throws IOException;

    public void q0(Object obj) throws IOException {
        p0();
        z(obj);
    }

    public void r0(Object obj, int i) throws IOException {
        p0();
        z(obj);
    }

    public abstract int s();

    public abstract void s0(wtg wtgVar) throws IOException;

    public abstract zla t();

    public abstract void t0(String str) throws IOException;

    public gte u() {
        return this.i;
    }

    public abstract void u0(char[] cArr, int i, int i2) throws IOException;

    public abstract boolean v(Feature feature);

    public void v0(String str, String str2) throws IOException {
        S(str);
        t0(str2);
    }

    public JsonGenerator w(int i, int i2) {
        return this;
    }

    public void w0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public abstract void writeObject(Object obj) throws IOException;

    public JsonGenerator x(int i, int i2) {
        return A((i & i2) | (s() & (~i2)));
    }

    public WritableTypeId x0(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.f2242c;
        JsonToken jsonToken = writableTypeId.f;
        if (o()) {
            writableTypeId.g = false;
            w0(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.g = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.f2243e;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.f2243e = inclusion;
            }
            int i = a.a[inclusion.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    q0(writableTypeId.a);
                    v0(writableTypeId.d, strValueOf);
                    return writableTypeId;
                }
                if (i != 4) {
                    l0();
                    t0(strValueOf);
                } else {
                    p0();
                    S(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            q0(writableTypeId.a);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            l0();
        }
        return writableTypeId;
    }

    public JsonGenerator y(CharacterEscapes characterEscapes) {
        return this;
    }

    public WritableTypeId y0(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.f;
        if (jsonToken == JsonToken.START_OBJECT) {
            P();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            O();
        }
        if (writableTypeId.g) {
            int i = a.a[writableTypeId.f2243e.ordinal()];
            if (i == 1) {
                Object obj = writableTypeId.f2242c;
                v0(writableTypeId.d, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i != 2 && i != 3) {
                if (i != 5) {
                    P();
                } else {
                    O();
                }
            }
        }
        return writableTypeId;
    }

    public void z(Object obj) {
        zla zlaVarT = t();
        if (zlaVarT != null) {
            zlaVarT.i(obj);
        }
    }
}
