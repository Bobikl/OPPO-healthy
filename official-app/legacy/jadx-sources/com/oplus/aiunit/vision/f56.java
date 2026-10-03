package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public final class f56 extends qak<f56, Drawable> {
    @NonNull
    public static f56 j(int i) {
        return new f56().e(i);
    }

    @NonNull
    public f56 e(int i) {
        return f(new v46.a(i));
    }

    @Override // com.oplus.aiunit.vision.qak
    public boolean equals(Object obj) {
        return (obj instanceof f56) && super.equals(obj);
    }

    @NonNull
    public f56 f(@NonNull v46.a aVar) {
        return i(aVar.a());
    }

    @Override // com.oplus.aiunit.vision.qak
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public f56 i(@NonNull v46 v46Var) {
        return d(v46Var);
    }
}
