package com.heytap.usercenter.accountsdk.agent;

import androidx.annotation.NonNull;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;

/* JADX INFO: loaded from: classes19.dex */
public interface IAccountDelegate {
    void clearCache();

    IpcAccountEntity ipcEntity(@NonNull String str);

    boolean isLogin(@NonNull String str);
}
