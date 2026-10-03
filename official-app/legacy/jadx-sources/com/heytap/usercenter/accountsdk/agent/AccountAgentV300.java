package com.heytap.usercenter.accountsdk.agent;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.usercenter.accountsdk.helper.AccountPrefUtils;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.nearme.aidl.UserEntity;
import com.oplus.aiunit.vision.nm;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV300 implements IAccountDelegate {
    private static final String TAG = "AccountAgentV300";

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public void clearCache() {
    }

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public IpcAccountEntity ipcEntity(@NonNull String str) {
        UserEntity userEntity = AccountPrefUtils.getUserEntity(BaseApp.mContext, null);
        if (userEntity == null) {
            UCLogUtil.i(nm.SDK_TAG, "AccountAgentV300ipc data is null");
            return null;
        }
        IpcAccountEntity ipcAccountEntity = new IpcAccountEntity();
        ipcAccountEntity.authToken = userEntity.getAuthToken();
        ipcAccountEntity.accountName = userEntity.getUsername();
        return ipcAccountEntity;
    }

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public boolean isLogin(@NonNull @NotNull String str) {
        IpcAccountEntity ipcAccountEntityIpcEntity = ipcEntity(str);
        return (ipcAccountEntityIpcEntity == null || TextUtils.isEmpty(ipcAccountEntityIpcEntity.authToken) || TextUtils.isEmpty(ipcAccountEntityIpcEntity.accountName)) ? false : true;
    }
}
