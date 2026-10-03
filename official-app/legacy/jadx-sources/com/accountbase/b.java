package com.accountbase;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.heytap.usercenter.accountsdk.helper.AccountHelper;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class b {
    private static final String a;
    public static final Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f465c;
    private static final String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f466e;

    static {
        String providerUrlUsercenterOpOpenXor8 = UCAccountXor8Provider.getProviderUrlUsercenterOpOpenXor8();
        a = providerUrlUsercenterOpOpenXor8;
        b = Uri.parse(providerUrlUsercenterOpOpenXor8 + "/DBAccountEntity");
        f465c = new String[]{AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "authToken"};
        d = new String[]{AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, "authToken", "ssoid"};
        f466e = new String[]{"country"};
    }

    private static ContentProviderClient a(Context context, Uri uri) {
        return Version.hasJellyBean() ? context.getContentResolver().acquireUnstableContentProviderClient(uri) : context.getContentResolver().acquireContentProviderClient(uri);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[PHI: r1 r2
  0x00b4: PHI (r1v5 ??) = (r1v4 ??), (r1v10 ??) binds: [B:36:0x00b2, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r2v5 android.content.ContentProviderClient) = (r2v4 android.content.ContentProviderClient), (r2v9 android.content.ContentProviderClient) binds: [B:36:0x00b2, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.heytap.usercenter.accountsdk.model.AccountEntity] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.heytap.usercenter.accountsdk.model.AccountEntity] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v6 */
    private static AccountEntity b(Context context) throws Throwable {
        ContentProviderClient contentProviderClientA;
        ?? Query;
        ?? A = 0;
        A = 0;
        A = 0;
        A = 0;
        A = 0;
        try {
            String[] strArr = AccountHelper.getUserCenterVersionCode(context) >= 420 ? d : f465c;
            Uri uri = b;
            contentProviderClientA = a(context, uri);
            try {
                if (contentProviderClientA != null) {
                    Query = contentProviderClientA.query(uri, strArr, a(), null, null);
                } else {
                    UCLogUtil.e("queryAccount Failed to acquireContentProviderClient and try query directly for " + Arrays.toString(strArr));
                    Query = context.getContentResolver().query(uri, strArr, a(), null, null);
                }
                try {
                    try {
                        A = a(context, (Cursor) Query);
                        if (Query != 0) {
                            try {
                                Query.close();
                            } catch (Exception e2) {
                                UCLogUtil.e("AccountAgentV320 constructByCursor err2 = " + e2.getMessage());
                            }
                        }
                        if (contentProviderClientA != null) {
                            contentProviderClientA.close();
                        }
                    } catch (Exception e3) {
                        e = e3;
                        UCLogUtil.e("AccountAgentV320 constructByCursor err = " + e.getMessage());
                        if (Query != 0) {
                            try {
                                Query.close();
                            } catch (Exception e4) {
                                UCLogUtil.e("AccountAgentV320 constructByCursor err2 = " + e4.getMessage());
                            }
                        }
                        if (contentProviderClientA != null) {
                            contentProviderClientA.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    A = Query;
                    if (A != 0) {
                        try {
                            A.close();
                        } catch (Exception e5) {
                            UCLogUtil.e("AccountAgentV320 constructByCursor err2 = " + e5.getMessage());
                        }
                    }
                    if (contentProviderClientA != null) {
                        throw th;
                    }
                    contentProviderClientA.close();
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                Query = A;
            } catch (Throwable th2) {
                th = th2;
                if (A != 0) {
                    A.close();
                }
                if (contentProviderClientA != null) {
                    throw th;
                }
                contentProviderClientA.close();
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            contentProviderClientA = null;
            Query = 0;
        } catch (Throwable th3) {
            th = th3;
            contentProviderClientA = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AccountAgentV320 constructByCursor = ");
        sb.append(A == 0);
        UCLogUtil.i(sb.toString());
        return A;
    }

    public static AccountEntity a(Context context) {
        return b(context);
    }

    private static String a() {
        String[] strArr = f465c;
        return String.format("%s AND %s", String.format("(%s is not null)", strArr[0]), String.format("(%s is not null)", strArr[1]));
    }

    private static AccountEntity a(Context context, Cursor cursor) {
        if (cursor == null || cursor.getCount() < 1) {
            return null;
        }
        cursor.moveToFirst();
        AccountEntity accountEntity = new AccountEntity();
        String[] strArr = f465c;
        accountEntity.accountName = cursor.getString(cursor.getColumnIndex(strArr[0]));
        accountEntity.authToken = cursor.getString(cursor.getColumnIndex(strArr[1]));
        if (AccountHelper.getUserCenterVersionCode(context) < 420) {
            return accountEntity;
        }
        accountEntity.ssoid = cursor.getString(cursor.getColumnIndex(d[2]));
        return accountEntity;
    }
}
