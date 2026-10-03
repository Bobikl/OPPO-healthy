package com.heytap.msp.sdk.base.interfaces;

import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.base.callback.InternalCallback;

/* JADX INFO: loaded from: classes19.dex */
public interface IServerMsgHandler {
    <T extends Response> T dispatchRequest(Request request);

    <T extends Response> void dispatchRequest(Request request, InternalCallback<T> internalCallback);

    <T extends Response> T processRequest(Request request);
}
