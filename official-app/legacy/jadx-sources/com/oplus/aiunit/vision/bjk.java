package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonLocation;

/* JADX INFO: loaded from: classes13.dex */
public class bjk {
    public final Object a;
    public final JsonLocation b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f9780c;

    public bjk(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.a = obj;
        this.f9780c = cls;
        this.b = jsonLocation;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.a, nc3.X(this.f9780c), this.b);
    }
}
