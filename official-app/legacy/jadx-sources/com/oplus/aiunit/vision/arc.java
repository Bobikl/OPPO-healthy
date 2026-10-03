package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.wallet.business.bus.bean.TrafficCardInfo;

/* JADX INFO: loaded from: classes19.dex */
public class arc extends tjk<TrafficCardInfo> {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v60<TaskResult> f9474c;
    public w92 d;

    public class a implements v60<TaskResult> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.oplus.aiunit.vision.v60
        public void a(Object obj) {
            arc.this.d(10004, "parse exception");
        }

        @Override // com.oplus.aiunit.vision.v60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(TaskResult taskResult) {
            arc.this.i(this.a, taskResult);
        }
    }

    public arc(String str) {
        this.b = str;
        this.d = tqc.g().f(str);
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void b() {
        this.f9474c = null;
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void c() {
        String str = this.b;
        if (TextUtils.isEmpty(str)) {
            d(10001, "aid is null");
        }
        if (this.d == null) {
            d(10002, "bConfig is null or invalid");
            return;
        }
        t6b.b("CardNoUpdater", "-------- start get card no ----------");
        z92 z92VarD = this.d.d(4);
        if (z92VarD == null || !z92VarD.isValid()) {
            d(10002, "content is null or invalid");
        } else {
            this.f9474c = new a(str);
            tpc.b().d(z92VarD, this.f9474c, 25, this.b);
        }
    }

    public final void i(String str, TaskResult taskResult) {
        w92 w92Var = this.d;
        ha2 ha2VarH = w92Var != null ? w92Var.h(taskResult, 4) : null;
        if (ha2VarH == null || !ha2VarH.f() || !ha2VarH.a(4)) {
            d(10003, "parse fail");
            return;
        }
        TrafficCardInfo trafficCardInfo = (TrafficCardInfo) ha2VarH.c(4);
        if (trafficCardInfo != null) {
            f(trafficCardInfo);
        } else {
            d(10003, "parse fail");
        }
    }
}
