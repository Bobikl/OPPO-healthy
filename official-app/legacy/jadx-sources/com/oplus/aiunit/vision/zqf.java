package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class zqf extends u81<zqf> {

    @Nullable
    public static zqf I;

    @Nullable
    public static zqf J;

    @NonNull
    @CheckResult
    public static zqf C0(@NonNull x9k<Bitmap> x9kVar) {
        return new zqf().w0(x9kVar);
    }

    @NonNull
    @CheckResult
    public static zqf D0() {
        if (I == null) {
            I = new zqf().d().b();
        }
        return I;
    }

    @NonNull
    @CheckResult
    public static zqf E0() {
        if (J == null) {
            J = new zqf().e().b();
        }
        return J;
    }

    @NonNull
    @CheckResult
    public static zqf F0(@NonNull Class<?> cls) {
        return new zqf().i(cls);
    }

    @NonNull
    @CheckResult
    public static zqf G0(@NonNull ut5 ut5Var) {
        return new zqf().j(ut5Var);
    }

    @NonNull
    @CheckResult
    public static zqf H0(@DrawableRes int i) {
        return new zqf().q(i);
    }

    @NonNull
    @CheckResult
    public static zqf I0(@Nullable Drawable drawable) {
        return new zqf().i0(drawable);
    }

    @NonNull
    @CheckResult
    public static zqf J0(@NonNull ona onaVar) {
        return new zqf().q0(onaVar);
    }

    @Override // com.oplus.aiunit.vision.u81
    public boolean equals(Object obj) {
        return (obj instanceof zqf) && super.equals(obj);
    }

    @Override // com.oplus.aiunit.vision.u81
    public int hashCode() {
        return super.hashCode();
    }
}
