package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.business.instantevent.InstantEventUtils;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class EncryptDataOperation extends DataOperation {
    protected boolean mDbEncrypt;

    public EncryptDataOperation(Context context) {
        super(context);
        this.mDbEncrypt = true;
    }

    private String decryptValue(String str) {
        String str2 = (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_LOAD_EVENT, str);
        return TextUtils.isEmpty(str2) ? str : str2;
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
            JSONObject jSONObject2 = (JSONObject) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_ENCRYPT_EVENT_DATA, jSONObject);
            if (jSONObject2 != null) {
                jSONObject = jSONObject2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", jSONObject.toString() + "\t" + jSONObject.toString().hashCode());
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

    /* JADX WARN: Code duplicated, block: B:70:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01d5: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:85:0x01d5 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation, com.sensorsdata.analytics.android.sdk.data.adapter.EncryptDataOperation] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.sensorsdata.analytics.android.sdk.data.adapter.DataOperation
    public String[] queryData(Uri uri, boolean z, int i) throws Throwable {
        Cursor cursor;
        String str;
        Cursor cursorQuery;
        Cursor cursor2;
        String str2;
        String string;
        ?? r1 = this;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        String str3 = "9";
        try {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray3 = new JSONArray();
                String str4 = z ? "1" : "0";
                cursorQuery = r1.contentResolver.query(uri, null, "is_instant_event=?", new String[]{str4}, "created_at ASC LIMIT " + i);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            try {
                                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                                String data = r1.parseData(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("data")));
                                if (!TextUtils.isEmpty(data)) {
                                    if (JSONUtils.isJson(data)) {
                                        JSONObject jSONObject = new JSONObject(data);
                                        boolean zHas = jSONObject.has("ekey");
                                        if (jSONObject.has("payloads") && !zHas) {
                                            jSONObject = new JSONObject(r1.decryptValue(jSONObject.optString("payloads")));
                                        }
                                        if (zHas || !r1.mDbEncrypt) {
                                            str = str3;
                                        } else {
                                            str = str3;
                                            try {
                                                JSONObject jSONObject2 = (JSONObject) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_ENCRYPT_EVENT_DATA, jSONObject);
                                                if (jSONObject2 != null) {
                                                    jSONObject = jSONObject2;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                try {
                                                    SALog.printStackTrace(e);
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    r1 = 0;
                                                    SALog.printStackTrace(e);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    str2 = str;
                                                    string = null;
                                                    if (string != null) {
                                                        return new String[]{string, r1, str2};
                                                    }
                                                    return null;
                                                }
                                            }
                                        }
                                        if (jSONObject.has("ekey")) {
                                            String str5 = jSONObject.getString("ekey") + "$" + jSONObject.getInt("pkv");
                                            if (map.containsKey(str5)) {
                                                ((JSONArray) map.get(str5)).put(jSONObject.optString("payloads"));
                                            } else {
                                                JSONArray jSONArray4 = new JSONArray();
                                                jSONArray4.put(jSONObject.optString("payloads"));
                                                map.put(str5, jSONArray4);
                                            }
                                            jSONArray.put(string2);
                                        } else {
                                            jSONObject.put("_flush_time", System.currentTimeMillis());
                                            jSONArray3.put(jSONObject);
                                            jSONArray2.put(string2);
                                        }
                                        r1 = this;
                                        str3 = str;
                                    } else {
                                        SALog.i(r1.TAG, "Error is not json data, v = " + data);
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str = str3;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str = str3;
                        }
                    }
                    str = str3;
                    try {
                        if (map.size() <= 0) {
                            if (jSONArray3.length() > 0) {
                                String string3 = jSONArray3.toString();
                                string = jSONArray2.toString();
                                str2 = "1";
                                r1 = string3;
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (string != null) {
                                return new String[]{string, r1, str2};
                            }
                            return null;
                        }
                        JSONArray jSONArray5 = new JSONArray();
                        for (String str6 : map.keySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("ekey", str6.substring(0, str6.indexOf("$")));
                            jSONObject3.put("pkv", Integer.valueOf(str6.substring(str6.indexOf("$") + 1)));
                            jSONObject3.put("payloads", map.get(str6));
                            jSONObject3.put("flush_time", System.currentTimeMillis());
                            jSONArray5.put(jSONObject3);
                        }
                        String string4 = jSONArray5.toString();
                        string = jSONArray.toString();
                        str2 = str;
                        r1 = string4;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e6) {
                        e = e6;
                        SALog.printStackTrace(e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        str2 = str;
                        string = null;
                    }
                    if (string != null) {
                        return new String[]{string, r1, str2};
                    }
                    return null;
                }
                str = "9";
                str2 = str;
                string = null;
                r1 = 0;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            str = "9";
            r1 = 0;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (string != null) {
            return new String[]{string, r1, str2};
        }
        return null;
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
