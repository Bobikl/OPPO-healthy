package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.drs.core.ingest.step.StepResult;

/* JADX INFO: loaded from: classes6.dex */
public final class qpg extends i41 {
    @Override // com.oplus.aiunit.vision.i41
    public StepResult b(p7a p7aVar) {
        if (!p7aVar.e() && t56.configService != null) {
            for (sga sgaVar : p7aVar.b) {
                String strA = sgaVar.a();
                String strS = sgaVar.s();
                String strX = sgaVar.x();
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strS) && !TextUtils.isEmpty(strX)) {
                    try {
                        t56.configService.b(strA, strS, strX);
                        break;
                    } catch (Exception e2) {
                        z6b.p("SecretStoreStep", "setAppKeySecret error, appId=" + strA, e2);
                    }
                }
            }
            return StepResult.c();
        }
        return StepResult.c();
    }
}
