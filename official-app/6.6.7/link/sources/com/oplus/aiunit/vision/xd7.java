package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.sdk.common.Priority;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class xd7 implements pd5 {
    public nd5 a = null;
    public eu1 b;

    public class a extends eu1 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.eu1
        public void a(ModuleInfo moduleInfo, sr0 sr0Var) {
            if (xd7.this.a != null) {
                xd7.this.a.a(moduleInfo, sr0Var.c());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.pd5
    public void a(String str, byte[] bArr, lt2<Void> lt2Var) {
        ModuleInfo moduleInfoH = rml.k().h(str);
        if (moduleInfoH == null) {
            uml.b("FileTransferReadSender", "sendData: moduleInfo is null");
            return;
        }
        sr0 sr0Var = new sr0(bArr);
        sr0Var.i(Priority.PRIORITY_MIDDLE.getPriority());
        sr0Var.g(lt2Var);
        sr0Var.h(false);
        kd5.v().o(moduleInfoH, sr0Var);
    }

    public void c(nd5 nd5Var) {
        this.a = nd5Var;
        d();
    }

    public void d() {
        kd5.v().g(this.b);
        this.b = new a();
        kd5.v().n(this.b);
    }

    public void e() {
        kd5.v().g(this.b);
        this.b = null;
    }
}
