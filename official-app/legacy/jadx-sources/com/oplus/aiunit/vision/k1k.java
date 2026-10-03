package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.ContentReference;

/* JADX INFO: loaded from: classes13.dex */
public class k1k extends zla {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zla f13124c;
    public final JsonLocation d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13125e;
    public Object f;

    public k1k(zla zlaVar, ContentReference contentReference) {
        super(zlaVar);
        this.f13124c = zlaVar.e();
        this.f13125e = zlaVar.b();
        this.f = zlaVar.c();
        if (zlaVar instanceof rla) {
            this.d = ((rla) zlaVar).u(contentReference);
        } else {
            this.d = JsonLocation.NA;
        }
    }

    public static k1k m(zla zlaVar) {
        return zlaVar == null ? new k1k() : new k1k(zlaVar, ContentReference.unknown());
    }

    @Override // com.oplus.aiunit.vision.zla
    public String b() {
        return this.f13125e;
    }

    @Override // com.oplus.aiunit.vision.zla
    public Object c() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.zla
    public zla e() {
        return this.f13124c;
    }

    @Override // com.oplus.aiunit.vision.zla
    public void i(Object obj) {
        this.f = obj;
    }

    public k1k k() {
        this.b++;
        return new k1k(this, 1, -1);
    }

    public k1k l() {
        this.b++;
        return new k1k(this, 2, -1);
    }

    public k1k n() {
        zla zlaVar = this.f13124c;
        if (zlaVar instanceof k1k) {
            return (k1k) zlaVar;
        }
        return zlaVar == null ? new k1k() : new k1k(zlaVar, this.d);
    }

    public void o(String str) throws JsonProcessingException {
        this.f13125e = str;
    }

    public void p() {
        this.b++;
    }

    public k1k(zla zlaVar, JsonLocation jsonLocation) {
        super(zlaVar);
        this.f13124c = zlaVar.e();
        this.f13125e = zlaVar.b();
        this.f = zlaVar.c();
        this.d = jsonLocation;
    }

    public k1k() {
        super(0, -1);
        this.f13124c = null;
        this.d = JsonLocation.NA;
    }

    public k1k(k1k k1kVar, int i, int i2) {
        super(i, i2);
        this.f13124c = k1kVar;
        this.d = k1kVar.d;
    }
}
