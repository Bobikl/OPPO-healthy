package com.bytedance.sdk.open.aweme.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.oplus.aiunit.vision.d3h;
import com.oplus.aiunit.vision.re0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseCheckHelperImpl implements IAPPCheckHelper {
    public Context mContext;

    public BaseCheckHelperImpl(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private boolean isAppSupportAuthApi() {
        return isAppSupportAPI(getPackageName(), getRemoteAuthEntryActivity(), getAuthRequestApi());
    }

    private boolean isAppSupportShareApi(String str, String str2, int i) {
        return isAppSupportAPI(str, str2, i);
    }

    public abstract int getAuthRequestApi();

    public int getPlatformSDKVersion(String str, String str2) {
        Bundle bundle;
        if (this.mContext == null || TextUtils.isEmpty(str) || !re0.c(this.mContext, getPackageName())) {
            return -1;
        }
        try {
            ActivityInfo activityInfo = this.mContext.getPackageManager().getActivityInfo(new ComponentName(str, re0.a(str, str2)), 128);
            if (activityInfo != null && (bundle = activityInfo.metaData) != null) {
                return bundle.getInt("BD_PLATFORM_SDK_VERSION", -1);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IAPPCheckHelper
    public String getRemoteAuthEntryActivity() {
        return "openauthorize.AwemeAuthorizedActivity";
    }

    public abstract String getSignature();

    @Override // com.bytedance.sdk.open.aweme.base.IAPPCheckHelper
    public boolean isAppInstalled() {
        return re0.c(this.mContext, getPackageName());
    }

    public boolean isAppSupportAPI(String str, String str2, int i) {
        if (this.mContext == null || TextUtils.isEmpty(str) || !isAppInstalled()) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, re0.a(str, str2)));
        ActivityInfo activityInfoResolveActivityInfo = intent.resolveActivityInfo(this.mContext.getPackageManager(), 65536);
        return activityInfoResolveActivityInfo != null && activityInfoResolveActivityInfo.exported && getPlatformSDKVersion(str, str2) >= i;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IAPPCheckHelper
    public boolean isAppSupportAuthorization() {
        return isAppInstalled() && isAppSupportAuthApi() && d3h.c(this.mContext, getPackageName(), getSignature());
    }

    @Override // com.bytedance.sdk.open.aweme.base.IAPPCheckHelper
    public boolean isAppSupportShare() {
        return isAppInstalled() && isAppSupportShareApi(getPackageName(), getRemoteAuthEntryActivity(), 3);
    }

    public boolean validateSign() {
        return d3h.c(this.mContext, getPackageName(), getSignature());
    }
}
