package com.heytap.speech.engine.protocol.event;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/Event;", SecureGcmConstants.MESSAGE_KEY, "Lcom/heytap/speech/engine/protocol/event/Payload;", "Ljava/io/Serializable;", "()V", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/event/EventHeader;", "getHeader", "()Lcom/heytap/speech/engine/protocol/event/EventHeader;", "setHeader", "(Lcom/heytap/speech/engine/protocol/event/EventHeader;)V", "payload", "getPayload", "()Lcom/heytap/speech/engine/protocol/event/Payload;", "setPayload", "(Lcom/heytap/speech/engine/protocol/event/Payload;)V", "Lcom/heytap/speech/engine/protocol/event/Payload;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Event<P extends Payload> implements Serializable {

    @JsonProperty(SpeechConstant.KEY_TTS_REQUEST_HEADER)
    @Nullable
    private EventHeader header;

    @JsonProperty("payload")
    @Nullable
    private P payload;

    @Nullable
    public final EventHeader getHeader() {
        return this.header;
    }

    @Nullable
    public final P getPayload() {
        return this.payload;
    }

    public final void setHeader(@Nullable EventHeader eventHeader) {
        this.header = eventHeader;
    }

    public final void setPayload(@Nullable P p) {
        this.payload = p;
    }
}
