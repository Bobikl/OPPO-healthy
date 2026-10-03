package com.heytap.accountsdk.authencation.bean;

import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.algorithm.UCSignHelper;

/* JADX INFO: loaded from: classes14.dex */
@Keep
public class AuthBean {

    @Keep
    public static class Request {
        public final String processToken;
        public final String validateData;
        public final String validateType;
        public final long timestamp = System.currentTimeMillis();

        @NoSign
        public final String sign = MD5Util.md5Hex(UCSignHelper.signWithAnnotation(this));

        public Request(String str, String str2, String str3) {
            this.processToken = str;
            this.validateData = str2;
            this.validateType = str3;
        }
    }

    @Keep
    public static class Response {
        public String ticketNo;
    }
}
