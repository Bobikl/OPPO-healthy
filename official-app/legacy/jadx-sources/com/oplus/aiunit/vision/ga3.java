package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class ga3 implements un9 {

    public static class a {
        public static final ga3 a = new ga3();
    }

    public ga3() {
    }

    public static ga3 i() {
        return a.a;
    }

    @Override // com.oplus.aiunit.vision.un9
    public void a() {
        oa2.d("child_protocol_granted").k();
        oa2.d(k9g.CHILD_SSOID).k();
        v9g.x("health_child_sp_name").k();
    }

    @Override // com.oplus.aiunit.vision.un9
    public void b(boolean z) {
        v9g.w().W("child_mode", z);
    }

    @Override // com.oplus.aiunit.vision.un9
    public boolean c() {
        return v9g.x("health_child_sp_name").r("child_protocol_granted", false);
    }

    @Override // com.oplus.aiunit.vision.un9
    public String d() {
        boolean zN = v9g.x("health_child_sp_name").n(k9g.CHILD_SSOID);
        String strD = oa2.d(k9g.CHILD_SSOID).D(k9g.CHILD_SSOID);
        String strD2 = v9g.x("health_child_sp_name").D(k9g.CHILD_SSOID);
        StringBuilder sb = new StringBuilder();
        sb.append("Child sod has key is ");
        sb.append(zN);
        if (zN) {
            strD = strD2;
        } else {
            v9g.x("health_child_sp_name").U(k9g.CHILD_SSOID, strD);
        }
        oa2.d(k9g.CHILD_SSOID).k();
        return strD;
    }

    @Override // com.oplus.aiunit.vision.un9
    public boolean e(String str) {
        int iA = an.INSTANCE.a(str);
        a7b.f("ChildModeHelper", "checkChildMode accountType=" + iA);
        return iA == 2;
    }

    @Override // com.oplus.aiunit.vision.un9
    public void f(boolean z) {
        v9g.x("health_child_sp_name").W("child_protocol_granted", z);
    }

    @Override // com.oplus.aiunit.vision.un9
    public void g(String str) {
        v9g.x("health_child_sp_name").U(k9g.CHILD_SSOID, str);
    }

    @Override // com.oplus.aiunit.vision.un9
    public boolean h() {
        return v9g.w().r("child_mode", false);
    }
}
