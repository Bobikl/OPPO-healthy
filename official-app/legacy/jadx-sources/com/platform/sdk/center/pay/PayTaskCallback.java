package com.platform.sdk.center.pay;

import com.platform.usercenter.basic.annotation.Keep;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface PayTaskCallback {
    void onPayTaskReusult(boolean z, JSONObject jSONObject, String str);
}
