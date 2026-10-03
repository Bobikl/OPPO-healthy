package com.oplus.aiunit.vision;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class a4l {
    public MediaPlayer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f9194c;
    public Runnable d;
    public int f;
    public AudioManager g;
    public AudioFocusRequest h;
    public String k;
    public final String a = "VoiceMediaPlayer";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9195e = false;
    public final Object i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f9196j = new Handler();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<MediaPlayer.OnCompletionListener> f9197l = new ArrayList<>();
    public final AudioManager.OnAudioFocusChangeListener m = new AudioManager.OnAudioFocusChangeListener() { // from class: com.oplus.aiunit.vision.v3l
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            this.i.j(i);
        }
    };

    public a4l() {
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(MediaPlayer mediaPlayer) {
        s();
        this.f = 0;
        this.g.abandonAudioFocusRequest(this.h);
        Iterator<MediaPlayer.OnCompletionListener> it = this.f9197l.iterator();
        while (it.hasNext()) {
            it.next().onCompletion(mediaPlayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(MediaPlayer mediaPlayer) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(MediaPlayer mediaPlayer, int i, int i2) {
        a7b.f("VoiceMediaPlayer", "listener player error:" + i + "/" + i2);
        m();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i) {
        a7b.f("VoiceMediaPlayer", "focusChangeListener:" + i + "/thread:" + Thread.currentThread().getId());
        if (i == -1) {
            l();
        } else if (i == -2) {
            l();
        } else if (i == -3) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        StringBuilder sb = new StringBuilder();
        sb.append("runnable:");
        sb.append(this.f9195e);
        if (this.f9195e) {
            return;
        }
        t();
    }

    public void addOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        if (this.f9197l.contains(onCompletionListener)) {
            return;
        }
        this.f9197l.add(onCompletionListener);
    }

    public final void f() {
        this.b = new MediaPlayer();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        if (Build.VERSION.SDK_INT >= 32) {
            builder.setIsContentSpatialized(true);
        }
        this.b.setAudioAttributes(builder.build());
        this.b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.w3l
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.i.g(mediaPlayer);
            }
        });
        this.b.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.x3l
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                this.i.h(mediaPlayer);
            }
        });
        this.b.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.oplus.aiunit.vision.y3l
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return this.i.i(mediaPlayer, i, i2);
            }
        });
        this.g = (AudioManager) b78.a().getSystemService("audio");
        this.h = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.m, this.f9196j).build();
    }

    public final void l() {
        m();
    }

    public void m() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            this.f9195e = true;
            s();
        }
    }

    public boolean n(String str, String str2) {
        this.k = str + str2;
        return o(false);
    }

    public final boolean o(boolean z) {
        try {
            this.b.reset();
            this.b.setDataSource(this.k);
            this.b.prepare();
            if (z && this.f > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("seekTo:");
                sb.append(this.f);
                this.b.seekTo(this.f);
            }
            return q();
        } catch (IOException e2) {
            a7b.f("VoiceMediaPlayer", "startPlay error:" + e2.getMessage());
            return false;
        }
    }

    public void p() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.b.release();
            this.b = null;
        }
        this.f9197l.clear();
        this.g.abandonAudioFocusRequest(this.h);
        s();
    }

    public final boolean q() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer == null || mediaPlayer.isPlaying()) {
            a7b.f("VoiceMediaPlayer", "startPlay mMediaPlayer state error");
            return false;
        }
        this.b.start();
        this.f9195e = false;
        r();
        return true;
    }

    public final void r() {
        this.f9194c = zq8.f();
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.z3l
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k();
            }
        };
        this.d = runnable;
        this.f9194c.scheduleAtFixedRate(runnable, 0L, 1L, TimeUnit.SECONDS);
    }

    public final void s() {
        ScheduledExecutorService scheduledExecutorService = this.f9194c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f9194c = null;
            this.d = null;
        }
    }

    public final void t() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        int currentPosition = this.b.getCurrentPosition();
        int duration = this.b.getDuration();
        this.f = currentPosition;
        StringBuilder sb = new StringBuilder();
        sb.append("playing duration:");
        sb.append(duration);
        sb.append("/current:");
        sb.append(currentPosition);
        sb.append("/progress:");
        sb.append((int) (((currentPosition * 1.0f) / duration) * 100.0f));
    }
}
