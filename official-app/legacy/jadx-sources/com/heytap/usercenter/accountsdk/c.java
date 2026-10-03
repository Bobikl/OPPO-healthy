package com.heytap.usercenter.accountsdk;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.usercenter.accountsdk.agent.IAccountDelegate;
import com.heytap.usercenter.accountsdk.model.IpcAccountEntity;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.aiunit.vision.nm;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c implements IAccountDelegate {
    public static final String[] ACCOUNT_PROJECTION = {AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "authToken"};
    protected Uri ACCOUNT_URI;

    public ContentProviderClient acquireContentProviderClient(Context context) {
        this.ACCOUNT_URI = Uri.parse(UCAccountXor8Provider.getProviderUrlUsercenterOpOpenXor8() + "/DBAccountEntity");
        return Version.hasJellyBean() ? context.getContentResolver().acquireUnstableContentProviderClient(this.ACCOUNT_URI) : context.getContentResolver().acquireContentProviderClient(this.ACCOUNT_URI);
    }

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public void clearCache() {
    }

    public abstract IpcAccountEntity constructByCursor(Cursor cursor);

    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[PHI: r2 r9
  0x00c9: PHI (r2v6 ??) = (r2v20 ??), (r2v21 ??) binds: [B:37:0x00c7, B:15:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r9v4 android.content.ContentProviderClient) = (r9v3 android.content.ContentProviderClient), (r9v6 android.content.ContentProviderClient) binds: [B:37:0x00c7, B:15:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.heytap.usercenter.accountsdk.model.IpcAccountEntity] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public IpcAccountEntity defaultIpcHandle(@NonNull String str) throws Throwable {
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
        ?? r3;
        boolean z;
        Context context = BaseApp.mContext;
        ?? ConstructByCursor = 0;
        ConstructByCursor = 0;
        ConstructByCursor = 0;
        ConstructByCursor = 0;
        ConstructByCursor = 0;
        try {
            contentProviderClientAcquireContentProviderClient = acquireContentProviderClient(context);
            try {
                Cursor cursorQuery = contentProviderClientAcquireContentProviderClient != null ? contentProviderClientAcquireContentProviderClient.query(this.ACCOUNT_URI, queryProjection(), queryAccountCondition(), null, null) : context.getContentResolver().query(this.ACCOUNT_URI, queryProjection(), queryAccountCondition(), null, null);
                try {
                    ConstructByCursor = constructByCursor(cursorQuery);
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception e2) {
                            UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err2 = " + e2.getMessage());
                        }
                    }
                    if (contentProviderClientAcquireContentProviderClient != null) {
                        if (Version.hasN()) {
                            ConstructByCursor = ConstructByCursor;
                            ConstructByCursor = ConstructByCursor;
                            ConstructByCursor = ConstructByCursor;
                            ConstructByCursor = ConstructByCursor;
                            contentProviderClientAcquireContentProviderClient.close();
                        } else {
                            ConstructByCursor = ConstructByCursor;
                            ConstructByCursor = ConstructByCursor;
                            ConstructByCursor = ConstructByCursor;
                            ConstructByCursor = ConstructByCursor;
                            contentProviderClientAcquireContentProviderClient.release();
                        }
                    }
                } catch (Exception e3) {
                    r3 = cursorQuery;
                    e = e3;
                    try {
                        UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err = " + e.getMessage());
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (Exception e4) {
                                UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err2 = " + e4.getMessage());
                            }
                        }
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            if (Version.hasN()) {
                                ConstructByCursor = ConstructByCursor;
                                ConstructByCursor = ConstructByCursor;
                                ConstructByCursor = ConstructByCursor;
                                ConstructByCursor = ConstructByCursor;
                                contentProviderClientAcquireContentProviderClient.close();
                            }
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
                        UCLogUtil.i(nm.SDK_TAG, sb.toString());
                        return ConstructByCursor;
                    } catch (Throwable th) {
                        th = th;
                        ConstructByCursor = r3;
                        if (ConstructByCursor != 0) {
                            try {
                                ConstructByCursor.close();
                            } catch (Exception e5) {
                                UCLogUtil.e(nm.SDK_TAG, name() + " constructByCursor err2 = " + e5.getMessage());
                            }
                        }
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            throw th;
                        }
                        if (Version.hasN()) {
                            contentProviderClientAcquireContentProviderClient.close();
                            throw th;
                        }
                        contentProviderClientAcquireContentProviderClient.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    ConstructByCursor = cursorQuery;
                    th = th2;
                    if (ConstructByCursor != 0) {
                        ConstructByCursor.close();
                    }
                    if (contentProviderClientAcquireContentProviderClient != null) {
                        throw th;
                    }
                    if (Version.hasN()) {
                        contentProviderClientAcquireContentProviderClient.close();
                        throw th;
                    }
                    contentProviderClientAcquireContentProviderClient.release();
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
            contentProviderClientAcquireContentProviderClient = null;
        } catch (Throwable th4) {
            th = th4;
            contentProviderClientAcquireContentProviderClient = null;
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
        UCLogUtil.i(nm.SDK_TAG, sb2.toString());
        return ConstructByCursor;
    }

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public IpcAccountEntity ipcEntity(@NonNull String str) throws Throwable {
        IpcAccountEntity ipcAccountEntityDefaultIpcHandle = defaultIpcHandle(str);
        if (ipcAccountEntityDefaultIpcHandle == null || TextUtils.isEmpty(ipcAccountEntityDefaultIpcHandle.authToken)) {
            return null;
        }
        return ipcAccountEntityDefaultIpcHandle;
    }

    @Override // com.heytap.usercenter.accountsdk.agent.IAccountDelegate
    public boolean isLogin(@NonNull String str) throws Throwable {
        IpcAccountEntity ipcAccountEntityIpcEntity = ipcEntity(str);
        return (ipcAccountEntityIpcEntity == null || TextUtils.isEmpty(ipcAccountEntityIpcEntity.accountName) || TextUtils.isEmpty(ipcAccountEntityIpcEntity.authToken)) ? false : true;
    }

    public abstract String name();

    public abstract String queryAccountCondition();

    public abstract String[] queryProjection();
}
