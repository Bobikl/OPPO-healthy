package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.AsyncUpdates;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class gqa {
    public static boolean DBG = false;
    public static final String TAG = "LOTTIE";
    public static boolean a = false;
    public static boolean b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f11860c = true;
    public static AsyncUpdates d = AsyncUpdates.AUTOMATIC;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static bbb f11861e;
    public static abb f;
    public static volatile roc g;
    public static volatile ioc h;
    public static ThreadLocal<kbb> i;

    public static void b(String str) {
        if (a) {
            f().a(str);
        }
    }

    public static float c(String str) {
        if (a) {
            return f().b(str);
        }
        return 0.0f;
    }

    public static AsyncUpdates d() {
        return d;
    }

    public static boolean e() {
        return f11860c;
    }

    public static kbb f() {
        kbb kbbVar = i.get();
        if (kbbVar != null) {
            return kbbVar;
        }
        kbb kbbVar2 = new kbb();
        i.set(kbbVar2);
        return kbbVar2;
    }

    public static boolean g() {
        return a;
    }

    public static /* synthetic */ File h(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    @Nullable
    public static ioc i(@NonNull Context context) {
        if (!b) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        ioc iocVar = h;
        if (iocVar == null) {
            synchronized (ioc.class) {
                iocVar = h;
                if (iocVar == null) {
                    abb abbVar = f;
                    if (abbVar == null) {
                        abbVar = new abb() { // from class: com.oplus.aiunit.vision.qpa
                            @Override // com.oplus.aiunit.vision.abb
                            public final File a() {
                                return gqa.h(applicationContext);
                            }
                        };
                    }
                    iocVar = new ioc(abbVar);
                    h = iocVar;
                }
            }
        }
        return iocVar;
    }

    @NonNull
    public static roc j(@NonNull Context context) {
        roc rocVar = g;
        if (rocVar == null) {
            synchronized (roc.class) {
                rocVar = g;
                if (rocVar == null) {
                    ioc iocVarI = i(context);
                    bbb b55Var = f11861e;
                    if (b55Var == null) {
                        b55Var = new b55();
                    }
                    rocVar = new roc(iocVarI, b55Var);
                    g = rocVar;
                }
            }
        }
        return rocVar;
    }
}
