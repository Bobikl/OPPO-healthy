package com.oplus.aiunit.toolkits;

import android.os.Bundle;
import com.oplus.aiunit.core.protocol.common.ErrorCode;
import com.oplus.aiunit.vision.i0;
import com.oplus.aiunit.vision.jxg;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/toolkits/AISettings$checkUpdate$c$1", "Lcom/oplus/aiunit/toolkits/IAICallback$Stub;", "Landroid/os/Bundle;", "bundle", "", "onCall", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class AISettings$checkUpdate$c$1 extends IAICallback.Stub {
    final /* synthetic */ jxg $callback;

    public AISettings$checkUpdate$c$1(jxg jxgVar) {
    }

    @Override // com.oplus.aiunit.toolkits.IAICallback
    public void onCall(@Nullable Bundle bundle) {
        i0.a("AISettings", "onCall " + bundle);
        if (bundle == null) {
            ErrorCode.kErrorCommunication.value();
            throw null;
        }
        ErrorCode errorCode = ErrorCode.kErrorNone;
        if (bundle.getInt("package::error_code", errorCode.value()) != errorCode.value()) {
            throw null;
        }
        if (bundle.getInt("ai::key::settings_callback_type", 0) == 0) {
            bundle.getInt("ai::key::settings_status", -1);
            throw null;
        }
        bundle.getInt("ai::key::settings_ui_status", -1);
        throw null;
    }
}
