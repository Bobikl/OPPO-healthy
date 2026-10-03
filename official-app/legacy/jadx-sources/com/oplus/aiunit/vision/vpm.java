package com.oplus.aiunit.vision;

import android.content.Context;
import org.hapjs.card.api.debug.CardDebugController;

/* JADX INFO: loaded from: classes12.dex */
public class vpm implements jim {
    @Override // com.oplus.aiunit.vision.jim
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zA = pgm.a();
        ldm.c("getOAID", CardDebugController.EXTRA_IS_SUPPORTED, Boolean.valueOf(zA));
        if (zA) {
            return pgm.b(context);
        }
        return null;
    }
}
