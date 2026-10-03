package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.base.track.NxTrackHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class xcg {
    public static volatile xcg b;
    public vcg a;

    public static class a extends wa2 {
        public String b;

        @Override // com.oplus.aiunit.vision.qea
        public void b(int i, int i2, boolean z) {
            super.b(i, i2, z);
            a7b.f("SauUpgradeHelper", "onCheckResultBack");
            StringBuilder sb = new StringBuilder();
            sb.append("result: ");
            sb.append(i);
            sb.append(",newUpdateVersion: ");
            sb.append(i2);
            sb.append(",popResult: ");
            sb.append(z);
            if (i == 1) {
                ikk.r(true);
                ekk.k(2, 0, null);
            } else {
                a7b.f("SauUpgradeHelper", "no sau upgrade , check self upgrade");
                ikk.r(false);
                tnc.b(this.b);
            }
        }

        @Override // com.oplus.aiunit.vision.qea
        public void c() {
            super.c();
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 2));
        }

        @Override // com.oplus.aiunit.vision.qea
        public void d() {
            super.d();
            a7b.f("SauUpgradeHelper", "auto check, onClickDownloadAndInstallPositiveButton");
            ikk.r(false);
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 1));
        }

        @Override // com.oplus.aiunit.vision.qea
        public void e() {
            super.e();
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 2));
        }

        @Override // com.oplus.aiunit.vision.qea
        public void f() {
            super.f();
            a7b.f("SauUpgradeHelper", "auto check, onClickOnlyInstallPositiveButton");
            ikk.r(false);
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 1));
        }

        public a(String str) {
            this.b = str;
        }
    }

    public static class b extends wa2 {
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18578c;

        @Override // com.oplus.aiunit.vision.qea
        public void b(int i, int i2, boolean z) {
            super.b(i, i2, z);
            a7b.f("SauUpgradeHelper", "onCheckResultBack");
            StringBuilder sb = new StringBuilder();
            sb.append("result: ");
            sb.append(i);
            sb.append(",newUpdateVersion: ");
            sb.append(i2);
            sb.append(",popResult: ");
            sb.append(z);
            if (i == 1) {
                com.heytap.health.base.track.a.G(1002, new HashMap());
                ikk.r(true);
                ekk.k(2, 1, null);
            } else {
                a7b.f("SauUpgradeHelper", "no sau upgrade , check self upgrade");
                ikk.r(false);
                tnc.c(this.b, this.f18578c);
            }
        }

        @Override // com.oplus.aiunit.vision.qea
        public void c() {
            super.c();
            a7b.f("SauUpgradeHelper", "onClickDownloadAndInstallNegativeButton");
            boolean zA = a();
            StringBuilder sb = new StringBuilder();
            sb.append("canUseOld :");
            sb.append(zA);
            if (!zA) {
                op.n().j();
            }
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 2));
        }

        @Override // com.oplus.aiunit.vision.qea
        public void d() {
            super.d();
            a7b.f("SauUpgradeHelper", "manual check, onClickDownloadAndInstallPositiveButton");
            ikk.r(false);
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 1));
            NxTrackHelper.W();
        }

        @Override // com.oplus.aiunit.vision.qea
        public void e() {
            super.e();
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 2));
        }

        @Override // com.oplus.aiunit.vision.qea
        public void f() {
            super.f();
            a7b.f("SauUpgradeHelper", "manual check, onClickOnlyInstallPositiveButton");
            ikk.r(false);
            com.heytap.health.base.track.a.G(1002, com.heytap.health.base.track.a.h("op_type", 1));
            NxTrackHelper.W();
        }

        public b(String str, int i) {
            this.b = str;
            this.f18578c = i;
        }
    }

    public static xcg d() {
        if (b == null) {
            synchronized (xcg.class) {
                if (b == null) {
                    b = new xcg();
                }
            }
        }
        return b;
    }

    public void a(Context context, String str) {
        a7b.f("SauUpgradeHelper", "auto check begin");
        this.a = new vcg.b(context).s(context.getPackageName()).r(new a(str)).t(true).u(1).q();
        a7b.f("SauUpgradeHelper", "auto check upgrade");
        this.a.S();
    }

    public boolean b() {
        return ikk.f();
    }

    public void c() {
        if (this.a != null) {
            this.a = null;
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f(Context context) {
        vcg vcgVarQ = new vcg.b(context).q();
        this.a = vcgVarQ;
        return vcgVarQ.H();
    }

    public void g(Context context, String str, int i) {
        a7b.f("SauUpgradeHelper", "manual check begin");
        this.a = new vcg.b(context).s(context.getPackageName()).r(new b(str, i)).t(true).u(1).q();
        a7b.f("SauUpgradeHelper", "manual check upgrade");
        this.a.S();
    }
}
