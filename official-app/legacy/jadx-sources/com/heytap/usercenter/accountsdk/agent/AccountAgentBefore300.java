package com.heytap.usercenter.accountsdk.agent;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.service.accountsdk.AccountService;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.oplus.aiunit.vision.nm;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentBefore300 implements IAccountDelegate {
    private static final String TAG = "AccountAgentBefore300";

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public void clearCache() {
    }

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public IpcAccountEntity ipcEntity(@NonNull String str) {
        String tokenByProvider = AccountService.getTokenByProvider(BaseApp.mContext, str);
        if (TextUtils.isEmpty(tokenByProvider)) {
            UCLogUtil.i(nm.SDK_TAG, "AccountAgentBefore300ipc data is null");
            return null;
        }
        IpcAccountEntity ipcAccountEntity = new IpcAccountEntity();
        ipcAccountEntity.authToken = tokenByProvider;
        ipcAccountEntity.accountName = AccountService.getNameByProvider(BaseApp.mContext, str);
        return ipcAccountEntity;
    }

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public boolean isLogin(@NonNull String str) {
        return AccountService.isLogin(BaseApp.mContext, str);
    }
}
