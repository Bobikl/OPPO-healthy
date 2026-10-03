package com.heytap.usercenter.accountsdk.agent;

import android.database.Cursor;
import androidx.annotation.NonNull;
import com.heytap.usercenter.accountsdk.c;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.platform.usercenter.basic.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentAdapter extends c {
    private static final String TAG = "AccountAgentVAccountAdapter";
    private final IAccountDelegate mAgent = new AccountAgentVAccount();

    @Override // com.heytap.usercenter.accountsdk.c
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        throw new UnsupportedOperationException("do not operator");
    }

    @Override // com.heytap.usercenter.accountsdk.c, com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public IpcAccountEntity ipcEntity(@NonNull @NotNull String str) {
        return this.mAgent.ipcEntity(str);
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String name() {
        return TAG;
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String queryAccountCondition() {
        throw new UnsupportedOperationException("do not operator");
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String[] queryProjection() {
        throw new UnsupportedOperationException("do not operator");
    }
}
