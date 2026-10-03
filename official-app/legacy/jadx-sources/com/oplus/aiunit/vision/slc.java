package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class slc {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16641c;

    public slc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f16641c = i3;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f16641c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        slc slcVar = (slc) obj;
        return this.a == slcVar.a && this.b == slcVar.b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.f16641c));
    }

    public String toString() {
        return "UIScreenSize{W-Dp=" + this.a + ", H-Dp=" + this.b + ", SW-Dp=" + this.f16641c + "}";
    }
}
