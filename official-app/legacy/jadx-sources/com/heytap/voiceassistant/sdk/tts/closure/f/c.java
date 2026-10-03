package com.heytap.voiceassistant.sdk.tts.closure.f;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.MemoryFile;
import android.os.Message;
import android.text.TextUtils;
import com.heytap.log.consts.BusinessType;
import com.heytap.voiceassistant.sdk.tts.HeytapTtsEngine;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.audio.BufferParagraphInfo;
import com.heytap.voiceassistant.sdk.tts.callback.StreamTtsLifeCycleListener;
import com.heytap.voiceassistant.sdk.tts.closure.b.e;
import com.heytap.voiceassistant.sdk.tts.closure.b.g;
import com.heytap.voiceassistant.sdk.tts.closure.c.f;
import com.heytap.voiceassistant.sdk.tts.closure.c.j;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import com.heytap.voiceassistant.sdk.tts.net.WebSocketStreamWrapper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class c extends Handler {
    public g.a A;
    public final j.b B;
    public final Object a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue<String> f8399c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8400e;
    public volatile boolean f;
    public Context g;
    public com.heytap.voiceassistant.sdk.tts.closure.c.d h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8401j;
    public volatile int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HandlerThread f8402l;
    public com.heytap.voiceassistant.sdk.tts.closure.c.g m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f8403n;
    public Boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;
    public g u;
    public e v;
    public List<byte[]> w;
    public volatile boolean x;
    public int y;
    public CopyOnWriteArrayList<String> z;

    public class b implements j.b {
        public b() {
        }

        public void a(int i, String str) {
            c.a(c.this, new SpeechException(i, str));
        }

        public void a(byte[] bArr, int i, boolean z) {
            c cVar = c.this;
            if (cVar.d()) {
                return;
            }
            cVar.b(z ? cVar.obtainMessage(10, 0, 1, null) : cVar.obtainMessage(10, i, 0, bArr));
        }

        public void a(byte[] bArr, int i, boolean z, Bundle bundle) {
            c cVar = c.this;
            if (cVar.d()) {
                return;
            }
            Message messageObtainMessage = z ? cVar.obtainMessage(10, 0, 1, null) : cVar.obtainMessage(10, i, 0, bArr);
            messageObtainMessage.setData(bundle);
            cVar.a(messageObtainMessage, 2, 0);
        }
    }

    public c(Context context, com.heytap.voiceassistant.sdk.tts.closure.c.d dVar, HandlerThread handlerThread) {
        super(handlerThread.getLooper());
        this.a = new Object();
        this.b = 0;
        this.f8399c = new ConcurrentLinkedQueue<>();
        this.f8400e = 8000;
        this.f = false;
        this.h = new com.heytap.voiceassistant.sdk.tts.closure.c.d();
        this.f8401j = true;
        this.k = 1;
        this.m = null;
        this.f8403n = null;
        this.o = null;
        this.p = false;
        this.q = true;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = false;
        this.y = -1;
        this.z = new CopyOnWriteArrayList<>();
        this.A = new a();
        this.B = new b();
        this.g = context;
        this.f8402l = handlerThread;
        d(dVar);
    }

    public final synchronized void a(int i) {
        if (this.k != 9 && (this.k != 8 || i == 9)) {
            StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("setStatus | ok, curStatus: ");
            sbA.append(d.a(this.k));
            sbA.append(", inStatus: ");
            sbA.append(d.a(i));
            Logger.debug("TtsStreamSession", sbA.toString());
            this.k = i;
        } else {
            StringBuilder sbA2 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("setStatus | fail, curStatus: ");
            sbA2.append(d.a(this.k));
            sbA2.append(", inStatus: ");
            sbA2.append(d.a(i));
            Logger.warn("TtsStreamSession", sbA2.toString());
        }
    }

    public final void b(Message message) {
        a(message, 2, 0);
    }

    public final void c(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) throws SpeechException {
        int i;
        Logger.print("TtsStreamSession", "endSpeak");
        j jVar = this.f8403n;
        jVar.getClass();
        try {
            WebSocketStreamWrapper.getInstance().send(jVar.d(dVar));
            i = 0;
        } catch (Exception unused) {
            Logger.error("TtsStreamCloudEngine", "end error!");
            i = SpeechErrorCode.ERROR_UNKNOWN;
        }
        Logger.print("TtsStreamSession", "endSpeak finish errorCode = " + i);
        if (i != 0) {
            throw new SpeechException(i);
        }
    }

    public boolean d() {
        return this.k == 1 || this.k == 8 || this.k == 9;
    }

    public final boolean e() {
        return this.k == 4 || this.k == 6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final void f() {
        char c2;
        Logger.debug("TtsStreamSession", "onCancel");
        if (c()) {
            this.f8403n.getClass();
            if (WebSocketStreamWrapper.getInstance().isConnected()) {
                c2 = 0;
            } else {
                c2 = 21006;
            }
        } else {
            c2 = 0;
        }
        if (c2 != 0) {
            Logger.error("TtsStreamSession", "cloud engine is unavailable");
        } else if (!d()) {
            com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = this.h.a();
            try {
                if (c() && !this.v.f8373n) {
                    a(dVarA);
                }
            } catch (SpeechException e2) {
                Logger.error("TtsStreamSession", "", e2);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, e2));
                }
            } catch (Exception e3) {
                Logger.error("TtsStreamSession", "", e3);
                Object speechException = new SpeechException(e3);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, speechException));
                }
            }
            this.p = true;
        }
        m();
        a();
        this.x = false;
    }

    public final void g() throws SpeechException {
        Logger.print("TtsStreamSession", "onInit");
        if (d()) {
            Logger.debug("TtsStreamSession", "isAvailable: true");
            return;
        }
        if (!c()) {
            throw new SpeechException(SpeechErrorCode.ERROR_ENGINE_NOT_SUPPORTED, "local engine is not supported currently");
        }
        if (!com.heytap.voiceassistant.sdk.tts.closure.g.b.a(this.g)) {
            throw new SpeechException(20001);
        }
        if (!WebSocketStreamWrapper.getInstance().isConnected()) {
            WebSocketStreamWrapper.getInstance().connect();
        } else if (this.f8403n == null) {
            throw new SpeechException(SpeechErrorCode.ERROR_ENGINE_INIT_FAIL);
        }
        this.w = new ArrayList();
        this.v = new e(this.g, this.d, this.h.a(SpeechConstant.KEY_SAMPLE_RATE, 16000), false);
        boolean zA = this.h.a(SpeechConstant.KEY_IS_LOG_AUDIO, false);
        this.h.a(SpeechConstant.KEY_IS_LOG_AUDIO);
        String str = this.h.a.get(SpeechConstant.KEY_AUDIO_LOG_PATH);
        this.h.a(SpeechConstant.KEY_AUDIO_LOG_PATH);
        int iA = this.h.a(SpeechConstant.KEY_AUDIO_LOG_MAX_COUNT, 10);
        this.h.a(SpeechConstant.KEY_AUDIO_LOG_MAX_COUNT);
        e eVar = this.v;
        eVar.u = zA;
        eVar.v = str;
        eVar.w = iA;
        boolean zA2 = this.h.a(SpeechConstant.KEY_IS_PLAY_SOUND, true);
        this.f8401j = zA2;
        if (zA2) {
            int iA2 = this.h.a(SpeechConstant.KEY_STREAM_TYPE, 3);
            boolean zA3 = this.h.a(SpeechConstant.KEY_IS_REQUEST_AUDIO_FOCUS, true);
            boolean zA4 = this.h.a(SpeechConstant.KEY_IS_AUDIO_FOCUS_LOSS_STOP, true);
            this.u = new g(this.g, iA2, zA3, this.h.a(SpeechConstant.KEY_FOCUS_DURATION_HINT, 2), zA4);
        } else {
            Logger.debug("TtsStreamSession", "not play sound");
        }
        a(obtainMessage(2), 1, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void h() {
        char c2;
        Logger.debug("TtsStreamSession", "onInputFinished");
        if (c()) {
            this.f8403n.getClass();
            if (WebSocketStreamWrapper.getInstance().isConnected()) {
                c2 = 0;
            } else {
                c2 = 21006;
            }
        } else {
            c2 = 0;
        }
        if (c2 != 0) {
            Logger.error("TtsStreamSession", "cloud engine is unavailable");
            return;
        }
        if (d()) {
            return;
        }
        com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = this.h.a();
        try {
            if (c()) {
                c(dVarA);
            }
        } catch (SpeechException e2) {
            Logger.error("TtsStreamSession", "", e2);
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, e2));
            }
        } catch (Exception e3) {
            Logger.error("TtsStreamSession", "", e3);
            Object speechException = new SpeechException(e3);
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, speechException));
            }
        }
        a(6);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        try {
            int i = message.what;
            if (i == 1) {
                g();
                return;
            }
            if (i == 2) {
                l();
                return;
            }
            if (i == 21) {
                a((SpeechException) message.obj);
                a();
                this.x = false;
                return;
            }
            switch (i) {
                case 5:
                    a(true);
                    return;
                case 6:
                    b(true);
                    return;
                case 7:
                    h();
                    return;
                case 8:
                    f();
                    return;
                case 9:
                    throw new SpeechException(20002, "network timeout");
                case 10:
                    a(message);
                    return;
                case 11:
                    i();
                    throw null;
                case 12:
                    k();
                    return;
                case 13:
                    j();
                    return;
                case 14:
                    a(false);
                    return;
                case 15:
                    b(false);
                    return;
                case 16:
                    if (!this.v.f8373n || this.f8401j) {
                        return;
                    }
                    b((SpeechException) null);
                    return;
                default:
                    return;
            }
        } catch (SpeechException e2) {
            Logger.error("TtsStreamSession", "", e2);
            Logger.error("TtsStreamSession", "occur Exception");
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, e2));
            }
        } catch (Exception e3) {
            Logger.error("TtsStreamSession", "", e3);
            Object speechException = new SpeechException(e3);
            Logger.error("TtsStreamSession", "occur Exception");
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, speechException));
            }
        }
    }

    public final void i() throws SpeechException {
        Logger.debug("TtsStreamSession", "onPlayTimeout");
        throw new SpeechException(SpeechErrorCode.SUITE_ERROR_TTS_PLAY_TIMEOUT, "com.heytap.voice.assistant.sdk.tts play timeout");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final void j() {
        char c2;
        if (c()) {
            this.f8403n.getClass();
            if (WebSocketStreamWrapper.getInstance().isConnected()) {
                c2 = 0;
            } else {
                c2 = 21006;
            }
        } else {
            c2 = 0;
        }
        if (c2 != 0) {
            Logger.error("TtsStreamSession", "cloud engine is unavailable");
            return;
        }
        if (d()) {
            com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = this.h.a();
            try {
                if (c()) {
                    f(dVarA);
                }
            } catch (SpeechException e2) {
                Logger.error("TtsStreamSession", "", e2);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, e2));
                }
            } catch (Exception e3) {
                Logger.error("TtsStreamSession", "", e3);
                Object speechException = new SpeechException(e3);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, speechException));
                }
            }
            a(4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final void k() {
        char c2;
        if (c()) {
            this.f8403n.getClass();
            if (WebSocketStreamWrapper.getInstance().isConnected()) {
                c2 = 0;
            } else {
                c2 = 21006;
            }
        } else {
            c2 = 0;
        }
        if (c2 != 0) {
            Logger.error("TtsStreamSession", "cloud engine is unavailable");
            return;
        }
        if (e()) {
            com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = this.h.a();
            try {
                if (c() && !this.f8399c.isEmpty()) {
                    a(dVarA, this.f8399c.poll());
                }
            } catch (SpeechException e2) {
                Logger.error("TtsStreamSession", "", e2);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, e2));
                }
            } catch (Exception e3) {
                Logger.error("TtsStreamSession", "", e3);
                Object speechException = new SpeechException(e3);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, speechException));
                }
            }
            this.p = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final void l() throws InterruptedException, SpeechException {
        int i;
        Logger.print("TtsStreamSession", "onStart");
        if (c()) {
            this.f8403n.getClass();
            if (WebSocketStreamWrapper.getInstance().isConnected()) {
                i = 0;
            } else {
                i = SpeechErrorCode.ERROR_CLOUD_ENGINE_NOT_CONNECTED;
            }
        } else {
            i = 0;
        }
        int iA = this.h.a(SpeechConstant.STREAM_TTS_START_RETRY_TIMES, 40);
        if (i != 0) {
            int i2 = this.b + 1;
            this.b = i2;
            if (iA < i2) {
                throw new SpeechException(i);
            }
            if (d()) {
                return;
            }
            Thread.sleep(30L);
            a(obtainMessage(2), 1, 0);
            return;
        }
        if (d()) {
            return;
        }
        a(obtainMessage(3), 1, 0);
        com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = this.h.a();
        try {
            if (c()) {
                g(dVarA);
            }
        } catch (SpeechException e2) {
            Logger.error("TtsStreamSession", "", e2);
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, e2));
            }
        } catch (Exception e3) {
            Logger.error("TtsStreamSession", "", e3);
            Object speechException = new SpeechException(e3);
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, speechException));
            }
        }
        this.p = true;
    }

    public final void m() {
        Logger.print("TtsStreamSession", "releaseSession");
        g gVar = this.u;
        if (gVar != null) {
            synchronized (gVar.a) {
                Logger.debug("StreamPcmPlayer", "stopPlayer");
                gVar.f8377j = 5;
            }
            this.u = null;
        }
        e eVar = this.v;
        if (eVar != null) {
            eVar.e();
        }
        Bundle bundle = new Bundle();
        bundle.putString(SpeechConstant.KEY_EVENT_SID, this.d);
        ((f) this.m).b(10101, 0, 0, bundle);
        if (this.p && c()) {
            j jVar = this.f8403n;
            synchronized (jVar) {
                Logger.print("TtsStreamCloudEngine", "release cloud engine");
                jVar.h = null;
                jVar.f8389e = null;
                jVar.d = false;
                jVar.b.close();
            }
        }
        a(9);
        Logger.debug("TtsStreamSession", "removeAllMessages");
        removeCallbacksAndMessages(null);
        if (this.f) {
            Logger.debug("TtsStreamSession", "user cancel");
        }
    }

    public void n() {
        g gVar;
        if (this.v == null || (gVar = this.u) == null) {
            return;
        }
        synchronized (gVar.a) {
            Logger.debug("StreamPcmPlayer", "resume mPlayState= " + com.heytap.voiceassistant.sdk.tts.closure.b.f.a(gVar.f8377j));
            if (gVar.f8377j != 4) {
                return;
            }
            e eVar = gVar.g;
            BufferParagraphInfo bufferParagraphInfo = eVar.z < eVar.x.size() ? eVar.x.get(eVar.z) : null;
            if (bufferParagraphInfo != null) {
                Logger.debug("StreamPcmPlayer", "resume, notify currentParagraph: " + bufferParagraphInfo.text);
                ((a) gVar.i).a(bufferParagraphInfo);
            }
            gVar.f8377j = 3;
            gVar.k = true;
        }
    }

    public final void a(SpeechException speechException) {
        Logger.print("TtsStreamSession", "onEnd");
        m();
        if (speechException != null) {
            ((f) this.m).b(speechException);
        } else if (this.q) {
            ((f) this.m).b((SpeechException) null);
        }
        synchronized (this.a) {
            ((f) this.m).c();
            this.m = null;
        }
    }

    public final synchronized void b(SpeechException speechException) {
        if (speechException != null) {
            removeCallbacksAndMessages(null);
        }
        b(obtainMessage(21, speechException));
    }

    public final void d(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) {
        com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = dVar.a();
        this.h = dVarA;
        if (TextUtils.isEmpty(dVarA.a.get(SpeechConstant.KEY_TTS_SESSION_ID))) {
            this.d = UUID.randomUUID().toString();
        } else {
            this.d = this.h.a.get(SpeechConstant.KEY_TTS_SESSION_ID);
        }
        if (HeytapTtsEngine.getsStreamTtsLifeCycleListener() != null) {
            StreamTtsLifeCycleListener streamTtsLifeCycleListener = HeytapTtsEngine.getsStreamTtsLifeCycleListener();
            String str = this.d;
            streamTtsLifeCycleListener.notifyTtsSid(str, str);
        }
        this.h.a(SpeechConstant.KEY_EVENT_SID, this.d, true);
        this.f8400e = this.h.a("timeout", this.f8400e);
        if (!this.h.a.containsKey("timeout")) {
            this.h.a("timeout", String.valueOf(this.f8400e), true);
        }
        this.y = this.h.a(SpeechConstant.KEY_TTS_BUFFER_TIME, this.y);
        this.i = this.h.a(SpeechConstant.KEY_IS_TTS_OUTPUT_AUDIO_DATA, false);
        if (Logger.getLogLevel() <= 3) {
            String strB = com.heytap.voiceassistant.sdk.tts.monitor.a.b(this.h.toString());
            if (com.heytap.voiceassistant.sdk.tts.monitor.a.a) {
                strB = com.heytap.voiceassistant.sdk.tts.monitor.a.a(strB);
            }
            Logger.print("TtsStreamSession", "params: " + strB);
        }
        if (c() && this.f8403n == null) {
            j jVar = new j(this.d, this.B);
            synchronized (this) {
                this.f8403n = jVar;
            }
        }
    }

    public final void e(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) throws SpeechException {
        Logger.print("TtsStreamSession", "pause");
        int i = 0;
        if (this.f) {
            Logger.print("TtsStreamSession", "pause user cancel");
        } else {
            j jVar = this.f8403n;
            jVar.getClass();
            try {
                WebSocketStreamWrapper.getInstance().send(jVar.e(dVar));
            } catch (Exception unused) {
                Logger.error("TtsStreamCloudEngine", "pause error!");
                i = SpeechErrorCode.ERROR_UNKNOWN;
            }
        }
        Logger.print("TtsStreamSession", "pause finish errorCode = " + i);
        if (i != 0) {
            throw new SpeechException(i);
        }
    }

    public static void a(c cVar, SpeechException speechException) {
        synchronized (cVar) {
            if (speechException != null) {
                cVar.removeCallbacksAndMessages(null);
            }
            cVar.b(cVar.obtainMessage(21, speechException));
        }
    }

    public boolean b() {
        StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("isHasStart");
        sbA.append(this.x);
        Logger.debug("TtsStreamSession", sbA.toString());
        return this.x;
    }

    public final boolean c() {
        if (this.o == null) {
            this.o = Boolean.valueOf("cloud".equals(this.h.a.get("engine_type")));
        }
        return this.o.booleanValue();
    }

    public final void a(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) throws SpeechException {
        int i;
        Logger.print("TtsStreamSession", "cancelSpeak");
        j jVar = this.f8403n;
        jVar.getClass();
        try {
            WebSocketStreamWrapper.getInstance().send(jVar.a(dVar));
            i = 0;
        } catch (Exception unused) {
            Logger.error("TtsStreamCloudEngine", "cancel error!");
            i = SpeechErrorCode.ERROR_UNKNOWN;
        }
        Logger.print("TtsStreamSession", "cancelSpeak  finish errorCode = " + i);
        if (i != 0) {
            throw new SpeechException(i);
        }
    }

    public final void b(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) throws SpeechException {
        Logger.print("TtsStreamSession", "continueSpeak");
        int i = 0;
        if (this.f) {
            Logger.print("TtsStreamSession", "continueSpeak user cancel");
        } else {
            j jVar = this.f8403n;
            jVar.getClass();
            try {
                WebSocketStreamWrapper.getInstance().send(jVar.c(dVar));
            } catch (Exception unused) {
                Logger.error("TtsStreamCloudEngine", "continue error!");
                i = SpeechErrorCode.ERROR_UNKNOWN;
            }
        }
        Logger.print("TtsStreamSession", "continueSpeak finish errorCode = " + i);
        if (i != 0) {
            throw new SpeechException(i);
        }
    }

    public void c(boolean z) {
        this.q = z;
        this.f = true;
        Logger.debug("TtsStreamSession", "removeAllMessages");
        SpeechException speechException = null;
        removeCallbacksAndMessages(null);
        if (z && !d()) {
            speechException = new SpeechException(SpeechErrorCode.ERROR_INTERRUPT);
        }
        b(speechException);
    }

    public class a implements g.a {
        public a() {
        }

        public void a(BufferParagraphInfo bufferParagraphInfo) {
            synchronized (c.this.a) {
                com.heytap.voiceassistant.sdk.tts.closure.c.g gVar = c.this.m;
                if (gVar != null) {
                    ((f) gVar).f8384c.onNextSliceStart(bufferParagraphInfo);
                }
            }
        }

        public void a(int i) {
            synchronized (c.this.a) {
                com.heytap.voiceassistant.sdk.tts.closure.c.g gVar = c.this.m;
                if (gVar != null) {
                    ((f) gVar).d(i);
                }
            }
        }
    }

    public final void a() {
        HandlerThread handlerThread = this.f8402l;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        removeCallbacksAndMessages(null);
        this.f8402l.quit();
        this.f8402l = null;
        synchronized (com.heytap.voiceassistant.sdk.tts.closure.c.a.f) {
            com.heytap.voiceassistant.sdk.tts.closure.c.a.g--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void b(boolean z) {
        char c2;
        Logger.debug("TtsStreamSession", "onResume");
        if (c()) {
            this.f8403n.getClass();
            if (WebSocketStreamWrapper.getInstance().isConnected()) {
                c2 = 0;
            } else {
                c2 = 21006;
            }
        } else {
            c2 = 0;
        }
        if (c2 != 0) {
            Logger.error("TtsStreamSession", "cloud engine is unavailable, only resume local player");
            n();
            return;
        }
        if (e()) {
            com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = this.h.a();
            try {
                if (c() && !this.v.f8373n && z) {
                    b(dVarA);
                }
                n();
            } catch (SpeechException e2) {
                Logger.error("TtsStreamSession", "", e2);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, e2));
                }
            } catch (Exception e3) {
                Logger.error("TtsStreamSession", "", e3);
                Object speechException = new SpeechException(e3);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, speechException));
                }
            }
            this.p = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    public final void a(Message message) {
        String string;
        String string2;
        int i;
        StringBuilder sb;
        String str;
        int i2 = message.arg1;
        boolean z = message.arg2 != 0;
        byte[] bArr = (byte[]) message.obj;
        int i3 = i2 / 2;
        if (bArr == null || bArr.length <= 0) {
            string = "";
            string2 = "";
            i = 0;
        } else {
            this.w.add(bArr);
            Bundle data = message.getData();
            if (data != null) {
                i = data.getInt(SpeechConstant.TTS_SPLIT_PARAGRAPH_SEQ);
                string2 = data.getString(SpeechConstant.TTS_SPLIT_PARAGRAPH_TEXT, "");
                string = data.getString(SpeechConstant.TTS_PLAY_MARK, "");
            } else {
                string = "";
                string2 = "";
                i = 0;
            }
            if (this.i) {
                Bundle bundle = new Bundle();
                bundle.putByteArray(SpeechConstant.KEY_EVENT_AUDIO_DATA, bArr);
                ((f) this.m).b(10102, 0, 0, bundle);
            }
        }
        if (z || i3 > 0) {
            i3 = 0;
        }
        int i4 = this.s;
        if (i4 != i3) {
            this.r = i4;
            this.s = i3;
        }
        e eVar = this.v;
        List<byte[]> list = this.w;
        int i5 = this.r;
        int i6 = this.s;
        e.a aVar = eVar.p;
        if (aVar == null || aVar.f8374c != i6) {
            eVar.p = new e.a(eVar.f8371j, eVar.f8371j, i5, i6);
            synchronized (eVar.a) {
                eVar.a.add(eVar.p);
            }
        }
        if (!eVar.x.isEmpty()) {
            if (eVar.y < eVar.x.size() && eVar.x.get(eVar.y).paraIndex < i) {
                BufferParagraphInfo bufferParagraphInfo = new BufferParagraphInfo(i, string2, 0L);
                bufferParagraphInfo.mark = string;
                eVar.x.add(bufferParagraphInfo);
                eVar.y++;
            }
        } else {
            BufferParagraphInfo bufferParagraphInfo2 = new BufferParagraphInfo(i, string2, 0L);
            bufferParagraphInfo2.mark = string;
            eVar.x.add(bufferParagraphInfo2);
            eVar.y++;
        }
        int i7 = 0;
        while (i7 < list.size()) {
            List<byte[]> list2 = list;
            byte[] bArr2 = list2.get(i7);
            synchronized (eVar) {
                if (bArr2 != null) {
                    if (bArr2.length != 0) {
                        if (eVar.g == null) {
                            StringBuilder sb2 = new StringBuilder();
                            Context context = eVar.f8369c;
                            if (context != null) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(context.getFilesDir().getAbsolutePath());
                                String str2 = File.separator;
                                sb3.append(str2);
                                sb3.append("tmp");
                                sb3.append(str2);
                                sb2.append(sb3.toString());
                                sb2.append(System.currentTimeMillis());
                                sb2.append("_");
                                String string3 = sb2.toString();
                                if (eVar.d) {
                                    sb = new StringBuilder();
                                    sb.append(string3);
                                    str = "stream.record.pcm";
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(string3);
                                    str = "com.heytap.voice.assistant.sdk.tts.stream.pcm";
                                }
                                sb.append(str);
                                eVar.h = sb.toString();
                                MemoryFile memoryFile = new MemoryFile(eVar.h, eVar.i);
                                eVar.g = memoryFile;
                                memoryFile.allowPurging(false);
                            } else {
                                throw new IllegalArgumentException("getTmpPath | context is null");
                            }
                        }
                        eVar.g.writeBytes(bArr2, 0, (int) eVar.f8371j, bArr2.length);
                        eVar.f8371j += (long) bArr2.length;
                    }
                }
            }
            if (eVar.y < eVar.x.size()) {
                BufferParagraphInfo bufferParagraphInfo3 = eVar.x.get(eVar.y);
                bufferParagraphInfo3.mark = string;
                bufferParagraphInfo3.paraLength = eVar.f8371j;
            }
            i7++;
            list = list2;
        }
        eVar.p.b = eVar.f8371j;
        eVar.f8372l = 100;
        this.w.clear();
        if (this.f8401j && !this.t && this.u != null) {
            e eVar2 = this.v;
            int i8 = this.y;
            if (eVar2.f8372l >= 100 || (i8 >= 0 ? !(eVar2.f8371j <= 0 || eVar2.f8371j / ((long) eVar2.f) < ((long) i8)) : ((long) (eVar2.f * 300)) <= eVar2.f8371j)) {
                this.t = true;
                ((f) this.m).d();
                removeMessages(11);
                Logger.print("TtsStreamSession", "begin play");
                g gVar = this.u;
                e eVar3 = this.v;
                g.a aVar2 = this.A;
                synchronized (gVar.a) {
                    Logger.debug("StreamPcmPlayer", BusinessType.PLAY);
                    if (gVar.f8377j == 5 || gVar.f8377j == 1 || gVar.f8377j == 4) {
                        gVar.g = eVar3;
                        gVar.i = aVar2;
                        gVar.start();
                    }
                }
            }
        }
        if (z) {
            removeMessages(9);
        } else {
            removeMessages(9);
            a(obtainMessage(9), 2, this.f8400e);
        }
    }

    public final void g(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) throws SpeechException {
        Logger.print("TtsStreamSession", "start");
        int i = 0;
        if (this.f) {
            Logger.print("TtsStreamSession", "start user cancel");
        } else {
            j jVar = this.f8403n;
            jVar.getClass();
            try {
                WebSocketStreamWrapper.getInstance().send(jVar.f(dVar));
                if (HeytapTtsEngine.getsStreamTtsLifeCycleListener() != null) {
                    HeytapTtsEngine.getsStreamTtsLifeCycleListener().onSendStartFrame(jVar.f8388c, System.currentTimeMillis());
                }
            } catch (Exception unused) {
                Logger.error("TtsStreamCloudEngine", "start error!");
                i = SpeechErrorCode.ERROR_UNKNOWN;
            }
        }
        Logger.print("TtsStreamSession", "start finish errorCode = " + i);
        if (i != 0) {
            throw new SpeechException(i);
        }
    }

    public final void f(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) throws SpeechException {
        Logger.print("TtsStreamSession", "restartSpeak");
        int i = 0;
        if (this.f) {
            Logger.print("TtsStreamSession", "start user cancel");
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.z.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
            j jVar = this.f8403n;
            try {
                WebSocketStreamWrapper.getInstance().send(jVar.a(dVar, jVar.g, sb.toString()));
            } catch (Exception unused) {
                Logger.error("TtsStreamCloudEngine", "restart error!");
                i = SpeechErrorCode.ERROR_UNKNOWN;
            }
        }
        Logger.print("TtsStreamSession", "restart finish errorCode = " + i);
        if (i != 0) {
            throw new SpeechException(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public final void a(boolean z) {
        char c2;
        g gVar;
        g gVar2;
        Logger.debug("TtsStreamSession", "onPause, isNeedCloudPause: " + z);
        if (c()) {
            this.f8403n.getClass();
            if (WebSocketStreamWrapper.getInstance().isConnected()) {
                c2 = 0;
            } else {
                c2 = 21006;
            }
        } else {
            c2 = 0;
        }
        if (c2 != 0) {
            Logger.error("TtsStreamSession", "cloud engine is unavailable, only pause local player");
            if (this.v == null || (gVar2 = this.u) == null) {
                return;
            }
            gVar2.a();
            return;
        }
        if ((this.k == 5) || !z) {
            com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = this.h.a();
            try {
                if (c() && !this.v.f8373n && z) {
                    e(dVarA);
                }
                if (this.v == null || (gVar = this.u) == null) {
                    return;
                }
                gVar.a();
            } catch (SpeechException e2) {
                Logger.error("TtsStreamSession", "", e2);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, e2));
                }
            } catch (Exception e3) {
                Logger.error("TtsStreamSession", "", e3);
                Object speechException = new SpeechException(e3);
                synchronized (this) {
                    removeCallbacksAndMessages(null);
                    b(obtainMessage(21, speechException));
                }
            }
        }
    }

    public final void a(Message message, int i, int i2) {
        int i3;
        int i4;
        int i5;
        synchronized (this) {
            i3 = this.k;
        }
        if (i3 != 9) {
            synchronized (this) {
                i4 = this.k;
            }
            if (i4 != 8) {
                int i6 = message.what;
                if (i6 != 21) {
                    switch (i6) {
                        case 1:
                            i5 = 2;
                            break;
                        case 2:
                            i5 = 3;
                            break;
                        case 3:
                        case 6:
                            i5 = 4;
                            break;
                        case 4:
                            i5 = 7;
                            break;
                        case 5:
                            i5 = 5;
                            break;
                    }
                    a(i5);
                } else {
                    a(8);
                }
                if (i != 1 || i2 > 0) {
                    sendMessageDelayed(message, i2);
                } else {
                    sendMessageAtFrontOfQueue(message);
                }
            }
        }
    }

    public final void a(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar, String str) throws SpeechException {
        int i = 0;
        if (this.f) {
            Logger.print("TtsStreamSession", "startCloudSpeak user cancel");
        } else {
            j jVar = this.f8403n;
            jVar.getClass();
            try {
                WebSocketStreamWrapper.getInstance().send(jVar.a(dVar, str));
            } catch (Exception unused) {
                i = SpeechErrorCode.ERROR_UNKNOWN;
            }
        }
        Logger.print("TtsStreamSession", "startCloudSpeak speak finish errorCode = " + i);
        if (i != 0) {
            throw new SpeechException(i);
        }
    }

    public synchronized void a(String str) {
        Logger.print("TtsStreamSession", "speak:" + str);
        try {
            this.z.add(str);
            this.f8399c.add(str);
            a(obtainMessage(12), 2, 0);
        } catch (Exception unused) {
            Logger.error("TtsStreamSession", "error");
        }
    }

    public synchronized void a(com.heytap.voiceassistant.sdk.tts.closure.c.g gVar) {
        Logger.print("TtsStreamSession", "start");
        this.m = gVar;
        com.heytap.voiceassistant.sdk.tts.closure.c.d dVar = this.h;
        this.z.clear();
        this.f8399c.clear();
        dVar.a("cloud_tts_method_of_read_number");
        dVar.a("role");
        dVar.a("tts_res_info");
        dVar.a(SpeechConstant.KEY_EFFECT);
        dVar.a(SpeechConstant.KEY_PITCH);
        dVar.a("ext_recorder_samplerate");
        dVar.a("stream");
        dVar.a("request_audio_focus");
        dVar.a(SpeechConstant.KEY_FOCUS_DURATION_HINT);
        dVar.a(SpeechConstant.KEY_TTS_BUFFER_TIME);
        a(obtainMessage(1), 1, 0);
        this.x = true;
    }
}
