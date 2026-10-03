package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.client.BaseActivityClient;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* JADX INFO: loaded from: classes8.dex */
public final class v6i extends BaseActivityClient implements w6i {
    public static final String TARGET_CLASS = "com.oplus.pay.pp.sdk.ui.SplashActivity";

    public v6i(Context context, Bundle bundle) {
        super(context, bundle);
        this.defaultPackages = new String[]{"com.heytap.htms"};
    }

    @Override // com.oplus.aiunit.vision.w6i
    public final void a(Activity activity) throws BridgeExecuteException, BridgeDispatchException {
        call(activity, TARGET_CLASS, 1000, new Object[0]);
    }

    @Override // com.opos.process.bridge.client.BaseActivityClient
    public String getTargetClass() {
        return TARGET_CLASS;
    }
}
