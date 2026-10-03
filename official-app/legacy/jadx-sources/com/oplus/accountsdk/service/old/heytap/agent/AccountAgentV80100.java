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
import com.oplus.aiunit.vision.nm;
import com.oplus.aiunit.vision.pi;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV80100 extends gek {
    private static final String TAG = "AcAgentV80100";
    private final String[] queryTokenFields;
    private final String[] queryUserFields;

    public AccountAgentV80100() {
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

    @Override // com.oplus.aiunit.vision.gek
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce A[PHI: r2 r3 r5 r7 r13 r14
  0x00ce: PHI (r2v8 java.lang.String) = (r2v6 java.lang.String), (r2v12 java.lang.String) binds: [B:54:0x0159, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r3v12 ??) = (r3v10 ??), (r3v18 ??) binds: [B:54:0x0159, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r5v10 ??) = (r5v8 ??), (r5v19 ??) binds: [B:54:0x0159, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r7v7 ??) = (r7v5 ??), (r7v15 ??) binds: [B:54:0x0159, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r13v7 android.content.ContentProviderClient) = (r13v5 android.content.ContentProviderClient), (r13v8 android.content.ContentProviderClient) binds: [B:54:0x0159, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r14v5 android.database.Cursor) = (r14v3 android.database.Cursor), (r14v11 android.database.Cursor) binds: [B:54:0x0159, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.oplus.accountsdk.service.old.heytap.agent.AccountAgentV80100] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.oplus.aiunit.vision.gek
    public IpcAccountEntity defaultIpcHandle(@NonNull Context context) throws Throwable {
        Throwable th;
        ?? r5;
        ContentProviderClient contentProviderClientA;
        ?? ipcAccountEntity;
        Cursor cursorQuery;
        ?? r3;
        ?? r6;
        ?? r4;
        ?? r7;
        boolean z;
        Cursor cursorQuery2;
        String message = "cursor2 constructByCursor err2 = ";
        ?? r8 = "cursor1 constructByCursor err2 = ";
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
                                    AcLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                                    r8 = r8;
                                    if (cursorQuery != null) {
                                        try {
                                            cursorQuery.close();
                                            r8 = r8;
                                        } catch (Exception e3) {
                                            ?? sb = new StringBuilder();
                                            sb.append(name());
                                            sb.append(r8);
                                            String message2 = e3.getMessage();
                                            sb.append(message2);
                                            AcLogUtil.e(TAG, sb.toString());
                                            r8 = message2;
                                        }
                                    }
                                    if (ipcAccountEntity2 != 0) {
                                        try {
                                            ipcAccountEntity2.close();
                                        } catch (Exception e4) {
                                            r8 = e4;
                                            ?? sb2 = new StringBuilder();
                                            ipcAccountEntity2 = name();
                                            sb2.append(ipcAccountEntity2);
                                            sb2.append(message);
                                            message = r8.getMessage();
                                            sb2.append(message);
                                            AcLogUtil.e(TAG, sb2.toString());
                                        }
                                    }
                                    if (contentProviderClientA != null) {
                                        contentProviderClientA.close();
                                    }
                                    r7 = TextUtils.isEmpty(ipcAccountEntity.authToken) ? 0 : ipcAccountEntity;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(name());
                                    sb3.append(" constructByCursor = ");
                                    if (r7 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    sb3.append(z);
                                    AcLogUtil.i(TAG, sb3.toString());
                                    return r7;
                                }
                            }
                            ipcAccountEntity2 = cursorQuery2;
                            try {
                                transCursorByUserInfo(ipcAccountEntity2, ipcAccountEntity);
                                r8 = r8;
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                        r8 = r8;
                                    } catch (Exception e5) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(name());
                                        sb4.append("cursor1 constructByCursor err2 = ");
                                        String message3 = e5.getMessage();
                                        sb4.append(message3);
                                        AcLogUtil.e(TAG, sb4.toString());
                                        r8 = message3;
                                    }
                                }
                                if (ipcAccountEntity2 != 0) {
                                    try {
                                        ipcAccountEntity2.close();
                                    } catch (Exception e6) {
                                        r8 = e6;
                                        ?? sb5 = new StringBuilder();
                                        ipcAccountEntity2 = name();
                                        sb5.append(ipcAccountEntity2);
                                        sb5.append("cursor2 constructByCursor err2 = ");
                                        message = r8.getMessage();
                                        sb5.append(message);
                                        AcLogUtil.e(TAG, sb5.toString());
                                    }
                                }
                                if (contentProviderClientA != null) {
                                    contentProviderClientA.close();
                                }
                            } catch (Exception e7) {
                                e = e7;
                                AcLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                                r8 = r8;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                    r8 = r8;
                                }
                                if (ipcAccountEntity2 != 0) {
                                    ipcAccountEntity2.close();
                                }
                                if (contentProviderClientA != null) {
                                }
                                if (TextUtils.isEmpty(ipcAccountEntity.authToken)) {
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(name());
                                sb6.append(" constructByCursor = ");
                                if (r7 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sb6.append(z);
                                AcLogUtil.i(TAG, sb6.toString());
                                return r7;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r6 = 0;
                            r4 = r8;
                            cursor = cursorQuery;
                            r3 = r4;
                            r5 = r6;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e8) {
                                    AcLogUtil.e(TAG, name() + r3 + e8.getMessage());
                                }
                            }
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (Exception e9) {
                                    AcLogUtil.e(TAG, name() + message + e9.getMessage());
                                }
                            }
                            if (contentProviderClientA != null) {
                                throw th;
                            }
                            contentProviderClientA.close();
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        ipcAccountEntity = ipcAccountEntity2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    ipcAccountEntity = ipcAccountEntity2;
                    ipcAccountEntity2 = 0;
                    cursorQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    r5 = 0;
                    r3 = r8;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r5 != 0) {
                        r5.close();
                    }
                    if (contentProviderClientA != null) {
                        throw th;
                    }
                    contentProviderClientA.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                r4 = r8;
                r6 = ipcAccountEntity2;
            }
        } catch (Exception e12) {
            e = e12;
            ipcAccountEntity = ipcAccountEntity2;
            ipcAccountEntity2 = 0;
            contentProviderClientA = null;
            cursorQuery = null;
        } catch (Throwable th5) {
            th = th5;
            r5 = 0;
            contentProviderClientA = null;
            r3 = r8;
        }
        if (TextUtils.isEmpty(ipcAccountEntity.authToken)) {
        }
        StringBuilder sb7 = new StringBuilder();
        sb7.append(name());
        sb7.append(" constructByCursor = ");
        if (r7 == 0) {
            z = true;
        } else {
            z = false;
        }
        sb7.append(z);
        AcLogUtil.i(TAG, sb7.toString());
        return r7;
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
