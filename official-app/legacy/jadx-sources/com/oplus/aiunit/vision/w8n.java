package com.oplus.aiunit.vision;

import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.UPUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class w8n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public w8n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        UPUtils.j(this.a, str);
        if (rdmVar != null) {
            rdmVar.a(UPPayWapActivity.j("0", "success", null));
        }
    }
}
