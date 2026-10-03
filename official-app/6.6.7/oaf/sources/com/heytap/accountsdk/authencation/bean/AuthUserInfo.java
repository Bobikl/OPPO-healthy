package com.heytap.accountsdk.authencation.bean;

import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.algorithm.UCSignHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
public class AuthUserInfo {

    @Keep
    public static class Request {
        public final String ssoid;
        public final String userToken;
        public final long timestamp = System.currentTimeMillis();

        @NoSign
        public final String sign = MD5Util.md5Hex(UCSignHelper.signWithAnnotation(this));

        public Request(String str, String str2) {
            this.userToken = str;
            this.ssoid = str2;
        }
    }

    @Keep
    public static class Response {
        public static final String KEY_ERROR_CODE_3031 = "3031";
        public String accountName;
        public String maskedEmail;
        public String maskedMobile;
    }
}
