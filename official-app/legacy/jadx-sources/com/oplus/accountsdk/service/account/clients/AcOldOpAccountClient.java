package com.oplus.accountsdk.service.account.clients;

import android.content.Context;
import com.heytap.OPAccountAgentWrapper;
import com.heytap.opsdk.OPOwnAccountAgentWrapper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.m8;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
public class AcOldOpAccountClient extends AbstractAcOldBaseAccountClient {
    private boolean mIsFromOp;

    public AcOldOpAccountClient(String str, Context context, boolean z) {
        super(str, context);
        this.mIsFromOp = z;
        initWrapper();
    }

    @Override // com.oplus.accountsdk.service.account.clients.AbstractAcOldBaseAccountClient
    public ResponseEnum getNotSupportResult() {
        return ResponseEnum.NEED_OPLUS_AUTH_SDK;
    }

    @Override // com.oplus.accountsdk.service.account.clients.AbstractAcOldBaseAccountClient
    public String getTag() {
        return "AcOpOldAccountClient";
    }

    @Override // com.oplus.accountsdk.service.account.clients.AbstractAcOldBaseAccountClient
    public void initWrapper() {
        try {
            if (m8.d(this.mContext) || !this.mIsFromOp) {
                this.mWrapper = new OPAccountAgentWrapper(this.mIsFromOp);
            } else {
                this.mWrapper = new OPOwnAccountAgentWrapper();
            }
        } catch (Throwable th) {
            AcLogUtil.w(getTag(), "init OPAccountAgentWrapper fail " + th.getMessage());
        }
    }
}
