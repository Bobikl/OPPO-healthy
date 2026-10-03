package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class lla extends kla {
    public final JsonParser[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13761n;
    public int o;
    public boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lla(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this.f13761n = z;
        if (z && this.f13339l.a0()) {
            z2 = true;
        }
        this.p = z2;
        this.m = jsonParserArr;
        this.o = 1;
    }

    public static lla w0(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof lla;
        if (!z2 && !(jsonParser2 instanceof lla)) {
            return new lla(z, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            ((lla) jsonParser).v0(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof lla) {
            ((lla) jsonParser2).v0(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new lla(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    @Override // com.oplus.aiunit.vision.kla, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            this.f13339l.close();
        } while (y0());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken l0() throws IOException {
        JsonParser jsonParser = this.f13339l;
        if (jsonParser == null) {
            return null;
        }
        if (this.p) {
            this.p = false;
            return jsonParser.n();
        }
        JsonToken jsonTokenL0 = jsonParser.l0();
        return jsonTokenL0 == null ? x0() : jsonTokenL0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser u0() throws IOException {
        if (this.f13339l.n() != JsonToken.START_OBJECT && this.f13339l.n() != JsonToken.START_ARRAY) {
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

    public void v0(List<JsonParser> list) {
        int length = this.m.length;
        for (int i = this.o - 1; i < length; i++) {
            JsonParser jsonParser = this.m[i];
            if (jsonParser instanceof lla) {
                ((lla) jsonParser).v0(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    public JsonToken x0() throws IOException {
        JsonToken jsonTokenL0;
        do {
            int i = this.o;
            JsonParser[] jsonParserArr = this.m;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this.o = i + 1;
            JsonParser jsonParser = jsonParserArr[i];
            this.f13339l = jsonParser;
            if (this.f13761n && jsonParser.a0()) {
                return this.f13339l.z();
            }
            jsonTokenL0 = this.f13339l.l0();
        } while (jsonTokenL0 == null);
        return jsonTokenL0;
    }

    public boolean y0() {
        int i = this.o;
        JsonParser[] jsonParserArr = this.m;
        if (i >= jsonParserArr.length) {
            return false;
        }
        this.o = i + 1;
        this.f13339l = jsonParserArr[i];
        return true;
    }
}
