package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;

/* JADX INFO: loaded from: classes19.dex */
public interface wl9 {
    void clearCache();

    IpcAccountEntity ipcEntity(@NonNull Context context);

    boolean isLogin(@NonNull Context context);
}
