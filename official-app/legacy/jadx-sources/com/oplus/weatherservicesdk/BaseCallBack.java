package com.oplus.weatherservicesdk;

/* JADX INFO: loaded from: classes5.dex */
public interface BaseCallBack<JsonResult> {
    void onFail(String str);

    void onSuccess(JsonResult jsonresult);
}
