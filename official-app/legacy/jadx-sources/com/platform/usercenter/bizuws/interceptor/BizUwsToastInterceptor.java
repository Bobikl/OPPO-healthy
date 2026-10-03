package com.platform.usercenter.bizuws.interceptor;

import android.content.Context;
import com.oplus.aiunit.vision.w0k;
import com.platform.usercenter.tools.ui.CustomToast;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsToastInterceptor extends w0k {
    @Override // com.oplus.aiunit.vision.w0k
    public void makeToast(Context context, String str) {
        CustomToast.showToast(context, str);
    }
}
