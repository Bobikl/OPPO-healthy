package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.TraceCompat;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class rpa {
    public static final boolean OPLUS_DBG = false;
    public static final String TAG = "LOG_Effective";
    public static boolean a = false;
    public static boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String[] f16288c;
    public static long[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f16289e;
    public static int f;
    public static ji6 g;
    public static ii6 h;
    public static volatile soc i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile hoc f16290j;

    public class a implements ii6 {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.ii6
        @NonNull
        public File a() {
            return new File(this.a.getCacheDir(), "anim_network_cache");
        }
    }

    public static void a(String str) {
        if (a) {
            int i2 = f16289e;
            if (i2 == 20) {
                f++;
                return;
            }
            f16288c[i2] = str;
            d[i2] = System.nanoTime();
            TraceCompat.beginSection(str);
            f16289e++;
        }
    }

    public static float b(String str) {
        int i2 = f;
        if (i2 > 0) {
            f = i2 - 1;
            return 0.0f;
        }
        if (!a) {
            return 0.0f;
        }
        int i3 = f16289e - 1;
        f16289e = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f16288c[i3])) {
            TraceCompat.endSection();
            return (System.nanoTime() - d[f16289e]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f16288c[f16289e] + ".");
    }

    @Nullable
    public static hoc c(@NonNull Context context) {
        if (!b) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        hoc hocVar = f16290j;
        if (hocVar == null) {
            synchronized (hoc.class) {
                hocVar = f16290j;
                if (hocVar == null) {
                    ii6 aVar = h;
                    if (aVar == null) {
                        aVar = new a(applicationContext);
                    }
                    hocVar = new hoc(aVar);
                    f16290j = hocVar;
                }
            }
        }
        return hocVar;
    }

    @NonNull
    public static soc d(@NonNull Context context) {
        Log.d(TAG, "networkFetcher : context:" + context + ",callers:" + prk.g());
        soc socVar = i;
        if (socVar == null) {
            synchronized (soc.class) {
                socVar = i;
                if (socVar == null) {
                    hoc hocVarC = c(context);
                    ji6 l45Var = g;
                    if (l45Var == null) {
                        l45Var = new l45();
                    }
                    socVar = new soc(hocVarC, l45Var);
                    i = socVar;
                }
            }
        }
        return socVar;
    }
}
