package com.heytap.usercenter.accountsdk.http;

import android.content.Context;
import android.text.TextUtils;
import com.accountbase.j;
import com.heytap.usercenter.accountsdk.UCINetWorkDispatcher;
import com.heytap.usercenter.accountsdk.helper.Base64Helper;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.algorithm.XORUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Deprecated
public class UCNativeNetworkDispatcherImpl implements UCINetWorkDispatcher {
    @Override // com.heytap.usercenter.accountsdk.UCINetWorkDispatcher
    public void get(Context context, String str, UCRequestCallBack uCRequestCallBack, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new j(context, "GET", uCRequestCallBack, str, map).execute(new String[0]);
    }

    @Override // com.heytap.usercenter.accountsdk.UCINetWorkDispatcher
    public void post(Context context, String str, String str2, UCRequestCallBack uCRequestCallBack, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("http request,url: ");
        sb.append(XORUtils.encrypt(Base64Helper.base64Encode(str + "\n param: " + str2), 8));
        UCLogUtil.i(sb.toString());
        new j(context, "POST", uCRequestCallBack, str, map).execute(str2);
    }
}
