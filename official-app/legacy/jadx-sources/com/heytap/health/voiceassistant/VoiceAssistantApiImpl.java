package com.heytap.health.voiceassistant;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.health.voiceassistant.VoiceAssistantApiImpl;
import com.heytap.health.voiceassistant.car.CarLinkManager;
import com.heytap.health.voiceassistant.speech.SpeechModule;
import com.heytap.health.voiceassistant.tts.TTSModule;
import com.oplus.aiunit.vision.AsrRecognizeOptions;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.i3l;
import com.oplus.aiunit.vision.oh0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/device_interconnect/voiceassistant/api_privider")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016¨\u0006%"}, d2 = {"Lcom/heytap/health/voiceassistant/VoiceAssistantApiImpl;", "Lcom/heytap/health/voiceassistant/VoiceAssistantApi;", "Landroid/content/Context;", "context", "", "init", "g4", "F3", "", "type", "", "text", "Lcom/heytap/health/voiceassistant/VoiceAssistantApi$a;", "resultListener", "h9", "Lcom/oplus/aiunit/vision/ph0;", "options", "Lcom/oplus/aiunit/vision/oh0;", "listener", "x2", "", "chunk", "H3", "R6", "", "playAudioOnPhone", "ttsToWatch", SecureGcmConstants.MESSAGE_KEY, "n6", "u4", "T1", "y", "sendCarBindInfo", "<init>", "()V", "Companion", "a", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VoiceAssistantApiImpl implements VoiceAssistantApi {

    @NotNull
    public static final String TAG = "VAM_VAMApiImpl";

    public static final void fb() {
        SpeechModule.INSTANCE.W();
    }

    public static final void gb(boolean z, boolean z2) {
        TTSModule.INSTANCE.g(z, z2);
    }

    public static final void hb() {
        SpeechModule.INSTANCE.k0("finish activity");
    }

    public static final void ib() {
        TTSModule.INSTANCE.h("finish activity");
    }

    public static final void jb(String text, int i, VoiceAssistantApi.a aVar) {
        Intrinsics.checkNotNullParameter(text, "$text");
        a7b.f(TAG, "sendSpeechText: " + text.length());
        SpeechModule speechModule = SpeechModule.INSTANCE;
        speechModule.W();
        speechModule.s0(i, text, aVar);
    }

    public static final void kb(String text) {
        Intrinsics.checkNotNullParameter(text, "$text");
        a7b.f(TAG, "speakTtsText: " + text.length());
        TTSModule tTSModule = TTSModule.INSTANCE;
        if (tTSModule.g(true, false)) {
            tTSModule.j(text);
        }
    }

    public static final void lb(AsrRecognizeOptions asrRecognizeOptions, oh0 listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        SpeechModule.INSTANCE.w0(asrRecognizeOptions, listener);
    }

    public static final void mb() {
        a7b.f(TAG, "stopSpeakTtsText");
        TTSModule.INSTANCE.n();
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void F3() {
        VAM.INSTANCE.p(true, new Runnable() { // from class: com.oplus.aiunit.vision.n3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.hb();
            }
        });
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void H3(@NotNull byte[] chunk) {
        Intrinsics.checkNotNullParameter(chunk, "chunk");
        SpeechModule.INSTANCE.i0(chunk);
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void P(final boolean playAudioOnPhone, final boolean ttsToWatch) {
        VAM.q(VAM.INSTANCE, false, new Runnable() { // from class: com.oplus.aiunit.vision.j3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.gb(playAudioOnPhone, ttsToWatch);
            }
        }, 1, null);
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void R6() {
        SpeechModule.INSTANCE.F();
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void T1() {
        VAM.q(VAM.INSTANCE, false, new Runnable() { // from class: com.oplus.aiunit.vision.o3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.mb();
            }
        }, 1, null);
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void g4() {
        VAM.q(VAM.INSTANCE, false, new Runnable() { // from class: com.oplus.aiunit.vision.l3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.fb();
            }
        }, 1, null);
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void h9(final int type, @NotNull final String text, @Nullable final VoiceAssistantApi.a resultListener) {
        Intrinsics.checkNotNullParameter(text, "text");
        VAM.q(VAM.INSTANCE, false, new Runnable() { // from class: com.oplus.aiunit.vision.q3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.jb(text, type, resultListener);
            }
        }, 1, null);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void n6() {
        VAM.INSTANCE.p(true, new Runnable() { // from class: com.oplus.aiunit.vision.k3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.ib();
            }
        });
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void sendCarBindInfo() {
        CarLinkManager.INSTANCE.h();
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void u4(@NotNull final String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        VAM.q(VAM.INSTANCE, false, new Runnable() { // from class: com.oplus.aiunit.vision.m3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.kb(text);
            }
        }, 1, null);
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public void x2(@Nullable final AsrRecognizeOptions options, @NotNull final oh0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        VAM.INSTANCE.p(true, new Runnable() { // from class: com.oplus.aiunit.vision.p3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantApiImpl.lb(options, listener);
            }
        });
    }

    @Override // com.heytap.health.voiceassistant.VoiceAssistantApi
    public int y() {
        if (!i3l.a(gl4.managerApi.getCurrActiveMac()).y()) {
            a7b.f(TAG, "supportCarLink deviceSupport = false");
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iIntValue = ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new VoiceAssistantApiImpl$supportCarLink$result$1(null), 1, null)).intValue();
        a7b.f(TAG, "supportCarLink=" + iIntValue + ", cost=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return iIntValue;
    }
}
