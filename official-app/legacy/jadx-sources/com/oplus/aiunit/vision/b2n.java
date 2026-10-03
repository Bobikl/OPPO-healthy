package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes12.dex */
public final class b2n {
    public static final String a = "/a/";
    public static final String b = "b";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9565c = "c";
    public static final String d = "d";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f9566e = "s";
    public static final String f = "g";
    public static final String g = "h";
    public static final String h = "e";
    public static final String i = "f";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f9567j = "j";
    public static final String k = "k";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static long f9568l;
    public static Vector<v0n> m = new Vector<>();

    public class a extends u4n {
        public final /* synthetic */ Context i;

        public a(Context context) {
            this.i = context;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            try {
                d2n.o(this.i);
                d2n.q(this.i);
                d2n.p(this.i);
                y3n.b(this.i);
                w3n.d(this.i);
            } catch (RejectedExecutionException unused) {
            } catch (Throwable th) {
                c2n.r(th, "Lg", "proL");
            }
        }
    }

    public static String a(Context context, String str) {
        return context.getSharedPreferences("AMSKLG_CFG", 0).getString(str, "");
    }

    public static List<v0n> b() {
        Vector<v0n> vector;
        try {
            synchronized (Looper.getMainLooper()) {
                vector = m;
            }
            return vector;
        } catch (Throwable th) {
            th.printStackTrace();
            return m;
        }
    }

    public static void c(Context context) {
        try {
            if (System.currentTimeMillis() - f9568l < 60000) {
                return;
            }
            f9568l = System.currentTimeMillis();
            com.amap.api.col.p0003sl.q0.h().b(new a(context));
        } catch (Throwable th) {
            c2n.r(th, "Lg", "proL");
        }
    }

    @TargetApi(9)
    public static void d(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void e(v0n v0nVar) {
        try {
            synchronized (Looper.getMainLooper()) {
                try {
                    if (v0nVar == null) {
                        return;
                    }
                    if (m.contains(v0nVar)) {
                        return;
                    }
                    m.add(v0nVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean f(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                String[] strArrSplit = str.split(Weather.SEPARATOR);
                int length = strArrSplit.length;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 < length) {
                        String strTrim = strArrSplit[i2].trim();
                        if (TextUtils.isEmpty(strTrim) || !strTrim.startsWith("at ") || !strTrim.contains("uncaughtException")) {
                            z = false;
                        }
                        if (z) {
                            return false;
                        }
                        i2++;
                    } else {
                        for (String str2 : strArrSplit) {
                            if (h(strArr, str2.trim())) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static void g(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static boolean h(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                for (String str2 : strArr) {
                    str = str.trim();
                    if (str.startsWith("at ")) {
                        if (str.contains(str2 + ".") && str.endsWith(")") && !str.contains("uncaughtException")) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static String i(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + a + str;
    }
}
