package com.platform.sdk.center.sdk.mvvm.model.net.param;

import com.platform.sdk.center.cons.AcConstants;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.algorithm.UCSignHelper;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcCardOperatinParam {
    public String userToken;
    public String bizk = AcConstants.APP_K;
    public String timestamp = System.currentTimeMillis() + "";

    @NoSign
    public String sign = MD5Util.md5Hex(UCSignHelper.signWithAnnotation(this) + AcConstants.APP_S);

    public AcCardOperatinParam(String str) {
        this.userToken = str;
    }
}
