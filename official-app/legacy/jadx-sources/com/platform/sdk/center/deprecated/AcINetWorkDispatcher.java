package com.platform.sdk.center.deprecated;

import android.content.Context;
import com.platform.usercenter.basic.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Deprecated
public interface AcINetWorkDispatcher {
    void get(Context context, String str, AcRequestCallBack acRequestCallBack, Map<String, String> map);

    void post(Context context, String str, String str2, AcRequestCallBack acRequestCallBack, Map<String, String> map);
}
