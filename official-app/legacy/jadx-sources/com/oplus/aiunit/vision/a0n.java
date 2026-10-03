package com.oplus.aiunit.vision;

import android.content.Context;
import org.hapjs.card.api.debug.CardDebugController;

/* JADX INFO: loaded from: classes12.dex */
public class a0n implements jim {
    @Override // com.oplus.aiunit.vision.jim
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zB = rgm.b();
        ldm.c("getOAID", CardDebugController.EXTRA_IS_SUPPORTED, Boolean.valueOf(zB));
        if (zB) {
            return rgm.c(context);
        }
        return null;
    }
}
