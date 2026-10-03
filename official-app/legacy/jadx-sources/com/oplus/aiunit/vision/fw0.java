package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class fw0 {
    public int a;
    public int b;

    public fw0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static fw0 a(int i, int i2) {
        return new fw0(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fw0 fw0Var = (fw0) obj;
        return this.a == fw0Var.a && this.b == fw0Var.b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
