package com.coloros.sceneservice.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.coloros.sceneservice.SceneSDKInit;
import com.coloros.sceneservice.m.f;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static final String AUTHORITY = "com.coloros.sceneservice.scenesprovider";
    public static final String TAG = "ScenesProviderUtils";
    public static final String URI_STRING = "content://com.coloros.sceneservice.scenesprovider";
    public static final String da = "notify";
    public static final String ea = "report";
    public static final String fa = "final_user_profile";
    public static final String ga = "card_info_and_bindstate";
    public static final String ha = "?notify=false";
    public static final String ia = "?notify=true";
    public static final Uri ja = Uri.parse("content://com.coloros.sceneservice.scenesprovider/final_user_profile");
    public static final Uri ka = Uri.parse("content://com.coloros.sceneservice.scenesprovider/Settings/accessibilitys_service_enable");

    public static Uri a(String str) {
        return Uri.parse("content://com.coloros.sceneservice.scenesprovider/" + str);
    }

    public static Float b(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndex(str) < 0 ? Float.valueOf(0.0f) : Float.valueOf(cursor.getFloat(cursor.getColumnIndex(str)));
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "getFloat e = " + e2);
            return Float.valueOf(0.0f);
        }
    }

    public static int c(Cursor cursor, String str) {
        try {
            if (cursor.getColumnIndex(str) < 0) {
                return 0;
            }
            return cursor.getInt(cursor.getColumnIndex(str));
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "getInt e = " + e2);
            return 0;
        }
    }

    public static Long d(Cursor cursor, String str) {
        try {
            if (cursor.getColumnIndex(str) < 0) {
                return 0L;
            }
            return Long.valueOf(cursor.getLong(cursor.getColumnIndex(str)));
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "getLong e = " + e2);
            return 0L;
        }
    }

    public static int delete(Uri uri, String str, String[] strArr) {
        try {
            return SceneSDKInit.getContext().getContentResolver().delete(uri, str, strArr);
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "delete e = " + e2.getMessage());
            return 0;
        }
    }

    public static String e(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex < 0) {
                return null;
            }
            return cursor.getString(columnIndex);
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "getString e = " + e2);
            return null;
        }
    }

    public static Uri insert(Uri uri, ContentValues contentValues) {
        try {
            return SceneSDKInit.getContext().getContentResolver().insert(uri, contentValues);
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "insert e = " + e2.getMessage());
            return null;
        }
    }

    public static Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return SceneSDKInit.getContext().getContentResolver().query(uri, strArr, str, strArr2, str2);
    }

    public static int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        try {
            return SceneSDKInit.getContext().getContentResolver().update(uri, contentValues, str, strArr);
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "update e = " + e2.getMessage());
            return 0;
        }
    }

    public static Uri a(String str, boolean z) {
        StringBuilder sb;
        if (z) {
            sb = new StringBuilder();
            sb.append("content://com.coloros.sceneservice.scenesprovider/");
        } else {
            sb = new StringBuilder();
            sb.append("content://com.coloros.sceneservice.scenesprovider/");
            sb.append(str);
            str = "?notify=false";
        }
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    public static Cursor a(Uri uri, String str, String[] strArr, String str2) {
        return query(uri, null, str, strArr, str2);
    }

    public static int a(Uri uri, ContentValues[] contentValuesArr) {
        try {
            return SceneSDKInit.getContext().getContentResolver().bulkInsert(uri, contentValuesArr);
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "delete e = " + e2.getMessage());
            return 0;
        }
    }

    public static Double a(Cursor cursor, String str) {
        try {
            if (cursor.getColumnIndex(str) < 0) {
                return Double.valueOf(0.0d);
            }
            return Double.valueOf(cursor.getDouble(cursor.getColumnIndex(str)));
        } catch (Exception e2) {
            f.e("ScenesProviderUtils", "getDouble e = " + e2);
            return Double.valueOf(0.0d);
        }
    }
}
