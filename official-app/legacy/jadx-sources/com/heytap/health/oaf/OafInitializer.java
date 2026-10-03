package com.heytap.health.oaf;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.oad;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.u89;
import com.oplus.aiunit.vision.wil;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class OafInitializer extends a8a {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(boolean z) {
        u89.InitApi.a(this.mApplication, z);
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 300;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return a8a.PROCESS_ALL;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        final boolean z = !qe0.E();
        wil.e();
        com.heytap.health.adaptersdk.a.f().g(this.mApplication);
        oad.f(new Runnable() { // from class: com.oplus.aiunit.vision.z9d
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$init$0(z);
            }
        });
    }
}
