package com.oplus.aiunit.vision;

import com.oplus.drs.core.ingest.step.StepResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i41 implements u7a {
    @Override // com.oplus.aiunit.vision.u7a
    public final StepResult a(p7a p7aVar) {
        Map<String, co3> map;
        if (p7aVar == null) {
            return StepResult.b("empty_input");
        }
        List<sga> list = p7aVar.b;
        return ((list != null && !list.isEmpty()) || ((!p7aVar.e() || (map = p7aVar.d) == null || map.isEmpty()) ? false : true)) ? b(p7aVar) : StepResult.b("empty_input");
    }

    public abstract StepResult b(p7a p7aVar);
}
