package com.platform.sdk.center.deprecated;

import android.content.Context;
import android.text.TextUtils;
import com.accountcenter.l;
import com.platform.sdk.center.utils.AcBase64Utils;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.algorithm.XORUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Deprecated
public class AcNativeNetworkDispatcherImpl implements AcINetWorkDispatcher {
    @Override // com.platform.sdk.center.deprecated.AcINetWorkDispatcher
    public void get(Context context, String str, AcRequestCallBack acRequestCallBack, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new l(context, "GET", str, acRequestCallBack, map).execute(new String[0]);
    }

    @Override // com.platform.sdk.center.deprecated.AcINetWorkDispatcher
    public void post(Context context, String str, String str2, AcRequestCallBack acRequestCallBack, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder("http request,url: ");
        sb.append(XORUtils.encrypt(AcBase64Utils.base64Encode(str + "\n param: " + str2), 8));
        UCLogUtil.i(sb.toString());
        new l(context, "POST", str, acRequestCallBack, map).execute(str2);
    }
}
