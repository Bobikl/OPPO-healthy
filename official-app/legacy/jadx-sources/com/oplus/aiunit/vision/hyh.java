package com.oplus.aiunit.vision;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class hyh {
    public MediaPlayer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f12310c;
    public Runnable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hle f12311e;
    public String g;
    public int h;
    public AudioManager i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AudioFocusRequest f12312j;
    public final String a = "MediaPlayerUtil";
    public boolean f = false;
    public final Object k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f12313l = new Handler();
    public AudioManager.OnAudioFocusChangeListener m = new AudioManager.OnAudioFocusChangeListener() { // from class: com.oplus.aiunit.vision.cyh
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            this.i.j(i);
        }
    };

    public hyh() {
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(MediaPlayer mediaPlayer) {
        String str;
        t();
        this.h = 0;
        hle hleVar = this.f12311e;
        if (hleVar != null && (str = this.g) != null) {
            hleVar.b(str, 0);
            this.f12311e.c(this.g);
        }
        this.i.abandonAudioFocusRequest(this.f12312j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(MediaPlayer mediaPlayer) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        a7b.f("MediaPlayerUtil", "listener player error:" + i + "/" + i2);
        hle hleVar = this.f12311e;
        if (hleVar != null && (str = this.g) != null) {
            hleVar.a(str);
        }
        m();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(int i) {
        a7b.f("MediaPlayerUtil", "focusChangeListener:" + i + "/thread:" + Thread.currentThread().getId());
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
        sb.append(this.f);
        if (this.f) {
            return;
        }
        u();
    }

    public final void f() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.b = mediaPlayer;
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.dyh
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.i.g(mediaPlayer2);
            }
        });
        this.b.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.eyh
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.i.h(mediaPlayer2);
            }
        });
        this.b.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.oplus.aiunit.vision.fyh
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.i.i(mediaPlayer2, i, i2);
            }
        });
        this.i = (AudioManager) b78.a().getSystemService("audio");
        this.f12312j = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.m, this.f12313l).build();
    }

    public final void l() {
        String str;
        m();
        hle hleVar = this.f12311e;
        if (hleVar == null || (str = this.g) == null) {
            return;
        }
        hleVar.a(str);
    }

    public void m() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            this.f = true;
            t();
        }
    }

    public final boolean n() {
        try {
            this.b.reset();
            this.b.setDataSource(this.g);
            this.b.prepare();
            if (this.h > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("seekTo:");
                sb.append(this.h);
                this.b.seekTo(this.h);
            }
            return q();
        } catch (IOException e2) {
            this.g = null;
            a7b.f("MediaPlayerUtil", "startPlay error:" + e2.getMessage());
            return false;
        }
    }

    public void o() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.b.release();
            this.b = null;
        }
        this.i.abandonAudioFocusRequest(this.f12312j);
        t();
    }

    public void p(hle hleVar) {
        this.f12311e = hleVar;
    }

    public final boolean q() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer == null || mediaPlayer.isPlaying()) {
            a7b.f("MediaPlayerUtil", "startPlay mMediaPlayer state error");
            return false;
        }
        this.b.start();
        this.f = false;
        s();
        return true;
    }

    public boolean r(String str) {
        boolean zN = false;
        if (str == null || str.isEmpty()) {
            a7b.f("MediaPlayerUtil", "path is empty");
            return false;
        }
        if (!TextUtils.equals(this.g, str)) {
            this.h = 0;
        }
        this.g = str;
        int iRequestAudioFocus = this.i.requestAudioFocus(this.f12312j);
        a7b.f("MediaPlayerUtil", "requestAudioFocus res:" + iRequestAudioFocus);
        synchronized (this.k) {
            try {
                if (iRequestAudioFocus != 0) {
                    if (iRequestAudioFocus == 1) {
                        zN = n();
                    } else if (iRequestAudioFocus == 2) {
                        this.i.abandonAudioFocusRequest(this.f12312j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zN;
    }

    public final void s() {
        this.f12310c = zq8.f();
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.gyh
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k();
            }
        };
        this.d = runnable;
        this.f12310c.scheduleAtFixedRate(runnable, 0L, 1L, TimeUnit.SECONDS);
    }

    public final void t() {
        ScheduledExecutorService scheduledExecutorService = this.f12310c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f12310c = null;
            this.d = null;
        }
    }

    public final void u() {
        String str;
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        int currentPosition = this.b.getCurrentPosition();
        int duration = this.b.getDuration();
        this.h = currentPosition;
        int i = (int) (((currentPosition * 1.0f) / duration) * 100.0f);
        StringBuilder sb = new StringBuilder();
        sb.append("playing duration:");
        sb.append(duration);
        sb.append("/current:");
        sb.append(currentPosition);
        sb.append("/progress:");
        sb.append(i);
        hle hleVar = this.f12311e;
        if (hleVar == null || (str = this.g) == null) {
            return;
        }
        hleVar.b(str, i);
    }
}
