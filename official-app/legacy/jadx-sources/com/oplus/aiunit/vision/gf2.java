package com.oplus.aiunit.vision;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes13.dex */
public class gf2 {
    public static final int FLAG_BYPASS_MUTE = 128;
    public static final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static gf2 f11739e;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile SoundPool f11740c = null;
    public final SparseIntArray a = new SparseIntArray();

    static {
        d = bj2.LOG_DEBUG || bj2.e("COUIAsyncSoundUtil", 3);
    }

    public gf2(Context context) {
        this.b = context.getApplicationContext();
    }

    public static void b() {
        if (f11739e.f11740c == null) {
            if (d) {
                Log.d("COUIAsyncSoundUtil", "init sound pool");
            }
            f11739e.c();
        }
    }

    public static /* synthetic */ void d(int[] iArr) {
        b();
        if (d) {
            Log.d("COUIAsyncSoundUtil", "sound pool initialized, load sound file");
        }
        for (int i : iArr) {
            gf2 gf2Var = f11739e;
            gf2Var.e(gf2Var.b, i);
        }
    }

    public static void f(Context context, int i, float f, float f2, int i2, int i3, float f3) {
        if (f11739e.f11740c == null || !h(context)) {
            return;
        }
        f11739e.g(i, f, f2, i2, i3, f3);
    }

    public static boolean h(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "sound_effects_enabled", 0) != 0;
    }

    public static void i(Context context, final int... iArr) {
        boolean z = d;
        if (z) {
            Log.d("COUIAsyncSoundUtil", "register, sound file num: " + iArr.length);
        }
        if (f11739e == null) {
            if (z) {
                Log.d("COUIAsyncSoundUtil", "init util");
            }
            f11739e = new gf2(context);
        }
        jn2.f(1).i(new Runnable() { // from class: com.oplus.aiunit.vision.ff2
            @Override // java.lang.Runnable
            public final void run() {
                gf2.d(iArr);
            }
        });
    }

    @WorkerThread
    public final void c() {
        boolean z = d;
        if (z) {
            Log.d("COUIAsyncSoundUtil", "init sound pool begin");
        }
        SoundPool.Builder builder = new SoundPool.Builder();
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setFlags(128).setLegacyStreamType(1).build();
        builder.setMaxStreams(10);
        builder.setAudioAttributes(audioAttributesBuild);
        this.f11740c = builder.build();
        if (z) {
            Log.d("COUIAsyncSoundUtil", "init sound pool end");
        }
    }

    @WorkerThread
    public final void e(Context context, int i) {
        boolean z = d;
        if (z) {
            Log.d("COUIAsyncSoundUtil", "load sound file id = " + i);
        }
        if (this.a.indexOfKey(i) < 0 || this.a.get(i) == 0) {
            this.a.put(i, this.f11740c.load(context, i, 0));
        } else if (z) {
            Log.d("COUIAsyncSoundUtil", i + " already loaded");
        }
    }

    public final void g(int i, float f, float f2, int i2, int i3, float f3) {
        int i4 = this.a.get(i);
        if (d) {
            Log.d("COUIAsyncSoundUtil", "soundId = " + i4);
        }
        if (i4 != 0) {
            this.f11740c.play(i4, f, f2, i2, i3, f3);
        }
    }
}
