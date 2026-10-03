package com.heytap.usercenter.accountsdk;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.heytap.usercenter.accountsdk.helper.Constants;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.aiunit.vision.h27;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Deprecated
public class AccountNameAgent {
    private static final String[] ACCOUNTNAME_PROJECTION = {"isNeed2Bind", "isNameModified", "showUserName", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, h27.FAMILY_KEY_PUSH_FRIEND_AVATAR};
    private static final String[] ACCOUNTNAME_PROJECTION2 = {"isNeed2Bind", "isNameModified", "showUserName", AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY};
    private static final String TAG = "AccountNameAgent";

    public static ContentProviderClient acquireContentProviderClient(Context context, Uri uri) {
        return Version.hasJellyBean() ? context.getContentResolver().acquireUnstableContentProviderClient(uri) : context.getContentResolver().acquireContentProviderClient(uri);
    }

    private static AccountResult constructByCursor(Cursor cursor) {
        AccountResult accountResult = new AccountResult();
        if (cursor == null || cursor.getCount() < 1) {
            accountResult.setCanJump2Bind(false);
            accountResult.setOldUserName(null);
            accountResult.setResultCode(Constants.REQ_NO_SUPPORT_ACCOUNTNAME);
            accountResult.setResultMsg("usercenter low version");
        } else {
            cursor.moveToFirst();
            String[] strArr = ACCOUNTNAME_PROJECTION;
            accountResult.setNeedBind(values(cursor.getInt(cursor.getColumnIndex(strArr[0]))));
            accountResult.setNameModified(values(cursor.getInt(cursor.getColumnIndex(strArr[1]))));
            accountResult.setAccountName(cursor.getString(cursor.getColumnIndex(strArr[2])));
            accountResult.setOldUserName(cursor.getString(cursor.getColumnIndex(strArr[3])));
            if (cursor.getColumnIndex(strArr[4]) >= 0) {
                accountResult.setAvatar(cursor.getString(cursor.getColumnIndex(strArr[4])));
            }
            accountResult.setCanJump2Bind(true);
            accountResult.setResultCode(30001001);
            accountResult.setResultMsg("success");
        }
        return accountResult;
    }

    private static String getCondition() {
        String[] strArr = ACCOUNTNAME_PROJECTION;
        return String.format("%s AND %s", String.format("(%s is not null)", strArr[3]), String.format("(%s is not null)", strArr[2]));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    private static AccountResult queryAccountResult(Context context) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        Uri uri = com.accountbase.b.b;
        ContentProviderClient contentProviderClientAcquireContentProviderClient = acquireContentProviderClient(context, uri);
        Cursor cursor2 = null;
        try {
            if (contentProviderClientAcquireContentProviderClient != null) {
                cursorQuery2 = contentProviderClientAcquireContentProviderClient.query(uri, ACCOUNTNAME_PROJECTION, getCondition(), null, null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("queryAccountResult Failed to acquireContentProviderClient and try query directly for ");
                String[] strArr = ACCOUNTNAME_PROJECTION;
                sb.append(strArr);
                UCLogUtil.e(sb.toString());
                cursorQuery2 = context.getContentResolver().query(uri, strArr, getCondition(), null, null);
            }
            cursor = cursorQuery2;
            try {
                try {
                    AccountResult accountResultConstructByCursor = constructByCursor(cursor);
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused) {
                        }
                    }
                    if (contentProviderClientAcquireContentProviderClient != null) {
                        contentProviderClientAcquireContentProviderClient.close();
                    }
                    return accountResultConstructByCursor;
                } catch (Exception e2) {
                    e = e2;
                    UCLogUtil.e(TAG, e.toString());
                    try {
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            cursorQuery = contentProviderClientAcquireContentProviderClient.query(com.accountbase.b.b, ACCOUNTNAME_PROJECTION2, getCondition(), null, null);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("queryAccountResult Failed to acquireContentProviderClient and try query directly for ");
                            String[] strArr2 = ACCOUNTNAME_PROJECTION2;
                            sb2.append(strArr2);
                            UCLogUtil.e(sb2.toString());
                            cursorQuery = context.getContentResolver().query(com.accountbase.b.b, strArr2, getCondition(), null, null);
                        }
                        cursor = cursorQuery;
                        AccountResult accountResultConstructByCursor2 = constructByCursor(cursor);
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient.close();
                        }
                        return accountResultConstructByCursor2;
                    } catch (Exception e3) {
                        UCLogUtil.e(e3.toString());
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (contentProviderClientAcquireContentProviderClient != null) {
                            contentProviderClientAcquireContentProviderClient.close();
                        }
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    try {
                        cursor2.close();
                    } catch (Exception unused4) {
                    }
                }
                if (contentProviderClientAcquireContentProviderClient != null) {
                    throw th;
                }
                contentProviderClientAcquireContentProviderClient.close();
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            if (contentProviderClientAcquireContentProviderClient != null) {
                throw th;
            }
            contentProviderClientAcquireContentProviderClient.close();
            throw th;
        }
    }

    public static AccountResult queryFromDB(Context context) {
        return queryAccountResult(context);
    }

    private static boolean values(int i) {
        return i == 1;
    }
}
