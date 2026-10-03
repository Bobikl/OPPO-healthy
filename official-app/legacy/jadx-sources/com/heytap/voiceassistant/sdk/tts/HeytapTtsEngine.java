package com.heytap.voiceassistant.sdk.tts;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.voiceassistant.sdk.tts.HeytapTtsEngine;
import com.heytap.voiceassistant.sdk.tts.callback.IInitListener;
import com.heytap.voiceassistant.sdk.tts.callback.ITtsListener;
import com.heytap.voiceassistant.sdk.tts.callback.ITtsStreamListener;
import com.heytap.voiceassistant.sdk.tts.callback.StreamTtsLifeCycleListener;
import com.heytap.voiceassistant.sdk.tts.callback.TtsLifeCycleListener;
import com.heytap.voiceassistant.sdk.tts.closure.c.a;
import com.heytap.voiceassistant.sdk.tts.closure.c.b;
import com.heytap.voiceassistant.sdk.tts.closure.c.d;
import com.heytap.voiceassistant.sdk.tts.closure.c.e;
import com.heytap.voiceassistant.sdk.tts.closure.c.f;
import com.heytap.voiceassistant.sdk.tts.closure.c.h;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import com.heytap.voiceassistant.sdk.tts.net.WebSocketStreamWrapper;
import com.heytap.voiceassistant.sdk.tts.net.WebSocketWrapper;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class HeytapTtsEngine {
    private static final String PARAMS = "params";
    private static final String TAG = "HeytapTtsEngine";
    private static volatile Context sContext = null;
    private static volatile boolean sHasInit = false;
    private static volatile HeytapTtsEngine sInstance;
    private static volatile StreamTtsLifeCycleListener sStreamTtsLifeCycleListener;
    private static volatile TtsLifeCycleListener sTtsLifeCycleListener;
    private static volatile String sTtsSessionId;
    private a mSpeechStreamSynthesizer;
    private b mSpeechSynthesizer;
    private final String[][] KEY_MAP = {new String[]{SpeechConstant.KEY_FOCUS_DURATION_HINT, SpeechConstant.KEY_FOCUS_DURATION_HINT}, new String[]{SpeechConstant.KEY_SESSION_TIMEOUT, "timeout"}, new String[]{SpeechConstant.KEY_IS_LOG_AUDIO, SpeechConstant.KEY_IS_LOG_AUDIO}, new String[]{SpeechConstant.KEY_AUDIO_LOG_PATH, SpeechConstant.KEY_AUDIO_LOG_PATH}, new String[]{SpeechConstant.KEY_AUDIO_LOG_MAX_COUNT, SpeechConstant.KEY_AUDIO_LOG_MAX_COUNT}, new String[]{SpeechConstant.KEY_TTS_LOCAL_LANGUAGE, SpeechConstant.KEY_TTS_LOCAL_LANGUAGE}, new String[]{SpeechConstant.KEY_EFFECT, SpeechConstant.KEY_EFFECT}, new String[]{"speed", "speed"}, new String[]{SpeechConstant.KEY_PITCH, SpeechConstant.KEY_PITCH}, new String[]{SpeechConstant.KEY_VOLUME, SpeechConstant.KEY_VOLUME}, new String[]{SpeechConstant.KEY_IS_PLAY_SOUND, SpeechConstant.KEY_IS_PLAY_SOUND}, new String[]{SpeechConstant.KEY_TTS_PLAY_TIMEOUT, SpeechConstant.KEY_TTS_PLAY_TIMEOUT}, new String[]{SpeechConstant.KEY_IS_TTS_OUTPUT_AUDIO_DATA, SpeechConstant.KEY_IS_TTS_OUTPUT_AUDIO_DATA}};
    private final Object mSpeakingMutex = new Object();
    private Handler mUiHandler = new Handler(Looper.getMainLooper());
    private d mSdkParams = new d();

    private HeytapTtsEngine() {
    }

    private void clearDynamicParams() {
        d dVar = this.mSdkParams;
        if (dVar != null) {
            dVar.a(SpeechConstant.KEY_SSML_TEXT);
            this.mSdkParams.a("emotion");
            this.mSdkParams.a("language");
            this.mSdkParams.a("ttsLanguage");
            this.mSdkParams.a(SpeechConstant.KEY_SAMPLE_RATE);
            this.mSdkParams.a(SpeechConstant.KEY_VOLUME);
            this.mSdkParams.a("speed");
            this.mSdkParams.a(SpeechConstant.TTS_AUDIO_FORMAT);
        }
    }

    public static Context getContext() {
        return sContext;
    }

    public static HeytapTtsEngine getInstance() {
        if (sInstance == null) {
            synchronized (HeytapTtsEngine.class) {
                if (sInstance == null) {
                    sInstance = new HeytapTtsEngine();
                }
            }
        }
        return sInstance;
    }

    public static TtsLifeCycleListener getTtsLifeCycleListener() {
        return sTtsLifeCycleListener;
    }

    public static String getTtsSessionId() {
        return sTtsSessionId;
    }

    public static StreamTtsLifeCycleListener getsStreamTtsLifeCycleListener() {
        return sStreamTtsLifeCycleListener;
    }

    private void initCallback(final IInitListener iInitListener, final SpeechException speechException) {
        if (iInitListener != null) {
            this.mUiHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.j99
                @Override // java.lang.Runnable
                public final void run() {
                    HeytapTtsEngine.lambda$initCallback$0(iInitListener, speechException);
                }
            });
        }
    }

    public static boolean isHasInit() {
        return sHasInit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initCallback$0(IInitListener iInitListener, SpeechException speechException) {
        iInitListener.onInitFinish(speechException);
        Logger.debug(TAG, "after callback onInitFinish");
    }

    public static void setStreamTtsLifeCycleListener(StreamTtsLifeCycleListener streamTtsLifeCycleListener) {
        sStreamTtsLifeCycleListener = streamTtsLifeCycleListener;
    }

    public static void setTtsLifeCycleListener(TtsLifeCycleListener ttsLifeCycleListener) {
        sTtsLifeCycleListener = ttsLifeCycleListener;
    }

    public d getSdkParams() {
        return this.mSdkParams;
    }

    public void initEngine(Context context, Bundle bundle, IInitListener iInitListener) {
        Logger.print(TAG, "initEngine | bundleParams = " + bundle + ", listener = " + iInitListener);
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "initEngine | already destroyed");
            } else {
                try {
                    Logger.print(TAG, "initEngine, hasInit = " + sHasInit);
                    if (sHasInit) {
                        initCallback(iInitListener, null);
                        return;
                    }
                    if (sContext == null) {
                        Logger.info(TAG, "constructor | begin");
                        Context applicationContext = context.getApplicationContext();
                        sContext = applicationContext;
                        Config.init(sContext);
                        this.mSpeechSynthesizer = e.b(applicationContext);
                        this.mSpeechStreamSynthesizer = e.a(applicationContext);
                        this.mSdkParams.a("engine_type", "cloud", true);
                        this.mSdkParams.a(SpeechConstant.KEY_WORK_DIR_PATH, Config.getSdkParams().a.get(SpeechConstant.KEY_WORK_DIR_PATH), true);
                        Logger.info(TAG, "constructor | end");
                        sHasInit = true;
                    }
                    initCallback(iInitListener, null);
                } catch (SpeechException e2) {
                    Logger.info(TAG, "constructor exception code:" + e2.getErrorCode() + ",message=" + e2.getMessage());
                    initCallback(iInitListener, e2);
                } catch (Exception e3) {
                    initCallback(iInitListener, new SpeechException(e3));
                }
            }
        }
    }

    public boolean isSpeaking() {
        Logger.print(TAG, "isSpeaking");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "isSpeaking | already destroyed");
                return false;
            }
            return this.mSpeechSynthesizer.c();
        }
    }

    public boolean isStreamSessionStarted() {
        boolean zB;
        Logger.print(TAG, "isStreamStarted");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "isStreamStarted | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    synchronized (aVar.a) {
                        zB = aVar.f8379c != null ? aVar.f8379c.b() : false;
                    }
                    return zB;
                }
            }
            return false;
        }
    }

    public boolean isStreamSpeaking() {
        Logger.print(TAG, "isStreamSpeaking");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "isSpeaking | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    return aVar.e();
                }
            }
            return false;
        }
    }

    public void pauseSpeaking() {
        com.heytap.voiceassistant.sdk.tts.closure.b.d dVar;
        Logger.print(TAG, "pauseSpeaking");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "pauseSpeaking | already destroyed");
            } else {
                b bVar = this.mSpeechSynthesizer;
                synchronized (bVar.a) {
                    if (bVar.f8381c != null) {
                        com.heytap.voiceassistant.sdk.tts.closure.f.a aVar = bVar.f8381c;
                        if (aVar.w != null && (dVar = aVar.v) != null) {
                            dVar.a();
                        }
                    }
                }
            }
        }
    }

    public void release() {
        Logger.print(TAG, "destroy | begin");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "destroy | already destroyed");
                return;
            }
            this.mUiHandler.removeCallbacksAndMessages(null);
            this.mSdkParams.a.clear();
            b bVar = this.mSpeechSynthesizer;
            if (bVar != null) {
                bVar.a();
            }
            a aVar = this.mSpeechStreamSynthesizer;
            if (aVar != null) {
                aVar.b();
            }
            WebSocketWrapper.getInstance().release();
            WebSocketStreamWrapper.getInstance().release();
            sContext = null;
            sTtsLifeCycleListener = null;
            sInstance = null;
            sHasInit = false;
            Logger.print(TAG, "destroy | end");
        }
    }

    public void resumeSpeaking() {
        com.heytap.voiceassistant.sdk.tts.closure.b.d dVar;
        Logger.print(TAG, "resumeSpeaking");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "resumeSpeaking | already destroyed");
            } else {
                b bVar = this.mSpeechSynthesizer;
                synchronized (bVar.a) {
                    if (bVar.f8381c != null) {
                        com.heytap.voiceassistant.sdk.tts.closure.f.a aVar = bVar.f8381c;
                        if (aVar.w != null && (dVar = aVar.v) != null) {
                            dVar.d();
                        }
                    }
                }
            }
        }
    }

    public HeytapTtsEngine setParameter(String str, String str2) {
        Logger.debug(TAG, "setParameter | key = " + str + ", value = " + str2);
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "setParameter | already destroyed");
                throw new SpeechException(SpeechErrorCode.ERROR_LOCAL_NO_INIT, "engine has not been initialized");
            }
            if (TextUtils.isEmpty(str)) {
                Logger.error(TAG, "setParameter | key is empty");
                throw new SpeechException(20012, "setParameter | key is empty");
            }
            if (!"params".equals(str)) {
                if (TextUtils.isEmpty(str2)) {
                    this.mSdkParams.a.remove(str);
                    return this;
                }
                this.mSdkParams.a(str, str2, true);
                return this;
            }
            if (TextUtils.isEmpty(str2)) {
                this.mSdkParams.a.clear();
            } else {
                d dVar = this.mSdkParams;
                dVar.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    for (String str3 : str2.split(",")) {
                        int iIndexOf = str3.indexOf(HttpUtils.EQUAL_SIGN);
                        if (iIndexOf > 0 && iIndexOf < str3.length()) {
                            dVar.a.put(str3.substring(0, iIndexOf), str3.substring(iIndexOf + 1));
                        }
                    }
                }
            }
            return this;
        }
    }

    public void startSpeaking(String str, ITtsListener iTtsListener) {
        Logger.print(TAG, "startSpeaking | listener = " + iTtsListener + ", SDK VERSION_CODE: 1112");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "startSpeaking | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null && aVar.e()) {
                    Logger.error(TAG, "stream speaking! interrupt stream speaking");
                    a aVar2 = this.mSpeechStreamSynthesizer;
                    synchronized (aVar2.a) {
                        if (aVar2.f8379c != null) {
                            aVar2.f8379c.c(true);
                        }
                    }
                }
                if (Logger.getLogLevel() <= 3) {
                    Logger.print(TAG, "params: " + this.mSdkParams.toString());
                }
                String string = this.mSdkParams.a.get(SpeechConstant.KEY_TTS_SESSION_ID);
                if (TextUtils.isEmpty(string)) {
                    string = UUID.randomUUID().toString();
                }
                sTtsSessionId = string;
                d dVarA = this.mSdkParams.a();
                clearDynamicParams();
                dVarA.a(this.KEY_MAP);
                Config.dumpToSdkParams(dVarA);
                b bVar = this.mSpeechSynthesizer;
                if (bVar != null) {
                    bVar.b = dVarA;
                    this.mSpeechSynthesizer.a(str, new h(sTtsSessionId, iTtsListener));
                }
                if (sTtsLifeCycleListener != null) {
                    sTtsLifeCycleListener.notifyTtsProvider(sTtsSessionId, "2");
                }
            }
        }
    }

    public void stopSpeaking() {
        Logger.print(TAG, "stopSpeaking");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "stopSpeaking | already destroyed");
            } else {
                b bVar = this.mSpeechSynthesizer;
                synchronized (bVar.a) {
                    if (bVar.f8381c != null) {
                        bVar.f8381c.a(false);
                    }
                }
            }
        }
    }

    public void streamCancelSpeak() {
        Logger.print(TAG, "streamCancelSpeak | , SDK VERSION_CODE: 1112");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "streamCancelSpeak | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public void streamEnd() {
        Logger.print(TAG, "streamEnd | , SDK VERSION_CODE: 1112");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "streamEnd | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    aVar.c();
                }
            }
        }
    }

    public void streamPauseSpeak() {
        streamPauseSpeak(true);
    }

    public void streamResumeSpeak() {
        streamResumeSpeak(true);
    }

    public void streamSpeak(String str) {
        Logger.print(TAG, "streamSpeak | , SDK VERSION_CODE: 1112");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "streamSpeak | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    synchronized (aVar.a) {
                        if (aVar.f8379c != null && aVar.f8379c.b()) {
                            aVar.f8379c.a(str);
                        }
                    }
                }
            }
        }
    }

    public void streamStart(ITtsStreamListener iTtsStreamListener) {
        Logger.print(TAG, "streamStart | listener = " + iTtsStreamListener + ", SDK VERSION_CODE: 1112");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "streamStart | already destroyed");
            } else {
                b bVar = this.mSpeechSynthesizer;
                if (bVar != null && bVar.c()) {
                    Logger.error(TAG, "speaking! interrupt speaking");
                    b bVar2 = this.mSpeechSynthesizer;
                    synchronized (bVar2.a) {
                        if (bVar2.f8381c != null) {
                            bVar2.f8381c.a(false);
                        }
                    }
                }
                if (Logger.getLogLevel() <= 3) {
                    Logger.print(TAG, "params: " + this.mSdkParams.toString());
                }
                String string = this.mSdkParams.a.get(SpeechConstant.KEY_TTS_SESSION_ID);
                if (TextUtils.isEmpty(string)) {
                    string = UUID.randomUUID().toString();
                }
                sTtsSessionId = string;
                d dVarA = this.mSdkParams.a();
                clearDynamicParams();
                dVarA.a(this.KEY_MAP);
                Config.dumpToSdkParams(dVarA);
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    aVar.b = dVarA;
                    this.mSpeechStreamSynthesizer.a(new f(sTtsSessionId, iTtsStreamListener));
                }
                if (sStreamTtsLifeCycleListener != null) {
                    sStreamTtsLifeCycleListener.notifyTtsProvider(sTtsSessionId, "2");
                }
            }
        }
    }

    public void streamPauseSpeak(boolean z) {
        Logger.print(TAG, "streamPauseSpeak | , SDK VERSION_CODE: 1112is need cloud pause: " + z);
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "streamPauseSpeak | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    aVar.a(z);
                }
            }
        }
    }

    public void streamResumeSpeak(boolean z) {
        Logger.print(TAG, "streamResumeSpeak | , SDK VERSION_CODE: 1112");
        synchronized (this.mSpeakingMutex) {
            if (this != sInstance) {
                Logger.error(TAG, "streamResumeSpeak | already destroyed");
            } else {
                a aVar = this.mSpeechStreamSynthesizer;
                if (aVar != null) {
                    aVar.b(z);
                }
            }
        }
    }
}
