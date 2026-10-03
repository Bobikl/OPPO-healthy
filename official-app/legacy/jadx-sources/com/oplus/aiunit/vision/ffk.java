package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class ffk {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11330c;

    public ffk(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f11330c = i3;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f11330c;
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
        ffk ffkVar = (ffk) obj;
        return this.a == ffkVar.a && this.b == ffkVar.b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.f11330c));
    }

    public String toString() {
        return "UIScreenSize{W-Dp=" + this.a + ", H-Dp=" + this.b + ", SW-Dp=" + this.f11330c + "}";
    }
}
