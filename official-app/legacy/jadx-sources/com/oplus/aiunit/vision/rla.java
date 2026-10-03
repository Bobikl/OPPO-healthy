package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.ContentReference;

/* JADX INFO: loaded from: classes13.dex */
public final class rla extends zla {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rla f16246c;
    public v66 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rla f16247e;
    public String f;
    public Object g;
    public int h;
    public int i;

    public rla(rla rlaVar, v66 v66Var, int i, int i2, int i3) {
        this.f16246c = rlaVar;
        this.d = v66Var;
        this.a = i;
        this.h = i2;
        this.i = i3;
        this.b = -1;
    }

    public static rla o(v66 v66Var) {
        return new rla(null, v66Var, 0, 1, 0);
    }

    @Override // com.oplus.aiunit.vision.zla
    public String b() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.zla
    public Object c() {
        return this.g;
    }

    @Override // com.oplus.aiunit.vision.zla
    public void i(Object obj) {
        this.g = obj;
    }

    public final void k(v66 v66Var, String str) throws JsonProcessingException {
        if (v66Var.c(str)) {
            Object objB = v66Var.b();
            throw new JsonParseException(objB instanceof JsonParser ? (JsonParser) objB : null, "Duplicate field '" + str + "'");
        }
    }

    public rla l() {
        this.g = null;
        return this.f16246c;
    }

    public rla m(int i, int i2) {
        rla rlaVar = this.f16247e;
        if (rlaVar == null) {
            v66 v66Var = this.d;
            rlaVar = new rla(this, v66Var == null ? null : v66Var.a(), 1, i, i2);
            this.f16247e = rlaVar;
        } else {
            rlaVar.s(1, i, i2);
        }
        return rlaVar;
    }

    public rla n(int i, int i2) {
        rla rlaVar = this.f16247e;
        if (rlaVar != null) {
            rlaVar.s(2, i, i2);
            return rlaVar;
        }
        v66 v66Var = this.d;
        rla rlaVar2 = new rla(this, v66Var == null ? null : v66Var.a(), 2, i, i2);
        this.f16247e = rlaVar2;
        return rlaVar2;
    }

    public boolean p() {
        int i = this.b + 1;
        this.b = i;
        return this.a != 0 && i > 0;
    }

    public v66 q() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.zla
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public rla e() {
        return this.f16246c;
    }

    public void s(int i, int i2, int i3) {
        this.a = i;
        this.b = -1;
        this.h = i2;
        this.i = i3;
        this.f = null;
        this.g = null;
        v66 v66Var = this.d;
        if (v66Var != null) {
            v66Var.d();
        }
    }

    public void t(String str) throws JsonProcessingException {
        this.f = str;
        v66 v66Var = this.d;
        if (v66Var != null) {
            k(v66Var, str);
        }
    }

    public JsonLocation u(ContentReference contentReference) {
        return new JsonLocation(contentReference, -1L, this.h, this.i);
    }

    public rla v(v66 v66Var) {
        this.d = v66Var;
        return this;
    }
}
