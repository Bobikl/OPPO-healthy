package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class e8c<T> implements x9k<T> {
    public final Collection<? extends x9k<T>> a;

    @SafeVarargs
    public e8c(@NonNull x9k<T>... x9kVarArr) {
        if (x9kVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.a = Arrays.asList(x9kVarArr);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (obj instanceof e8c) {
            return this.a.equals(((e8c) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.oplus.aiunit.vision.x9k
    @NonNull
    public usf<T> transform(@NonNull Context context, @NonNull usf<T> usfVar, int i, int i2) {
        Iterator<? extends x9k<T>> it = this.a.iterator();
        usf<T> usfVar2 = usfVar;
        while (it.hasNext()) {
            usf<T> usfVarTransform = it.next().transform(context, usfVar2, i, i2);
            if (usfVar2 != null && !usfVar2.equals(usfVar) && !usfVar2.equals(usfVarTransform)) {
                usfVar2.recycle();
            }
            usfVar2 = usfVarTransform;
        }
        return usfVar2;
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        Iterator<? extends x9k<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().updateDiskCacheKey(messageDigest);
        }
    }
}
