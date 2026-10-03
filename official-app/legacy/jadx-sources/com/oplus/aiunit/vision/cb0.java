package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class cb0 implements g8a {
    public final g8a a;
    public final g8a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10015c;
    public final p90 d;

    public cb0(Context context, p90 p90Var) {
        this.f10015c = context;
        this.d = p90Var;
        this.a = new hh0(context);
        this.b = new com.heytap.health.appInitializer.store.a(context);
    }

    @Nullable
    public static boolean b(a8a a8aVar, p90 p90Var) {
        return (!a8aVar.isDebugType() || p90Var.d()) && (a8aVar.getProcess() & p90Var.b()) == p90Var.b();
    }

    @Override // com.oplus.aiunit.vision.g8a
    @NonNull
    public List<a8a> a() {
        return c(this.a.a(), this.b.a());
    }

    public final List<a8a> c(List<a8a> list, List<a8a> list2) {
        ArrayList arrayList = new ArrayList();
        for (a8a a8aVar : list) {
            if (b(a8aVar, this.d)) {
                arrayList.add(a8aVar);
            }
        }
        for (a8a a8aVar2 : list2) {
            if (b(a8aVar2, this.d)) {
                arrayList.add(a8aVar2);
            }
        }
        return arrayList;
    }
}
