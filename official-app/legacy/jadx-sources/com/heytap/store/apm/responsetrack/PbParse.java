package com.heytap.store.apm.responsetrack;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.store.apm.ApmClient;
import com.heytap.store.apm.Net.data.NetworkTraceBean;
import com.heytap.store.apm.util.ReflectUtil;
import com.heytap.store.platform.tools.GsonUtils;
import com.oplus.aiunit.vision.ytf;

/* JADX INFO: loaded from: classes19.dex */
public class PbParse implements IResponseCodeParse {
    @Override // com.heytap.store.apm.responsetrack.IResponseCodeParse
    public NetworkTraceBean ParseCode(ytf ytfVar, Object obj) {
        NetworkTraceBean networkTraceBean = new NetworkTraceBean();
        networkTraceBean.setHttpCode(ytfVar.getCode());
        if (ApmClient.logEnable) {
            Log.d(ApmClient.TAG, "PbParse-pb类型");
        }
        try {
            Object obj2 = obj.getClass().getDeclaredField(ConnectIdLogic.PARAM_META).get(obj);
            int i = Integer.parseInt(obj2.getClass().getDeclaredField("code").get(obj2).toString());
            String json = (String) ReflectUtil.getFieldValue(obj2, "errorMessage");
            if (TextUtils.isEmpty(json)) {
                json = (String) ReflectUtil.getFieldValue(obj2, "msg");
            }
            if (TextUtils.isEmpty(json)) {
                json = (String) ReflectUtil.getFieldValue(obj2, "message");
            }
            if (TextUtils.isEmpty(json)) {
                json = GsonUtils.INSTANCE.toJson(obj);
            }
            networkTraceBean.setBusinessMsg(json);
            networkTraceBean.setBusinessCode(i);
        } catch (Exception unused) {
        }
        return networkTraceBean;
    }
}
