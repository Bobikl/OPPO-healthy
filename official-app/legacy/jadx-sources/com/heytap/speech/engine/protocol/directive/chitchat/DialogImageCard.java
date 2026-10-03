package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.c8l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/DialogImageCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/chitchat/Image;", c8l.IMAGE_KEY, "Lcom/heytap/speech/engine/protocol/directive/chitchat/Image;", "getImage", "()Lcom/heytap/speech/engine/protocol/directive/chitchat/Image;", "setImage", "(Lcom/heytap/speech/engine/protocol/directive/chitchat/Image;)V", "Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;", "emotion", "Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;", "getEmotion", "()Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;", "setEmotion", "(Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DialogImageCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("emotion")
    @Nullable
    private Emotion emotion;

    @JsonProperty(c8l.IMAGE_KEY)
    @Nullable
    private Image image;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Emotion getEmotion() {
        return this.emotion;
    }

    @Nullable
    public final Image getImage() {
        return this.image;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setEmotion(@Nullable Emotion emotion) {
        this.emotion = emotion;
    }

    public final void setImage(@Nullable Image image) {
        this.image = image;
    }
}
