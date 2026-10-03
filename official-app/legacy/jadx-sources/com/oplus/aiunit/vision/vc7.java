package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.sdk.common.Priority;

/* JADX INFO: loaded from: classes5.dex */
public class vc7 implements uc5 {
    public sc5 a = null;
    public qt1 b;

    public class a extends qt1 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.qt1
        public void a(ModuleInfo moduleInfo, br0 br0Var) {
            if (vc7.this.a != null) {
                vc7.this.a.a(moduleInfo, br0Var.c());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.uc5
    public void a(String str, byte[] bArr, xs2<Void> xs2Var) {
        ModuleInfo moduleInfoH = til.k().h(str);
        if (moduleInfoH == null) {
            wil.b("FileTransferReadSender", "sendData: moduleInfo is null");
            return;
        }
        br0 br0Var = new br0(bArr);
        br0Var.i(Priority.PRIORITY_MIDDLE.getPriority());
        br0Var.g(xs2Var);
        br0Var.h(false);
        pc5.v().o(moduleInfoH, br0Var);
    }

    public void c(sc5 sc5Var) {
        this.a = sc5Var;
        d();
    }

    public void d() {
        pc5.v().g(this.b);
        this.b = new a();
        pc5.v().n(this.b);
    }

    public void e() {
        pc5.v().g(this.b);
        this.b = null;
    }
}
