package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n8a {
    public kgb a;
    public ltc b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14395c;
    public int d;

    public void a(j52 j52Var) {
        this.a.d(j52Var);
    }

    public j52 b() {
        return this.a.f();
    }

    public z85 c() {
        return this.a.m();
    }

    @Nullable
    public String d(@NonNull Pattern pattern) {
        this.a.setIndex(this.d);
        String strB = this.a.b(pattern);
        this.d = this.a.index();
        return strB;
    }

    @Nullable
    public abstract ltc e();

    @Nullable
    public ltc f(@NonNull kgb kgbVar) {
        this.a = kgbVar;
        this.b = kgbVar.i();
        this.f14395c = kgbVar.j();
        this.d = kgbVar.index();
        ltc ltcVarE = e();
        kgbVar.setIndex(this.d);
        return ltcVarE;
    }

    @Nullable
    public String g() {
        this.a.setIndex(this.d);
        String strH = this.a.h();
        this.d = this.a.index();
        return strH;
    }

    public int h() {
        this.a.setIndex(this.d);
        int iL = this.a.l();
        this.d = this.a.index();
        return iL;
    }

    @Nullable
    public String i() {
        this.a.setIndex(this.d);
        String strG = this.a.g();
        this.d = this.a.index();
        return strG;
    }

    public char j() {
        this.a.setIndex(this.d);
        return this.a.peek();
    }

    public void k(z85 z85Var) {
        this.a.setIndex(this.d);
        this.a.p(z85Var);
        this.d = this.a.index();
    }

    public void l() {
        this.a.n();
    }

    public abstract char m();

    public void n() {
        this.a.setIndex(this.d);
        this.a.c();
        this.d = this.a.index();
    }

    @NonNull
    public zrj o(@NonNull String str) {
        return this.a.k(str);
    }

    @NonNull
    public zrj p(@NonNull String str, int i, int i2) {
        return this.a.o(str, i, i2);
    }
}
