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
public class AccountAgentEuV70300 extends AccountAgentV574 {
    private static final String TAG = "AcAgentEuV70300";
    private final String[] queryTokenFields;
    private final String[] queryUserFields;

    public AccountAgentEuV70300() {
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

    private void transCursorByToken(Cursor cursor, @NonNull IpcAccountEntity ipcAccountEntity) {
        if (cursor == null || cursor.getCount() < 1) {
            return;
        }
        cursor.moveToFirst();
        ipcAccountEntity.accountName = cursor.getString(cursor.getColumnIndex(this.queryTokenFields[0]));
        ipcAccountEntity.authToken = cursor.getString(cursor.getColumnIndex(this.queryTokenFields[1]));
    }

    private void transCursorByUserInfo(Cursor cursor, @NonNull IpcAccountEntity ipcAccountEntity) {
        if (cursor != null) {
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
    }

    @Override // com.oplus.accountsdk.service.old.heytap.agent.AccountAgentV574, com.oplus.aiunit.vision.gek
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #6 {Exception -> 0x0086, blocks: (B:20:0x0082, B:24:0x008a), top: B:82:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[PHI: r4 r6 r12 r13
  0x00ad: PHI (r4v11 ??) = (r4v8 ??), (r4v19 ??) binds: [B:50:0x0115, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r6v7 ??) = (r6v5 ??), (r6v15 ??) binds: [B:50:0x0115, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r12v7 android.content.ContentProviderClient) = (r12v5 android.content.ContentProviderClient), (r12v8 android.content.ContentProviderClient) binds: [B:50:0x0115, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r13v5 android.database.Cursor) = (r13v3 android.database.Cursor), (r13v11 android.database.Cursor) binds: [B:50:0x0115, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4 A[Catch: Exception -> 0x00f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f0, blocks: (B:43:0x00ec, B:47:0x00f4), top: B:76:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:58:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0150 A[Catch: Exception -> 0x014c, TRY_LEAVE, TryCatch #3 {Exception -> 0x014c, blocks: (B:66:0x0148, B:70:0x0150), top: B:80:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.oplus.accountsdk.service.old.heytap.agent.AccountAgentEuV70300] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.oplus.aiunit.vision.gek
    public IpcAccountEntity defaultIpcHandle(@NonNull Context context) throws Throwable {
        Throwable th;
        ?? r4;
        ContentProviderClient contentProviderClientA;
        ?? ipcAccountEntity;
        Cursor cursorQuery;
        ?? r5;
        ?? r6;
        boolean z;
        Cursor cursorQuery2;
        ?? ipcAccountEntity2 = new IpcAccountEntity();
        Cursor cursor = null;
        cursor = null;
        try {
            try {
                gl glVarE = pi.e(context);
                contentProviderClientA = glVarE.a();
                try {
                    try {
                        try {
                            if (contentProviderClientA != null) {
                                cursorQuery = contentProviderClientA.query(glVarE.b(), this.queryTokenFields, queryAccountCondition(), null, null);
                                transCursorByToken(cursorQuery, ipcAccountEntity2);
                                cursorQuery2 = contentProviderClientA.query(glVarE.b(), this.queryUserFields, queryAccountCondition(), null, null);
                                ipcAccountEntity = ipcAccountEntity2;
                            } else {
                                cursorQuery = context.getContentResolver().query(glVarE.b(), this.queryTokenFields, queryAccountCondition(), null, null);
                                ipcAccountEntity = new IpcAccountEntity();
                                try {
                                    transCursorByToken(cursorQuery, ipcAccountEntity);
                                    cursorQuery2 = context.getContentResolver().query(glVarE.b(), this.queryUserFields, queryAccountCondition(), null, null);
                                    ipcAccountEntity = ipcAccountEntity;
                                } catch (Exception e2) {
                                    e = e2;
                                    ipcAccountEntity2 = 0;
                                    AcLogUtil.e(TAG, name() + " constructByCursor err = " + e.getMessage());
                                    if (cursorQuery != null) {
                                        try {
                                            cursorQuery.close();
                                            if (ipcAccountEntity2 != 0) {
                                                ipcAccountEntity2.close();
                                            }
                                        } catch (Exception e3) {
                                            ipcAccountEntity2 = new StringBuilder();
                                            ipcAccountEntity2.append(name());
                                            ipcAccountEntity2.append(" constructByCursor err2 = ");
                                            ipcAccountEntity2.append(e3.getMessage());
                                            AcLogUtil.e(TAG, ipcAccountEntity2.toString());
                                            if (contentProviderClientA != null) {
                                                contentProviderClientA.close();
                                            }
                                            r6 = TextUtils.isEmpty(ipcAccountEntity.authToken) ? 0 : ipcAccountEntity;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(name());
                                            sb.append(" constructByCursor = ");
                                            if (r6 == 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            sb.append(z);
                                            AcLogUtil.i(TAG, sb.toString());
                                            return r6;
                                        }
                                    } else if (ipcAccountEntity2 != 0) {
                                        ipcAccountEntity2.close();
                                    }
                                    if (contentProviderClientA != null) {
                                        contentProviderClientA.close();
                                    }
                                    if (TextUtils.isEmpty(ipcAccountEntity.authToken)) {
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(name());
                                    sb2.append(" constructByCursor = ");
                                    if (r6 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    sb2.append(z);
                                    AcLogUtil.i(TAG, sb2.toString());
                                    return r6;
                                }
                            }
                            ipcAccountEntity2 = cursorQuery2;
                            try {
                                transCursorByUserInfo(ipcAccountEntity2, ipcAccountEntity);
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                        if (ipcAccountEntity2 != 0) {
                                            ipcAccountEntity2.close();
                                        }
                                    } catch (Exception e4) {
                                        ipcAccountEntity2 = new StringBuilder();
                                        ipcAccountEntity2.append(name());
                                        ipcAccountEntity2.append(" constructByCursor err2 = ");
                                        ipcAccountEntity2.append(e4.getMessage());
                                        AcLogUtil.e(TAG, ipcAccountEntity2.toString());
                                    }
                                } else if (ipcAccountEntity2 != 0) {
                                    ipcAccountEntity2.close();
                                }
                                if (contentProviderClientA != null) {
                                    contentProviderClientA.close();
                                }
                            } catch (Exception e5) {
                                e = e5;
                                AcLogUtil.e(TAG, name() + " constructByCursor err = " + e.getMessage());
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                    if (ipcAccountEntity2 != 0) {
                                        ipcAccountEntity2.close();
                                    }
                                } else if (ipcAccountEntity2 != 0) {
                                    ipcAccountEntity2.close();
                                }
                                if (contentProviderClientA != null) {
                                }
                                if (TextUtils.isEmpty(ipcAccountEntity.authToken)) {
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(name());
                                sb3.append(" constructByCursor = ");
                                if (r6 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sb3.append(z);
                                AcLogUtil.i(TAG, sb3.toString());
                                return r6;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            ipcAccountEntity = ipcAccountEntity2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = 0;
                        cursor = cursorQuery;
                        r4 = r5;
                        if (cursor != null) {
                            try {
                                cursor.close();
                                if (r4 != 0) {
                                    r4.close();
                                }
                            } catch (Exception e7) {
                                AcLogUtil.e(TAG, name() + " constructByCursor err2 = " + e7.getMessage());
                                if (contentProviderClientA == null) {
                                    throw th;
                                }
                                contentProviderClientA.close();
                                throw th;
                            }
                        } else if (r4 != 0) {
                            r4.close();
                        }
                        if (contentProviderClientA == null) {
                            throw th;
                        }
                        contentProviderClientA.close();
                        throw th;
                    }
                } catch (Exception e8) {
                    e = e8;
                    ipcAccountEntity = ipcAccountEntity2;
                    ipcAccountEntity2 = 0;
                    cursorQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    r4 = 0;
                    if (cursor != null) {
                        cursor.close();
                        if (r4 != 0) {
                            r4.close();
                        }
                    } else if (r4 != 0) {
                        r4.close();
                    }
                    if (contentProviderClientA == null) {
                        throw th;
                    }
                    contentProviderClientA.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                r5 = ipcAccountEntity2;
            }
        } catch (Exception e9) {
            e = e9;
            ipcAccountEntity = ipcAccountEntity2;
            ipcAccountEntity2 = 0;
            contentProviderClientA = null;
            cursorQuery = null;
        } catch (Throwable th5) {
            th = th5;
            r4 = 0;
            contentProviderClientA = null;
        }
        if (TextUtils.isEmpty(ipcAccountEntity.authToken)) {
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(name());
        sb4.append(" constructByCursor = ");
        if (r6 == 0) {
            z = true;
        } else {
            z = false;
        }
        sb4.append(z);
        AcLogUtil.i(TAG, sb4.toString());
        return r6;
    }

    @Override // com.oplus.accountsdk.service.old.heytap.agent.AccountAgentV574, com.oplus.aiunit.vision.gek
    public String name() {
        return TAG;
    }

    @Override // com.oplus.accountsdk.service.old.heytap.agent.AccountAgentV574, com.oplus.aiunit.vision.gek
    public String queryAccountCondition() {
        String[] strArr = gek.ACCOUNT_PROJECTION;
        return String.format("%s AND %s", String.format("(%s is not null)", strArr[0]), String.format("(%s is not null)", strArr[1]));
    }

    @Override // com.oplus.accountsdk.service.old.heytap.agent.AccountAgentV574, com.oplus.aiunit.vision.gek
    public String[] queryProjection() {
        return this.queryTokenFields;
    }
}
