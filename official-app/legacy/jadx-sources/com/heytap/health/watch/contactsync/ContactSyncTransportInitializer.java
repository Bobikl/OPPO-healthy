package com.heytap.health.watch.contactsync;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ik5;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.z44;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncTransportInitializer;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "", "init", "configPriority", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ContactSyncTransportInitializer extends a8a {
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
        ik5 ik5Var = gl4.deviceMultiple;
        ik5Var.messageApi.i(ra5.a.INSTANCE, 15, z44.MESSAGE_API_PATH);
        ik5Var.nodeApi.e(a.INSTANCE);
    }
}
