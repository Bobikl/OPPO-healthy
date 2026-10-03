package com.oplus.aiunit.vision;

import android.database.ContentObserver;
import android.os.Handler;
import com.heytap.sports.step.stepdaemon.session.SportSessionCallbackRegistry;

/* JADX INFO: loaded from: classes2.dex */
public class uoi extends ContentObserver {
    public boolean a;

    public uoi(Handler handler) {
        super(handler);
        this.a = true;
    }

    public final void a() {
        if (SportSessionCallbackRegistry.INSTANCE.d()) {
            return;
        }
        lz6.p();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        a7b.f("StepAppProviderObserver", "onChange");
        if (this.a) {
            try {
                a();
            } catch (Exception e2) {
                this.a = false;
                a7b.b("StepAppProviderObserver", "no ACTIVITY_RECOGNITION permission e = " + e2.getMessage());
            }
        }
    }
}
