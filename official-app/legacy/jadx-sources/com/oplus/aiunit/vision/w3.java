package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.utils.RsWfPacker;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class w3 {
    public qd4 a = d();
    public i11 b;

    public w3(i11 i11Var) {
        this.b = i11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str, ccd ccdVar) throws Throwable {
        List<ud4> listW = com.heytap.health.watchface.business.creation.db.a.a().w(this.a.c(), str);
        ltl.a("AbsDefaultResLoader", "[onLoad] creationRecords " + listW);
        if (listW == null || listW.size() == 0) {
            b(str);
        }
        ccdVar.onNext(Boolean.TRUE);
    }

    public void b(String str) {
        i11 i11VarJ = ntl.m().j(str);
        if (i11VarJ == null) {
            ltl.i("AbsDefaultResLoader", "[addDefaultStyle] currentDataManager = null");
            return;
        }
        List<k11> list = i11VarJ.f().a().c().get(this.a.b());
        if (list == null) {
            ltl.i("AbsDefaultResLoader", "defaultCreations = null");
            return;
        }
        String strA = this.a.a();
        for (int size = list.size() - 1; size >= 0; size--) {
            k11 k11Var = list.get(size);
            String strA2 = k11Var.a();
            String str2 = strA + "/resource/" + strA2;
            try {
                File file = new File(strA + "/zip");
                if (!file.exists()) {
                    file.mkdirs();
                }
                c(i11VarJ, str2, strA, strA2);
            } catch (Exception e2) {
                ltl.i("AbsDefaultResLoader", "zipFolder = exception " + e2.getMessage());
            }
            ud4 ud4Var = new ud4();
            ud4Var.a = str;
            ud4Var.f17424e = "";
            ud4Var.g = com.heytap.health.watchface.business.creation.db.a.a().k() - 1;
            ud4Var.h = this.a.c();
            ud4Var.d = strA + "/resource/" + strA2 + ".png";
            ud4Var.f17423c = "";
            ud4Var.b = strA2;
            ud4Var.i = e(k11Var, str2, size);
            com.heytap.health.watchface.business.creation.db.a.a().n(ud4Var);
        }
    }

    public final void c(i11 i11Var, String str, String str2, String str3) throws Exception {
        if (!i11Var.p()) {
            otd.i(str, str2 + "/zip/" + str3 + ".zip");
            return;
        }
        RsWfPacker.b().a(str, str2 + "/zip/" + str3 + ".bin");
    }

    @NonNull
    public abstract qd4 d();

    public String e(k11 k11Var, String str, int i) {
        return "";
    }

    public lbd<Boolean> g(final String str, List<BaseWatchFaceBean> list) {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.v3
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.f(str, ccdVar);
            }
        });
    }
}
