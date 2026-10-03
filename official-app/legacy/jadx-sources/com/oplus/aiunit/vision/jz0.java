package com.oplus.aiunit.vision;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class jz0<V, O> implements j50<V, O> {
    public final List<yoa<V>> a;

    public jz0(List<yoa<V>> list) {
        this.a = list;
    }

    @Override // com.oplus.aiunit.vision.j50
    public List<yoa<V>> b() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.j50
    public boolean isStatic() {
        if (this.a.isEmpty()) {
            return true;
        }
        return this.a.size() == 1 && this.a.get(0).i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
