package com.oplus.oms.split.full.splitinstall;

import android.content.Context;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.bim;
import com.oplus.aiunit.vision.dvk;
import com.oplus.aiunit.vision.eym;
import com.oplus.aiunit.vision.h7i;
import com.oplus.aiunit.vision.k6f;
import com.oplus.aiunit.vision.mpm;
import com.oplus.aiunit.vision.num;
import com.oplus.aiunit.vision.o7i;
import com.oplus.aiunit.vision.tlm;
import com.oplus.aiunit.vision.v5n;
import com.oplus.aiunit.vision.w7i;
import com.oplus.aiunit.vision.zrm;
import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final String a = "SplitVersionPolicy";

    public class a implements k6f {
        public final /* synthetic */ List a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ISplitUpdateManager f20030c;
        public final /* synthetic */ b d;

        public a(List list, Context context, ISplitUpdateManager iSplitUpdateManager, b bVar) {
            this.a = list;
            this.b = context;
            this.f20030c = iSplitUpdateManager;
            this.d = bVar;
        }

        @Override // com.oplus.aiunit.vision.k6f
        public void a(int i) {
            boolean z = i == 2;
            ArrayList arrayList = new ArrayList();
            for (h7i h7iVar : this.a) {
                v5n v5nVar = new v5n(h7iVar);
                int iB = c.b(h7iVar);
                v5nVar.i = iB != -1 ? 1 : -1;
                v5nVar.k = iB;
                v5nVar.f17726j = v5nVar.f17727l.s();
                v5n v5nVarC = eym.a(new num(this.b), new zrm(this.b), new tlm(this.b), new bim(this.f20030c, z), new mpm(this.b)).c(v5nVar);
                if (v5nVarC == null || v5nVarC.e() == -1) {
                    this.d.b(-100, arrayList);
                    return;
                }
                if (v5nVarC.e() != 0) {
                    w7i.e(c.a, "select split name = " + v5nVarC.j().q() + ", version code = " + v5nVarC.g() + ", isFrom = " + v5nVarC.e() + ", isNewApk = " + h7iVar.d(), new Object[0]);
                    arrayList.add(v5nVarC);
                    c.c(this.b, v5nVarC);
                }
            }
            this.d.b(0, arrayList);
        }
    }

    public interface b {
        void b(int i, List<v5n> list);
    }

    public static void a(Context context, List<h7i> list, ISplitUpdateManager iSplitUpdateManager, b bVar) {
        if (list != null && !list.isEmpty()) {
            dvk.a().c(context, iSplitUpdateManager, new a(list, context, iSplitUpdateManager, bVar));
        } else {
            w7i.i(a, "select split version list error", new Object[0]);
            bVar.b(-100, null);
        }
    }

    public static int b(h7i h7iVar) {
        if (!h7iVar.d() && h7iVar.w()) {
            return h7iVar.r();
        }
        return -1;
    }

    public static void c(Context context, v5n v5nVar) {
        if (a8i.o().d(v5nVar.j().q(), v5nVar.g(), false).exists()) {
            w7i.e(a, "removeInstalledSplit - split:%s, version:%d", v5nVar.j().q(), Integer.valueOf(v5nVar.g()));
            o7i.l(v5nVar.j(), v5nVar.g(), context);
        }
    }
}
