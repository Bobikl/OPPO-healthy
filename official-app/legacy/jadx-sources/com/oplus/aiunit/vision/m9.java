package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;

/* JADX INFO: loaded from: classes19.dex */
public class m9 implements IAcIpcUriProvider {
    @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider
    public ContentProviderClient getProviderClient(Context context) {
        return pi.f(context);
    }
}
