package com.heytap.store.apm.responsetrack;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.store.apm.ApmClient;
import com.heytap.store.apm.Net.data.BaseResponseData;
import com.heytap.store.apm.Net.data.NetworkTraceBean;
import com.heytap.store.apm.util.ReflectUtil;
import com.heytap.store.platform.tools.GsonUtils;
import com.oplus.aiunit.vision.ytf;

/* JADX INFO: loaded from: classes19.dex */
public class StringParse implements IResponseCodeParse {
    @Override // com.heytap.store.apm.responsetrack.IResponseCodeParse
    public NetworkTraceBean ParseCode(ytf ytfVar, Object obj) {
        int code;
        NetworkTraceBean networkTraceBean = new NetworkTraceBean();
        networkTraceBean.setHttpCode(ytfVar.getCode());
        if (ApmClient.logEnable) {
            Log.d(ApmClient.TAG, "StringParse:string类型");
        }
        try {
            Object obj2 = obj.getClass().getDeclaredField(ConnectIdLogic.PARAM_META).get(obj);
            GsonUtils gsonUtils = GsonUtils.INSTANCE;
            BaseResponseData baseResponseData = (BaseResponseData) gsonUtils.fromJson(obj.toString(), BaseResponseData.class);
            if (baseResponseData != null) {
                code = baseResponseData.getCode();
                obj2 = baseResponseData;
            } else {
                code = 0;
            }
            if (ApmClient.logEnable) {
                Log.d(ApmClient.TAG, "StringParse:get string response code:" + baseResponseData);
            }
            String json = (String) ReflectUtil.getFieldValue(obj2, "errorMessage");
            if (TextUtils.isEmpty(json)) {
                json = (String) ReflectUtil.getFieldValue(obj2, "msg");
            }
            if (TextUtils.isEmpty(json)) {
                json = (String) ReflectUtil.getFieldValue(obj2, "message");
            }
            if (TextUtils.isEmpty(json)) {
                json = gsonUtils.toJson(obj);
            }
            if (TextUtils.isEmpty(json)) {
                networkTraceBean.setBusinessMsg(ytfVar.toString());
            } else {
                networkTraceBean.setBusinessMsg(json);
            }
            networkTraceBean.setBusinessCode(code);
        } catch (Exception unused) {
        }
        return networkTraceBean;
    }
}
