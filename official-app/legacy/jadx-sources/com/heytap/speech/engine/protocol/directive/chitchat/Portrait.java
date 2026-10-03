package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.c8l;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/Portrait;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", c8l.IMAGE_KEY, "Lcom/heytap/speech/engine/protocol/directive/chitchat/Image;", "getImage", "()Lcom/heytap/speech/engine/protocol/directive/chitchat/Image;", "setImage", "(Lcom/heytap/speech/engine/protocol/directive/chitchat/Image;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Portrait extends DirectivePayload {

    @JsonProperty(c8l.IMAGE_KEY)
    @Nullable
    private Image image;

    @Nullable
    public final Image getImage() {
        return this.image;
    }

    public final void setImage(@Nullable Image image) {
        this.image = image;
    }
}
