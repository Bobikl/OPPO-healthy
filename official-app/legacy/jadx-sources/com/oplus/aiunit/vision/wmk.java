package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class wmk {
    public lmk a;
    public lmk b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18322c = "UrlTree";

    public lmk a() {
        return this.b;
    }

    public void b() {
        List<lmk> listD;
        lmk lmkVar = this.b;
        if (lmkVar != null && (listD = lmkVar.d()) != null) {
            this.b = listD.get(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("next---:getUrl ");
        lmk lmkVar2 = this.b;
        sb.append(lmkVar2 == null ? " " : lmkVar2.f());
    }

    public void c() {
        lmk lmkVarC;
        lmk lmkVar = this.b;
        if (lmkVar != null && (lmkVarC = lmkVar.c()) != null) {
            lmkVarC.g(this.b);
            lmkVarC.a(this.b);
            this.b = lmkVarC;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pre---:getUrl ");
        lmk lmkVar2 = this.b;
        sb.append(lmkVar2 == null ? " " : lmkVar2.f());
    }

    public void d(lmk lmkVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("push: ");
        sb.append(lmkVar);
        if (lmkVar == null) {
            return;
        }
        if (this.a == null) {
            this.a = lmkVar;
            this.b = lmkVar;
            return;
        }
        List<lmk> listD = this.b.d();
        lmkVar.h(this.b);
        if (!listD.contains(lmkVar)) {
            this.b.a(lmkVar);
        }
        this.b = lmkVar;
    }
}
