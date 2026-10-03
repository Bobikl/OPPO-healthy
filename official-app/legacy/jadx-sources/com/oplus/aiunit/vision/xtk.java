package com.oplus.aiunit.vision;

import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class xtk {
    public nt4 a;
    public is4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c83 f18764c;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UUID f18765e;
    public final UUID f;

    public xtk(UUID uuid, UUID uuid2) {
        this.f18765e = uuid;
        this.f = uuid2;
    }

    public xtk a(c83 c83Var) {
        this.f18764c = c83Var;
        return this;
    }

    public xtk b(nt4 nt4Var) {
        this.a = nt4Var;
        return this;
    }

    public void c(byte[] bArr) {
        c83 c83Var = this.f18764c;
        if (c83Var == null) {
            return;
        }
        if (this.a == null) {
            c83Var.onCharacteristicChanged(bArr);
            return;
        }
        if (this.b == null) {
            this.b = new is4();
        }
        nt4 nt4Var = this.a;
        is4 is4Var = this.b;
        int i = this.d;
        this.d = i + 1;
        if (nt4Var.a(is4Var, bArr, i)) {
            c83Var.onCharacteristicChanged(this.b.a());
            this.b = null;
            this.d = 0;
        }
    }

    public boolean d(UUID uuid, UUID uuid2) {
        return uuid.equals(this.f18765e) && uuid2.equals(this.f);
    }

    public xtk e() {
        this.f18764c = null;
        this.a = null;
        this.b = null;
        return this;
    }
}
