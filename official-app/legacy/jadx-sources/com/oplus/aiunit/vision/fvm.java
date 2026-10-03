package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.http.HttpConst;

/* JADX INFO: loaded from: classes12.dex */
public class fvm {
    public static volatile fvm g = null;
    public static boolean h = false;
    public BroadcastReceiver f;
    public fam a = new fam(HttpConst.UDID);
    public fam b = new fam("oaid");
    public fam d = new fam("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fam f11524c = new fam("aaid");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tkm f11525e = new tkm();

    public static mqm a(Cursor cursor) {
        String str;
        mqm mqmVar = new mqm(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else {
            if (!cursor.isClosed()) {
                cursor.moveToFirst();
                int columnIndex = cursor.getColumnIndex("value");
                if (columnIndex >= 0) {
                    mqmVar.a = cursor.getString(columnIndex);
                } else {
                    e("parseValue fail, index < 0.");
                }
                int columnIndex2 = cursor.getColumnIndex("code");
                if (columnIndex2 >= 0) {
                    mqmVar.b = cursor.getInt(columnIndex2);
                } else {
                    e("parseCode fail, index < 0.");
                }
                int columnIndex3 = cursor.getColumnIndex("expired");
                if (columnIndex3 >= 0) {
                    mqmVar.f14161c = cursor.getLong(columnIndex3);
                } else {
                    e("parseExpired fail, index < 0.");
                }
                return mqmVar;
            }
            str = "parseValue fail, cursor is closed.";
        }
        e(str);
        return mqmVar;
    }

    public static final fvm b() {
        if (g == null) {
            synchronized (fvm.class) {
                if (g == null) {
                    g = new fvm();
                }
            }
        }
        return g;
    }

    public static String d(PackageManager packageManager, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (packageManager == null || (providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    public static void e(String str) {
        if (h) {
            Log.d("OpenIdManager", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[PHI: r7
  0x0057: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:20:0x0055, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean f(Context context) {
        e("querySupport version : 1.0.8");
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery != null) {
                    mqm mqmVarA = a(cursorQuery);
                    boolean z = 1000 != mqmVarA.b || "0".equals(mqmVarA.a);
                    cursorQuery.close();
                    return z;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                e("querySupport, Exception : " + e2.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return false;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static String i(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            e("getAppVersion, Exception : " + e2.getMessage());
            return null;
        }
    }

    public final String c(Context context, fam famVar) {
        String str;
        if (famVar == null) {
            str = "getId, openId = null.";
        } else {
            if (famVar.d()) {
                return famVar.b;
            }
            if (g(context, true)) {
                return h(context, famVar);
            }
            str = "getId, isSupported = false.";
        }
        e(str);
        return null;
    }

    public final boolean g(Context context, boolean z) {
        if (!this.f11525e.b() || z) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            String strD = d(packageManager, "com.meizu.flyme.openidsdk");
            if (TextUtils.isEmpty(strD)) {
                return false;
            }
            String strI = i(packageManager, strD);
            if (!this.f11525e.b() || !this.f11525e.c(strI)) {
                this.f11525e.d(strI);
                boolean zF = f(context);
                e("query support, result : ".concat(String.valueOf(zF)));
                this.f11525e.a(zF);
                return zF;
            }
            e("use same version cache, safeVersion : ".concat(String.valueOf(strI)));
        }
        return this.f11525e.e();
    }

    public final String h(Context context, fam famVar) throws Throwable {
        String str;
        Cursor cursorQuery;
        String str2;
        String strValueOf;
        e("queryId : " + famVar.f11282c);
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{famVar.f11282c}, null);
                try {
                    if (cursorQuery != null) {
                        mqm mqmVarA = a(cursorQuery);
                        str3 = mqmVarA.a;
                        famVar.c(str3);
                        famVar.b(mqmVarA.f14161c);
                        famVar.a(mqmVarA.b);
                        e(famVar.f11282c + " errorCode : " + famVar.d);
                        if (mqmVarA.b != 1000) {
                            j(context);
                            if (!g(context, false)) {
                                boolean zG = g(context, true);
                                str2 = "not support, forceQuery isSupported: ";
                                strValueOf = String.valueOf(zG);
                                e(str2.concat(strValueOf));
                            }
                        }
                    } else if (g(context, false)) {
                        boolean zG2 = g(context, true);
                        str2 = "forceQuery isSupported : ";
                        strValueOf = String.valueOf(zG2);
                        e(str2.concat(strValueOf));
                    }
                    if (cursorQuery == null) {
                        return str3;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = str3;
                    cursor = cursorQuery;
                    e("queryId, Exception : " + e.getMessage());
                    if (cursor == null) {
                        return str;
                    }
                    cursorQuery = cursor;
                    str3 = str;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                str = null;
            }
            cursorQuery.close();
            return str3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void j(Context context) {
        if (this.f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, "com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        com.alipay.sdk.m.i0.e eVar = new com.alipay.sdk.m.i0.e();
        this.f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
