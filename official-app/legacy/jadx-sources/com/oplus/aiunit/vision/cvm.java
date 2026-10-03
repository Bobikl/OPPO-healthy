package com.oplus.aiunit.vision;

import android.content.Context;
import org.hapjs.card.api.debug.CardDebugController;

/* JADX INFO: loaded from: classes12.dex */
public class cvm implements jim {
    public boolean a = false;

    @Override // com.oplus.aiunit.vision.jim
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.a) {
            eam.c(context);
            this.a = true;
        }
        boolean zA = eam.a();
        ldm.c("getOAID", CardDebugController.EXTRA_IS_SUPPORTED, Boolean.valueOf(zA));
        if (zA) {
            return eam.b(context);
        }
        return null;
    }
}
