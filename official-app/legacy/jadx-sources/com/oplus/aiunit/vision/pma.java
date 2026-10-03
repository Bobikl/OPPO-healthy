package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes13.dex */
public class pma extends zla {
    public static final int STATUS_EXPECT_NAME = 5;
    public static final int STATUS_EXPECT_VALUE = 4;
    public static final int STATUS_OK_AFTER_COLON = 2;
    public static final int STATUS_OK_AFTER_COMMA = 1;
    public static final int STATUS_OK_AFTER_SPACE = 3;
    public static final int STATUS_OK_AS_IS = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pma f15408c;
    public v66 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public pma f15409e;
    public String f;
    public Object g;
    public boolean h;

    public pma(int i, pma pmaVar, v66 v66Var) {
        this.a = i;
        this.f15408c = pmaVar;
        this.d = v66Var;
        this.b = -1;
    }

    public static pma q(v66 v66Var) {
        return new pma(0, null, v66Var);
    }

    @Override // com.oplus.aiunit.vision.zla
    public final String b() {
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
            throw new JsonGenerationException("Duplicate field '" + str + "'", objB instanceof JsonGenerator ? (JsonGenerator) objB : null);
        }
    }

    public pma l() {
        this.g = null;
        return this.f15408c;
    }

    public pma m() {
        pma pmaVar = this.f15409e;
        if (pmaVar != null) {
            return pmaVar.t(1);
        }
        v66 v66Var = this.d;
        pma pmaVar2 = new pma(1, this, v66Var == null ? null : v66Var.a());
        this.f15409e = pmaVar2;
        return pmaVar2;
    }

    public pma n(Object obj) {
        pma pmaVar = this.f15409e;
        if (pmaVar != null) {
            return pmaVar.u(1, obj);
        }
        v66 v66Var = this.d;
        pma pmaVar2 = new pma(1, this, v66Var == null ? null : v66Var.a(), obj);
        this.f15409e = pmaVar2;
        return pmaVar2;
    }

    public pma o() {
        pma pmaVar = this.f15409e;
        if (pmaVar != null) {
            return pmaVar.t(2);
        }
        v66 v66Var = this.d;
        pma pmaVar2 = new pma(2, this, v66Var == null ? null : v66Var.a());
        this.f15409e = pmaVar2;
        return pmaVar2;
    }

    public pma p(Object obj) {
        pma pmaVar = this.f15409e;
        if (pmaVar != null) {
            return pmaVar.u(2, obj);
        }
        v66 v66Var = this.d;
        pma pmaVar2 = new pma(2, this, v66Var == null ? null : v66Var.a(), obj);
        this.f15409e = pmaVar2;
        return pmaVar2;
    }

    public v66 r() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.zla
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final pma e() {
        return this.f15408c;
    }

    public pma t(int i) {
        this.a = i;
        this.b = -1;
        this.f = null;
        this.h = false;
        this.g = null;
        v66 v66Var = this.d;
        if (v66Var != null) {
            v66Var.d();
        }
        return this;
    }

    public pma u(int i, Object obj) {
        this.a = i;
        this.b = -1;
        this.f = null;
        this.h = false;
        this.g = obj;
        v66 v66Var = this.d;
        if (v66Var != null) {
            v66Var.d();
        }
        return this;
    }

    public pma v(v66 v66Var) {
        this.d = v66Var;
        return this;
    }

    public int w(String str) throws JsonProcessingException {
        if (this.a != 2 || this.h) {
            return 4;
        }
        this.h = true;
        this.f = str;
        v66 v66Var = this.d;
        if (v66Var != null) {
            k(v66Var, str);
        }
        return this.b < 0 ? 0 : 1;
    }

    public int x() {
        int i = this.a;
        if (i == 2) {
            if (!this.h) {
                return 5;
            }
            this.h = false;
            this.b++;
            return 2;
        }
        if (i == 1) {
            int i2 = this.b;
            this.b = i2 + 1;
            return i2 < 0 ? 0 : 1;
        }
        int i3 = this.b + 1;
        this.b = i3;
        return i3 == 0 ? 0 : 3;
    }

    public pma(int i, pma pmaVar, v66 v66Var, Object obj) {
        this.a = i;
        this.f15408c = pmaVar;
        this.d = v66Var;
        this.b = -1;
        this.g = obj;
    }
}
