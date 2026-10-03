package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.bean.TaskResult;

/* JADX INFO: loaded from: classes19.dex */
public class zqc extends tjk<String> {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v60<TaskResult> f19525c;
    public w92 d;

    public class a implements v60<TaskResult> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.v60
        public void a(Object obj) {
            zqc.this.d(10004, "parse exception");
        }

        @Override // com.oplus.aiunit.vision.v60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(TaskResult taskResult) {
            if (zqc.this.i(taskResult)) {
                return;
            }
            zqc.this.d(10003, "parse fail");
        }
    }

    public zqc(String str) {
        this.b = str;
        this.d = tqc.g().f(str);
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void b() {
        this.f19525c = null;
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void c() {
        if (TextUtils.isEmpty(this.b)) {
            d(10001, "aid is null");
        }
        if (this.d == null) {
            d(10002, "bConfig is null or invalid");
            return;
        }
        t6b.a("oma cost time 111--> get card no");
        z92 z92VarD = this.d.d(2);
        if (z92VarD == null || !z92VarD.isValid()) {
            d(10002, "content is null or invalid");
        } else {
            this.f19525c = new a();
            tpc.b().c(z92VarD, this.f19525c);
        }
    }

    public final boolean i(TaskResult taskResult) {
        w92 w92Var = this.d;
        ha2 ha2VarH = w92Var != null ? w92Var.h(taskResult, 2) : null;
        if (ha2VarH == null || !ha2VarH.f() || !ha2VarH.a(2)) {
            return false;
        }
        String strE = ha2VarH.e(2);
        t6b.a("oma cost time 111--> get card no : " + strE);
        f(strE);
        return true;
    }
}
