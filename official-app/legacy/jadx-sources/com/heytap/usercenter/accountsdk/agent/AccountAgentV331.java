package com.heytap.usercenter.accountsdk.agent;

import android.database.Cursor;
import com.heytap.usercenter.accountsdk.c;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.oplus.aiunit.vision.nm;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV331 extends c {
    private static final String TAG = "AccountAgentV331";
    private final String[] queryFields;

    public AccountAgentV331() {
        String[] strArr = {"showUserName", "isNeed2Bind", "isNameModified"};
        String[] strArr2 = c.ACCOUNT_PROJECTION;
        this.queryFields = new String[strArr2.length + 3];
        int i = 0;
        for (String str : strArr2) {
            this.queryFields[i] = str;
            i++;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            this.queryFields[i] = strArr[i2];
            i++;
        }
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        boolean z = true;
        if (cursor.getCount() < 1) {
            return null;
        }
        cursor.moveToFirst();
        IpcAccountEntity ipcAccountEntity = new IpcAccountEntity();
        ipcAccountEntity.accountName = cursor.getString(cursor.getColumnIndex(this.queryFields[0]));
        ipcAccountEntity.authToken = cursor.getString(cursor.getColumnIndex(this.queryFields[1]));
        try {
            ipcAccountEntity.showUserName = cursor.getString(cursor.getColumnIndex(this.queryFields[2]));
            ipcAccountEntity.isNeed2Bind = cursor.getInt(cursor.getColumnIndex(this.queryFields[3])) == 1;
            if (cursor.getInt(cursor.getColumnIndex(this.queryFields[4])) != 1) {
                z = false;
            }
            ipcAccountEntity.isNameModified = z;
        } catch (Exception e2) {
            UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e2.getMessage());
        }
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
