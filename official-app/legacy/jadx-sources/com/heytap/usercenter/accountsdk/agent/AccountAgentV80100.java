package com.heytap.usercenter.accountsdk.agent;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.usercenter.accountsdk.c;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.aiunit.vision.h27;
import com.oplus.aiunit.vision.nm;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgentV80100 extends c {
    private static final String TAG = "AccountAgentV80100";
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

    @Override // com.heytap.usercenter.accountsdk.c
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x014e A[PHI: r7 r13
  0x014e: PHI (r7v7 ??) = (r7v5 ??), (r7v15 ??) binds: [B:54:0x014c, B:29:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r13v6 android.content.ContentProviderClient) = (r13v5 android.content.ContentProviderClient), (r13v7 android.content.ContentProviderClient) binds: [B:54:0x014c, B:29:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0170  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.heytap.usercenter.accountsdk.agent.AccountAgentV80100, com.heytap.usercenter.accountsdk.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.heytap.usercenter.accountsdk.c
    public IpcAccountEntity defaultIpcHandle(@NonNull String str) throws Throwable {
        Throwable th;
        ?? r5;
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
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
        Context context = BaseApp.mContext;
        ?? ipcAccountEntity2 = new IpcAccountEntity();
        Cursor cursor = null;
        cursor = null;
        try {
            contentProviderClientAcquireContentProviderClient = acquireContentProviderClient(context);
            try {
                try {
                    try {
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            cursorQuery = contentProviderClientAcquireContentProviderClient.query(this.ACCOUNT_URI, this.queryTokenFields, queryAccountCondition(), null, null);
                            transCursorByToken(cursorQuery, ipcAccountEntity2);
                            cursorQuery2 = contentProviderClientAcquireContentProviderClient.query(this.ACCOUNT_URI, this.queryUserFields, queryAccountCondition(), null, null);
                            ipcAccountEntity = ipcAccountEntity2;
                        } else {
                            cursorQuery = context.getContentResolver().query(this.ACCOUNT_URI, this.queryTokenFields, queryAccountCondition(), null, null);
                            ipcAccountEntity = new IpcAccountEntity();
                            try {
                                transCursorByToken(cursorQuery, ipcAccountEntity);
                                cursorQuery2 = context.getContentResolver().query(this.ACCOUNT_URI, this.queryUserFields, queryAccountCondition(), null, null);
                                ipcAccountEntity = ipcAccountEntity;
                            } catch (Exception e2) {
                                e = e2;
                                ipcAccountEntity2 = 0;
                                UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                    } catch (Exception e3) {
                                        UCLogUtil.e(nm.SDK_TAG, name() + r8 + e3.getMessage());
                                    }
                                }
                                if (ipcAccountEntity2 != 0) {
                                    try {
                                        ipcAccountEntity2.close();
                                    } catch (Exception e4) {
                                        UCLogUtil.e(nm.SDK_TAG, name() + message + e4.getMessage());
                                    }
                                }
                                if (contentProviderClientAcquireContentProviderClient != null) {
                                    contentProviderClientAcquireContentProviderClient.close();
                                }
                                r7 = TextUtils.isEmpty(ipcAccountEntity.authToken) ? 0 : ipcAccountEntity;
                                StringBuilder sb = new StringBuilder();
                                sb.append(name());
                                sb.append(" constructByCursor = ");
                                if (r7 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sb.append(z);
                                UCLogUtil.i(nm.SDK_TAG, sb.toString());
                                return r7;
                            }
                        }
                        ipcAccountEntity2 = cursorQuery2;
                        try {
                            try {
                                transCursorByUserInfo(ipcAccountEntity2, ipcAccountEntity);
                                r8 = r8;
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                        r8 = r8;
                                    } catch (Exception e5) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(name());
                                        sb2.append("cursor1 constructByCursor err2 = ");
                                        String message2 = e5.getMessage();
                                        sb2.append(message2);
                                        UCLogUtil.e(nm.SDK_TAG, sb2.toString());
                                        r8 = message2;
                                    }
                                }
                                if (ipcAccountEntity2 != 0) {
                                    try {
                                        ipcAccountEntity2.close();
                                    } catch (Exception e6) {
                                        r8 = e6;
                                        ?? sb3 = new StringBuilder();
                                        ipcAccountEntity2 = name();
                                        sb3.append(ipcAccountEntity2);
                                        sb3.append("cursor2 constructByCursor err2 = ");
                                        message = r8.getMessage();
                                        sb3.append(message);
                                        UCLogUtil.e(nm.SDK_TAG, sb3.toString());
                                    }
                                }
                                if (contentProviderClientAcquireContentProviderClient != null) {
                                    contentProviderClientAcquireContentProviderClient.close();
                                }
                            } catch (Exception e7) {
                                e = e7;
                                UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (ipcAccountEntity2 != 0) {
                                    ipcAccountEntity2.close();
                                }
                                if (contentProviderClientAcquireContentProviderClient != null) {
                                }
                                if (TextUtils.isEmpty(ipcAccountEntity.authToken)) {
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(name());
                                sb4.append(" constructByCursor = ");
                                if (r7 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sb4.append(z);
                                UCLogUtil.i(nm.SDK_TAG, sb4.toString());
                                return r7;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = r8;
                            r6 = ipcAccountEntity2;
                            cursor = cursorQuery;
                            r3 = r4;
                            r5 = r6;
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception e8) {
                                    UCLogUtil.e(nm.SDK_TAG, name() + r3 + e8.getMessage());
                                }
                            }
                            if (r5 != 0) {
                                try {
                                    r5.close();
                                } catch (Exception e9) {
                                    UCLogUtil.e(nm.SDK_TAG, name() + message + e9.getMessage());
                                }
                            }
                            if (contentProviderClientAcquireContentProviderClient == null) {
                                throw th;
                            }
                            contentProviderClientAcquireContentProviderClient.close();
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        ipcAccountEntity = ipcAccountEntity2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r6 = 0;
                    r4 = r8;
                    cursor = cursorQuery;
                    r3 = r4;
                    r5 = r6;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r5 != 0) {
                        r5.close();
                    }
                    if (contentProviderClientAcquireContentProviderClient == null) {
                        throw th;
                    }
                    contentProviderClientAcquireContentProviderClient.close();
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                ipcAccountEntity = ipcAccountEntity2;
                ipcAccountEntity2 = 0;
                cursorQuery = null;
            } catch (Throwable th4) {
                th = th4;
                r5 = 0;
                r3 = r8;
                if (cursor != null) {
                    cursor.close();
                }
                if (r5 != 0) {
                    r5.close();
                }
                if (contentProviderClientAcquireContentProviderClient == null) {
                    throw th;
                }
                contentProviderClientAcquireContentProviderClient.close();
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            ipcAccountEntity = ipcAccountEntity2;
            ipcAccountEntity2 = 0;
            contentProviderClientAcquireContentProviderClient = null;
            cursorQuery = null;
        } catch (Throwable th5) {
            th = th5;
            r5 = 0;
            contentProviderClientAcquireContentProviderClient = null;
            r3 = r8;
        }
        if (TextUtils.isEmpty(ipcAccountEntity.authToken)) {
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(name());
        sb5.append(" constructByCursor = ");
        if (r7 == 0) {
            z = true;
        } else {
            z = false;
        }
        sb5.append(z);
        UCLogUtil.i(nm.SDK_TAG, sb5.toString());
        return r7;
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String name() {
        return TAG;
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String queryAccountCondition() {
        String[] strArr = c.ACCOUNT_PROJECTION;
        return String.format("%s AND %s", String.format("(%s is not null)", strArr[0]), String.format("(%s is not null)", strArr[1]));
    }

    @Override // com.heytap.usercenter.accountsdk.c
    public String[] queryProjection() {
        return this.queryTokenFields;
    }
}
