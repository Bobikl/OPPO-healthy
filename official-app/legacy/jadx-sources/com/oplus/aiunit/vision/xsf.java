package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class xsf implements btf<Uri, Bitmap> {
    public final dtf a;
    public final kf1 b;

    public xsf(dtf dtfVar, kf1 kf1Var) {
        this.a = dtfVar;
        this.b = kf1Var;
    }

    @Override // com.oplus.aiunit.vision.btf
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        usf<Drawable> usfVarA = this.a.a(uri, i, i2, erdVar);
        if (usfVarA == null) {
            return null;
        }
        return d56.a(this.b, usfVarA.get(), i, i2);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull erd erdVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
