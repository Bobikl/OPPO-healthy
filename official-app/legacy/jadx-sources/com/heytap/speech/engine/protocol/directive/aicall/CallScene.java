package com.heytap.speech.engine.protocol.directive.aicall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aicall/CallScene;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "scene", "Ljava/lang/String;", "getScene", "()Ljava/lang/String;", "setScene", "(Ljava/lang/String;)V", "callId", "getCallId", "setCallId", "type", "getType", "setType", "", "timestamp", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallScene extends DirectivePayload {

    @NotNull
    public static final String TYPE_DISPLAY = "display";

    @NotNull
    public static final String TYPE_STORE = "store";

    @Nullable
    private String callId;

    @Nullable
    private String scene;

    @Nullable
    private Long timestamp;

    @Nullable
    private String type;

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setCallId(@Nullable String str) {
        this.callId = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setTimestamp(@Nullable Long l2) {
        this.timestamp = l2;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
