package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class e8i {
    public static void a(String str, f8i f8iVar) {
        d8i d8iVarA = g8i.a();
        if (d8iVarA != null) {
            d8iVarA.a(str, f8iVar);
            return;
        }
        w7i.i("SplitReporterHelper", str + " reporter null.", new Object[0]);
    }

    public static void b(String str, List<f8i> list) {
        d8i d8iVarA = g8i.a();
        if (d8iVarA != null) {
            d8iVarA.b(str, list);
            return;
        }
        w7i.i("SplitReporterHelper", str + " reporter null.", new Object[0]);
    }
}
