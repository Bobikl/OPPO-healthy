package com.oplus.accountsdk.service.account.clients;

import android.content.Context;
import com.heytap.usercenter.accountsdk.AccountAgentWrapper;
import com.heytap.usercenter.wrapper.SellModeAccountAgentWrapper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
public class AcOldSellAccountClient extends AbstractAcOldBaseAccountClient {
    public AcOldSellAccountClient(String str, Context context) {
        super(str, context);
        initWrapper();
    }

    @Override // com.oplus.accountsdk.service.account.clients.AbstractAcOldBaseAccountClient
    public ResponseEnum getNotSupportResult() {
        return ResponseEnum.NEED_SELL_MODE_SDK;
    }

    @Override // com.oplus.accountsdk.service.account.clients.AbstractAcOldBaseAccountClient
    public String getTag() {
        return "AcOldSellAccountClient";
    }

    @Override // com.oplus.accountsdk.service.account.clients.AbstractAcOldBaseAccountClient
    public void initWrapper() {
        try {
            this.mWrapper = new SellModeAccountAgentWrapper(new AccountAgentWrapper());
        } catch (Throwable th) {
            AcLogUtil.w(getTag(), "init SellModeAccountAgentWrapper fail" + th.getMessage());
        }
    }
}
