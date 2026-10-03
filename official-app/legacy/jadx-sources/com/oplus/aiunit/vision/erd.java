package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class erd implements ona {
    public final ArrayMap<brd<?>, Object> a = new CachedHashCodeArrayMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(@NonNull brd<T> brdVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        brdVar.g(obj, messageDigest);
    }

    @Nullable
    public <T> T a(@NonNull brd<T> brdVar) {
        return this.a.containsKey(brdVar) ? (T) this.a.get(brdVar) : brdVar.c();
    }

    public void b(@NonNull erd erdVar) {
        this.a.putAll((SimpleArrayMap<? extends brd<?>, ? extends Object>) erdVar.a);
    }

    public erd c(@NonNull brd<?> brdVar) {
        this.a.remove(brdVar);
        return this;
    }

    @NonNull
    public <T> erd d(@NonNull brd<T> brdVar, @NonNull T t) {
        this.a.put(brdVar, t);
        return this;
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (obj instanceof erd) {
            return this.a.equals(((erd) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.a + '}';
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.a.getSize(); i++) {
            e(this.a.keyAt(i), this.a.valueAt(i), messageDigest);
        }
    }
}
