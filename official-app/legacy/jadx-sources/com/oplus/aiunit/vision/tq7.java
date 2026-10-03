package com.oplus.aiunit.vision;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/tq7;", "Lcom/oplus/aiunit/vision/ug0;", "", "a", "Ljava/lang/String;", Fields.CONFIG_URL, "<init>", "(Ljava/lang/String;)V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class tq7 implements ug0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String configUrl;

    public tq7(@NotNull String configUrl) {
        Intrinsics.checkParameterIsNotNull(configUrl, "configUrl");
        this.configUrl = configUrl;
    }
}
