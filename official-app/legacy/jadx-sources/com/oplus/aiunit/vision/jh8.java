package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class jh8 {

    @Deprecated
    public static final int NO_MAX_FD_COUNT = -1;
    public static volatile jh8 f;

    @GuardedBy("this")
    public int b;
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = false;

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean HARDWARE_BITMAPS_SUPPORTED = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final File f12903e = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f12904c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final int a = 20000;

    @VisibleForTesting
    public jh8() {
    }

    public static jh8 b() {
        if (f == null) {
            synchronized (jh8.class) {
                if (f == null) {
                    f = new jh8();
                }
            }
        }
        return f;
    }

    public static boolean e() {
        return false;
    }

    public final boolean a() {
        return BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED && !this.d.get();
    }

    public final int c() {
        if (e()) {
            return 500;
        }
        return this.a;
    }

    public final synchronized boolean d() {
        boolean z = true;
        int i = this.b + 1;
        this.b = i;
        if (i >= 50) {
            this.b = 0;
            int length = f12903e.list().length;
            long jC = c();
            if (length >= jC) {
                z = false;
            }
            this.f12904c = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
            }
        }
        return this.f12904c;
    }

    public boolean f(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!HARDWARE_BITMAPS_SUPPORTED) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i < 0 || i2 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    public boolean g(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zF = f(i, i2, z, z2);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        uqk.b();
        this.d.set(true);
    }
}
