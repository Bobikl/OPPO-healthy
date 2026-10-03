package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface rs9 {
    public static final String JS_API_CALLBACK_CODE = "code";
    public static final String JS_API_CALLBACK_DATA = "data";
    public static final String JS_API_CALLBACK_MSG = "msg";
    public static final int SUCCESS_CODE = 0;
    public static final String SUCCESS_MESSAGE = "success!";

    void a(Object obj, String str, JSONObject jSONObject);

    void fail(Object obj, String str);

    void success();

    void success(JSONObject jSONObject);
}
