package com.oplus.accountsdk.service.old.heytap.agent;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;
import com.oplus.aiunit.vision.gek;
import com.oplus.aiunit.vision.gl;
import com.oplus.aiunit.vision.h27;
import com.oplus.aiunit.vision.pi;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV70300 extends gek {
    private static final String TAG = "AcAgentV70300";
    private final String[] queryTokenFields;
    private final String[] queryUserFields;

    public AccountAgentV70300() {
        String[] strArr = {AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "authToken"};
        String[] strArr2 = {"showUserName", "isNeed2Bind", "isNameModified", "ssoid", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "country"};
        this.queryTokenFields = new String[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            this.queryTokenFields[i] = strArr[i2];
            i++;
        }
        this.queryUserFields = new String[6];
        int i3 = 0;
        for (int i4 = 0; i4 < 6; i4++) {
            this.queryUserFields[i3] = strArr2[i4];
            i3++;
        }
    }

    private void transCursorByToken(@NonNull Cursor cursor, @NonNull IpcAccountEntity ipcAccountEntity) {
        if (cursor.getCount() >= 1) {
            cursor.moveToFirst();
            ipcAccountEntity.accountName = cursor.getString(cursor.getColumnIndex(this.queryTokenFields[0]));
            ipcAccountEntity.authToken = cursor.getString(cursor.getColumnIndex(this.queryTokenFields[1]));
        }
    }

    private void transCursorByUserInfo(@NonNull Cursor cursor, @NonNull IpcAccountEntity ipcAccountEntity) {
        if (cursor.getCount() >= 1) {
            cursor.moveToFirst();
            ipcAccountEntity.showUserName = cursor.getString(cursor.getColumnIndex(this.queryUserFields[0]));
            ipcAccountEntity.isNeed2Bind = cursor.getInt(cursor.getColumnIndex(this.queryUserFields[1])) == 1;
            ipcAccountEntity.isNameModified = cursor.getInt(cursor.getColumnIndex(this.queryUserFields[2])) == 1;
            ipcAccountEntity.ssoid = cursor.getString(cursor.getColumnIndex(this.queryUserFields[3]));
            ipcAccountEntity.avatar = cursor.getString(cursor.getColumnIndex(this.queryUserFields[4]));
            ipcAccountEntity.country = cursor.getString(cursor.getColumnIndex(this.queryUserFields[5]));
        }
    }

    @Override // com.oplus.aiunit.vision.gek
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a0 A[PHI: r5 r12
  0x00a0: PHI (r5v7 com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity) = 
  (r5v5 com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity)
  (r5v14 com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity)
 binds: [B:42:0x00ff, B:21:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r12v6 android.content.ContentProviderClient) = (r12v5 android.content.ContentProviderClient), (r12v8 android.content.ContentProviderClient) binds: [B:42:0x00ff, B:21:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.oplus.aiunit.vision.gek, com.oplus.aiunit.vision.wl9
    public IpcAccountEntity ipcEntity(@NonNull Context context) throws Throwable {
        Throwable th;
        ContentProviderClient contentProviderClientA;
        IpcAccountEntity ipcAccountEntity;
        Cursor cursorQuery;
        IpcAccountEntity ipcAccountEntity2;
        boolean z;
        String message = " constructByCursor err2 = ";
        Cursor cursor = null;
        cursor = null;
        try {
            try {
                try {
                    ipcAccountEntity = new IpcAccountEntity();
                    try {
                        gl glVarE = pi.e(context);
                        contentProviderClientA = glVarE.a();
                        try {
                            try {
                                if (contentProviderClientA != null) {
                                    transCursorByToken(contentProviderClientA.query(glVarE.b(), this.queryTokenFields, queryAccountCondition(), null, null), ipcAccountEntity);
                                    cursorQuery = contentProviderClientA.query(glVarE.b(), this.queryUserFields, queryAccountCondition(), null, null);
                                } else {
                                    cursorQuery = context.getContentResolver().query(glVarE.b(), this.queryTokenFields, queryAccountCondition(), null, null);
                                    IpcAccountEntity ipcAccountEntity3 = new IpcAccountEntity();
                                    try {
                                        transCursorByToken(cursorQuery, ipcAccountEntity3);
                                        cursorQuery = context.getContentResolver().query(glVarE.b(), this.queryUserFields, queryAccountCondition(), null, null);
                                        ipcAccountEntity = ipcAccountEntity3;
                                    } catch (Exception e2) {
                                        e = e2;
                                        ipcAccountEntity = ipcAccountEntity3;
                                        AcLogUtil.e(TAG, name() + " constructByCursor err = " + e.getMessage());
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                            } catch (Exception e3) {
                                                AcLogUtil.e(TAG, name() + message + e3.getMessage());
                                            }
                                        }
                                        if (contentProviderClientA != null) {
                                        }
                                        if (ipcAccountEntity == null) {
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(name());
                                        sb.append(" constructByCursor = ");
                                        if (ipcAccountEntity2 == null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        sb.append(z);
                                        AcLogUtil.i(TAG, sb.toString());
                                        return ipcAccountEntity2;
                                    }
                                }
                                transCursorByUserInfo(cursorQuery, ipcAccountEntity);
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                    } catch (Exception e4) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(name());
                                        sb2.append(" constructByCursor err2 = ");
                                        message = e4.getMessage();
                                        sb2.append(message);
                                        AcLogUtil.e(TAG, sb2.toString());
                                    }
                                }
                                if (contentProviderClientA != null) {
                                    contentProviderClientA.close();
                                }
                            } catch (Exception e5) {
                                e = e5;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            cursorQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e7) {
                                    AcLogUtil.e(TAG, name() + message + e7.getMessage());
                                }
                            }
                            if (contentProviderClientA == null) {
                                throw th;
                            }
                            contentProviderClientA.close();
                            throw th;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        contentProviderClientA = null;
                        cursorQuery = contentProviderClientA;
                        AcLogUtil.e(TAG, name() + " constructByCursor err = " + e.getMessage());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientA != null) {
                            contentProviderClientA.close();
                        }
                        if (ipcAccountEntity == null) {
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(name());
                        sb3.append(" constructByCursor = ");
                        if (ipcAccountEntity2 == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb3.append(z);
                        AcLogUtil.i(TAG, sb3.toString());
                        return ipcAccountEntity2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    contentProviderClientA = null;
                }
            } catch (Exception e9) {
                e = e9;
                ipcAccountEntity = null;
                contentProviderClientA = null;
            }
            ipcAccountEntity2 = (ipcAccountEntity == null && TextUtils.isEmpty(ipcAccountEntity.authToken)) ? null : ipcAccountEntity;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(name());
            sb4.append(" constructByCursor = ");
            if (ipcAccountEntity2 == null) {
                z = true;
            } else {
                z = false;
            }
            sb4.append(z);
            AcLogUtil.i(TAG, sb4.toString());
            return ipcAccountEntity2;
        } catch (Throwable th4) {
            th = th4;
            cursor = cursorQuery;
        }
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
        return this.queryTokenFields;
    }
}
