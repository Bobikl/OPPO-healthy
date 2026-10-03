package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class obb implements kf1 {
    public static final Bitmap.Config k = Bitmap.Config.ARGB_8888;
    public final rbb a;
    public final Set<Bitmap.Config> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14872c;
    public final a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14873e;
    public long f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14874j;

    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static final class b implements a {
        @Override // com.oplus.aiunit.vision.obb.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.oplus.aiunit.vision.obb.a
        public void b(Bitmap bitmap) {
        }
    }

    public obb(long j2, rbb rbbVar, Set<Bitmap.Config> set) {
        this.f14872c = j2;
        this.f14873e = j2;
        this.a = rbbVar;
        this.b = set;
        this.d = new b();
    }

    @TargetApi(26)
    public static void e(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    @NonNull
    public static Bitmap f(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    public static Set<Bitmap.Config> j() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    public static rbb k() {
        return new j7h();
    }

    @TargetApi(19)
    public static void n(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void o(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        n(bitmap);
    }

    @Override // com.oplus.aiunit.vision.kf1
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            p(m() / 2);
        }
    }

    @Override // com.oplus.aiunit.vision.kf1
    public synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.a.d(bitmap) <= this.f14873e && this.b.contains(bitmap.getConfig())) {
                int iD = this.a.d(bitmap);
                this.a.b(bitmap);
                this.d.a(bitmap);
                this.i++;
                this.f += (long) iD;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.a.e(bitmap));
                }
                g();
                i();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.kf1
    @NonNull
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapL = l(i, i2, config);
        if (bitmapL == null) {
            return f(i, i2, config);
        }
        bitmapL.eraseColor(0);
        return bitmapL;
    }

    @Override // com.oplus.aiunit.vision.kf1
    public void clearMemory() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        p(0L);
    }

    @Override // com.oplus.aiunit.vision.kf1
    @NonNull
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapL = l(i, i2, config);
        return bitmapL == null ? f(i, i2, config) : bitmapL;
    }

    public final void g() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            h();
        }
    }

    public final void h() {
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.f14874j + ", currentSize=" + this.f + ", maxSize=" + this.f14873e + "\nStrategy=" + this.a);
    }

    public final void i() {
        p(this.f14873e);
    }

    @Nullable
    public final synchronized Bitmap l(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap bitmapC;
        e(config);
        bitmapC = this.a.c(i, i2, config != null ? config : k);
        if (bitmapC == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.a.a(i, i2, config));
            }
            this.h++;
        } else {
            this.g++;
            this.f -= (long) this.a.d(bitmapC);
            this.d.b(bitmapC);
            o(bitmapC);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.a.a(i, i2, config));
        }
        g();
        return bitmapC;
    }

    public long m() {
        return this.f14873e;
    }

    public final synchronized void p(long j2) {
        while (this.f > j2) {
            Bitmap bitmapRemoveLast = this.a.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    h();
                }
                this.f = 0L;
                return;
            }
            this.d.b(bitmapRemoveLast);
            this.f -= (long) this.a.d(bitmapRemoveLast);
            this.f14874j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.a.e(bitmapRemoveLast));
            }
            g();
            bitmapRemoveLast.recycle();
        }
    }

    public obb(long j2) {
        this(j2, k(), j());
    }
}
