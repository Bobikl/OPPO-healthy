package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes13.dex */
public abstract class u48 extends JsonGenerator {
    public static final int SURR1_FIRST = 55296;
    public static final int SURR1_LAST = 56319;
    public static final int SURR2_FIRST = 56320;
    public static final int SURR2_LAST = 57343;
    public static final int r = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    public yad m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17289n;
    public boolean o;
    public pma p;
    public boolean q;

    public u48(int i, yad yadVar) {
        this.f17289n = i;
        this.m = yadVar;
        this.p = pma.q(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? v66.e(this) : null);
        this.o = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator A(int i) {
        int i2 = this.f17289n ^ i;
        this.f17289n = i;
        if (i2 != 0) {
            A0(i, i2);
        }
        return this;
    }

    public void A0(int i, int i2) {
        if ((r & i2) == 0) {
            return;
        }
        this.o = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.enabledIn(i2)) {
            if (feature.enabledIn(i)) {
                B(127);
            } else {
                B(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.enabledIn(i2)) {
            if (!feature2.enabledIn(i)) {
                this.p = this.p.v(null);
            } else if (this.p.r() == null) {
                this.p = this.p.v(v66.e(this));
            }
        }
    }

    public final int B0(int i, int i2) throws IOException {
        if (i2 < 56320 || i2 > 57343) {
            a(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return ((i - SURR1_FIRST) << 10) + 65536 + (i2 - 56320);
    }

    public abstract void C0(String str) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void j0(wtg wtgVar) throws IOException {
        C0("write raw value");
        g0(wtgVar);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void k0(String str) throws IOException {
        C0("write raw value");
        h0(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator p(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this.f17289n &= ~mask;
        if ((mask & r) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.o = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                B(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this.p = this.p.v(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int s() {
        return this.f17289n;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public zla t() {
        return this.p;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean v(JsonGenerator.Feature feature) {
        return (this.f17289n & feature.getMask()) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            T();
            return;
        }
        yad yadVar = this.m;
        if (yadVar != null) {
            yadVar.writeValue(this, obj);
        } else {
            i(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator x(int i, int i2) {
        int i3 = this.f17289n;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.f17289n = i4;
            A0(i4, i5);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void z(Object obj) {
        pma pmaVar = this.p;
        if (pmaVar != null) {
            pmaVar.i(obj);
        }
    }

    public String z0(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f17289n)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }
}
