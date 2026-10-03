package com.oplus.aiunit.vision;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class o4h {
    public List<n4h> a;
    public List<yy9> b;

    public List<yy9> a() {
        return this.b;
    }

    public List<n4h> b() {
        return this.a;
    }

    public void c(List<yy9> list) {
        this.b = list;
    }

    public void d(List<n4h> list) {
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o4h o4hVar = (o4h) obj;
        return Objects.equals(this.a, o4hVar.a) && Objects.equals(this.b, o4hVar.b);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
