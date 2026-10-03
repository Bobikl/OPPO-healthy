package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class xml {
    public static boolean a(Context context, String str) {
        uml.a("WearableUtil", "checkPathPermission calling pkg: " + context.getPackageName() + " file Path:" + str);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.startsWith("/data/data")) {
            return !str.contains(context.getPackageName());
        }
        return false;
    }

    public static boolean b(Context context, String str, String str2) {
        if ("com.heytap.health".equals(str2)) {
            return true;
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (context.getPackageManager().checkPermission(str, str2) == 0) {
            return true;
        }
        uml.a("WearableUtil", str2 + " not has permission:" + str);
        return false;
    }

    public static String c(String str, String str2) {
        return str2 + "_temp_" + str;
    }

    public static String d(Context context, String str) {
        if (TextUtils.isEmpty(str) || a(context, str)) {
            throw new IllegalArgumentException("Wrong file path");
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if ("file".equalsIgnoreCase(scheme)) {
            str = uri.getPath();
            if (str != null) {
                uml.j("WearableUtil", "URI scheme is SCHEME_FILE  File Path : " + str);
            }
        } else if ("content".equalsIgnoreCase(scheme)) {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                try {
                    str = cursorQuery.getString(0);
                    if (str != null) {
                        uml.j("WearableUtil", "URI ContentResolver is SCHEME_CONTENT File Path : " + str);
                    }
                    cursorQuery.close();
                    cursorQuery = null;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return str;
    }

    public static String e(Context context) {
        List<ProviderInfo> listQueryContentProviders;
        try {
            listQueryContentProviders = context.getPackageManager().queryContentProviders(context.getPackageName(), Process.myUid(), 0);
        } catch (RuntimeException e) {
            uml.b("WearableUtil", "RuntimeException: " + e.getMessage());
            listQueryContentProviders = null;
        }
        if (listQueryContentProviders == null) {
            return null;
        }
        for (ProviderInfo providerInfo : listQueryContentProviders) {
            String str = providerInfo.name;
            if ("android.support.v4.content.FileProvider".equalsIgnoreCase(str) || "androidx.core.content.FileProvider".equalsIgnoreCase(str)) {
                return providerInfo.authority;
            }
        }
        return null;
    }

    public static String f(Context context) {
        return "com.heytap.health";
    }

    public static Uri g(Context context, String str, int i) {
        Class<FileProvider> cls;
        Uri uri;
        String strF = f(context);
        String strE = e(context);
        Uri uri2 = null;
        if (TextUtils.isEmpty(strF) || strE == null) {
            uml.j("WearableUtil", "FTCore version does not support content uri");
            return null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                uml.b("WearableUtil", "File path is wrong!!");
                return null;
            }
            uml.j("WearableUtil", "File :" + str);
            File file = new File(str);
            try {
                try {
                    cls = FileProvider.class;
                    int i2 = FileProvider.i;
                } catch (ClassNotFoundException unused) {
                    uml.b("WearableUtil", "getFileUri: not find any FileProvider class");
                    cls = null;
                }
            } catch (ClassNotFoundException unused2) {
                cls = android.support.v4.content.FileProvider.class;
                int i3 = android.support.v4.content.FileProvider.j;
            }
            if (cls == null) {
                throw new IllegalStateException("not find support or androidx FileProvider class");
            }
            try {
                uri = (Uri) cls.getDeclaredMethod("getUriForFile", Context.class, String.class, File.class).invoke(null, context, strE, file);
            } catch (Exception e) {
                uml.b("WearableUtil", "getFileUri: invoke getUriForFile failed " + e.getMessage());
                uri = null;
            }
            if (uri == null) {
                uml.b("WearableUtil", "Cannot create the content URI !");
            } else {
                uml.a("WearableUtil", "getFileUri: uri = " + uri);
                context.grantUriPermission(strF, uri, i);
            }
            uri2 = uri;
            if (uri2 == null && h(str)) {
                uml.b("WearableUtil", "getFileUri: content FileUri needs to be implemented for sending from internal folders.Please check  file-transfer sdk documentation for more details");
            }
            return uri2;
        } catch (IllegalArgumentException | NullPointerException e2) {
            uml.b("WearableUtil", "Cannot create the content URI:" + e2.getMessage());
        }
    }

    public static boolean h(String str) {
        return str.startsWith("/data/data");
    }
}
