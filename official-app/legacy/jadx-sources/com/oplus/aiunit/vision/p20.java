package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes13.dex */
public class p20 {
    public final Vibrator a;
    public AudioAttributes b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15158c;
    public boolean d;

    public p20(Context context) {
        this.f15158c = false;
        this.d = false;
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        this.a = vibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.f15158c = true;
        if (vibrator.hasAmplitudeControl()) {
            this.d = true;
        }
        this.b = new AudioAttributes.Builder().setContentType(4).setUsage(14).build();
    }

    @SuppressLint({"MissingPermission"})
    public void a(int i) {
        if (this.f15158c) {
            this.a.vibrate(VibrationEffect.createOneShot(i, -1));
        }
    }

    @SuppressLint({"MissingPermission"})
    public void b(int i, int i2, boolean z) {
        if (this.d) {
            this.a.vibrate(VibrationEffect.createOneShot(i, onb.d(i2, 0, 255)));
        } else if (z) {
            a(i);
        }
    }
}
