package com.heytap.speech.engine.protocol.directive.systempower;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/systempower/ShutDown;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "confirmation", "Ljava/lang/Boolean;", "getConfirmation", "()Ljava/lang/Boolean;", "setConfirmation", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ShutDown extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("confirmation")
    @Nullable
    private Boolean confirmation;

    @Nullable
    public final Boolean getConfirmation() {
        return this.confirmation;
    }

    public final void setConfirmation(@Nullable Boolean bool) {
        this.confirmation = bool;
    }
}
