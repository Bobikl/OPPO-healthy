package com.oplus.accountsdk.service.old.heytap.agent;

import android.database.Cursor;
import androidx.annotation.Keep;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;
import com.oplus.aiunit.vision.gek;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV320 extends gek {
    private static final String TAG = "AcAgentV320";
    private final String[] queryFields;

    public AccountAgentV320() {
        String[] strArr = gek.ACCOUNT_PROJECTION;
        this.queryFields = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            this.queryFields[i] = str;
            i++;
        }
    }

    @Override // com.oplus.aiunit.vision.gek
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        if (cursor == null || cursor.getCount() < 1) {
            return null;
        }
        cursor.moveToFirst();
        IpcAccountEntity ipcAccountEntity = new IpcAccountEntity();
        ipcAccountEntity.accountName = cursor.getString(cursor.getColumnIndex(this.queryFields[0]));
        ipcAccountEntity.authToken = cursor.getString(cursor.getColumnIndex(this.queryFields[1]));
        return ipcAccountEntity;
    }

    @Override // com.oplus.aiunit.vision.gek
    public String name() {
        return TAG;
    }

    @Override // com.oplus.aiunit.vision.gek
    public String queryAccountCondition() {
        return String.format("%s AND %s", String.format("(%s is not null)", this.queryFields[0]), String.format("(%s is not null)", this.queryFields[1]));
    }

    @Override // com.oplus.aiunit.vision.gek
    public String[] queryProjection() {
        return this.queryFields;
    }
}
