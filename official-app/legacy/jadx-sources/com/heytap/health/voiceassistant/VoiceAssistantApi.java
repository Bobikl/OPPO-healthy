package com.heytap.health.voiceassistant;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.oplus.aiunit.vision.AsrRecognizeOptions;
import com.oplus.aiunit.vision.oh0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\bf\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J$\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001c\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH&J\b\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0002H&J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&J\b\u0010\u001d\u001a\u00020\u0002H&¨\u0006!"}, d2 = {"Lcom/heytap/health/voiceassistant/VoiceAssistantApi;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "g4", "F3", "", "type", "", "text", "Lcom/heytap/health/voiceassistant/VoiceAssistantApi$a;", "resultListener", "h9", "", "playAudioOnPhone", "ttsToWatch", SecureGcmConstants.MESSAGE_KEY, "n6", "u4", "T1", "y", "sendCarBindInfo", "Lcom/oplus/aiunit/vision/ph0;", "options", "Lcom/oplus/aiunit/vision/oh0;", "listener", "x2", "", "chunk", "H3", "R6", "Companion", "a", "b", "voiceassistant_release"}, k = 1, mv = {1, 8, 0})
public interface VoiceAssistantApi extends IProvider {

    @NotNull
    public static final String CAR_LINK_MAIN_ACTIVITY = "/device_interconnect/voiceassistant/MMStepSyncSetActivity";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int ERR_BUSY = 1;
    public static final int ERR_ENGINE_INIT = 2;
    public static final int ERR_INVALID_AUDIO = 4;
    public static final int ERR_TIMEOUT = 3;

    @NotNull
    public static final String VOICE_ASSISTANT_API = "/device_interconnect/voiceassistant/api_privider";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/voiceassistant/VoiceAssistantApi$a;", "", "", "nlpResult", "", "a", "voiceassistant_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@Nullable String nlpResult);
    }

    /* JADX INFO: renamed from: com.heytap.health.voiceassistant.VoiceAssistantApi$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/voiceassistant/VoiceAssistantApi$b;", "", "", "VOICE_ASSISTANT_API", "Ljava/lang/String;", "CAR_LINK_MAIN_ACTIVITY", "", "ERR_BUSY", "I", "ERR_ENGINE_INIT", "ERR_TIMEOUT", "ERR_INVALID_AUDIO", "<init>", "()V", "voiceassistant_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String CAR_LINK_MAIN_ACTIVITY = "/device_interconnect/voiceassistant/MMStepSyncSetActivity";
        public static final int ERR_BUSY = 1;
        public static final int ERR_ENGINE_INIT = 2;
        public static final int ERR_INVALID_AUDIO = 4;
        public static final int ERR_TIMEOUT = 3;

        @NotNull
        public static final String VOICE_ASSISTANT_API = "/device_interconnect/voiceassistant/api_privider";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void F3();

    void H3(@NotNull byte[] chunk);

    void P(boolean playAudioOnPhone, boolean ttsToWatch);

    void R6();

    void T1();

    void g4();

    void h9(int type, @NotNull String text, @Nullable a resultListener);

    void n6();

    void sendCarBindInfo();

    void u4(@NotNull String text);

    void x2(@Nullable AsrRecognizeOptions options, @NotNull oh0 listener);

    int y();
}
