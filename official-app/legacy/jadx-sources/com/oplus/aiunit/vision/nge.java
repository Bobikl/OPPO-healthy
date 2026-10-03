package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class nge extends pt4 {
    public final y15 b;

    public nge(Context context) {
        super(context);
        this.b = y15.b(context.getPackageName());
    }

    @Override // com.oplus.aiunit.vision.pt4
    public int a(Uri uri, ContentValues contentValues) {
        try {
            Uri uriInsert = this.a.insert(uri, contentValues);
            if (TextUtils.equals(this.b.c().toString(), uri.toString()) && uriInsert != null) {
                String queryParameter = uriInsert.getQueryParameter(y15.PARAMS_RECORD_COUNT);
                if (!TextUtils.isEmpty(queryParameter)) {
                    try {
                        return Integer.parseInt(queryParameter);
                    } catch (Exception unused) {
                        k6k.e().a("PersistentDataOperation", "PersistentDataOperation insertData parseInt Exception, count = " + queryParameter, null, new Object[0]);
                    }
                }
            }
        } catch (Exception e2) {
            k6k.e().c("PersistentDataOperation", e2.toString(), null, new Object[0]);
        }
        return 0;
    }

    @Override // com.oplus.aiunit.vision.pt4
    public int b(Uri uri, JSONObject jSONObject) {
        return d(uri, jSONObject);
    }

    @Override // com.oplus.aiunit.vision.pt4
    public String[] c(Uri uri, int i) {
        return e(uri);
    }

    public final int d(Uri uri, JSONObject jSONObject) {
        if (uri == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                String strSubstring = path.substring(1);
                if (((strSubstring.hashCode() == -1437430111 && strSubstring.equals("activity_started_count")) ? (byte) 0 : (byte) -1) != 0) {
                    return -1;
                }
                contentValues.put("activity_started_count", Integer.valueOf(jSONObject.optInt("value")));
                this.a.insert(uri, contentValues);
            }
        } catch (Exception e2) {
            k6k.e().c("PersistentDataOperation", e2.toString(), null, new Object[0]);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public final String[] e(Uri uri) throws Throwable {
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
                cursorQuery = this.a.query(uri, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            if (((strSubstring.hashCode() == -1437430111 && strSubstring.equals("activity_started_count")) ? (byte) 0 : (byte) -1) != 0) {
                                cursorQuery.close();
                                return null;
                            }
                            String[] strArr = {String.valueOf(cursorQuery.getInt(0))};
                            cursorQuery.close();
                            return strArr;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        k6k.e().c("PersistentDataOperation", e.toString(), null, new Object[0]);
                        if (cursorQuery != null) {
                        }
                        return null;
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
}
