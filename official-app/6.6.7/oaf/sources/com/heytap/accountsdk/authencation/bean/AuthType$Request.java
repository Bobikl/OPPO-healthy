package com.heytap.accountsdk.authencation.bean;

import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.algorithm.UCSignHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
public class AuthType$Request {
    public final String appId;
    public final String businessId;
    public final String ssoid;
    public final String userToken;
    public long timestamp = System.currentTimeMillis();

    @NoSign
    public String sign = MD5Util.md5Hex(UCSignHelper.signWithAnnotation(this));

    public AuthType$Request(String str, String str2, String str3, String str4) {
        this.appId = str;
        this.businessId = str2;
        this.ssoid = str3;
        this.userToken = str4;
    }
}
