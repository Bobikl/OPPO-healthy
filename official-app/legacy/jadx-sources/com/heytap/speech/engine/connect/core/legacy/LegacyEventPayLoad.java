package com.heytap.speech.engine.connect.core.legacy;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/LegacyEventPayLoad;", "", "()V", "payload", "Lcom/heytap/speech/engine/protocol/event/Payload;", "getPayload", "()Lcom/heytap/speech/engine/protocol/event/Payload;", "setPayload", "(Lcom/heytap/speech/engine/protocol/event/Payload;)V", "payloadName", "", "getPayloadName", "()Ljava/lang/String;", "setPayloadName", "(Ljava/lang/String;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LegacyEventPayLoad {

    @Nullable
    private Payload payload;

    @Nullable
    private String payloadName;

    @Nullable
    public final Payload getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getPayloadName() {
        return this.payloadName;
    }

    public final void setPayload(@Nullable Payload payload) {
        this.payload = payload;
    }

    public final void setPayloadName(@Nullable String str) {
        this.payloadName = str;
    }
}
