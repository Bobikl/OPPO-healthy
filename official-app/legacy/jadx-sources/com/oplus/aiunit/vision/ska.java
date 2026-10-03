package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ska extends u48 {
    public static final int[] y = a83.e();
    public static final eia<StreamWriteCapability> z = JsonGenerator.k;
    public final ht9 s;
    public int[] t;
    public int u;
    public CharacterEscapes v;
    public wtg w;
    public boolean x;

    public ska(ht9 ht9Var, int i, yad yadVar) {
        super(i, yadVar);
        this.t = y;
        this.w = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.s = ht9Var;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
            this.u = 127;
        }
        this.x = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    @Override // com.oplus.aiunit.vision.u48
    public void A0(int i, int i2) {
        super.A0(i, i2);
        this.x = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator B(int i) {
        if (i < 0) {
            i = 0;
        }
        this.u = i;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator D(wtg wtgVar) {
        this.w = wtgVar;
        return this;
    }

    public void D0(String str) throws IOException {
        a(String.format("Can not %s, expecting field name (context: %s)", str, this.p.j()));
    }

    public void E0(String str, int i) throws IOException {
        if (i == 0) {
            if (this.p.f()) {
                this.i.beforeArrayValues(this);
                return;
            } else {
                if (this.p.g()) {
                    this.i.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            this.i.writeArrayValueSeparator(this);
            return;
        }
        if (i == 2) {
            this.i.writeObjectFieldValueSeparator(this);
            return;
        }
        if (i == 3) {
            this.i.writeRootValueSeparator(this);
        } else if (i != 5) {
            g();
        } else {
            D0(str);
        }
    }

    @Override // com.oplus.aiunit.vision.u48, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator p(JsonGenerator.Feature feature) {
        super.p(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.x = true;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator y(CharacterEscapes characterEscapes) {
        this.v = characterEscapes;
        if (characterEscapes == null) {
            this.t = y;
        } else {
            this.t = characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }
}
