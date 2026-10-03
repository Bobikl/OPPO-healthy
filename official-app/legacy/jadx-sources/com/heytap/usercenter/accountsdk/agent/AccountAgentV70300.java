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
public class AccountAgentV70300 extends c {
    private static final String TAG = "AccountAgentV70300";
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

    @Override // com.heytap.usercenter.accountsdk.c
    public IpcAccountEntity constructByCursor(Cursor cursor) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[PHI: r6 r12
  0x00fd: PHI (r6v3 ??) = (r6v2 ??), (r6v8 ??) binds: [B:48:0x00fb, B:22:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x00fd: PHI (r12v5 android.content.ContentProviderClient) = (r12v4 android.content.ContentProviderClient), (r12v7 android.content.ContentProviderClient) binds: [B:48:0x00fb, B:22:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x012f: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:62:0x012e */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.heytap.usercenter.accountsdk.agent.AccountAgentV70300, com.heytap.usercenter.accountsdk.c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    @Override // com.heytap.usercenter.accountsdk.c, com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public IpcAccountEntity ipcEntity(@NonNull String str) throws Throwable {
        ?? ipcAccountEntity;
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
        Throwable th;
        Object obj;
        ?? Query;
        ?? ipcAccountEntity2;
        ?? r4;
        boolean z;
        Cursor cursorQuery;
        Context context = BaseApp.mContext;
        ?? r5 = 0;
        ?? r6 = 0;
        try {
            try {
                try {
                    ipcAccountEntity = new IpcAccountEntity();
                    try {
                        contentProviderClientAcquireContentProviderClient = acquireContentProviderClient(context);
                        try {
                            try {
                                if (contentProviderClientAcquireContentProviderClient != null) {
                                    Cursor cursorQuery2 = contentProviderClientAcquireContentProviderClient.query(this.ACCOUNT_URI, this.queryTokenFields, queryAccountCondition(), null, null);
                                    transCursorByToken(cursorQuery2, ipcAccountEntity);
                                    cursorQuery = contentProviderClientAcquireContentProviderClient.query(this.ACCOUNT_URI, this.queryUserFields, queryAccountCondition(), null, null);
                                    ipcAccountEntity2 = ipcAccountEntity;
                                    Query = cursorQuery2;
                                } else {
                                    Query = context.getContentResolver().query(this.ACCOUNT_URI, this.queryTokenFields, queryAccountCondition(), null, null);
                                    ipcAccountEntity2 = new IpcAccountEntity();
                                    try {
                                        transCursorByToken(Query, ipcAccountEntity2);
                                        cursorQuery = context.getContentResolver().query(this.ACCOUNT_URI, this.queryUserFields, queryAccountCondition(), null, null);
                                        ipcAccountEntity2 = ipcAccountEntity2;
                                        Query = Query;
                                    } catch (Exception e2) {
                                        e = e2;
                                        ipcAccountEntity = ipcAccountEntity2;
                                        UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                                        if (Query != 0) {
                                            try {
                                                Query.close();
                                            } catch (Exception e3) {
                                                UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err2 = " + e3.getMessage());
                                            }
                                        }
                                        ipcAccountEntity2 = ipcAccountEntity;
                                        if (contentProviderClientAcquireContentProviderClient != null) {
                                            contentProviderClientAcquireContentProviderClient.close();
                                        }
                                        if (ipcAccountEntity2 == 0) {
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(name());
                                        sb.append(" constructByCursor = ");
                                        if (r4 == 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        sb.append(z);
                                        UCLogUtil.i(nm.SDK_TAG, sb.toString());
                                        return r4;
                                    }
                                }
                                ipcAccountEntity = cursorQuery;
                                try {
                                    transCursorByUserInfo(ipcAccountEntity, ipcAccountEntity2);
                                    if (ipcAccountEntity != 0) {
                                        try {
                                            ipcAccountEntity.close();
                                        } catch (Exception e4) {
                                            UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err2 = " + e4.getMessage());
                                        }
                                    }
                                    if (contentProviderClientAcquireContentProviderClient != null) {
                                        contentProviderClientAcquireContentProviderClient.close();
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    Query = ipcAccountEntity;
                                    ipcAccountEntity = ipcAccountEntity2;
                                    UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                                    if (Query != 0) {
                                        Query.close();
                                    }
                                    ipcAccountEntity2 = ipcAccountEntity;
                                    if (contentProviderClientAcquireContentProviderClient != null) {
                                        contentProviderClientAcquireContentProviderClient.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r6 = ipcAccountEntity;
                                    th = th;
                                    r5 = r6;
                                    if (r5 != 0) {
                                        try {
                                            r5.close();
                                        } catch (Exception e6) {
                                            UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err2 = " + e6.getMessage());
                                        }
                                    }
                                    if (contentProviderClientAcquireContentProviderClient == null) {
                                        throw th;
                                    }
                                    contentProviderClientAcquireContentProviderClient.close();
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            Query = 0;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        contentProviderClientAcquireContentProviderClient = null;
                        ipcAccountEntity = ipcAccountEntity;
                        Query = contentProviderClientAcquireContentProviderClient;
                        UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                        if (Query != 0) {
                            Query.close();
                        }
                        ipcAccountEntity2 = ipcAccountEntity;
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient.close();
                        }
                        if (ipcAccountEntity2 == 0) {
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(name());
                        sb2.append(" constructByCursor = ");
                        if (r4 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb2.append(z);
                        UCLogUtil.i(nm.SDK_TAG, sb2.toString());
                        return r4;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r5 = obj;
                }
            } catch (Throwable th5) {
                th = th5;
                contentProviderClientAcquireContentProviderClient = null;
            }
        } catch (Exception e10) {
            e = e10;
            ipcAccountEntity = 0;
            contentProviderClientAcquireContentProviderClient = null;
        }
        r4 = (ipcAccountEntity2 == 0 && TextUtils.isEmpty(ipcAccountEntity2.authToken)) ? 0 : ipcAccountEntity2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(name());
        sb3.append(" constructByCursor = ");
        if (r4 == 0) {
            z = true;
        } else {
            z = false;
        }
        sb3.append(z);
        UCLogUtil.i(nm.SDK_TAG, sb3.toString());
        return r4;
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
