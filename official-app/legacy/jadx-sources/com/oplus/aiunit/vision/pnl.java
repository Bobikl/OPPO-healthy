package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class pnl {
    public kv9 a;
    public lv9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wq9 f15415c;

    public static class b {
        public lv9 a;
        public kv9[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public wq9 f15416c;

        public static /* synthetic */ zq9 a(b bVar) {
            bVar.getClass();
            return null;
        }

        public pnl e() {
            pnl pnlVarD = pnl.d();
            pnlVarD.g(this);
            return pnlVarD;
        }

        public b f(@NonNull wq9 wq9Var) {
            this.f15416c = wq9Var;
            return this;
        }

        public b g(kv9[] kv9VarArr) {
            if (kv9VarArr != null && kv9VarArr.length > 0) {
                this.b = kv9VarArr;
            }
            return this;
        }

        public b h(lv9 lv9Var) {
            this.a = lv9Var;
            return this;
        }
    }

    public static final class c {
        public static final pnl a = new pnl();
    }

    public static pnl d() {
        return c.a;
    }

    @NonNull
    public wq9 b() {
        Objects.requireNonNull(this.f15415c, "http factory must be not null!");
        return this.f15415c;
    }

    @Nullable
    public zq9 c() {
        return null;
    }

    public kv9 e() {
        return this.a;
    }

    public lv9 f() {
        return this.b;
    }

    public final void g(b bVar) {
        b.a(bVar);
        i(null);
        h(bVar.f15416c);
        k(bVar.a);
        if (bVar.b != null) {
            for (kv9 kv9Var : bVar.b) {
                j(kv9Var);
            }
        }
    }

    public final void h(wq9 wq9Var) {
        if (wq9Var != null) {
            this.f15415c = wq9Var;
        }
    }

    public final void i(zq9 zq9Var) {
    }

    public final void j(kv9 kv9Var) {
        if (kv9Var != null) {
            this.a = kv9Var;
        }
    }

    public final void k(lv9 lv9Var) {
        if (lv9Var != null) {
            this.b = lv9Var;
        }
    }

    public pnl() {
        this.f15415c = new gmk();
    }
}
