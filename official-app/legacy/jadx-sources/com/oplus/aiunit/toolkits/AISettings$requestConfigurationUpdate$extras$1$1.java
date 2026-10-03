package com.oplus.aiunit.toolkits;

import android.os.Bundle;
import com.oplus.aiunit.vision.i0;
import com.oplus.aiunit.vision.jqf;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/toolkits/AISettings$requestConfigurationUpdate$extras$1$1", "Lcom/oplus/aiunit/toolkits/IAICallback$Stub;", "Landroid/os/Bundle;", "bundle", "", "onCall", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class AISettings$requestConfigurationUpdate$extras$1$1 extends IAICallback.Stub {
    final /* synthetic */ jqf $callback;

    public AISettings$requestConfigurationUpdate$extras$1$1(jqf jqfVar) {
    }

    @Override // com.oplus.aiunit.toolkits.IAICallback
    public void onCall(@Nullable Bundle bundle) {
        i0.a("AISettings", "requestConfigurationUpdate onCall: " + bundle);
        bundle.getClass();
        bundle.getInt("package::request_config_update_result", 0);
        throw null;
    }
}
