package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.client.BaseActivityClient;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class mai extends BaseActivityClient implements nai {
    public static final String TARGET_CLASS = "com.oplus.pay.pp.sdk.ui.SplashActivity";

    public mai(Context context, Bundle bundle) {
        super(context, bundle);
        this.defaultPackages = new String[]{"com.heytap.htms"};
    }

    @Override // com.oplus.aiunit.vision.nai
    public final void a(Activity activity) throws BridgeExecuteException, BridgeDispatchException {
        call(activity, TARGET_CLASS, 1000, new Object[0]);
    }

    @Override // com.opos.process.bridge.client.BaseActivityClient
    public String getTargetClass() {
        return TARGET_CLASS;
    }
}
