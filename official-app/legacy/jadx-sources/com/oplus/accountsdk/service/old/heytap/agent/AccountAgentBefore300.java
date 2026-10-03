package com.oplus.accountsdk.service.old.heytap.agent;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.service.accountsdk.AccountService;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;
import com.oplus.aiunit.vision.nm;
import com.oplus.aiunit.vision.wl9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentBefore300 implements wl9 {
    private static final String TAG = "AcAgentBefore300";

    private static String legacyAppCode(@NonNull Context context) {
        return context.getApplicationContext().getPackageName();
    }

    @Override // com.oplus.aiunit.vision.wl9
    public void clearCache() {
    }

    @Override // com.oplus.aiunit.vision.wl9
    public IpcAccountEntity ipcEntity(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        String strLegacyAppCode = legacyAppCode(context);
        String tokenByProvider = AccountService.getTokenByProvider(applicationContext, strLegacyAppCode);
        if (TextUtils.isEmpty(tokenByProvider)) {
            AcLogUtil.i(nm.SDK_TAG, "AcAgentBefore300 ipc data is null", false);
            return null;
        }
        IpcAccountEntity ipcAccountEntity = new IpcAccountEntity();
        ipcAccountEntity.authToken = tokenByProvider;
        ipcAccountEntity.accountName = AccountService.getNameByProvider(applicationContext, strLegacyAppCode);
        return ipcAccountEntity;
    }

    @Override // com.oplus.aiunit.vision.wl9
    public boolean isLogin(@NonNull @NotNull Context context) {
        return AccountService.isLogin(context.getApplicationContext(), legacyAppCode(context));
    }
}
