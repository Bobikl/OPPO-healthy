package com.oplus.aiunit.vision;

import com.heytap.health.voiceassistant.VoiceAssistantApi;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/fn3;", "", "", "text", "", "c", "d", "a", "b", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class fn3 {

    @NotNull
    public static final fn3 INSTANCE = new fn3();

    public final void a() {
        VoiceAssistantApi voiceAssistantApi = (VoiceAssistantApi) x0.d().b("/device_interconnect/voiceassistant/api_privider").navigation();
        if (voiceAssistantApi != null) {
            voiceAssistantApi.P(true, false);
        }
    }

    public final void b() {
        VoiceAssistantApi voiceAssistantApi = (VoiceAssistantApi) x0.d().b("/device_interconnect/voiceassistant/api_privider").navigation();
        if (voiceAssistantApi != null) {
            voiceAssistantApi.n6();
        }
    }

    public final void c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        VoiceAssistantApi voiceAssistantApi = (VoiceAssistantApi) x0.d().b("/device_interconnect/voiceassistant/api_privider").navigation();
        if (voiceAssistantApi != null) {
            voiceAssistantApi.u4(text);
        }
    }

    public final void d() {
        VoiceAssistantApi voiceAssistantApi = (VoiceAssistantApi) x0.d().b("/device_interconnect/voiceassistant/api_privider").navigation();
        if (voiceAssistantApi != null) {
            voiceAssistantApi.T1();
        }
    }
}
