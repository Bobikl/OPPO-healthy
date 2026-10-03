package com.heytap.log.core;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public abstract class SendLogRunnable implements Runnable {
    public static final int FINISH = 10002;
    public static final int SENDING = 10001;
    private OnSendLogCallBackListener mCallBackListener;
    private SendAction mSendAction;

    public interface OnSendLogCallBackListener {
        void onCallBack(int i);
    }

    public void finish() {
        OnSendLogCallBackListener onSendLogCallBackListener = this.mCallBackListener;
        if (onSendLogCallBackListener != null) {
            onSendLogCallBackListener.onCallBack(10002);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        SendAction sendAction = this.mSendAction;
        if (sendAction == null || TextUtils.isEmpty(sendAction.date)) {
            finish();
        } else if (TextUtils.isEmpty(this.mSendAction.uploadPath)) {
            finish();
        } else {
            sendLog(new File(this.mSendAction.uploadPath));
        }
    }

    public abstract void sendLog(File file);

    public void setCallBackListener(OnSendLogCallBackListener onSendLogCallBackListener) {
        this.mCallBackListener = onSendLogCallBackListener;
    }

    public void setSendAction(SendAction sendAction) {
        this.mSendAction = sendAction;
    }
}
