package com.heytap.voiceassistant.sdk.tts.closure.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.heytap.voiceassistant.sdk.tts.HeytapTtsEngine;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements g {
    public String a;
    public Handler b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ITtsStreamListener f8384c;

    public f(String str, ITtsStreamListener iTtsStreamListener) {
        this.a = str;
        this.f8384c = iTtsStreamListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f8384c.onEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f8384c.onSpeakBegin();
    }

    public void c() {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.cum
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a();
            }
        });
    }

    public void d() {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.aum
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        this.f8384c.onSpeakPaused(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i) {
        this.f8384c.onSpeakResumed(i);
    }

    public void c(final int i) {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.ytm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(i);
            }
        });
    }

    public void d(final int i) {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.wtm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, int i2, int i3, Bundle bundle) {
        this.f8384c.onEvent(i, i2, i3, bundle);
    }

    public void b(final int i, final int i2, final int i3, final Bundle bundle) {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.utm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(i, i2, i3, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SpeechException speechException) {
        this.f8384c.onCompleted(speechException);
    }

    public void b(final SpeechException speechException) {
        this.b.post(new Runnable() { // from class: com.oplus.aiunit.vision.stm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a(speechException);
            }
        });
        if (HeytapTtsEngine.getsStreamTtsLifeCycleListener() == null || speechException == null) {
            return;
        }
        HeytapTtsEngine.getsStreamTtsLifeCycleListener().onError(this.a, speechException.getErrorCode(), speechException.getErrorDescription());
    }
}
