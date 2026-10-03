package com.heytap.health.xCrash;

import android.app.Application;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.q5m;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class XCrashInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public void attachContext(Application application) {
        super.attachContext(application);
        q5m.a(application);
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 1000;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return a8a.PROCESS_ALL;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
    }
}
