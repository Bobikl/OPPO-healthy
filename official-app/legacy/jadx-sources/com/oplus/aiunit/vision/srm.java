package com.oplus.aiunit.vision;

import android.content.Context;
import com.bytedance.sdk.open.aweme.base.BaseCheckHelperImpl;

/* JADX INFO: loaded from: classes13.dex */
public class srm extends BaseCheckHelperImpl {
    public srm(Context context) {
        super(context);
    }

    public boolean a() {
        return isAppInstalled() && isAppSupportAPI(getPackageName(), getRemoteAuthEntryActivity(), 8);
    }

    @Override // com.bytedance.sdk.open.aweme.base.BaseCheckHelperImpl
    public int getAuthRequestApi() {
        return 1;
    }

    @Override // com.bytedance.sdk.open.aweme.base.IAPPCheckHelper
    public String getPackageName() {
        return "com.ss.android.ugc.aweme";
    }

    @Override // com.bytedance.sdk.open.aweme.base.BaseCheckHelperImpl
    public String getSignature() {
        return "aea615ab910015038f73c47e45d21466";
    }
}
