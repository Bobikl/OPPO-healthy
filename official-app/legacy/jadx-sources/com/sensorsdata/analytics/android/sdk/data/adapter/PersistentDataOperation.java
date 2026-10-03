package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class PersistentDataOperation extends DataOperation {
    public PersistentDataOperation(Context context) {
        super(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    private int handleInsertUri(Uri uri, JSONObject jSONObject) {
        if (uri == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            String path = uri.getPath();
            if (TextUtils.isEmpty(path)) {
                return 0;
            }
            switch (path.substring(1)) {
                case "activity_started_count":
                    contentValues.put("activity_started_count", Integer.valueOf(jSONObject.optInt("value")));
                    break;
                case "app_exit_data":
                    contentValues.put(DbParams.APP_EXIT_DATA, jSONObject.optString("value"));
                    break;
                case "app_start_time":
                    contentValues.put(DbParams.TABLE_APP_START_TIME, Long.valueOf(jSONObject.optLong("value")));
                    break;
                case "session_interval_time":
                    contentValues.put(DbParams.TABLE_SESSION_INTERVAL_TIME, Long.valueOf(jSONObject.optLong("value")));
                    break;
                case "events_login_id":
                    contentValues.put(DbParams.PersistentName.LOGIN_ID, jSONObject.optString("value"));
                    break;
                case "sub_process_flush_data":
                    contentValues.put(DbParams.PersistentName.SUB_PROCESS_FLUSH_DATA, Boolean.valueOf(jSONObject.optBoolean("value")));
                    break;
                case "first_process_start":
                    contentValues.put(DbParams.TABLE_FIRST_PROCESS_START, Boolean.valueOf(jSONObject.optBoolean("value")));
                    break;
                case "sensorsdata_sdk_configuration":
                    contentValues.put(DbParams.PersistentName.REMOTE_CONFIG, jSONObject.optString("value"));
                    break;
                case "user_ids":
                    contentValues.put(DbParams.PersistentName.PERSISTENT_USER_ID, jSONObject.optString("value"));
                    break;
                case "login_id_key":
                    contentValues.put(DbParams.PersistentName.PERSISTENT_LOGIN_ID_KEY, jSONObject.optString("value"));
                    break;
                case "push_key":
                    contentValues.put(DbParams.PUSH_ID_KEY, jSONObject.optString(DbParams.PUSH_ID_KEY));
                    contentValues.put(DbParams.PUSH_ID_VALUE, jSONObject.optString(DbParams.PUSH_ID_VALUE));
                    break;
                default:
                    return -1;
            }
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9 A[PHI: r9
  0x00e9: PHI (r9v3 android.database.Cursor) = (r9v2 android.database.Cursor), (r9v4 android.database.Cursor) binds: [B:72:0x00e7, B:65:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    private String[] handleQueryUri(Uri uri) throws Throwable {
        Cursor cursorQuery;
        ?? r0 = 0;
        if (uri == null) {
            return null;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        try {
            try {
                String strSubstring = path.substring(1);
                cursorQuery = this.contentResolver.query(uri, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            switch (strSubstring) {
                                case "activity_started_count":
                                case "sub_process_flush_data":
                                case "first_process_start":
                                    String[] strArr = {String.valueOf(cursorQuery.getInt(0))};
                                    cursorQuery.close();
                                    return strArr;
                                case "app_exit_data":
                                case "events_login_id":
                                case "sensorsdata_sdk_configuration":
                                case "user_ids":
                                case "login_id_key":
                                case "push_key":
                                    String[] strArr2 = {cursorQuery.getString(0)};
                                    cursorQuery.close();
                                    return strArr2;
                                case "session_interval_time":
                                case "app_start_time":
                                    String[] strArr3 = {String.valueOf(cursorQuery.getLong(0))};
                                    cursorQuery.close();
                                    return strArr3;
                                default:
                                    cursorQuery.close();
                                    return null;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        SALog.printStackTrace(e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                r0 = this;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public void deleteData(Uri uri, String str) {
        this.contentResolver.delete(uri.buildUpon().appendQueryParameter("remove_key", str).build(), null, null);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, JSONObject jSONObject) {
        return handleInsertUri(uri, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, int i) {
        return handleQueryUri(uri);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, ContentValues contentValues) {
        this.contentResolver.insert(uri, contentValues);
        return 0;
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, boolean z, int i) {
        return handleQueryUri(uri);
    }
}
