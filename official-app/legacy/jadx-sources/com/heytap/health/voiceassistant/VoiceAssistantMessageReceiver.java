package com.heytap.health.voiceassistant;

import android.content.Context;
import androidx.annotation.Keep;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.interconnection.InterMainApi;
import com.heytap.health.voiceassistant.VoiceAssistantMessageReceiver;
import com.heytap.health.voiceassistant.ovs.OvsManager;
import com.heytap.health.voiceassistant.proto.VAProto;
import com.heytap.health.voiceassistant.speech.SpeechModule;
import com.heytap.health.voiceassistant.tts.TTSModule;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.i3l;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = VAM.ROUTER_PATH)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/voiceassistant/VoiceAssistantMessageReceiver;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "()V", "lastId", "", "tag", "", "onCreate", "", "context", "Landroid/content/Context;", "onMessageReceived", "nodeId", "messageEvent", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VoiceAssistantMessageReceiver extends DMIMessageHandler {

    @NotNull
    private final String tag = "VAM_MSG_Handler";
    private int lastId = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMessageReceived$lambda$1(int i, String nodeId, VoiceAssistantMessageReceiver this$0, MessageEvent messageEvent) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(nodeId, "$nodeId");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(messageEvent, "$messageEvent");
        if (i != 0 && i != 1 && i != 4 && i != 6) {
            if (i == 7) {
                TTSModule tTSModule = TTSModule.INSTANCE;
                if (tTSModule.f().get()) {
                    a7b.m(this$0.tag, "onMessageReceived: in tts steam");
                    return;
                } else {
                    if (tTSModule.g(false, true)) {
                        String text = VAProto.DeviceTTS.parseFrom(messageEvent.getData()).getText();
                        Intrinsics.checkNotNullExpressionValue(text, "text");
                        tTSModule.j(text);
                        return;
                    }
                    return;
                }
            }
            if (i == 10) {
                VAProto.AppList apps = VAProto.AppList.parseFrom(messageEvent.getData());
                SpeechModule speechModule = SpeechModule.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(apps, "apps");
                speechModule.t0(apps);
                return;
            }
            if (i != 11) {
                a7b.m(this$0.tag, "[onMessageReceived] --> commandId=" + i + " not matched any condition");
                return;
            }
        }
        SpeechModule speechModule2 = SpeechModule.INSTANCE;
        speechModule2.u0(nodeId);
        int iW = speechModule2.W();
        a7b.f(this$0.tag, "[onMessageReceived] --> initSpeechEngine result=" + iW);
        if (iW == 0) {
            speechModule2.G(messageEvent);
        } else {
            gl4.devicePrimary.messageApi.b(new MessageEvent(270, 4, VAProto.VmResults.newBuilder().setResultCode(iW).build().toByteArray()));
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(@NotNull final String nodeId, @NotNull final MessageEvent messageEvent) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        final int commandId = messageEvent.getCommandId();
        if (commandId != this.lastId) {
            String str = this.tag;
            int serviceId = messageEvent.getServiceId();
            int commandId2 = messageEvent.getCommandId();
            byte[] data = messageEvent.getData();
            a7b.f(str, "onMessageReceived:  " + serviceId + ":" + commandId2 + ", dataSize=" + (data != null ? data.length : 0));
            this.lastId = commandId;
        }
        if (!i3l.a(nodeId).r5()) {
            a7b.b(this.tag, "[onMessageReceived] --> mow, not support device");
            return;
        }
        if (commandId == 5) {
            SpeechModule.INSTANCE.H();
            return;
        }
        if (commandId != 12) {
            if (commandId == 21) {
                OvsManager.INSTANCE.f(messageEvent);
                return;
            } else {
                VAM.q(VAM.INSTANCE, false, new Runnable() { // from class: com.oplus.aiunit.vision.s3l
                    @Override // java.lang.Runnable
                    public final void run() throws InvalidProtocolBufferException {
                        VoiceAssistantMessageReceiver.onMessageReceived$lambda$1(commandId, nodeId, this, messageEvent);
                    }
                }, 1, null);
                return;
            }
        }
        VAProto.BreenoCarBind2 from = VAProto.BreenoCarBind2.parseFrom(messageEvent.getData());
        if (from != null) {
            InterMainApi.Companion companion = InterMainApi.INSTANCE;
            String pagePath = from.getPagePath();
            Intrinsics.checkNotNullExpressionValue(pagePath, "it.pagePath");
            companion.a(pagePath);
        }
    }
}
