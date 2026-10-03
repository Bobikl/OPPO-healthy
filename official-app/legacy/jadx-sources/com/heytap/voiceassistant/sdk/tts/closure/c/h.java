package com.heytap.voiceassistant.sdk.tts.closure.c;

import android.os.Handler;
import android.os.Looper;
import com.heytap.voiceassistant.sdk.tts.HeytapTtsEngine;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.callback.ITtsListener;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements c {
    public String a;
    public Handler b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ITtsListener f8385c;

    public h(String str, ITtsListener iTtsListener) {
        this.a = str;
        this.f8385c = iTtsListener;
    }

    public void h() {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.rym
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f8385c.onEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f8385c.onSpeakBegin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f8385c.onSpeakPaused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8385c.onSpeakResumed();
    }

    public void e() {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.pym
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a();
            }
        });
    }

    public void f() {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.uym
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b();
            }
        });
    }

    public void g() {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.qym
            @Override // java.lang.Runnable
            public final void run() {
                this.i.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, int i2, int i3) {
        this.f8385c.onSpeakProgress(i, i2, i3);
    }

    public void b(final int i, final int i2, final int i3) {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.tym
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(i, i2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, int i2, int i3, String str) {
        this.f8385c.onBufferProgress(i, i2, i3, str);
    }

    public void b(final int i, final int i2, final int i3, String str) {
        final String str2 = null;
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.sym
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(i, i2, i3, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SpeechException speechException) {
        this.f8385c.onCompleted(speechException);
    }

    public void b(final SpeechException speechException) {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.oym
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(speechException);
            }
        });
        if (HeytapTtsEngine.getTtsLifeCycleListener() == null || speechException == null) {
            return;
        }
        HeytapTtsEngine.getTtsLifeCycleListener().onError(this.a, speechException.getErrorCode(), speechException.getErrorDescription());
    }
}
