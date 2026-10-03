package com.platform.usercenter.bizuws.interceptor;

import com.oplus.aiunit.vision.h6b;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsLogInterceptor extends h6b {
    private static final String TAG = "bizuws";

    @Override // com.oplus.aiunit.vision.h6b
    public void printLog(String str) {
        UCLogUtil.d(TAG, str);
    }
}
