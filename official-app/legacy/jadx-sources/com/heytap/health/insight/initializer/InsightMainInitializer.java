package com.heytap.health.insight.initializer;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.insight.service.InsightBroadcast;
import com.oplus.aiunit.vision.a8a;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/health/insight/initializer/InsightMainInitializer;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "configPriority", "", "init", "initAfterPrivacyAgreed", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class InsightMainInitializer extends a8a {
    public static final int $stable = 0;

    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 30;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void initAfterPrivacyAgreed() {
        new InsightBroadcast().g();
    }
}
