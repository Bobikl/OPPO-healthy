package com.heytap.health.voiceassistant;

import androidx.annotation.Keep;
import com.heytap.health.voiceassistant.VoiceAssistantConnectManager;
import com.heytap.health.voiceassistant.car.CarLinkManager;
import com.heytap.health.voiceassistant.ovs.OvsManager;
import com.heytap.health.voiceassistant.speech.SpeechModule;
import com.heytap.health.voiceassistant.tts.TTSModule;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.iie;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.y80;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.wearable.linkservice.sdk.Node;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/voiceassistant/VoiceAssistantConnectManager;", "Lcom/oplus/aiunit/vision/ul4$a;", "", "init", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "onPeerConnected", "onPeerDisconnected", "", "tag", "Ljava/lang/String;", "<init>", "()V", "Companion", "a", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VoiceAssistantConnectManager implements ul4.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final VoiceAssistantConnectManager VA_INSTANCE = new VoiceAssistantConnectManager();

    @NotNull
    private final String tag = "VAM_Initializer";

    /* JADX INFO: renamed from: com.heytap.health.voiceassistant.VoiceAssistantConnectManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/voiceassistant/VoiceAssistantConnectManager$a;", "", "Lcom/heytap/health/voiceassistant/VoiceAssistantConnectManager;", "VA_INSTANCE", "Lcom/heytap/health/voiceassistant/VoiceAssistantConnectManager;", "a", "()Lcom/heytap/health/voiceassistant/VoiceAssistantConnectManager;", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VoiceAssistantConnectManager a() {
            return VoiceAssistantConnectManager.VA_INSTANCE;
        }
    }

    private VoiceAssistantConnectManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPeerDisconnected$lambda$0() {
        SpeechModule.INSTANCE.k0(DeviceInfoCompat.DeviceState.DISCONNECTED);
        TTSModule.INSTANCE.h(DeviceInfoCompat.DeviceState.DISCONNECTED);
    }

    public final void init() {
        a7b.f(this.tag, "[init] --> add connect listener");
        iie.INSTANCE.i(y80.VERSION_NAME_SHORT);
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.nodeApi.d(this);
        bm5Var.nodeApi.g(this);
        a7b.f(this.tag, "[init] --> add message listener");
        bm5Var.messageApi.c(270, VAM.ROUTER_PATH);
        OvsManager.INSTANCE.e();
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        a7b.f(this.tag, "onPeerConnected");
        CarLinkManager.INSTANCE.h();
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        a7b.f(this.tag, "onPeerDisconnected");
        VAM.INSTANCE.p(true, new Runnable() { // from class: com.oplus.aiunit.vision.r3l
            @Override // java.lang.Runnable
            public final void run() {
                VoiceAssistantConnectManager.onPeerDisconnected$lambda$0();
            }
        });
    }
}
