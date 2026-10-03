package com.oplus.aiunit.vision;

import android.os.Looper;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class xn0 {
    public static final y12 a = new y12() { // from class: com.oplus.aiunit.vision.wn0
        @Override // com.oplus.aiunit.vision.y12
        public final boolean getAsBoolean() {
            return xn0.c();
        }
    };

    public static boolean b() {
        return vn0.a(a);
    }

    public static /* synthetic */ boolean c() throws Throwable {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
