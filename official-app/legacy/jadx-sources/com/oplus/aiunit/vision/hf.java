package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;

/* JADX INFO: loaded from: classes6.dex */
public class hf implements IAcIpcUriProvider {
    @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider
    public ContentProviderClient getProviderClient(Context context) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(Uri.parse(NotificationApiService.CONTENT + context.getPackageName() + vc.OPEN_BINDER_PROVIDER_AUTHORITY));
        } catch (Throwable th) {
            AcLogUtil.e("AcOpenIpcUriProvider", "Failed to acquire provider for authority: " + th);
            return null;
        }
    }
}
