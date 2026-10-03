package com.oplus.aiunit.vision;

import android.app.Activity;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class r4m {
    public Activity a;

    public class a extends ie7<Boolean> {
        public final /* synthetic */ ctc i;

        public a(ctc ctcVar) {
            this.i = ctcVar;
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            t6b.b("WriteDataTocardPresent", "setCardStatus, onReqFail!");
            z0k.f(r4m.this.a).t(r4m.this.a, str2);
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(Boolean bool) {
            t6b.b("WriteDataTocardPresent", "setCardStatus, onSuccess!");
            this.i.callback();
        }
    }

    public r4m(Activity activity) {
        this.a = activity;
    }

    public void b(String str, boolean z, ctc ctcVar) {
        new rz2().a(aec.o(), str, "", "", Boolean.valueOf(z), new a(ctcVar));
    }
}
