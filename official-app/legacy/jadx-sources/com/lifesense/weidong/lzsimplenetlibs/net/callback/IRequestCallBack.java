package com.lifesense.weidong.lzsimplenetlibs.net.callback;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface IRequestCallBack<O extends BaseResponse> {
    void onRequestError(int i, String str, O o);

    void onRequestSuccess(O o);
}
