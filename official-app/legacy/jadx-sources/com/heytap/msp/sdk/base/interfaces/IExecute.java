package com.heytap.msp.sdk.base.interfaces;

import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public interface IExecute<R extends Serializable> {
    <T extends Response> void connectAppUseAidl(Request request, Class<T> cls);

    <T extends Response> void execute(R r, Class<T> cls);
}
