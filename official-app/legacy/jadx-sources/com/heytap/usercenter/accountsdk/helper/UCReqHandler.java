package com.heytap.usercenter.accountsdk.helper;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.heytap.usercenter.accountsdk.AccountResult;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCReqHandler extends Handler {
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 40001000) {
            String string = message.getData().getString(UCAccountXor8Provider.getExtraResultUsercenterBindInfo());
            if (TextUtils.isEmpty(string)) {
                return;
            }
            message.obj = AccountResult.fromJson(string);
        }
    }
}
