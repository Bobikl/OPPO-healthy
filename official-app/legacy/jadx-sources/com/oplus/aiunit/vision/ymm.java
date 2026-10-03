package com.oplus.aiunit.vision;

import android.content.Context;
import org.hapjs.card.api.debug.CardDebugController;

/* JADX INFO: loaded from: classes12.dex */
public class ymm implements jim {
    public static final int d = 1;
    public egm a;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19072c = false;

    @Override // com.oplus.aiunit.vision.jim
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.b) {
            egm egmVar = new egm();
            this.a = egmVar;
            this.f19072c = egmVar.a(context, null) == 1;
            this.b = true;
        }
        ldm.c("getOAID", CardDebugController.EXTRA_IS_SUPPORTED, Boolean.valueOf(this.f19072c));
        if (this.f19072c && this.a.h()) {
            return this.a.f();
        }
        return null;
    }
}
