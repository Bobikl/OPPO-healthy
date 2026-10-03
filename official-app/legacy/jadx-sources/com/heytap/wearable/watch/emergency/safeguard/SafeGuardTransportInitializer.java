package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.gl4;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardTransportInitializer;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "", "init", "initAfterPrivacyAgreed", "configPriority", "<init>", "()V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SafeGuardTransportInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 80;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void initAfterPrivacyAgreed() {
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.d(46, "/emergency_impl/SafeGuardTransceiver");
        bm5Var.messageApi.c(46, "/emergency_impl/SafeGuardTransceiver");
        bm5Var.fileApi.d(47, "/emergency_impl/SafeGuardTransceiver");
        bm5Var.fileApi.c(47, "/emergency_impl/SafeGuardTransceiver");
    }
}
