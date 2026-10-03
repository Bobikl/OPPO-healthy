package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class c4l implements SoundPool.OnLoadCompleteListener {
    public SoundPool a;
    public HashMap<String, Integer> b = new HashMap<>();

    public c4l() {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(3);
        builder.setContentType(2);
        if (Build.VERSION.SDK_INT >= 32) {
            builder.setIsContentSpatialized(true);
        }
        SoundPool.Builder builder2 = new SoundPool.Builder();
        builder2.setMaxStreams(10);
        builder2.setAudioAttributes(builder.build());
        this.a = builder2.build();
        a();
    }

    public final void a() {
        a7b.f("VoicePlayer", "loadRes:");
    }

    public void b() {
        this.a.autoPause();
    }

    public void c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (this.b.get(str2) == null) {
                a7b.f("VoicePlayer", "get(name) == null");
                if (new File(str + str2).exists()) {
                    Integer numValueOf = Integer.valueOf(this.a.load(str + str2, 0));
                    this.a.setOnLoadCompleteListener(this);
                    this.b.put(str2, numValueOf);
                } else {
                    a7b.f("VoicePlayer", "play voice file not exists!");
                }
            } else {
                Integer num = this.b.get(str2);
                if (num != null) {
                    d(num.intValue());
                }
            }
        } catch (Resources.NotFoundException unused) {
            a7b.b("VoicePlayer", "Resources not found : name = " + str2);
        }
    }

    public final synchronized void d(int i) {
        a7b.f("VoicePlayer", "playInternal:" + i);
        this.a.autoPause();
        this.a.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void e(Context context, int i, int i2) {
        int iLoad = this.a.load(context, i, 1);
        this.a.autoPause();
        this.a.play(iLoad, 1.0f, 1.0f, 0, i2, 1.0f);
    }

    public void f(String str, String str2) {
        a7b.f("VoicePlayer", "preload voice");
        if (TextUtils.isEmpty(str2) || this.b.get(str2) != null) {
            return;
        }
        if (!new File(str + str2).exists()) {
            a7b.f("VoicePlayer", "preload voice file not exists!");
            return;
        }
        this.b.put(str2, Integer.valueOf(this.a.load(str + str2, 0)));
    }

    public void g() {
        SoundPool soundPool = this.a;
        if (soundPool != null) {
            soundPool.autoPause();
            this.a.release();
        }
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public void onLoadComplete(SoundPool soundPool, int i, int i2) {
        a7b.f("VoicePlayer", "onLoadComplete:" + i2);
        d(i);
    }
}
