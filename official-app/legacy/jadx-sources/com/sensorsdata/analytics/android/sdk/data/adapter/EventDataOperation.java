package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.business.instantevent.InstantEventUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class EventDataOperation extends DataOperation {
    public EventDataOperation(Context context) {
        super(context);
        this.TAG = "EventDataOperation";
    }

    private String[] handleBigException(Uri uri, boolean z) {
        try {
            return queryDataInner(uri, z, 1);
        } catch (SQLiteBlobTooBigException e2) {
            deleteData(uri, getFirstRowId(uri, z ? "1" : "0"));
            SALog.printStackTrace(e2);
            return null;
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
            return null;
        }
    }

    private String[] queryDataInner(Uri uri, boolean z, int i) {
        Cursor cursorQuery;
        String str;
        String string;
        String string2;
        JSONArray jSONArray = new JSONArray();
        try {
            cursorQuery = this.contentResolver.query(uri, null, "is_instant_event=?", new String[]{z ? "1" : "0"}, "created_at ASC LIMIT " + i);
            if (cursorQuery != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    String str2 = ",";
                    sb.append("[");
                    while (cursorQuery.moveToNext()) {
                        if (cursorQuery.isLast()) {
                            str2 = "]";
                        }
                        jSONArray.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id")));
                        try {
                            String data = parseData(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("data")));
                            if (!TextUtils.isEmpty(data)) {
                                sb.append((CharSequence) data, 0, data.length() - 1);
                                sb.append(",\"_flush_time\":");
                                sb.append(System.currentTimeMillis());
                                sb.append("}");
                                sb.append(str2);
                            }
                        } catch (Exception e2) {
                            SALog.printStackTrace(e2);
                        }
                    }
                    string = sb.toString();
                    try {
                        string2 = jSONArray.length() > 0 ? jSONArray.toString() : null;
                    } catch (Throwable th) {
                        str = string;
                        th = th;
                        try {
                            SALog.i(this.TAG, th.getMessage());
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            string = str;
                            string2 = null;
                        } catch (Throwable th2) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = null;
                }
            } else {
                string2 = null;
                string = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th4) {
            th = th4;
            cursorQuery = null;
            str = null;
        }
        if (string2 != null) {
            return new String[]{string2, string, "1"};
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public void deleteData(Uri uri, String str) {
        super.deleteData(uri, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, JSONObject jSONObject) {
        try {
            if (deleteDataLowMemory(uri) != 0) {
                return -2;
            }
            int iIsInstantEvent = InstantEventUtils.isInstantEvent(jSONObject);
            ContentValues contentValues = new ContentValues();
            String string = jSONObject.toString();
            contentValues.put("data", string + "\t" + string.hashCode());
            contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
            contentValues.put(DbParams.KEY_IS_INSTANT_EVENT, Integer.valueOf(iIsInstantEvent));
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Throwable th) {
            SALog.i(this.TAG, th.getMessage());
            return 0;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, int i) {
        return queryData(uri, false, i);
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, boolean z, int i) {
        try {
            return queryDataInner(uri, z, i);
        } catch (SQLiteBlobTooBigException e2) {
            SALog.i(this.TAG, "Could not pull records for SensorsData out of database events. SQLiteBlobTooBigException ", e2);
            return handleBigException(uri, z);
        } catch (SQLiteException e3) {
            SALog.i(this.TAG, "Could not pull records for SensorsData out of database events. Waiting to send.", e3);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public int insertData(Uri uri, ContentValues contentValues) {
        try {
            if (deleteDataLowMemory(uri) != 0) {
                return -2;
            }
            this.contentResolver.insert(uri, contentValues);
            return 0;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return 0;
        }
    }
}
