package com.heytap.msp.sdk.common.utils;

import android.content.Context;
import com.heytap.msp.bean.BaseRequest;
import com.heytap.msp.bean.BizRequest;
import com.heytap.msp.bean.BizResponse;
import com.heytap.msp.bean.Request;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.common.log.MspLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public class KeyPath {
    public static final String TAG = "KeyPath";
    private Map<String, KeyPathInfo> infoCache = new ConcurrentHashMap(16);

    public static class KeyPathInfo {
        public int cost;
        public String id;
        public boolean isSuc;
        public String methodName;
        public boolean needDownloadApp;
        public String params;
        public long reqStartTime;
        public boolean useMsp;
    }

    private void onDownloadApp(int i, Request request) {
        if (request == null || request.getBizRequest() == null) {
            return;
        }
        try {
            BizRequest bizRequest = request.getBizRequest();
            String requestId = request.getRequestId();
            String methodName = bizRequest.getMethodName();
            KeyPathInfo keyPathInfo = this.infoCache.get(requestId);
            if (keyPathInfo != null) {
                keyPathInfo.isSuc = true;
                keyPathInfo.needDownloadApp = true;
            }
            onKeyPathReport(i, request, methodName, 0, "", null, keyPathInfo);
            this.infoCache.remove(requestId);
            MspLog.iIgnore(TAG, String.format("onDownloadApp, id=%s, method=%s", requestId, methodName));
        } catch (Exception e2) {
            MspLog.w(TAG, e2);
        }
    }

    private void onExecute(int i, Request request, Object... objArr) {
        if (request == null || objArr == null || objArr.length != 1) {
            return;
        }
        try {
            String requestId = request.getRequestId();
            String str = (String) objArr[0];
            KeyPathInfo keyPathInfo = new KeyPathInfo();
            keyPathInfo.id = requestId;
            keyPathInfo.methodName = str;
            keyPathInfo.reqStartTime = System.currentTimeMillis();
            this.infoCache.put(requestId, keyPathInfo);
            MspLog.iIgnore(TAG, String.format("onExecute, id=%s, method=%s", requestId, str));
        } catch (Exception e2) {
            MspLog.w(TAG, e2);
        }
    }

    private void onInnerCallback(int i, Request request, Object... objArr) {
        if (request == null || request.getBizRequest() == null || objArr == null || objArr.length != 1) {
            return;
        }
        try {
            BizRequest bizRequest = request.getBizRequest();
            String requestId = request.getRequestId();
            String methodName = bizRequest.getMethodName();
            BizResponse bizResponse = (BizResponse) objArr[0];
            int code = bizResponse.getCode();
            String message = bizResponse.getMessage();
            Object response = bizResponse.getResponse();
            KeyPathInfo keyPathInfo = this.infoCache.get(requestId);
            if (keyPathInfo != null) {
                keyPathInfo.isSuc = code == 0;
                keyPathInfo.cost = (int) Math.abs(System.currentTimeMillis() - keyPathInfo.reqStartTime);
                if (!keyPathInfo.isSuc) {
                    keyPathInfo.params = bizRequest.getMethodParams();
                }
            }
            onKeyPathReport(i, request, methodName, code, message, response, keyPathInfo);
            this.infoCache.remove(requestId);
            MspLog.iIgnore(TAG, String.format("onCallback, id=%s, method=%s, code=%d, msg=%s", requestId, methodName, Integer.valueOf(code), message));
        } catch (Exception e2) {
            MspLog.w(TAG, e2);
        }
    }

    private void onKeyPathReport(int i, Request request, String str, int i2, String str2, Object obj, KeyPathInfo keyPathInfo) {
        BaseRequest baseRequest = request.getBaseRequest();
        Context context = BaseSdkAgent.getInstance().getContext();
        if (baseRequest == null || context == null || keyPathInfo != null) {
            return;
        }
        new KeyPathInfo();
    }

    private void onShoudUseApp(int i, Request request, Object... objArr) {
        if (request == null || request.getBizRequest() == null || objArr == null || objArr.length != 1) {
            return;
        }
        try {
            BizRequest bizRequest = request.getBizRequest();
            String requestId = request.getRequestId();
            String methodName = bizRequest.getMethodName();
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            KeyPathInfo keyPathInfo = this.infoCache.get(requestId);
            if (keyPathInfo != null) {
                keyPathInfo.useMsp = zBooleanValue;
            }
            MspLog.iIgnore(TAG, String.format("onUseApp, id=%s, method=%s, useApp=%b", requestId, methodName, Boolean.valueOf(zBooleanValue)));
        } catch (Exception e2) {
            MspLog.w(TAG, e2);
        }
    }

    public Map<String, KeyPathInfo> getInfoCache() {
        return this.infoCache;
    }

    public void onKeyPath(int i, Request request, Object... objArr) {
        if (i == 1) {
            onExecute(i, request, objArr);
            return;
        }
        if (i == 2) {
            onShoudUseApp(i, request, objArr);
        } else if (i == 3) {
            onInnerCallback(i, request, objArr);
        } else {
            if (i != 4) {
                return;
            }
            onDownloadApp(i, request);
        }
    }
}
