package com.oplus.aiunit.vision;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class iz0<V, O> implements i50<V, O> {
    public final List<xoa<V>> a;

    public iz0(List<xoa<V>> list) {
        this.a = list;
    }

    @Override // com.oplus.aiunit.vision.i50
    public List<xoa<V>> b() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.i50
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
