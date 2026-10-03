package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.bean.TaskResult;

/* JADX INFO: loaded from: classes19.dex */
public class wqc extends tjk<Integer> {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v60<TaskResult> f18369c;
    public w92 d;

    public class a implements v60<TaskResult> {
        public final /* synthetic */ long a;

        public a(long j2) {
            this.a = j2;
        }

        @Override // com.oplus.aiunit.vision.v60
        public void a(Object obj) {
            wqc.this.d(10004, "parse exception");
        }

        @Override // com.oplus.aiunit.vision.v60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(TaskResult taskResult) {
            t6b.b("BalanceUpdater", "oma cost time 111--> get balance end");
            if (wqc.this.i(taskResult, this.a)) {
                return;
            }
            wqc.this.d(10003, "parse fail");
        }
    }

    public wqc(String str) {
        this.b = str;
        this.d = tqc.g().f(str);
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void b() {
        this.f18369c = null;
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void c() {
        if (TextUtils.isEmpty(this.b)) {
            d(10001, "aid is null");
            return;
        }
        if (this.d == null) {
            d(10002, "bConfig is null or invalid");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        t6b.b("BalanceUpdater", "oma cost time 111--> get balance");
        z92 z92VarD = this.d.d(1);
        if (z92VarD == null || !z92VarD.isValid()) {
            d(10002, "content is null or invalid");
        } else {
            this.f18369c = new a(jCurrentTimeMillis);
            tpc.b().c(z92VarD, this.f18369c);
        }
    }

    public final boolean i(TaskResult taskResult, long j2) {
        w92 w92Var = this.d;
        ha2 ha2VarH = w92Var != null ? w92Var.h(taskResult, 1) : null;
        if (ha2VarH == null || !ha2VarH.f() || !ha2VarH.a(1)) {
            return false;
        }
        int iB = ha2VarH.b(1);
        f(Integer.valueOf(iB));
        t6b.h("oma cost time 111--> get balance : " + iB + " time:" + (System.currentTimeMillis() - j2));
        return true;
    }
}
