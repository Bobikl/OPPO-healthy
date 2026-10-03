package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity;

/* JADX INFO: loaded from: classes19.dex */
public abstract class gek implements wl9 {
    public static final String[] ACCOUNT_PROJECTION = {AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "authToken"};
    private static final String SDK_TAG = "UCAccountProviderHelper";

    @Override // com.oplus.aiunit.vision.wl9
    public void clearCache() {
    }

    public abstract IpcAccountEntity constructByCursor(Cursor cursor);

    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.oplus.accountsdk.service.old.heytap.bean.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public IpcAccountEntity defaultIpcHandle(@NonNull Context context) throws Throwable {
        ContentProviderClient contentProviderClientA;
        ?? r3;
        boolean z;
        ?? ConstructByCursor = 0;
        ConstructByCursor = 0;
        ConstructByCursor = 0;
        ConstructByCursor = 0;
        ConstructByCursor = 0;
        try {
            gl glVarE = pi.e(context);
            contentProviderClientA = glVarE.a();
            try {
                Cursor cursorQuery = contentProviderClientA != null ? contentProviderClientA.query(glVarE.b(), queryProjection(), queryAccountCondition(), null, null) : context.getContentResolver().query(glVarE.b(), queryProjection(), queryAccountCondition(), null, null);
                try {
                    ConstructByCursor = constructByCursor(cursorQuery);
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception e2) {
                            AcLogUtil.e(SDK_TAG, name() + " constructByCursor err2 = " + e2.getMessage());
                        }
                    }
                    if (contentProviderClientA != null) {
                        contentProviderClientA.close();
                    }
                } catch (Exception e3) {
                    r3 = cursorQuery;
                    e = e3;
                    try {
                        AcLogUtil.e(SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (Exception e4) {
                                AcLogUtil.e(SDK_TAG, name() + " constructByCursor err2 = " + e4.getMessage());
                            }
                        }
                        if (contentProviderClientA != null) {
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(name());
                        sb.append(" constructByCursor = ");
                        if (ConstructByCursor == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        AcLogUtil.i(SDK_TAG, sb.toString());
                        return ConstructByCursor;
                    } catch (Throwable th) {
                        th = th;
                        ConstructByCursor = r3;
                        if (ConstructByCursor != 0) {
                            try {
                                ConstructByCursor.close();
                            } catch (Exception e5) {
                                AcLogUtil.e(SDK_TAG, name() + " constructByCursor err2 = " + e5.getMessage());
                            }
                        }
                        if (contentProviderClientA != null) {
                            throw th;
                        }
                        contentProviderClientA.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    ConstructByCursor = cursorQuery;
                    th = th2;
                    if (ConstructByCursor != 0) {
                        ConstructByCursor.close();
                    }
                    if (contentProviderClientA != null) {
                        throw th;
                    }
                    contentProviderClientA.close();
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                r3 = ConstructByCursor;
                ConstructByCursor = ConstructByCursor;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
            r3 = 0;
            contentProviderClientA = null;
        } catch (Throwable th4) {
            th = th4;
            contentProviderClientA = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append(" constructByCursor = ");
        if (ConstructByCursor == 0) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        AcLogUtil.i(SDK_TAG, sb2.toString());
        return ConstructByCursor;
    }

    @Override // com.oplus.aiunit.vision.wl9
    public IpcAccountEntity ipcEntity(@NonNull Context context) throws Throwable {
        IpcAccountEntity ipcAccountEntityDefaultIpcHandle = defaultIpcHandle(context);
        if (ipcAccountEntityDefaultIpcHandle == null || TextUtils.isEmpty(ipcAccountEntityDefaultIpcHandle.authToken)) {
            return null;
        }
        return ipcAccountEntityDefaultIpcHandle;
    }

    @Override // com.oplus.aiunit.vision.wl9
    public boolean isLogin(Context context) throws Throwable {
        IpcAccountEntity ipcAccountEntityIpcEntity = ipcEntity(context);
        return (ipcAccountEntityIpcEntity == null || TextUtils.isEmpty(ipcAccountEntityIpcEntity.accountName) || TextUtils.isEmpty(ipcAccountEntityIpcEntity.authToken)) ? false : true;
    }

    public abstract String name();

    public abstract String queryAccountCondition();

    public abstract String[] queryProjection();
}
