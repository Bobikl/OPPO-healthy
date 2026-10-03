package com.platform.sdk.center.dispatcher;

import com.platform.usercenter.basic.annotation.Keep;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface IAcCommunicationDispatcher {
    void call(String str, JSONObject jSONObject, IAcCommunicationCallback iAcCommunicationCallback);
}
