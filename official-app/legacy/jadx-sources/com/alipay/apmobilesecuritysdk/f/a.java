package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import android.os.Environment;
import com.oplus.aiunit.vision.alm;
import com.oplus.aiunit.vision.hsm;
import com.oplus.aiunit.vision.pmm;
import com.oplus.aiunit.vision.uim;
import com.oplus.aiunit.vision.vam;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        if (context == null || vam.c(str) || vam.c(str2)) {
            return null;
        }
        try {
            String strA = hsm.a(context, str, str2, "");
            if (vam.c(strA)) {
                return null;
            }
            return alm.e(alm.a(), strA);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (vam.c(str) || vam.c(str2)) {
                return null;
            }
            try {
                String strA = uim.a(str);
                if (vam.c(strA)) {
                    return null;
                }
                String string = new JSONObject(strA).getString(str2);
                if (vam.c(string)) {
                    return null;
                }
                return alm.e(alm.a(), string);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (vam.c(str) || vam.c(str2) || context == null) {
            return;
        }
        try {
            String strB = alm.b(alm.a(), str3);
            HashMap map = new HashMap();
            map.put(str2, strB);
            hsm.b(context, str, map);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:9:0x0010, B:11:0x001f, B:14:0x002a, B:16:0x003b, B:18:0x0041, B:13:0x0025), top: B:35:0x0010, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0041, please report this as an issue */
    public static void a(String str, String str2, String str3) {
        String str4;
        File file;
        synchronized (a.class) {
            if (vam.c(str) || vam.c(str2)) {
                return;
            }
            try {
                String strA = uim.a(str);
                JSONObject jSONObject = new JSONObject();
                if (vam.f(strA)) {
                    try {
                        jSONObject = new JSONObject(strA);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put(str2, alm.b(alm.a(), str3));
                    jSONObject.toString();
                    try {
                        System.clearProperty(str);
                    } catch (Throwable unused2) {
                    }
                    if (pmm.b()) {
                        str4 = ".SystemConfig" + File.separator + str;
                        if (pmm.b()) {
                            file = new File(Environment.getExternalStorageDirectory(), str4);
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                        }
                    }
                } else {
                    jSONObject.put(str2, alm.b(alm.a(), str3));
                    jSONObject.toString();
                    System.clearProperty(str);
                    if (pmm.b()) {
                        str4 = ".SystemConfig" + File.separator + str;
                        if (pmm.b()) {
                            file = new File(Environment.getExternalStorageDirectory(), str4);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }
}
