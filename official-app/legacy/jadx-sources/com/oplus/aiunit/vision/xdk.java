package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class xdk extends wdk {
    public final odk a;
    public final BeanProperty b;

    public xdk(odk odkVar, BeanProperty beanProperty) {
        this.a = odkVar;
        this.b = beanProperty;
    }

    @Override // com.oplus.aiunit.vision.wdk
    public String b() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.wdk
    public WritableTypeId g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        i(writableTypeId);
        return jsonGenerator.x0(writableTypeId);
    }

    @Override // com.oplus.aiunit.vision.wdk
    public WritableTypeId h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        return jsonGenerator.y0(writableTypeId);
    }

    public void i(WritableTypeId writableTypeId) {
        if (writableTypeId.f2242c == null) {
            Object obj = writableTypeId.a;
            Class<?> cls = writableTypeId.b;
            writableTypeId.f2242c = cls == null ? k(obj) : l(obj, cls);
        }
    }

    public void j(Object obj) {
    }

    public String k(Object obj) {
        String strA = this.a.a(obj);
        if (strA == null) {
            j(obj);
        }
        return strA;
    }

    public String l(Object obj, Class<?> cls) {
        String strE = this.a.e(obj, cls);
        if (strE == null) {
            j(obj);
        }
        return strE;
    }
}
