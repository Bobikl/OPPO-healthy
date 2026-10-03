package com.badlogic.gdx.utils;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.t0j;
import io.netty.util.internal.StringUtil;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class JsonValue implements Iterable<JsonValue> {
    public ValueType i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1282j;
    public double k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1283l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JsonValue f1284n;
    public JsonValue o;
    public JsonValue p;
    public JsonValue q;
    public int r;

    public enum ValueType {
        object,
        array,
        stringValue,
        doubleValue,
        longValue,
        booleanValue,
        nullValue
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ValueType.values().length];
            a = iArr;
            try {
                iArr[ValueType.stringValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ValueType.doubleValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ValueType.longValue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ValueType.booleanValue.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ValueType.nullValue.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class b implements Iterator<JsonValue>, Iterable<JsonValue> {
        public JsonValue i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public JsonValue f1285j;

        public b() {
            this.i = JsonValue.this.f1284n;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public JsonValue next() {
            JsonValue jsonValue = this.i;
            this.f1285j = jsonValue;
            if (jsonValue == null) {
                throw new NoSuchElementException();
            }
            this.i = jsonValue.p;
            return jsonValue;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.i != null;
        }

        @Override // java.lang.Iterable
        public Iterator<JsonValue> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            JsonValue jsonValue = this.f1285j;
            JsonValue jsonValue2 = jsonValue.q;
            if (jsonValue2 == null) {
                JsonValue jsonValue3 = JsonValue.this;
                JsonValue jsonValue4 = jsonValue.p;
                jsonValue3.f1284n = jsonValue4;
                if (jsonValue4 != null) {
                    jsonValue4.q = null;
                }
            } else {
                jsonValue2.p = jsonValue.p;
                JsonValue jsonValue5 = jsonValue.p;
                if (jsonValue5 != null) {
                    jsonValue5.q = jsonValue2;
                }
            }
            JsonValue.this.r--;
        }
    }

    public static class c {
        public JsonWriter$OutputType a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1286c;
    }

    public JsonValue(ValueType valueType) {
        this.i = valueType;
    }

    public static boolean A(JsonValue jsonValue) {
        for (JsonValue jsonValue2 = jsonValue.f1284n; jsonValue2 != null; jsonValue2 = jsonValue2.p) {
            if (!jsonValue2.z()) {
                return false;
            }
        }
        return true;
    }

    public static void s(int i, t0j t0jVar) {
        for (int i2 = 0; i2 < i; i2++) {
            t0jVar.append('\t');
        }
    }

    public static boolean w(JsonValue jsonValue) {
        for (JsonValue jsonValue2 = jsonValue.f1284n; jsonValue2 != null; jsonValue2 = jsonValue2.p) {
            if (jsonValue2.B() || jsonValue2.t()) {
                return false;
            }
        }
        return true;
    }

    public boolean B() {
        return this.i == ValueType.object;
    }

    public boolean C() {
        return this.i == ValueType.stringValue;
    }

    public boolean D() {
        int i = a.a[this.i.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b iterator() {
        return new b();
    }

    public String F(c cVar) {
        t0j t0jVar = new t0j(512);
        H(this, t0jVar, 0, cVar);
        return t0jVar.toString();
    }

    public String G(JsonWriter$OutputType jsonWriter$OutputType, int i) {
        c cVar = new c();
        cVar.a = jsonWriter$OutputType;
        cVar.b = i;
        return F(cVar);
    }

    public final void H(JsonValue jsonValue, t0j t0jVar, int i, c cVar) {
        JsonWriter$OutputType jsonWriter$OutputType = cVar.a;
        if (jsonValue.B()) {
            if (jsonValue.f1284n == null) {
                t0jVar.n("{}");
                return;
            }
            boolean z = !w(jsonValue);
            int length = t0jVar.length();
            loop0: while (true) {
                t0jVar.n(z ? "{\n" : "{ ");
                JsonValue jsonValue2 = jsonValue.f1284n;
                while (true) {
                    if (jsonValue2 == null) {
                        break loop0;
                    }
                    if (z) {
                        s(i, t0jVar);
                    }
                    t0jVar.n(jsonWriter$OutputType.quoteName(jsonValue2.m));
                    t0jVar.n(": ");
                    H(jsonValue2, t0jVar, i + 1, cVar);
                    if ((!z || jsonWriter$OutputType != JsonWriter$OutputType.minimal) && jsonValue2.p != null) {
                        t0jVar.append(StringUtil.COMMA);
                    }
                    t0jVar.append(z ? '\n' : ' ');
                    if (z || t0jVar.length() - length <= cVar.b) {
                        jsonValue2 = jsonValue2.p;
                    }
                }
                t0jVar.D(length);
                z = true;
            }
            if (z) {
                s(i - 1, t0jVar);
            }
            t0jVar.append('}');
            return;
        }
        if (!jsonValue.t()) {
            if (jsonValue.C()) {
                t0jVar.n(jsonWriter$OutputType.quoteValue(jsonValue.j()));
                return;
            }
            if (jsonValue.v()) {
                double dC = jsonValue.c();
                double dG = jsonValue.g();
                if (dC == dG) {
                    dC = dG;
                }
                t0jVar.b(dC);
                return;
            }
            if (jsonValue.x()) {
                t0jVar.g(jsonValue.g());
                return;
            }
            if (jsonValue.u()) {
                t0jVar.o(jsonValue.a());
                return;
            } else {
                if (jsonValue.y()) {
                    t0jVar.n("null");
                    return;
                }
                throw new SerializationException("Unknown object type: " + jsonValue);
            }
        }
        if (jsonValue.f1284n == null) {
            t0jVar.n("[]");
            return;
        }
        boolean z2 = !w(jsonValue);
        boolean z3 = cVar.f1286c || !A(jsonValue);
        int length2 = t0jVar.length();
        loop2: while (true) {
            t0jVar.n(z2 ? "[\n" : "[ ");
            JsonValue jsonValue3 = jsonValue.f1284n;
            while (true) {
                if (jsonValue3 == null) {
                    break loop2;
                }
                if (z2) {
                    s(i, t0jVar);
                }
                H(jsonValue3, t0jVar, i + 1, cVar);
                if ((!z2 || jsonWriter$OutputType != JsonWriter$OutputType.minimal) && jsonValue3.p != null) {
                    t0jVar.append(StringUtil.COMMA);
                }
                t0jVar.append(z2 ? '\n' : ' ');
                if (!z3 || z2 || t0jVar.length() - length2 <= cVar.b) {
                    jsonValue3 = jsonValue3.p;
                }
            }
            t0jVar.D(length2);
            z2 = true;
        }
        if (z2) {
            s(i - 1, t0jVar);
        }
        t0jVar.append(']');
    }

    public JsonValue I(String str) {
        JsonValue jsonValueL = l(str);
        if (jsonValueL != null) {
            return jsonValueL;
        }
        throw new IllegalArgumentException("Child not found with name: " + str);
    }

    public void J(double d, String str) {
        this.k = d;
        this.f1283l = (long) d;
        this.f1282j = str;
        this.i = ValueType.doubleValue;
    }

    public void K(long j2, String str) {
        this.f1283l = j2;
        this.k = j2;
        this.f1282j = str;
        this.i = ValueType.longValue;
    }

    public void L(String str) {
        this.f1282j = str;
        this.i = str == null ? ValueType.nullValue : ValueType.stringValue;
    }

    public void M(boolean z) {
        this.f1283l = z ? 1L : 0L;
        this.i = ValueType.booleanValue;
    }

    public void N(String str) {
        this.m = str;
    }

    public String O() {
        JsonValue jsonValue = this.o;
        String str = "[]";
        if (jsonValue == null) {
            ValueType valueType = this.i;
            if (valueType == ValueType.array) {
                return "[]";
            }
            return valueType == ValueType.object ? "{}" : "";
        }
        if (jsonValue.i == ValueType.array) {
            JsonValue jsonValue2 = jsonValue.f1284n;
            int i = 0;
            while (jsonValue2 != null) {
                if (jsonValue2 == this) {
                    str = "[" + i + "]";
                    break;
                }
                jsonValue2 = jsonValue2.p;
                i++;
            }
        } else if (this.m.indexOf(46) != -1) {
            str = ".\"" + this.m.replace("\"", "\\\"") + "\"";
        } else {
            str = '.' + this.m;
        }
        return this.o.O() + str;
    }

    public boolean a() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return this.f1282j.equalsIgnoreCase(SpeechConstant.TRUE_STR);
        }
        if (i == 2) {
            return this.k != 0.0d;
        }
        if (i == 3) {
            return this.f1283l != 0;
        }
        if (i == 4) {
            return this.f1283l != 0;
        }
        throw new IllegalStateException("Value cannot be converted to boolean: " + this.i);
    }

    public byte b() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return Byte.parseByte(this.f1282j);
        }
        if (i == 2) {
            return (byte) this.k;
        }
        if (i == 3) {
            return (byte) this.f1283l;
        }
        if (i == 4) {
            return this.f1283l != 0 ? (byte) 1 : (byte) 0;
        }
        throw new IllegalStateException("Value cannot be converted to byte: " + this.i);
    }

    public double c() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return Double.parseDouble(this.f1282j);
        }
        if (i == 2) {
            return this.k;
        }
        if (i == 3) {
            return this.f1283l;
        }
        if (i == 4) {
            return this.f1283l != 0 ? 1.0d : 0.0d;
        }
        throw new IllegalStateException("Value cannot be converted to double: " + this.i);
    }

    public float d() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return Float.parseFloat(this.f1282j);
        }
        if (i == 2) {
            return (float) this.k;
        }
        if (i == 3) {
            return this.f1283l;
        }
        if (i == 4) {
            return this.f1283l != 0 ? 1.0f : 0.0f;
        }
        throw new IllegalStateException("Value cannot be converted to float: " + this.i);
    }

    public float[] e() {
        float f;
        if (this.i != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.i);
        }
        float[] fArr = new float[this.r];
        JsonValue jsonValue = this.f1284n;
        int i = 0;
        while (jsonValue != null) {
            int i2 = a.a[jsonValue.i.ordinal()];
            if (i2 == 1) {
                f = Float.parseFloat(jsonValue.f1282j);
            } else if (i2 == 2) {
                f = (float) jsonValue.k;
            } else if (i2 == 3) {
                f = jsonValue.f1283l;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("Value cannot be converted to float: " + jsonValue.i);
                }
                f = jsonValue.f1283l != 0 ? 1.0f : 0.0f;
            }
            fArr[i] = f;
            jsonValue = jsonValue.p;
            i++;
        }
        return fArr;
    }

    public int f() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return Integer.parseInt(this.f1282j);
        }
        if (i == 2) {
            return (int) this.k;
        }
        if (i == 3) {
            return (int) this.f1283l;
        }
        if (i == 4) {
            return this.f1283l != 0 ? 1 : 0;
        }
        throw new IllegalStateException("Value cannot be converted to int: " + this.i);
    }

    public long g() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return Long.parseLong(this.f1282j);
        }
        if (i == 2) {
            return (long) this.k;
        }
        if (i == 3) {
            return this.f1283l;
        }
        if (i == 4) {
            return this.f1283l != 0 ? 1L : 0L;
        }
        throw new IllegalStateException("Value cannot be converted to long: " + this.i);
    }

    public float getFloat(int i) {
        JsonValue jsonValueK = k(i);
        if (jsonValueK != null) {
            return jsonValueK.d();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.m);
    }

    public short h() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return Short.parseShort(this.f1282j);
        }
        if (i == 2) {
            return (short) this.k;
        }
        if (i == 3) {
            return (short) this.f1283l;
        }
        if (i == 4) {
            return this.f1283l != 0 ? (short) 1 : (short) 0;
        }
        throw new IllegalStateException("Value cannot be converted to short: " + this.i);
    }

    public short[] i() {
        short s;
        int i;
        if (this.i != ValueType.array) {
            throw new IllegalStateException("Value is not an array: " + this.i);
        }
        short[] sArr = new short[this.r];
        JsonValue jsonValue = this.f1284n;
        int i2 = 0;
        while (jsonValue != null) {
            int i3 = a.a[jsonValue.i.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i = (int) jsonValue.k;
                } else if (i3 == 3) {
                    i = (int) jsonValue.f1283l;
                } else {
                    if (i3 != 4) {
                        throw new IllegalStateException("Value cannot be converted to short: " + jsonValue.i);
                    }
                    s = jsonValue.f1283l != 0 ? (short) 1 : (short) 0;
                }
                s = (short) i;
            } else {
                s = Short.parseShort(jsonValue.f1282j);
            }
            sArr[i2] = s;
            jsonValue = jsonValue.p;
            i2++;
        }
        return sArr;
    }

    public String j() {
        int i = a.a[this.i.ordinal()];
        if (i == 1) {
            return this.f1282j;
        }
        if (i == 2) {
            String str = this.f1282j;
            return str != null ? str : Double.toString(this.k);
        }
        if (i == 3) {
            String str2 = this.f1282j;
            return str2 != null ? str2 : Long.toString(this.f1283l);
        }
        if (i == 4) {
            return this.f1283l != 0 ? SpeechConstant.TRUE_STR : SpeechConstant.FALSE_STR;
        }
        if (i == 5) {
            return null;
        }
        throw new IllegalStateException("Value cannot be converted to string: " + this.i);
    }

    public JsonValue k(int i) {
        JsonValue jsonValue = this.f1284n;
        while (jsonValue != null && i > 0) {
            i--;
            jsonValue = jsonValue.p;
        }
        return jsonValue;
    }

    public JsonValue l(String str) {
        JsonValue jsonValue = this.f1284n;
        while (jsonValue != null) {
            String str2 = jsonValue.m;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                break;
            }
            jsonValue = jsonValue.p;
        }
        return jsonValue;
    }

    public JsonValue m(String str) {
        JsonValue jsonValueL = l(str);
        if (jsonValueL == null) {
            return null;
        }
        return jsonValueL.f1284n;
    }

    public float n(String str, float f) {
        JsonValue jsonValueL = l(str);
        return (jsonValueL == null || !jsonValueL.D() || jsonValueL.y()) ? f : jsonValueL.d();
    }

    public String name() {
        return this.m;
    }

    public short o(int i) {
        JsonValue jsonValueK = k(i);
        if (jsonValueK != null) {
            return jsonValueK.h();
        }
        throw new IllegalArgumentException("Indexed value not found: " + this.m);
    }

    public String p(String str) {
        JsonValue jsonValueL = l(str);
        if (jsonValueL != null) {
            return jsonValueL.j();
        }
        throw new IllegalArgumentException("Named value not found: " + str);
    }

    public String q(String str, String str2) {
        JsonValue jsonValueL = l(str);
        return (jsonValueL == null || !jsonValueL.D() || jsonValueL.y()) ? str2 : jsonValueL.j();
    }

    public boolean r(String str) {
        return l(str) != null;
    }

    public boolean t() {
        return this.i == ValueType.array;
    }

    public String toString() {
        String str;
        if (D()) {
            if (this.m == null) {
                return j();
            }
            return this.m + ": " + j();
        }
        StringBuilder sb = new StringBuilder();
        if (this.m == null) {
            str = "";
        } else {
            str = this.m + ": ";
        }
        sb.append(str);
        sb.append(G(JsonWriter$OutputType.minimal, 0));
        return sb.toString();
    }

    public boolean u() {
        return this.i == ValueType.booleanValue;
    }

    public boolean v() {
        return this.i == ValueType.doubleValue;
    }

    public boolean x() {
        return this.i == ValueType.longValue;
    }

    public boolean y() {
        return this.i == ValueType.nullValue;
    }

    public boolean z() {
        ValueType valueType = this.i;
        return valueType == ValueType.doubleValue || valueType == ValueType.longValue;
    }

    public JsonValue(String str) {
        L(str);
    }

    public JsonValue(double d) {
        J(d, null);
    }

    public JsonValue(long j2) {
        K(j2, null);
    }

    public JsonValue(double d, String str) {
        J(d, str);
    }

    public JsonValue(long j2, String str) {
        K(j2, str);
    }

    public JsonValue(boolean z) {
        M(z);
    }
}
