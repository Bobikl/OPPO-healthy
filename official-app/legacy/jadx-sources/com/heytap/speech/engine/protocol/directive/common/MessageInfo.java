package com.heytap.speech.engine.protocol.directive.common;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.usm;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/MessageInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", usm.f17592j, "getNamespace", "setNamespace", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MessageInfo extends DirectivePayload {

    @JsonProperty("name")
    @Nullable
    private String name;

    @JsonProperty(usm.f17592j)
    @Nullable
    private String namespace;

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNamespace() {
        return this.namespace;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNamespace(@Nullable String str) {
        this.namespace = str;
    }
}
