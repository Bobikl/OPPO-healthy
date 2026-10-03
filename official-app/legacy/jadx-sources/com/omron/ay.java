package com.omron;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import com.omron.lib.utils.OmronLogVisibleUtil;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;

/* JADX INFO: loaded from: classes5.dex */
public class ay {
    private static boolean a = false;
    private static boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ba f8831c;
    private static bc d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static bh f8832e;
    private static Context f;

    private static void a(int i, String str, Object... objArr) {
        String strC;
        Object obj;
        String str2;
        if (!b) {
            a("日志还未初始化");
            return;
        }
        if (str.contains("mBpAddress") || str.contains(ServiceNodeBundleKeys.DEVICE_ADDRESS) || str.contains("uuid")) {
            if (objArr.length <= 0 || (obj = objArr[0]) == null) {
                strC = "";
            } else {
                str2 = String.format(str, OmronLogVisibleUtil.getMessage(obj.toString()));
            }
            d.a(i, f8831c.b(), strC);
        }
        str2 = String.format(str, objArr);
        strC = c(str2);
        d.a(i, f8831c.b(), strC);
    }

    public static void b(String str) {
        c("OMRON-Lib", str);
    }

    private static String c(String str) {
        return "[" + Thread.currentThread().getName() + "]:" + str;
    }

    public static void d(String str) {
        d("OMRON-Lib", str);
    }

    public static void a(@NonNull ba baVar, boolean z, bh bhVar, bc... bcVarArr) {
        if (b) {
            return;
        }
        b = true;
        f8831c = baVar;
        f8832e = bhVar;
        d = new bd(bcVarArr);
        a = z;
    }

    public static void b(String str, String str2) {
        String str3;
        if (a) {
            if (str2 == null || str2.length() == 0) {
                str3 = "";
            } else {
                str3 = str + "-" + str2 + bk.a();
            }
            a(2, str3, new Object[0]);
        }
    }

    public static void c(String str, String str2) {
        if (a) {
            Log.e(str, "[" + Thread.currentThread().getName() + "]" + str2);
        }
    }

    public static void d(String str, String str2) {
        if (a) {
            Log.w(str, "[" + Thread.currentThread().getName() + "]" + str2);
        }
    }

    public static void a(String str) {
        a("OMRON-Lib", str);
    }

    public static void b(String str, Object... objArr) {
        if (a) {
            a(2, str, objArr);
        }
    }

    public static void a(String str, Context context) {
        if (b) {
            return;
        }
        f = context;
        ba baVarA = new az().a(str).a();
        a(baVarA, true, new bh(baVarA, f), new bj(), new bg(baVarA));
    }

    public static void a(String str, String str2) {
        if (a) {
            Log.d(str, "[" + Thread.currentThread().getName() + "]" + str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        String str3;
        if (a) {
            StringBuilder sb = new StringBuilder();
            if (str2 == null || str2.length() == 0) {
                str3 = "";
            } else {
                str3 = str + "-" + str2 + bk.a();
            }
            sb.append(str3);
            sb.append(bk.a(th));
            a(2, sb.toString(), new Object[0]);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        if (a) {
            a(1, str + ":" + str2, objArr);
        }
    }

    public static void a(String str, Object... objArr) {
        if (a) {
            a(1, str, objArr);
        }
    }

    public static void a(boolean z) {
        bh bhVar;
        if (!b || f8831c == null || (bhVar = f8832e) == null) {
            return;
        }
        if (!z) {
            bhVar.b(2);
            f8832e.b(1);
            return;
        }
        if (bl.c(f8831c.a() + bb.a(2)) > 0) {
            f8832e.b(2);
            f8832e.b(1);
        }
    }
}
