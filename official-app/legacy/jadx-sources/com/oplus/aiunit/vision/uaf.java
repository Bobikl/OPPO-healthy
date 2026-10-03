package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class uaf implements wla {
    public Object i;

    public uaf(String str) {
        this.i = str;
    }

    public void a(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.i;
        if (obj instanceof wtg) {
            jsonGenerator.j0((wtg) obj);
        } else {
            jsonGenerator.k0(String.valueOf(obj));
        }
    }

    public void b(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.i;
        if (obj instanceof wla) {
            jsonGenerator.writeObject(obj);
        } else {
            a(jsonGenerator);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        Object obj2 = this.i;
        Object obj3 = ((uaf) obj).i;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.i;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // com.oplus.aiunit.vision.wla
    public void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        Object obj = this.i;
        if (obj instanceof wla) {
            ((wla) obj).serialize(jsonGenerator, eugVar);
        } else {
            a(jsonGenerator);
        }
    }

    @Override // com.oplus.aiunit.vision.wla
    public void serializeWithType(JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        Object obj = this.i;
        if (obj instanceof wla) {
            ((wla) obj).serializeWithType(jsonGenerator, eugVar, wdkVar);
        } else if (obj instanceof wtg) {
            serialize(jsonGenerator, eugVar);
        }
    }

    public String toString() {
        return String.format("[RawValue of type %s]", nc3.h(this.i));
    }
}
