package com.heytap.speech.engine.protocol.directive.tone;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tone/SpeedAdjust;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "speedValue", "Ljava/lang/String;", "getSpeedValue", "()Ljava/lang/String;", "setSpeedValue", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SpeedAdjust extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String content;

    @Nullable
    private String speedValue;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getSpeedValue() {
        return this.speedValue;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setSpeedValue(@Nullable String str) {
        this.speedValue = str;
    }
}
