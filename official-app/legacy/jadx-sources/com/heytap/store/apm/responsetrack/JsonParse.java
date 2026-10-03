package com.heytap.store.apm.responsetrack;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.apm.ApmClient;
import com.heytap.store.apm.Net.data.NetworkTraceBean;
import com.heytap.store.apm.util.ReflectUtil;
import com.heytap.store.platform.tools.GsonUtils;
import com.oplus.aiunit.vision.ytf;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes19.dex */
public class JsonParse implements IResponseCodeParse {
    @Override // com.heytap.store.apm.responsetrack.IResponseCodeParse
    public NetworkTraceBean ParseCode(ytf ytfVar, Object obj) {
        int i;
        NetworkTraceBean networkTraceBean = new NetworkTraceBean();
        networkTraceBean.setHttpCode(ytfVar.getCode());
        if (ApmClient.logEnable) {
            Log.d(ApmClient.TAG, "JsonParse:json类型");
        }
        try {
            try {
                Field declaredField = obj.getClass().getDeclaredField("code");
                declaredField.setAccessible(true);
                i = Integer.parseInt(declaredField.get(obj).toString());
            } catch (Exception unused) {
                i = 0;
            }
        } catch (Exception unused2) {
            Field declaredField2 = obj.getClass().getSuperclass().getDeclaredField("code");
            declaredField2.setAccessible(true);
            i = Integer.parseInt(declaredField2.get(obj).toString());
        }
        try {
            String json = (String) ReflectUtil.getFieldValue(obj, "errorMessage");
            if (TextUtils.isEmpty(json)) {
                json = (String) ReflectUtil.getFieldValue(obj, "msg");
            }
            if (TextUtils.isEmpty(json)) {
                json = (String) ReflectUtil.getFieldValue(obj, "message");
            }
            if (TextUtils.isEmpty(json)) {
                json = GsonUtils.INSTANCE.toJson(obj);
            }
            if (TextUtils.isEmpty(json)) {
                networkTraceBean.setBusinessMsg(ytfVar.toString());
            } else {
                networkTraceBean.setBusinessMsg(json);
            }
            networkTraceBean.setBusinessCode(i);
        } catch (Exception unused3) {
        }
        return networkTraceBean;
    }
}
