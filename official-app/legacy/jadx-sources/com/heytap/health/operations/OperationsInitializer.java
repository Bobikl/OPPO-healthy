package com.heytap.health.operations;

import androidx.annotation.Keep;
import com.heytap.health.operations.router.providers.MedalPublicService;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class OperationsInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 80;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        x0.d().b("/fit/FitService").navigation();
        x0.d().h(MedalPublicService.class);
    }
}
