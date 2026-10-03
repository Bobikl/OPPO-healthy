package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class n4m {
    public final ObjectIdGenerator<?> a;
    public Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14340c = false;

    public n4m(ObjectIdGenerator<?> objectIdGenerator) {
        this.a = objectIdGenerator;
    }

    public Object a(Object obj) {
        if (this.b == null) {
            this.b = this.a.generateId(obj);
        }
        return this.b;
    }

    public void b(JsonGenerator jsonGenerator, eug eugVar, dbd dbdVar) throws IOException {
        this.f14340c = true;
        if (jsonGenerator.n()) {
            Object obj = this.b;
            jsonGenerator.c0(obj == null ? null : String.valueOf(obj));
            return;
        }
        wtg wtgVar = dbdVar.b;
        if (wtgVar != null) {
            jsonGenerator.R(wtgVar);
            dbdVar.d.serialize(this.b, jsonGenerator, eugVar);
        }
    }

    public boolean c(JsonGenerator jsonGenerator, eug eugVar, dbd dbdVar) throws IOException {
        if (this.b == null) {
            return false;
        }
        if (!this.f14340c && !dbdVar.f10480e) {
            return false;
        }
        if (jsonGenerator.n()) {
            jsonGenerator.d0(String.valueOf(this.b));
            return true;
        }
        dbdVar.d.serialize(this.b, jsonGenerator, eugVar);
        return true;
    }
}
