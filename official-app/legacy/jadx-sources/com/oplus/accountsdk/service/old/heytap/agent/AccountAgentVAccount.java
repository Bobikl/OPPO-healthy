package com.oplus.accountsdk.service.old.heytap.agent;

import android.database.Cursor;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;
import com.oplus.aiunit.vision.gek;
import com.oplus.aiunit.vision.h27;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentVAccount extends gek {
    private static final String TAG = "AcAgentVAccount";
    private final String[] queryFields;

    public AccountAgentVAccount() {
        String[] strArr = {"showUserName", "isNeed2Bind", "isNameModified", "ssoid", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "country", "deviceId"};
        String[] strArr2 = gek.ACCOUNT_PROJECTION;
        this.queryFields = new String[strArr2.length + 7];
        int i = 0;
        for (String str : strArr2) {
            this.queryFields[i] = str;
            i++;
        }
        for (int i2 = 0; i2 < 7; i2++) {
            this.queryFields[i] = strArr[i2];
            i++;
        }
    }

    @Override // com.oplus.aiunit.vision.gek
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
            ipcAccountEntity.ssoid = cursor.getString(cursor.getColumnIndex(this.queryFields[5]));
            ipcAccountEntity.avatar = cursor.getString(cursor.getColumnIndex(this.queryFields[6]));
            ipcAccountEntity.country = cursor.getString(cursor.getColumnIndex(this.queryFields[7]));
            ipcAccountEntity.deviceId = cursor.getString(cursor.getColumnIndex(this.queryFields[8]));
        } catch (Exception e2) {
            AcLogUtil.e(TAG, name() + " constructByCursor err = " + e2.getMessage());
        }
        return ipcAccountEntity;
    }

    @Override // com.oplus.aiunit.vision.gek
    public String name() {
        return TAG;
    }

    @Override // com.oplus.aiunit.vision.gek
    public String queryAccountCondition() {
        String[] strArr = gek.ACCOUNT_PROJECTION;
        return String.format("%s AND %s", String.format("(%s is not null)", strArr[0]), String.format("(%s is not null)", strArr[1]));
    }

    @Override // com.oplus.aiunit.vision.gek
    public String[] queryProjection() {
        return this.queryFields;
    }
}
