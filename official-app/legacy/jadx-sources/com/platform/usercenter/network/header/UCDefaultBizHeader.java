package com.platform.usercenter.network.header;

import android.content.Context;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.ApkInfoHelper;

/* JADX INFO: loaded from: classes9.dex */
public class UCDefaultBizHeader implements IBizHeaderManager {
    @Override // com.platform.usercenter.network.header.IBizHeaderManager
    public String extApp() {
        return "/" + ApkInfoHelper.getVersionCode(BaseApp.mContext) + "/" + BaseApp.mContext.getPackageName();
    }

    @Override // com.platform.usercenter.network.header.IBizHeaderManager
    public String fromPkg(Context context) {
        return context.getPackageName();
    }

    @Override // com.platform.usercenter.network.header.IBizHeaderManager
    public int fromPkgVersion(Context context, String str) {
        return ApkInfoHelper.getVersionCode(context, str);
    }

    @Override // com.platform.usercenter.network.header.IBizHeaderManager
    public String instantVerson() {
        return "";
    }

    @Override // com.platform.usercenter.network.header.IBizHeaderManager
    public String pushId() {
        return null;
    }

    @Override // com.platform.usercenter.network.header.IBizHeaderManager
    public String userDeviceID() {
        return null;
    }
}
