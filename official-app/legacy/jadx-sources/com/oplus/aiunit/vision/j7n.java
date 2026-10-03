package com.oplus.aiunit.vision;

import com.unionpay.UPPayWapActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class j7n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public j7n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        String strC = kfk.c(this.a);
        if (rdmVar != null) {
            rdmVar.a(UPPayWapActivity.j("0", "success", strC));
        }
    }
}
