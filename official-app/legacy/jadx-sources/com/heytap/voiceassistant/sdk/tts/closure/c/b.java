package com.heytap.voiceassistant.sdk.tts.closure.c;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import com.heytap.voiceassistant.sdk.tts.net.WebSocketWrapper;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public static final Object f = new Object();
    public static volatile int g;
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile com.heytap.voiceassistant.sdk.tts.closure.f.a f8381c;
    public Context d;
    public final Object a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile HandlerThread f8382e = null;

    public b(Context context) {
        this.d = context;
    }

    public static boolean b() {
        boolean z;
        synchronized (f) {
            if (20 <= g) {
                Logger.error("HeytapSpeechSynthesizer", "too many thread, mThreadNum = " + g + ", MAX_THREAD_NUM = 20");
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void a(String str, c cVar) {
        synchronized (this.a) {
            if (this.f8381c != null && !this.f8381c.c()) {
                this.f8381c.a(false);
            }
            HandlerThread handlerThreadA = a("TtsSession");
            if (handlerThreadA == null) {
                h hVar = (h) cVar;
                hVar.b(new SpeechException(10101, "create session thread failed"));
                hVar.e();
            } else {
                WebSocketWrapper.getInstance().connect();
                this.f8381c = new com.heytap.voiceassistant.sdk.tts.closure.f.a(this.d, this.b, handlerThreadA);
                this.f8381c.a(str, cVar);
            }
        }
    }

    public boolean c() {
        return !(this.f8381c == null || this.f8381c.c());
    }

    public final HandlerThread a(String str) {
        HandlerThread handlerThread = null;
        if (b()) {
            try {
                HandlerThread handlerThread2 = new HandlerThread(str);
                try {
                    handlerThread2.start();
                    synchronized (f) {
                        g++;
                    }
                    handlerThread = handlerThread2;
                } catch (Exception e2) {
                    e = e2;
                    handlerThread = handlerThread2;
                    Logger.error("HeytapSpeechSynthesizer", "", e);
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        this.f8382e = handlerThread;
        return handlerThread;
    }

    public boolean a() {
        boolean z;
        synchronized (this.a) {
            Logger.print("HeytapSpeechSynthesizer", "destroy");
            z = false;
            for (int i = 0; i < 40; i++) {
                if (this.f8381c == null || this.f8381c.c()) {
                    if (this.f8382e != null && this.f8382e.isAlive()) {
                        HandlerThread handlerThread = this.f8382e;
                        this.f8382e = null;
                        handlerThread.interrupt();
                    }
                    z = true;
                } else {
                    this.f8381c.a(false);
                    z = false;
                }
                if (z) {
                    break;
                }
                SystemClock.sleep(40L);
            }
        }
        return z;
    }
}
