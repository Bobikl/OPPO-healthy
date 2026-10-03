package com.oplus.aiunit.vision;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.provider.Settings;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class rek {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static rek f16177c;
    public HashMap<Integer, Integer> a = new HashMap<>();
    public SoundPool b;

    public rek() {
        b();
    }

    public static synchronized rek a() {
        if (f16177c == null) {
            f16177c = new rek();
        }
        return f16177c;
    }

    public final void b() {
        SoundPool.Builder builder = new SoundPool.Builder();
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setLegacyStreamType(1).build();
        builder.setMaxStreams(1);
        builder.setAudioAttributes(audioAttributesBuild);
        this.b = builder.build();
    }

    public int c(Context context, int i) {
        if (this.a.containsKey(Integer.valueOf(i))) {
            return this.a.get(Integer.valueOf(i)).intValue();
        }
        int iLoad = this.b.load(context, i, 0);
        this.a.put(Integer.valueOf(i), Integer.valueOf(iLoad));
        return iLoad;
    }

    public void d(Context context, int i, float f, float f2, int i2, int i3, float f3) {
        if (e(context)) {
            this.b.play(i, f, f2, i2, i3, f3);
        }
    }

    public final boolean e(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "sound_effects_enabled", 0) != 0;
    }

    public void setCompleteListener(SoundPool.OnLoadCompleteListener onLoadCompleteListener) {
        this.b.setOnLoadCompleteListener(onLoadCompleteListener);
    }
}
