package com.heytap.usercenter.accountsdk.agent;

import android.database.Cursor;
import com.heytap.usercenter.accountsdk.c;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV320 extends c {
    private static final String TAG = "AccountAgentV320";
    private final String[] queryFields;

    public AccountAgentV320() {
        String[] strArr = c.ACCOUNT_PROJECTION;
        this.queryFields = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            this.queryFields[i] = str;
            i++;
        }
    }

    @Override // com.heytap.usercenter.accountsdk.c
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

    @Override // com.heytap.usercenter.accountsdk.c
    public String name() {
        return TAG;
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String queryAccountCondition() {
        return String.format("%s AND %s", String.format("(%s is not null)", this.queryFields[0]), String.format("(%s is not null)", this.queryFields[1]));
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String[] queryProjection() {
        return this.queryFields;
    }
}
