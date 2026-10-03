package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"", "sportType", "Lcom/oplus/aiunit/vision/rii;", "b", "a", "sport_impl_release"}, k = 2, mv = {1, 8, 0})
public final class sii {
    @NotNull
    public static final rii a(int i) {
        if (oei.j(i)) {
            return rii.g.INSTANCE;
        }
        return i == 31 ? rii.c.INSTANCE : rii.d.INSTANCE;
    }

    @NotNull
    public static final rii b(int i) {
        if (i == -2) {
            return rii.a.INSTANCE;
        }
        if (oei.j(i)) {
            return rii.f.INSTANCE;
        }
        if (i == 31) {
            return rii.b.INSTANCE;
        }
        if (SetsKt__SetsKt.setOf((Object[]) new Integer[]{501, 502, 503, 504}).contains(Integer.valueOf(i))) {
            return rii.d.INSTANCE;
        }
        if (i == 905) {
            return rii.e.INSTANCE;
        }
        if (oei.i(i) || oei.h(i) || oei.m(i)) {
            return rii.e.INSTANCE;
        }
        return oei.l(i) ? rii.h.INSTANCE : rii.d.INSTANCE;
    }
}
