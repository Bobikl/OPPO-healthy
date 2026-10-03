package com.oplus.aiunit.vision;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class u2l {
    public final a a;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioManager f17272c;
    public AudioFocusRequest d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioAttributes f17273e;

    public interface a {
        void a();

        void b();

        void c();
    }

    public u2l(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("listener is null");
        }
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AudioManager audioManagerF;
        if (this.d == null || (audioManagerF = f()) == null) {
            return;
        }
        try {
            audioManagerF.abandonAudioFocusRequest(this.d);
        } catch (Exception e2) {
            a7b.c("VMEDIA_AudioFocus", "abandonFocus", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        try {
            atomicBoolean.set(l());
        } finally {
            countDownLatch.countDown();
        }
    }

    public void d() {
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.r2l
            @Override // java.lang.Runnable
            public final void run() {
                this.i.i();
            }
        };
        if (Looper.myLooper() == this.b.getLooper()) {
            runnable.run();
        } else {
            this.b.post(runnable);
        }
    }

    public final void e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onAudioFocusChange ");
        sb.append(i);
        if (i == -3 || i == -2) {
            this.a.c();
        } else if (i == -1) {
            this.a.b();
        } else {
            if (i != 1) {
                return;
            }
            this.a.a();
        }
    }

    public final AudioManager f() {
        if (this.f17272c == null) {
            Context contextA = b78.a();
            if (contextA == null) {
                a7b.b("VMEDIA_AudioFocus", "getAudioManager: GlobalApplicationHolder context is null");
                return null;
            }
            this.f17272c = (AudioManager) contextA.getSystemService("audio");
        }
        return this.f17272c;
    }

    public final AudioFocusRequest g() {
        if (this.d == null) {
            this.d = new AudioFocusRequest.Builder(3).setAudioAttributes(h()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.oplus.aiunit.vision.t2l
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    this.i.e(i);
                }
            }, this.b).build();
        }
        return this.d;
    }

    public AudioAttributes h() {
        if (this.f17273e == null) {
            this.f17273e = new AudioAttributes.Builder().setUsage(12).setContentType(2).build();
        }
        return this.f17273e;
    }

    public boolean k() {
        if (Looper.myLooper() == this.b.getLooper()) {
            return l();
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.s2l
            @Override // java.lang.Runnable
            public final void run() {
                this.i.j(atomicBoolean, countDownLatch);
            }
        });
        try {
            if (countDownLatch.await(3L, TimeUnit.SECONDS)) {
                return atomicBoolean.get();
            }
            a7b.m("VMEDIA_AudioFocus", "requestFocus await main timeout");
            return false;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean l() {
        AudioManager audioManagerF = f();
        if (audioManagerF == null) {
            return false;
        }
        int iRequestAudioFocus = audioManagerF.requestAudioFocus(g());
        if (iRequestAudioFocus == 1) {
            return true;
        }
        if (iRequestAudioFocus == 2) {
            return false;
        }
        a7b.m("VMEDIA_AudioFocus", "requestAudioFocus not granted, code=" + iRequestAudioFocus);
        return false;
    }
}
