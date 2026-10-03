package com.oplus.aiunit.vision;

import com.oplus.drs.core.ingest.step.StepResult;

/* JADX INFO: loaded from: classes6.dex */
@FunctionalInterface
public interface u7a {
    StepResult a(p7a p7aVar);

    default String name() {
        return getClass().getSimpleName().replace("Step", "");
    }
}
