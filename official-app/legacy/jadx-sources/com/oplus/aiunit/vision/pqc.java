package com.oplus.aiunit.vision;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes18.dex */
public class pqc {
    public static final String INVK = "invk ";
    public static BaseDexClassLoader a;

    public static BaseDexClassLoader a(Context context) {
        String str;
        String str2;
        int iF = x70.f(b78.b(), "com.android.nfc");
        if (iF >= 13000014) {
            str = new File("/system_ext/framework/nfcvendorlib.jar").exists() ? "/system_ext/framework/nfcvendorlib.jar" : "/system_ext/framework/oplusex/com.oplus.NfcNci/nfcvendorlib.jar";
            str2 = "nfcvendorlib.jar";
        } else {
            str = "/system_ext/framework/com.vendor.nfc.jar";
            str2 = "com.vendor.nfc.jar";
        }
        File file = new File(str);
        t6b.i("NfcAdapterUtils", "getClassLoader versionCode=" + iF + ",pathName=" + str + ",libraryName=" + str2 + ",file.exists()=" + file.exists() + ",vendorLibVersionCode=13000014");
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(context.getFilesDir().getAbsolutePath() + File.pathSeparator + str2);
        file2.setReadOnly();
        return new BaseDexClassLoader(str, file2, file2.getAbsolutePath(), context.getClassLoader());
    }

    public static Class<?> b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            t6b.i("NfcAdapterUtils", "getExNfcClass first cls notfound");
            if (a == null) {
                t6b.i("NfcAdapterUtils", "mExNfcClassLoader == null begin class load");
                a = a(b78.b());
            }
            t6b.i("NfcAdapterUtils", "mExNfcClassLoader=" + a);
            BaseDexClassLoader baseDexClassLoader = a;
            if (baseDexClassLoader != null) {
                try {
                    return baseDexClassLoader.loadClass(str);
                } catch (Exception unused) {
                    t6b.i("NfcAdapterUtils", "getExNfcClass second  error=" + e2.toString());
                    return null;
                }
            }
            return null;
        }
    }

    public static boolean c(Context context) {
        boolean zBooleanValue = Boolean.valueOf(g(context, "UPDATE_CARD_LOC_IOT")).booleanValue();
        t6b.i("NfcAdapterUtils", "invokeHasUpdateCardLocFeature,result hasFeature=" + zBooleanValue);
        return zBooleanValue;
    }

    public static NfcAdapter d(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null) {
            t6b.f("NfcAdapterUtils", "getNfcAdapter is null");
        }
        return defaultAdapter;
    }

    public static Class<?> e() {
        return b("com.vendor.nfc.VendorNfcAdapter");
    }

    public static boolean f(Context context, String str, Class<?>[] clsArr, Object[] objArr) {
        if (context == null || str == null) {
            t6b.b("NfcAdapterUtils", "cxt or methodName is null");
            return false;
        }
        t6b.b("NfcAdapterUtils", "invokeBooleanMethod " + str);
        NfcAdapter nfcAdapterD = d(context.getApplicationContext());
        if (nfcAdapterD != null) {
            return i(nfcAdapterD, str, clsArr, objArr);
        }
        t6b.b("NfcAdapterUtils", "nfc is null or disable");
        return false;
    }

    public static boolean g(Context context, String str) {
        return f(context, "hasFeature", new Class[]{String.class}, new Object[]{str});
    }

    public static void h(NfcAdapter nfcAdapter, String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            j(nfcAdapter, str, clsArr, objArr);
        } catch (Exception e2) {
            t6b.h("invokeNfcAdapter void error:" + e2.getLocalizedMessage());
        }
    }

    public static boolean i(NfcAdapter nfcAdapter, String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Object objJ = j(nfcAdapter, str, clsArr, objArr);
            if (objJ != null) {
                return Boolean.parseBoolean(objJ.toString());
            }
            return false;
        } catch (Exception e2) {
            t6b.h("invokeNfcAdapter bool error:" + e2.getLocalizedMessage());
            return false;
        }
    }

    public static Object j(NfcAdapter nfcAdapter, String str, Class<?>[] clsArr, Object[] objArr) {
        Object objInvoke;
        Object obj = null;
        try {
            Method method = NfcAdapter.class.getMethod(str, clsArr);
            if (method != null && (objInvoke = method.invoke(nfcAdapter, objArr)) != null) {
                obj = objInvoke;
            }
        } catch (Exception unused) {
            t6b.i("NfcAdapterUtils", "invokeNormalAdapter meth gt or run excp");
            try {
                Class<?> clsE = e();
                Method method2 = clsE.getMethod("getVendorNfcAdapter", new Class[0]);
                method2.setAccessible(true);
                Object objInvoke2 = method2.invoke(null, new Object[0]);
                Method method3 = clsE.getMethod(str, clsArr);
                if (method3 != null && (objInvoke = method3.invoke(objInvoke2, objArr)) != null) {
                }
            } catch (Exception e2) {
                t6b.i("NfcAdapterUtils", "invokeVendorNfcAdapter error:" + e2.getLocalizedMessage());
                e2.printStackTrace();
            }
        }
        t6b.i("NfcAdapterUtils", INVK + str + ", rtn:" + obj);
        return obj;
    }

    public static void k(Context context, String str, Class<?>[] clsArr, Object[] objArr) {
        if (context == null || str == null) {
            t6b.b("NfcAdapterUtils", "cxt or methodName is null");
            return;
        }
        t6b.b("NfcAdapterUtils", "invokeVoidMethod " + str);
        NfcAdapter nfcAdapterD = d(context.getApplicationContext());
        if (nfcAdapterD != null) {
            h(nfcAdapterD, str, clsArr, objArr);
        } else {
            t6b.i("NfcAdapterUtils", "nfc is null or disable");
        }
    }

    public static void l(Context context, String str) {
        t6b.i("NfcAdapterUtils", "notifyIOTSwipeCard aid =  " + str);
        if (Build.VERSION.SDK_INT >= 34) {
            k(context, "notifyIOTSwipeCard", new Class[]{String.class, String.class}, new Object[]{"wear", str});
        } else {
            t6b.i("NfcAdapterUtils", "invokeVoidMethod notifyIOTSwipeCard lvl < 34");
        }
    }

    public static void m(Context context, String str, String str2, String str3, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            k(context, "notifyIOTCardChange", new Class[]{String.class, String.class, String.class, Bundle.class}, new Object[]{str, str2, str3, bundle});
        } else {
            t6b.i("NfcAdapterUtils", "invokeVoidMethod notifyIOTCardChange lvl < 34");
        }
    }
}
