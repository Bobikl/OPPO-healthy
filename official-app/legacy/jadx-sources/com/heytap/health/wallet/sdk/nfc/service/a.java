package com.heytap.health.wallet.sdk.nfc.service;

import com.oplus.aiunit.vision.gz7;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.u2j;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    public InterfaceC0685a a;

    /* JADX INFO: renamed from: com.heytap.health.wallet.sdk.nfc.service.a$a, reason: collision with other inner class name */
    public interface InterfaceC0685a {
    }

    public void a() {
        if (sr6.c().j(this)) {
            return;
        }
        sr6.c().p(this);
    }

    public void b(InterfaceC0685a interfaceC0685a) {
        this.a = interfaceC0685a;
    }

    @u2j(threadMode = ThreadMode.BACKGROUND)
    public void formtSeActivityEvent(gz7 gz7Var) {
        new StringBuilder().append("formtseevt:");
        throw null;
    }
}
