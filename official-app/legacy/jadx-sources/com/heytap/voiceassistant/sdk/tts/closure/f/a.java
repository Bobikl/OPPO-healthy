package com.heytap.voiceassistant.sdk.tts.closure.f;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.MemoryFile;
import android.os.Message;
import android.text.TextUtils;
import com.heytap.log.consts.BusinessType;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.voiceassistant.sdk.tts.Config;
import com.heytap.voiceassistant.sdk.tts.HeytapTtsEngine;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener;
import com.heytap.voiceassistant.sdk.tts.closure.c.h;
import com.heytap.voiceassistant.sdk.tts.closure.c.i;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import com.heytap.voiceassistant.sdk.tts.net.WebSocketWrapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class a extends Handler {
    public final i.b A;
    public final Object a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8394c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8395e;
    public volatile boolean f;
    public Context g;
    public com.heytap.voiceassistant.sdk.tts.closure.c.d h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8396j;
    public volatile int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HandlerThread f8397l;
    public com.heytap.voiceassistant.sdk.tts.closure.c.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f8398n;
    public Boolean o;
    public boolean p;
    public boolean q;
    public volatile int r;
    public int s;
    public int t;
    public boolean u;
    public com.heytap.voiceassistant.sdk.tts.closure.b.d v;
    public com.heytap.voiceassistant.sdk.tts.closure.b.b w;
    public List<byte[]> x;
    public int y;
    public com.heytap.voiceassistant.sdk.tts.closure.b.d.a z;

    public class b implements i.b {
        public b() {
        }

        public void a(int i, String str) {
            a.a(a.this, new SpeechException(i, str));
        }

        public void a(byte[] bArr, int i, boolean z) {
            a aVar = a.this;
            if (aVar.c()) {
                return;
            }
            aVar.b(z ? aVar.obtainMessage(10, aVar.r * 2, 1, null) : aVar.obtainMessage(10, i, 0, bArr));
        }

        public void a(byte[] bArr, int i, boolean z, String str) {
            Message messageObtainMessage;
            Bundle bundle;
            a aVar = a.this;
            if (aVar.c()) {
                return;
            }
            if (z) {
                messageObtainMessage = aVar.obtainMessage(10, aVar.r * 2, 1, null);
                bundle = new Bundle();
            } else {
                messageObtainMessage = aVar.obtainMessage(10, i, 0, bArr);
                bundle = new Bundle();
            }
            bundle.putString(SpeechConstant.KEY_TTS_TIMESTAMP, str);
            messageObtainMessage.setData(bundle);
            aVar.a(messageObtainMessage, 2, 0);
        }
    }

    public class c implements Runnable {
        public com.heytap.voiceassistant.sdk.tts.closure.c.d a;

        public c() {
            this.a = a.a(a.this).a();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.b()) {
                    a.a(a.this, this.a);
                } else {
                    a.this.getClass();
                }
            } catch (SpeechException e2) {
                Logger.error("TtsSession", "", e2);
                a.a(a.this, e2);
            } catch (Exception e3) {
                Logger.error("TtsSession", "", e3);
                a.a(a.this, new SpeechException(e3));
            }
        }
    }

    public a(Context context, com.heytap.voiceassistant.sdk.tts.closure.c.d dVar, HandlerThread handlerThread) {
        super(handlerThread.getLooper());
        this.a = new Object();
        this.b = 0;
        this.f8395e = 8000;
        this.f = false;
        this.h = new com.heytap.voiceassistant.sdk.tts.closure.c.d();
        this.f8396j = true;
        this.k = 1;
        this.m = null;
        this.f8398n = null;
        this.o = null;
        this.p = false;
        this.q = true;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = -1;
        this.z = new C0812a();
        this.A = new b();
        this.g = context;
        this.f8397l = handlerThread;
        a(dVar);
    }

    public final synchronized void a(int i) {
        if (this.k != 7 && (this.k != 6 || i == 7)) {
            StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("setStatus | ok, curStatus: ");
            sbA.append(com.heytap.voiceassistant.sdk.tts.closure.f.b.a(this.k));
            sbA.append(", inStatus: ");
            sbA.append(com.heytap.voiceassistant.sdk.tts.closure.f.b.a(i));
            Logger.debug("TtsSession", sbA.toString());
            this.k = i;
        } else {
            StringBuilder sbA2 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("setStatus | fail, curStatus: ");
            sbA2.append(com.heytap.voiceassistant.sdk.tts.closure.f.b.a(this.k));
            sbA2.append(", inStatus: ");
            sbA2.append(com.heytap.voiceassistant.sdk.tts.closure.f.b.a(i));
            Logger.warn("TtsSession", sbA2.toString());
        }
    }

    public final void b(Message message) {
        a(message, 2, 0);
    }

    public boolean c() {
        return this.k == 1 || this.k == 6 || this.k == 7;
    }

    public final void d() throws SpeechException {
        Logger.print("TtsSession", "onInit");
        if (c()) {
            Logger.debug("TtsSession", "isAvailable: true");
            return;
        }
        if (Logger.getLogLevel() <= 1) {
            StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("mText = ");
            sbA.append(this.f8394c);
            Logger.print("TtsSession", sbA.toString());
        }
        if (TextUtils.isEmpty(this.f8394c)) {
            throw new SpeechException(SpeechErrorCode.ERROR_EMPTY_UTTERANCE, "mText: empty");
        }
        int length = this.f8394c.length();
        if (4095 < length) {
            throw new SpeechException(20012, "textSize: " + length + ", too long.");
        }
        this.r = length;
        Logger.debug("TtsSession", "textSize: " + length);
        if (!b()) {
            throw new SpeechException(SpeechErrorCode.ERROR_ENGINE_NOT_SUPPORTED, "local engine is not supported currently");
        }
        if (!com.heytap.voiceassistant.sdk.tts.closure.g.b.a(this.g)) {
            throw new SpeechException(20001);
        }
        if (!WebSocketWrapper.getInstance().isConnected()) {
            WebSocketWrapper.getInstance().connect();
        } else if (this.f8398n == null) {
            throw new SpeechException(SpeechErrorCode.ERROR_ENGINE_INIT_FAIL);
        }
        this.x = new ArrayList();
        this.w = new com.heytap.voiceassistant.sdk.tts.closure.b.b(this.g, this.d, this.h.a(SpeechConstant.KEY_SAMPLE_RATE, 16000), false);
        boolean zA = this.h.a(SpeechConstant.KEY_IS_LOG_AUDIO, false);
        this.h.a(SpeechConstant.KEY_IS_LOG_AUDIO);
        String str = this.h.a.get(SpeechConstant.KEY_AUDIO_LOG_PATH);
        this.h.a(SpeechConstant.KEY_AUDIO_LOG_PATH);
        int iA = this.h.a(SpeechConstant.KEY_AUDIO_LOG_MAX_COUNT, 10);
        this.h.a(SpeechConstant.KEY_AUDIO_LOG_MAX_COUNT);
        com.heytap.voiceassistant.sdk.tts.closure.b.b bVar = this.w;
        bVar.t = zA;
        bVar.u = str;
        bVar.v = iA;
        com.heytap.voiceassistant.sdk.tts.closure.b.b bVar2 = this.w;
        String str2 = this.f8394c;
        bVar2.getClass();
        if (!TextUtils.isEmpty(str2)) {
            int length2 = (str2.length() / 5) * 4 * bVar2.f * 1024;
            bVar2.i = length2;
            bVar2.i = Math.max(length2, 23040000);
            StringBuilder sbA2 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("mMaxFileSize: ");
            sbA2.append(bVar2.i);
            Logger.debug("PcmBuffer", sbA2.toString());
        }
        boolean zA2 = this.h.a(SpeechConstant.KEY_IS_PLAY_SOUND, true);
        this.f8396j = zA2;
        if (zA2) {
            this.v = new com.heytap.voiceassistant.sdk.tts.closure.b.d(this.g, this.h.a(SpeechConstant.KEY_STREAM_TYPE, 3), this.h.a(SpeechConstant.KEY_IS_REQUEST_AUDIO_FOCUS, true), this.h.a(SpeechConstant.KEY_FOCUS_DURATION_HINT, 2), this.h.a(SpeechConstant.KEY_IS_AUDIO_FOCUS_LOSS_STOP, true), this.h.a(SpeechConstant.KEY_STOP_WHEN_REQUEST_FOCUS_FAILED, false));
        } else {
            Logger.debug("TtsSession", "not play sound");
        }
        a(obtainMessage(2), 1, 0);
    }

    public final void e() throws SpeechException {
        Logger.debug("TtsSession", "onPlayTimeout");
        throw new SpeechException(SpeechErrorCode.SUITE_ERROR_TTS_PLAY_TIMEOUT, "com.heytap.voice.assistant.sdk.tts play timeout");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public final void f() throws InterruptedException, SpeechException {
        int i;
        Logger.print("TtsSession", "onStart");
        int iA = this.h.a(SpeechConstant.TTS_START_RETRY_TIMES, 40);
        if (b()) {
            this.f8398n.getClass();
            if (WebSocketWrapper.getInstance().isConnected()) {
                i = 0;
            } else {
                i = SpeechErrorCode.ERROR_CLOUD_ENGINE_NOT_CONNECTED;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            int i2 = this.b + 1;
            this.b = i2;
            if (iA < i2) {
                throw new SpeechException(i);
            }
            if (c()) {
                return;
            }
            Thread.sleep(15L);
            a(obtainMessage(2), 1, 0);
            return;
        }
        if (c()) {
            return;
        }
        a(obtainMessage(3), 1, 0);
        ((ThreadPoolExecutor) com.heytap.voiceassistant.sdk.tts.closure.g.c.a).execute(new c());
        this.p = true;
        removeMessages(9);
        a(obtainMessage(9), 2, this.f8395e);
        int iA2 = this.h.a(SpeechConstant.KEY_TTS_PLAY_TIMEOUT, 60000);
        this.h.a(SpeechConstant.KEY_TTS_PLAY_TIMEOUT);
        if (this.f8396j) {
            a(obtainMessage(11), 2, iA2);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        try {
            int i = message.what;
            if (i == 1) {
                d();
                return;
            }
            if (i == 2) {
                f();
                return;
            }
            if (i == 21) {
                a((SpeechException) message.obj);
                a();
                return;
            }
            switch (i) {
                case 9:
                    throw new SpeechException(20002, "network timeout");
                case 10:
                    a(message);
                    return;
                case 11:
                    e();
                    throw null;
                default:
                    return;
            }
        } catch (SpeechException e2) {
            Logger.error("TtsSession", "", e2);
            Logger.error("TtsSession", "occur Exception");
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, e2));
            }
        } catch (Exception e3) {
            Logger.error("TtsSession", "", e3);
            Object speechException = new SpeechException(e3);
            Logger.error("TtsSession", "occur Exception");
            synchronized (this) {
                removeCallbacksAndMessages(null);
                b(obtainMessage(21, speechException));
            }
        }
    }

    public static void a(a aVar, SpeechException speechException) {
        synchronized (aVar) {
            if (speechException != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            aVar.b(aVar.obtainMessage(21, speechException));
        }
    }

    public final synchronized void b(SpeechException speechException) {
        if (speechException != null) {
            removeCallbacksAndMessages(null);
        }
        b(obtainMessage(21, speechException));
    }

    public static com.heytap.voiceassistant.sdk.tts.closure.c.d a(a aVar) {
        return aVar.h;
    }

    public final boolean b() {
        if (this.o == null) {
            this.o = Boolean.valueOf("cloud".equals(this.h.a.get("engine_type")));
        }
        return this.o.booleanValue();
    }

    /* JADX INFO: renamed from: com.heytap.voiceassistant.sdk.tts.closure.f.a$a, reason: collision with other inner class name */
    public class C0812a implements com.heytap.voiceassistant.sdk.tts.closure.b.d.a {
        public C0812a() {
        }

        public void a() {
            synchronized (a.this.a) {
                com.heytap.voiceassistant.sdk.tts.closure.c.c cVar = a.this.m;
                if (cVar != null) {
                    ((h) cVar).g();
                }
            }
        }

        public void b() {
            synchronized (a.this.a) {
                com.heytap.voiceassistant.sdk.tts.closure.c.c cVar = a.this.m;
                if (cVar != null) {
                    ((h) cVar).h();
                }
            }
        }

        public void a(int i, int i2, int i3) {
            Logger.debug("TtsSession", "onSpeakProgress percent = " + i + ", beginPos = " + i2 + ", endPos = " + i3);
            synchronized (a.this.a) {
                com.heytap.voiceassistant.sdk.tts.closure.c.c cVar = a.this.m;
                if (cVar != null) {
                    ((h) cVar).b(i, i2, i3);
                }
            }
        }
    }

    public static int a(a aVar, com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) throws SpeechException {
        String str;
        int i;
        aVar.getClass();
        Logger.print("TtsSession", "startCloudSpeak");
        if (aVar.f) {
            Logger.print("TtsSession", "startCloudSpeak user cancel");
            str = "TtsSession";
            i = 0;
        } else {
            dVar.a(SpeechConstant.KEY_TTS_PROVIDER, 1);
            i iVar = aVar.f8398n;
            String str2 = aVar.f8394c;
            iVar.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                str = "TtsSession";
                try {
                    String str3 = "";
                    JSONObject jSONObjectPut = jSONObject.put("imei", Config.getSdkParams().a.get("imei") == null ? "" : Config.getSdkParams().a.get("imei")).put("duid", Config.getSdkParams().a.get("duid") == null ? "" : Config.getSdkParams().a.get("duid"));
                    String str4 = dVar.a.get(SpeechConstant.KEY_RECORD_ID);
                    if (str4 == null) {
                        str4 = "";
                    }
                    JSONObject jSONObjectPut2 = jSONObjectPut.put(SpeechConstant.KEY_RECORD_ID, str4).put("source", dVar.a.get(SpeechConstant.KEY_BIZ_SOURCE)).put(SpeechConstant.KEY_START_SOURCE, SpeechConstant.BREENO_NEW_MODE);
                    String str5 = dVar.a.get(SpeechConstant.KEY_ORIGINAL_RECORD_ID);
                    if (str5 == null) {
                        str5 = "";
                    }
                    JSONObject jSONObjectPut3 = jSONObjectPut2.put(SpeechConstant.KEY_ORIGINAL_RECORD_ID, str5);
                    String str6 = dVar.a.get(SpeechConstant.KEY_TTS_TYPE);
                    if (str6 == null) {
                        str6 = "";
                    }
                    JSONObject jSONObjectPut4 = jSONObjectPut3.put(SpeechConstant.KEY_TTS_TYPE, str6).put("text", str2);
                    String str7 = "opus";
                    String str8 = dVar.a.get(SpeechConstant.TTS_AUDIO_FORMAT);
                    if (str8 != null) {
                        str7 = str8;
                    }
                    JSONObject jSONObjectPut5 = jSONObjectPut4.put("audioFormat", str7);
                    String str9 = SpeechConstant.DEFAULT_TIMBRE;
                    String str10 = dVar.a.get(SpeechConstant.KEY_ROLE_NAME);
                    if (str10 != null) {
                        str9 = str10;
                    }
                    JSONObject jSONObjectPut6 = jSONObjectPut5.put(EngineConstant.TTS_TIMBRE, str9);
                    String str11 = SpeechConstant.DEFAULT_SAMPLE_RATE;
                    String str12 = dVar.a.get(SpeechConstant.KEY_SAMPLE_RATE);
                    if (str12 != null) {
                        str11 = str12;
                    }
                    JSONObject jSONObjectPut7 = jSONObjectPut6.put(SpeechConstant.KEY_SAMPLE_RATE_TO_REMOTE, str11).put(SpeechConstant.KEY_APP_VERSION, Config.getSdkParams().a.get(SpeechConstant.CALLER_VER_CODE));
                    String str13 = dVar.a.get("channelId");
                    if (str13 == null) {
                        str13 = "";
                    }
                    JSONObject jSONObjectPut8 = jSONObjectPut7.put("channelId", str13);
                    String str14 = dVar.a.get(SpeechConstant.KEY_CONTEXT_ID);
                    if (str14 == null) {
                        str14 = "";
                    }
                    JSONObject jSONObjectPut9 = jSONObjectPut8.put(SpeechConstant.KEY_CONTEXT_ID, str14);
                    String str15 = dVar.a.get("sessionId");
                    if (str15 == null) {
                        str15 = "";
                    }
                    JSONObject jSONObjectPut10 = jSONObjectPut9.put("sessionId", str15).put(SpeechConstant.KEY_TTS_SESSION_ID, dVar.a.get(SpeechConstant.KEY_EVENT_SID));
                    String str16 = dVar.a.get("ttsLanguage");
                    if (str16 == null) {
                        str16 = "";
                    }
                    JSONObject jSONObjectPut11 = jSONObjectPut10.put("ttsLanguage", str16);
                    String str17 = dVar.a.get(SpeechConstant.KEY_USER_TOKEN);
                    if (str17 == null) {
                        str17 = "";
                    }
                    JSONObject jSONObjectPut12 = jSONObjectPut11.put(SpeechConstant.KEY_USER_TOKEN, str17);
                    String str18 = dVar.a.get(SpeechConstant.KEY_ACCOUNT_DEVICE_ID);
                    if (str18 == null) {
                        str18 = "";
                    }
                    jSONObjectPut12.put(SpeechConstant.KEY_ACCOUNT_DEVICE_ID, str18);
                    if (!TextUtils.isEmpty(dVar.a.get("emotion"))) {
                        jSONObject.put("emotion", dVar.a.get("emotion"));
                    }
                    if (!TextUtils.isEmpty(dVar.a.get("language"))) {
                        jSONObject.put("language", dVar.a.get("language"));
                    }
                    if (!TextUtils.isEmpty(dVar.a.get("speed"))) {
                        jSONObject.put("speed", dVar.a.get("speed"));
                    }
                    if (!TextUtils.isEmpty(dVar.a.get(SpeechConstant.KEY_VOLUME))) {
                        jSONObject.put(SpeechConstant.KEY_VOLUME, dVar.a.get(SpeechConstant.KEY_VOLUME));
                    }
                    String str19 = dVar.a.get(SpeechConstant.KEY_TTS_REQUEST_HEADER);
                    String str20 = dVar.a.get(SpeechConstant.KEY_TTS_REQUEST_CLIENT_CONTEXT);
                    if (!TextUtils.isEmpty(str19)) {
                        jSONObject.put(SpeechConstant.KEY_TTS_REQUEST_HEADER, new JSONObject(str19));
                    }
                    if (!TextUtils.isEmpty(str20)) {
                        jSONObject.put(SpeechConstant.KEY_TTS_REQUEST_CLIENT_CONTEXT, new JSONObject(str20));
                    }
                    String string = jSONObject.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append(string.trim().substring(0, string.length() - 1));
                    Object[] objArr = new Object[2];
                    objArr[0] = EngineConstant.TTS_TYPE_SSML;
                    String str21 = dVar.a.get(SpeechConstant.KEY_SSML_TEXT);
                    if (str21 != null) {
                        str3 = str21;
                    }
                    objArr[1] = str3;
                    sb.append(String.format(",\"%s\":\"%s\"}", objArr));
                    String str22 = String.format("{\"%s\":\"%s\",\"%s\":%s}", "bizType", "TEXT", "data", sb.toString());
                    if (3 >= Logger.getLogLevel()) {
                        Logger.print("TtsCloudEngine", "send tts request:" + str22);
                    }
                    WebSocketWrapper.getInstance().send(str22);
                    if (HeytapTtsEngine.getTtsLifeCycleListener() != null) {
                        HeytapTtsEngine.getTtsLifeCycleListener().onSendTtsText(iVar.f8386c, System.currentTimeMillis());
                    }
                    i = 0;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    i = SpeechErrorCode.ERROR_UNKNOWN;
                }
            } catch (Exception e3) {
                e = e3;
                str = "TtsSession";
            }
        }
        Logger.print(str, "startCloudSpeak speak finish errorCode = " + i);
        if (i == 0) {
            return i;
        }
        throw new SpeechException(i);
    }

    public final void a() {
        HandlerThread handlerThread = this.f8397l;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        removeCallbacksAndMessages(null);
        this.f8397l.quit();
        this.f8397l = null;
        synchronized (com.heytap.voiceassistant.sdk.tts.closure.c.b.f) {
            com.heytap.voiceassistant.sdk.tts.closure.c.b.g--;
        }
    }

    public final void a(com.heytap.voiceassistant.sdk.tts.closure.c.d dVar) {
        com.heytap.voiceassistant.sdk.tts.closure.c.d dVarA = dVar.a();
        this.h = dVarA;
        if (TextUtils.isEmpty(dVarA.a.get(SpeechConstant.KEY_TTS_SESSION_ID))) {
            this.d = UUID.randomUUID().toString();
        } else {
            this.d = this.h.a.get(SpeechConstant.KEY_TTS_SESSION_ID);
        }
        if (HeytapTtsEngine.getTtsLifeCycleListener() != null) {
            TtsLifeCycleListener ttsLifeCycleListener = HeytapTtsEngine.getTtsLifeCycleListener();
            String str = this.d;
            ttsLifeCycleListener.notifyTtsSid(str, str);
        }
        this.h.a(SpeechConstant.KEY_EVENT_SID, this.d, true);
        this.f8395e = this.h.a("timeout", this.f8395e);
        if (!this.h.a.containsKey("timeout")) {
            com.heytap.voiceassistant.sdk.tts.closure.c.d dVar2 = this.h;
            StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("");
            sbA.append(this.f8395e);
            dVar2.a("timeout", sbA.toString(), true);
        }
        this.y = this.h.a(SpeechConstant.KEY_TTS_BUFFER_TIME, this.y);
        this.i = this.h.a(SpeechConstant.KEY_IS_TTS_OUTPUT_AUDIO_DATA, false);
        if (Logger.getLogLevel() <= 3) {
            String strB = com.heytap.voiceassistant.sdk.tts.monitor.a.b(this.h.toString());
            if (com.heytap.voiceassistant.sdk.tts.monitor.a.a) {
                strB = com.heytap.voiceassistant.sdk.tts.monitor.a.a(strB);
            }
            Logger.print("TtsSession", "params: " + strB);
        }
        if (b() && this.f8398n == null) {
            i iVar = new i(this.d, this.A);
            synchronized (this) {
                this.f8398n = iVar;
            }
        }
    }

    public final void a(Message message) {
        int iMin;
        StringBuilder sb;
        String str;
        int i = message.arg1;
        boolean z = false;
        boolean z2 = message.arg2 != 0;
        byte[] bArr = (byte[]) message.obj;
        int i2 = i / 2;
        if (bArr != null && bArr.length > 0) {
            this.x.add(bArr);
            if (this.i) {
                Bundle bundle = new Bundle();
                bundle.putByteArray(SpeechConstant.KEY_EVENT_AUDIO_DATA, bArr);
                Bundle data = message.getData();
                if (data != null) {
                    bundle.putAll(data);
                }
                ((h) this.m).f8385c.onEvent(10102, 0, 0, bundle);
            }
        }
        if (z2) {
            i2 = this.r;
            iMin = 100;
        } else {
            if (this.r < i2) {
                i2 = this.r;
            }
            iMin = Math.min(99, (i2 * 100) / this.r);
        }
        if (z2) {
            ((h) this.m).b(100, this.s, this.t, null);
        } else {
            int i3 = this.t;
            if (i3 != i2) {
                if (i3 != 0) {
                    ((h) this.m).b(Math.min(99, (i3 * 100) / this.r), this.s, this.t, null);
                }
                this.s = this.t;
                this.t = i2;
            }
        }
        com.heytap.voiceassistant.sdk.tts.closure.b.b bVar = this.w;
        List<byte[]> list = this.x;
        int i4 = this.s;
        int i5 = this.t;
        com.heytap.voiceassistant.sdk.tts.closure.b.b.a aVar = bVar.o;
        if (aVar == null || aVar.d != i5) {
            bVar.o = new com.heytap.voiceassistant.sdk.tts.closure.b.b.a(bVar.f8361j, bVar.f8361j, i4, i5);
            synchronized (bVar.a) {
                bVar.a.add(bVar.o);
            }
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            byte[] bArr2 = list.get(i6);
            synchronized (bVar) {
                if (bArr2 != null) {
                    if (bArr2.length != 0) {
                        if (bVar.g == null) {
                            StringBuilder sb2 = new StringBuilder();
                            Context context = bVar.f8359c;
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
                                String string = sb2.toString();
                                if (bVar.d) {
                                    sb = new StringBuilder();
                                    sb.append(string);
                                    str = "record.pcm";
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(string);
                                    str = "com.heytap.voice.assistant.sdk.tts.pcm";
                                }
                                sb.append(str);
                                bVar.h = sb.toString();
                                MemoryFile memoryFile = new MemoryFile(bVar.h, bVar.i);
                                bVar.g = memoryFile;
                                memoryFile.allowPurging(false);
                            } else {
                                throw new IllegalArgumentException("getTmpPath | context is null");
                            }
                        }
                        bVar.g.writeBytes(bArr2, 0, (int) bVar.f8361j, bArr2.length);
                        bVar.f8361j += (long) bArr2.length;
                    }
                }
            }
        }
        bVar.o.b = bVar.f8361j;
        bVar.f8362l = iMin;
        this.x.clear();
        if (z2) {
            this.w.e();
        }
        if (this.f8396j && !this.u && this.v != null) {
            com.heytap.voiceassistant.sdk.tts.closure.b.b bVar2 = this.w;
            int i7 = this.y;
            if (bVar2.f8362l >= 100 || (i7 >= 0 ? !(bVar2.f8361j <= 0 || bVar2.f8361j / ((long) bVar2.f) < i7) : bVar2.f * 1000 <= bVar2.f8361j)) {
                z = true;
            }
            if (z) {
                this.u = true;
                ((h) this.m).f();
                removeMessages(11);
                Logger.print("TtsSession", "begin play");
                com.heytap.voiceassistant.sdk.tts.closure.b.d dVar = this.v;
                com.heytap.voiceassistant.sdk.tts.closure.b.b bVar3 = this.w;
                com.heytap.voiceassistant.sdk.tts.closure.b.d.a aVar2 = this.z;
                synchronized (dVar.a) {
                    Logger.debug("PcmPlayer", BusinessType.PLAY);
                    if (dVar.f8368l == 5 || dVar.f8368l == 1 || dVar.f8368l == 4) {
                        dVar.h = bVar3;
                        dVar.k = aVar2;
                        dVar.start();
                    }
                }
            }
        }
        if (z2) {
            removeMessages(9);
        } else {
            removeMessages(9);
            a(obtainMessage(9), 2, this.f8395e);
        }
        if (!z2 || this.f8396j) {
            return;
        }
        b((SpeechException) null);
    }

    public final void a(SpeechException speechException) {
        Logger.print("TtsSession", "onEnd");
        com.heytap.voiceassistant.sdk.tts.closure.b.d dVar = this.v;
        if (dVar != null) {
            synchronized (dVar.a) {
                Logger.debug("PcmPlayer", "stopPlayer");
                dVar.f8368l = 5;
            }
            this.v = null;
        }
        com.heytap.voiceassistant.sdk.tts.closure.b.b bVar = this.w;
        if (bVar != null) {
            bVar.e();
        }
        Bundle bundle = new Bundle();
        bundle.putString(SpeechConstant.KEY_EVENT_SID, this.d);
        ((h) this.m).f8385c.onEvent(10101, 0, 0, bundle);
        if (this.p && b()) {
            i iVar = this.f8398n;
            synchronized (iVar) {
                Logger.print("TtsCloudEngine", "release cloud engine");
                iVar.g = null;
                iVar.f8387e = null;
                iVar.d = false;
                iVar.b.close();
            }
        }
        a(7);
        Logger.debug("TtsSession", "removeAllMessages");
        removeCallbacksAndMessages(null);
        if (this.f) {
            Logger.debug("TtsSession", "user cancel");
        }
        if (speechException != null) {
            ((h) this.m).b(speechException);
        } else if (this.q) {
            ((h) this.m).b((SpeechException) null);
        }
        synchronized (this.a) {
            ((h) this.m).e();
            this.m = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002a A[PHI: r1
  0x002a: PHI (r1v2 int) = (r1v1 int), (r1v3 int), (r1v4 int) binds: [B:13:0x0013, B:15:0x0016, B:19:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(Message message, int i, int i2) {
        int i3;
        int i4;
        synchronized (this) {
            i3 = this.k;
        }
        if (i3 != 7) {
            synchronized (this) {
                i4 = this.k;
            }
            int i5 = 6;
            if (i4 != 6) {
                int i6 = message.what;
                if (i6 != 21) {
                    i5 = 2;
                    if (i6 == 1) {
                        a(i5);
                    } else if (i6 != 2) {
                        i5 = 4;
                        if (i6 == 3) {
                            a(i5);
                        } else if (i6 == 4) {
                            a(5);
                        }
                    } else {
                        a(3);
                    }
                } else {
                    a(i5);
                }
                if (i != 1 || i2 > 0) {
                    sendMessageDelayed(message, i2);
                } else {
                    sendMessageAtFrontOfQueue(message);
                }
            }
        }
    }

    public synchronized void a(String str, com.heytap.voiceassistant.sdk.tts.closure.c.c cVar) {
        Logger.print("TtsSession", "startSpeaking");
        this.m = cVar;
        this.f8394c = str;
        com.heytap.voiceassistant.sdk.tts.closure.c.d dVar = this.h;
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
    }

    public void a(boolean z) {
        this.q = z;
        this.f = true;
        Logger.debug("TtsSession", "removeAllMessages");
        SpeechException speechException = null;
        removeCallbacksAndMessages(null);
        if (z && !c()) {
            speechException = new SpeechException(SpeechErrorCode.ERROR_INTERRUPT);
        }
        b(speechException);
    }
}
