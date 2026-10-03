package com.lifesense.weidong.lzsimplenetlibs.net.dispatcher;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseResponse;
import com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack;

/* JADX INFO: loaded from: classes5.dex */
public interface ApiDispatcher {
    void dispatch(BaseRequest baseRequest, IRequestCallBack<? extends BaseResponse> iRequestCallBack);
}
