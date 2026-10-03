package com.oplus.aiunit.vision;

import android.media.MediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class w20 implements t8c, MediaPlayer.OnCompletionListener {
    public final w10 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaPlayer f18082j;
    public boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18083l = false;
    public float m = 1.0f;

    public w20(w10 w10Var, MediaPlayer mediaPlayer) {
        this.i = w10Var;
        this.f18082j = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this);
    }

    public boolean b() {
        MediaPlayer mediaPlayer = this.f18082j;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            return mediaPlayer.isPlaying();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        MediaPlayer mediaPlayer = this.f18082j;
        if (mediaPlayer == null) {
            return;
        }
        try {
            try {
                mediaPlayer.release();
            } catch (Throwable unused) {
                x38.app.c("AndroidMusic", "error while disposing AndroidMusic instance, non-fatal");
            }
        } finally {
            this.f18082j = null;
            this.i.h(this);
        }
    }

    public void i() {
        MediaPlayer mediaPlayer = this.f18082j;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (!this.k) {
                mediaPlayer.prepare();
                this.k = true;
            }
            this.f18082j.start();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f18082j;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                this.f18082j.pause();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        this.f18083l = false;
    }

    @Override // com.oplus.aiunit.vision.t8c
    public void setOnCompletionListener(t8c.a aVar) {
    }
}
