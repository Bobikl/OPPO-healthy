package com.heytap.health.watchface.business.creation.db;

import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.nd4;
import com.oplus.aiunit.vision.ud4;
import com.oplus.aiunit.vision.z0j;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class a implements nd4 {
    public nd4 a;

    /* JADX INFO: renamed from: com.heytap.health.watchface.business.creation.db.a$a, reason: collision with other inner class name */
    public static class C0706a {
        public static final a a = new a();
    }

    public static a a() {
        return C0706a.a;
    }

    @Override // com.oplus.aiunit.vision.nd4
    public void delete(String str) {
        this.a.delete(z0j.a(str));
    }

    @Override // com.oplus.aiunit.vision.nd4
    public int i(List<ud4> list) {
        if (list == null || list.size() == 0) {
            ltl.i("CreationDaoImpl", "[delete] failed and records == null.");
            return -1;
        }
        for (ud4 ud4Var : list) {
            ud4Var.a = z0j.a(ud4Var.a);
        }
        return this.a.i(list);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public List<ud4> j() {
        return this.a.j();
    }

    @Override // com.oplus.aiunit.vision.nd4
    public int k() {
        return this.a.k();
    }

    @Override // com.oplus.aiunit.vision.nd4
    public ud4 l(int i, String str, String str2) {
        return this.a.l(i, z0j.a(str), str2);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public int m(ud4 ud4Var) {
        ud4Var.a = z0j.a(ud4Var.a);
        return this.a.m(ud4Var);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public void n(ud4 ud4Var) {
        ud4Var.a = z0j.a(ud4Var.a);
        this.a.n(ud4Var);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public int o(ud4 ud4Var) {
        ud4Var.a = z0j.a(ud4Var.a);
        return this.a.o(ud4Var);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public void p(int i, String str) {
        ltl.d("CreationDaoImpl", "delete type " + i);
        this.a.p(i, z0j.a(str));
    }

    @Override // com.oplus.aiunit.vision.nd4
    public List<ud4> q(int i, String str) {
        return this.a.q(i, z0j.a(str));
    }

    @Override // com.oplus.aiunit.vision.nd4
    public void r(ud4 ud4Var) {
        ud4Var.a = z0j.a(ud4Var.a);
        this.a.r(ud4Var);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public ud4 s(String str, String str2) {
        return this.a.s(z0j.a(str), str2);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public int t(int i, String str) {
        return this.a.t(i, z0j.a(str));
    }

    @Override // com.oplus.aiunit.vision.nd4
    public int u(String str) {
        return this.a.u(z0j.a(str));
    }

    @Override // com.oplus.aiunit.vision.nd4
    public ud4 v(int i, String str, String str2) {
        return this.a.v(i, z0j.a(str), str2);
    }

    @Override // com.oplus.aiunit.vision.nd4
    public List<ud4> w(int i, String str) {
        return this.a.w(i, z0j.a(str));
    }

    @Override // com.oplus.aiunit.vision.nd4
    public int x(int i, String str) {
        return this.a.x(i, z0j.a(str));
    }

    public a() {
        this.a = CreationDatabase.f().e();
    }

    @Override // com.oplus.aiunit.vision.nd4
    public void delete(String str, String str2) {
        ltl.d("CreationDaoImpl", "delete packageName " + str2);
        this.a.delete(z0j.a(str), str2);
    }
}
