package com.heytap.usercenter.accountsdk.http;

import com.platform.sdk.center.cons.AcConstants;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.algorithm.UCSignHelper;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountBasicParam {
    private String userToken;
    protected String bizk = "TZeSXfQXxrCyjhvARaVrmw";
    private long timestamp = System.currentTimeMillis();

    @NoSign
    public String sign = MD5Util.md5Hex(UCSignHelper.signWithAnnotation(this) + AcConstants.APP_S);

    public AccountBasicParam(String str) {
        this.userToken = str;
    }
}
