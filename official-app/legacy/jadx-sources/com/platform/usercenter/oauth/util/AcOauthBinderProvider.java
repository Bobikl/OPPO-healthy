package com.platform.usercenter.oauth.util;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.platform.usercenter.account.ams.ipc.RequestConstant;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthBinderProvider implements IAcIpcUriProvider {
    private static final String TAG = "BinderProvider";

    public static class AcBinderProviderHolder {
        private static final AcOauthBinderProvider sINSTANCE = new AcOauthBinderProvider();

        private AcBinderProviderHolder() {
        }
    }

    private ContentProviderClient acquireUnstableClient(Context context, String str) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(Uri.parse(NotificationApiService.CONTENT + str));
        } catch (Throwable th) {
            AcOauthLogUtil.e(TAG, "acquireUnstableClient error, authority: " + str + ", " + th.getMessage());
            return null;
        }
    }

    public static AcOauthBinderProvider getInstance() {
        return AcBinderProviderHolder.sINSTANCE;
    }

    @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider
    public ContentProviderClient getProviderClient(Context context) {
        String accountPkgName = AcOauthAppUtil.getAccountPkgName(context);
        if (TextUtils.isEmpty(accountPkgName)) {
            AcOauthLogUtil.w(TAG, "remote pkg is empty, try legacy directly");
        } else {
            String str = accountPkgName + RequestConstant.BINDER_THIRD_PROVIDER_OS17_AUTHORITY_SUFFIX;
            ContentProviderClient contentProviderClientAcquireUnstableClient = acquireUnstableClient(context, str);
            if (contentProviderClientAcquireUnstableClient != null) {
                AcOauthLogUtil.i(TAG, "connected to ThirdContentProvider: " + str);
                return contentProviderClientAcquireUnstableClient;
            }
            AcOauthLogUtil.w(TAG, "ThirdContentProvider not found: " + str + ", fallback to legacy");
        }
        ContentProviderClient contentProviderClientAcquireUnstableClient2 = acquireUnstableClient(context, RequestConstant.BINDER_PROVIDER_AUTHORITY);
        if (contentProviderClientAcquireUnstableClient2 != null) {
            AcOauthLogUtil.i(TAG, "connected to legacy provider: com.platform.usercenter.account.ams.provider");
        } else {
            AcOauthLogUtil.e(TAG, "failed to acquire both new and legacy provider client");
        }
        return contentProviderClientAcquireUnstableClient2;
    }

    private AcOauthBinderProvider() {
    }
}
