package com.heytap.store.apm.responsetrack;

import com.heytap.store.apm.Net.data.NetworkTraceBean;
import com.oplus.aiunit.vision.ytf;

/* JADX INFO: loaded from: classes19.dex */
public class ExceptionParse implements IResponseCodeParse {
    @Override // com.heytap.store.apm.responsetrack.IResponseCodeParse
    public NetworkTraceBean ParseCode(ytf ytfVar, Object obj) {
        NetworkTraceBean networkTraceBean = new NetworkTraceBean();
        networkTraceBean.setHttpCode(101);
        networkTraceBean.setBusinessMsg(obj.toString());
        return networkTraceBean;
    }
}
