package com.oplus.accountsdk.service.old.heytap.agent;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.old.heytap.bean.AcUserEntity;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;
import com.oplus.accountsdk.service.old.heytap.utils.AccountEntityLocalUtil;
import com.oplus.aiunit.vision.wl9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV300 implements wl9 {
    private static final String TAG = "AcAgentV300";

    @Override // com.oplus.aiunit.vision.wl9
    public void clearCache() {
    }

    @Override // com.oplus.aiunit.vision.wl9
    public IpcAccountEntity ipcEntity(@NonNull Context context) {
        AcUserEntity userEntity = AccountEntityLocalUtil.getUserEntity(context, null);
        if (userEntity == null) {
            AcLogUtil.i(TAG, "ipc data is null");
            return null;
        }
        IpcAccountEntity ipcAccountEntity = new IpcAccountEntity();
        ipcAccountEntity.authToken = userEntity.getAuthToken();
        ipcAccountEntity.accountName = userEntity.getUsername();
        return ipcAccountEntity;
    }

    @Override // com.oplus.aiunit.vision.wl9
    public boolean isLogin(@NonNull @NotNull Context context) {
        IpcAccountEntity ipcAccountEntityIpcEntity = ipcEntity(context);
        return (ipcAccountEntityIpcEntity == null || TextUtils.isEmpty(ipcAccountEntityIpcEntity.authToken) || TextUtils.isEmpty(ipcAccountEntityIpcEntity.accountName)) ? false : true;
    }
}
