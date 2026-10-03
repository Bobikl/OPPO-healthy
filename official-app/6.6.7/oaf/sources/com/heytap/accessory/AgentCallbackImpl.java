package com.heytap.accessory;

import android.content.Intent;
import com.heytap.accessory.logging.SdkLog;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AgentCallbackImpl implements BaseJobAgent.RequestAgentCallback {
    public static final int REQUEST_TYPE_CONNECTION = 1;
    public static final int REQUEST_TYPE_MESSAGE = 2;
    private static final String TAG = "AgentCallbackImpl";
    private Intent mIntent;
    private int mRequestType;

    public AgentCallbackImpl(int i, Intent intent) {
        this.mRequestType = i;
        this.mIntent = intent;
    }

    @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
    public void onAgentAvailable(BaseJobAgent baseJobAgent) {
        SdkLog.d(TAG, "onAgentAvailable");
        if (this.mRequestType == 1) {
            baseJobAgent.handleConnectionRequest(this.mIntent);
        }
    }

    @Override // com.heytap.accessory.BaseJobAgent.RequestAgentCallback
    public void onError(int i, String str) {
        SdkLog.e(TAG, "Request failed. Type = " + this.mRequestType + ". ErrorCode : " + i + ". ErrorMsg: " + str);
    }
}
