package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.wallet.business.bus.bean.BusSiteState;

/* JADX INFO: loaded from: classes19.dex */
public class xqc extends tjk<BusSiteState> {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v60<TaskResult> f18727c;
    public w92 d;

    public class a implements v60<TaskResult> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.v60
        public void a(Object obj) {
            xqc.this.d(10004, "BusSiteStateUpdater parse exception");
        }

        @Override // com.oplus.aiunit.vision.v60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(TaskResult taskResult) {
            ha2 ha2VarH = xqc.this.d != null ? xqc.this.d.h(taskResult, 16) : null;
            if (ha2VarH == null || !ha2VarH.f() || !ha2VarH.a(16)) {
                xqc.this.d(10003, "BusSiteStateUpdater parse fail");
                return;
            }
            BusSiteState busSiteState = (BusSiteState) ha2VarH.c(16);
            if (busSiteState == null) {
                xqc.this.d(10003, "BusSiteStateUpdater parse fail");
            } else {
                xqc.this.f(busSiteState);
            }
        }
    }

    public xqc(String str) {
        this.b = str;
        this.d = tqc.g().f(str);
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void b() {
        this.f18727c = null;
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void c() {
        if (TextUtils.isEmpty(this.b)) {
            d(10001, "BusSiteStateUpdater aid is null");
            return;
        }
        if (this.d == null) {
            d(10002, "bconfig is null or invalid");
            return;
        }
        t6b.a("BusSiteStateUpdater oma cost time 111--> get stations status");
        z92 z92VarD = this.d.d(16);
        if (z92VarD == null || !z92VarD.isValid()) {
            d(10002, "BusSiteStateUpdater content is null or invalid");
        } else {
            this.f18727c = new a();
            tpc.b().c(z92VarD, this.f18727c);
        }
    }
}
