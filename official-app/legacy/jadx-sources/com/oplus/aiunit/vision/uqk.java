package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes13.dex */
public final class uqk {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile Handler f17568c;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!t()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@Nullable u81<?> u81Var, @Nullable u81<?> u81Var2) {
        if (u81Var == null) {
            return u81Var2 == null;
        }
        return u81Var.P(u81Var2);
    }

    public static boolean d(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof h2c ? ((h2c) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean e(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    public static String f(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    @NonNull
    public static <T> Queue<T> g(int i) {
        return new ArrayDeque(i);
    }

    public static int h(int i, int i2, @Nullable Bitmap.Config config) {
        return i * i2 * j(config);
    }

    @TargetApi(19)
    public static int i(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int j(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @NonNull
    public static <T> List<T> k(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static Handler l() {
        if (f17568c == null) {
            synchronized (uqk.class) {
                if (f17568c == null) {
                    f17568c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f17568c;
    }

    public static int m(float f) {
        return n(f, 17);
    }

    public static int n(float f, int i) {
        return p(Float.floatToIntBits(f), i);
    }

    public static int o(int i) {
        return p(i, 17);
    }

    public static int p(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int q(@Nullable Object obj, int i) {
        return p(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int r(boolean z, int i) {
        return p(z ? 1 : 0, i);
    }

    public static boolean s() {
        return !t();
    }

    public static boolean t() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean u(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean v(int i, int i2) {
        return u(i) && u(i2);
    }

    public static void w(Runnable runnable) {
        l().post(runnable);
    }

    public static void x(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    @NonNull
    public static String y(@NonNull byte[] bArr) {
        String strF;
        char[] cArr = b;
        synchronized (cArr) {
            strF = f(bArr, cArr);
        }
        return strF;
    }
}
