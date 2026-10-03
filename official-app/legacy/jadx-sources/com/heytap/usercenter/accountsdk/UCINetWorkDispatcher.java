package com.heytap.usercenter.accountsdk;

import android.content.Context;
import com.heytap.usercenter.accountsdk.http.UCRequestCallBack;
import com.platform.usercenter.basic.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface UCINetWorkDispatcher {
    void get(Context context, String str, UCRequestCallBack uCRequestCallBack, Map<String, String> map);

    void post(Context context, String str, String str2, UCRequestCallBack uCRequestCallBack, Map<String, String> map);
}
