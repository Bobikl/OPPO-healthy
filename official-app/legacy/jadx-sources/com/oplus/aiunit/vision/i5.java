package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i5 extends r3 {
    public i5() {
        sfd.b().d(this);
    }

    @Override // com.oplus.aiunit.vision.r3
    public void p(Object obj) {
        zlj.a(this + "  onComplete  ======>>");
    }

    @Override // com.oplus.aiunit.vision.r3
    public void q(Throwable th) {
        zlj.c(this + "  onError --> " + erk.a(th));
    }

    public final void v(MessageEvent messageEvent) {
        if (messageEvent == null) {
            zlj.c(toString() + " --> doRequestMessage messageEvent is null, only regest Courier >>>>>");
            return;
        }
        gl4.devicePrimary.messageApi.b(messageEvent);
        zlj.a(toString() + " --> doRequestMessage --> ");
    }
}
