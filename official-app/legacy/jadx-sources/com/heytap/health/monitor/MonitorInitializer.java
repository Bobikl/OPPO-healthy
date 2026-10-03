package com.heytap.health.monitor;

import android.app.Application;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.c3c;
import com.oplus.aiunit.vision.vh8;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MonitorInitializer extends a8a {
    private static final String TAG = "MonitorInitializer";
    private Application application;

    @Override // com.oplus.aiunit.vision.a8a
    public void attachContext(Application application) {
        super.attachContext(application);
        this.application = application;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 20;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return a8a.PROCESS_ALL;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        a7b.f(TAG, "init");
        c3c c3cVar = new c3c();
        c3cVar.c(new vh8(this.application));
        c3cVar.d();
    }
}
