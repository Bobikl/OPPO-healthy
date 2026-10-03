package com.oplus.aiunit.vision;

import com.unionpay.UPPayWapActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class x8n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public x8n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        UPPayWapActivity.g(this.a, Boolean.parseBoolean(str));
        if (rdmVar != null) {
            rdmVar.a(UPPayWapActivity.j("0", "success", null));
        }
    }
}
