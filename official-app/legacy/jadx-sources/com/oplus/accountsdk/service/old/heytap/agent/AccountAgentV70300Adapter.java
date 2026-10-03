package com.oplus.accountsdk.service.old.heytap.agent;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;
import com.oplus.aiunit.vision.gek;
import com.oplus.aiunit.vision.wl9;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV70300Adapter extends gek {
    private static final String TAG = "AcAgentV70300Adapter";
    private final wl9 mAgent = new AccountAgentV70300();
    private final wl9 mAgentEu = new AccountAgentEuV70300();

    @Override // com.oplus.aiunit.vision.gek
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        throw new UnsupportedOperationException("do not operator");
    }

    @Override // com.oplus.aiunit.vision.gek, com.oplus.aiunit.vision.wl9
    public IpcAccountEntity ipcEntity(@NonNull @NotNull Context context) {
        IpcAccountEntity ipcAccountEntityIpcEntity = this.mAgent.ipcEntity(context);
        return ipcAccountEntityIpcEntity != null ? ipcAccountEntityIpcEntity : this.mAgentEu.ipcEntity(context);
    }

    @Override // com.oplus.aiunit.vision.gek
    public String name() {
        return TAG;
    }

    @Override // com.oplus.aiunit.vision.gek
    public String queryAccountCondition() {
        throw new UnsupportedOperationException("do not operator");
    }

    @Override // com.oplus.aiunit.vision.gek
    public String[] queryProjection() {
        throw new UnsupportedOperationException("do not operator");
    }
}
