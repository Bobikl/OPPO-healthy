package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class f2n {
    public Context a;
    public v0n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11189c = true;
    public String d = "40C27E38DCAD404B5465362914090908";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q2n f11190e = new q2n("40C27E38DCAD404B5465362914090908");

    public final void a(Context context, boolean z, String str, String str2, String str3, String[] strArr) {
        try {
            v0n v0nVarD = new v0n.a(str, str2, str).c(strArr).a(str3).d();
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                this.a = applicationContext;
                this.b = v0nVarD;
                this.f11189c = z;
                this.f11190e.c(applicationContext, v0nVarD);
            }
        } catch (com.amap.api.col.p0003sl.ik unused) {
        }
    }

    public final void b(String str, String str2) {
        List<v0n> listB = this.f11190e.b(this.a);
        g2n g2nVar = g2n.a.a;
        g2n.b(this.a, str, str2, listB, this.f11189c, this.b);
    }
}
