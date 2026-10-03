package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class yy9 {
    public String a;
    public String b;

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yy9 yy9Var = (yy9) obj;
        return Objects.equals(this.a, yy9Var.a) && Objects.equals(this.b, yy9Var.b);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return "Band {wfUnique=" + this.a + ", previewUrl=" + this.b + "}";
    }
}
