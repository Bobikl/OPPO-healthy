package com.heytap.voiceassistant.sdk.tts.closure.c;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import com.heytap.voiceassistant.sdk.tts.net.WebSocketStreamWrapper;
import com.oplus.smartenginehelper.entity.TextEntity;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static final Object f = new Object();
    public static volatile int g;
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile com.heytap.voiceassistant.sdk.tts.closure.f.c f8379c;
    public Context d;
    public final Object a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile HandlerThread f8380e = null;

    public a(Context context) {
        this.d = context;
    }

    public static boolean d() {
        boolean z;
        synchronized (f) {
            if (20 <= g) {
                Logger.error("HeytapSpeechStreamSynthesizer", "too many thread, mThreadNum = " + g + ", MAX_THREAD_NUM = 20");
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void a(g gVar) {
        synchronized (this.a) {
            if (this.f8379c != null && !this.f8379c.d()) {
                this.f8379c.c(false);
            }
            HandlerThread handlerThreadA = a("TtsSession");
            if (handlerThreadA == null) {
                f fVar = (f) gVar;
                fVar.b(new SpeechException(10101, "create session thread failed"));
                fVar.c();
            } else {
                WebSocketStreamWrapper.getInstance().connect();
                this.f8379c = new com.heytap.voiceassistant.sdk.tts.closure.f.c(this.d, this.b, handlerThreadA);
                this.f8379c.a(gVar);
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            Logger.print("HeytapSpeechStreamSynthesizer", "destroy");
            z = false;
            for (int i = 0; i < 40; i++) {
                if (this.f8379c == null || this.f8379c.d()) {
                    if (this.f8380e != null && this.f8380e.isAlive()) {
                        HandlerThread handlerThread = this.f8380e;
                        this.f8380e = null;
                        handlerThread.interrupt();
                    }
                    z = true;
                } else {
                    this.f8379c.c(false);
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

    public void c() {
        synchronized (this.a) {
            if (this.f8379c != null && this.f8379c.b()) {
                com.heytap.voiceassistant.sdk.tts.closure.f.c cVar = this.f8379c;
                synchronized (cVar) {
                    Logger.print("TtsStreamSession", TextEntity.ELLIPSIZE_END);
                    try {
                        cVar.a(cVar.obtainMessage(7), 2, 0);
                    } catch (Exception unused) {
                        Logger.error("TtsStreamSession", "error");
                    }
                }
            }
        }
    }

    public boolean e() {
        return !(this.f8379c == null || this.f8379c.d());
    }

    public void a() {
        synchronized (this.a) {
            if (this.f8379c != null && this.f8379c.b()) {
                com.heytap.voiceassistant.sdk.tts.closure.f.c cVar = this.f8379c;
                synchronized (cVar) {
                    Logger.print("TtsStreamSession", "cancel");
                    try {
                        cVar.a(cVar.obtainMessage(8), 2, 0);
                    } catch (Exception unused) {
                        Logger.error("TtsStreamSession", "error");
                    }
                }
            }
        }
    }

    public void b(boolean z) {
        synchronized (this.a) {
            if (this.f8379c != null && this.f8379c.b()) {
                com.heytap.voiceassistant.sdk.tts.closure.f.c cVar = this.f8379c;
                synchronized (cVar) {
                    try {
                        cVar.a(cVar.obtainMessage(z ? 6 : 15), 2, 0);
                    } catch (Exception unused) {
                        Logger.error("TtsStreamSession", "error");
                    }
                }
            }
        }
    }

    public final HandlerThread a(String str) {
        HandlerThread handlerThread = null;
        if (d()) {
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
                    Logger.error("HeytapSpeechStreamSynthesizer", "", e);
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        this.f8380e = handlerThread;
        return handlerThread;
    }

    public void a(boolean z) {
        synchronized (this.a) {
            if (this.f8379c != null && this.f8379c.b()) {
                com.heytap.voiceassistant.sdk.tts.closure.f.c cVar = this.f8379c;
                synchronized (cVar) {
                    try {
                        if (cVar.e()) {
                            cVar.a(cVar.obtainMessage(z ? 5 : 14), 2, 0);
                            cVar.removeMessages(9);
                        }
                    } catch (Exception unused) {
                        Logger.error("TtsStreamSession", "error");
                    }
                }
            }
        }
    }
}
